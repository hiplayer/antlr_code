parser grammar DmlSQL2Parser;

options {
  language = Java;
  tokenVocab=DmlSQL2Lexer;
  backtrack=true;
  memoize = true ;
}
@header{
	
}
@members{
	public InsertInfo sqlinsertinfo=null;
	private boolean inFrom=true;
}

any_char:
    ANY_CHARS+
    ;
sql_script : 
    (sql_stmt)? ( SEMICOLON (sql_stmt)? )*
;
sql_single_stmt : 
    (sql_stmt)? (SEMICOLON)?
;
sql_stmt : 
      sql_data_stmt 
;
sql_data_stmt : 
      select_stmt 
    | insert_stmt 
    | update_stmt 
    | delete_stmt 
;
select_stmt : 
    query_exp 
      ( into_clause (order_by_clause)? (updatability_clause)?
      | order_by_clause (into_clause)? (updatability_clause)?
      | updatability_clause (into_clause)?
      |
      )
;
into_clause : 
    INTO target_spec (COMMA target_spec)* 
;
order_by_clause : 
    (ORDER BY )? sort_spec_list 
;
sort_spec_list : 
    sort_spec (COMMA sort_spec)* 
;
sort_spec : 
    sort_key (collate_clause)? (ordering_spec)? 
;
sort_key : 
      column_ref 
    | UNSIGNED_INTEGER 
;
ordering_spec : 
      ASC 
    | DESC 
;
updatability_clause : 
    FOR ( READ ONLY | UPDATE (OF column_name_list)? ) 
;
insert_stmt : 
    INSERT INTO{inFrom=false;sqlinsertinfo=new InsertInfo();}
     table_name {sqlinsertinfo.setInsertTableName($table_name.text);}insert_columns_and_source 
;
insert_columns_and_source : 
      (LEFT_PAREN column_name_list RIGHT_PAREN)=> (LEFT_PAREN column_name_list RIGHT_PAREN)? query_exp 
    
    | query_exp 
    | DEFAULT VALUES 
;
update_stmt : 
      UPDATE
        ( table_name SET set_clause_list ( WHERE (search_condition|CURRENT OF dyn_cursor_name) )?   
        | SET set_clause_list WHERE CURRENT OF cursor_name
        )
;
set_clause_list : 
    set_clause (COMMA set_clause)* 
;
set_clause : 
    column_name EQUALS_OP update_source 
;
update_source : 
      value_exp 
    | NULL 
    | DEFAULT  
;
delete_stmt : 
      DELETE
        ( FROM table_name ( WHERE (search_condition|CURRENT OF dyn_cursor_name) )? 
        | WHERE CURRENT OF cursor_name
        )
;
id :
    (INTRODUCER char_set_name)? 
    ( REGULAR_ID
    | DELIMITED_ID 
    | {true}? non_reserved_word 
    ) 
;
char_set_name: id (PERIOD id (PERIOD id)?)?
;
schema_name :
    id (PERIOD id)?
;
qualified_name : 
    id (options{greedy=true;}:PERIOD id (options{greedy=true;}:PERIOD id)?)? 
;
select_list : 
      ASTERISK
    | select_sublist (COMMA select_sublist)*
;
select_sublist : 
      (table_name PERIOD ASTERISK)=> table_name PERIOD ASTERISK
    | derived_column{if(inFrom==false){sqlinsertinfo.addSecondElem($select_sublist.text);}}
;
derived_column : 
    value_exp ((AS)? column_name)?
;
value_exp_primary : 
       (user_difine_function)=>user_difine_function/*new*/  
    |(scalar_subquery)=> scalar_subquery
    | {input.LA(1) == INTRODUCER}? ((column_ref)=>column_ref | unsigned_value_spec)
    | {input.LA(1) != INTRODUCER}? column_ref 
    | set_fct_spec
    | case_exp 
    | cast_spec 

    | unsigned_value_spec
    /*new*/
    |  LEFT_PAREN value_exp RIGHT_PAREN 
;

user_difine_function:
	id LEFT_PAREN ((value_exp (COMMA value_exp)*) |order_by_clause)? RIGHT_PAREN (OVER LEFT_PAREN PARTITION BY grouping_column_ref_list order_by_clause RIGHT_PAREN)?
