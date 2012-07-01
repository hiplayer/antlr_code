lexer grammar DmlSQL2Lexer;
options {
    language=Java;
}

tokens { // moved to the import vocabulary
	UNSIGNED_INTEGER; // Imaginary token based on subtoken typecasting - see the rule <EXACT_NUM_LIT>
	APPROXIMATE_NUM_LIT; // Imaginary token based on subtoken typecasting - see the rule <EXACT_NUM_LIT>
	QUOTE;  // Imaginary token based on subtoken typecasting - see the rule <CHAR_STRING>
	PERIOD;  // Imaginary token based on subtoken typecasting - see the rule <EXACT_NUM_LIT>
	MINUS_SIGN; // Imaginary token based on subtoken typecasting - see the rule <SEPARATOR>
	UNDERSCORE; // Imaginary token based on subtoken typecasting - see the rule <INTRODUCER>
	DOUBLE_PERIOD;  // Imaginary token based on subtoken typecasting - see the rule <EXACT_NUM_LIT>
	NOT_EQUALS_OP; // Imaginary token based on subtoken typecasting - see the rule <LESS_THAN_OP>
	LESS_THAN_OR_EQUALS_OP ; // Imaginary token based on subtoken typecasting - see the rule <LESS_THAN_OP>
	GREATER_THAN_OR_EQUALS_OP; // Imaginary token based on subtoken typecasting - see the rule <GREATER_THAN_OP>
	CONCATENATION_OP; // Imaginary token based on subtoken typecasting - see the rule <VERTICAL_BAR>
	NATIONAL_CHAR_STRING_LIT; // Imaginary token based on subtoken typecasting - see the rule <REGULAR_ID>
	BIT_STRING_LIT; // Imaginary token based on subtoken typecasting - see the rule <REGULAR_ID>
	HEX_STRING_LIT; // Imaginary token based on subtoken typecasting - see the rule <REGULAR_ID>
	EMBDD_VARIABLE_NAME; // Imaginary token based on subtoken typecasting - see the rule <COLON>
    ANTLR_USE_NAMESPACE;
}