;
set_fct_spec : 
        COUNT LEFT_PAREN ( ASTERISK | (set_quantifier)? value_exp ) RIGHT_PAREN 
    | ( AVG
      | MAX 
      | MIN 
      | SUM ) LEFT_PAREN (set_quantifier)? value_exp RIGHT_PAREN  
;
set_quantifier : 
      DISTINCT 
    | ALL 
;
case_exp : 
      case_abbreviation 
    | case_spec 
;
case_abbreviation : 
      NULLIF LEFT_PAREN value_exp COMMA value_exp RIGHT_PAREN 
    | COALESCE LEFT_PAREN value_exp (COMMA value_exp)* RIGHT_PAREN 
;

case_spec : 
      simple_case 
    | searched_case 
;
simple_case : 
    CASE value_exp (simple_when_clause)+ (else_clause)? END 
;
simple_when_clause : 
    WHEN value_exp THEN result 
;
else_clause : 
    ELSE result 
;
result : 
      value_exp  
    | NULL 
;

searched_case : 
    CASE (searched_when_clause)+ (else_clause)? END 
;
searched_when_clause : 
    WHEN search_condition THEN result 
;
search_condition : 
    boolean_term (boolean_term_op boolean_term)* 
;
boolean_term_op :
    OR 
;
boolean_term : 
    boolean_factor (boolean_factor_op boolean_factor)* 
;
boolean_factor_op :
    AND 
;
boolean_factor : 
    (NOT)? boolean_test 
;
boolean_test : 
    boolean_primary (IS (NOT)? truth_value)? 
;
truth_value : 
      TRUE 
    | FALSE 
    | UNKNOWN 
;
boolean_primary : 
      (predicate)=> predicate 
    | LEFT_PAREN search_condition RIGHT_PAREN 
;
predicate : 
      row_value_constructor 
        ( comp_predicate
        | (NOT)? ( between_predicate 
                   | in_predicate 
                   | like_predicate 
                   )
        | null_predicate 
        | quantified_comp_predicate 
        | match_predicate 
        | overlaps_predicate 
        ) 
    | exists_predicate 
    | unique_predicate 
;
comp_predicate : 
    comp_op row_value_constructor 
;
comp_op : 
      EQUALS_OP 
    | NOT_EQUALS_OP
    | LESS_THAN_OP 
    | GREATER_THAN_OP 
    | LESS_THAN_OR_EQUALS_OP
    | GREATER_THAN_OR_EQUALS_OP
;
between_predicate : 
    BETWEEN row_value_constructor AND row_value_constructor 
;
in_predicate : 
    IN in_predicate_value 
;
in_predicate_value : 
      (table_subquery)=> table_subquery
    | LEFT_PAREN in_value_list RIGHT_PAREN 
;
in_value_list : 
    value_exp (COMMA value_exp)* 
;
like_predicate : 
    LIKE pattern (ESCAPE escape_char)? 
;
pattern : 
    char_value_exp 
;
escape_char : 
    char_value_exp 
;
null_predicate : 
    IS (NOT)? NULL 
;
quantified_comp_predicate : 
    comp_op (ALL | SOME | ANY) table_subquery 
;
exists_predicate : 
    EXISTS table_subquery 
;
unique_predicate : 
    UNIQUE table_subquery 
;
match_predicate : 
    MATCH (UNIQUE)? (FULL | PARTIAL)? table_subquery 
;
overlaps_predicate : 
    OVERLAPS row_value_constructor 
;
cast_spec : 
    CAST LEFT_PAREN cast_operand AS cast_target RIGHT_PAREN 
;
cast_operand : 
      value_exp 
    | NULL
;
cast_target : 
    (  domain_name 
    | data_type)?(FORMAT? CHAR_STRING)? 
;
data_type : 
      char_string_type (CHARACTER SET char_set_name)? 
    | national_char_string_type 
    | bit_string_type 
    | num_type 
    | datetime_type 
    | interval_type 
;
length : 
    UNSIGNED_INTEGER 
;
char_string_type : 
      CHARACTER (LEFT_PAREN length RIGHT_PAREN)? 
    | CHAR (LEFT_PAREN length RIGHT_PAREN)? 
    | CHARACTER VARYING LEFT_PAREN length RIGHT_PAREN 
    | CHAR VARYING LEFT_PAREN length RIGHT_PAREN 
    | VARCHAR LEFT_PAREN length RIGHT_PAREN 
;
national_char_string_type : 
      NATIONAL 
        ( CHARACTER (LEFT_PAREN length RIGHT_PAREN)? 
        | CHAR (LEFT_PAREN length RIGHT_PAREN)? 
        | CHARACTER VARYING LEFT_PAREN length RIGHT_PAREN 
        | CHAR VARYING LEFT_PAREN length RIGHT_PAREN
        )
    | NCHAR (LEFT_PAREN length RIGHT_PAREN)? 
    | NCHAR VARYING LEFT_PAREN length RIGHT_PAREN 
;
bit_string_type : 
      BIT (LEFT_PAREN length RIGHT_PAREN)? 
        | BIT VARYING LEFT_PAREN length RIGHT_PAREN 
;
precision : 
    UNSIGNED_INTEGER 
;
scale : 
    UNSIGNED_INTEGER 
;
num_type : 
      exact_num_type 
    | approximate_num_type 
;
approximate_num_type : 
      FLOAT (LEFT_PAREN precision RIGHT_PAREN)? 
    | REAL 
    | DOUBLE PRECISION 
;
exact_num_type : 
      NUMERIC ( LEFT_PAREN precision (COMMA scale)? RIGHT_PAREN )? 
        | DECIMAL ( LEFT_PAREN precision (COMMA scale)? RIGHT_PAREN )? 
    | DEC ( LEFT_PAREN precision (COMMA scale)? RIGHT_PAREN )? 
    | INTEGER 
    | INT 
    | SMALLINT 
;
datetime_type : 
      DATE 
    | TIME (LEFT_PAREN time_precision RIGHT_PAREN)? (WITH TIME ZONE)?
    | TIMESTAMP (LEFT_PAREN timestamp_precision RIGHT_PAREN)? (WITH TIME ZONE)? 
;
interval_type : 
    INTERVAL interval_qualifier 
;
scalar_subquery : 
    subquery 
;

subquery : 
    LEFT_PAREN query_exp RIGHT_PAREN 
;
query_exp : 
    query_term ( (UNION | EXCEPT| MINUS) (ALL)? (corresponding_spec)? query_term )*
;
query_term : 
    query_primary ( INTERSECT (ALL)? (corresponding_spec)? query_primary)*
;
corresponding_spec : 
    CORRESPONDING (BY LEFT_PAREN column_name_list RIGHT_PAREN)? 
;
query_primary : 
      simple_table 
    | table_ref // EXF0 eliminating the syntactic predicate with <joined_table>
;
simple_table : 
      query_spec 
    | table_value_constructor 
    | explicit_table 
;

query_spec : 
    SELECT (set_quantifier)? select_list {inFrom=true;}(into_clause)? table_exp {sqlinsertinfo.setFromClause($table_exp.text);}
;
table_value_constructor : 
    VALUES table_value_const_list
;
table_value_const_list :
    row_value_constructor (COMMA row_value_constructor)* 
;
row_value_constructor : 
      (row_value_constructor_elem)=>row_value_constructor_elem
      //row_value_constructor_elem
    | LEFT_PAREN row_value_const_list RIGHT_PAREN
;
row_value_constructor_elem : 
      value_exp 
    | NULL 
    | DEFAULT  
;
row_value_const_list : 
    row_value_constructor_elem (COMMA row_value_constructor_elem)* 
;
explicit_table : 
    TABLE table_name 
;
joined_table : 
    table_ref_aux (qualified_join | cross_join)
; 
table_ref : 
    table_ref_aux (options{greedy=true;}:qualified_join | cross_join)*
;
table_ref_aux : 
    (table_name | table_subquery) ((AS)? correlation_name (LEFT_PAREN derived_column_list RIGHT_PAREN)?)? 
;
derived_column_list : 
    column_name_list 
;
table_subquery : 
    subquery 
;
cross_join : 
    CROSS JOIN table_ref
;
qualified_join : 
      ( INNER | outer_join_type (OUTER)? )? JOIN table_ref join_spec 
    | NATURAL ( INNER | outer_join_type (OUTER)? )? JOIN table_ref 
    | UNION JOIN table_ref 
;
outer_join_type : 
      LEFT 
    | RIGHT 
    | FULL 
;
join_spec : 
      join_condition 
    | named_columns_join 
;
join_condition : 
    ON search_condition 
;
named_columns_join : 
    USING LEFT_PAREN column_name_list RIGHT_PAREN 