ADA                       :A D A                                        ; 
ALL                       :A L L                                        ;
AND                       :A N D                                        ;
ANY                       :A N Y                                        ;
AS                        :A S                                          ;
ASC                       :A S C                                        ;
AT                        :A T                                          ;
AVG                       :A V G                                        ;
BETWEEN                   :B E T W E E N                                ;
BIT                       :B I T                                        ;
BIT_LENGTH                :B I T UNDERSCORE L E N G T H                 ;       
BOTH                      :B O T H                                      ;
BY                        :B Y                                          ;
CASE                      :C A S E                                      ;
CAST                      :C A S T                                      ;
CHAR                      :C H A R                                      ;
CHAR_LENGTH               :C H A R UNDERSCORE L E N G T H               ;       
CHARACTER                 :C H A R A C T E R                            ;
CHARACTER_LENGTH          :C H A R A C T E R UNDERSCORE L E N G T H     ;       
COALESCE                  :C O A L E S C E                              ;
COLLATE                   :C O L L A T E                                ;
CONVERT                   :C O N V E R T                                ;
CORRESPONDING             :C O R R E S P O N D I N G                    ;
COUNT                     :C O U N T                                    ;
CROSS                     :C R O S S                                    ;
CURRENT                   :C U R R E N T                                ;
CURRENT_DATE              :C U R R E N T UNDERSCORE D A T E             ;       
CURRENT_TIME              :C U R R E N T UNDERSCORE T I M E             ;       
CURRENT_TIMESTAMP         :C U R R E N T UNDERSCORE T I M E S T A M P   ;       
CURRENT_USER              :C U R R E N T UNDERSCORE U S E R             ;       
DATE                      :D A T E                                      ;
DAY                       :D A Y                                        ;
DEC                       :D E C                                        ;
DECIMAL                   :D E C I M A L                                ;
DEFAULT                   :D E F A U L T                                ;
DELETE                    :D E L E T E                                  ;
DESC                      :D E S C                                      ;
DISTINCT                  :D I S T I N C T                              ;
DOUBLE                    :D O U B L E                                  ;
ELSE                      :E L S E                                      ;
END                       :E N D                                        ;
ESCAPE                    :E S C A P E                                  ;
EXCEPT                    :E X C E P T                                  ;
EXISTS                    :E X I S T S                                  ;
EXTRACT                   :E X T R A C T                                ;
FALSE                     :F A L S E                                    ;
FLOAT                     :F L O A T                                    ;
FORMAT					  :F O R M A T                                  ;
FOR                       :F O R                                        ;
FROM                      :F R O M                                      ;
FULL                      :F U L L                                      ;
GLOBAL                    :G L O B A L                                  ;
GROUP                     :G R O U P                                    ;
HAVING                    :H A V I N G                                  ;
HOUR                      :H O U R                                      ;
IN                        :I N                                          ;
INDICATOR                 :I N D I C A T O R                            ;
INNER                     :I N N E R                                    ;
INSERT                    :I N S E R T                                  ;
INT                       :I N T                                        ;
INTEGER                   :I N T E G E R                                ;
INTERSECT                 :I N T E R S E C T                            ;
INTERVAL                  :I N T E R V A L                              ;
INTO                      :I N T O                                      ;
IS                        :I S                                          ;
JOIN                      :J O I N                                      ;
LEADING                   :L E A D I N G                                ;
LEFT                      :L E F T                                      ;
LIKE                      :L I K E                                      ;
LOCAL                     :L O C A L                                    ;
LOWER                     :L O W E R                                    ;
MATCH                     :M A T C H                                    ;
MAX                       :M A X                                        ;
MIN                       :M I N                                        ;
MINUTE                    :M I N U T E                                  ;
MINUS					  :M I N U S									;
MOD                       :M O D									    ;
MODULE                    :M O D U L E                                  ;
MONTH                     :M O N T H                                    ;
NATIONAL                  :N A T I O N A L                              ;
NATURAL                   :N A T U R A L                                ;
NCHAR                     :N C H A R                                    ;
NOT                       :N O T                                        ;
NULL                      :N U L L                                      ;
NULLIF                    :N U L L I F                                  ;
NUMERIC                   :N U M E R I C                                ;
OCTET_LENGTH              :O C T E T UNDERSCORE L E N G T H             ;       
OF                        :O F                                          ;
ON                        :O N                                          ;
ONLY                      :O N L Y                                      ;
OR                        :O R                                          ;
ORDER                     :O R D E R                                    ;
OUTER                     :O U T E R                                    ;
OVER					  :O V E R										;
OVERLAPS                  :O V E R L A P S                              ;
PARTIAL                   :P A R T I A L                                ;
POSITION                  :P O S I T I O N                              ;
PRECISION                 :P R E C I S I O N                            ;
PARTITION                 :P A R T I T I O N                            ;
QUALIFY                   :Q U A L I F Y                                ;
READ                      :R E A D                                      ;
REAL                      :R E A L                                      ;
RIGHT                     :R I G H T                                    ;
SECOND                    :S E C O N D                                  ;
SELECT                    :S E L E C T                                  ;
SESSION_USER              :S E S S I O N UNDERSCORE U S E R             ;       
SET                       :S E T                                        ;
SMALLINT                  :S M A L L I N T                              ;
SOME                      :S O M E                                      ;
SUBSTRING                 :S U B S T R I N G                            ;
SUM                       :S U M                                        ;
SYSTEM_USER               :S Y S T E M UNDERSCORE U S E R               ;       
TABLE                     :T A B L E                                    ;
THEN                      :T H E N                                      ;
TIME                      :T I M E                                      ;
TIMESTAMP                 :T I M E S T A M P                            ;
TIMEZONE_HOUR             :T I M E Z O N E UNDERSCORE H O U R           ;       
TIMEZONE_MINUTE           :T I M E Z O N E UNDERSCORE M I N U T E       ;       
TO                        :T O                                          ;
TRAILING                  :T R A I L I N G                              ;
TRANSLATE                 :T R A N S L A T E                            ;
TRIM                      :T R I M                                      ;
TRUE                      :T R U E                                      ;
UNION                     :U N I O N                                    ;
UNIQUE                    :U N I Q U E                                  ;
UNKNOWN                   :U N K N O W N                                ;
UPDATE                    :U P D A T E                                  ;
UPPER                     :U P P E R                                    ;
USER                      :U S E R                                      ;
USING                     :U S I N G                                    ;
VALUE                     :V A L U E                                    ;
VALUES                    :V A L U E S                                  ;
VARCHAR                   :V A R C H A R                                ;
VARYING                   :V A R Y I N G                                ;
WHEN                      :W H E N                                      ;
WHERE                     :W H E R E                                    ;
WITH                      :W I T H                                      ;
YEAR                      :Y E A R                                      ;
ZONE                      :Z O N E                                      ;

REGULAR_ID : 
    ( NATIONAL_CHAR_STRING_LIT { $type = NATIONAL_CHAR_STRING_LIT;} 
    | BIT_STRING_LIT { $type = BIT_STRING_LIT;} 
    | HEX_STRING_LIT { $type = HEX_STRING_LIT;} 
    )
    // REGULAR_ID
    | (SIMPLE_LETTER) (SIMPLE_LETTER | '_' | '0'..'9')* { $type = REGULAR_ID;} 
;
EXACT_NUM_LIT :
      UNSIGNED_INTEGER
        ( '.' (UNSIGNED_INTEGER)?
        |   { $type = UNSIGNED_INTEGER;}
        ) ( ('E' | 'e') ('+' | '-')? UNSIGNED_INTEGER { $type = APPROXIMATE_NUM_LIT;} )?
    | '.' UNSIGNED_INTEGER ( ('E' | 'e') ('+' | '-')? UNSIGNED_INTEGER { $type = APPROXIMATE_NUM_LIT;} )?
    | '.'   { $type = PERIOD;}
    | '.' '.' { $type = DOUBLE_PERIOD;}