;
table_exp : 
    from_clause 
    (where_clause)? 
    (group_by_clause)? 
    (having_clause)? 
;
from_clause : 
    FROM table_ref_list
    ;
table_ref_list : 
    query_exp (COMMA query_exp)*
;
where_clause : 
    WHERE search_condition 
;
group_by_clause : 
    GROUP BY grouping_column_ref_list 
;
grouping_column_ref : 
    value_exp (collate_clause)? 
;
grouping_column_ref_list : 
    grouping_column_ref (COMMA grouping_column_ref)*
;
having_clause : 
    HAVING search_condition 
    |QUALIFY search_condition
;
unsigned_value_spec : 
      unsigned_lit 
    | general_value_spec ;
general_value_spec : 
      parameter_spec 
    | dyn_parameter_spec 
    | variable_spec 
    | USER
    | CURRENT_USER
    | SESSION_USER
    | SYSTEM_USER
    | VALUE 
;
parameter_spec : 
    parameter_name ((INDICATOR)? parameter_name)? 
;
dyn_parameter_spec : 
    QUESTION_MARK 
;
variable_spec : 
    EMBDD_VARIABLE_NAME ((INDICATOR)? EMBDD_VARIABLE_NAME)? 
;
num_value_exp : 
    value_exp 
;
string_value_exp : 
    char_value_exp 
;
datetime_value_exp : 
    value_exp 
;
interval_value_exp : 
    value_exp
;
char_value_exp : 
    value_exp
;
value_exp : 
    term (options{greedy=true;}:(term_op | CONCATENATION_OP) term )* 
;
string_value_fct : 
      char_value_fct 
;
char_value_fct : 
      char_substring_fct 
    | char_length_fct
    | fold 
    | form_conversion 
    | char_translation 
    | trim_fct 
    | CHAR_STRING
;
char_length_fct:
	CHAR LEFT_PAREN char_value_exp RIGHT_PAREN;
char_substring_fct : 
    SUBSTRING LEFT_PAREN char_value_exp FROM num_value_exp 
    (FOR num_value_exp)? 
    RIGHT_PAREN 
;
fold : 
    (UPPER | LOWER) LEFT_PAREN char_value_exp RIGHT_PAREN 
;
form_conversion : 
    CONVERT LEFT_PAREN char_value_exp USING form_conversion_name RIGHT_PAREN 
;
char_translation : 
    TRANSLATE LEFT_PAREN char_value_exp USING translation_name RIGHT_PAREN 
;
trim_fct : 
    TRIM LEFT_PAREN trim_operands RIGHT_PAREN 
;
trim_operands : 
      trim_spec FROM char_value_exp 
    | trim_spec char_value_exp FROM char_value_exp 
    | FROM char_value_exp 
    | char_value_exp (FROM char_value_exp)? 
;
trim_spec : 
      LEADING 
    | TRAILING 
    | BOTH 
;
term_op :
    PLUS_SIGN | MINUS_SIGN | MOD
;
term : 
    factor (options{greedy=true;}:factor_op factor)* 
;
factor_op :
    ASTERISK | SOLIDUS 
;
factor : 
    (sign)? gen_primary (AT time_zone_specifier | collate_clause)? (LEFT_PAREN FORMAT CHAR_STRING RIGHT_PAREN)?
;
collate_clause : 
    COLLATE collation_name 
;
gen_primary : 
      value_exp_primary (interval_qualifier)? 
    | num_value_fct
    | string_value_fct 
    | datetime_value_fct
;
num_value_fct : 
      position_exp 
    | extract_exp 
    | length_exp 
;
position_exp : 
    POSITION LEFT_PAREN char_value_exp IN char_value_exp RIGHT_PAREN 
;
extract_exp : 
    EXTRACT LEFT_PAREN extract_field FROM extract_source RIGHT_PAREN 
;
extract_field : 
      datetime_field 
    | time_zone_field 
;
datetime_field : 
      non_second_datetime_field 
    | SECOND 
;
time_zone_field : 
      TIMEZONE_HOUR 
    | TIMEZONE_MINUTE 
;
extract_source : 
      datetime_value_exp 
;
length_exp : 
      char_length_exp 
    | octet_length_exp 
    | bit_length_exp 
;
char_length_exp : 
    (CHAR_LENGTH | CHARACTER_LENGTH) LEFT_PAREN string_value_exp RIGHT_PAREN 
;
octet_length_exp : 
    OCTET_LENGTH LEFT_PAREN string_value_exp RIGHT_PAREN 
;
bit_length_exp : 
    BIT_LENGTH LEFT_PAREN string_value_exp RIGHT_PAREN 
;
/*  Rule #043 <bit_value_exp> - is commented as it is a subset of the rule #069 <char_value_exp>, see also NSF1
bit_value_exp : 
    bit_factor (CONCATENATION_OP bit_factor)*
;
*/




time_zone_specifier : 
      LOCAL 
    | TIME ZONE interval_value_exp 
;
datetime_value_fct : 
      current_date_value_fct 
    | current_time_value_fct 
    | currenttimestamp_value_fct 
;
currenttimestamp_value_fct : 
    CURRENT_TIMESTAMP (LEFT_PAREN timestamp_precision RIGHT_PAREN)?
;
current_date_value_fct : 
    CURRENT_DATE 
;
current_time_value_fct : 
    CURRENT_TIME (LEFT_PAREN time_precision RIGHT_PAREN)? 
;
timestamp_precision : 
    UNSIGNED_INTEGER 
;
time_precision : 
    UNSIGNED_INTEGER 
;
table_name : 
      qualified_name 
    | qualified_local_table_name
;
qualified_local_table_name :
    MODULE PERIOD id 
;
domain_name : 
    qualified_name 
;
column_name : 
    id {if(inFrom==false){sqlinsertinfo.addFirstElem($column_name.text);}}
;
column_name_list : 
    column_name (COMMA column_name)* 
;
correlation_name : 
    id 
;
cursor_name : 
    id 
;
dyn_cursor_name : 
      {input.LA(1) == INTRODUCER}? ((cursor_name)=>cursor_name | extended_cursor_name) 
    | {input.LA(1) != INTRODUCER}? cursor_name 
    | extended_cursor_name 
;
extended_cursor_name : 
    (GLOBAL | LOCAL)? simple_value_spec 
;
simple_value_spec : 
      parameter_name 
    | EMBDD_VARIABLE_NAME 
    | lit 
;
stmt_name : 
    id 
;
parameter_name : 
    COLON 
      ( id (PERIOD id)*
      | UNSIGNED_INTEGER
      )
;
target_spec : 
      parameter_spec 
    | variable_spec 
;
column_ref : 
    id (PERIOD id (PERIOD id (PERIOD id)?)?)? 
;
translation_name : 
    qualified_name 
;
collation_name : 
    qualified_name 
;
form_conversion_name : 
    qualified_name 
;
sign : 
    PLUS_SIGN | MINUS_SIGN 
;
unsigned_num_lit : 
      UNSIGNED_INTEGER
    | EXACT_NUM_LIT
    | APPROXIMATE_NUM_LIT
;
char_string_lit :
    (INTRODUCER char_set_name)? CHAR_STRING
;
unsigned_lit : 
      unsigned_num_lit 
    | general_lit 
;
general_lit : 
      char_string_lit 
    | NATIONAL_CHAR_STRING_LIT 
    | BIT_STRING_LIT 
    | HEX_STRING_LIT 
    | datetime_lit 
    | interval_lit 
;
datetime_lit : 
      date_lit 
    | time_lit 
    | timestamp_lit 
;
date_lit : 
    DATE CHAR_STRING 
;
interval_lit : 
    INTERVAL (sign)? CHAR_STRING interval_qualifier 
;
interval_qualifier : 
      start_field 
        ( TO end_field
        | 
        ) 
    | SECOND 
        ( LEFT_PAREN UNSIGNED_INTEGER 
        (COMMA UNSIGNED_INTEGER)?
          RIGHT_PAREN 
        )? 
;
start_field : 
    non_second_datetime_field (LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN)? 
;
end_field : 
      non_second_datetime_field 
    | SECOND (LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN)? 
;
non_second_datetime_field : 
      YEAR 
    | MONTH 
    | DAY 
    | HOUR 
    | MINUTE 
;
lit : 
      signed_num_lit 
    | general_lit 
;
signed_num_lit : 
    (sign)? unsigned_num_lit 
;
timestamp_lit : 
    TIMESTAMP CHAR_STRING  
;
time_lit : 
    TIME CHAR_STRING  
;
non_reserved_word : 
      ADA 
;