;
fragment
UNSIGNED_INTEGER : 
    ('0'..'9')+ 
;
fragment
NATIONAL_CHAR_STRING_LIT : 
    ('N' | 'n') ('\'' (options{greedy=true;}: ~('\'' | '\r' | '\n' ) | '\'' '\'' | NEWLINE)* '\'' (SEPARATOR)? )+ 
;
fragment
BIT_STRING_LIT : 
    ('B' | 'b') ('\'' ('0' | '1')* '\'' (SEPARATOR)? )+ 
;
fragment
HEX_STRING_LIT : 
    ('X' | 'x') ('\'' ('a'..'f' | 'A'..'F' | '0'..'9')* '\'' (SEPARATOR)? )+ 
;
CHAR_STRING : 
      ('\'' (options{greedy=true;}: ~('\'' | '\r' | '\n') | '\'' '\'' | NEWLINE)* '\'' (SEPARATOR)? )+ 
    | '\'' { $type = QUOTE;}
;
DELIMITED_ID : 
    '"' (~('"' | '\r' | '\n') | '"' '"')+ '"' 
;
PERCENT : '%' ; // Not used in the parser
AMPERSAND : '&' ; // Not used in the parser
LEFT_PAREN : '(' ; 
RIGHT_PAREN : ')' ; 
ASTERISK : '*' ; 
PLUS_SIGN : '+' ; 
COMMA : ',' ; 
SOLIDUS : '/' ; 
COLON :
      ':'
    | ':' (SIMPLE_LETTER_2 | '0'..'9' | '.' | '_' | '#' | '$' | '&' | '%' | '@')+ { $type = EMBDD_VARIABLE_NAME;}
; 
SEMICOLON : ';' ; 
LESS_THAN_OP : '<' ('>' { $type = NOT_EQUALS_OP;} | '=' { $type = LESS_THAN_OR_EQUALS_OP;})?; 
EQUALS_OP : '=' ; 
GREATER_THAN_OP : '>' ('=' { $type = GREATER_THAN_OR_EQUALS_OP;})?; 
QUESTION_MARK : '?' ; 
VERTICAL_BAR : '|' ('|' { $type = CONCATENATION_OP;})?; 
LEFT_BRACKET : '[' ; // Not used in the parser
RIGHT_BRACKET : ']' ; // Not used in the parser
INTRODUCER : '_' (SEPARATOR { $type = UNDERSCORE;})?; 
fragment
SIMPLE_LETTER : 
    'a'..'z' | 'A'..'Z' |'$'|'{'|'}'|':'|'"'
    
;
fragment
SIMPLE_LETTER_2 : 
    'a'..'z' | 'A'..'Z' 
;
SEPARATOR : 
      '-' { $type = MINUS_SIGN;}
    | COMMENT {  $type = ANTLR_USE_NAMESPACE;$channel=HIDDEN; }
    | (SPACE | NEWLINE)+    {  $type = ANTLR_USE_NAMESPACE;$channel=HIDDEN; }
;
fragment 
COMMENT : 
    '-' '-' ( ~('\r' | '\n') )* NEWLINE 
    |'/*' ( options {greedy=false;} : . )* '*/'
    //|NEWLINE '\.' ( ~('\r' | '\n') )* 
    //|NEWLINE L O C K I N G ( ~('\r' | '\n') )*
;

fragment 
NEWLINE : 
    ( '\r' (options{greedy=true;}: '\n')? | '\n' ) /*{newline();} */
;
fragment 
SPACE : 
      ' ' | '\t' 
;
fragment
ANY_CHAR : 
    .
    ;
fragment
ANY_CHARS :
    ANY_CHAR+
;
fragment A
    :   'A' | 'a';

fragment B 
    :   'B' | 'b';

fragment C 
    :   'C' | 'c';
    
fragment D 
    :   'D' | 'd';
    
fragment E
    :   'E' | 'e';

fragment F
    :   'F' | 'f';

fragment G
    :   'G' | 'g';

fragment H
    :   'H' | 'h';
    
fragment I
    :   'I' | 'i';
    
fragment J
    :   'J' | 'j';
    
fragment K
    :   'K' | 'k';
    
fragment L
    :   'L' | 'l';
    
fragment M 
    :   'M' | 'm';
    
fragment N
    :   'N' | 'n';
    
fragment O
    :   'O' | 'o';
    
fragment P
    :   'P' | 'p';
    
fragment Q
    :   'Q' | 'q';
    
fragment R
    :   'R' | 'r';
    
fragment S
    :   'S' | 's';
    
fragment T
    :   'T' | 't';
    
fragment U
    :   'U' | 'u';
    
fragment V
    :   'V' | 'v';
    
fragment W
    :   'W' | 'w';
    
fragment X
    :   'X' | 'x';
    
fragment Y
    :   'Y' | 'y';
    
fragment Z
    :   'Z' | 'z';
fragment UNDERSCORE
    :   '_';
    



