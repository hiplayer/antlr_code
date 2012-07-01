// $ANTLR 3.3 Nov 30, 2010 12:50:56 E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g 2012-07-01 15:44:02

	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class DmlSQL2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "UNSIGNED_INTEGER", "APPROXIMATE_NUM_LIT", "QUOTE", "PERIOD", "MINUS_SIGN", "UNDERSCORE", "DOUBLE_PERIOD", "NOT_EQUALS_OP", "LESS_THAN_OR_EQUALS_OP", "GREATER_THAN_OR_EQUALS_OP", "CONCATENATION_OP", "NATIONAL_CHAR_STRING_LIT", "BIT_STRING_LIT", "HEX_STRING_LIT", "EMBDD_VARIABLE_NAME", "ANTLR_USE_NAMESPACE", "A", "D", "ADA", "L", "ALL", "N", "AND", "Y", "ANY", "S", "AS", "C", "ASC", "T", "AT", "V", "G", "AVG", "B", "E", "W", "BETWEEN", "I", "BIT", "H", "BIT_LENGTH", "O", "BOTH", "BY", "CASE", "CAST", "R", "CHAR", "CHAR_LENGTH", "CHARACTER", "CHARACTER_LENGTH", "COALESCE", "COLLATE", "CONVERT", "P", "CORRESPONDING", "U", "COUNT", "CROSS", "CURRENT", "CURRENT_DATE", "M", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATE", "DAY", "DEC", "DECIMAL", "F", "DEFAULT", "DELETE", "DESC", "DISTINCT", "DOUBLE", "ELSE", "END", "ESCAPE", "X", "EXCEPT", "EXISTS", "EXTRACT", "FALSE", "FLOAT", "FORMAT", "FOR", "FROM", "FULL", "GLOBAL", "GROUP", "HAVING", "HOUR", "IN", "INDICATOR", "INNER", "INSERT", "INT", "INTEGER", "INTERSECT", "INTERVAL", "INTO", "IS", "J", "JOIN", "LEADING", "LEFT", "K", "LIKE", "LOCAL", "LOWER", "MATCH", "MAX", "MIN", "MINUTE", "MINUS", "MOD", "MODULE", "MONTH", "NATIONAL", "NATURAL", "NCHAR", "NOT", "NULL", "NULLIF", "NUMERIC", "OCTET_LENGTH", "OF", "ON", "ONLY", "OR", "ORDER", "OUTER", "OVER", "OVERLAPS", "PARTIAL", "POSITION", "PRECISION", "PARTITION", "Q", "QUALIFY", "READ", "REAL", "RIGHT", "SECOND", "SELECT", "SESSION_USER", "SET", "SMALLINT", "SOME", "SUBSTRING", "SUM", "SYSTEM_USER", "TABLE", "THEN", "TIME", "TIMESTAMP", "Z", "TIMEZONE_HOUR", "TIMEZONE_MINUTE", "TO", "TRAILING", "TRANSLATE", "TRIM", "TRUE", "UNION", "UNIQUE", "UNKNOWN", "UPDATE", "UPPER", "USER", "USING", "VALUE", "VALUES", "VARCHAR", "VARYING", "WHEN", "WHERE", "WITH", "YEAR", "ZONE", "SIMPLE_LETTER", "REGULAR_ID", "EXACT_NUM_LIT", "NEWLINE", "SEPARATOR", "CHAR_STRING", "DELIMITED_ID", "PERCENT", "AMPERSAND", "LEFT_PAREN", "RIGHT_PAREN", "ASTERISK", "PLUS_SIGN", "COMMA", "SOLIDUS", "SIMPLE_LETTER_2", "COLON", "SEMICOLON", "LESS_THAN_OP", "EQUALS_OP", "GREATER_THAN_OP", "QUESTION_MARK", "VERTICAL_BAR", "LEFT_BRACKET", "RIGHT_BRACKET", "INTRODUCER", "COMMENT", "SPACE", "ANY_CHAR", "ANY_CHARS"
    };
    public static final int EOF=-1;
    public static final int UNSIGNED_INTEGER=4;
    public static final int APPROXIMATE_NUM_LIT=5;
    public static final int QUOTE=6;
    public static final int PERIOD=7;
    public static final int MINUS_SIGN=8;
    public static final int UNDERSCORE=9;
    public static final int DOUBLE_PERIOD=10;
    public static final int NOT_EQUALS_OP=11;
    public static final int LESS_THAN_OR_EQUALS_OP=12;
    public static final int GREATER_THAN_OR_EQUALS_OP=13;
    public static final int CONCATENATION_OP=14;
    public static final int NATIONAL_CHAR_STRING_LIT=15;
    public static final int BIT_STRING_LIT=16;
    public static final int HEX_STRING_LIT=17;
    public static final int EMBDD_VARIABLE_NAME=18;
    public static final int ANTLR_USE_NAMESPACE=19;
    public static final int A=20;
    public static final int D=21;
    public static final int ADA=22;
    public static final int L=23;
    public static final int ALL=24;
    public static final int N=25;
    public static final int AND=26;
    public static final int Y=27;
    public static final int ANY=28;
    public static final int S=29;
    public static final int AS=30;
    public static final int C=31;
    public static final int ASC=32;
    public static final int T=33;
    public static final int AT=34;
    public static final int V=35;
    public static final int G=36;
    public static final int AVG=37;
    public static final int B=38;
    public static final int E=39;
    public static final int W=40;
    public static final int BETWEEN=41;
    public static final int I=42;
    public static final int BIT=43;
    public static final int H=44;
    public static final int BIT_LENGTH=45;
    public static final int O=46;
    public static final int BOTH=47;
    public static final int BY=48;
    public static final int CASE=49;
    public static final int CAST=50;
    public static final int R=51;
    public static final int CHAR=52;
    public static final int CHAR_LENGTH=53;
    public static final int CHARACTER=54;
    public static final int CHARACTER_LENGTH=55;
    public static final int COALESCE=56;
    public static final int COLLATE=57;
    public static final int CONVERT=58;
    public static final int P=59;
    public static final int CORRESPONDING=60;
    public static final int U=61;
    public static final int COUNT=62;
    public static final int CROSS=63;
    public static final int CURRENT=64;
    public static final int CURRENT_DATE=65;
    public static final int M=66;
    public static final int CURRENT_TIME=67;
    public static final int CURRENT_TIMESTAMP=68;
    public static final int CURRENT_USER=69;
    public static final int DATE=70;
    public static final int DAY=71;
    public static final int DEC=72;
    public static final int DECIMAL=73;
    public static final int F=74;
    public static final int DEFAULT=75;
    public static final int DELETE=76;
    public static final int DESC=77;
    public static final int DISTINCT=78;
    public static final int DOUBLE=79;
    public static final int ELSE=80;
    public static final int END=81;
    public static final int ESCAPE=82;
    public static final int X=83;
    public static final int EXCEPT=84;
    public static final int EXISTS=85;
    public static final int EXTRACT=86;
    public static final int FALSE=87;
    public static final int FLOAT=88;
    public static final int FORMAT=89;
    public static final int FOR=90;
    public static final int FROM=91;
    public static final int FULL=92;
    public static final int GLOBAL=93;
    public static final int GROUP=94;
    public static final int HAVING=95;
    public static final int HOUR=96;
    public static final int IN=97;
    public static final int INDICATOR=98;
    public static final int INNER=99;
    public static final int INSERT=100;
    public static final int INT=101;
    public static final int INTEGER=102;
    public static final int INTERSECT=103;
    public static final int INTERVAL=104;
    public static final int INTO=105;
    public static final int IS=106;
    public static final int J=107;
    public static final int JOIN=108;
    public static final int LEADING=109;
    public static final int LEFT=110;
    public static final int K=111;
    public static final int LIKE=112;
    public static final int LOCAL=113;
    public static final int LOWER=114;
    public static final int MATCH=115;
    public static final int MAX=116;
    public static final int MIN=117;
    public static final int MINUTE=118;
    public static final int MINUS=119;
    public static final int MOD=120;
    public static final int MODULE=121;
    public static final int MONTH=122;
    public static final int NATIONAL=123;
    public static final int NATURAL=124;
    public static final int NCHAR=125;
    public static final int NOT=126;
    public static final int NULL=127;
    public static final int NULLIF=128;
    public static final int NUMERIC=129;
    public static final int OCTET_LENGTH=130;
    public static final int OF=131;
    public static final int ON=132;
    public static final int ONLY=133;
    public static final int OR=134;
    public static final int ORDER=135;
    public static final int OUTER=136;
    public static final int OVER=137;
    public static final int OVERLAPS=138;
    public static final int PARTIAL=139;
    public static final int POSITION=140;
    public static final int PRECISION=141;
    public static final int PARTITION=142;
    public static final int Q=143;
    public static final int QUALIFY=144;
    public static final int READ=145;
    public static final int REAL=146;
    public static final int RIGHT=147;
    public static final int SECOND=148;
    public static final int SELECT=149;
    public static final int SESSION_USER=150;
    public static final int SET=151;
    public static final int SMALLINT=152;
    public static final int SOME=153;
    public static final int SUBSTRING=154;
    public static final int SUM=155;
    public static final int SYSTEM_USER=156;
    public static final int TABLE=157;
    public static final int THEN=158;
    public static final int TIME=159;
    public static final int TIMESTAMP=160;
    public static final int Z=161;
    public static final int TIMEZONE_HOUR=162;
    public static final int TIMEZONE_MINUTE=163;
    public static final int TO=164;
    public static final int TRAILING=165;
    public static final int TRANSLATE=166;
    public static final int TRIM=167;
    public static final int TRUE=168;
    public static final int UNION=169;
    public static final int UNIQUE=170;
    public static final int UNKNOWN=171;
    public static final int UPDATE=172;
    public static final int UPPER=173;
    public static final int USER=174;
    public static final int USING=175;
    public static final int VALUE=176;
    public static final int VALUES=177;
    public static final int VARCHAR=178;
    public static final int VARYING=179;
    public static final int WHEN=180;
    public static final int WHERE=181;
    public static final int WITH=182;
    public static final int YEAR=183;
    public static final int ZONE=184;
    public static final int SIMPLE_LETTER=185;
    public static final int REGULAR_ID=186;
    public static final int EXACT_NUM_LIT=187;
    public static final int NEWLINE=188;
    public static final int SEPARATOR=189;
    public static final int CHAR_STRING=190;
    public static final int DELIMITED_ID=191;
    public static final int PERCENT=192;
    public static final int AMPERSAND=193;
    public static final int LEFT_PAREN=194;
    public static final int RIGHT_PAREN=195;
    public static final int ASTERISK=196;
    public static final int PLUS_SIGN=197;
    public static final int COMMA=198;
    public static final int SOLIDUS=199;
    public static final int SIMPLE_LETTER_2=200;
    public static final int COLON=201;
    public static final int SEMICOLON=202;
    public static final int LESS_THAN_OP=203;
    public static final int EQUALS_OP=204;
    public static final int GREATER_THAN_OP=205;
    public static final int QUESTION_MARK=206;
    public static final int VERTICAL_BAR=207;
    public static final int LEFT_BRACKET=208;
    public static final int RIGHT_BRACKET=209;
    public static final int INTRODUCER=210;
    public static final int COMMENT=211;
    public static final int SPACE=212;
    public static final int ANY_CHAR=213;
    public static final int ANY_CHARS=214;

    // delegates
    // delegators


        public DmlSQL2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DmlSQL2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[490+1];
             
             
        }
        

    public String[] getTokenNames() { return DmlSQL2Parser.tokenNames; }
    public String getGrammarFileName() { return "E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g"; }


    	public InsertInfo sqlinsertinfo=null;
    	private boolean inFrom=true;



    // $ANTLR start "any_char"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:17:1: any_char : ( ANY_CHARS )+ ;
    public final void any_char() throws RecognitionException {
        int any_char_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:17:9: ( ( ANY_CHARS )+ )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:18:5: ( ANY_CHARS )+
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:18:5: ( ANY_CHARS )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ANY_CHARS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:0:0: ANY_CHARS
            	    {
            	    match(input,ANY_CHARS,FOLLOW_ANY_CHARS_in_any_char61); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, any_char_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "any_char"


    // $ANTLR start "sql_script"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:20:1: sql_script : ( sql_stmt )? ( SEMICOLON ( sql_stmt )? )* ;
    public final void sql_script() throws RecognitionException {
        int sql_script_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:20:12: ( ( sql_stmt )? ( SEMICOLON ( sql_stmt )? )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:21:5: ( sql_stmt )? ( SEMICOLON ( sql_stmt )? )*
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:21:5: ( sql_stmt )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ADA||LA2_0==DELETE||LA2_0==INSERT||LA2_0==MODULE||LA2_0==SELECT||LA2_0==TABLE||LA2_0==UPDATE||LA2_0==VALUES||LA2_0==REGULAR_ID||LA2_0==DELIMITED_ID||LA2_0==LEFT_PAREN||LA2_0==INTRODUCER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:21:6: sql_stmt
                    {
                    pushFollow(FOLLOW_sql_stmt_in_sql_script80);
                    sql_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:21:17: ( SEMICOLON ( sql_stmt )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==SEMICOLON) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:21:19: SEMICOLON ( sql_stmt )?
            	    {
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sql_script86); if (state.failed) return ;
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:21:29: ( sql_stmt )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==ADA||LA3_0==DELETE||LA3_0==INSERT||LA3_0==MODULE||LA3_0==SELECT||LA3_0==TABLE||LA3_0==UPDATE||LA3_0==VALUES||LA3_0==REGULAR_ID||LA3_0==DELIMITED_ID||LA3_0==LEFT_PAREN||LA3_0==INTRODUCER) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:21:30: sql_stmt
            	            {
            	            pushFollow(FOLLOW_sql_stmt_in_sql_script89);
            	            sql_stmt();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, sql_script_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "sql_script"


    // $ANTLR start "sql_single_stmt"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:23:1: sql_single_stmt : ( sql_stmt )? ( SEMICOLON )? ;
    public final void sql_single_stmt() throws RecognitionException {
        int sql_single_stmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:23:17: ( ( sql_stmt )? ( SEMICOLON )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:24:5: ( sql_stmt )? ( SEMICOLON )?
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:24:5: ( sql_stmt )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ADA||LA5_0==DELETE||LA5_0==INSERT||LA5_0==MODULE||LA5_0==SELECT||LA5_0==TABLE||LA5_0==UPDATE||LA5_0==VALUES||LA5_0==REGULAR_ID||LA5_0==DELIMITED_ID||LA5_0==LEFT_PAREN||LA5_0==INTRODUCER) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:24:6: sql_stmt
                    {
                    pushFollow(FOLLOW_sql_stmt_in_sql_single_stmt108);
                    sql_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:24:17: ( SEMICOLON )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==SEMICOLON) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:24:18: SEMICOLON
                    {
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sql_single_stmt113); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, sql_single_stmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "sql_single_stmt"


    // $ANTLR start "sql_stmt"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:26:1: sql_stmt : sql_data_stmt ;
    public final void sql_stmt() throws RecognitionException {
        int sql_stmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:26:10: ( sql_data_stmt )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:27:7: sql_data_stmt
            {
            pushFollow(FOLLOW_sql_data_stmt_in_sql_stmt130);
            sql_data_stmt();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, sql_stmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "sql_stmt"


    // $ANTLR start "sql_data_stmt"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:29:1: sql_data_stmt : ( select_stmt | insert_stmt | update_stmt | delete_stmt );
    public final void sql_data_stmt() throws RecognitionException {
        int sql_data_stmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:29:15: ( select_stmt | insert_stmt | update_stmt | delete_stmt )
            int alt7=4;
            switch ( input.LA(1) ) {
            case ADA:
            case MODULE:
            case SELECT:
            case TABLE:
            case VALUES:
            case REGULAR_ID:
            case DELIMITED_ID:
            case LEFT_PAREN:
            case INTRODUCER:
                {
                alt7=1;
                }
                break;
            case INSERT:
                {
                alt7=2;
                }
                break;
            case UPDATE:
                {
                alt7=3;
                }
                break;
            case DELETE:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:30:7: select_stmt
                    {
                    pushFollow(FOLLOW_select_stmt_in_sql_data_stmt146);
                    select_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:31:7: insert_stmt
                    {
                    pushFollow(FOLLOW_insert_stmt_in_sql_data_stmt155);
                    insert_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:32:7: update_stmt
                    {
                    pushFollow(FOLLOW_update_stmt_in_sql_data_stmt164);
                    update_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:33:7: delete_stmt
                    {
                    pushFollow(FOLLOW_delete_stmt_in_sql_data_stmt173);
                    delete_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, sql_data_stmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "sql_data_stmt"


    // $ANTLR start "select_stmt"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:35:1: select_stmt : query_exp ( into_clause ( order_by_clause )? ( updatability_clause )? | order_by_clause ( into_clause )? ( updatability_clause )? | updatability_clause ( into_clause )? | ) ;
    public final void select_stmt() throws RecognitionException {
        int select_stmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:35:13: ( query_exp ( into_clause ( order_by_clause )? ( updatability_clause )? | order_by_clause ( into_clause )? ( updatability_clause )? | updatability_clause ( into_clause )? | ) )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:36:5: query_exp ( into_clause ( order_by_clause )? ( updatability_clause )? | order_by_clause ( into_clause )? ( updatability_clause )? | updatability_clause ( into_clause )? | )
            {
            pushFollow(FOLLOW_query_exp_in_select_stmt187);
            query_exp();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:37:7: ( into_clause ( order_by_clause )? ( updatability_clause )? | order_by_clause ( into_clause )? ( updatability_clause )? | updatability_clause ( into_clause )? | )
            int alt13=4;
            switch ( input.LA(1) ) {
            case INTO:
                {
                alt13=1;
                }
                break;
            case UNSIGNED_INTEGER:
            case ADA:
            case ORDER:
            case REGULAR_ID:
            case DELIMITED_ID:
            case INTRODUCER:
                {
                alt13=2;
                }
                break;
            case FOR:
                {
                alt13=3;
                }
                break;
            case EOF:
            case SEMICOLON:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:37:9: into_clause ( order_by_clause )? ( updatability_clause )?
                    {
                    pushFollow(FOLLOW_into_clause_in_select_stmt198);
                    into_clause();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:37:21: ( order_by_clause )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==UNSIGNED_INTEGER||LA8_0==ADA||LA8_0==ORDER||LA8_0==REGULAR_ID||LA8_0==DELIMITED_ID||LA8_0==INTRODUCER) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:37:22: order_by_clause
                            {
                            pushFollow(FOLLOW_order_by_clause_in_select_stmt201);
                            order_by_clause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:37:40: ( updatability_clause )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==FOR) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:37:41: updatability_clause
                            {
                            pushFollow(FOLLOW_updatability_clause_in_select_stmt206);
                            updatability_clause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:38:9: order_by_clause ( into_clause )? ( updatability_clause )?
                    {
                    pushFollow(FOLLOW_order_by_clause_in_select_stmt218);
                    order_by_clause();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:38:25: ( into_clause )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==INTO) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:38:26: into_clause
                            {
                            pushFollow(FOLLOW_into_clause_in_select_stmt221);
                            into_clause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:38:40: ( updatability_clause )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==FOR) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:38:41: updatability_clause
                            {
                            pushFollow(FOLLOW_updatability_clause_in_select_stmt226);
                            updatability_clause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:39:9: updatability_clause ( into_clause )?
                    {
                    pushFollow(FOLLOW_updatability_clause_in_select_stmt238);
                    updatability_clause();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:39:29: ( into_clause )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==INTO) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:39:30: into_clause
                            {
                            pushFollow(FOLLOW_into_clause_in_select_stmt241);
                            into_clause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:41:7: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, select_stmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "select_stmt"


    // $ANTLR start "into_clause"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:43:1: into_clause : INTO target_spec ( COMMA target_spec )* ;
    public final void into_clause() throws RecognitionException {
        int into_clause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:43:13: ( INTO target_spec ( COMMA target_spec )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:44:5: INTO target_spec ( COMMA target_spec )*
            {
            match(input,INTO,FOLLOW_INTO_in_into_clause272); if (state.failed) return ;
            pushFollow(FOLLOW_target_spec_in_into_clause274);
            target_spec();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:44:22: ( COMMA target_spec )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:44:23: COMMA target_spec
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_into_clause277); if (state.failed) return ;
            	    pushFollow(FOLLOW_target_spec_in_into_clause279);
            	    target_spec();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, into_clause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "into_clause"


    // $ANTLR start "order_by_clause"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:46:1: order_by_clause : ( ORDER BY )? sort_spec_list ;
    public final void order_by_clause() throws RecognitionException {
        int order_by_clause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:46:17: ( ( ORDER BY )? sort_spec_list )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:47:5: ( ORDER BY )? sort_spec_list
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:47:5: ( ORDER BY )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ORDER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:47:6: ORDER BY
                    {
                    match(input,ORDER,FOLLOW_ORDER_in_order_by_clause296); if (state.failed) return ;
                    match(input,BY,FOLLOW_BY_in_order_by_clause298); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_sort_spec_list_in_order_by_clause303);
            sort_spec_list();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, order_by_clause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "order_by_clause"


    // $ANTLR start "sort_spec_list"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:49:1: sort_spec_list : sort_spec ( COMMA sort_spec )* ;
    public final void sort_spec_list() throws RecognitionException {
        int sort_spec_list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:49:16: ( sort_spec ( COMMA sort_spec )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:50:5: sort_spec ( COMMA sort_spec )*
            {
            pushFollow(FOLLOW_sort_spec_in_sort_spec_list317);
            sort_spec();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:50:15: ( COMMA sort_spec )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:50:16: COMMA sort_spec
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_sort_spec_list320); if (state.failed) return ;
            	    pushFollow(FOLLOW_sort_spec_in_sort_spec_list322);
            	    sort_spec();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, sort_spec_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "sort_spec_list"


    // $ANTLR start "sort_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:52:1: sort_spec : sort_key ( collate_clause )? ( ordering_spec )? ;
    public final void sort_spec() throws RecognitionException {
        int sort_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:52:11: ( sort_key ( collate_clause )? ( ordering_spec )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:53:5: sort_key ( collate_clause )? ( ordering_spec )?
            {
            pushFollow(FOLLOW_sort_key_in_sort_spec338);
            sort_key();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:53:14: ( collate_clause )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==COLLATE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:53:15: collate_clause
                    {
                    pushFollow(FOLLOW_collate_clause_in_sort_spec341);
                    collate_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:53:32: ( ordering_spec )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ASC||LA18_0==DESC) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:53:33: ordering_spec
                    {
                    pushFollow(FOLLOW_ordering_spec_in_sort_spec346);
                    ordering_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, sort_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "sort_spec"


    // $ANTLR start "sort_key"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:55:1: sort_key : ( column_ref | UNSIGNED_INTEGER );
    public final void sort_key() throws RecognitionException {
        int sort_key_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:55:10: ( column_ref | UNSIGNED_INTEGER )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ADA||LA19_0==REGULAR_ID||LA19_0==DELIMITED_ID||LA19_0==INTRODUCER) ) {
                alt19=1;
            }
            else if ( (LA19_0==UNSIGNED_INTEGER) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:56:7: column_ref
                    {
                    pushFollow(FOLLOW_column_ref_in_sort_key364);
                    column_ref();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:57:7: UNSIGNED_INTEGER
                    {
                    match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_sort_key373); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, sort_key_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "sort_key"


    // $ANTLR start "ordering_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:59:1: ordering_spec : ( ASC | DESC );
    public final void ordering_spec() throws RecognitionException {
        int ordering_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:59:15: ( ASC | DESC )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
            {
            if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, ordering_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ordering_spec"


    // $ANTLR start "updatability_clause"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:63:1: updatability_clause : FOR ( READ ONLY | UPDATE ( OF column_name_list )? ) ;
    public final void updatability_clause() throws RecognitionException {
        int updatability_clause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:63:21: ( FOR ( READ ONLY | UPDATE ( OF column_name_list )? ) )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:64:5: FOR ( READ ONLY | UPDATE ( OF column_name_list )? )
            {
            match(input,FOR,FOLLOW_FOR_in_updatability_clause412); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:64:9: ( READ ONLY | UPDATE ( OF column_name_list )? )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==READ) ) {
                alt21=1;
            }
            else if ( (LA21_0==UPDATE) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:64:11: READ ONLY
                    {
                    match(input,READ,FOLLOW_READ_in_updatability_clause416); if (state.failed) return ;
                    match(input,ONLY,FOLLOW_ONLY_in_updatability_clause418); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:64:23: UPDATE ( OF column_name_list )?
                    {
                    match(input,UPDATE,FOLLOW_UPDATE_in_updatability_clause422); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:64:30: ( OF column_name_list )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==OF) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:64:31: OF column_name_list
                            {
                            match(input,OF,FOLLOW_OF_in_updatability_clause425); if (state.failed) return ;
                            pushFollow(FOLLOW_column_name_list_in_updatability_clause427);
                            column_name_list();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, updatability_clause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "updatability_clause"


    // $ANTLR start "insert_stmt"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:66:1: insert_stmt : INSERT INTO table_name insert_columns_and_source ;
    public final void insert_stmt() throws RecognitionException {
        int insert_stmt_StartIndex = input.index();
        DmlSQL2Parser.table_name_return table_name1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:66:13: ( INSERT INTO table_name insert_columns_and_source )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:67:5: INSERT INTO table_name insert_columns_and_source
            {
            match(input,INSERT,FOLLOW_INSERT_in_insert_stmt445); if (state.failed) return ;
            match(input,INTO,FOLLOW_INTO_in_insert_stmt447); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              inFrom=false;sqlinsertinfo=new InsertInfo();
            }
            pushFollow(FOLLOW_table_name_in_insert_stmt455);
            table_name1=table_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
              sqlinsertinfo.setInsertTableName((table_name1!=null?input.toString(table_name1.start,table_name1.stop):null));
            }
            pushFollow(FOLLOW_insert_columns_and_source_in_insert_stmt458);
            insert_columns_and_source();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, insert_stmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "insert_stmt"


    // $ANTLR start "insert_columns_and_source"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:70:1: insert_columns_and_source : ( ( LEFT_PAREN column_name_list RIGHT_PAREN )=> ( LEFT_PAREN column_name_list RIGHT_PAREN )? query_exp | query_exp | DEFAULT VALUES );
    public final void insert_columns_and_source() throws RecognitionException {
        int insert_columns_and_source_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:70:27: ( ( LEFT_PAREN column_name_list RIGHT_PAREN )=> ( LEFT_PAREN column_name_list RIGHT_PAREN )? query_exp | query_exp | DEFAULT VALUES )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:71:7: ( LEFT_PAREN column_name_list RIGHT_PAREN )=> ( LEFT_PAREN column_name_list RIGHT_PAREN )? query_exp
                    {
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:71:51: ( LEFT_PAREN column_name_list RIGHT_PAREN )?
                    int alt22=2;
                    alt22 = dfa22.predict(input);
                    switch (alt22) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:71:52: LEFT_PAREN column_name_list RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_insert_columns_and_source484); if (state.failed) return ;
                            pushFollow(FOLLOW_column_name_list_in_insert_columns_and_source486);
                            column_name_list();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_insert_columns_and_source488); if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_query_exp_in_insert_columns_and_source492);
                    query_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:73:7: query_exp
                    {
                    pushFollow(FOLLOW_query_exp_in_insert_columns_and_source506);
                    query_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:74:7: DEFAULT VALUES
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_columns_and_source515); if (state.failed) return ;
                    match(input,VALUES,FOLLOW_VALUES_in_insert_columns_and_source517); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, insert_columns_and_source_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "insert_columns_and_source"


    // $ANTLR start "update_stmt"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:76:1: update_stmt : UPDATE ( table_name SET set_clause_list ( WHERE ( search_condition | CURRENT OF dyn_cursor_name ) )? | SET set_clause_list WHERE CURRENT OF cursor_name ) ;
    public final void update_stmt() throws RecognitionException {
        int update_stmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:76:13: ( UPDATE ( table_name SET set_clause_list ( WHERE ( search_condition | CURRENT OF dyn_cursor_name ) )? | SET set_clause_list WHERE CURRENT OF cursor_name ) )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:77:7: UPDATE ( table_name SET set_clause_list ( WHERE ( search_condition | CURRENT OF dyn_cursor_name ) )? | SET set_clause_list WHERE CURRENT OF cursor_name )
            {
            match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt533); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:78:9: ( table_name SET set_clause_list ( WHERE ( search_condition | CURRENT OF dyn_cursor_name ) )? | SET set_clause_list WHERE CURRENT OF cursor_name )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ADA||LA26_0==MODULE||LA26_0==REGULAR_ID||LA26_0==DELIMITED_ID||LA26_0==INTRODUCER) ) {
                alt26=1;
            }
            else if ( (LA26_0==SET) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:78:11: table_name SET set_clause_list ( WHERE ( search_condition | CURRENT OF dyn_cursor_name ) )?
                    {
                    pushFollow(FOLLOW_table_name_in_update_stmt545);
                    table_name();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,SET,FOLLOW_SET_in_update_stmt547); if (state.failed) return ;
                    pushFollow(FOLLOW_set_clause_list_in_update_stmt549);
                    set_clause_list();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:78:42: ( WHERE ( search_condition | CURRENT OF dyn_cursor_name ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==WHERE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:78:44: WHERE ( search_condition | CURRENT OF dyn_cursor_name )
                            {
                            match(input,WHERE,FOLLOW_WHERE_in_update_stmt553); if (state.failed) return ;
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:78:50: ( search_condition | CURRENT OF dyn_cursor_name )
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( ((LA24_0>=UNSIGNED_INTEGER && LA24_0<=APPROXIMATE_NUM_LIT)||LA24_0==MINUS_SIGN||(LA24_0>=NATIONAL_CHAR_STRING_LIT && LA24_0<=EMBDD_VARIABLE_NAME)||LA24_0==ADA||LA24_0==AVG||LA24_0==BIT_LENGTH||(LA24_0>=CASE && LA24_0<=CAST)||(LA24_0>=CHAR && LA24_0<=CHAR_LENGTH)||(LA24_0>=CHARACTER_LENGTH && LA24_0<=COALESCE)||LA24_0==CONVERT||LA24_0==COUNT||LA24_0==CURRENT_DATE||(LA24_0>=CURRENT_TIME && LA24_0<=DATE)||LA24_0==DEFAULT||(LA24_0>=EXISTS && LA24_0<=EXTRACT)||LA24_0==INTERVAL||LA24_0==LOWER||(LA24_0>=MAX && LA24_0<=MIN)||(LA24_0>=NOT && LA24_0<=NULLIF)||LA24_0==OCTET_LENGTH||LA24_0==POSITION||LA24_0==SESSION_USER||(LA24_0>=SUBSTRING && LA24_0<=SYSTEM_USER)||(LA24_0>=TIME && LA24_0<=TIMESTAMP)||(LA24_0>=TRANSLATE && LA24_0<=TRIM)||LA24_0==UNIQUE||(LA24_0>=UPPER && LA24_0<=USER)||LA24_0==VALUE||(LA24_0>=REGULAR_ID && LA24_0<=EXACT_NUM_LIT)||(LA24_0>=CHAR_STRING && LA24_0<=DELIMITED_ID)||LA24_0==LEFT_PAREN||LA24_0==PLUS_SIGN||LA24_0==COLON||LA24_0==QUESTION_MARK||LA24_0==INTRODUCER) ) {
                                alt24=1;
                            }
                            else if ( (LA24_0==CURRENT) ) {
                                alt24=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 24, 0, input);

                                throw nvae;
                            }
                            switch (alt24) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:78:51: search_condition
                                    {
                                    pushFollow(FOLLOW_search_condition_in_update_stmt556);
                                    search_condition();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:78:68: CURRENT OF dyn_cursor_name
                                    {
                                    match(input,CURRENT,FOLLOW_CURRENT_in_update_stmt558); if (state.failed) return ;
                                    match(input,OF,FOLLOW_OF_in_update_stmt560); if (state.failed) return ;
                                    pushFollow(FOLLOW_dyn_cursor_name_in_update_stmt562);
                                    dyn_cursor_name();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:79:11: SET set_clause_list WHERE CURRENT OF cursor_name
                    {
                    match(input,SET,FOLLOW_SET_in_update_stmt581); if (state.failed) return ;
                    pushFollow(FOLLOW_set_clause_list_in_update_stmt583);
                    set_clause_list();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,WHERE,FOLLOW_WHERE_in_update_stmt585); if (state.failed) return ;
                    match(input,CURRENT,FOLLOW_CURRENT_in_update_stmt587); if (state.failed) return ;
                    match(input,OF,FOLLOW_OF_in_update_stmt589); if (state.failed) return ;
                    pushFollow(FOLLOW_cursor_name_in_update_stmt591);
                    cursor_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, update_stmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "update_stmt"


    // $ANTLR start "set_clause_list"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:82:1: set_clause_list : set_clause ( COMMA set_clause )* ;
    public final void set_clause_list() throws RecognitionException {
        int set_clause_list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:82:17: ( set_clause ( COMMA set_clause )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:83:5: set_clause ( COMMA set_clause )*
            {
            pushFollow(FOLLOW_set_clause_in_set_clause_list614);
            set_clause();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:83:16: ( COMMA set_clause )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==COMMA) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:83:17: COMMA set_clause
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_set_clause_list617); if (state.failed) return ;
            	    pushFollow(FOLLOW_set_clause_in_set_clause_list619);
            	    set_clause();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, set_clause_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "set_clause_list"


    // $ANTLR start "set_clause"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:85:1: set_clause : column_name EQUALS_OP update_source ;
    public final void set_clause() throws RecognitionException {
        int set_clause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:85:12: ( column_name EQUALS_OP update_source )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:86:5: column_name EQUALS_OP update_source
            {
            pushFollow(FOLLOW_column_name_in_set_clause635);
            column_name();

            state._fsp--;
            if (state.failed) return ;
            match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_set_clause637); if (state.failed) return ;
            pushFollow(FOLLOW_update_source_in_set_clause639);
            update_source();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, set_clause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "set_clause"


    // $ANTLR start "update_source"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:88:1: update_source : ( value_exp | NULL | DEFAULT );
    public final void update_source() throws RecognitionException {
        int update_source_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:88:15: ( value_exp | NULL | DEFAULT )
            int alt28=3;
            switch ( input.LA(1) ) {
            case UNSIGNED_INTEGER:
            case APPROXIMATE_NUM_LIT:
            case MINUS_SIGN:
            case NATIONAL_CHAR_STRING_LIT:
            case BIT_STRING_LIT:
            case HEX_STRING_LIT:
            case EMBDD_VARIABLE_NAME:
            case ADA:
            case AVG:
            case BIT_LENGTH:
            case CASE:
            case CAST:
            case CHAR:
            case CHAR_LENGTH:
            case CHARACTER_LENGTH:
            case COALESCE:
            case CONVERT:
            case COUNT:
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
            case CURRENT_USER:
            case DATE:
            case EXTRACT:
            case INTERVAL:
            case LOWER:
            case MAX:
            case MIN:
            case NULLIF:
            case OCTET_LENGTH:
            case POSITION:
            case SESSION_USER:
            case SUBSTRING:
            case SUM:
            case SYSTEM_USER:
            case TIME:
            case TIMESTAMP:
            case TRANSLATE:
            case TRIM:
            case UPPER:
            case USER:
            case VALUE:
            case REGULAR_ID:
            case EXACT_NUM_LIT:
            case CHAR_STRING:
            case DELIMITED_ID:
            case LEFT_PAREN:
            case PLUS_SIGN:
            case COLON:
            case QUESTION_MARK:
            case INTRODUCER:
                {
                alt28=1;
                }
                break;
            case NULL:
                {
                alt28=2;
                }
                break;
            case DEFAULT:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:89:7: value_exp
                    {
                    pushFollow(FOLLOW_value_exp_in_update_source655);
                    value_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:90:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_update_source664); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:91:7: DEFAULT
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_update_source673); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, update_source_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "update_source"


    // $ANTLR start "delete_stmt"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:93:1: delete_stmt : DELETE ( FROM table_name ( WHERE ( search_condition | CURRENT OF dyn_cursor_name ) )? | WHERE CURRENT OF cursor_name ) ;
    public final void delete_stmt() throws RecognitionException {
        int delete_stmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:93:13: ( DELETE ( FROM table_name ( WHERE ( search_condition | CURRENT OF dyn_cursor_name ) )? | WHERE CURRENT OF cursor_name ) )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:94:7: DELETE ( FROM table_name ( WHERE ( search_condition | CURRENT OF dyn_cursor_name ) )? | WHERE CURRENT OF cursor_name )
            {
            match(input,DELETE,FOLLOW_DELETE_in_delete_stmt690); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:95:9: ( FROM table_name ( WHERE ( search_condition | CURRENT OF dyn_cursor_name ) )? | WHERE CURRENT OF cursor_name )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==FROM) ) {
                alt31=1;
            }
            else if ( (LA31_0==WHERE) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:95:11: FROM table_name ( WHERE ( search_condition | CURRENT OF dyn_cursor_name ) )?
                    {
                    match(input,FROM,FOLLOW_FROM_in_delete_stmt702); if (state.failed) return ;
                    pushFollow(FOLLOW_table_name_in_delete_stmt704);
                    table_name();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:95:27: ( WHERE ( search_condition | CURRENT OF dyn_cursor_name ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==WHERE) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:95:29: WHERE ( search_condition | CURRENT OF dyn_cursor_name )
                            {
                            match(input,WHERE,FOLLOW_WHERE_in_delete_stmt708); if (state.failed) return ;
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:95:35: ( search_condition | CURRENT OF dyn_cursor_name )
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( ((LA29_0>=UNSIGNED_INTEGER && LA29_0<=APPROXIMATE_NUM_LIT)||LA29_0==MINUS_SIGN||(LA29_0>=NATIONAL_CHAR_STRING_LIT && LA29_0<=EMBDD_VARIABLE_NAME)||LA29_0==ADA||LA29_0==AVG||LA29_0==BIT_LENGTH||(LA29_0>=CASE && LA29_0<=CAST)||(LA29_0>=CHAR && LA29_0<=CHAR_LENGTH)||(LA29_0>=CHARACTER_LENGTH && LA29_0<=COALESCE)||LA29_0==CONVERT||LA29_0==COUNT||LA29_0==CURRENT_DATE||(LA29_0>=CURRENT_TIME && LA29_0<=DATE)||LA29_0==DEFAULT||(LA29_0>=EXISTS && LA29_0<=EXTRACT)||LA29_0==INTERVAL||LA29_0==LOWER||(LA29_0>=MAX && LA29_0<=MIN)||(LA29_0>=NOT && LA29_0<=NULLIF)||LA29_0==OCTET_LENGTH||LA29_0==POSITION||LA29_0==SESSION_USER||(LA29_0>=SUBSTRING && LA29_0<=SYSTEM_USER)||(LA29_0>=TIME && LA29_0<=TIMESTAMP)||(LA29_0>=TRANSLATE && LA29_0<=TRIM)||LA29_0==UNIQUE||(LA29_0>=UPPER && LA29_0<=USER)||LA29_0==VALUE||(LA29_0>=REGULAR_ID && LA29_0<=EXACT_NUM_LIT)||(LA29_0>=CHAR_STRING && LA29_0<=DELIMITED_ID)||LA29_0==LEFT_PAREN||LA29_0==PLUS_SIGN||LA29_0==COLON||LA29_0==QUESTION_MARK||LA29_0==INTRODUCER) ) {
                                alt29=1;
                            }
                            else if ( (LA29_0==CURRENT) ) {
                                alt29=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 29, 0, input);

                                throw nvae;
                            }
                            switch (alt29) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:95:36: search_condition
                                    {
                                    pushFollow(FOLLOW_search_condition_in_delete_stmt711);
                                    search_condition();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:95:53: CURRENT OF dyn_cursor_name
                                    {
                                    match(input,CURRENT,FOLLOW_CURRENT_in_delete_stmt713); if (state.failed) return ;
                                    match(input,OF,FOLLOW_OF_in_delete_stmt715); if (state.failed) return ;
                                    pushFollow(FOLLOW_dyn_cursor_name_in_delete_stmt717);
                                    dyn_cursor_name();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:96:11: WHERE CURRENT OF cursor_name
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_delete_stmt734); if (state.failed) return ;
                    match(input,CURRENT,FOLLOW_CURRENT_in_delete_stmt736); if (state.failed) return ;
                    match(input,OF,FOLLOW_OF_in_delete_stmt738); if (state.failed) return ;
                    pushFollow(FOLLOW_cursor_name_in_delete_stmt740);
                    cursor_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, delete_stmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "delete_stmt"


    // $ANTLR start "id"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:99:1: id : ( INTRODUCER char_set_name )? ( REGULAR_ID | DELIMITED_ID | {...}? non_reserved_word ) ;
    public final void id() throws RecognitionException {
        int id_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:99:4: ( ( INTRODUCER char_set_name )? ( REGULAR_ID | DELIMITED_ID | {...}? non_reserved_word ) )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:100:5: ( INTRODUCER char_set_name )? ( REGULAR_ID | DELIMITED_ID | {...}? non_reserved_word )
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:100:5: ( INTRODUCER char_set_name )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==INTRODUCER) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:100:6: INTRODUCER char_set_name
                    {
                    match(input,INTRODUCER,FOLLOW_INTRODUCER_in_id763); if (state.failed) return ;
                    pushFollow(FOLLOW_char_set_name_in_id765);
                    char_set_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:101:5: ( REGULAR_ID | DELIMITED_ID | {...}? non_reserved_word )
            int alt33=3;
            switch ( input.LA(1) ) {
            case REGULAR_ID:
                {
                alt33=1;
                }
                break;
            case DELIMITED_ID:
                {
                alt33=2;
                }
                break;
            case ADA:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:101:7: REGULAR_ID
                    {
                    match(input,REGULAR_ID,FOLLOW_REGULAR_ID_in_id776); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:102:7: DELIMITED_ID
                    {
                    match(input,DELIMITED_ID,FOLLOW_DELIMITED_ID_in_id784); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:103:7: {...}? non_reserved_word
                    {
                    if ( !((true)) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "id", "true");
                    }
                    pushFollow(FOLLOW_non_reserved_word_in_id795);
                    non_reserved_word();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, id_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "id"


    // $ANTLR start "char_set_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:106:1: char_set_name : id ( PERIOD id ( PERIOD id )? )? ;
    public final void char_set_name() throws RecognitionException {
        int char_set_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:106:14: ( id ( PERIOD id ( PERIOD id )? )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:106:16: id ( PERIOD id ( PERIOD id )? )?
            {
            pushFollow(FOLLOW_id_in_char_set_name810);
            id();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:106:19: ( PERIOD id ( PERIOD id )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==PERIOD) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:106:20: PERIOD id ( PERIOD id )?
                    {
                    match(input,PERIOD,FOLLOW_PERIOD_in_char_set_name813); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_char_set_name815);
                    id();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:106:30: ( PERIOD id )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==PERIOD) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:106:31: PERIOD id
                            {
                            match(input,PERIOD,FOLLOW_PERIOD_in_char_set_name818); if (state.failed) return ;
                            pushFollow(FOLLOW_id_in_char_set_name820);
                            id();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, char_set_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "char_set_name"


    // $ANTLR start "schema_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:108:1: schema_name : id ( PERIOD id )? ;
    public final void schema_name() throws RecognitionException {
        int schema_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:108:13: ( id ( PERIOD id )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:109:5: id ( PERIOD id )?
            {
            pushFollow(FOLLOW_id_in_schema_name836);
            id();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:109:8: ( PERIOD id )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==PERIOD) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:109:9: PERIOD id
                    {
                    match(input,PERIOD,FOLLOW_PERIOD_in_schema_name839); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_schema_name841);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, schema_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "schema_name"


    // $ANTLR start "qualified_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:111:1: qualified_name : id ( options {greedy=true; } : PERIOD id ( options {greedy=true; } : PERIOD id )? )? ;
    public final void qualified_name() throws RecognitionException {
        int qualified_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:111:16: ( id ( options {greedy=true; } : PERIOD id ( options {greedy=true; } : PERIOD id )? )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:112:5: id ( options {greedy=true; } : PERIOD id ( options {greedy=true; } : PERIOD id )? )?
            {
            pushFollow(FOLLOW_id_in_qualified_name856);
            id();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:112:8: ( options {greedy=true; } : PERIOD id ( options {greedy=true; } : PERIOD id )? )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==PERIOD) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==ADA||LA38_1==REGULAR_ID||LA38_1==DELIMITED_ID||LA38_1==INTRODUCER) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:112:31: PERIOD id ( options {greedy=true; } : PERIOD id )?
                    {
                    match(input,PERIOD,FOLLOW_PERIOD_in_qualified_name866); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_qualified_name868);
                    id();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:112:41: ( options {greedy=true; } : PERIOD id )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==PERIOD) ) {
                        int LA37_1 = input.LA(2);

                        if ( (LA37_1==ADA||LA37_1==REGULAR_ID||LA37_1==DELIMITED_ID||LA37_1==INTRODUCER) ) {
                            alt37=1;
                        }
                    }
                    switch (alt37) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:112:64: PERIOD id
                            {
                            match(input,PERIOD,FOLLOW_PERIOD_in_qualified_name878); if (state.failed) return ;
                            pushFollow(FOLLOW_id_in_qualified_name880);
                            id();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, qualified_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "qualified_name"


    // $ANTLR start "select_list"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:114:1: select_list : ( ASTERISK | select_sublist ( COMMA select_sublist )* );
    public final void select_list() throws RecognitionException {
        int select_list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:114:13: ( ASTERISK | select_sublist ( COMMA select_sublist )* )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ASTERISK) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=UNSIGNED_INTEGER && LA40_0<=APPROXIMATE_NUM_LIT)||LA40_0==MINUS_SIGN||(LA40_0>=NATIONAL_CHAR_STRING_LIT && LA40_0<=EMBDD_VARIABLE_NAME)||LA40_0==ADA||LA40_0==AVG||LA40_0==BIT_LENGTH||(LA40_0>=CASE && LA40_0<=CAST)||(LA40_0>=CHAR && LA40_0<=CHAR_LENGTH)||(LA40_0>=CHARACTER_LENGTH && LA40_0<=COALESCE)||LA40_0==CONVERT||LA40_0==COUNT||LA40_0==CURRENT_DATE||(LA40_0>=CURRENT_TIME && LA40_0<=DATE)||LA40_0==EXTRACT||LA40_0==INTERVAL||LA40_0==LOWER||(LA40_0>=MAX && LA40_0<=MIN)||LA40_0==MODULE||LA40_0==NULLIF||LA40_0==OCTET_LENGTH||LA40_0==POSITION||LA40_0==SESSION_USER||(LA40_0>=SUBSTRING && LA40_0<=SYSTEM_USER)||(LA40_0>=TIME && LA40_0<=TIMESTAMP)||(LA40_0>=TRANSLATE && LA40_0<=TRIM)||(LA40_0>=UPPER && LA40_0<=USER)||LA40_0==VALUE||(LA40_0>=REGULAR_ID && LA40_0<=EXACT_NUM_LIT)||(LA40_0>=CHAR_STRING && LA40_0<=DELIMITED_ID)||LA40_0==LEFT_PAREN||LA40_0==PLUS_SIGN||LA40_0==COLON||LA40_0==QUESTION_MARK||LA40_0==INTRODUCER) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:115:7: ASTERISK
                    {
                    match(input,ASTERISK,FOLLOW_ASTERISK_in_select_list900); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:116:7: select_sublist ( COMMA select_sublist )*
                    {
                    pushFollow(FOLLOW_select_sublist_in_select_list908);
                    select_sublist();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:116:22: ( COMMA select_sublist )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==COMMA) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:116:23: COMMA select_sublist
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_select_list911); if (state.failed) return ;
                    	    pushFollow(FOLLOW_select_sublist_in_select_list913);
                    	    select_sublist();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, select_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "select_list"

    public static class select_sublist_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "select_sublist"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:118:1: select_sublist : ( ( table_name PERIOD ASTERISK )=> table_name PERIOD ASTERISK | derived_column );
    public final DmlSQL2Parser.select_sublist_return select_sublist() throws RecognitionException {
        DmlSQL2Parser.select_sublist_return retval = new DmlSQL2Parser.select_sublist_return();
        retval.start = input.LT(1);
        int select_sublist_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:118:16: ( ( table_name PERIOD ASTERISK )=> table_name PERIOD ASTERISK | derived_column )
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:119:7: ( table_name PERIOD ASTERISK )=> table_name PERIOD ASTERISK
                    {
                    pushFollow(FOLLOW_table_name_in_select_sublist939);
                    table_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,PERIOD,FOLLOW_PERIOD_in_select_sublist941); if (state.failed) return retval;
                    match(input,ASTERISK,FOLLOW_ASTERISK_in_select_sublist943); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:120:7: derived_column
                    {
                    pushFollow(FOLLOW_derived_column_in_select_sublist951);
                    derived_column();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      if(inFrom==false){sqlinsertinfo.addSecondElem(input.toString(retval.start,input.LT(-1)));}
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, select_sublist_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "select_sublist"


    // $ANTLR start "derived_column"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:122:1: derived_column : value_exp ( ( AS )? column_name )? ;
    public final void derived_column() throws RecognitionException {
        int derived_column_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:122:16: ( value_exp ( ( AS )? column_name )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:123:5: value_exp ( ( AS )? column_name )?
            {
            pushFollow(FOLLOW_value_exp_in_derived_column965);
            value_exp();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:123:15: ( ( AS )? column_name )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ADA||LA43_0==AS||LA43_0==REGULAR_ID||LA43_0==DELIMITED_ID||LA43_0==INTRODUCER) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:123:16: ( AS )? column_name
                    {
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:123:16: ( AS )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==AS) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:123:17: AS
                            {
                            match(input,AS,FOLLOW_AS_in_derived_column969); if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_name_in_derived_column973);
                    column_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, derived_column_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "derived_column"


    // $ANTLR start "value_exp_primary"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:125:1: value_exp_primary : ( ( user_difine_function )=> user_difine_function | ( scalar_subquery )=> scalar_subquery | {...}? ( ( column_ref )=> column_ref | unsigned_value_spec ) | {...}? column_ref | set_fct_spec | case_exp | cast_spec | unsigned_value_spec | LEFT_PAREN value_exp RIGHT_PAREN );
    public final void value_exp_primary() throws RecognitionException {
        int value_exp_primary_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:125:19: ( ( user_difine_function )=> user_difine_function | ( scalar_subquery )=> scalar_subquery | {...}? ( ( column_ref )=> column_ref | unsigned_value_spec ) | {...}? column_ref | set_fct_spec | case_exp | cast_spec | unsigned_value_spec | LEFT_PAREN value_exp RIGHT_PAREN )
            int alt45=9;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:126:8: ( user_difine_function )=> user_difine_function
                    {
                    pushFollow(FOLLOW_user_difine_function_in_value_exp_primary995);
                    user_difine_function();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:127:6: ( scalar_subquery )=> scalar_subquery
                    {
                    pushFollow(FOLLOW_scalar_subquery_in_value_exp_primary1010);
                    scalar_subquery();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:128:7: {...}? ( ( column_ref )=> column_ref | unsigned_value_spec )
                    {
                    if ( !((input.LA(1) == INTRODUCER)) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "value_exp_primary", "input.LA(1) == INTRODUCER");
                    }
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:128:36: ( ( column_ref )=> column_ref | unsigned_value_spec )
                    int alt44=2;
                    alt44 = dfa44.predict(input);
                    switch (alt44) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:128:37: ( column_ref )=> column_ref
                            {
                            pushFollow(FOLLOW_column_ref_in_value_exp_primary1025);
                            column_ref();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:128:64: unsigned_value_spec
                            {
                            pushFollow(FOLLOW_unsigned_value_spec_in_value_exp_primary1029);
                            unsigned_value_spec();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:129:7: {...}? column_ref
                    {
                    if ( !((input.LA(1) != INTRODUCER)) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "value_exp_primary", "input.LA(1) != INTRODUCER");
                    }
                    pushFollow(FOLLOW_column_ref_in_value_exp_primary1040);
                    column_ref();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:130:7: set_fct_spec
                    {
                    pushFollow(FOLLOW_set_fct_spec_in_value_exp_primary1049);
                    set_fct_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:131:7: case_exp
                    {
                    pushFollow(FOLLOW_case_exp_in_value_exp_primary1057);
                    case_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:132:7: cast_spec
                    {
                    pushFollow(FOLLOW_cast_spec_in_value_exp_primary1066);
                    cast_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:134:7: unsigned_value_spec
                    {
                    pushFollow(FOLLOW_unsigned_value_spec_in_value_exp_primary1076);
                    unsigned_value_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:136:8: LEFT_PAREN value_exp RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_value_exp_primary1091); if (state.failed) return ;
                    pushFollow(FOLLOW_value_exp_in_value_exp_primary1093);
                    value_exp();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_value_exp_primary1095); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, value_exp_primary_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "value_exp_primary"


    // $ANTLR start "user_difine_function"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:139:1: user_difine_function : id LEFT_PAREN ( ( value_exp ( COMMA value_exp )* ) | order_by_clause )? RIGHT_PAREN ( OVER LEFT_PAREN PARTITION BY grouping_column_ref_list order_by_clause RIGHT_PAREN )? ;
    public final void user_difine_function() throws RecognitionException {
        int user_difine_function_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:139:21: ( id LEFT_PAREN ( ( value_exp ( COMMA value_exp )* ) | order_by_clause )? RIGHT_PAREN ( OVER LEFT_PAREN PARTITION BY grouping_column_ref_list order_by_clause RIGHT_PAREN )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:2: id LEFT_PAREN ( ( value_exp ( COMMA value_exp )* ) | order_by_clause )? RIGHT_PAREN ( OVER LEFT_PAREN PARTITION BY grouping_column_ref_list order_by_clause RIGHT_PAREN )?
            {
            pushFollow(FOLLOW_id_in_user_difine_function1105);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_user_difine_function1107); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:16: ( ( value_exp ( COMMA value_exp )* ) | order_by_clause )?
            int alt47=3;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:17: ( value_exp ( COMMA value_exp )* )
                    {
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:17: ( value_exp ( COMMA value_exp )* )
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:18: value_exp ( COMMA value_exp )*
                    {
                    pushFollow(FOLLOW_value_exp_in_user_difine_function1111);
                    value_exp();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:28: ( COMMA value_exp )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==COMMA) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:29: COMMA value_exp
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_user_difine_function1114); if (state.failed) return ;
                    	    pushFollow(FOLLOW_value_exp_in_user_difine_function1116);
                    	    value_exp();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:49: order_by_clause
                    {
                    pushFollow(FOLLOW_order_by_clause_in_user_difine_function1122);
                    order_by_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_user_difine_function1126); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:79: ( OVER LEFT_PAREN PARTITION BY grouping_column_ref_list order_by_clause RIGHT_PAREN )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==OVER) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:80: OVER LEFT_PAREN PARTITION BY grouping_column_ref_list order_by_clause RIGHT_PAREN
                    {
                    match(input,OVER,FOLLOW_OVER_in_user_difine_function1129); if (state.failed) return ;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_user_difine_function1131); if (state.failed) return ;
                    match(input,PARTITION,FOLLOW_PARTITION_in_user_difine_function1133); if (state.failed) return ;
                    match(input,BY,FOLLOW_BY_in_user_difine_function1135); if (state.failed) return ;
                    pushFollow(FOLLOW_grouping_column_ref_list_in_user_difine_function1137);
                    grouping_column_ref_list();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_order_by_clause_in_user_difine_function1139);
                    order_by_clause();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_user_difine_function1141); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, user_difine_function_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "user_difine_function"


    // $ANTLR start "set_fct_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:142:1: set_fct_spec : ( COUNT LEFT_PAREN ( ASTERISK | ( set_quantifier )? value_exp ) RIGHT_PAREN | ( AVG | MAX | MIN | SUM ) LEFT_PAREN ( set_quantifier )? value_exp RIGHT_PAREN );
    public final void set_fct_spec() throws RecognitionException {
        int set_fct_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:142:14: ( COUNT LEFT_PAREN ( ASTERISK | ( set_quantifier )? value_exp ) RIGHT_PAREN | ( AVG | MAX | MIN | SUM ) LEFT_PAREN ( set_quantifier )? value_exp RIGHT_PAREN )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==COUNT) ) {
                alt52=1;
            }
            else if ( (LA52_0==AVG||(LA52_0>=MAX && LA52_0<=MIN)||LA52_0==SUM) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:143:9: COUNT LEFT_PAREN ( ASTERISK | ( set_quantifier )? value_exp ) RIGHT_PAREN
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_set_fct_spec1160); if (state.failed) return ;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_set_fct_spec1162); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:143:26: ( ASTERISK | ( set_quantifier )? value_exp )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==ASTERISK) ) {
                        alt50=1;
                    }
                    else if ( ((LA50_0>=UNSIGNED_INTEGER && LA50_0<=APPROXIMATE_NUM_LIT)||LA50_0==MINUS_SIGN||(LA50_0>=NATIONAL_CHAR_STRING_LIT && LA50_0<=EMBDD_VARIABLE_NAME)||LA50_0==ADA||LA50_0==ALL||LA50_0==AVG||LA50_0==BIT_LENGTH||(LA50_0>=CASE && LA50_0<=CAST)||(LA50_0>=CHAR && LA50_0<=CHAR_LENGTH)||(LA50_0>=CHARACTER_LENGTH && LA50_0<=COALESCE)||LA50_0==CONVERT||LA50_0==COUNT||LA50_0==CURRENT_DATE||(LA50_0>=CURRENT_TIME && LA50_0<=DATE)||LA50_0==DISTINCT||LA50_0==EXTRACT||LA50_0==INTERVAL||LA50_0==LOWER||(LA50_0>=MAX && LA50_0<=MIN)||LA50_0==NULLIF||LA50_0==OCTET_LENGTH||LA50_0==POSITION||LA50_0==SESSION_USER||(LA50_0>=SUBSTRING && LA50_0<=SYSTEM_USER)||(LA50_0>=TIME && LA50_0<=TIMESTAMP)||(LA50_0>=TRANSLATE && LA50_0<=TRIM)||(LA50_0>=UPPER && LA50_0<=USER)||LA50_0==VALUE||(LA50_0>=REGULAR_ID && LA50_0<=EXACT_NUM_LIT)||(LA50_0>=CHAR_STRING && LA50_0<=DELIMITED_ID)||LA50_0==LEFT_PAREN||LA50_0==PLUS_SIGN||LA50_0==COLON||LA50_0==QUESTION_MARK||LA50_0==INTRODUCER) ) {
                        alt50=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:143:28: ASTERISK
                            {
                            match(input,ASTERISK,FOLLOW_ASTERISK_in_set_fct_spec1166); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:143:39: ( set_quantifier )? value_exp
                            {
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:143:39: ( set_quantifier )?
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==ALL||LA49_0==DISTINCT) ) {
                                alt49=1;
                            }
                            switch (alt49) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:143:40: set_quantifier
                                    {
                                    pushFollow(FOLLOW_set_quantifier_in_set_fct_spec1171);
                                    set_quantifier();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_value_exp_in_set_fct_spec1175);
                            value_exp();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_set_fct_spec1179); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:144:7: ( AVG | MAX | MIN | SUM ) LEFT_PAREN ( set_quantifier )? value_exp RIGHT_PAREN
                    {
                    if ( input.LA(1)==AVG||(input.LA(1)>=MAX && input.LA(1)<=MIN)||input.LA(1)==SUM ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_set_fct_spec1226); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:147:26: ( set_quantifier )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==ALL||LA51_0==DISTINCT) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:147:27: set_quantifier
                            {
                            pushFollow(FOLLOW_set_quantifier_in_set_fct_spec1229);
                            set_quantifier();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_value_exp_in_set_fct_spec1233);
                    value_exp();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_set_fct_spec1235); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, set_fct_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "set_fct_spec"


    // $ANTLR start "set_quantifier"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:149:1: set_quantifier : ( DISTINCT | ALL );
    public final void set_quantifier() throws RecognitionException {
        int set_quantifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:149:16: ( DISTINCT | ALL )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
            {
            if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, set_quantifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "set_quantifier"


    // $ANTLR start "case_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:153:1: case_exp : ( case_abbreviation | case_spec );
    public final void case_exp() throws RecognitionException {
        int case_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:153:10: ( case_abbreviation | case_spec )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==COALESCE||LA53_0==NULLIF) ) {
                alt53=1;
            }
            else if ( (LA53_0==CASE) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:154:7: case_abbreviation
                    {
                    pushFollow(FOLLOW_case_abbreviation_in_case_exp1277);
                    case_abbreviation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:155:7: case_spec
                    {
                    pushFollow(FOLLOW_case_spec_in_case_exp1286);
                    case_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, case_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "case_exp"


    // $ANTLR start "case_abbreviation"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:157:1: case_abbreviation : ( NULLIF LEFT_PAREN value_exp COMMA value_exp RIGHT_PAREN | COALESCE LEFT_PAREN value_exp ( COMMA value_exp )* RIGHT_PAREN );
    public final void case_abbreviation() throws RecognitionException {
        int case_abbreviation_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:157:19: ( NULLIF LEFT_PAREN value_exp COMMA value_exp RIGHT_PAREN | COALESCE LEFT_PAREN value_exp ( COMMA value_exp )* RIGHT_PAREN )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==NULLIF) ) {
                alt55=1;
            }
            else if ( (LA55_0==COALESCE) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:158:7: NULLIF LEFT_PAREN value_exp COMMA value_exp RIGHT_PAREN
                    {
                    match(input,NULLIF,FOLLOW_NULLIF_in_case_abbreviation1302); if (state.failed) return ;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation1304); if (state.failed) return ;
                    pushFollow(FOLLOW_value_exp_in_case_abbreviation1306);
                    value_exp();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation1308); if (state.failed) return ;
                    pushFollow(FOLLOW_value_exp_in_case_abbreviation1310);
                    value_exp();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation1312); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:159:7: COALESCE LEFT_PAREN value_exp ( COMMA value_exp )* RIGHT_PAREN
                    {
                    match(input,COALESCE,FOLLOW_COALESCE_in_case_abbreviation1321); if (state.failed) return ;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation1323); if (state.failed) return ;
                    pushFollow(FOLLOW_value_exp_in_case_abbreviation1325);
                    value_exp();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:159:37: ( COMMA value_exp )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==COMMA) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:159:38: COMMA value_exp
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation1328); if (state.failed) return ;
                    	    pushFollow(FOLLOW_value_exp_in_case_abbreviation1330);
                    	    value_exp();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation1334); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, case_abbreviation_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "case_abbreviation"


    // $ANTLR start "case_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:162:1: case_spec : ( simple_case | searched_case );
    public final void case_spec() throws RecognitionException {
        int case_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:162:11: ( simple_case | searched_case )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==CASE) ) {
                int LA56_1 = input.LA(2);

                if ( ((LA56_1>=UNSIGNED_INTEGER && LA56_1<=APPROXIMATE_NUM_LIT)||LA56_1==MINUS_SIGN||(LA56_1>=NATIONAL_CHAR_STRING_LIT && LA56_1<=EMBDD_VARIABLE_NAME)||LA56_1==ADA||LA56_1==AVG||LA56_1==BIT_LENGTH||(LA56_1>=CASE && LA56_1<=CAST)||(LA56_1>=CHAR && LA56_1<=CHAR_LENGTH)||(LA56_1>=CHARACTER_LENGTH && LA56_1<=COALESCE)||LA56_1==CONVERT||LA56_1==COUNT||LA56_1==CURRENT_DATE||(LA56_1>=CURRENT_TIME && LA56_1<=DATE)||LA56_1==EXTRACT||LA56_1==INTERVAL||LA56_1==LOWER||(LA56_1>=MAX && LA56_1<=MIN)||LA56_1==NULLIF||LA56_1==OCTET_LENGTH||LA56_1==POSITION||LA56_1==SESSION_USER||(LA56_1>=SUBSTRING && LA56_1<=SYSTEM_USER)||(LA56_1>=TIME && LA56_1<=TIMESTAMP)||(LA56_1>=TRANSLATE && LA56_1<=TRIM)||(LA56_1>=UPPER && LA56_1<=USER)||LA56_1==VALUE||(LA56_1>=REGULAR_ID && LA56_1<=EXACT_NUM_LIT)||(LA56_1>=CHAR_STRING && LA56_1<=DELIMITED_ID)||LA56_1==LEFT_PAREN||LA56_1==PLUS_SIGN||LA56_1==COLON||LA56_1==QUESTION_MARK||LA56_1==INTRODUCER) ) {
                    alt56=1;
                }
                else if ( (LA56_1==WHEN) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:163:7: simple_case
                    {
                    pushFollow(FOLLOW_simple_case_in_case_spec1351);
                    simple_case();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:164:7: searched_case
                    {
                    pushFollow(FOLLOW_searched_case_in_case_spec1360);
                    searched_case();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, case_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "case_spec"


    // $ANTLR start "simple_case"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:166:1: simple_case : CASE value_exp ( simple_when_clause )+ ( else_clause )? END ;
    public final void simple_case() throws RecognitionException {
        int simple_case_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:166:13: ( CASE value_exp ( simple_when_clause )+ ( else_clause )? END )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:167:5: CASE value_exp ( simple_when_clause )+ ( else_clause )? END
            {
            match(input,CASE,FOLLOW_CASE_in_simple_case1374); if (state.failed) return ;
            pushFollow(FOLLOW_value_exp_in_simple_case1376);
            value_exp();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:167:20: ( simple_when_clause )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==WHEN) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:167:21: simple_when_clause
            	    {
            	    pushFollow(FOLLOW_simple_when_clause_in_simple_case1379);
            	    simple_when_clause();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:167:42: ( else_clause )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ELSE) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:167:43: else_clause
                    {
                    pushFollow(FOLLOW_else_clause_in_simple_case1384);
                    else_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,END,FOLLOW_END_in_simple_case1388); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, simple_case_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "simple_case"


    // $ANTLR start "simple_when_clause"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:169:1: simple_when_clause : WHEN value_exp THEN result ;
    public final void simple_when_clause() throws RecognitionException {
        int simple_when_clause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:169:20: ( WHEN value_exp THEN result )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:170:5: WHEN value_exp THEN result
            {
            match(input,WHEN,FOLLOW_WHEN_in_simple_when_clause1402); if (state.failed) return ;
            pushFollow(FOLLOW_value_exp_in_simple_when_clause1404);
            value_exp();

            state._fsp--;
            if (state.failed) return ;
            match(input,THEN,FOLLOW_THEN_in_simple_when_clause1406); if (state.failed) return ;
            pushFollow(FOLLOW_result_in_simple_when_clause1408);
            result();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, simple_when_clause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "simple_when_clause"


    // $ANTLR start "else_clause"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:172:1: else_clause : ELSE result ;
    public final void else_clause() throws RecognitionException {
        int else_clause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:172:13: ( ELSE result )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:173:5: ELSE result
            {
            match(input,ELSE,FOLLOW_ELSE_in_else_clause1422); if (state.failed) return ;
            pushFollow(FOLLOW_result_in_else_clause1424);
            result();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, else_clause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "else_clause"


    // $ANTLR start "result"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:175:1: result : ( value_exp | NULL );
    public final void result() throws RecognitionException {
        int result_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:175:8: ( value_exp | NULL )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=UNSIGNED_INTEGER && LA59_0<=APPROXIMATE_NUM_LIT)||LA59_0==MINUS_SIGN||(LA59_0>=NATIONAL_CHAR_STRING_LIT && LA59_0<=EMBDD_VARIABLE_NAME)||LA59_0==ADA||LA59_0==AVG||LA59_0==BIT_LENGTH||(LA59_0>=CASE && LA59_0<=CAST)||(LA59_0>=CHAR && LA59_0<=CHAR_LENGTH)||(LA59_0>=CHARACTER_LENGTH && LA59_0<=COALESCE)||LA59_0==CONVERT||LA59_0==COUNT||LA59_0==CURRENT_DATE||(LA59_0>=CURRENT_TIME && LA59_0<=DATE)||LA59_0==EXTRACT||LA59_0==INTERVAL||LA59_0==LOWER||(LA59_0>=MAX && LA59_0<=MIN)||LA59_0==NULLIF||LA59_0==OCTET_LENGTH||LA59_0==POSITION||LA59_0==SESSION_USER||(LA59_0>=SUBSTRING && LA59_0<=SYSTEM_USER)||(LA59_0>=TIME && LA59_0<=TIMESTAMP)||(LA59_0>=TRANSLATE && LA59_0<=TRIM)||(LA59_0>=UPPER && LA59_0<=USER)||LA59_0==VALUE||(LA59_0>=REGULAR_ID && LA59_0<=EXACT_NUM_LIT)||(LA59_0>=CHAR_STRING && LA59_0<=DELIMITED_ID)||LA59_0==LEFT_PAREN||LA59_0==PLUS_SIGN||LA59_0==COLON||LA59_0==QUESTION_MARK||LA59_0==INTRODUCER) ) {
                alt59=1;
            }
            else if ( (LA59_0==NULL) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:176:7: value_exp
                    {
                    pushFollow(FOLLOW_value_exp_in_result1440);
                    value_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:177:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_result1450); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, result_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "result"


    // $ANTLR start "searched_case"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:180:1: searched_case : CASE ( searched_when_clause )+ ( else_clause )? END ;
    public final void searched_case() throws RecognitionException {
        int searched_case_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:180:15: ( CASE ( searched_when_clause )+ ( else_clause )? END )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:181:5: CASE ( searched_when_clause )+ ( else_clause )? END
            {
            match(input,CASE,FOLLOW_CASE_in_searched_case1465); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:181:10: ( searched_when_clause )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==WHEN) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:181:11: searched_when_clause
            	    {
            	    pushFollow(FOLLOW_searched_when_clause_in_searched_case1468);
            	    searched_when_clause();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:181:34: ( else_clause )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==ELSE) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:181:35: else_clause
                    {
                    pushFollow(FOLLOW_else_clause_in_searched_case1473);
                    else_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,END,FOLLOW_END_in_searched_case1477); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, searched_case_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "searched_case"


    // $ANTLR start "searched_when_clause"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:183:1: searched_when_clause : WHEN search_condition THEN result ;
    public final void searched_when_clause() throws RecognitionException {
        int searched_when_clause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:183:22: ( WHEN search_condition THEN result )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:184:5: WHEN search_condition THEN result
            {
            match(input,WHEN,FOLLOW_WHEN_in_searched_when_clause1491); if (state.failed) return ;
            pushFollow(FOLLOW_search_condition_in_searched_when_clause1493);
            search_condition();

            state._fsp--;
            if (state.failed) return ;
            match(input,THEN,FOLLOW_THEN_in_searched_when_clause1495); if (state.failed) return ;
            pushFollow(FOLLOW_result_in_searched_when_clause1497);
            result();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, searched_when_clause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "searched_when_clause"


    // $ANTLR start "search_condition"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:186:1: search_condition : boolean_term ( boolean_term_op boolean_term )* ;
    public final void search_condition() throws RecognitionException {
        int search_condition_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:186:18: ( boolean_term ( boolean_term_op boolean_term )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:187:5: boolean_term ( boolean_term_op boolean_term )*
            {
            pushFollow(FOLLOW_boolean_term_in_search_condition1511);
            boolean_term();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:187:18: ( boolean_term_op boolean_term )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==OR) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:187:19: boolean_term_op boolean_term
            	    {
            	    pushFollow(FOLLOW_boolean_term_op_in_search_condition1514);
            	    boolean_term_op();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_boolean_term_in_search_condition1516);
            	    boolean_term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, search_condition_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "search_condition"


    // $ANTLR start "boolean_term_op"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:189:1: boolean_term_op : OR ;
    public final void boolean_term_op() throws RecognitionException {
        int boolean_term_op_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:189:17: ( OR )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:190:5: OR
            {
            match(input,OR,FOLLOW_OR_in_boolean_term_op1531); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, boolean_term_op_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "boolean_term_op"


    // $ANTLR start "boolean_term"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:192:1: boolean_term : boolean_factor ( boolean_factor_op boolean_factor )* ;
    public final void boolean_term() throws RecognitionException {
        int boolean_term_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:192:14: ( boolean_factor ( boolean_factor_op boolean_factor )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:193:5: boolean_factor ( boolean_factor_op boolean_factor )*
            {
            pushFollow(FOLLOW_boolean_factor_in_boolean_term1545);
            boolean_factor();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:193:20: ( boolean_factor_op boolean_factor )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==AND) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:193:21: boolean_factor_op boolean_factor
            	    {
            	    pushFollow(FOLLOW_boolean_factor_op_in_boolean_term1548);
            	    boolean_factor_op();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_boolean_factor_in_boolean_term1550);
            	    boolean_factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, boolean_term_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "boolean_term"


    // $ANTLR start "boolean_factor_op"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:195:1: boolean_factor_op : AND ;
    public final void boolean_factor_op() throws RecognitionException {
        int boolean_factor_op_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:195:19: ( AND )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:196:5: AND
            {
            match(input,AND,FOLLOW_AND_in_boolean_factor_op1565); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, boolean_factor_op_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "boolean_factor_op"


    // $ANTLR start "boolean_factor"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:198:1: boolean_factor : ( NOT )? boolean_test ;
    public final void boolean_factor() throws RecognitionException {
        int boolean_factor_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:198:16: ( ( NOT )? boolean_test )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:199:5: ( NOT )? boolean_test
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:199:5: ( NOT )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==NOT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:199:6: NOT
                    {
                    match(input,NOT,FOLLOW_NOT_in_boolean_factor1580); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_boolean_test_in_boolean_factor1584);
            boolean_test();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, boolean_factor_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "boolean_factor"


    // $ANTLR start "boolean_test"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:201:1: boolean_test : boolean_primary ( IS ( NOT )? truth_value )? ;
    public final void boolean_test() throws RecognitionException {
        int boolean_test_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:201:14: ( boolean_primary ( IS ( NOT )? truth_value )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:202:5: boolean_primary ( IS ( NOT )? truth_value )?
            {
            pushFollow(FOLLOW_boolean_primary_in_boolean_test1598);
            boolean_primary();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:202:21: ( IS ( NOT )? truth_value )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==IS) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:202:22: IS ( NOT )? truth_value
                    {
                    match(input,IS,FOLLOW_IS_in_boolean_test1601); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:202:25: ( NOT )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==NOT) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:202:26: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_boolean_test1604); if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_truth_value_in_boolean_test1608);
                    truth_value();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, boolean_test_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "boolean_test"


    // $ANTLR start "truth_value"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:204:1: truth_value : ( TRUE | FALSE | UNKNOWN );
    public final void truth_value() throws RecognitionException {
        int truth_value_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:204:13: ( TRUE | FALSE | UNKNOWN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
            {
            if ( input.LA(1)==FALSE||input.LA(1)==TRUE||input.LA(1)==UNKNOWN ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, truth_value_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "truth_value"


    // $ANTLR start "boolean_primary"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:209:1: boolean_primary : ( ( predicate )=> predicate | LEFT_PAREN search_condition RIGHT_PAREN );
    public final void boolean_primary() throws RecognitionException {
        int boolean_primary_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:209:17: ( ( predicate )=> predicate | LEFT_PAREN search_condition RIGHT_PAREN )
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:210:7: ( predicate )=> predicate
                    {
                    pushFollow(FOLLOW_predicate_in_boolean_primary1665);
                    predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:211:7: LEFT_PAREN search_condition RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_boolean_primary1674); if (state.failed) return ;
                    pushFollow(FOLLOW_search_condition_in_boolean_primary1676);
                    search_condition();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_boolean_primary1678); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, boolean_primary_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "boolean_primary"


    // $ANTLR start "predicate"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:213:1: predicate : ( row_value_constructor ( comp_predicate | ( NOT )? ( between_predicate | in_predicate | like_predicate ) | null_predicate | quantified_comp_predicate | match_predicate | overlaps_predicate ) | exists_predicate | unique_predicate );
    public final void predicate() throws RecognitionException {
        int predicate_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:213:11: ( row_value_constructor ( comp_predicate | ( NOT )? ( between_predicate | in_predicate | like_predicate ) | null_predicate | quantified_comp_predicate | match_predicate | overlaps_predicate ) | exists_predicate | unique_predicate )
            int alt71=3;
            switch ( input.LA(1) ) {
            case UNSIGNED_INTEGER:
            case APPROXIMATE_NUM_LIT:
            case MINUS_SIGN:
            case NATIONAL_CHAR_STRING_LIT:
            case BIT_STRING_LIT:
            case HEX_STRING_LIT:
            case EMBDD_VARIABLE_NAME:
            case ADA:
            case AVG:
            case BIT_LENGTH:
            case CASE:
            case CAST:
            case CHAR:
            case CHAR_LENGTH:
            case CHARACTER_LENGTH:
            case COALESCE:
            case CONVERT:
            case COUNT:
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
            case CURRENT_USER:
            case DATE:
            case DEFAULT:
            case EXTRACT:
            case INTERVAL:
            case LOWER:
            case MAX:
            case MIN:
            case NULL:
            case NULLIF:
            case OCTET_LENGTH:
            case POSITION:
            case SESSION_USER:
            case SUBSTRING:
            case SUM:
            case SYSTEM_USER:
            case TIME:
            case TIMESTAMP:
            case TRANSLATE:
            case TRIM:
            case UPPER:
            case USER:
            case VALUE:
            case REGULAR_ID:
            case EXACT_NUM_LIT:
            case CHAR_STRING:
            case DELIMITED_ID:
            case LEFT_PAREN:
            case PLUS_SIGN:
            case COLON:
            case QUESTION_MARK:
            case INTRODUCER:
                {
                alt71=1;
                }
                break;
            case EXISTS:
                {
                alt71=2;
                }
                break;
            case UNIQUE:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:214:7: row_value_constructor ( comp_predicate | ( NOT )? ( between_predicate | in_predicate | like_predicate ) | null_predicate | quantified_comp_predicate | match_predicate | overlaps_predicate )
                    {
                    pushFollow(FOLLOW_row_value_constructor_in_predicate1694);
                    row_value_constructor();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:215:9: ( comp_predicate | ( NOT )? ( between_predicate | in_predicate | like_predicate ) | null_predicate | quantified_comp_predicate | match_predicate | overlaps_predicate )
                    int alt70=6;
                    switch ( input.LA(1) ) {
                    case NOT_EQUALS_OP:
                    case LESS_THAN_OR_EQUALS_OP:
                    case GREATER_THAN_OR_EQUALS_OP:
                    case LESS_THAN_OP:
                    case EQUALS_OP:
                    case GREATER_THAN_OP:
                        {
                        int LA70_1 = input.LA(2);

                        if ( ((LA70_1>=UNSIGNED_INTEGER && LA70_1<=APPROXIMATE_NUM_LIT)||LA70_1==MINUS_SIGN||(LA70_1>=NATIONAL_CHAR_STRING_LIT && LA70_1<=EMBDD_VARIABLE_NAME)||LA70_1==ADA||LA70_1==AVG||LA70_1==BIT_LENGTH||(LA70_1>=CASE && LA70_1<=CAST)||(LA70_1>=CHAR && LA70_1<=CHAR_LENGTH)||(LA70_1>=CHARACTER_LENGTH && LA70_1<=COALESCE)||LA70_1==CONVERT||LA70_1==COUNT||LA70_1==CURRENT_DATE||(LA70_1>=CURRENT_TIME && LA70_1<=DATE)||LA70_1==DEFAULT||LA70_1==EXTRACT||LA70_1==INTERVAL||LA70_1==LOWER||(LA70_1>=MAX && LA70_1<=MIN)||(LA70_1>=NULL && LA70_1<=NULLIF)||LA70_1==OCTET_LENGTH||LA70_1==POSITION||LA70_1==SESSION_USER||(LA70_1>=SUBSTRING && LA70_1<=SYSTEM_USER)||(LA70_1>=TIME && LA70_1<=TIMESTAMP)||(LA70_1>=TRANSLATE && LA70_1<=TRIM)||(LA70_1>=UPPER && LA70_1<=USER)||LA70_1==VALUE||(LA70_1>=REGULAR_ID && LA70_1<=EXACT_NUM_LIT)||(LA70_1>=CHAR_STRING && LA70_1<=DELIMITED_ID)||LA70_1==LEFT_PAREN||LA70_1==PLUS_SIGN||LA70_1==COLON||LA70_1==QUESTION_MARK||LA70_1==INTRODUCER) ) {
                            alt70=1;
                        }
                        else if ( (LA70_1==ALL||LA70_1==ANY||LA70_1==SOME) ) {
                            alt70=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 70, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case BETWEEN:
                    case IN:
                    case LIKE:
                    case NOT:
                        {
                        alt70=2;
                        }
                        break;
                    case IS:
                        {
                        alt70=3;
                        }
                        break;
                    case MATCH:
                        {
                        alt70=5;
                        }
                        break;
                    case OVERLAPS:
                        {
                        alt70=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }

                    switch (alt70) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:215:11: comp_predicate
                            {
                            pushFollow(FOLLOW_comp_predicate_in_predicate1707);
                            comp_predicate();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:216:11: ( NOT )? ( between_predicate | in_predicate | like_predicate )
                            {
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:216:11: ( NOT )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==NOT) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:216:12: NOT
                                    {
                                    match(input,NOT,FOLLOW_NOT_in_predicate1720); if (state.failed) return ;

                                    }
                                    break;

                            }

                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:216:18: ( between_predicate | in_predicate | like_predicate )
                            int alt69=3;
                            switch ( input.LA(1) ) {
                            case BETWEEN:
                                {
                                alt69=1;
                                }
                                break;
                            case IN:
                                {
                                alt69=2;
                                }
                                break;
                            case LIKE:
                                {
                                alt69=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 69, 0, input);

                                throw nvae;
                            }

                            switch (alt69) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:216:20: between_predicate
                                    {
                                    pushFollow(FOLLOW_between_predicate_in_predicate1726);
                                    between_predicate();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:217:22: in_predicate
                                    {
                                    pushFollow(FOLLOW_in_predicate_in_predicate1750);
                                    in_predicate();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;
                                case 3 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:218:22: like_predicate
                                    {
                                    pushFollow(FOLLOW_like_predicate_in_predicate1774);
                                    like_predicate();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:220:11: null_predicate
                            {
                            pushFollow(FOLLOW_null_predicate_in_predicate1808);
                            null_predicate();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 4 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:221:11: quantified_comp_predicate
                            {
                            pushFollow(FOLLOW_quantified_comp_predicate_in_predicate1821);
                            quantified_comp_predicate();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 5 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:222:11: match_predicate
                            {
                            pushFollow(FOLLOW_match_predicate_in_predicate1834);
                            match_predicate();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 6 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:223:11: overlaps_predicate
                            {
                            pushFollow(FOLLOW_overlaps_predicate_in_predicate1847);
                            overlaps_predicate();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:225:7: exists_predicate
                    {
                    pushFollow(FOLLOW_exists_predicate_in_predicate1867);
                    exists_predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:226:7: unique_predicate
                    {
                    pushFollow(FOLLOW_unique_predicate_in_predicate1876);
                    unique_predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, predicate_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "predicate"


    // $ANTLR start "comp_predicate"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:228:1: comp_predicate : comp_op row_value_constructor ;
    public final void comp_predicate() throws RecognitionException {
        int comp_predicate_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:228:16: ( comp_op row_value_constructor )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:229:5: comp_op row_value_constructor
            {
            pushFollow(FOLLOW_comp_op_in_comp_predicate1890);
            comp_op();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_row_value_constructor_in_comp_predicate1892);
            row_value_constructor();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, comp_predicate_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "comp_predicate"


    // $ANTLR start "comp_op"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:231:1: comp_op : ( EQUALS_OP | NOT_EQUALS_OP | LESS_THAN_OP | GREATER_THAN_OP | LESS_THAN_OR_EQUALS_OP | GREATER_THAN_OR_EQUALS_OP );
    public final void comp_op() throws RecognitionException {
        int comp_op_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:231:9: ( EQUALS_OP | NOT_EQUALS_OP | LESS_THAN_OP | GREATER_THAN_OP | LESS_THAN_OR_EQUALS_OP | GREATER_THAN_OR_EQUALS_OP )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
            {
            if ( (input.LA(1)>=NOT_EQUALS_OP && input.LA(1)<=GREATER_THAN_OR_EQUALS_OP)||(input.LA(1)>=LESS_THAN_OP && input.LA(1)<=GREATER_THAN_OP) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, comp_op_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "comp_op"


    // $ANTLR start "between_predicate"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:239:1: between_predicate : BETWEEN row_value_constructor AND row_value_constructor ;
    public final void between_predicate() throws RecognitionException {
        int between_predicate_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:239:19: ( BETWEEN row_value_constructor AND row_value_constructor )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:240:5: BETWEEN row_value_constructor AND row_value_constructor
            {
            match(input,BETWEEN,FOLLOW_BETWEEN_in_between_predicate1964); if (state.failed) return ;
            pushFollow(FOLLOW_row_value_constructor_in_between_predicate1966);
            row_value_constructor();

            state._fsp--;
            if (state.failed) return ;
            match(input,AND,FOLLOW_AND_in_between_predicate1968); if (state.failed) return ;
            pushFollow(FOLLOW_row_value_constructor_in_between_predicate1970);
            row_value_constructor();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, between_predicate_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "between_predicate"


    // $ANTLR start "in_predicate"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:242:1: in_predicate : IN in_predicate_value ;
    public final void in_predicate() throws RecognitionException {
        int in_predicate_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:242:14: ( IN in_predicate_value )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:243:5: IN in_predicate_value
            {
            match(input,IN,FOLLOW_IN_in_in_predicate1984); if (state.failed) return ;
            pushFollow(FOLLOW_in_predicate_value_in_in_predicate1986);
            in_predicate_value();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, in_predicate_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "in_predicate"


    // $ANTLR start "in_predicate_value"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:245:1: in_predicate_value : ( ( table_subquery )=> table_subquery | LEFT_PAREN in_value_list RIGHT_PAREN );
    public final void in_predicate_value() throws RecognitionException {
        int in_predicate_value_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:245:20: ( ( table_subquery )=> table_subquery | LEFT_PAREN in_value_list RIGHT_PAREN )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==LEFT_PAREN) ) {
                int LA72_1 = input.LA(2);

                if ( (synpred105_DmlSQL2Parser()) ) {
                    alt72=1;
                }
                else if ( (true) ) {
                    alt72=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:246:7: ( table_subquery )=> table_subquery
                    {
                    pushFollow(FOLLOW_table_subquery_in_in_predicate_value2007);
                    table_subquery();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:247:7: LEFT_PAREN in_value_list RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_in_predicate_value2015); if (state.failed) return ;
                    pushFollow(FOLLOW_in_value_list_in_in_predicate_value2017);
                    in_value_list();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_in_predicate_value2019); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, in_predicate_value_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "in_predicate_value"


    // $ANTLR start "in_value_list"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:249:1: in_value_list : value_exp ( COMMA value_exp )* ;
    public final void in_value_list() throws RecognitionException {
        int in_value_list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:249:15: ( value_exp ( COMMA value_exp )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:250:5: value_exp ( COMMA value_exp )*
            {
            pushFollow(FOLLOW_value_exp_in_in_value_list2033);
            value_exp();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:250:15: ( COMMA value_exp )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==COMMA) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:250:16: COMMA value_exp
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_in_value_list2036); if (state.failed) return ;
            	    pushFollow(FOLLOW_value_exp_in_in_value_list2038);
            	    value_exp();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, in_value_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "in_value_list"


    // $ANTLR start "like_predicate"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:252:1: like_predicate : LIKE pattern ( ESCAPE escape_char )? ;
    public final void like_predicate() throws RecognitionException {
        int like_predicate_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:252:16: ( LIKE pattern ( ESCAPE escape_char )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:253:5: LIKE pattern ( ESCAPE escape_char )?
            {
            match(input,LIKE,FOLLOW_LIKE_in_like_predicate2054); if (state.failed) return ;
            pushFollow(FOLLOW_pattern_in_like_predicate2056);
            pattern();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:253:18: ( ESCAPE escape_char )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==ESCAPE) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:253:19: ESCAPE escape_char
                    {
                    match(input,ESCAPE,FOLLOW_ESCAPE_in_like_predicate2059); if (state.failed) return ;
                    pushFollow(FOLLOW_escape_char_in_like_predicate2061);
                    escape_char();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, like_predicate_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "like_predicate"


    // $ANTLR start "pattern"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:255:1: pattern : char_value_exp ;
    public final void pattern() throws RecognitionException {
        int pattern_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:255:9: ( char_value_exp )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:256:5: char_value_exp
            {
            pushFollow(FOLLOW_char_value_exp_in_pattern2077);
            char_value_exp();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, pattern_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "pattern"


    // $ANTLR start "escape_char"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:258:1: escape_char : char_value_exp ;
    public final void escape_char() throws RecognitionException {
        int escape_char_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:258:13: ( char_value_exp )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:259:5: char_value_exp
            {
            pushFollow(FOLLOW_char_value_exp_in_escape_char2091);
            char_value_exp();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, escape_char_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "escape_char"


    // $ANTLR start "null_predicate"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:261:1: null_predicate : IS ( NOT )? NULL ;
    public final void null_predicate() throws RecognitionException {
        int null_predicate_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:261:16: ( IS ( NOT )? NULL )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:262:5: IS ( NOT )? NULL
            {
            match(input,IS,FOLLOW_IS_in_null_predicate2105); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:262:8: ( NOT )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==NOT) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:262:9: NOT
                    {
                    match(input,NOT,FOLLOW_NOT_in_null_predicate2108); if (state.failed) return ;

                    }
                    break;

            }

            match(input,NULL,FOLLOW_NULL_in_null_predicate2112); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, null_predicate_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "null_predicate"


    // $ANTLR start "quantified_comp_predicate"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:264:1: quantified_comp_predicate : comp_op ( ALL | SOME | ANY ) table_subquery ;
    public final void quantified_comp_predicate() throws RecognitionException {
        int quantified_comp_predicate_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:264:27: ( comp_op ( ALL | SOME | ANY ) table_subquery )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:265:5: comp_op ( ALL | SOME | ANY ) table_subquery
            {
            pushFollow(FOLLOW_comp_op_in_quantified_comp_predicate2126);
            comp_op();

            state._fsp--;
            if (state.failed) return ;
            if ( input.LA(1)==ALL||input.LA(1)==ANY||input.LA(1)==SOME ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_table_subquery_in_quantified_comp_predicate2140);
            table_subquery();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, quantified_comp_predicate_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "quantified_comp_predicate"


    // $ANTLR start "exists_predicate"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:267:1: exists_predicate : EXISTS table_subquery ;
    public final void exists_predicate() throws RecognitionException {
        int exists_predicate_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:267:18: ( EXISTS table_subquery )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:268:5: EXISTS table_subquery
            {
            match(input,EXISTS,FOLLOW_EXISTS_in_exists_predicate2154); if (state.failed) return ;
            pushFollow(FOLLOW_table_subquery_in_exists_predicate2156);
            table_subquery();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, exists_predicate_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "exists_predicate"


    // $ANTLR start "unique_predicate"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:270:1: unique_predicate : UNIQUE table_subquery ;
    public final void unique_predicate() throws RecognitionException {
        int unique_predicate_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:270:18: ( UNIQUE table_subquery )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:271:5: UNIQUE table_subquery
            {
            match(input,UNIQUE,FOLLOW_UNIQUE_in_unique_predicate2170); if (state.failed) return ;
            pushFollow(FOLLOW_table_subquery_in_unique_predicate2172);
            table_subquery();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, unique_predicate_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "unique_predicate"


    // $ANTLR start "match_predicate"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:273:1: match_predicate : MATCH ( UNIQUE )? ( FULL | PARTIAL )? table_subquery ;
    public final void match_predicate() throws RecognitionException {
        int match_predicate_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:273:17: ( MATCH ( UNIQUE )? ( FULL | PARTIAL )? table_subquery )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:274:5: MATCH ( UNIQUE )? ( FULL | PARTIAL )? table_subquery
            {
            match(input,MATCH,FOLLOW_MATCH_in_match_predicate2186); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:274:11: ( UNIQUE )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==UNIQUE) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:274:12: UNIQUE
                    {
                    match(input,UNIQUE,FOLLOW_UNIQUE_in_match_predicate2189); if (state.failed) return ;

                    }
                    break;

            }

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:274:21: ( FULL | PARTIAL )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==FULL||LA77_0==PARTIAL) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
                    {
                    if ( input.LA(1)==FULL||input.LA(1)==PARTIAL ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_table_subquery_in_match_predicate2202);
            table_subquery();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, match_predicate_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "match_predicate"


    // $ANTLR start "overlaps_predicate"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:276:1: overlaps_predicate : OVERLAPS row_value_constructor ;
    public final void overlaps_predicate() throws RecognitionException {
        int overlaps_predicate_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:276:20: ( OVERLAPS row_value_constructor )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:277:5: OVERLAPS row_value_constructor
            {
            match(input,OVERLAPS,FOLLOW_OVERLAPS_in_overlaps_predicate2216); if (state.failed) return ;
            pushFollow(FOLLOW_row_value_constructor_in_overlaps_predicate2218);
            row_value_constructor();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, overlaps_predicate_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "overlaps_predicate"


    // $ANTLR start "cast_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:279:1: cast_spec : CAST LEFT_PAREN cast_operand AS cast_target RIGHT_PAREN ;
    public final void cast_spec() throws RecognitionException {
        int cast_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:279:11: ( CAST LEFT_PAREN cast_operand AS cast_target RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:280:5: CAST LEFT_PAREN cast_operand AS cast_target RIGHT_PAREN
            {
            match(input,CAST,FOLLOW_CAST_in_cast_spec2232); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_cast_spec2234); if (state.failed) return ;
            pushFollow(FOLLOW_cast_operand_in_cast_spec2236);
            cast_operand();

            state._fsp--;
            if (state.failed) return ;
            match(input,AS,FOLLOW_AS_in_cast_spec2238); if (state.failed) return ;
            pushFollow(FOLLOW_cast_target_in_cast_spec2240);
            cast_target();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_cast_spec2242); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, cast_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "cast_spec"


    // $ANTLR start "cast_operand"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:282:1: cast_operand : ( value_exp | NULL );
    public final void cast_operand() throws RecognitionException {
        int cast_operand_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:282:14: ( value_exp | NULL )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=UNSIGNED_INTEGER && LA78_0<=APPROXIMATE_NUM_LIT)||LA78_0==MINUS_SIGN||(LA78_0>=NATIONAL_CHAR_STRING_LIT && LA78_0<=EMBDD_VARIABLE_NAME)||LA78_0==ADA||LA78_0==AVG||LA78_0==BIT_LENGTH||(LA78_0>=CASE && LA78_0<=CAST)||(LA78_0>=CHAR && LA78_0<=CHAR_LENGTH)||(LA78_0>=CHARACTER_LENGTH && LA78_0<=COALESCE)||LA78_0==CONVERT||LA78_0==COUNT||LA78_0==CURRENT_DATE||(LA78_0>=CURRENT_TIME && LA78_0<=DATE)||LA78_0==EXTRACT||LA78_0==INTERVAL||LA78_0==LOWER||(LA78_0>=MAX && LA78_0<=MIN)||LA78_0==NULLIF||LA78_0==OCTET_LENGTH||LA78_0==POSITION||LA78_0==SESSION_USER||(LA78_0>=SUBSTRING && LA78_0<=SYSTEM_USER)||(LA78_0>=TIME && LA78_0<=TIMESTAMP)||(LA78_0>=TRANSLATE && LA78_0<=TRIM)||(LA78_0>=UPPER && LA78_0<=USER)||LA78_0==VALUE||(LA78_0>=REGULAR_ID && LA78_0<=EXACT_NUM_LIT)||(LA78_0>=CHAR_STRING && LA78_0<=DELIMITED_ID)||LA78_0==LEFT_PAREN||LA78_0==PLUS_SIGN||LA78_0==COLON||LA78_0==QUESTION_MARK||LA78_0==INTRODUCER) ) {
                alt78=1;
            }
            else if ( (LA78_0==NULL) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:283:7: value_exp
                    {
                    pushFollow(FOLLOW_value_exp_in_cast_operand2258);
                    value_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:284:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_cast_operand2267); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, cast_operand_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "cast_operand"


    // $ANTLR start "cast_target"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:286:1: cast_target : ( domain_name | data_type )? ( ( FORMAT )? CHAR_STRING )? ;
    public final void cast_target() throws RecognitionException {
        int cast_target_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:286:13: ( ( domain_name | data_type )? ( ( FORMAT )? CHAR_STRING )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:287:5: ( domain_name | data_type )? ( ( FORMAT )? CHAR_STRING )?
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:287:5: ( domain_name | data_type )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==ADA||LA79_0==REGULAR_ID||LA79_0==DELIMITED_ID||LA79_0==INTRODUCER) ) {
                alt79=1;
            }
            else if ( (LA79_0==BIT||LA79_0==CHAR||LA79_0==CHARACTER||LA79_0==DATE||(LA79_0>=DEC && LA79_0<=DECIMAL)||LA79_0==DOUBLE||LA79_0==FLOAT||(LA79_0>=INT && LA79_0<=INTEGER)||LA79_0==INTERVAL||LA79_0==NATIONAL||LA79_0==NCHAR||LA79_0==NUMERIC||LA79_0==REAL||LA79_0==SMALLINT||(LA79_0>=TIME && LA79_0<=TIMESTAMP)||LA79_0==VARCHAR) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:287:8: domain_name
                    {
                    pushFollow(FOLLOW_domain_name_in_cast_target2283);
                    domain_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:288:7: data_type
                    {
                    pushFollow(FOLLOW_data_type_in_cast_target2292);
                    data_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:288:18: ( ( FORMAT )? CHAR_STRING )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==FORMAT||LA81_0==CHAR_STRING) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:288:19: ( FORMAT )? CHAR_STRING
                    {
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:288:19: ( FORMAT )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==FORMAT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:0:0: FORMAT
                            {
                            match(input,FORMAT,FOLLOW_FORMAT_in_cast_target2296); if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_cast_target2299); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, cast_target_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "cast_target"


    // $ANTLR start "data_type"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:290:1: data_type : ( char_string_type ( CHARACTER SET char_set_name )? | national_char_string_type | bit_string_type | num_type | datetime_type | interval_type );
    public final void data_type() throws RecognitionException {
        int data_type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:290:11: ( char_string_type ( CHARACTER SET char_set_name )? | national_char_string_type | bit_string_type | num_type | datetime_type | interval_type )
            int alt83=6;
            switch ( input.LA(1) ) {
            case CHAR:
            case CHARACTER:
            case VARCHAR:
                {
                alt83=1;
                }
                break;
            case NATIONAL:
            case NCHAR:
                {
                alt83=2;
                }
                break;
            case BIT:
                {
                alt83=3;
                }
                break;
            case DEC:
            case DECIMAL:
            case DOUBLE:
            case FLOAT:
            case INT:
            case INTEGER:
            case NUMERIC:
            case REAL:
            case SMALLINT:
                {
                alt83=4;
                }
                break;
            case DATE:
            case TIME:
            case TIMESTAMP:
                {
                alt83=5;
                }
                break;
            case INTERVAL:
                {
                alt83=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:291:7: char_string_type ( CHARACTER SET char_set_name )?
                    {
                    pushFollow(FOLLOW_char_string_type_in_data_type2317);
                    char_string_type();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:291:24: ( CHARACTER SET char_set_name )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==CHARACTER) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:291:25: CHARACTER SET char_set_name
                            {
                            match(input,CHARACTER,FOLLOW_CHARACTER_in_data_type2320); if (state.failed) return ;
                            match(input,SET,FOLLOW_SET_in_data_type2322); if (state.failed) return ;
                            pushFollow(FOLLOW_char_set_name_in_data_type2324);
                            char_set_name();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:292:7: national_char_string_type
                    {
                    pushFollow(FOLLOW_national_char_string_type_in_data_type2335);
                    national_char_string_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:293:7: bit_string_type
                    {
                    pushFollow(FOLLOW_bit_string_type_in_data_type2344);
                    bit_string_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:294:7: num_type
                    {
                    pushFollow(FOLLOW_num_type_in_data_type2353);
                    num_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:295:7: datetime_type
                    {
                    pushFollow(FOLLOW_datetime_type_in_data_type2362);
                    datetime_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:296:7: interval_type
                    {
                    pushFollow(FOLLOW_interval_type_in_data_type2371);
                    interval_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, data_type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "data_type"


    // $ANTLR start "length"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:298:1: length : UNSIGNED_INTEGER ;
    public final void length() throws RecognitionException {
        int length_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:298:8: ( UNSIGNED_INTEGER )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:299:5: UNSIGNED_INTEGER
            {
            match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_length2385); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, length_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "length"


    // $ANTLR start "char_string_type"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:301:1: char_string_type : ( CHARACTER ( LEFT_PAREN length RIGHT_PAREN )? | CHAR ( LEFT_PAREN length RIGHT_PAREN )? | CHARACTER VARYING LEFT_PAREN length RIGHT_PAREN | CHAR VARYING LEFT_PAREN length RIGHT_PAREN | VARCHAR LEFT_PAREN length RIGHT_PAREN );
    public final void char_string_type() throws RecognitionException {
        int char_string_type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:301:18: ( CHARACTER ( LEFT_PAREN length RIGHT_PAREN )? | CHAR ( LEFT_PAREN length RIGHT_PAREN )? | CHARACTER VARYING LEFT_PAREN length RIGHT_PAREN | CHAR VARYING LEFT_PAREN length RIGHT_PAREN | VARCHAR LEFT_PAREN length RIGHT_PAREN )
            int alt86=5;
            switch ( input.LA(1) ) {
            case CHARACTER:
                {
                int LA86_1 = input.LA(2);

                if ( (LA86_1==VARYING) ) {
                    alt86=3;
                }
                else if ( (LA86_1==EOF||LA86_1==CHARACTER||LA86_1==FORMAT||LA86_1==CHAR_STRING||(LA86_1>=LEFT_PAREN && LA86_1<=RIGHT_PAREN)) ) {
                    alt86=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 1, input);

                    throw nvae;
                }
                }
                break;
            case CHAR:
                {
                int LA86_2 = input.LA(2);

                if ( (LA86_2==VARYING) ) {
                    alt86=4;
                }
                else if ( (LA86_2==EOF||LA86_2==CHARACTER||LA86_2==FORMAT||LA86_2==CHAR_STRING||(LA86_2>=LEFT_PAREN && LA86_2<=RIGHT_PAREN)) ) {
                    alt86=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 2, input);

                    throw nvae;
                }
                }
                break;
            case VARCHAR:
                {
                alt86=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:302:7: CHARACTER ( LEFT_PAREN length RIGHT_PAREN )?
                    {
                    match(input,CHARACTER,FOLLOW_CHARACTER_in_char_string_type2401); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:302:17: ( LEFT_PAREN length RIGHT_PAREN )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==LEFT_PAREN) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:302:18: LEFT_PAREN length RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_char_string_type2404); if (state.failed) return ;
                            pushFollow(FOLLOW_length_in_char_string_type2406);
                            length();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_char_string_type2408); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:303:7: CHAR ( LEFT_PAREN length RIGHT_PAREN )?
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_char_string_type2419); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:303:12: ( LEFT_PAREN length RIGHT_PAREN )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==LEFT_PAREN) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:303:13: LEFT_PAREN length RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_char_string_type2422); if (state.failed) return ;
                            pushFollow(FOLLOW_length_in_char_string_type2424);
                            length();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_char_string_type2426); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:304:7: CHARACTER VARYING LEFT_PAREN length RIGHT_PAREN
                    {
                    match(input,CHARACTER,FOLLOW_CHARACTER_in_char_string_type2437); if (state.failed) return ;
                    match(input,VARYING,FOLLOW_VARYING_in_char_string_type2439); if (state.failed) return ;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_char_string_type2441); if (state.failed) return ;
                    pushFollow(FOLLOW_length_in_char_string_type2443);
                    length();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_char_string_type2445); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:305:7: CHAR VARYING LEFT_PAREN length RIGHT_PAREN
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_char_string_type2454); if (state.failed) return ;
                    match(input,VARYING,FOLLOW_VARYING_in_char_string_type2456); if (state.failed) return ;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_char_string_type2458); if (state.failed) return ;
                    pushFollow(FOLLOW_length_in_char_string_type2460);
                    length();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_char_string_type2462); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:306:7: VARCHAR LEFT_PAREN length RIGHT_PAREN
                    {
                    match(input,VARCHAR,FOLLOW_VARCHAR_in_char_string_type2471); if (state.failed) return ;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_char_string_type2473); if (state.failed) return ;
                    pushFollow(FOLLOW_length_in_char_string_type2475);
                    length();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_char_string_type2477); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, char_string_type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "char_string_type"


    // $ANTLR start "national_char_string_type"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:308:1: national_char_string_type : ( NATIONAL ( CHARACTER ( LEFT_PAREN length RIGHT_PAREN )? | CHAR ( LEFT_PAREN length RIGHT_PAREN )? | CHARACTER VARYING LEFT_PAREN length RIGHT_PAREN | CHAR VARYING LEFT_PAREN length RIGHT_PAREN ) | NCHAR ( LEFT_PAREN length RIGHT_PAREN )? | NCHAR VARYING LEFT_PAREN length RIGHT_PAREN );
    public final void national_char_string_type() throws RecognitionException {
        int national_char_string_type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:308:27: ( NATIONAL ( CHARACTER ( LEFT_PAREN length RIGHT_PAREN )? | CHAR ( LEFT_PAREN length RIGHT_PAREN )? | CHARACTER VARYING LEFT_PAREN length RIGHT_PAREN | CHAR VARYING LEFT_PAREN length RIGHT_PAREN ) | NCHAR ( LEFT_PAREN length RIGHT_PAREN )? | NCHAR VARYING LEFT_PAREN length RIGHT_PAREN )
            int alt91=3;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==NATIONAL) ) {
                alt91=1;
            }
            else if ( (LA91_0==NCHAR) ) {
                int LA91_2 = input.LA(2);

                if ( (LA91_2==VARYING) ) {
                    alt91=3;
                }
                else if ( (LA91_2==EOF||LA91_2==FORMAT||LA91_2==CHAR_STRING||(LA91_2>=LEFT_PAREN && LA91_2<=RIGHT_PAREN)) ) {
                    alt91=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:309:7: NATIONAL ( CHARACTER ( LEFT_PAREN length RIGHT_PAREN )? | CHAR ( LEFT_PAREN length RIGHT_PAREN )? | CHARACTER VARYING LEFT_PAREN length RIGHT_PAREN | CHAR VARYING LEFT_PAREN length RIGHT_PAREN )
                    {
                    match(input,NATIONAL,FOLLOW_NATIONAL_in_national_char_string_type2493); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:310:9: ( CHARACTER ( LEFT_PAREN length RIGHT_PAREN )? | CHAR ( LEFT_PAREN length RIGHT_PAREN )? | CHARACTER VARYING LEFT_PAREN length RIGHT_PAREN | CHAR VARYING LEFT_PAREN length RIGHT_PAREN )
                    int alt89=4;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==CHARACTER) ) {
                        int LA89_1 = input.LA(2);

                        if ( (LA89_1==VARYING) ) {
                            alt89=3;
                        }
                        else if ( (LA89_1==EOF||LA89_1==FORMAT||LA89_1==CHAR_STRING||(LA89_1>=LEFT_PAREN && LA89_1<=RIGHT_PAREN)) ) {
                            alt89=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 89, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA89_0==CHAR) ) {
                        int LA89_2 = input.LA(2);

                        if ( (LA89_2==VARYING) ) {
                            alt89=4;
                        }
                        else if ( (LA89_2==EOF||LA89_2==FORMAT||LA89_2==CHAR_STRING||(LA89_2>=LEFT_PAREN && LA89_2<=RIGHT_PAREN)) ) {
                            alt89=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 89, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:310:11: CHARACTER ( LEFT_PAREN length RIGHT_PAREN )?
                            {
                            match(input,CHARACTER,FOLLOW_CHARACTER_in_national_char_string_type2506); if (state.failed) return ;
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:310:21: ( LEFT_PAREN length RIGHT_PAREN )?
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==LEFT_PAREN) ) {
                                alt87=1;
                            }
                            switch (alt87) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:310:22: LEFT_PAREN length RIGHT_PAREN
                                    {
                                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_national_char_string_type2509); if (state.failed) return ;
                                    pushFollow(FOLLOW_length_in_national_char_string_type2511);
                                    length();

                                    state._fsp--;
                                    if (state.failed) return ;
                                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_national_char_string_type2513); if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:311:11: CHAR ( LEFT_PAREN length RIGHT_PAREN )?
                            {
                            match(input,CHAR,FOLLOW_CHAR_in_national_char_string_type2528); if (state.failed) return ;
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:311:16: ( LEFT_PAREN length RIGHT_PAREN )?
                            int alt88=2;
                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==LEFT_PAREN) ) {
                                alt88=1;
                            }
                            switch (alt88) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:311:17: LEFT_PAREN length RIGHT_PAREN
                                    {
                                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_national_char_string_type2531); if (state.failed) return ;
                                    pushFollow(FOLLOW_length_in_national_char_string_type2533);
                                    length();

                                    state._fsp--;
                                    if (state.failed) return ;
                                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_national_char_string_type2535); if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:312:11: CHARACTER VARYING LEFT_PAREN length RIGHT_PAREN
                            {
                            match(input,CHARACTER,FOLLOW_CHARACTER_in_national_char_string_type2550); if (state.failed) return ;
                            match(input,VARYING,FOLLOW_VARYING_in_national_char_string_type2552); if (state.failed) return ;
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_national_char_string_type2554); if (state.failed) return ;
                            pushFollow(FOLLOW_length_in_national_char_string_type2556);
                            length();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_national_char_string_type2558); if (state.failed) return ;

                            }
                            break;
                        case 4 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:313:11: CHAR VARYING LEFT_PAREN length RIGHT_PAREN
                            {
                            match(input,CHAR,FOLLOW_CHAR_in_national_char_string_type2571); if (state.failed) return ;
                            match(input,VARYING,FOLLOW_VARYING_in_national_char_string_type2573); if (state.failed) return ;
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_national_char_string_type2575); if (state.failed) return ;
                            pushFollow(FOLLOW_length_in_national_char_string_type2577);
                            length();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_national_char_string_type2579); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:315:7: NCHAR ( LEFT_PAREN length RIGHT_PAREN )?
                    {
                    match(input,NCHAR,FOLLOW_NCHAR_in_national_char_string_type2597); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:315:13: ( LEFT_PAREN length RIGHT_PAREN )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==LEFT_PAREN) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:315:14: LEFT_PAREN length RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_national_char_string_type2600); if (state.failed) return ;
                            pushFollow(FOLLOW_length_in_national_char_string_type2602);
                            length();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_national_char_string_type2604); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:316:7: NCHAR VARYING LEFT_PAREN length RIGHT_PAREN
                    {
                    match(input,NCHAR,FOLLOW_NCHAR_in_national_char_string_type2615); if (state.failed) return ;
                    match(input,VARYING,FOLLOW_VARYING_in_national_char_string_type2617); if (state.failed) return ;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_national_char_string_type2619); if (state.failed) return ;
                    pushFollow(FOLLOW_length_in_national_char_string_type2621);
                    length();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_national_char_string_type2623); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, national_char_string_type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "national_char_string_type"


    // $ANTLR start "bit_string_type"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:318:1: bit_string_type : ( BIT ( LEFT_PAREN length RIGHT_PAREN )? | BIT VARYING LEFT_PAREN length RIGHT_PAREN );
    public final void bit_string_type() throws RecognitionException {
        int bit_string_type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:318:17: ( BIT ( LEFT_PAREN length RIGHT_PAREN )? | BIT VARYING LEFT_PAREN length RIGHT_PAREN )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==BIT) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==VARYING) ) {
                    alt93=2;
                }
                else if ( (LA93_1==EOF||LA93_1==FORMAT||LA93_1==CHAR_STRING||(LA93_1>=LEFT_PAREN && LA93_1<=RIGHT_PAREN)) ) {
                    alt93=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:319:7: BIT ( LEFT_PAREN length RIGHT_PAREN )?
                    {
                    match(input,BIT,FOLLOW_BIT_in_bit_string_type2639); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:319:11: ( LEFT_PAREN length RIGHT_PAREN )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==LEFT_PAREN) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:319:12: LEFT_PAREN length RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_bit_string_type2642); if (state.failed) return ;
                            pushFollow(FOLLOW_length_in_bit_string_type2644);
                            length();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_bit_string_type2646); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:320:11: BIT VARYING LEFT_PAREN length RIGHT_PAREN
                    {
                    match(input,BIT,FOLLOW_BIT_in_bit_string_type2661); if (state.failed) return ;
                    match(input,VARYING,FOLLOW_VARYING_in_bit_string_type2663); if (state.failed) return ;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_bit_string_type2665); if (state.failed) return ;
                    pushFollow(FOLLOW_length_in_bit_string_type2667);
                    length();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_bit_string_type2669); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, bit_string_type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bit_string_type"


    // $ANTLR start "precision"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:322:1: precision : UNSIGNED_INTEGER ;
    public final void precision() throws RecognitionException {
        int precision_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:322:11: ( UNSIGNED_INTEGER )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:323:5: UNSIGNED_INTEGER
            {
            match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_precision2683); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, precision_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "precision"


    // $ANTLR start "scale"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:325:1: scale : UNSIGNED_INTEGER ;
    public final void scale() throws RecognitionException {
        int scale_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:325:7: ( UNSIGNED_INTEGER )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:326:5: UNSIGNED_INTEGER
            {
            match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_scale2697); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, scale_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "scale"


    // $ANTLR start "num_type"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:328:1: num_type : ( exact_num_type | approximate_num_type );
    public final void num_type() throws RecognitionException {
        int num_type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:328:10: ( exact_num_type | approximate_num_type )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=DEC && LA94_0<=DECIMAL)||(LA94_0>=INT && LA94_0<=INTEGER)||LA94_0==NUMERIC||LA94_0==SMALLINT) ) {
                alt94=1;
            }
            else if ( (LA94_0==DOUBLE||LA94_0==FLOAT||LA94_0==REAL) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:329:7: exact_num_type
                    {
                    pushFollow(FOLLOW_exact_num_type_in_num_type2713);
                    exact_num_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:330:7: approximate_num_type
                    {
                    pushFollow(FOLLOW_approximate_num_type_in_num_type2722);
                    approximate_num_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, num_type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "num_type"


    // $ANTLR start "approximate_num_type"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:332:1: approximate_num_type : ( FLOAT ( LEFT_PAREN precision RIGHT_PAREN )? | REAL | DOUBLE PRECISION );
    public final void approximate_num_type() throws RecognitionException {
        int approximate_num_type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:332:22: ( FLOAT ( LEFT_PAREN precision RIGHT_PAREN )? | REAL | DOUBLE PRECISION )
            int alt96=3;
            switch ( input.LA(1) ) {
            case FLOAT:
                {
                alt96=1;
                }
                break;
            case REAL:
                {
                alt96=2;
                }
                break;
            case DOUBLE:
                {
                alt96=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:333:7: FLOAT ( LEFT_PAREN precision RIGHT_PAREN )?
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_approximate_num_type2738); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:333:13: ( LEFT_PAREN precision RIGHT_PAREN )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==LEFT_PAREN) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:333:14: LEFT_PAREN precision RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_approximate_num_type2741); if (state.failed) return ;
                            pushFollow(FOLLOW_precision_in_approximate_num_type2743);
                            precision();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_approximate_num_type2745); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:334:7: REAL
                    {
                    match(input,REAL,FOLLOW_REAL_in_approximate_num_type2756); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:335:7: DOUBLE PRECISION
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_approximate_num_type2765); if (state.failed) return ;
                    match(input,PRECISION,FOLLOW_PRECISION_in_approximate_num_type2767); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, approximate_num_type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "approximate_num_type"


    // $ANTLR start "exact_num_type"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:337:1: exact_num_type : ( NUMERIC ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )? | DECIMAL ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )? | DEC ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )? | INTEGER | INT | SMALLINT );
    public final void exact_num_type() throws RecognitionException {
        int exact_num_type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:337:16: ( NUMERIC ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )? | DECIMAL ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )? | DEC ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )? | INTEGER | INT | SMALLINT )
            int alt103=6;
            switch ( input.LA(1) ) {
            case NUMERIC:
                {
                alt103=1;
                }
                break;
            case DECIMAL:
                {
                alt103=2;
                }
                break;
            case DEC:
                {
                alt103=3;
                }
                break;
            case INTEGER:
                {
                alt103=4;
                }
                break;
            case INT:
                {
                alt103=5;
                }
                break;
            case SMALLINT:
                {
                alt103=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:338:7: NUMERIC ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )?
                    {
                    match(input,NUMERIC,FOLLOW_NUMERIC_in_exact_num_type2783); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:338:15: ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==LEFT_PAREN) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:338:17: LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_exact_num_type2787); if (state.failed) return ;
                            pushFollow(FOLLOW_precision_in_exact_num_type2789);
                            precision();

                            state._fsp--;
                            if (state.failed) return ;
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:338:38: ( COMMA scale )?
                            int alt97=2;
                            int LA97_0 = input.LA(1);

                            if ( (LA97_0==COMMA) ) {
                                alt97=1;
                            }
                            switch (alt97) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:338:39: COMMA scale
                                    {
                                    match(input,COMMA,FOLLOW_COMMA_in_exact_num_type2792); if (state.failed) return ;
                                    pushFollow(FOLLOW_scale_in_exact_num_type2794);
                                    scale();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }

                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_exact_num_type2798); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:339:11: DECIMAL ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )?
                    {
                    match(input,DECIMAL,FOLLOW_DECIMAL_in_exact_num_type2814); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:339:19: ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==LEFT_PAREN) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:339:21: LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_exact_num_type2818); if (state.failed) return ;
                            pushFollow(FOLLOW_precision_in_exact_num_type2820);
                            precision();

                            state._fsp--;
                            if (state.failed) return ;
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:339:42: ( COMMA scale )?
                            int alt99=2;
                            int LA99_0 = input.LA(1);

                            if ( (LA99_0==COMMA) ) {
                                alt99=1;
                            }
                            switch (alt99) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:339:43: COMMA scale
                                    {
                                    match(input,COMMA,FOLLOW_COMMA_in_exact_num_type2823); if (state.failed) return ;
                                    pushFollow(FOLLOW_scale_in_exact_num_type2825);
                                    scale();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }

                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_exact_num_type2829); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:340:7: DEC ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )?
                    {
                    match(input,DEC,FOLLOW_DEC_in_exact_num_type2841); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:340:11: ( LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==LEFT_PAREN) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:340:13: LEFT_PAREN precision ( COMMA scale )? RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_exact_num_type2845); if (state.failed) return ;
                            pushFollow(FOLLOW_precision_in_exact_num_type2847);
                            precision();

                            state._fsp--;
                            if (state.failed) return ;
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:340:34: ( COMMA scale )?
                            int alt101=2;
                            int LA101_0 = input.LA(1);

                            if ( (LA101_0==COMMA) ) {
                                alt101=1;
                            }
                            switch (alt101) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:340:35: COMMA scale
                                    {
                                    match(input,COMMA,FOLLOW_COMMA_in_exact_num_type2850); if (state.failed) return ;
                                    pushFollow(FOLLOW_scale_in_exact_num_type2852);
                                    scale();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }

                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_exact_num_type2856); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:341:7: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_exact_num_type2868); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:342:7: INT
                    {
                    match(input,INT,FOLLOW_INT_in_exact_num_type2877); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:343:7: SMALLINT
                    {
                    match(input,SMALLINT,FOLLOW_SMALLINT_in_exact_num_type2886); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, exact_num_type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "exact_num_type"


    // $ANTLR start "datetime_type"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:345:1: datetime_type : ( DATE | TIME ( LEFT_PAREN time_precision RIGHT_PAREN )? ( WITH TIME ZONE )? | TIMESTAMP ( LEFT_PAREN timestamp_precision RIGHT_PAREN )? ( WITH TIME ZONE )? );
    public final void datetime_type() throws RecognitionException {
        int datetime_type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:345:15: ( DATE | TIME ( LEFT_PAREN time_precision RIGHT_PAREN )? ( WITH TIME ZONE )? | TIMESTAMP ( LEFT_PAREN timestamp_precision RIGHT_PAREN )? ( WITH TIME ZONE )? )
            int alt108=3;
            switch ( input.LA(1) ) {
            case DATE:
                {
                alt108=1;
                }
                break;
            case TIME:
                {
                alt108=2;
                }
                break;
            case TIMESTAMP:
                {
                alt108=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:346:7: DATE
                    {
                    match(input,DATE,FOLLOW_DATE_in_datetime_type2902); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:347:7: TIME ( LEFT_PAREN time_precision RIGHT_PAREN )? ( WITH TIME ZONE )?
                    {
                    match(input,TIME,FOLLOW_TIME_in_datetime_type2911); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:347:12: ( LEFT_PAREN time_precision RIGHT_PAREN )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==LEFT_PAREN) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:347:13: LEFT_PAREN time_precision RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_datetime_type2914); if (state.failed) return ;
                            pushFollow(FOLLOW_time_precision_in_datetime_type2916);
                            time_precision();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_datetime_type2918); if (state.failed) return ;

                            }
                            break;

                    }

                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:347:53: ( WITH TIME ZONE )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==WITH) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:347:54: WITH TIME ZONE
                            {
                            match(input,WITH,FOLLOW_WITH_in_datetime_type2923); if (state.failed) return ;
                            match(input,TIME,FOLLOW_TIME_in_datetime_type2925); if (state.failed) return ;
                            match(input,ZONE,FOLLOW_ZONE_in_datetime_type2927); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:348:7: TIMESTAMP ( LEFT_PAREN timestamp_precision RIGHT_PAREN )? ( WITH TIME ZONE )?
                    {
                    match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_datetime_type2937); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:348:17: ( LEFT_PAREN timestamp_precision RIGHT_PAREN )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==LEFT_PAREN) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:348:18: LEFT_PAREN timestamp_precision RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_datetime_type2940); if (state.failed) return ;
                            pushFollow(FOLLOW_timestamp_precision_in_datetime_type2942);
                            timestamp_precision();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_datetime_type2944); if (state.failed) return ;

                            }
                            break;

                    }

                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:348:63: ( WITH TIME ZONE )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==WITH) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:348:64: WITH TIME ZONE
                            {
                            match(input,WITH,FOLLOW_WITH_in_datetime_type2949); if (state.failed) return ;
                            match(input,TIME,FOLLOW_TIME_in_datetime_type2951); if (state.failed) return ;
                            match(input,ZONE,FOLLOW_ZONE_in_datetime_type2953); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, datetime_type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "datetime_type"


    // $ANTLR start "interval_type"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:350:1: interval_type : INTERVAL interval_qualifier ;
    public final void interval_type() throws RecognitionException {
        int interval_type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:350:15: ( INTERVAL interval_qualifier )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:351:5: INTERVAL interval_qualifier
            {
            match(input,INTERVAL,FOLLOW_INTERVAL_in_interval_type2969); if (state.failed) return ;
            pushFollow(FOLLOW_interval_qualifier_in_interval_type2971);
            interval_qualifier();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, interval_type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "interval_type"


    // $ANTLR start "scalar_subquery"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:353:1: scalar_subquery : subquery ;
    public final void scalar_subquery() throws RecognitionException {
        int scalar_subquery_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:353:17: ( subquery )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:354:5: subquery
            {
            pushFollow(FOLLOW_subquery_in_scalar_subquery2985);
            subquery();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, scalar_subquery_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "scalar_subquery"


    // $ANTLR start "subquery"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:357:1: subquery : LEFT_PAREN query_exp RIGHT_PAREN ;
    public final void subquery() throws RecognitionException {
        int subquery_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:357:10: ( LEFT_PAREN query_exp RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:358:5: LEFT_PAREN query_exp RIGHT_PAREN
            {
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_subquery3000); if (state.failed) return ;
            pushFollow(FOLLOW_query_exp_in_subquery3002);
            query_exp();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_subquery3004); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, subquery_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "subquery"


    // $ANTLR start "query_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:360:1: query_exp : query_term ( ( UNION | EXCEPT | MINUS ) ( ALL )? ( corresponding_spec )? query_term )* ;
    public final void query_exp() throws RecognitionException {
        int query_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:360:11: ( query_term ( ( UNION | EXCEPT | MINUS ) ( ALL )? ( corresponding_spec )? query_term )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:5: query_term ( ( UNION | EXCEPT | MINUS ) ( ALL )? ( corresponding_spec )? query_term )*
            {
            pushFollow(FOLLOW_query_term_in_query_exp3018);
            query_term();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:16: ( ( UNION | EXCEPT | MINUS ) ( ALL )? ( corresponding_spec )? query_term )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==EXCEPT||LA111_0==MINUS||LA111_0==UNION) ) {
                    int LA111_2 = input.LA(2);

                    if ( (synpred166_DmlSQL2Parser()) ) {
                        alt111=1;
                    }


                }


                switch (alt111) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:18: ( UNION | EXCEPT | MINUS ) ( ALL )? ( corresponding_spec )? query_term
            	    {
            	    if ( input.LA(1)==EXCEPT||input.LA(1)==MINUS||input.LA(1)==UNION ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:42: ( ALL )?
            	    int alt109=2;
            	    int LA109_0 = input.LA(1);

            	    if ( (LA109_0==ALL) ) {
            	        alt109=1;
            	    }
            	    switch (alt109) {
            	        case 1 :
            	            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:43: ALL
            	            {
            	            match(input,ALL,FOLLOW_ALL_in_query_exp3034); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:49: ( corresponding_spec )?
            	    int alt110=2;
            	    int LA110_0 = input.LA(1);

            	    if ( (LA110_0==CORRESPONDING) ) {
            	        alt110=1;
            	    }
            	    switch (alt110) {
            	        case 1 :
            	            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:50: corresponding_spec
            	            {
            	            pushFollow(FOLLOW_corresponding_spec_in_query_exp3039);
            	            corresponding_spec();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_query_term_in_query_exp3043);
            	    query_term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, query_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "query_exp"


    // $ANTLR start "query_term"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:363:1: query_term : query_primary ( INTERSECT ( ALL )? ( corresponding_spec )? query_primary )* ;
    public final void query_term() throws RecognitionException {
        int query_term_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:363:12: ( query_primary ( INTERSECT ( ALL )? ( corresponding_spec )? query_primary )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:5: query_primary ( INTERSECT ( ALL )? ( corresponding_spec )? query_primary )*
            {
            pushFollow(FOLLOW_query_primary_in_query_term3059);
            query_primary();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:19: ( INTERSECT ( ALL )? ( corresponding_spec )? query_primary )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==INTERSECT) ) {
                    int LA114_2 = input.LA(2);

                    if ( (synpred169_DmlSQL2Parser()) ) {
                        alt114=1;
                    }


                }


                switch (alt114) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:21: INTERSECT ( ALL )? ( corresponding_spec )? query_primary
            	    {
            	    match(input,INTERSECT,FOLLOW_INTERSECT_in_query_term3063); if (state.failed) return ;
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:31: ( ALL )?
            	    int alt112=2;
            	    int LA112_0 = input.LA(1);

            	    if ( (LA112_0==ALL) ) {
            	        alt112=1;
            	    }
            	    switch (alt112) {
            	        case 1 :
            	            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:32: ALL
            	            {
            	            match(input,ALL,FOLLOW_ALL_in_query_term3066); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:38: ( corresponding_spec )?
            	    int alt113=2;
            	    int LA113_0 = input.LA(1);

            	    if ( (LA113_0==CORRESPONDING) ) {
            	        alt113=1;
            	    }
            	    switch (alt113) {
            	        case 1 :
            	            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:39: corresponding_spec
            	            {
            	            pushFollow(FOLLOW_corresponding_spec_in_query_term3071);
            	            corresponding_spec();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_query_primary_in_query_term3075);
            	    query_primary();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, query_term_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "query_term"


    // $ANTLR start "corresponding_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:366:1: corresponding_spec : CORRESPONDING ( BY LEFT_PAREN column_name_list RIGHT_PAREN )? ;
    public final void corresponding_spec() throws RecognitionException {
        int corresponding_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:366:20: ( CORRESPONDING ( BY LEFT_PAREN column_name_list RIGHT_PAREN )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:367:5: CORRESPONDING ( BY LEFT_PAREN column_name_list RIGHT_PAREN )?
            {
            match(input,CORRESPONDING,FOLLOW_CORRESPONDING_in_corresponding_spec3090); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:367:19: ( BY LEFT_PAREN column_name_list RIGHT_PAREN )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==BY) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:367:20: BY LEFT_PAREN column_name_list RIGHT_PAREN
                    {
                    match(input,BY,FOLLOW_BY_in_corresponding_spec3093); if (state.failed) return ;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_corresponding_spec3095); if (state.failed) return ;
                    pushFollow(FOLLOW_column_name_list_in_corresponding_spec3097);
                    column_name_list();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_corresponding_spec3099); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, corresponding_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "corresponding_spec"


    // $ANTLR start "query_primary"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:369:1: query_primary : ( simple_table | table_ref );
    public final void query_primary() throws RecognitionException {
        int query_primary_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:369:15: ( simple_table | table_ref )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==SELECT||LA116_0==TABLE||LA116_0==VALUES) ) {
                alt116=1;
            }
            else if ( (LA116_0==ADA||LA116_0==MODULE||LA116_0==REGULAR_ID||LA116_0==DELIMITED_ID||LA116_0==LEFT_PAREN||LA116_0==INTRODUCER) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:370:7: simple_table
                    {
                    pushFollow(FOLLOW_simple_table_in_query_primary3117);
                    simple_table();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:371:7: table_ref
                    {
                    pushFollow(FOLLOW_table_ref_in_query_primary3126);
                    table_ref();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, query_primary_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "query_primary"


    // $ANTLR start "simple_table"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:373:1: simple_table : ( query_spec | table_value_constructor | explicit_table );
    public final void simple_table() throws RecognitionException {
        int simple_table_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:373:14: ( query_spec | table_value_constructor | explicit_table )
            int alt117=3;
            switch ( input.LA(1) ) {
            case SELECT:
                {
                alt117=1;
                }
                break;
            case VALUES:
                {
                alt117=2;
                }
                break;
            case TABLE:
                {
                alt117=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:374:7: query_spec
                    {
                    pushFollow(FOLLOW_query_spec_in_simple_table3142);
                    query_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:375:7: table_value_constructor
                    {
                    pushFollow(FOLLOW_table_value_constructor_in_simple_table3151);
                    table_value_constructor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:376:7: explicit_table
                    {
                    pushFollow(FOLLOW_explicit_table_in_simple_table3160);
                    explicit_table();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, simple_table_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "simple_table"


    // $ANTLR start "query_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:379:1: query_spec : SELECT ( set_quantifier )? select_list ( into_clause )? table_exp ;
    public final void query_spec() throws RecognitionException {
        int query_spec_StartIndex = input.index();
        DmlSQL2Parser.table_exp_return table_exp2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:379:12: ( SELECT ( set_quantifier )? select_list ( into_clause )? table_exp )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:380:5: SELECT ( set_quantifier )? select_list ( into_clause )? table_exp
            {
            match(input,SELECT,FOLLOW_SELECT_in_query_spec3175); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:380:12: ( set_quantifier )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==ALL||LA118_0==DISTINCT) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:380:13: set_quantifier
                    {
                    pushFollow(FOLLOW_set_quantifier_in_query_spec3178);
                    set_quantifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_select_list_in_query_spec3182);
            select_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
              inFrom=true;
            }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:380:56: ( into_clause )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==INTO) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:380:57: into_clause
                    {
                    pushFollow(FOLLOW_into_clause_in_query_spec3186);
                    into_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_table_exp_in_query_spec3190);
            table_exp2=table_exp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
              sqlinsertinfo.setFromClause((table_exp2!=null?input.toString(table_exp2.start,table_exp2.stop):null));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, query_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "query_spec"


    // $ANTLR start "table_value_constructor"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:382:1: table_value_constructor : VALUES table_value_const_list ;
    public final void table_value_constructor() throws RecognitionException {
        int table_value_constructor_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:382:25: ( VALUES table_value_const_list )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:383:5: VALUES table_value_const_list
            {
            match(input,VALUES,FOLLOW_VALUES_in_table_value_constructor3205); if (state.failed) return ;
            pushFollow(FOLLOW_table_value_const_list_in_table_value_constructor3207);
            table_value_const_list();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, table_value_constructor_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "table_value_constructor"


    // $ANTLR start "table_value_const_list"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:385:1: table_value_const_list : row_value_constructor ( COMMA row_value_constructor )* ;
    public final void table_value_const_list() throws RecognitionException {
        int table_value_const_list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:385:24: ( row_value_constructor ( COMMA row_value_constructor )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:386:5: row_value_constructor ( COMMA row_value_constructor )*
            {
            pushFollow(FOLLOW_row_value_constructor_in_table_value_const_list3219);
            row_value_constructor();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:386:27: ( COMMA row_value_constructor )*
            loop120:
            do {
                int alt120=2;
                alt120 = dfa120.predict(input);
                switch (alt120) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:386:28: COMMA row_value_constructor
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_table_value_const_list3222); if (state.failed) return ;
            	    pushFollow(FOLLOW_row_value_constructor_in_table_value_const_list3224);
            	    row_value_constructor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, table_value_const_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "table_value_const_list"


    // $ANTLR start "row_value_constructor"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:388:1: row_value_constructor : ( ( row_value_constructor_elem )=> row_value_constructor_elem | LEFT_PAREN row_value_const_list RIGHT_PAREN );
    public final void row_value_constructor() throws RecognitionException {
        int row_value_constructor_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:388:23: ( ( row_value_constructor_elem )=> row_value_constructor_elem | LEFT_PAREN row_value_const_list RIGHT_PAREN )
            int alt121=2;
            alt121 = dfa121.predict(input);
            switch (alt121) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:389:7: ( row_value_constructor_elem )=> row_value_constructor_elem
                    {
                    pushFollow(FOLLOW_row_value_constructor_elem_in_row_value_constructor3246);
                    row_value_constructor_elem();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:391:7: LEFT_PAREN row_value_const_list RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_row_value_constructor3261); if (state.failed) return ;
                    pushFollow(FOLLOW_row_value_const_list_in_row_value_constructor3263);
                    row_value_const_list();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_row_value_constructor3265); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, row_value_constructor_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "row_value_constructor"


    // $ANTLR start "row_value_constructor_elem"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:393:1: row_value_constructor_elem : ( value_exp | NULL | DEFAULT );
    public final void row_value_constructor_elem() throws RecognitionException {
        int row_value_constructor_elem_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:393:28: ( value_exp | NULL | DEFAULT )
            int alt122=3;
            switch ( input.LA(1) ) {
            case UNSIGNED_INTEGER:
            case APPROXIMATE_NUM_LIT:
            case MINUS_SIGN:
            case NATIONAL_CHAR_STRING_LIT:
            case BIT_STRING_LIT:
            case HEX_STRING_LIT:
            case EMBDD_VARIABLE_NAME:
            case ADA:
            case AVG:
            case BIT_LENGTH:
            case CASE:
            case CAST:
            case CHAR:
            case CHAR_LENGTH:
            case CHARACTER_LENGTH:
            case COALESCE:
            case CONVERT:
            case COUNT:
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
            case CURRENT_USER:
            case DATE:
            case EXTRACT:
            case INTERVAL:
            case LOWER:
            case MAX:
            case MIN:
            case NULLIF:
            case OCTET_LENGTH:
            case POSITION:
            case SESSION_USER:
            case SUBSTRING:
            case SUM:
            case SYSTEM_USER:
            case TIME:
            case TIMESTAMP:
            case TRANSLATE:
            case TRIM:
            case UPPER:
            case USER:
            case VALUE:
            case REGULAR_ID:
            case EXACT_NUM_LIT:
            case CHAR_STRING:
            case DELIMITED_ID:
            case LEFT_PAREN:
            case PLUS_SIGN:
            case COLON:
            case QUESTION_MARK:
            case INTRODUCER:
                {
                alt122=1;
                }
                break;
            case NULL:
                {
                alt122=2;
                }
                break;
            case DEFAULT:
                {
                alt122=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:394:7: value_exp
                    {
                    pushFollow(FOLLOW_value_exp_in_row_value_constructor_elem3280);
                    value_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:395:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_row_value_constructor_elem3289); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:396:7: DEFAULT
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_row_value_constructor_elem3298); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, row_value_constructor_elem_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "row_value_constructor_elem"


    // $ANTLR start "row_value_const_list"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:398:1: row_value_const_list : row_value_constructor_elem ( COMMA row_value_constructor_elem )* ;
    public final void row_value_const_list() throws RecognitionException {
        int row_value_const_list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:398:22: ( row_value_constructor_elem ( COMMA row_value_constructor_elem )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:399:5: row_value_constructor_elem ( COMMA row_value_constructor_elem )*
            {
            pushFollow(FOLLOW_row_value_constructor_elem_in_row_value_const_list3313);
            row_value_constructor_elem();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:399:32: ( COMMA row_value_constructor_elem )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==COMMA) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:399:33: COMMA row_value_constructor_elem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_row_value_const_list3316); if (state.failed) return ;
            	    pushFollow(FOLLOW_row_value_constructor_elem_in_row_value_const_list3318);
            	    row_value_constructor_elem();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, row_value_const_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "row_value_const_list"


    // $ANTLR start "explicit_table"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:401:1: explicit_table : TABLE table_name ;
    public final void explicit_table() throws RecognitionException {
        int explicit_table_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:401:16: ( TABLE table_name )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:402:5: TABLE table_name
            {
            match(input,TABLE,FOLLOW_TABLE_in_explicit_table3334); if (state.failed) return ;
            pushFollow(FOLLOW_table_name_in_explicit_table3336);
            table_name();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, explicit_table_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "explicit_table"


    // $ANTLR start "joined_table"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:404:1: joined_table : table_ref_aux ( qualified_join | cross_join ) ;
    public final void joined_table() throws RecognitionException {
        int joined_table_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:404:14: ( table_ref_aux ( qualified_join | cross_join ) )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:405:5: table_ref_aux ( qualified_join | cross_join )
            {
            pushFollow(FOLLOW_table_ref_aux_in_joined_table3350);
            table_ref_aux();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:405:19: ( qualified_join | cross_join )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==FULL||LA124_0==INNER||LA124_0==JOIN||LA124_0==LEFT||LA124_0==NATURAL||LA124_0==RIGHT||LA124_0==UNION) ) {
                alt124=1;
            }
            else if ( (LA124_0==CROSS) ) {
                alt124=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:405:20: qualified_join
                    {
                    pushFollow(FOLLOW_qualified_join_in_joined_table3353);
                    qualified_join();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:405:37: cross_join
                    {
                    pushFollow(FOLLOW_cross_join_in_joined_table3357);
                    cross_join();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, joined_table_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "joined_table"


    // $ANTLR start "table_ref"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:407:1: table_ref : table_ref_aux ( options {greedy=true; } : qualified_join | cross_join )* ;
    public final void table_ref() throws RecognitionException {
        int table_ref_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:407:11: ( table_ref_aux ( options {greedy=true; } : qualified_join | cross_join )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:408:5: table_ref_aux ( options {greedy=true; } : qualified_join | cross_join )*
            {
            pushFollow(FOLLOW_table_ref_aux_in_table_ref3372);
            table_ref_aux();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:408:19: ( options {greedy=true; } : qualified_join | cross_join )*
            loop125:
            do {
                int alt125=3;
                alt125 = dfa125.predict(input);
                switch (alt125) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:408:42: qualified_join
            	    {
            	    pushFollow(FOLLOW_qualified_join_in_table_ref3382);
            	    qualified_join();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:408:59: cross_join
            	    {
            	    pushFollow(FOLLOW_cross_join_in_table_ref3386);
            	    cross_join();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, table_ref_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "table_ref"


    // $ANTLR start "table_ref_aux"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:410:1: table_ref_aux : ( table_name | table_subquery ) ( ( AS )? correlation_name ( LEFT_PAREN derived_column_list RIGHT_PAREN )? )? ;
    public final void table_ref_aux() throws RecognitionException {
        int table_ref_aux_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:410:15: ( ( table_name | table_subquery ) ( ( AS )? correlation_name ( LEFT_PAREN derived_column_list RIGHT_PAREN )? )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:5: ( table_name | table_subquery ) ( ( AS )? correlation_name ( LEFT_PAREN derived_column_list RIGHT_PAREN )? )?
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:5: ( table_name | table_subquery )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==ADA||LA126_0==MODULE||LA126_0==REGULAR_ID||LA126_0==DELIMITED_ID||LA126_0==INTRODUCER) ) {
                alt126=1;
            }
            else if ( (LA126_0==LEFT_PAREN) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:6: table_name
                    {
                    pushFollow(FOLLOW_table_name_in_table_ref_aux3402);
                    table_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:19: table_subquery
                    {
                    pushFollow(FOLLOW_table_subquery_in_table_ref_aux3406);
                    table_subquery();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:35: ( ( AS )? correlation_name ( LEFT_PAREN derived_column_list RIGHT_PAREN )? )?
            int alt129=2;
            alt129 = dfa129.predict(input);
            switch (alt129) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:36: ( AS )? correlation_name ( LEFT_PAREN derived_column_list RIGHT_PAREN )?
                    {
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:36: ( AS )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==AS) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:37: AS
                            {
                            match(input,AS,FOLLOW_AS_in_table_ref_aux3411); if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_correlation_name_in_table_ref_aux3415);
                    correlation_name();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:59: ( LEFT_PAREN derived_column_list RIGHT_PAREN )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==LEFT_PAREN) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:60: LEFT_PAREN derived_column_list RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_table_ref_aux3418); if (state.failed) return ;
                            pushFollow(FOLLOW_derived_column_list_in_table_ref_aux3420);
                            derived_column_list();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_table_ref_aux3422); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, table_ref_aux_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "table_ref_aux"


    // $ANTLR start "derived_column_list"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:413:1: derived_column_list : column_name_list ;
    public final void derived_column_list() throws RecognitionException {
        int derived_column_list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:413:21: ( column_name_list )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:414:5: column_name_list
            {
            pushFollow(FOLLOW_column_name_list_in_derived_column_list3440);
            column_name_list();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, derived_column_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "derived_column_list"


    // $ANTLR start "table_subquery"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:416:1: table_subquery : subquery ;
    public final void table_subquery() throws RecognitionException {
        int table_subquery_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:416:16: ( subquery )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:417:5: subquery
            {
            pushFollow(FOLLOW_subquery_in_table_subquery3454);
            subquery();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, table_subquery_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "table_subquery"


    // $ANTLR start "cross_join"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:419:1: cross_join : CROSS JOIN table_ref ;
    public final void cross_join() throws RecognitionException {
        int cross_join_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:419:12: ( CROSS JOIN table_ref )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:420:5: CROSS JOIN table_ref
            {
            match(input,CROSS,FOLLOW_CROSS_in_cross_join3468); if (state.failed) return ;
            match(input,JOIN,FOLLOW_JOIN_in_cross_join3470); if (state.failed) return ;
            pushFollow(FOLLOW_table_ref_in_cross_join3472);
            table_ref();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, cross_join_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "cross_join"


    // $ANTLR start "qualified_join"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:422:1: qualified_join : ( ( INNER | outer_join_type ( OUTER )? )? JOIN table_ref join_spec | NATURAL ( INNER | outer_join_type ( OUTER )? )? JOIN table_ref | UNION JOIN table_ref );
    public final void qualified_join() throws RecognitionException {
        int qualified_join_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:422:16: ( ( INNER | outer_join_type ( OUTER )? )? JOIN table_ref join_spec | NATURAL ( INNER | outer_join_type ( OUTER )? )? JOIN table_ref | UNION JOIN table_ref )
            int alt134=3;
            switch ( input.LA(1) ) {
            case FULL:
            case INNER:
            case JOIN:
            case LEFT:
            case RIGHT:
                {
                alt134=1;
                }
                break;
            case NATURAL:
                {
                alt134=2;
                }
                break;
            case UNION:
                {
                alt134=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }

            switch (alt134) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:423:7: ( INNER | outer_join_type ( OUTER )? )? JOIN table_ref join_spec
                    {
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:423:7: ( INNER | outer_join_type ( OUTER )? )?
                    int alt131=3;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==INNER) ) {
                        alt131=1;
                    }
                    else if ( (LA131_0==FULL||LA131_0==LEFT||LA131_0==RIGHT) ) {
                        alt131=2;
                    }
                    switch (alt131) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:423:9: INNER
                            {
                            match(input,INNER,FOLLOW_INNER_in_qualified_join3489); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:423:17: outer_join_type ( OUTER )?
                            {
                            pushFollow(FOLLOW_outer_join_type_in_qualified_join3493);
                            outer_join_type();

                            state._fsp--;
                            if (state.failed) return ;
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:423:33: ( OUTER )?
                            int alt130=2;
                            int LA130_0 = input.LA(1);

                            if ( (LA130_0==OUTER) ) {
                                alt130=1;
                            }
                            switch (alt130) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:423:34: OUTER
                                    {
                                    match(input,OUTER,FOLLOW_OUTER_in_qualified_join3496); if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,JOIN,FOLLOW_JOIN_in_qualified_join3503); if (state.failed) return ;
                    pushFollow(FOLLOW_table_ref_in_qualified_join3505);
                    table_ref();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_join_spec_in_qualified_join3507);
                    join_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:424:7: NATURAL ( INNER | outer_join_type ( OUTER )? )? JOIN table_ref
                    {
                    match(input,NATURAL,FOLLOW_NATURAL_in_qualified_join3516); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:424:15: ( INNER | outer_join_type ( OUTER )? )?
                    int alt133=3;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==INNER) ) {
                        alt133=1;
                    }
                    else if ( (LA133_0==FULL||LA133_0==LEFT||LA133_0==RIGHT) ) {
                        alt133=2;
                    }
                    switch (alt133) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:424:17: INNER
                            {
                            match(input,INNER,FOLLOW_INNER_in_qualified_join3520); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:424:25: outer_join_type ( OUTER )?
                            {
                            pushFollow(FOLLOW_outer_join_type_in_qualified_join3524);
                            outer_join_type();

                            state._fsp--;
                            if (state.failed) return ;
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:424:41: ( OUTER )?
                            int alt132=2;
                            int LA132_0 = input.LA(1);

                            if ( (LA132_0==OUTER) ) {
                                alt132=1;
                            }
                            switch (alt132) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:424:42: OUTER
                                    {
                                    match(input,OUTER,FOLLOW_OUTER_in_qualified_join3527); if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,JOIN,FOLLOW_JOIN_in_qualified_join3534); if (state.failed) return ;
                    pushFollow(FOLLOW_table_ref_in_qualified_join3536);
                    table_ref();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:425:7: UNION JOIN table_ref
                    {
                    match(input,UNION,FOLLOW_UNION_in_qualified_join3545); if (state.failed) return ;
                    match(input,JOIN,FOLLOW_JOIN_in_qualified_join3547); if (state.failed) return ;
                    pushFollow(FOLLOW_table_ref_in_qualified_join3549);
                    table_ref();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, qualified_join_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "qualified_join"


    // $ANTLR start "outer_join_type"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:427:1: outer_join_type : ( LEFT | RIGHT | FULL );
    public final void outer_join_type() throws RecognitionException {
        int outer_join_type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:427:17: ( LEFT | RIGHT | FULL )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
            {
            if ( input.LA(1)==FULL||input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, outer_join_type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "outer_join_type"


    // $ANTLR start "join_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:432:1: join_spec : ( join_condition | named_columns_join );
    public final void join_spec() throws RecognitionException {
        int join_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:432:11: ( join_condition | named_columns_join )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==ON) ) {
                alt135=1;
            }
            else if ( (LA135_0==USING) ) {
                alt135=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }
            switch (alt135) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:433:7: join_condition
                    {
                    pushFollow(FOLLOW_join_condition_in_join_spec3599);
                    join_condition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:434:7: named_columns_join
                    {
                    pushFollow(FOLLOW_named_columns_join_in_join_spec3608);
                    named_columns_join();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, join_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "join_spec"


    // $ANTLR start "join_condition"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:436:1: join_condition : ON search_condition ;
    public final void join_condition() throws RecognitionException {
        int join_condition_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:436:16: ( ON search_condition )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:437:5: ON search_condition
            {
            match(input,ON,FOLLOW_ON_in_join_condition3622); if (state.failed) return ;
            pushFollow(FOLLOW_search_condition_in_join_condition3624);
            search_condition();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, join_condition_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "join_condition"


    // $ANTLR start "named_columns_join"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:439:1: named_columns_join : USING LEFT_PAREN column_name_list RIGHT_PAREN ;
    public final void named_columns_join() throws RecognitionException {
        int named_columns_join_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:439:20: ( USING LEFT_PAREN column_name_list RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:440:5: USING LEFT_PAREN column_name_list RIGHT_PAREN
            {
            match(input,USING,FOLLOW_USING_in_named_columns_join3638); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_named_columns_join3640); if (state.failed) return ;
            pushFollow(FOLLOW_column_name_list_in_named_columns_join3642);
            column_name_list();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_named_columns_join3644); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, named_columns_join_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "named_columns_join"

    public static class table_exp_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "table_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:442:1: table_exp : from_clause ( where_clause )? ( group_by_clause )? ( having_clause )? ;
    public final DmlSQL2Parser.table_exp_return table_exp() throws RecognitionException {
        DmlSQL2Parser.table_exp_return retval = new DmlSQL2Parser.table_exp_return();
        retval.start = input.LT(1);
        int table_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:442:11: ( from_clause ( where_clause )? ( group_by_clause )? ( having_clause )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:443:5: from_clause ( where_clause )? ( group_by_clause )? ( having_clause )?
            {
            pushFollow(FOLLOW_from_clause_in_table_exp3658);
            from_clause();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:444:5: ( where_clause )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==WHERE) ) {
                int LA136_1 = input.LA(2);

                if ( (synpred199_DmlSQL2Parser()) ) {
                    alt136=1;
                }
            }
            switch (alt136) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:444:6: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_table_exp3666);
                    where_clause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:445:5: ( group_by_clause )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==GROUP) ) {
                int LA137_1 = input.LA(2);

                if ( (synpred200_DmlSQL2Parser()) ) {
                    alt137=1;
                }
            }
            switch (alt137) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:445:6: group_by_clause
                    {
                    pushFollow(FOLLOW_group_by_clause_in_table_exp3676);
                    group_by_clause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:446:5: ( having_clause )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==HAVING) ) {
                int LA138_1 = input.LA(2);

                if ( (synpred201_DmlSQL2Parser()) ) {
                    alt138=1;
                }
            }
            else if ( (LA138_0==QUALIFY) ) {
                int LA138_2 = input.LA(2);

                if ( (synpred201_DmlSQL2Parser()) ) {
                    alt138=1;
                }
            }
            switch (alt138) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:446:6: having_clause
                    {
                    pushFollow(FOLLOW_having_clause_in_table_exp3686);
                    having_clause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, table_exp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "table_exp"


    // $ANTLR start "from_clause"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:448:1: from_clause : FROM table_ref_list ;
    public final void from_clause() throws RecognitionException {
        int from_clause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:448:13: ( FROM table_ref_list )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:449:5: FROM table_ref_list
            {
            match(input,FROM,FOLLOW_FROM_in_from_clause3702); if (state.failed) return ;
            pushFollow(FOLLOW_table_ref_list_in_from_clause3704);
            table_ref_list();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 106, from_clause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "from_clause"


    // $ANTLR start "table_ref_list"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:451:1: table_ref_list : query_exp ( COMMA query_exp )* ;
    public final void table_ref_list() throws RecognitionException {
        int table_ref_list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:451:16: ( query_exp ( COMMA query_exp )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:452:5: query_exp ( COMMA query_exp )*
            {
            pushFollow(FOLLOW_query_exp_in_table_ref_list3721);
            query_exp();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:452:15: ( COMMA query_exp )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==COMMA) ) {
                    int LA139_2 = input.LA(2);

                    if ( (synpred202_DmlSQL2Parser()) ) {
                        alt139=1;
                    }


                }


                switch (alt139) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:452:16: COMMA query_exp
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_table_ref_list3724); if (state.failed) return ;
            	    pushFollow(FOLLOW_query_exp_in_table_ref_list3726);
            	    query_exp();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop139;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, table_ref_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "table_ref_list"


    // $ANTLR start "where_clause"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:454:1: where_clause : WHERE search_condition ;
    public final void where_clause() throws RecognitionException {
        int where_clause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:454:14: ( WHERE search_condition )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:455:5: WHERE search_condition
            {
            match(input,WHERE,FOLLOW_WHERE_in_where_clause3741); if (state.failed) return ;
            pushFollow(FOLLOW_search_condition_in_where_clause3743);
            search_condition();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 108, where_clause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "where_clause"


    // $ANTLR start "group_by_clause"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:457:1: group_by_clause : GROUP BY grouping_column_ref_list ;
    public final void group_by_clause() throws RecognitionException {
        int group_by_clause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:457:17: ( GROUP BY grouping_column_ref_list )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:458:5: GROUP BY grouping_column_ref_list
            {
            match(input,GROUP,FOLLOW_GROUP_in_group_by_clause3757); if (state.failed) return ;
            match(input,BY,FOLLOW_BY_in_group_by_clause3759); if (state.failed) return ;
            pushFollow(FOLLOW_grouping_column_ref_list_in_group_by_clause3761);
            grouping_column_ref_list();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 109, group_by_clause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "group_by_clause"


    // $ANTLR start "grouping_column_ref"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:460:1: grouping_column_ref : value_exp ( collate_clause )? ;
    public final void grouping_column_ref() throws RecognitionException {
        int grouping_column_ref_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:460:21: ( value_exp ( collate_clause )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:461:5: value_exp ( collate_clause )?
            {
            pushFollow(FOLLOW_value_exp_in_grouping_column_ref3775);
            value_exp();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:461:15: ( collate_clause )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==COLLATE) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:461:16: collate_clause
                    {
                    pushFollow(FOLLOW_collate_clause_in_grouping_column_ref3778);
                    collate_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 110, grouping_column_ref_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "grouping_column_ref"


    // $ANTLR start "grouping_column_ref_list"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:463:1: grouping_column_ref_list : grouping_column_ref ( COMMA grouping_column_ref )* ;
    public final void grouping_column_ref_list() throws RecognitionException {
        int grouping_column_ref_list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:463:26: ( grouping_column_ref ( COMMA grouping_column_ref )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:464:5: grouping_column_ref ( COMMA grouping_column_ref )*
            {
            pushFollow(FOLLOW_grouping_column_ref_in_grouping_column_ref_list3794);
            grouping_column_ref();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:464:25: ( COMMA grouping_column_ref )*
            loop141:
            do {
                int alt141=2;
                alt141 = dfa141.predict(input);
                switch (alt141) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:464:26: COMMA grouping_column_ref
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_grouping_column_ref_list3797); if (state.failed) return ;
            	    pushFollow(FOLLOW_grouping_column_ref_in_grouping_column_ref_list3799);
            	    grouping_column_ref();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, grouping_column_ref_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "grouping_column_ref_list"


    // $ANTLR start "having_clause"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:466:1: having_clause : ( HAVING search_condition | QUALIFY search_condition );
    public final void having_clause() throws RecognitionException {
        int having_clause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:466:15: ( HAVING search_condition | QUALIFY search_condition )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==HAVING) ) {
                alt142=1;
            }
            else if ( (LA142_0==QUALIFY) ) {
                alt142=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:467:5: HAVING search_condition
                    {
                    match(input,HAVING,FOLLOW_HAVING_in_having_clause3814); if (state.failed) return ;
                    pushFollow(FOLLOW_search_condition_in_having_clause3816);
                    search_condition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:468:6: QUALIFY search_condition
                    {
                    match(input,QUALIFY,FOLLOW_QUALIFY_in_having_clause3824); if (state.failed) return ;
                    pushFollow(FOLLOW_search_condition_in_having_clause3826);
                    search_condition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 112, having_clause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "having_clause"


    // $ANTLR start "unsigned_value_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:470:1: unsigned_value_spec : ( unsigned_lit | general_value_spec );
    public final void unsigned_value_spec() throws RecognitionException {
        int unsigned_value_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:470:21: ( unsigned_lit | general_value_spec )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( ((LA143_0>=UNSIGNED_INTEGER && LA143_0<=APPROXIMATE_NUM_LIT)||(LA143_0>=NATIONAL_CHAR_STRING_LIT && LA143_0<=HEX_STRING_LIT)||LA143_0==DATE||LA143_0==INTERVAL||(LA143_0>=TIME && LA143_0<=TIMESTAMP)||LA143_0==EXACT_NUM_LIT||LA143_0==CHAR_STRING||LA143_0==INTRODUCER) ) {
                alt143=1;
            }
            else if ( (LA143_0==EMBDD_VARIABLE_NAME||LA143_0==CURRENT_USER||LA143_0==SESSION_USER||LA143_0==SYSTEM_USER||LA143_0==USER||LA143_0==VALUE||LA143_0==COLON||LA143_0==QUESTION_MARK) ) {
                alt143=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:471:7: unsigned_lit
                    {
                    pushFollow(FOLLOW_unsigned_lit_in_unsigned_value_spec3841);
                    unsigned_lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:472:7: general_value_spec
                    {
                    pushFollow(FOLLOW_general_value_spec_in_unsigned_value_spec3850);
                    general_value_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, unsigned_value_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "unsigned_value_spec"


    // $ANTLR start "general_value_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:473:1: general_value_spec : ( parameter_spec | dyn_parameter_spec | variable_spec | USER | CURRENT_USER | SESSION_USER | SYSTEM_USER | VALUE );
    public final void general_value_spec() throws RecognitionException {
        int general_value_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:473:20: ( parameter_spec | dyn_parameter_spec | variable_spec | USER | CURRENT_USER | SESSION_USER | SYSTEM_USER | VALUE )
            int alt144=8;
            switch ( input.LA(1) ) {
            case COLON:
                {
                alt144=1;
                }
                break;
            case QUESTION_MARK:
                {
                alt144=2;
                }
                break;
            case EMBDD_VARIABLE_NAME:
                {
                alt144=3;
                }
                break;
            case USER:
                {
                alt144=4;
                }
                break;
            case CURRENT_USER:
                {
                alt144=5;
                }
                break;
            case SESSION_USER:
                {
                alt144=6;
                }
                break;
            case SYSTEM_USER:
                {
                alt144=7;
                }
                break;
            case VALUE:
                {
                alt144=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;
            }

            switch (alt144) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:474:7: parameter_spec
                    {
                    pushFollow(FOLLOW_parameter_spec_in_general_value_spec3865);
                    parameter_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:475:7: dyn_parameter_spec
                    {
                    pushFollow(FOLLOW_dyn_parameter_spec_in_general_value_spec3874);
                    dyn_parameter_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:476:7: variable_spec
                    {
                    pushFollow(FOLLOW_variable_spec_in_general_value_spec3883);
                    variable_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:477:7: USER
                    {
                    match(input,USER,FOLLOW_USER_in_general_value_spec3892); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:478:7: CURRENT_USER
                    {
                    match(input,CURRENT_USER,FOLLOW_CURRENT_USER_in_general_value_spec3900); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:479:7: SESSION_USER
                    {
                    match(input,SESSION_USER,FOLLOW_SESSION_USER_in_general_value_spec3908); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:480:7: SYSTEM_USER
                    {
                    match(input,SYSTEM_USER,FOLLOW_SYSTEM_USER_in_general_value_spec3916); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:481:7: VALUE
                    {
                    match(input,VALUE,FOLLOW_VALUE_in_general_value_spec3924); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 114, general_value_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "general_value_spec"


    // $ANTLR start "parameter_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:483:1: parameter_spec : parameter_name ( ( INDICATOR )? parameter_name )? ;
    public final void parameter_spec() throws RecognitionException {
        int parameter_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:483:16: ( parameter_name ( ( INDICATOR )? parameter_name )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:484:5: parameter_name ( ( INDICATOR )? parameter_name )?
            {
            pushFollow(FOLLOW_parameter_name_in_parameter_spec3938);
            parameter_name();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:484:20: ( ( INDICATOR )? parameter_name )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==INDICATOR||LA146_0==COLON) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:484:21: ( INDICATOR )? parameter_name
                    {
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:484:21: ( INDICATOR )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==INDICATOR) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:484:22: INDICATOR
                            {
                            match(input,INDICATOR,FOLLOW_INDICATOR_in_parameter_spec3942); if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_parameter_name_in_parameter_spec3946);
                    parameter_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 115, parameter_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "parameter_spec"


    // $ANTLR start "dyn_parameter_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:486:1: dyn_parameter_spec : QUESTION_MARK ;
    public final void dyn_parameter_spec() throws RecognitionException {
        int dyn_parameter_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:486:20: ( QUESTION_MARK )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:487:5: QUESTION_MARK
            {
            match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_dyn_parameter_spec3962); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 116, dyn_parameter_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "dyn_parameter_spec"


    // $ANTLR start "variable_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:489:1: variable_spec : EMBDD_VARIABLE_NAME ( ( INDICATOR )? EMBDD_VARIABLE_NAME )? ;
    public final void variable_spec() throws RecognitionException {
        int variable_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:489:15: ( EMBDD_VARIABLE_NAME ( ( INDICATOR )? EMBDD_VARIABLE_NAME )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:490:5: EMBDD_VARIABLE_NAME ( ( INDICATOR )? EMBDD_VARIABLE_NAME )?
            {
            match(input,EMBDD_VARIABLE_NAME,FOLLOW_EMBDD_VARIABLE_NAME_in_variable_spec3976); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:490:25: ( ( INDICATOR )? EMBDD_VARIABLE_NAME )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==EMBDD_VARIABLE_NAME||LA148_0==INDICATOR) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:490:26: ( INDICATOR )? EMBDD_VARIABLE_NAME
                    {
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:490:26: ( INDICATOR )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==INDICATOR) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:490:27: INDICATOR
                            {
                            match(input,INDICATOR,FOLLOW_INDICATOR_in_variable_spec3980); if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,EMBDD_VARIABLE_NAME,FOLLOW_EMBDD_VARIABLE_NAME_in_variable_spec3984); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 117, variable_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "variable_spec"


    // $ANTLR start "num_value_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:492:1: num_value_exp : value_exp ;
    public final void num_value_exp() throws RecognitionException {
        int num_value_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:492:15: ( value_exp )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:493:5: value_exp
            {
            pushFollow(FOLLOW_value_exp_in_num_value_exp4000);
            value_exp();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 118, num_value_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "num_value_exp"


    // $ANTLR start "string_value_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:495:1: string_value_exp : char_value_exp ;
    public final void string_value_exp() throws RecognitionException {
        int string_value_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:495:18: ( char_value_exp )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:496:5: char_value_exp
            {
            pushFollow(FOLLOW_char_value_exp_in_string_value_exp4014);
            char_value_exp();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 119, string_value_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "string_value_exp"


    // $ANTLR start "datetime_value_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:498:1: datetime_value_exp : value_exp ;
    public final void datetime_value_exp() throws RecognitionException {
        int datetime_value_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:498:20: ( value_exp )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:499:5: value_exp
            {
            pushFollow(FOLLOW_value_exp_in_datetime_value_exp4028);
            value_exp();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 120, datetime_value_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "datetime_value_exp"


    // $ANTLR start "interval_value_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:501:1: interval_value_exp : value_exp ;
    public final void interval_value_exp() throws RecognitionException {
        int interval_value_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:501:20: ( value_exp )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:502:5: value_exp
            {
            pushFollow(FOLLOW_value_exp_in_interval_value_exp4042);
            value_exp();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 121, interval_value_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "interval_value_exp"


    // $ANTLR start "char_value_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:504:1: char_value_exp : value_exp ;
    public final void char_value_exp() throws RecognitionException {
        int char_value_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:504:16: ( value_exp )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:505:5: value_exp
            {
            pushFollow(FOLLOW_value_exp_in_char_value_exp4055);
            value_exp();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 122, char_value_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "char_value_exp"


    // $ANTLR start "value_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:507:1: value_exp : term ( options {greedy=true; } : ( term_op | CONCATENATION_OP ) term )* ;
    public final void value_exp() throws RecognitionException {
        int value_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:507:11: ( term ( options {greedy=true; } : ( term_op | CONCATENATION_OP ) term )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:508:5: term ( options {greedy=true; } : ( term_op | CONCATENATION_OP ) term )*
            {
            pushFollow(FOLLOW_term_in_value_exp4068);
            term();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:508:10: ( options {greedy=true; } : ( term_op | CONCATENATION_OP ) term )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==MINUS_SIGN||LA150_0==MOD||LA150_0==PLUS_SIGN) ) {
                    int LA150_2 = input.LA(2);

                    if ( (synpred219_DmlSQL2Parser()) ) {
                        alt150=1;
                    }


                }
                else if ( (LA150_0==CONCATENATION_OP) ) {
                    int LA150_3 = input.LA(2);

                    if ( (synpred219_DmlSQL2Parser()) ) {
                        alt150=1;
                    }


                }


                switch (alt150) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:508:33: ( term_op | CONCATENATION_OP ) term
            	    {
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:508:33: ( term_op | CONCATENATION_OP )
            	    int alt149=2;
            	    int LA149_0 = input.LA(1);

            	    if ( (LA149_0==MINUS_SIGN||LA149_0==MOD||LA149_0==PLUS_SIGN) ) {
            	        alt149=1;
            	    }
            	    else if ( (LA149_0==CONCATENATION_OP) ) {
            	        alt149=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 149, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt149) {
            	        case 1 :
            	            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:508:34: term_op
            	            {
            	            pushFollow(FOLLOW_term_op_in_value_exp4079);
            	            term_op();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:508:44: CONCATENATION_OP
            	            {
            	            match(input,CONCATENATION_OP,FOLLOW_CONCATENATION_OP_in_value_exp4083); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_value_exp4086);
            	    term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop150;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 123, value_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "value_exp"


    // $ANTLR start "string_value_fct"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:510:1: string_value_fct : char_value_fct ;
    public final void string_value_fct() throws RecognitionException {
        int string_value_fct_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:510:18: ( char_value_fct )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:511:7: char_value_fct
            {
            pushFollow(FOLLOW_char_value_fct_in_string_value_fct4105);
            char_value_fct();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 124, string_value_fct_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "string_value_fct"


    // $ANTLR start "char_value_fct"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:513:1: char_value_fct : ( char_substring_fct | char_length_fct | fold | form_conversion | char_translation | trim_fct | CHAR_STRING );
    public final void char_value_fct() throws RecognitionException {
        int char_value_fct_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:513:16: ( char_substring_fct | char_length_fct | fold | form_conversion | char_translation | trim_fct | CHAR_STRING )
            int alt151=7;
            switch ( input.LA(1) ) {
            case SUBSTRING:
                {
                alt151=1;
                }
                break;
            case CHAR:
                {
                alt151=2;
                }
                break;
            case LOWER:
            case UPPER:
                {
                alt151=3;
                }
                break;
            case CONVERT:
                {
                alt151=4;
                }
                break;
            case TRANSLATE:
                {
                alt151=5;
                }
                break;
            case TRIM:
                {
                alt151=6;
                }
                break;
            case CHAR_STRING:
                {
                alt151=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }

            switch (alt151) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:514:7: char_substring_fct
                    {
                    pushFollow(FOLLOW_char_substring_fct_in_char_value_fct4121);
                    char_substring_fct();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:515:7: char_length_fct
                    {
                    pushFollow(FOLLOW_char_length_fct_in_char_value_fct4130);
                    char_length_fct();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:516:7: fold
                    {
                    pushFollow(FOLLOW_fold_in_char_value_fct4138);
                    fold();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:517:7: form_conversion
                    {
                    pushFollow(FOLLOW_form_conversion_in_char_value_fct4147);
                    form_conversion();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:518:7: char_translation
                    {
                    pushFollow(FOLLOW_char_translation_in_char_value_fct4156);
                    char_translation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:519:7: trim_fct
                    {
                    pushFollow(FOLLOW_trim_fct_in_char_value_fct4165);
                    trim_fct();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:520:7: CHAR_STRING
                    {
                    match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_char_value_fct4174); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 125, char_value_fct_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "char_value_fct"


    // $ANTLR start "char_length_fct"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:522:1: char_length_fct : CHAR LEFT_PAREN char_value_exp RIGHT_PAREN ;
    public final void char_length_fct() throws RecognitionException {
        int char_length_fct_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:522:16: ( CHAR LEFT_PAREN char_value_exp RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:523:2: CHAR LEFT_PAREN char_value_exp RIGHT_PAREN
            {
            match(input,CHAR,FOLLOW_CHAR_in_char_length_fct4182); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_char_length_fct4184); if (state.failed) return ;
            pushFollow(FOLLOW_char_value_exp_in_char_length_fct4186);
            char_value_exp();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_char_length_fct4188); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 126, char_length_fct_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "char_length_fct"


    // $ANTLR start "char_substring_fct"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:524:1: char_substring_fct : SUBSTRING LEFT_PAREN char_value_exp FROM num_value_exp ( FOR num_value_exp )? RIGHT_PAREN ;
    public final void char_substring_fct() throws RecognitionException {
        int char_substring_fct_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:524:20: ( SUBSTRING LEFT_PAREN char_value_exp FROM num_value_exp ( FOR num_value_exp )? RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:525:5: SUBSTRING LEFT_PAREN char_value_exp FROM num_value_exp ( FOR num_value_exp )? RIGHT_PAREN
            {
            match(input,SUBSTRING,FOLLOW_SUBSTRING_in_char_substring_fct4200); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_char_substring_fct4202); if (state.failed) return ;
            pushFollow(FOLLOW_char_value_exp_in_char_substring_fct4204);
            char_value_exp();

            state._fsp--;
            if (state.failed) return ;
            match(input,FROM,FOLLOW_FROM_in_char_substring_fct4206); if (state.failed) return ;
            pushFollow(FOLLOW_num_value_exp_in_char_substring_fct4208);
            num_value_exp();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:526:5: ( FOR num_value_exp )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==FOR) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:526:6: FOR num_value_exp
                    {
                    match(input,FOR,FOLLOW_FOR_in_char_substring_fct4216); if (state.failed) return ;
                    pushFollow(FOLLOW_num_value_exp_in_char_substring_fct4218);
                    num_value_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_char_substring_fct4227); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 127, char_substring_fct_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "char_substring_fct"


    // $ANTLR start "fold"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:529:1: fold : ( UPPER | LOWER ) LEFT_PAREN char_value_exp RIGHT_PAREN ;
    public final void fold() throws RecognitionException {
        int fold_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:529:6: ( ( UPPER | LOWER ) LEFT_PAREN char_value_exp RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:530:5: ( UPPER | LOWER ) LEFT_PAREN char_value_exp RIGHT_PAREN
            {
            if ( input.LA(1)==LOWER||input.LA(1)==UPPER ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_fold4249); if (state.failed) return ;
            pushFollow(FOLLOW_char_value_exp_in_fold4251);
            char_value_exp();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_fold4253); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 128, fold_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "fold"


    // $ANTLR start "form_conversion"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:532:1: form_conversion : CONVERT LEFT_PAREN char_value_exp USING form_conversion_name RIGHT_PAREN ;
    public final void form_conversion() throws RecognitionException {
        int form_conversion_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:532:17: ( CONVERT LEFT_PAREN char_value_exp USING form_conversion_name RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:533:5: CONVERT LEFT_PAREN char_value_exp USING form_conversion_name RIGHT_PAREN
            {
            match(input,CONVERT,FOLLOW_CONVERT_in_form_conversion4267); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_form_conversion4269); if (state.failed) return ;
            pushFollow(FOLLOW_char_value_exp_in_form_conversion4271);
            char_value_exp();

            state._fsp--;
            if (state.failed) return ;
            match(input,USING,FOLLOW_USING_in_form_conversion4273); if (state.failed) return ;
            pushFollow(FOLLOW_form_conversion_name_in_form_conversion4275);
            form_conversion_name();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_form_conversion4277); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 129, form_conversion_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "form_conversion"


    // $ANTLR start "char_translation"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:535:1: char_translation : TRANSLATE LEFT_PAREN char_value_exp USING translation_name RIGHT_PAREN ;
    public final void char_translation() throws RecognitionException {
        int char_translation_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:535:18: ( TRANSLATE LEFT_PAREN char_value_exp USING translation_name RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:536:5: TRANSLATE LEFT_PAREN char_value_exp USING translation_name RIGHT_PAREN
            {
            match(input,TRANSLATE,FOLLOW_TRANSLATE_in_char_translation4291); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_char_translation4293); if (state.failed) return ;
            pushFollow(FOLLOW_char_value_exp_in_char_translation4295);
            char_value_exp();

            state._fsp--;
            if (state.failed) return ;
            match(input,USING,FOLLOW_USING_in_char_translation4297); if (state.failed) return ;
            pushFollow(FOLLOW_translation_name_in_char_translation4299);
            translation_name();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_char_translation4301); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 130, char_translation_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "char_translation"


    // $ANTLR start "trim_fct"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:538:1: trim_fct : TRIM LEFT_PAREN trim_operands RIGHT_PAREN ;
    public final void trim_fct() throws RecognitionException {
        int trim_fct_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:538:10: ( TRIM LEFT_PAREN trim_operands RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:539:5: TRIM LEFT_PAREN trim_operands RIGHT_PAREN
            {
            match(input,TRIM,FOLLOW_TRIM_in_trim_fct4315); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_trim_fct4317); if (state.failed) return ;
            pushFollow(FOLLOW_trim_operands_in_trim_fct4319);
            trim_operands();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_trim_fct4321); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 131, trim_fct_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "trim_fct"


    // $ANTLR start "trim_operands"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:541:1: trim_operands : ( trim_spec FROM char_value_exp | trim_spec char_value_exp FROM char_value_exp | FROM char_value_exp | char_value_exp ( FROM char_value_exp )? );
    public final void trim_operands() throws RecognitionException {
        int trim_operands_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:541:15: ( trim_spec FROM char_value_exp | trim_spec char_value_exp FROM char_value_exp | FROM char_value_exp | char_value_exp ( FROM char_value_exp )? )
            int alt154=4;
            switch ( input.LA(1) ) {
            case BOTH:
            case LEADING:
            case TRAILING:
                {
                int LA154_1 = input.LA(2);

                if ( (LA154_1==FROM) ) {
                    alt154=1;
                }
                else if ( ((LA154_1>=UNSIGNED_INTEGER && LA154_1<=APPROXIMATE_NUM_LIT)||LA154_1==MINUS_SIGN||(LA154_1>=NATIONAL_CHAR_STRING_LIT && LA154_1<=EMBDD_VARIABLE_NAME)||LA154_1==ADA||LA154_1==AVG||LA154_1==BIT_LENGTH||(LA154_1>=CASE && LA154_1<=CAST)||(LA154_1>=CHAR && LA154_1<=CHAR_LENGTH)||(LA154_1>=CHARACTER_LENGTH && LA154_1<=COALESCE)||LA154_1==CONVERT||LA154_1==COUNT||LA154_1==CURRENT_DATE||(LA154_1>=CURRENT_TIME && LA154_1<=DATE)||LA154_1==EXTRACT||LA154_1==INTERVAL||LA154_1==LOWER||(LA154_1>=MAX && LA154_1<=MIN)||LA154_1==NULLIF||LA154_1==OCTET_LENGTH||LA154_1==POSITION||LA154_1==SESSION_USER||(LA154_1>=SUBSTRING && LA154_1<=SYSTEM_USER)||(LA154_1>=TIME && LA154_1<=TIMESTAMP)||(LA154_1>=TRANSLATE && LA154_1<=TRIM)||(LA154_1>=UPPER && LA154_1<=USER)||LA154_1==VALUE||(LA154_1>=REGULAR_ID && LA154_1<=EXACT_NUM_LIT)||(LA154_1>=CHAR_STRING && LA154_1<=DELIMITED_ID)||LA154_1==LEFT_PAREN||LA154_1==PLUS_SIGN||LA154_1==COLON||LA154_1==QUESTION_MARK||LA154_1==INTRODUCER) ) {
                    alt154=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 154, 1, input);

                    throw nvae;
                }
                }
                break;
            case FROM:
                {
                alt154=3;
                }
                break;
            case UNSIGNED_INTEGER:
            case APPROXIMATE_NUM_LIT:
            case MINUS_SIGN:
            case NATIONAL_CHAR_STRING_LIT:
            case BIT_STRING_LIT:
            case HEX_STRING_LIT:
            case EMBDD_VARIABLE_NAME:
            case ADA:
            case AVG:
            case BIT_LENGTH:
            case CASE:
            case CAST:
            case CHAR:
            case CHAR_LENGTH:
            case CHARACTER_LENGTH:
            case COALESCE:
            case CONVERT:
            case COUNT:
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
            case CURRENT_USER:
            case DATE:
            case EXTRACT:
            case INTERVAL:
            case LOWER:
            case MAX:
            case MIN:
            case NULLIF:
            case OCTET_LENGTH:
            case POSITION:
            case SESSION_USER:
            case SUBSTRING:
            case SUM:
            case SYSTEM_USER:
            case TIME:
            case TIMESTAMP:
            case TRANSLATE:
            case TRIM:
            case UPPER:
            case USER:
            case VALUE:
            case REGULAR_ID:
            case EXACT_NUM_LIT:
            case CHAR_STRING:
            case DELIMITED_ID:
            case LEFT_PAREN:
            case PLUS_SIGN:
            case COLON:
            case QUESTION_MARK:
            case INTRODUCER:
                {
                alt154=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }

            switch (alt154) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:542:7: trim_spec FROM char_value_exp
                    {
                    pushFollow(FOLLOW_trim_spec_in_trim_operands4337);
                    trim_spec();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,FROM,FOLLOW_FROM_in_trim_operands4339); if (state.failed) return ;
                    pushFollow(FOLLOW_char_value_exp_in_trim_operands4341);
                    char_value_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:543:7: trim_spec char_value_exp FROM char_value_exp
                    {
                    pushFollow(FOLLOW_trim_spec_in_trim_operands4350);
                    trim_spec();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_char_value_exp_in_trim_operands4352);
                    char_value_exp();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,FROM,FOLLOW_FROM_in_trim_operands4354); if (state.failed) return ;
                    pushFollow(FOLLOW_char_value_exp_in_trim_operands4356);
                    char_value_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:544:7: FROM char_value_exp
                    {
                    match(input,FROM,FOLLOW_FROM_in_trim_operands4365); if (state.failed) return ;
                    pushFollow(FOLLOW_char_value_exp_in_trim_operands4367);
                    char_value_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:545:7: char_value_exp ( FROM char_value_exp )?
                    {
                    pushFollow(FOLLOW_char_value_exp_in_trim_operands4376);
                    char_value_exp();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:545:22: ( FROM char_value_exp )?
                    int alt153=2;
                    int LA153_0 = input.LA(1);

                    if ( (LA153_0==FROM) ) {
                        alt153=1;
                    }
                    switch (alt153) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:545:23: FROM char_value_exp
                            {
                            match(input,FROM,FOLLOW_FROM_in_trim_operands4379); if (state.failed) return ;
                            pushFollow(FOLLOW_char_value_exp_in_trim_operands4381);
                            char_value_exp();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 132, trim_operands_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "trim_operands"


    // $ANTLR start "trim_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:547:1: trim_spec : ( LEADING | TRAILING | BOTH );
    public final void trim_spec() throws RecognitionException {
        int trim_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:547:11: ( LEADING | TRAILING | BOTH )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
            {
            if ( input.LA(1)==BOTH||input.LA(1)==LEADING||input.LA(1)==TRAILING ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 133, trim_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "trim_spec"


    // $ANTLR start "term_op"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:552:1: term_op : ( PLUS_SIGN | MINUS_SIGN | MOD );
    public final void term_op() throws RecognitionException {
        int term_op_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:552:9: ( PLUS_SIGN | MINUS_SIGN | MOD )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
            {
            if ( input.LA(1)==MINUS_SIGN||input.LA(1)==MOD||input.LA(1)==PLUS_SIGN ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 134, term_op_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "term_op"


    // $ANTLR start "term"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:555:1: term : factor ( options {greedy=true; } : factor_op factor )* ;
    public final void term() throws RecognitionException {
        int term_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:555:6: ( factor ( options {greedy=true; } : factor_op factor )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:556:5: factor ( options {greedy=true; } : factor_op factor )*
            {
            pushFollow(FOLLOW_factor_in_term4451);
            factor();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:556:12: ( options {greedy=true; } : factor_op factor )*
            loop155:
            do {
                int alt155=2;
                int LA155_0 = input.LA(1);

                if ( (LA155_0==ASTERISK||LA155_0==SOLIDUS) ) {
                    int LA155_2 = input.LA(2);

                    if ( (synpred236_DmlSQL2Parser()) ) {
                        alt155=1;
                    }


                }


                switch (alt155) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:556:35: factor_op factor
            	    {
            	    pushFollow(FOLLOW_factor_op_in_term4461);
            	    factor_op();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_factor_in_term4463);
            	    factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop155;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 135, term_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "term"


    // $ANTLR start "factor_op"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:558:1: factor_op : ( ASTERISK | SOLIDUS );
    public final void factor_op() throws RecognitionException {
        int factor_op_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:558:11: ( ASTERISK | SOLIDUS )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
            {
            if ( input.LA(1)==ASTERISK||input.LA(1)==SOLIDUS ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 136, factor_op_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "factor_op"


    // $ANTLR start "factor"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:561:1: factor : ( sign )? gen_primary ( AT time_zone_specifier | collate_clause )? ( LEFT_PAREN FORMAT CHAR_STRING RIGHT_PAREN )? ;
    public final void factor() throws RecognitionException {
        int factor_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:561:8: ( ( sign )? gen_primary ( AT time_zone_specifier | collate_clause )? ( LEFT_PAREN FORMAT CHAR_STRING RIGHT_PAREN )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:562:5: ( sign )? gen_primary ( AT time_zone_specifier | collate_clause )? ( LEFT_PAREN FORMAT CHAR_STRING RIGHT_PAREN )?
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:562:5: ( sign )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==MINUS_SIGN||LA156_0==PLUS_SIGN) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:562:6: sign
                    {
                    pushFollow(FOLLOW_sign_in_factor4497);
                    sign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_gen_primary_in_factor4501);
            gen_primary();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:562:25: ( AT time_zone_specifier | collate_clause )?
            int alt157=3;
            alt157 = dfa157.predict(input);
            switch (alt157) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:562:26: AT time_zone_specifier
                    {
                    match(input,AT,FOLLOW_AT_in_factor4504); if (state.failed) return ;
                    pushFollow(FOLLOW_time_zone_specifier_in_factor4506);
                    time_zone_specifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:562:51: collate_clause
                    {
                    pushFollow(FOLLOW_collate_clause_in_factor4510);
                    collate_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:562:68: ( LEFT_PAREN FORMAT CHAR_STRING RIGHT_PAREN )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==LEFT_PAREN) ) {
                int LA158_1 = input.LA(2);

                if ( (synpred241_DmlSQL2Parser()) ) {
                    alt158=1;
                }
            }
            switch (alt158) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:562:69: LEFT_PAREN FORMAT CHAR_STRING RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_factor4515); if (state.failed) return ;
                    match(input,FORMAT,FOLLOW_FORMAT_in_factor4517); if (state.failed) return ;
                    match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_factor4519); if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_factor4521); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 137, factor_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "factor"


    // $ANTLR start "collate_clause"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:564:1: collate_clause : COLLATE collation_name ;
    public final void collate_clause() throws RecognitionException {
        int collate_clause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:564:16: ( COLLATE collation_name )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:565:5: COLLATE collation_name
            {
            match(input,COLLATE,FOLLOW_COLLATE_in_collate_clause4536); if (state.failed) return ;
            pushFollow(FOLLOW_collation_name_in_collate_clause4538);
            collation_name();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 138, collate_clause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "collate_clause"


    // $ANTLR start "gen_primary"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:567:1: gen_primary : ( value_exp_primary ( interval_qualifier )? | num_value_fct | string_value_fct | datetime_value_fct );
    public final void gen_primary() throws RecognitionException {
        int gen_primary_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:567:13: ( value_exp_primary ( interval_qualifier )? | num_value_fct | string_value_fct | datetime_value_fct )
            int alt160=4;
            switch ( input.LA(1) ) {
            case UNSIGNED_INTEGER:
            case APPROXIMATE_NUM_LIT:
            case NATIONAL_CHAR_STRING_LIT:
            case BIT_STRING_LIT:
            case HEX_STRING_LIT:
            case EMBDD_VARIABLE_NAME:
            case ADA:
            case AVG:
            case CASE:
            case CAST:
            case COALESCE:
            case COUNT:
            case CURRENT_USER:
            case DATE:
            case INTERVAL:
            case MAX:
            case MIN:
            case NULLIF:
            case SESSION_USER:
            case SUM:
            case SYSTEM_USER:
            case TIME:
            case TIMESTAMP:
            case USER:
            case VALUE:
            case REGULAR_ID:
            case EXACT_NUM_LIT:
            case DELIMITED_ID:
            case LEFT_PAREN:
            case COLON:
            case QUESTION_MARK:
            case INTRODUCER:
                {
                alt160=1;
                }
                break;
            case CHAR_STRING:
                {
                int LA160_2 = input.LA(2);

                if ( ((synpred243_DmlSQL2Parser()||(synpred243_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER)))) ) {
                    alt160=1;
                }
                else if ( (synpred245_DmlSQL2Parser()) ) {
                    alt160=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 160, 2, input);

                    throw nvae;
                }
                }
                break;
            case BIT_LENGTH:
            case CHAR_LENGTH:
            case CHARACTER_LENGTH:
            case EXTRACT:
            case OCTET_LENGTH:
            case POSITION:
                {
                alt160=2;
                }
                break;
            case CHAR:
            case CONVERT:
            case LOWER:
            case SUBSTRING:
            case TRANSLATE:
            case TRIM:
            case UPPER:
                {
                alt160=3;
                }
                break;
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
                {
                alt160=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }

            switch (alt160) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:568:7: value_exp_primary ( interval_qualifier )?
                    {
                    pushFollow(FOLLOW_value_exp_primary_in_gen_primary4554);
                    value_exp_primary();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:568:25: ( interval_qualifier )?
                    int alt159=2;
                    int LA159_0 = input.LA(1);

                    if ( (LA159_0==DAY||LA159_0==HOUR||LA159_0==MINUTE||LA159_0==MONTH||LA159_0==SECOND||LA159_0==YEAR) ) {
                        alt159=1;
                    }
                    switch (alt159) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:568:26: interval_qualifier
                            {
                            pushFollow(FOLLOW_interval_qualifier_in_gen_primary4557);
                            interval_qualifier();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:569:7: num_value_fct
                    {
                    pushFollow(FOLLOW_num_value_fct_in_gen_primary4568);
                    num_value_fct();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:570:7: string_value_fct
                    {
                    pushFollow(FOLLOW_string_value_fct_in_gen_primary4576);
                    string_value_fct();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:571:7: datetime_value_fct
                    {
                    pushFollow(FOLLOW_datetime_value_fct_in_gen_primary4585);
                    datetime_value_fct();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 139, gen_primary_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "gen_primary"


    // $ANTLR start "num_value_fct"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:573:1: num_value_fct : ( position_exp | extract_exp | length_exp );
    public final void num_value_fct() throws RecognitionException {
        int num_value_fct_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:573:15: ( position_exp | extract_exp | length_exp )
            int alt161=3;
            switch ( input.LA(1) ) {
            case POSITION:
                {
                alt161=1;
                }
                break;
            case EXTRACT:
                {
                alt161=2;
                }
                break;
            case BIT_LENGTH:
            case CHAR_LENGTH:
            case CHARACTER_LENGTH:
            case OCTET_LENGTH:
                {
                alt161=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;
            }

            switch (alt161) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:574:7: position_exp
                    {
                    pushFollow(FOLLOW_position_exp_in_num_value_fct4600);
                    position_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:575:7: extract_exp
                    {
                    pushFollow(FOLLOW_extract_exp_in_num_value_fct4609);
                    extract_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:576:7: length_exp
                    {
                    pushFollow(FOLLOW_length_exp_in_num_value_fct4618);
                    length_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 140, num_value_fct_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "num_value_fct"


    // $ANTLR start "position_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:578:1: position_exp : POSITION LEFT_PAREN char_value_exp IN char_value_exp RIGHT_PAREN ;
    public final void position_exp() throws RecognitionException {
        int position_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:578:14: ( POSITION LEFT_PAREN char_value_exp IN char_value_exp RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:579:5: POSITION LEFT_PAREN char_value_exp IN char_value_exp RIGHT_PAREN
            {
            match(input,POSITION,FOLLOW_POSITION_in_position_exp4632); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_position_exp4634); if (state.failed) return ;
            pushFollow(FOLLOW_char_value_exp_in_position_exp4636);
            char_value_exp();

            state._fsp--;
            if (state.failed) return ;
            match(input,IN,FOLLOW_IN_in_position_exp4638); if (state.failed) return ;
            pushFollow(FOLLOW_char_value_exp_in_position_exp4640);
            char_value_exp();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_position_exp4642); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 141, position_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "position_exp"


    // $ANTLR start "extract_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:581:1: extract_exp : EXTRACT LEFT_PAREN extract_field FROM extract_source RIGHT_PAREN ;
    public final void extract_exp() throws RecognitionException {
        int extract_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:581:13: ( EXTRACT LEFT_PAREN extract_field FROM extract_source RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:582:5: EXTRACT LEFT_PAREN extract_field FROM extract_source RIGHT_PAREN
            {
            match(input,EXTRACT,FOLLOW_EXTRACT_in_extract_exp4656); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_extract_exp4658); if (state.failed) return ;
            pushFollow(FOLLOW_extract_field_in_extract_exp4660);
            extract_field();

            state._fsp--;
            if (state.failed) return ;
            match(input,FROM,FOLLOW_FROM_in_extract_exp4662); if (state.failed) return ;
            pushFollow(FOLLOW_extract_source_in_extract_exp4664);
            extract_source();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_extract_exp4666); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 142, extract_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "extract_exp"


    // $ANTLR start "extract_field"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:584:1: extract_field : ( datetime_field | time_zone_field );
    public final void extract_field() throws RecognitionException {
        int extract_field_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:584:15: ( datetime_field | time_zone_field )
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==DAY||LA162_0==HOUR||LA162_0==MINUTE||LA162_0==MONTH||LA162_0==SECOND||LA162_0==YEAR) ) {
                alt162=1;
            }
            else if ( ((LA162_0>=TIMEZONE_HOUR && LA162_0<=TIMEZONE_MINUTE)) ) {
                alt162=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;
            }
            switch (alt162) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:585:7: datetime_field
                    {
                    pushFollow(FOLLOW_datetime_field_in_extract_field4682);
                    datetime_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:586:7: time_zone_field
                    {
                    pushFollow(FOLLOW_time_zone_field_in_extract_field4691);
                    time_zone_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 143, extract_field_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "extract_field"


    // $ANTLR start "datetime_field"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:588:1: datetime_field : ( non_second_datetime_field | SECOND );
    public final void datetime_field() throws RecognitionException {
        int datetime_field_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:588:16: ( non_second_datetime_field | SECOND )
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==DAY||LA163_0==HOUR||LA163_0==MINUTE||LA163_0==MONTH||LA163_0==YEAR) ) {
                alt163=1;
            }
            else if ( (LA163_0==SECOND) ) {
                alt163=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }
            switch (alt163) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:589:7: non_second_datetime_field
                    {
                    pushFollow(FOLLOW_non_second_datetime_field_in_datetime_field4707);
                    non_second_datetime_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:590:7: SECOND
                    {
                    match(input,SECOND,FOLLOW_SECOND_in_datetime_field4716); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 144, datetime_field_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "datetime_field"


    // $ANTLR start "time_zone_field"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:592:1: time_zone_field : ( TIMEZONE_HOUR | TIMEZONE_MINUTE );
    public final void time_zone_field() throws RecognitionException {
        int time_zone_field_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:592:17: ( TIMEZONE_HOUR | TIMEZONE_MINUTE )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
            {
            if ( (input.LA(1)>=TIMEZONE_HOUR && input.LA(1)<=TIMEZONE_MINUTE) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 145, time_zone_field_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "time_zone_field"


    // $ANTLR start "extract_source"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:596:1: extract_source : datetime_value_exp ;
    public final void extract_source() throws RecognitionException {
        int extract_source_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:596:16: ( datetime_value_exp )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:597:7: datetime_value_exp
            {
            pushFollow(FOLLOW_datetime_value_exp_in_extract_source4757);
            datetime_value_exp();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 146, extract_source_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "extract_source"


    // $ANTLR start "length_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:599:1: length_exp : ( char_length_exp | octet_length_exp | bit_length_exp );
    public final void length_exp() throws RecognitionException {
        int length_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:599:12: ( char_length_exp | octet_length_exp | bit_length_exp )
            int alt164=3;
            switch ( input.LA(1) ) {
            case CHAR_LENGTH:
            case CHARACTER_LENGTH:
                {
                alt164=1;
                }
                break;
            case OCTET_LENGTH:
                {
                alt164=2;
                }
                break;
            case BIT_LENGTH:
                {
                alt164=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }

            switch (alt164) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:600:7: char_length_exp
                    {
                    pushFollow(FOLLOW_char_length_exp_in_length_exp4773);
                    char_length_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:601:7: octet_length_exp
                    {
                    pushFollow(FOLLOW_octet_length_exp_in_length_exp4782);
                    octet_length_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:602:7: bit_length_exp
                    {
                    pushFollow(FOLLOW_bit_length_exp_in_length_exp4791);
                    bit_length_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 147, length_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "length_exp"


    // $ANTLR start "char_length_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:604:1: char_length_exp : ( CHAR_LENGTH | CHARACTER_LENGTH ) LEFT_PAREN string_value_exp RIGHT_PAREN ;
    public final void char_length_exp() throws RecognitionException {
        int char_length_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:604:17: ( ( CHAR_LENGTH | CHARACTER_LENGTH ) LEFT_PAREN string_value_exp RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:605:5: ( CHAR_LENGTH | CHARACTER_LENGTH ) LEFT_PAREN string_value_exp RIGHT_PAREN
            {
            if ( input.LA(1)==CHAR_LENGTH||input.LA(1)==CHARACTER_LENGTH ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_char_length_exp4813); if (state.failed) return ;
            pushFollow(FOLLOW_string_value_exp_in_char_length_exp4815);
            string_value_exp();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_char_length_exp4817); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 148, char_length_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "char_length_exp"


    // $ANTLR start "octet_length_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:607:1: octet_length_exp : OCTET_LENGTH LEFT_PAREN string_value_exp RIGHT_PAREN ;
    public final void octet_length_exp() throws RecognitionException {
        int octet_length_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:607:18: ( OCTET_LENGTH LEFT_PAREN string_value_exp RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:608:5: OCTET_LENGTH LEFT_PAREN string_value_exp RIGHT_PAREN
            {
            match(input,OCTET_LENGTH,FOLLOW_OCTET_LENGTH_in_octet_length_exp4831); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_octet_length_exp4833); if (state.failed) return ;
            pushFollow(FOLLOW_string_value_exp_in_octet_length_exp4835);
            string_value_exp();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_octet_length_exp4837); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 149, octet_length_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "octet_length_exp"


    // $ANTLR start "bit_length_exp"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:610:1: bit_length_exp : BIT_LENGTH LEFT_PAREN string_value_exp RIGHT_PAREN ;
    public final void bit_length_exp() throws RecognitionException {
        int bit_length_exp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:610:16: ( BIT_LENGTH LEFT_PAREN string_value_exp RIGHT_PAREN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:611:5: BIT_LENGTH LEFT_PAREN string_value_exp RIGHT_PAREN
            {
            match(input,BIT_LENGTH,FOLLOW_BIT_LENGTH_in_bit_length_exp4851); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_bit_length_exp4853); if (state.failed) return ;
            pushFollow(FOLLOW_string_value_exp_in_bit_length_exp4855);
            string_value_exp();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_bit_length_exp4857); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 150, bit_length_exp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bit_length_exp"


    // $ANTLR start "time_zone_specifier"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:622:1: time_zone_specifier : ( LOCAL | TIME ZONE interval_value_exp );
    public final void time_zone_specifier() throws RecognitionException {
        int time_zone_specifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:622:21: ( LOCAL | TIME ZONE interval_value_exp )
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==LOCAL) ) {
                alt165=1;
            }
            else if ( (LA165_0==TIME) ) {
                alt165=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }
            switch (alt165) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:623:7: LOCAL
                    {
                    match(input,LOCAL,FOLLOW_LOCAL_in_time_zone_specifier4879); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:624:7: TIME ZONE interval_value_exp
                    {
                    match(input,TIME,FOLLOW_TIME_in_time_zone_specifier4888); if (state.failed) return ;
                    match(input,ZONE,FOLLOW_ZONE_in_time_zone_specifier4890); if (state.failed) return ;
                    pushFollow(FOLLOW_interval_value_exp_in_time_zone_specifier4892);
                    interval_value_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 151, time_zone_specifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "time_zone_specifier"


    // $ANTLR start "datetime_value_fct"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:626:1: datetime_value_fct : ( current_date_value_fct | current_time_value_fct | currenttimestamp_value_fct );
    public final void datetime_value_fct() throws RecognitionException {
        int datetime_value_fct_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:626:20: ( current_date_value_fct | current_time_value_fct | currenttimestamp_value_fct )
            int alt166=3;
            switch ( input.LA(1) ) {
            case CURRENT_DATE:
                {
                alt166=1;
                }
                break;
            case CURRENT_TIME:
                {
                alt166=2;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt166=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }

            switch (alt166) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:627:7: current_date_value_fct
                    {
                    pushFollow(FOLLOW_current_date_value_fct_in_datetime_value_fct4908);
                    current_date_value_fct();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:628:7: current_time_value_fct
                    {
                    pushFollow(FOLLOW_current_time_value_fct_in_datetime_value_fct4917);
                    current_time_value_fct();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:629:7: currenttimestamp_value_fct
                    {
                    pushFollow(FOLLOW_currenttimestamp_value_fct_in_datetime_value_fct4926);
                    currenttimestamp_value_fct();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 152, datetime_value_fct_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "datetime_value_fct"


    // $ANTLR start "currenttimestamp_value_fct"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:631:1: currenttimestamp_value_fct : CURRENT_TIMESTAMP ( LEFT_PAREN timestamp_precision RIGHT_PAREN )? ;
    public final void currenttimestamp_value_fct() throws RecognitionException {
        int currenttimestamp_value_fct_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 153) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:631:28: ( CURRENT_TIMESTAMP ( LEFT_PAREN timestamp_precision RIGHT_PAREN )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:632:5: CURRENT_TIMESTAMP ( LEFT_PAREN timestamp_precision RIGHT_PAREN )?
            {
            match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_currenttimestamp_value_fct4940); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:632:23: ( LEFT_PAREN timestamp_precision RIGHT_PAREN )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==LEFT_PAREN) ) {
                int LA167_1 = input.LA(2);

                if ( (LA167_1==UNSIGNED_INTEGER) ) {
                    alt167=1;
                }
            }
            switch (alt167) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:632:24: LEFT_PAREN timestamp_precision RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_currenttimestamp_value_fct4943); if (state.failed) return ;
                    pushFollow(FOLLOW_timestamp_precision_in_currenttimestamp_value_fct4945);
                    timestamp_precision();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_currenttimestamp_value_fct4947); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 153, currenttimestamp_value_fct_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "currenttimestamp_value_fct"


    // $ANTLR start "current_date_value_fct"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:634:1: current_date_value_fct : CURRENT_DATE ;
    public final void current_date_value_fct() throws RecognitionException {
        int current_date_value_fct_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 154) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:634:24: ( CURRENT_DATE )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:635:5: CURRENT_DATE
            {
            match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_current_date_value_fct4962); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 154, current_date_value_fct_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "current_date_value_fct"


    // $ANTLR start "current_time_value_fct"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:637:1: current_time_value_fct : CURRENT_TIME ( LEFT_PAREN time_precision RIGHT_PAREN )? ;
    public final void current_time_value_fct() throws RecognitionException {
        int current_time_value_fct_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 155) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:637:24: ( CURRENT_TIME ( LEFT_PAREN time_precision RIGHT_PAREN )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:638:5: CURRENT_TIME ( LEFT_PAREN time_precision RIGHT_PAREN )?
            {
            match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_current_time_value_fct4976); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:638:18: ( LEFT_PAREN time_precision RIGHT_PAREN )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==LEFT_PAREN) ) {
                int LA168_1 = input.LA(2);

                if ( (LA168_1==UNSIGNED_INTEGER) ) {
                    alt168=1;
                }
            }
            switch (alt168) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:638:19: LEFT_PAREN time_precision RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_current_time_value_fct4979); if (state.failed) return ;
                    pushFollow(FOLLOW_time_precision_in_current_time_value_fct4981);
                    time_precision();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_current_time_value_fct4983); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 155, current_time_value_fct_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "current_time_value_fct"


    // $ANTLR start "timestamp_precision"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:640:1: timestamp_precision : UNSIGNED_INTEGER ;
    public final void timestamp_precision() throws RecognitionException {
        int timestamp_precision_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 156) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:640:21: ( UNSIGNED_INTEGER )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:641:5: UNSIGNED_INTEGER
            {
            match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_timestamp_precision4999); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 156, timestamp_precision_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "timestamp_precision"


    // $ANTLR start "time_precision"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:643:1: time_precision : UNSIGNED_INTEGER ;
    public final void time_precision() throws RecognitionException {
        int time_precision_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 157) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:643:16: ( UNSIGNED_INTEGER )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:644:5: UNSIGNED_INTEGER
            {
            match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_time_precision5013); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 157, time_precision_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "time_precision"

    public static class table_name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "table_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:646:1: table_name : ( qualified_name | qualified_local_table_name );
    public final DmlSQL2Parser.table_name_return table_name() throws RecognitionException {
        DmlSQL2Parser.table_name_return retval = new DmlSQL2Parser.table_name_return();
        retval.start = input.LT(1);
        int table_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 158) ) { return retval; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:646:12: ( qualified_name | qualified_local_table_name )
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==ADA||LA169_0==REGULAR_ID||LA169_0==DELIMITED_ID||LA169_0==INTRODUCER) ) {
                alt169=1;
            }
            else if ( (LA169_0==MODULE) ) {
                alt169=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 169, 0, input);

                throw nvae;
            }
            switch (alt169) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:647:7: qualified_name
                    {
                    pushFollow(FOLLOW_qualified_name_in_table_name5029);
                    qualified_name();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:648:7: qualified_local_table_name
                    {
                    pushFollow(FOLLOW_qualified_local_table_name_in_table_name5038);
                    qualified_local_table_name();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 158, table_name_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "table_name"


    // $ANTLR start "qualified_local_table_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:650:1: qualified_local_table_name : MODULE PERIOD id ;
    public final void qualified_local_table_name() throws RecognitionException {
        int qualified_local_table_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 159) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:650:28: ( MODULE PERIOD id )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:651:5: MODULE PERIOD id
            {
            match(input,MODULE,FOLLOW_MODULE_in_qualified_local_table_name5050); if (state.failed) return ;
            match(input,PERIOD,FOLLOW_PERIOD_in_qualified_local_table_name5052); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_qualified_local_table_name5054);
            id();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 159, qualified_local_table_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "qualified_local_table_name"


    // $ANTLR start "domain_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:653:1: domain_name : qualified_name ;
    public final void domain_name() throws RecognitionException {
        int domain_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 160) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:653:13: ( qualified_name )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:654:5: qualified_name
            {
            pushFollow(FOLLOW_qualified_name_in_domain_name5068);
            qualified_name();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 160, domain_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "domain_name"

    public static class column_name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "column_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:656:1: column_name : id ;
    public final DmlSQL2Parser.column_name_return column_name() throws RecognitionException {
        DmlSQL2Parser.column_name_return retval = new DmlSQL2Parser.column_name_return();
        retval.start = input.LT(1);
        int column_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 161) ) { return retval; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:656:13: ( id )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:657:5: id
            {
            pushFollow(FOLLOW_id_in_column_name5082);
            id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              if(inFrom==false){sqlinsertinfo.addFirstElem(input.toString(retval.start,input.LT(-1)));}
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 161, column_name_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "column_name"


    // $ANTLR start "column_name_list"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:659:1: column_name_list : column_name ( COMMA column_name )* ;
    public final void column_name_list() throws RecognitionException {
        int column_name_list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 162) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:659:18: ( column_name ( COMMA column_name )* )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:660:5: column_name ( COMMA column_name )*
            {
            pushFollow(FOLLOW_column_name_in_column_name_list5097);
            column_name();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:660:17: ( COMMA column_name )*
            loop170:
            do {
                int alt170=2;
                int LA170_0 = input.LA(1);

                if ( (LA170_0==COMMA) ) {
                    alt170=1;
                }


                switch (alt170) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:660:18: COMMA column_name
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_column_name_list5100); if (state.failed) return ;
            	    pushFollow(FOLLOW_column_name_in_column_name_list5102);
            	    column_name();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop170;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 162, column_name_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "column_name_list"


    // $ANTLR start "correlation_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:662:1: correlation_name : id ;
    public final void correlation_name() throws RecognitionException {
        int correlation_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 163) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:662:18: ( id )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:663:5: id
            {
            pushFollow(FOLLOW_id_in_correlation_name5118);
            id();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 163, correlation_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "correlation_name"


    // $ANTLR start "cursor_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:665:1: cursor_name : id ;
    public final void cursor_name() throws RecognitionException {
        int cursor_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 164) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:665:13: ( id )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:666:5: id
            {
            pushFollow(FOLLOW_id_in_cursor_name5132);
            id();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 164, cursor_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "cursor_name"


    // $ANTLR start "dyn_cursor_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:668:1: dyn_cursor_name : ({...}? ( ( cursor_name )=> cursor_name | extended_cursor_name ) | {...}? cursor_name | extended_cursor_name );
    public final void dyn_cursor_name() throws RecognitionException {
        int dyn_cursor_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 165) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:668:17: ({...}? ( ( cursor_name )=> cursor_name | extended_cursor_name ) | {...}? cursor_name | extended_cursor_name )
            int alt172=3;
            alt172 = dfa172.predict(input);
            switch (alt172) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:669:7: {...}? ( ( cursor_name )=> cursor_name | extended_cursor_name )
                    {
                    if ( !((input.LA(1) == INTRODUCER)) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "dyn_cursor_name", "input.LA(1) == INTRODUCER");
                    }
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:669:36: ( ( cursor_name )=> cursor_name | extended_cursor_name )
                    int alt171=2;
                    alt171 = dfa171.predict(input);
                    switch (alt171) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:669:37: ( cursor_name )=> cursor_name
                            {
                            pushFollow(FOLLOW_cursor_name_in_dyn_cursor_name5155);
                            cursor_name();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:669:66: extended_cursor_name
                            {
                            pushFollow(FOLLOW_extended_cursor_name_in_dyn_cursor_name5159);
                            extended_cursor_name();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:670:7: {...}? cursor_name
                    {
                    if ( !((input.LA(1) != INTRODUCER)) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "dyn_cursor_name", "input.LA(1) != INTRODUCER");
                    }
                    pushFollow(FOLLOW_cursor_name_in_dyn_cursor_name5171);
                    cursor_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:671:7: extended_cursor_name
                    {
                    pushFollow(FOLLOW_extended_cursor_name_in_dyn_cursor_name5180);
                    extended_cursor_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 165, dyn_cursor_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "dyn_cursor_name"


    // $ANTLR start "extended_cursor_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:673:1: extended_cursor_name : ( GLOBAL | LOCAL )? simple_value_spec ;
    public final void extended_cursor_name() throws RecognitionException {
        int extended_cursor_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 166) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:673:22: ( ( GLOBAL | LOCAL )? simple_value_spec )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:674:5: ( GLOBAL | LOCAL )? simple_value_spec
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:674:5: ( GLOBAL | LOCAL )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==GLOBAL||LA173_0==LOCAL) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
                    {
                    if ( input.LA(1)==GLOBAL||input.LA(1)==LOCAL ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_simple_value_spec_in_extended_cursor_name5203);
            simple_value_spec();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 166, extended_cursor_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "extended_cursor_name"


    // $ANTLR start "simple_value_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:676:1: simple_value_spec : ( parameter_name | EMBDD_VARIABLE_NAME | lit );
    public final void simple_value_spec() throws RecognitionException {
        int simple_value_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 167) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:676:19: ( parameter_name | EMBDD_VARIABLE_NAME | lit )
            int alt174=3;
            switch ( input.LA(1) ) {
            case COLON:
                {
                alt174=1;
                }
                break;
            case EMBDD_VARIABLE_NAME:
                {
                alt174=2;
                }
                break;
            case UNSIGNED_INTEGER:
            case APPROXIMATE_NUM_LIT:
            case MINUS_SIGN:
            case NATIONAL_CHAR_STRING_LIT:
            case BIT_STRING_LIT:
            case HEX_STRING_LIT:
            case DATE:
            case INTERVAL:
            case TIME:
            case TIMESTAMP:
            case EXACT_NUM_LIT:
            case CHAR_STRING:
            case PLUS_SIGN:
            case INTRODUCER:
                {
                alt174=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 174, 0, input);

                throw nvae;
            }

            switch (alt174) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:677:7: parameter_name
                    {
                    pushFollow(FOLLOW_parameter_name_in_simple_value_spec5219);
                    parameter_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:678:7: EMBDD_VARIABLE_NAME
                    {
                    match(input,EMBDD_VARIABLE_NAME,FOLLOW_EMBDD_VARIABLE_NAME_in_simple_value_spec5228); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:679:7: lit
                    {
                    pushFollow(FOLLOW_lit_in_simple_value_spec5237);
                    lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 167, simple_value_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "simple_value_spec"


    // $ANTLR start "stmt_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:681:1: stmt_name : id ;
    public final void stmt_name() throws RecognitionException {
        int stmt_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 168) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:681:11: ( id )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:682:5: id
            {
            pushFollow(FOLLOW_id_in_stmt_name5251);
            id();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 168, stmt_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "stmt_name"


    // $ANTLR start "parameter_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:684:1: parameter_name : COLON ( id ( PERIOD id )* | UNSIGNED_INTEGER ) ;
    public final void parameter_name() throws RecognitionException {
        int parameter_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 169) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:684:16: ( COLON ( id ( PERIOD id )* | UNSIGNED_INTEGER ) )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:685:5: COLON ( id ( PERIOD id )* | UNSIGNED_INTEGER )
            {
            match(input,COLON,FOLLOW_COLON_in_parameter_name5265); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:686:7: ( id ( PERIOD id )* | UNSIGNED_INTEGER )
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==ADA||LA176_0==REGULAR_ID||LA176_0==DELIMITED_ID||LA176_0==INTRODUCER) ) {
                alt176=1;
            }
            else if ( (LA176_0==UNSIGNED_INTEGER) ) {
                alt176=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 176, 0, input);

                throw nvae;
            }
            switch (alt176) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:686:9: id ( PERIOD id )*
                    {
                    pushFollow(FOLLOW_id_in_parameter_name5276);
                    id();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:686:12: ( PERIOD id )*
                    loop175:
                    do {
                        int alt175=2;
                        int LA175_0 = input.LA(1);

                        if ( (LA175_0==PERIOD) ) {
                            alt175=1;
                        }


                        switch (alt175) {
                    	case 1 :
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:686:13: PERIOD id
                    	    {
                    	    match(input,PERIOD,FOLLOW_PERIOD_in_parameter_name5279); if (state.failed) return ;
                    	    pushFollow(FOLLOW_id_in_parameter_name5281);
                    	    id();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop175;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:687:9: UNSIGNED_INTEGER
                    {
                    match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parameter_name5293); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 169, parameter_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "parameter_name"


    // $ANTLR start "target_spec"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:690:1: target_spec : ( parameter_spec | variable_spec );
    public final void target_spec() throws RecognitionException {
        int target_spec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 170) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:690:13: ( parameter_spec | variable_spec )
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==COLON) ) {
                alt177=1;
            }
            else if ( (LA177_0==EMBDD_VARIABLE_NAME) ) {
                alt177=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;
            }
            switch (alt177) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:691:7: parameter_spec
                    {
                    pushFollow(FOLLOW_parameter_spec_in_target_spec5316);
                    parameter_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:692:7: variable_spec
                    {
                    pushFollow(FOLLOW_variable_spec_in_target_spec5325);
                    variable_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 170, target_spec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "target_spec"


    // $ANTLR start "column_ref"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:694:1: column_ref : id ( PERIOD id ( PERIOD id ( PERIOD id )? )? )? ;
    public final void column_ref() throws RecognitionException {
        int column_ref_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 171) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:694:12: ( id ( PERIOD id ( PERIOD id ( PERIOD id )? )? )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:695:5: id ( PERIOD id ( PERIOD id ( PERIOD id )? )? )?
            {
            pushFollow(FOLLOW_id_in_column_ref5339);
            id();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:695:8: ( PERIOD id ( PERIOD id ( PERIOD id )? )? )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==PERIOD) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:695:9: PERIOD id ( PERIOD id ( PERIOD id )? )?
                    {
                    match(input,PERIOD,FOLLOW_PERIOD_in_column_ref5342); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_column_ref5344);
                    id();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:695:19: ( PERIOD id ( PERIOD id )? )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==PERIOD) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:695:20: PERIOD id ( PERIOD id )?
                            {
                            match(input,PERIOD,FOLLOW_PERIOD_in_column_ref5347); if (state.failed) return ;
                            pushFollow(FOLLOW_id_in_column_ref5349);
                            id();

                            state._fsp--;
                            if (state.failed) return ;
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:695:30: ( PERIOD id )?
                            int alt178=2;
                            int LA178_0 = input.LA(1);

                            if ( (LA178_0==PERIOD) ) {
                                alt178=1;
                            }
                            switch (alt178) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:695:31: PERIOD id
                                    {
                                    match(input,PERIOD,FOLLOW_PERIOD_in_column_ref5352); if (state.failed) return ;
                                    pushFollow(FOLLOW_id_in_column_ref5354);
                                    id();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 171, column_ref_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "column_ref"


    // $ANTLR start "translation_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:697:1: translation_name : qualified_name ;
    public final void translation_name() throws RecognitionException {
        int translation_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 172) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:697:18: ( qualified_name )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:698:5: qualified_name
            {
            pushFollow(FOLLOW_qualified_name_in_translation_name5374);
            qualified_name();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 172, translation_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "translation_name"


    // $ANTLR start "collation_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:700:1: collation_name : qualified_name ;
    public final void collation_name() throws RecognitionException {
        int collation_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 173) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:700:16: ( qualified_name )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:701:5: qualified_name
            {
            pushFollow(FOLLOW_qualified_name_in_collation_name5388);
            qualified_name();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 173, collation_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "collation_name"


    // $ANTLR start "form_conversion_name"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:703:1: form_conversion_name : qualified_name ;
    public final void form_conversion_name() throws RecognitionException {
        int form_conversion_name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 174) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:703:22: ( qualified_name )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:704:5: qualified_name
            {
            pushFollow(FOLLOW_qualified_name_in_form_conversion_name5402);
            qualified_name();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 174, form_conversion_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "form_conversion_name"


    // $ANTLR start "sign"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:706:1: sign : ( PLUS_SIGN | MINUS_SIGN );
    public final void sign() throws RecognitionException {
        int sign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 175) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:706:6: ( PLUS_SIGN | MINUS_SIGN )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
            {
            if ( input.LA(1)==MINUS_SIGN||input.LA(1)==PLUS_SIGN ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 175, sign_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "sign"


    // $ANTLR start "unsigned_num_lit"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:709:1: unsigned_num_lit : ( UNSIGNED_INTEGER | EXACT_NUM_LIT | APPROXIMATE_NUM_LIT );
    public final void unsigned_num_lit() throws RecognitionException {
        int unsigned_num_lit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 176) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:709:18: ( UNSIGNED_INTEGER | EXACT_NUM_LIT | APPROXIMATE_NUM_LIT )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
            {
            if ( (input.LA(1)>=UNSIGNED_INTEGER && input.LA(1)<=APPROXIMATE_NUM_LIT)||input.LA(1)==EXACT_NUM_LIT ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 176, unsigned_num_lit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "unsigned_num_lit"


    // $ANTLR start "char_string_lit"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:714:1: char_string_lit : ( INTRODUCER char_set_name )? CHAR_STRING ;
    public final void char_string_lit() throws RecognitionException {
        int char_string_lit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 177) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:714:17: ( ( INTRODUCER char_set_name )? CHAR_STRING )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:715:5: ( INTRODUCER char_set_name )? CHAR_STRING
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:715:5: ( INTRODUCER char_set_name )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==INTRODUCER) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:715:6: INTRODUCER char_set_name
                    {
                    match(input,INTRODUCER,FOLLOW_INTRODUCER_in_char_string_lit5465); if (state.failed) return ;
                    pushFollow(FOLLOW_char_set_name_in_char_string_lit5467);
                    char_set_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_char_string_lit5471); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 177, char_string_lit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "char_string_lit"


    // $ANTLR start "unsigned_lit"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:717:1: unsigned_lit : ( unsigned_num_lit | general_lit );
    public final void unsigned_lit() throws RecognitionException {
        int unsigned_lit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 178) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:717:14: ( unsigned_num_lit | general_lit )
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( ((LA182_0>=UNSIGNED_INTEGER && LA182_0<=APPROXIMATE_NUM_LIT)||LA182_0==EXACT_NUM_LIT) ) {
                alt182=1;
            }
            else if ( ((LA182_0>=NATIONAL_CHAR_STRING_LIT && LA182_0<=HEX_STRING_LIT)||LA182_0==DATE||LA182_0==INTERVAL||(LA182_0>=TIME && LA182_0<=TIMESTAMP)||LA182_0==CHAR_STRING||LA182_0==INTRODUCER) ) {
                alt182=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 182, 0, input);

                throw nvae;
            }
            switch (alt182) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:718:7: unsigned_num_lit
                    {
                    pushFollow(FOLLOW_unsigned_num_lit_in_unsigned_lit5486);
                    unsigned_num_lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:719:7: general_lit
                    {
                    pushFollow(FOLLOW_general_lit_in_unsigned_lit5495);
                    general_lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 178, unsigned_lit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "unsigned_lit"


    // $ANTLR start "general_lit"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:721:1: general_lit : ( char_string_lit | NATIONAL_CHAR_STRING_LIT | BIT_STRING_LIT | HEX_STRING_LIT | datetime_lit | interval_lit );
    public final void general_lit() throws RecognitionException {
        int general_lit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 179) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:721:13: ( char_string_lit | NATIONAL_CHAR_STRING_LIT | BIT_STRING_LIT | HEX_STRING_LIT | datetime_lit | interval_lit )
            int alt183=6;
            switch ( input.LA(1) ) {
            case CHAR_STRING:
            case INTRODUCER:
                {
                alt183=1;
                }
                break;
            case NATIONAL_CHAR_STRING_LIT:
                {
                alt183=2;
                }
                break;
            case BIT_STRING_LIT:
                {
                alt183=3;
                }
                break;
            case HEX_STRING_LIT:
                {
                alt183=4;
                }
                break;
            case DATE:
            case TIME:
            case TIMESTAMP:
                {
                alt183=5;
                }
                break;
            case INTERVAL:
                {
                alt183=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 183, 0, input);

                throw nvae;
            }

            switch (alt183) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:722:7: char_string_lit
                    {
                    pushFollow(FOLLOW_char_string_lit_in_general_lit5511);
                    char_string_lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:723:7: NATIONAL_CHAR_STRING_LIT
                    {
                    match(input,NATIONAL_CHAR_STRING_LIT,FOLLOW_NATIONAL_CHAR_STRING_LIT_in_general_lit5520); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:724:7: BIT_STRING_LIT
                    {
                    match(input,BIT_STRING_LIT,FOLLOW_BIT_STRING_LIT_in_general_lit5529); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:725:7: HEX_STRING_LIT
                    {
                    match(input,HEX_STRING_LIT,FOLLOW_HEX_STRING_LIT_in_general_lit5538); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:726:7: datetime_lit
                    {
                    pushFollow(FOLLOW_datetime_lit_in_general_lit5547);
                    datetime_lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:727:7: interval_lit
                    {
                    pushFollow(FOLLOW_interval_lit_in_general_lit5556);
                    interval_lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 179, general_lit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "general_lit"


    // $ANTLR start "datetime_lit"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:729:1: datetime_lit : ( date_lit | time_lit | timestamp_lit );
    public final void datetime_lit() throws RecognitionException {
        int datetime_lit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 180) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:729:14: ( date_lit | time_lit | timestamp_lit )
            int alt184=3;
            switch ( input.LA(1) ) {
            case DATE:
                {
                alt184=1;
                }
                break;
            case TIME:
                {
                alt184=2;
                }
                break;
            case TIMESTAMP:
                {
                alt184=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 184, 0, input);

                throw nvae;
            }

            switch (alt184) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:730:7: date_lit
                    {
                    pushFollow(FOLLOW_date_lit_in_datetime_lit5572);
                    date_lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:731:7: time_lit
                    {
                    pushFollow(FOLLOW_time_lit_in_datetime_lit5581);
                    time_lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:732:7: timestamp_lit
                    {
                    pushFollow(FOLLOW_timestamp_lit_in_datetime_lit5590);
                    timestamp_lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 180, datetime_lit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "datetime_lit"


    // $ANTLR start "date_lit"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:734:1: date_lit : DATE CHAR_STRING ;
    public final void date_lit() throws RecognitionException {
        int date_lit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 181) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:734:10: ( DATE CHAR_STRING )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:735:5: DATE CHAR_STRING
            {
            match(input,DATE,FOLLOW_DATE_in_date_lit5604); if (state.failed) return ;
            match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_date_lit5606); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 181, date_lit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "date_lit"


    // $ANTLR start "interval_lit"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:737:1: interval_lit : INTERVAL ( sign )? CHAR_STRING interval_qualifier ;
    public final void interval_lit() throws RecognitionException {
        int interval_lit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 182) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:737:14: ( INTERVAL ( sign )? CHAR_STRING interval_qualifier )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:738:5: INTERVAL ( sign )? CHAR_STRING interval_qualifier
            {
            match(input,INTERVAL,FOLLOW_INTERVAL_in_interval_lit5620); if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:738:14: ( sign )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==MINUS_SIGN||LA185_0==PLUS_SIGN) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:738:15: sign
                    {
                    pushFollow(FOLLOW_sign_in_interval_lit5623);
                    sign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_interval_lit5627); if (state.failed) return ;
            pushFollow(FOLLOW_interval_qualifier_in_interval_lit5629);
            interval_qualifier();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 182, interval_lit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "interval_lit"


    // $ANTLR start "interval_qualifier"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:740:1: interval_qualifier : ( start_field ( TO end_field | ) | SECOND ( LEFT_PAREN UNSIGNED_INTEGER ( COMMA UNSIGNED_INTEGER )? RIGHT_PAREN )? );
    public final void interval_qualifier() throws RecognitionException {
        int interval_qualifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 183) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:740:20: ( start_field ( TO end_field | ) | SECOND ( LEFT_PAREN UNSIGNED_INTEGER ( COMMA UNSIGNED_INTEGER )? RIGHT_PAREN )? )
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==DAY||LA189_0==HOUR||LA189_0==MINUTE||LA189_0==MONTH||LA189_0==YEAR) ) {
                alt189=1;
            }
            else if ( (LA189_0==SECOND) ) {
                alt189=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 189, 0, input);

                throw nvae;
            }
            switch (alt189) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:741:7: start_field ( TO end_field | )
                    {
                    pushFollow(FOLLOW_start_field_in_interval_qualifier5645);
                    start_field();

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:742:9: ( TO end_field | )
                    int alt186=2;
                    int LA186_0 = input.LA(1);

                    if ( (LA186_0==TO) ) {
                        alt186=1;
                    }
                    else if ( (LA186_0==EOF||LA186_0==UNSIGNED_INTEGER||LA186_0==MINUS_SIGN||(LA186_0>=NOT_EQUALS_OP && LA186_0<=CONCATENATION_OP)||LA186_0==ADA||LA186_0==AND||LA186_0==AS||LA186_0==AT||LA186_0==BETWEEN||LA186_0==COLLATE||LA186_0==CROSS||LA186_0==DAY||(LA186_0>=ELSE && LA186_0<=ESCAPE)||LA186_0==EXCEPT||(LA186_0>=FORMAT && LA186_0<=FULL)||(LA186_0>=GROUP && LA186_0<=IN)||LA186_0==INNER||LA186_0==INTERSECT||(LA186_0>=INTO && LA186_0<=IS)||LA186_0==JOIN||LA186_0==LEFT||LA186_0==LIKE||LA186_0==MATCH||(LA186_0>=MINUTE && LA186_0<=MOD)||LA186_0==MONTH||LA186_0==NATURAL||LA186_0==NOT||LA186_0==ON||(LA186_0>=OR && LA186_0<=ORDER)||LA186_0==OVERLAPS||LA186_0==QUALIFY||(LA186_0>=RIGHT && LA186_0<=SECOND)||LA186_0==THEN||LA186_0==UNION||LA186_0==USING||(LA186_0>=WHEN && LA186_0<=WHERE)||LA186_0==YEAR||LA186_0==REGULAR_ID||(LA186_0>=CHAR_STRING && LA186_0<=DELIMITED_ID)||(LA186_0>=LEFT_PAREN && LA186_0<=SOLIDUS)||(LA186_0>=SEMICOLON && LA186_0<=GREATER_THAN_OP)||LA186_0==INTRODUCER) ) {
                        alt186=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 186, 0, input);

                        throw nvae;
                    }
                    switch (alt186) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:742:11: TO end_field
                            {
                            match(input,TO,FOLLOW_TO_in_interval_qualifier5658); if (state.failed) return ;
                            pushFollow(FOLLOW_end_field_in_interval_qualifier5660);
                            end_field();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:744:9: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:745:7: SECOND ( LEFT_PAREN UNSIGNED_INTEGER ( COMMA UNSIGNED_INTEGER )? RIGHT_PAREN )?
                    {
                    match(input,SECOND,FOLLOW_SECOND_in_interval_qualifier5690); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:746:9: ( LEFT_PAREN UNSIGNED_INTEGER ( COMMA UNSIGNED_INTEGER )? RIGHT_PAREN )?
                    int alt188=2;
                    int LA188_0 = input.LA(1);

                    if ( (LA188_0==LEFT_PAREN) ) {
                        int LA188_1 = input.LA(2);

                        if ( (LA188_1==UNSIGNED_INTEGER) ) {
                            alt188=1;
                        }
                    }
                    switch (alt188) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:746:11: LEFT_PAREN UNSIGNED_INTEGER ( COMMA UNSIGNED_INTEGER )? RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_interval_qualifier5703); if (state.failed) return ;
                            match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_interval_qualifier5705); if (state.failed) return ;
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:747:9: ( COMMA UNSIGNED_INTEGER )?
                            int alt187=2;
                            int LA187_0 = input.LA(1);

                            if ( (LA187_0==COMMA) ) {
                                alt187=1;
                            }
                            switch (alt187) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:747:10: COMMA UNSIGNED_INTEGER
                                    {
                                    match(input,COMMA,FOLLOW_COMMA_in_interval_qualifier5717); if (state.failed) return ;
                                    match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_interval_qualifier5719); if (state.failed) return ;

                                    }
                                    break;

                            }

                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_interval_qualifier5733); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 183, interval_qualifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "interval_qualifier"


    // $ANTLR start "start_field"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:751:1: start_field : non_second_datetime_field ( LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN )? ;
    public final void start_field() throws RecognitionException {
        int start_field_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 184) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:751:13: ( non_second_datetime_field ( LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:752:5: non_second_datetime_field ( LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN )?
            {
            pushFollow(FOLLOW_non_second_datetime_field_in_start_field5759);
            non_second_datetime_field();

            state._fsp--;
            if (state.failed) return ;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:752:31: ( LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==LEFT_PAREN) ) {
                int LA190_1 = input.LA(2);

                if ( (LA190_1==UNSIGNED_INTEGER) ) {
                    alt190=1;
                }
            }
            switch (alt190) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:752:32: LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_start_field5762); if (state.failed) return ;
                    match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_start_field5764); if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_start_field5766); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 184, start_field_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "start_field"


    // $ANTLR start "end_field"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:754:1: end_field : ( non_second_datetime_field | SECOND ( LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN )? );
    public final void end_field() throws RecognitionException {
        int end_field_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 185) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:754:11: ( non_second_datetime_field | SECOND ( LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN )? )
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( (LA192_0==DAY||LA192_0==HOUR||LA192_0==MINUTE||LA192_0==MONTH||LA192_0==YEAR) ) {
                alt192=1;
            }
            else if ( (LA192_0==SECOND) ) {
                alt192=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 192, 0, input);

                throw nvae;
            }
            switch (alt192) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:755:7: non_second_datetime_field
                    {
                    pushFollow(FOLLOW_non_second_datetime_field_in_end_field5784);
                    non_second_datetime_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:756:7: SECOND ( LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN )?
                    {
                    match(input,SECOND,FOLLOW_SECOND_in_end_field5793); if (state.failed) return ;
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:756:14: ( LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN )?
                    int alt191=2;
                    int LA191_0 = input.LA(1);

                    if ( (LA191_0==LEFT_PAREN) ) {
                        int LA191_1 = input.LA(2);

                        if ( (LA191_1==UNSIGNED_INTEGER) ) {
                            alt191=1;
                        }
                    }
                    switch (alt191) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:756:15: LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
                            {
                            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_end_field5796); if (state.failed) return ;
                            match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_end_field5798); if (state.failed) return ;
                            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_end_field5800); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 185, end_field_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "end_field"


    // $ANTLR start "non_second_datetime_field"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:758:1: non_second_datetime_field : ( YEAR | MONTH | DAY | HOUR | MINUTE );
    public final void non_second_datetime_field() throws RecognitionException {
        int non_second_datetime_field_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 186) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:758:27: ( YEAR | MONTH | DAY | HOUR | MINUTE )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:
            {
            if ( input.LA(1)==DAY||input.LA(1)==HOUR||input.LA(1)==MINUTE||input.LA(1)==MONTH||input.LA(1)==YEAR ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 186, non_second_datetime_field_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "non_second_datetime_field"


    // $ANTLR start "lit"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:765:1: lit : ( signed_num_lit | general_lit );
    public final void lit() throws RecognitionException {
        int lit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 187) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:765:5: ( signed_num_lit | general_lit )
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( ((LA193_0>=UNSIGNED_INTEGER && LA193_0<=APPROXIMATE_NUM_LIT)||LA193_0==MINUS_SIGN||LA193_0==EXACT_NUM_LIT||LA193_0==PLUS_SIGN) ) {
                alt193=1;
            }
            else if ( ((LA193_0>=NATIONAL_CHAR_STRING_LIT && LA193_0<=HEX_STRING_LIT)||LA193_0==DATE||LA193_0==INTERVAL||(LA193_0>=TIME && LA193_0<=TIMESTAMP)||LA193_0==CHAR_STRING||LA193_0==INTRODUCER) ) {
                alt193=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 193, 0, input);

                throw nvae;
            }
            switch (alt193) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:766:7: signed_num_lit
                    {
                    pushFollow(FOLLOW_signed_num_lit_in_lit5870);
                    signed_num_lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:767:7: general_lit
                    {
                    pushFollow(FOLLOW_general_lit_in_lit5879);
                    general_lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 187, lit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "lit"


    // $ANTLR start "signed_num_lit"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:769:1: signed_num_lit : ( sign )? unsigned_num_lit ;
    public final void signed_num_lit() throws RecognitionException {
        int signed_num_lit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 188) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:769:16: ( ( sign )? unsigned_num_lit )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:770:5: ( sign )? unsigned_num_lit
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:770:5: ( sign )?
            int alt194=2;
            int LA194_0 = input.LA(1);

            if ( (LA194_0==MINUS_SIGN||LA194_0==PLUS_SIGN) ) {
                alt194=1;
            }
            switch (alt194) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:770:6: sign
                    {
                    pushFollow(FOLLOW_sign_in_signed_num_lit5894);
                    sign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_unsigned_num_lit_in_signed_num_lit5898);
            unsigned_num_lit();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 188, signed_num_lit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "signed_num_lit"


    // $ANTLR start "timestamp_lit"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:772:1: timestamp_lit : TIMESTAMP CHAR_STRING ;
    public final void timestamp_lit() throws RecognitionException {
        int timestamp_lit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 189) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:772:15: ( TIMESTAMP CHAR_STRING )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:773:5: TIMESTAMP CHAR_STRING
            {
            match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamp_lit5912); if (state.failed) return ;
            match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_timestamp_lit5914); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 189, timestamp_lit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "timestamp_lit"


    // $ANTLR start "time_lit"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:775:1: time_lit : TIME CHAR_STRING ;
    public final void time_lit() throws RecognitionException {
        int time_lit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 190) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:775:10: ( TIME CHAR_STRING )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:776:5: TIME CHAR_STRING
            {
            match(input,TIME,FOLLOW_TIME_in_time_lit5929); if (state.failed) return ;
            match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_time_lit5931); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 190, time_lit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "time_lit"


    // $ANTLR start "non_reserved_word"
    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:778:1: non_reserved_word : ADA ;
    public final void non_reserved_word() throws RecognitionException {
        int non_reserved_word_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 191) ) { return ; }
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:778:19: ( ADA )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:779:7: ADA
            {
            match(input,ADA,FOLLOW_ADA_in_non_reserved_word5948); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 191, non_reserved_word_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "non_reserved_word"

    // $ANTLR start synpred27_DmlSQL2Parser
    public final void synpred27_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:71:7: ( LEFT_PAREN column_name_list RIGHT_PAREN )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:71:8: LEFT_PAREN column_name_list RIGHT_PAREN
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred27_DmlSQL2Parser475); if (state.failed) return ;
        pushFollow(FOLLOW_column_name_list_in_synpred27_DmlSQL2Parser477);
        column_name_list();

        state._fsp--;
        if (state.failed) return ;
        match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_synpred27_DmlSQL2Parser479); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_DmlSQL2Parser

    // $ANTLR start synpred28_DmlSQL2Parser
    public final void synpred28_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:71:52: ( LEFT_PAREN column_name_list RIGHT_PAREN )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:71:52: LEFT_PAREN column_name_list RIGHT_PAREN
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred28_DmlSQL2Parser484); if (state.failed) return ;
        pushFollow(FOLLOW_column_name_list_in_synpred28_DmlSQL2Parser486);
        column_name_list();

        state._fsp--;
        if (state.failed) return ;
        match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_synpred28_DmlSQL2Parser488); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_DmlSQL2Parser

    // $ANTLR start synpred29_DmlSQL2Parser
    public final void synpred29_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:73:7: ( query_exp )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:73:7: query_exp
        {
        pushFollow(FOLLOW_query_exp_in_synpred29_DmlSQL2Parser506);
        query_exp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_DmlSQL2Parser

    // $ANTLR start synpred49_DmlSQL2Parser
    public final void synpred49_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:119:7: ( table_name PERIOD ASTERISK )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:119:8: table_name PERIOD ASTERISK
        {
        pushFollow(FOLLOW_table_name_in_synpred49_DmlSQL2Parser931);
        table_name();

        state._fsp--;
        if (state.failed) return ;
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred49_DmlSQL2Parser933); if (state.failed) return ;
        match(input,ASTERISK,FOLLOW_ASTERISK_in_synpred49_DmlSQL2Parser935); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_DmlSQL2Parser

    // $ANTLR start synpred52_DmlSQL2Parser
    public final void synpred52_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:126:8: ( user_difine_function )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:126:9: user_difine_function
        {
        pushFollow(FOLLOW_user_difine_function_in_synpred52_DmlSQL2Parser992);
        user_difine_function();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_DmlSQL2Parser

    // $ANTLR start synpred53_DmlSQL2Parser
    public final void synpred53_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:127:6: ( scalar_subquery )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:127:7: scalar_subquery
        {
        pushFollow(FOLLOW_scalar_subquery_in_synpred53_DmlSQL2Parser1006);
        scalar_subquery();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_DmlSQL2Parser

    // $ANTLR start synpred54_DmlSQL2Parser
    public final void synpred54_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:128:37: ( column_ref )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:128:38: column_ref
        {
        pushFollow(FOLLOW_column_ref_in_synpred54_DmlSQL2Parser1022);
        column_ref();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_DmlSQL2Parser

    // $ANTLR start synpred55_DmlSQL2Parser
    public final void synpred55_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:128:7: ({...}? ( ( column_ref )=> column_ref | unsigned_value_spec ) )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:128:7: {...}? ( ( column_ref )=> column_ref | unsigned_value_spec )
        {
        if ( !((input.LA(1) == INTRODUCER)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred55_DmlSQL2Parser", "input.LA(1) == INTRODUCER");
        }
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:128:36: ( ( column_ref )=> column_ref | unsigned_value_spec )
        int alt210=2;
        alt210 = dfa210.predict(input);
        switch (alt210) {
            case 1 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:128:37: ( column_ref )=> column_ref
                {
                pushFollow(FOLLOW_column_ref_in_synpred55_DmlSQL2Parser1025);
                column_ref();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:128:64: unsigned_value_spec
                {
                pushFollow(FOLLOW_unsigned_value_spec_in_synpred55_DmlSQL2Parser1029);
                unsigned_value_spec();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred55_DmlSQL2Parser

    // $ANTLR start synpred56_DmlSQL2Parser
    public final void synpred56_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:129:7: ({...}? column_ref )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:129:7: {...}? column_ref
        {
        if ( !((input.LA(1) != INTRODUCER)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred56_DmlSQL2Parser", "input.LA(1) != INTRODUCER");
        }
        pushFollow(FOLLOW_column_ref_in_synpred56_DmlSQL2Parser1040);
        column_ref();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_DmlSQL2Parser

    // $ANTLR start synpred60_DmlSQL2Parser
    public final void synpred60_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:134:7: ( unsigned_value_spec )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:134:7: unsigned_value_spec
        {
        pushFollow(FOLLOW_unsigned_value_spec_in_synpred60_DmlSQL2Parser1076);
        unsigned_value_spec();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_DmlSQL2Parser

    // $ANTLR start synpred62_DmlSQL2Parser
    public final void synpred62_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:17: ( ( value_exp ( COMMA value_exp )* ) )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:17: ( value_exp ( COMMA value_exp )* )
        {
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:17: ( value_exp ( COMMA value_exp )* )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:18: value_exp ( COMMA value_exp )*
        {
        pushFollow(FOLLOW_value_exp_in_synpred62_DmlSQL2Parser1111);
        value_exp();

        state._fsp--;
        if (state.failed) return ;
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:28: ( COMMA value_exp )*
        loop211:
        do {
            int alt211=2;
            int LA211_0 = input.LA(1);

            if ( (LA211_0==COMMA) ) {
                alt211=1;
            }


            switch (alt211) {
        	case 1 :
        	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:29: COMMA value_exp
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred62_DmlSQL2Parser1114); if (state.failed) return ;
        	    pushFollow(FOLLOW_value_exp_in_synpred62_DmlSQL2Parser1116);
        	    value_exp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop211;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred62_DmlSQL2Parser

    // $ANTLR start synpred63_DmlSQL2Parser
    public final void synpred63_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:49: ( order_by_clause )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:140:49: order_by_clause
        {
        pushFollow(FOLLOW_order_by_clause_in_synpred63_DmlSQL2Parser1122);
        order_by_clause();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_DmlSQL2Parser

    // $ANTLR start synpred89_DmlSQL2Parser
    public final void synpred89_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:210:7: ( predicate )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:210:8: predicate
        {
        pushFollow(FOLLOW_predicate_in_synpred89_DmlSQL2Parser1661);
        predicate();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_DmlSQL2Parser

    // $ANTLR start synpred105_DmlSQL2Parser
    public final void synpred105_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:246:7: ( table_subquery )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:246:8: table_subquery
        {
        pushFollow(FOLLOW_table_subquery_in_synpred105_DmlSQL2Parser2003);
        table_subquery();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_DmlSQL2Parser

    // $ANTLR start synpred166_DmlSQL2Parser
    public final void synpred166_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:18: ( ( UNION | EXCEPT | MINUS ) ( ALL )? ( corresponding_spec )? query_term )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:18: ( UNION | EXCEPT | MINUS ) ( ALL )? ( corresponding_spec )? query_term
        {
        if ( input.LA(1)==EXCEPT||input.LA(1)==MINUS||input.LA(1)==UNION ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:42: ( ALL )?
        int alt243=2;
        int LA243_0 = input.LA(1);

        if ( (LA243_0==ALL) ) {
            alt243=1;
        }
        switch (alt243) {
            case 1 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:43: ALL
                {
                match(input,ALL,FOLLOW_ALL_in_synpred166_DmlSQL2Parser3034); if (state.failed) return ;

                }
                break;

        }

        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:49: ( corresponding_spec )?
        int alt244=2;
        int LA244_0 = input.LA(1);

        if ( (LA244_0==CORRESPONDING) ) {
            alt244=1;
        }
        switch (alt244) {
            case 1 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:361:50: corresponding_spec
                {
                pushFollow(FOLLOW_corresponding_spec_in_synpred166_DmlSQL2Parser3039);
                corresponding_spec();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_query_term_in_synpred166_DmlSQL2Parser3043);
        query_term();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred166_DmlSQL2Parser

    // $ANTLR start synpred169_DmlSQL2Parser
    public final void synpred169_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:21: ( INTERSECT ( ALL )? ( corresponding_spec )? query_primary )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:21: INTERSECT ( ALL )? ( corresponding_spec )? query_primary
        {
        match(input,INTERSECT,FOLLOW_INTERSECT_in_synpred169_DmlSQL2Parser3063); if (state.failed) return ;
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:31: ( ALL )?
        int alt245=2;
        int LA245_0 = input.LA(1);

        if ( (LA245_0==ALL) ) {
            alt245=1;
        }
        switch (alt245) {
            case 1 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:32: ALL
                {
                match(input,ALL,FOLLOW_ALL_in_synpred169_DmlSQL2Parser3066); if (state.failed) return ;

                }
                break;

        }

        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:38: ( corresponding_spec )?
        int alt246=2;
        int LA246_0 = input.LA(1);

        if ( (LA246_0==CORRESPONDING) ) {
            alt246=1;
        }
        switch (alt246) {
            case 1 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:364:39: corresponding_spec
                {
                pushFollow(FOLLOW_corresponding_spec_in_synpred169_DmlSQL2Parser3071);
                corresponding_spec();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_query_primary_in_synpred169_DmlSQL2Parser3075);
        query_primary();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_DmlSQL2Parser

    // $ANTLR start synpred176_DmlSQL2Parser
    public final void synpred176_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:386:28: ( COMMA row_value_constructor )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:386:28: COMMA row_value_constructor
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred176_DmlSQL2Parser3222); if (state.failed) return ;
        pushFollow(FOLLOW_row_value_constructor_in_synpred176_DmlSQL2Parser3224);
        row_value_constructor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred176_DmlSQL2Parser

    // $ANTLR start synpred177_DmlSQL2Parser
    public final void synpred177_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:389:7: ( row_value_constructor_elem )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:389:8: row_value_constructor_elem
        {
        pushFollow(FOLLOW_row_value_constructor_elem_in_synpred177_DmlSQL2Parser3243);
        row_value_constructor_elem();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred177_DmlSQL2Parser

    // $ANTLR start synpred182_DmlSQL2Parser
    public final void synpred182_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:408:42: ( qualified_join )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:408:42: qualified_join
        {
        pushFollow(FOLLOW_qualified_join_in_synpred182_DmlSQL2Parser3382);
        qualified_join();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_DmlSQL2Parser

    // $ANTLR start synpred183_DmlSQL2Parser
    public final void synpred183_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:408:59: ( cross_join )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:408:59: cross_join
        {
        pushFollow(FOLLOW_cross_join_in_synpred183_DmlSQL2Parser3386);
        cross_join();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_DmlSQL2Parser

    // $ANTLR start synpred187_DmlSQL2Parser
    public final void synpred187_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:36: ( ( AS )? correlation_name ( LEFT_PAREN derived_column_list RIGHT_PAREN )? )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:36: ( AS )? correlation_name ( LEFT_PAREN derived_column_list RIGHT_PAREN )?
        {
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:36: ( AS )?
        int alt247=2;
        int LA247_0 = input.LA(1);

        if ( (LA247_0==AS) ) {
            alt247=1;
        }
        switch (alt247) {
            case 1 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:37: AS
                {
                match(input,AS,FOLLOW_AS_in_synpred187_DmlSQL2Parser3411); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_correlation_name_in_synpred187_DmlSQL2Parser3415);
        correlation_name();

        state._fsp--;
        if (state.failed) return ;
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:59: ( LEFT_PAREN derived_column_list RIGHT_PAREN )?
        int alt248=2;
        int LA248_0 = input.LA(1);

        if ( (LA248_0==LEFT_PAREN) ) {
            alt248=1;
        }
        switch (alt248) {
            case 1 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:411:60: LEFT_PAREN derived_column_list RIGHT_PAREN
                {
                match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred187_DmlSQL2Parser3418); if (state.failed) return ;
                pushFollow(FOLLOW_derived_column_list_in_synpred187_DmlSQL2Parser3420);
                derived_column_list();

                state._fsp--;
                if (state.failed) return ;
                match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_synpred187_DmlSQL2Parser3422); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred187_DmlSQL2Parser

    // $ANTLR start synpred199_DmlSQL2Parser
    public final void synpred199_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:444:6: ( where_clause )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:444:6: where_clause
        {
        pushFollow(FOLLOW_where_clause_in_synpred199_DmlSQL2Parser3666);
        where_clause();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred199_DmlSQL2Parser

    // $ANTLR start synpred200_DmlSQL2Parser
    public final void synpred200_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:445:6: ( group_by_clause )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:445:6: group_by_clause
        {
        pushFollow(FOLLOW_group_by_clause_in_synpred200_DmlSQL2Parser3676);
        group_by_clause();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred200_DmlSQL2Parser

    // $ANTLR start synpred201_DmlSQL2Parser
    public final void synpred201_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:446:6: ( having_clause )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:446:6: having_clause
        {
        pushFollow(FOLLOW_having_clause_in_synpred201_DmlSQL2Parser3686);
        having_clause();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred201_DmlSQL2Parser

    // $ANTLR start synpred202_DmlSQL2Parser
    public final void synpred202_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:452:16: ( COMMA query_exp )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:452:16: COMMA query_exp
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred202_DmlSQL2Parser3724); if (state.failed) return ;
        pushFollow(FOLLOW_query_exp_in_synpred202_DmlSQL2Parser3726);
        query_exp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred202_DmlSQL2Parser

    // $ANTLR start synpred204_DmlSQL2Parser
    public final void synpred204_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:464:26: ( COMMA grouping_column_ref )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:464:26: COMMA grouping_column_ref
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred204_DmlSQL2Parser3797); if (state.failed) return ;
        pushFollow(FOLLOW_grouping_column_ref_in_synpred204_DmlSQL2Parser3799);
        grouping_column_ref();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred204_DmlSQL2Parser

    // $ANTLR start synpred219_DmlSQL2Parser
    public final void synpred219_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:508:33: ( ( term_op | CONCATENATION_OP ) term )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:508:33: ( term_op | CONCATENATION_OP ) term
        {
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:508:33: ( term_op | CONCATENATION_OP )
        int alt257=2;
        int LA257_0 = input.LA(1);

        if ( (LA257_0==MINUS_SIGN||LA257_0==MOD||LA257_0==PLUS_SIGN) ) {
            alt257=1;
        }
        else if ( (LA257_0==CONCATENATION_OP) ) {
            alt257=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 257, 0, input);

            throw nvae;
        }
        switch (alt257) {
            case 1 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:508:34: term_op
                {
                pushFollow(FOLLOW_term_op_in_synpred219_DmlSQL2Parser4079);
                term_op();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:508:44: CONCATENATION_OP
                {
                match(input,CONCATENATION_OP,FOLLOW_CONCATENATION_OP_in_synpred219_DmlSQL2Parser4083); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_term_in_synpred219_DmlSQL2Parser4086);
        term();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred219_DmlSQL2Parser

    // $ANTLR start synpred236_DmlSQL2Parser
    public final void synpred236_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:556:35: ( factor_op factor )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:556:35: factor_op factor
        {
        pushFollow(FOLLOW_factor_op_in_synpred236_DmlSQL2Parser4461);
        factor_op();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_factor_in_synpred236_DmlSQL2Parser4463);
        factor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred236_DmlSQL2Parser

    // $ANTLR start synpred240_DmlSQL2Parser
    public final void synpred240_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:562:51: ( collate_clause )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:562:51: collate_clause
        {
        pushFollow(FOLLOW_collate_clause_in_synpred240_DmlSQL2Parser4510);
        collate_clause();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred240_DmlSQL2Parser

    // $ANTLR start synpred241_DmlSQL2Parser
    public final void synpred241_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:562:69: ( LEFT_PAREN FORMAT CHAR_STRING RIGHT_PAREN )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:562:69: LEFT_PAREN FORMAT CHAR_STRING RIGHT_PAREN
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred241_DmlSQL2Parser4515); if (state.failed) return ;
        match(input,FORMAT,FOLLOW_FORMAT_in_synpred241_DmlSQL2Parser4517); if (state.failed) return ;
        match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_synpred241_DmlSQL2Parser4519); if (state.failed) return ;
        match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_synpred241_DmlSQL2Parser4521); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred241_DmlSQL2Parser

    // $ANTLR start synpred243_DmlSQL2Parser
    public final void synpred243_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:568:7: ( value_exp_primary ( interval_qualifier )? )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:568:7: value_exp_primary ( interval_qualifier )?
        {
        pushFollow(FOLLOW_value_exp_primary_in_synpred243_DmlSQL2Parser4554);
        value_exp_primary();

        state._fsp--;
        if (state.failed) return ;
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:568:25: ( interval_qualifier )?
        int alt258=2;
        int LA258_0 = input.LA(1);

        if ( (LA258_0==DAY||LA258_0==HOUR||LA258_0==MINUTE||LA258_0==MONTH||LA258_0==SECOND||LA258_0==YEAR) ) {
            alt258=1;
        }
        switch (alt258) {
            case 1 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:568:26: interval_qualifier
                {
                pushFollow(FOLLOW_interval_qualifier_in_synpred243_DmlSQL2Parser4557);
                interval_qualifier();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred243_DmlSQL2Parser

    // $ANTLR start synpred245_DmlSQL2Parser
    public final void synpred245_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:570:7: ( string_value_fct )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:570:7: string_value_fct
        {
        pushFollow(FOLLOW_string_value_fct_in_synpred245_DmlSQL2Parser4576);
        string_value_fct();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred245_DmlSQL2Parser

    // $ANTLR start synpred261_DmlSQL2Parser
    public final void synpred261_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:669:37: ( cursor_name )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:669:38: cursor_name
        {
        pushFollow(FOLLOW_cursor_name_in_synpred261_DmlSQL2Parser5152);
        cursor_name();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred261_DmlSQL2Parser

    // $ANTLR start synpred262_DmlSQL2Parser
    public final void synpred262_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:669:7: ({...}? ( ( cursor_name )=> cursor_name | extended_cursor_name ) )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:669:7: {...}? ( ( cursor_name )=> cursor_name | extended_cursor_name )
        {
        if ( !((input.LA(1) == INTRODUCER)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred262_DmlSQL2Parser", "input.LA(1) == INTRODUCER");
        }
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:669:36: ( ( cursor_name )=> cursor_name | extended_cursor_name )
        int alt259=2;
        alt259 = dfa259.predict(input);
        switch (alt259) {
            case 1 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:669:37: ( cursor_name )=> cursor_name
                {
                pushFollow(FOLLOW_cursor_name_in_synpred262_DmlSQL2Parser5155);
                cursor_name();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:669:66: extended_cursor_name
                {
                pushFollow(FOLLOW_extended_cursor_name_in_synpred262_DmlSQL2Parser5159);
                extended_cursor_name();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred262_DmlSQL2Parser

    // $ANTLR start synpred263_DmlSQL2Parser
    public final void synpred263_DmlSQL2Parser_fragment() throws RecognitionException {   
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:670:7: ({...}? cursor_name )
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Parser.g:670:7: {...}? cursor_name
        {
        if ( !((input.LA(1) != INTRODUCER)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred263_DmlSQL2Parser", "input.LA(1) != INTRODUCER");
        }
        pushFollow(FOLLOW_cursor_name_in_synpred263_DmlSQL2Parser5171);
        cursor_name();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred263_DmlSQL2Parser

    // Delegated rules

    public final boolean synpred29_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred263_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred263_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred183_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred183_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred169_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred169_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred182_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred182_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred177_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred177_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred200_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred200_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred261_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred261_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred262_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred262_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred166_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred166_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred219_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred219_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred176_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred176_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred236_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred236_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred241_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred241_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred199_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred199_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred187_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred187_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred243_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred243_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred204_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred204_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred202_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred202_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred240_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred240_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred245_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred245_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred201_DmlSQL2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred201_DmlSQL2Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA120 dfa120 = new DFA120(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA129 dfa129 = new DFA129(this);
    protected DFA141 dfa141 = new DFA141(this);
    protected DFA157 dfa157 = new DFA157(this);
    protected DFA172 dfa172 = new DFA172(this);
    protected DFA171 dfa171 = new DFA171(this);
    protected DFA210 dfa210 = new DFA210(this);
    protected DFA259 dfa259 = new DFA259(this);
    static final String DFA23_eotS =
        "\15\uffff";
    static final String DFA23_eofS =
        "\15\uffff";
    static final String DFA23_minS =
        "\1\26\11\0\3\uffff";
    static final String DFA23_maxS =
        "\1\u00d2\11\0\3\uffff";
    static final String DFA23_acceptS =
        "\12\uffff\1\3\1\1\1\2";
    static final String DFA23_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\10\64\uffff\1\12\55\uffff\1\11\33\uffff\1\2\7\uffff\1\4"+
            "\23\uffff\1\3\10\uffff\1\6\4\uffff\1\7\2\uffff\1\1\17\uffff"+
            "\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "70:1: insert_columns_and_source : ( ( LEFT_PAREN column_name_list RIGHT_PAREN )=> ( LEFT_PAREN column_name_list RIGHT_PAREN )? query_exp | query_exp | DEFAULT VALUES );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_DmlSQL2Parser()) ) {s = 11;}

                        else if ( (synpred29_DmlSQL2Parser()) ) {s = 12;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_2 = input.LA(1);

                         
                        int index23_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_DmlSQL2Parser()) ) {s = 11;}

                        else if ( (synpred29_DmlSQL2Parser()) ) {s = 12;}

                         
                        input.seek(index23_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_3 = input.LA(1);

                         
                        int index23_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_DmlSQL2Parser()) ) {s = 11;}

                        else if ( (synpred29_DmlSQL2Parser()) ) {s = 12;}

                         
                        input.seek(index23_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_4 = input.LA(1);

                         
                        int index23_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_DmlSQL2Parser()) ) {s = 11;}

                        else if ( (synpred29_DmlSQL2Parser()) ) {s = 12;}

                         
                        input.seek(index23_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_5 = input.LA(1);

                         
                        int index23_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_DmlSQL2Parser()) ) {s = 11;}

                        else if ( (synpred29_DmlSQL2Parser()) ) {s = 12;}

                         
                        input.seek(index23_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_DmlSQL2Parser()) ) {s = 11;}

                        else if ( (synpred29_DmlSQL2Parser()) ) {s = 12;}

                         
                        input.seek(index23_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_7 = input.LA(1);

                         
                        int index23_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_DmlSQL2Parser()) ) {s = 11;}

                        else if ( (synpred29_DmlSQL2Parser()) ) {s = 12;}

                         
                        input.seek(index23_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_8 = input.LA(1);

                         
                        int index23_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred27_DmlSQL2Parser()&&(true))) ) {s = 11;}

                        else if ( ((synpred29_DmlSQL2Parser()&&(true))) ) {s = 12;}

                         
                        input.seek(index23_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_9 = input.LA(1);

                         
                        int index23_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_DmlSQL2Parser()) ) {s = 11;}

                        else if ( (synpred29_DmlSQL2Parser()) ) {s = 12;}

                         
                        input.seek(index23_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\13\uffff";
    static final String DFA22_eofS =
        "\13\uffff";
    static final String DFA22_minS =
        "\1\26\1\0\11\uffff";
    static final String DFA22_maxS =
        "\1\u00d2\1\0\11\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\7\uffff\1\1";
    static final String DFA22_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\142\uffff\1\2\33\uffff\1\2\7\uffff\1\2\23\uffff\1\2\10"+
            "\uffff\1\2\4\uffff\1\2\2\uffff\1\1\17\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "71:51: ( LEFT_PAREN column_name_list RIGHT_PAREN )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_DmlSQL2Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\55\uffff";
    static final String DFA41_eofS =
        "\55\uffff";
    static final String DFA41_minS =
        "\1\4\4\0\50\uffff";
    static final String DFA41_maxS =
        "\1\u00d2\4\0\50\uffff";
    static final String DFA41_acceptS =
        "\5\uffff\1\1\1\2\46\uffff";
    static final String DFA41_specialS =
        "\1\0\1\1\1\2\1\3\1\4\50\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\6\2\uffff\1\6\6\uffff\4\6\3\uffff\1\4\16\uffff\1\6\7\uffff"+
            "\1\6\3\uffff\2\6\1\uffff\2\6\1\uffff\2\6\1\uffff\1\6\3\uffff"+
            "\1\6\2\uffff\1\6\1\uffff\4\6\17\uffff\1\6\21\uffff\1\6\11\uffff"+
            "\1\6\1\uffff\2\6\3\uffff\1\5\6\uffff\1\6\1\uffff\1\6\11\uffff"+
            "\1\6\11\uffff\1\6\3\uffff\3\6\2\uffff\2\6\5\uffff\2\6\5\uffff"+
            "\2\6\1\uffff\1\6\11\uffff\1\2\1\6\2\uffff\1\6\1\3\2\uffff\1"+
            "\6\2\uffff\1\6\3\uffff\1\6\4\uffff\1\6\3\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "118:1: select_sublist : ( ( table_name PERIOD ASTERISK )=> table_name PERIOD ASTERISK | derived_column );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_0 = input.LA(1);

                         
                        int index41_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_0==INTRODUCER) ) {s = 1;}

                        else if ( (LA41_0==REGULAR_ID) ) {s = 2;}

                        else if ( (LA41_0==DELIMITED_ID) ) {s = 3;}

                        else if ( (LA41_0==ADA) ) {s = 4;}

                        else if ( (LA41_0==MODULE) && (synpred49_DmlSQL2Parser())) {s = 5;}

                        else if ( ((LA41_0>=UNSIGNED_INTEGER && LA41_0<=APPROXIMATE_NUM_LIT)||LA41_0==MINUS_SIGN||(LA41_0>=NATIONAL_CHAR_STRING_LIT && LA41_0<=EMBDD_VARIABLE_NAME)||LA41_0==AVG||LA41_0==BIT_LENGTH||(LA41_0>=CASE && LA41_0<=CAST)||(LA41_0>=CHAR && LA41_0<=CHAR_LENGTH)||(LA41_0>=CHARACTER_LENGTH && LA41_0<=COALESCE)||LA41_0==CONVERT||LA41_0==COUNT||LA41_0==CURRENT_DATE||(LA41_0>=CURRENT_TIME && LA41_0<=DATE)||LA41_0==EXTRACT||LA41_0==INTERVAL||LA41_0==LOWER||(LA41_0>=MAX && LA41_0<=MIN)||LA41_0==NULLIF||LA41_0==OCTET_LENGTH||LA41_0==POSITION||LA41_0==SESSION_USER||(LA41_0>=SUBSTRING && LA41_0<=SYSTEM_USER)||(LA41_0>=TIME && LA41_0<=TIMESTAMP)||(LA41_0>=TRANSLATE && LA41_0<=TRIM)||(LA41_0>=UPPER && LA41_0<=USER)||LA41_0==VALUE||LA41_0==EXACT_NUM_LIT||LA41_0==CHAR_STRING||LA41_0==LEFT_PAREN||LA41_0==PLUS_SIGN||LA41_0==COLON||LA41_0==QUESTION_MARK) ) {s = 6;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_DmlSQL2Parser()) ) {s = 5;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_DmlSQL2Parser()) ) {s = 5;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA41_3 = input.LA(1);

                         
                        int index41_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_DmlSQL2Parser()) ) {s = 5;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index41_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA41_4 = input.LA(1);

                         
                        int index41_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred49_DmlSQL2Parser()&&(true))) ) {s = 5;}

                        else if ( ((((input.LA(1) != INTRODUCER)&&(true))||((input.LA(1) == INTRODUCER)&&(true))||(true))) ) {s = 6;}

                         
                        input.seek(index41_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA45_eotS =
        "\43\uffff";
    static final String DFA45_eofS =
        "\43\uffff";
    static final String DFA45_minS =
        "\1\4\26\0\14\uffff";
    static final String DFA45_maxS =
        "\1\u00d2\26\0\14\uffff";
    static final String DFA45_acceptS =
        "\27\uffff\1\5\1\uffff\1\6\2\uffff\1\7\1\1\1\3\1\4\1\10\1\2\1\11";
    static final String DFA45_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\14\uffff}>";
    static final String[] DFA45_transitionS = {
            "\2\6\11\uffff\1\10\1\11\1\12\1\21\3\uffff\1\4\16\uffff\1\27"+
            "\13\uffff\1\31\1\34\5\uffff\1\31\5\uffff\1\27\6\uffff\1\23\1"+
            "\13\41\uffff\1\16\13\uffff\2\27\12\uffff\1\31\25\uffff\1\24"+
            "\4\uffff\1\27\1\25\2\uffff\1\14\1\15\15\uffff\1\22\1\uffff\1"+
            "\26\11\uffff\1\2\1\6\2\uffff\1\7\1\3\2\uffff\1\5\6\uffff\1\17"+
            "\4\uffff\1\20\3\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "125:1: value_exp_primary : ( ( user_difine_function )=> user_difine_function | ( scalar_subquery )=> scalar_subquery | {...}? ( ( column_ref )=> column_ref | unsigned_value_spec ) | {...}? column_ref | set_fct_spec | case_exp | cast_spec | unsigned_value_spec | LEFT_PAREN value_exp RIGHT_PAREN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_DmlSQL2Parser()) ) {s = 29;}

                        else if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( ((synpred56_DmlSQL2Parser()&&(input.LA(1) != INTRODUCER))) ) {s = 31;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_2 = input.LA(1);

                         
                        int index45_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_DmlSQL2Parser()) ) {s = 29;}

                        else if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( ((synpred56_DmlSQL2Parser()&&(input.LA(1) != INTRODUCER))) ) {s = 31;}

                         
                        input.seek(index45_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_3 = input.LA(1);

                         
                        int index45_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_DmlSQL2Parser()) ) {s = 29;}

                        else if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( ((synpred56_DmlSQL2Parser()&&(input.LA(1) != INTRODUCER))) ) {s = 31;}

                         
                        input.seek(index45_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA45_4 = input.LA(1);

                         
                        int index45_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred52_DmlSQL2Parser()&&(true))) ) {s = 29;}

                        else if ( (((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))&&(true))) ) {s = 30;}

                        else if ( (((synpred56_DmlSQL2Parser()&&(input.LA(1) != INTRODUCER))&&(true))) ) {s = 31;}

                         
                        input.seek(index45_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA45_5 = input.LA(1);

                         
                        int index45_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_DmlSQL2Parser()) ) {s = 33;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index45_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA45_6 = input.LA(1);

                         
                        int index45_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA45_7 = input.LA(1);

                         
                        int index45_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA45_8 = input.LA(1);

                         
                        int index45_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA45_9 = input.LA(1);

                         
                        int index45_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA45_10 = input.LA(1);

                         
                        int index45_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA45_11 = input.LA(1);

                         
                        int index45_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA45_12 = input.LA(1);

                         
                        int index45_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA45_13 = input.LA(1);

                         
                        int index45_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA45_14 = input.LA(1);

                         
                        int index45_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA45_15 = input.LA(1);

                         
                        int index45_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA45_16 = input.LA(1);

                         
                        int index45_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA45_17 = input.LA(1);

                         
                        int index45_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA45_18 = input.LA(1);

                         
                        int index45_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA45_19 = input.LA(1);

                         
                        int index45_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA45_20 = input.LA(1);

                         
                        int index45_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA45_21 = input.LA(1);

                         
                        int index45_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA45_22 = input.LA(1);

                         
                        int index45_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred55_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 30;}

                        else if ( (synpred60_DmlSQL2Parser()) ) {s = 32;}

                         
                        input.seek(index45_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\26\uffff";
    static final String DFA44_eofS =
        "\26\uffff";
    static final String DFA44_minS =
        "\1\4\1\0\24\uffff";
    static final String DFA44_maxS =
        "\1\u00d2\1\0\24\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\3\1\1\2\20\uffff";
    static final String DFA44_specialS =
        "\1\0\1\1\24\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\5\11\uffff\4\5\3\uffff\1\4\56\uffff\2\5\41\uffff\1\5\55"+
            "\uffff\1\5\5\uffff\1\5\2\uffff\2\5\15\uffff\1\5\1\uffff\1\5"+
            "\11\uffff\1\2\1\5\2\uffff\1\5\1\3\11\uffff\1\5\4\uffff\1\5\3"+
            "\uffff\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "128:36: ( ( column_ref )=> column_ref | unsigned_value_spec )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_0 = input.LA(1);

                         
                        int index44_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA44_0==INTRODUCER) ) {s = 1;}

                        else if ( (LA44_0==REGULAR_ID) && (synpred54_DmlSQL2Parser())) {s = 2;}

                        else if ( (LA44_0==DELIMITED_ID) && (synpred54_DmlSQL2Parser())) {s = 3;}

                        else if ( (LA44_0==ADA) && (synpred54_DmlSQL2Parser())) {s = 4;}

                        else if ( ((LA44_0>=UNSIGNED_INTEGER && LA44_0<=APPROXIMATE_NUM_LIT)||(LA44_0>=NATIONAL_CHAR_STRING_LIT && LA44_0<=EMBDD_VARIABLE_NAME)||(LA44_0>=CURRENT_USER && LA44_0<=DATE)||LA44_0==INTERVAL||LA44_0==SESSION_USER||LA44_0==SYSTEM_USER||(LA44_0>=TIME && LA44_0<=TIMESTAMP)||LA44_0==USER||LA44_0==VALUE||LA44_0==EXACT_NUM_LIT||LA44_0==CHAR_STRING||LA44_0==COLON||LA44_0==QUESTION_MARK) ) {s = 5;}

                         
                        input.seek(index44_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_DmlSQL2Parser()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\57\uffff";
    static final String DFA47_eofS =
        "\57\uffff";
    static final String DFA47_minS =
        "\1\4\1\uffff\4\0\1\uffff\1\0\47\uffff";
    static final String DFA47_maxS =
        "\1\u00d2\1\uffff\4\0\1\uffff\1\0\47\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\52\uffff\1\2\1\uffff\1\3";
    static final String DFA47_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\uffff\1\4\47\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\7\1\1\2\uffff\1\1\6\uffff\4\1\3\uffff\1\5\16\uffff\1\1\7"+
            "\uffff\1\1\3\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\1\1\3"+
            "\uffff\1\1\2\uffff\1\1\1\uffff\4\1\17\uffff\1\1\21\uffff\1\1"+
            "\11\uffff\1\1\1\uffff\2\1\12\uffff\1\1\1\uffff\1\1\4\uffff\1"+
            "\54\4\uffff\1\1\11\uffff\1\1\3\uffff\3\1\2\uffff\2\1\5\uffff"+
            "\2\1\5\uffff\2\1\1\uffff\1\1\11\uffff\1\3\1\1\2\uffff\1\1\1"+
            "\4\2\uffff\1\1\1\56\1\uffff\1\1\3\uffff\1\1\4\uffff\1\1\3\uffff"+
            "\1\2",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "140:16: ( ( value_exp ( COMMA value_exp )* ) | order_by_clause )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_2 = input.LA(1);

                         
                        int index47_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred62_DmlSQL2Parser()||(synpred62_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))||(synpred62_DmlSQL2Parser()&&(input.LA(1) != INTRODUCER)))) ) {s = 1;}

                        else if ( (synpred63_DmlSQL2Parser()) ) {s = 44;}

                         
                        input.seek(index47_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_3 = input.LA(1);

                         
                        int index47_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred62_DmlSQL2Parser()||(synpred62_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))||(synpred62_DmlSQL2Parser()&&(input.LA(1) != INTRODUCER)))) ) {s = 1;}

                        else if ( (synpred63_DmlSQL2Parser()) ) {s = 44;}

                         
                        input.seek(index47_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_4 = input.LA(1);

                         
                        int index47_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred62_DmlSQL2Parser()||(synpred62_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))||(synpred62_DmlSQL2Parser()&&(input.LA(1) != INTRODUCER)))) ) {s = 1;}

                        else if ( (synpred63_DmlSQL2Parser()) ) {s = 44;}

                         
                        input.seek(index47_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA47_5 = input.LA(1);

                         
                        int index47_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((((synpred62_DmlSQL2Parser()&&(input.LA(1) != INTRODUCER))&&(true))||(synpred62_DmlSQL2Parser()&&(true))||((synpred62_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))&&(true)))) ) {s = 1;}

                        else if ( ((synpred63_DmlSQL2Parser()&&(true))) ) {s = 44;}

                         
                        input.seek(index47_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA47_7 = input.LA(1);

                         
                        int index47_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred62_DmlSQL2Parser()||(synpred62_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER)))) ) {s = 1;}

                        else if ( (synpred63_DmlSQL2Parser()) ) {s = 44;}

                         
                        input.seek(index47_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\61\uffff";
    static final String DFA67_eofS =
        "\61\uffff";
    static final String DFA67_minS =
        "\1\4\5\uffff\1\0\52\uffff";
    static final String DFA67_maxS =
        "\1\u00d2\5\uffff\1\0\52\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\5\1\1\uffff\51\1\1\2";
    static final String DFA67_specialS =
        "\1\0\5\uffff\1\1\52\uffff}>";
    static final String[] DFA67_transitionS = {
            "\2\7\2\uffff\1\1\6\uffff\1\11\1\12\1\13\1\22\3\uffff\1\5\16"+
            "\uffff\1\31\7\uffff\1\42\3\uffff\1\34\1\35\1\uffff\1\44\1\40"+
            "\1\uffff\1\40\1\33\1\uffff\1\46\3\uffff\1\30\2\uffff\1\51\1"+
            "\uffff\1\52\1\53\1\24\1\14\4\uffff\1\55\11\uffff\1\56\1\37\21"+
            "\uffff\1\17\11\uffff\1\45\1\uffff\2\31\11\uffff\1\54\1\32\1"+
            "\uffff\1\41\11\uffff\1\36\11\uffff\1\25\3\uffff\1\43\1\31\1"+
            "\26\2\uffff\1\15\1\16\5\uffff\1\47\1\50\2\uffff\1\57\2\uffff"+
            "\1\45\1\23\1\uffff\1\27\11\uffff\1\3\1\7\2\uffff\1\10\1\4\2"+
            "\uffff\1\6\2\uffff\1\1\3\uffff\1\20\4\uffff\1\21\3\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "209:1: boolean_primary : ( ( predicate )=> predicate | LEFT_PAREN search_condition RIGHT_PAREN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_0==MINUS_SIGN||LA67_0==PLUS_SIGN) && (synpred89_DmlSQL2Parser())) {s = 1;}

                        else if ( (LA67_0==INTRODUCER) && (synpred89_DmlSQL2Parser())) {s = 2;}

                        else if ( (LA67_0==REGULAR_ID) && (synpred89_DmlSQL2Parser())) {s = 3;}

                        else if ( (LA67_0==DELIMITED_ID) && (synpred89_DmlSQL2Parser())) {s = 4;}

                        else if ( (LA67_0==ADA) && (synpred89_DmlSQL2Parser())) {s = 5;}

                        else if ( (LA67_0==LEFT_PAREN) ) {s = 6;}

                        else if ( ((LA67_0>=UNSIGNED_INTEGER && LA67_0<=APPROXIMATE_NUM_LIT)||LA67_0==EXACT_NUM_LIT) && (synpred89_DmlSQL2Parser())) {s = 7;}

                        else if ( (LA67_0==CHAR_STRING) && (synpred89_DmlSQL2Parser())) {s = 8;}

                        else if ( (LA67_0==NATIONAL_CHAR_STRING_LIT) && (synpred89_DmlSQL2Parser())) {s = 9;}

                        else if ( (LA67_0==BIT_STRING_LIT) && (synpred89_DmlSQL2Parser())) {s = 10;}

                        else if ( (LA67_0==HEX_STRING_LIT) && (synpred89_DmlSQL2Parser())) {s = 11;}

                        else if ( (LA67_0==DATE) && (synpred89_DmlSQL2Parser())) {s = 12;}

                        else if ( (LA67_0==TIME) && (synpred89_DmlSQL2Parser())) {s = 13;}

                        else if ( (LA67_0==TIMESTAMP) && (synpred89_DmlSQL2Parser())) {s = 14;}

                        else if ( (LA67_0==INTERVAL) && (synpred89_DmlSQL2Parser())) {s = 15;}

                        else if ( (LA67_0==COLON) && (synpred89_DmlSQL2Parser())) {s = 16;}

                        else if ( (LA67_0==QUESTION_MARK) && (synpred89_DmlSQL2Parser())) {s = 17;}

                        else if ( (LA67_0==EMBDD_VARIABLE_NAME) && (synpred89_DmlSQL2Parser())) {s = 18;}

                        else if ( (LA67_0==USER) && (synpred89_DmlSQL2Parser())) {s = 19;}

                        else if ( (LA67_0==CURRENT_USER) && (synpred89_DmlSQL2Parser())) {s = 20;}

                        else if ( (LA67_0==SESSION_USER) && (synpred89_DmlSQL2Parser())) {s = 21;}

                        else if ( (LA67_0==SYSTEM_USER) && (synpred89_DmlSQL2Parser())) {s = 22;}

                        else if ( (LA67_0==VALUE) && (synpred89_DmlSQL2Parser())) {s = 23;}

                        else if ( (LA67_0==COUNT) && (synpred89_DmlSQL2Parser())) {s = 24;}

                        else if ( (LA67_0==AVG||(LA67_0>=MAX && LA67_0<=MIN)||LA67_0==SUM) && (synpred89_DmlSQL2Parser())) {s = 25;}

                        else if ( (LA67_0==NULLIF) && (synpred89_DmlSQL2Parser())) {s = 26;}

                        else if ( (LA67_0==COALESCE) && (synpred89_DmlSQL2Parser())) {s = 27;}

                        else if ( (LA67_0==CASE) && (synpred89_DmlSQL2Parser())) {s = 28;}

                        else if ( (LA67_0==CAST) && (synpred89_DmlSQL2Parser())) {s = 29;}

                        else if ( (LA67_0==POSITION) && (synpred89_DmlSQL2Parser())) {s = 30;}

                        else if ( (LA67_0==EXTRACT) && (synpred89_DmlSQL2Parser())) {s = 31;}

                        else if ( (LA67_0==CHAR_LENGTH||LA67_0==CHARACTER_LENGTH) && (synpred89_DmlSQL2Parser())) {s = 32;}

                        else if ( (LA67_0==OCTET_LENGTH) && (synpred89_DmlSQL2Parser())) {s = 33;}

                        else if ( (LA67_0==BIT_LENGTH) && (synpred89_DmlSQL2Parser())) {s = 34;}

                        else if ( (LA67_0==SUBSTRING) && (synpred89_DmlSQL2Parser())) {s = 35;}

                        else if ( (LA67_0==CHAR) && (synpred89_DmlSQL2Parser())) {s = 36;}

                        else if ( (LA67_0==LOWER||LA67_0==UPPER) && (synpred89_DmlSQL2Parser())) {s = 37;}

                        else if ( (LA67_0==CONVERT) && (synpred89_DmlSQL2Parser())) {s = 38;}

                        else if ( (LA67_0==TRANSLATE) && (synpred89_DmlSQL2Parser())) {s = 39;}

                        else if ( (LA67_0==TRIM) && (synpred89_DmlSQL2Parser())) {s = 40;}

                        else if ( (LA67_0==CURRENT_DATE) && (synpred89_DmlSQL2Parser())) {s = 41;}

                        else if ( (LA67_0==CURRENT_TIME) && (synpred89_DmlSQL2Parser())) {s = 42;}

                        else if ( (LA67_0==CURRENT_TIMESTAMP) && (synpred89_DmlSQL2Parser())) {s = 43;}

                        else if ( (LA67_0==NULL) && (synpred89_DmlSQL2Parser())) {s = 44;}

                        else if ( (LA67_0==DEFAULT) && (synpred89_DmlSQL2Parser())) {s = 45;}

                        else if ( (LA67_0==EXISTS) && (synpred89_DmlSQL2Parser())) {s = 46;}

                        else if ( (LA67_0==UNIQUE) && (synpred89_DmlSQL2Parser())) {s = 47;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_6 = input.LA(1);

                         
                        int index67_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_DmlSQL2Parser()) ) {s = 47;}

                        else if ( (true) ) {s = 48;}

                         
                        input.seek(index67_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA120_eotS =
        "\24\uffff";
    static final String DFA120_eofS =
        "\1\1\23\uffff";
    static final String DFA120_minS =
        "\1\4\15\uffff\1\0\5\uffff";
    static final String DFA120_maxS =
        "\1\u00d2\15\uffff\1\0\5\uffff";
    static final String DFA120_acceptS =
        "\1\uffff\1\2\21\uffff\1\1";
    static final String DFA120_specialS =
        "\16\uffff\1\0\5\uffff}>";
    static final String[] DFA120_transitionS = {
            "\1\1\21\uffff\1\1\75\uffff\1\1\5\uffff\1\1\3\uffff\2\1\7\uffff"+
            "\1\1\1\uffff\1\1\15\uffff\1\1\17\uffff\1\1\10\uffff\1\1\30\uffff"+
            "\1\1\13\uffff\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\2\uffff"+
            "\1\16\3\uffff\1\1\7\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
    static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
    static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
    static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
    static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
    static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
    static final short[][] DFA120_transition;

    static {
        int numStates = DFA120_transitionS.length;
        DFA120_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
        }
    }

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = DFA120_eot;
            this.eof = DFA120_eof;
            this.min = DFA120_min;
            this.max = DFA120_max;
            this.accept = DFA120_accept;
            this.special = DFA120_special;
            this.transition = DFA120_transition;
        }
        public String getDescription() {
            return "()* loopback of 386:27: ( COMMA row_value_constructor )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA120_14 = input.LA(1);

                         
                        int index120_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_DmlSQL2Parser()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index120_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 120, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA121_eotS =
        "\57\uffff";
    static final String DFA121_eofS =
        "\57\uffff";
    static final String DFA121_minS =
        "\1\4\5\uffff\1\0\50\uffff";
    static final String DFA121_maxS =
        "\1\u00d2\5\uffff\1\0\50\uffff";
    static final String DFA121_acceptS =
        "\1\uffff\5\1\1\uffff\47\1\1\2";
    static final String DFA121_specialS =
        "\1\0\5\uffff\1\1\50\uffff}>";
    static final String[] DFA121_transitionS = {
            "\2\7\2\uffff\1\1\6\uffff\1\11\1\12\1\13\1\22\3\uffff\1\5\16"+
            "\uffff\1\31\7\uffff\1\42\3\uffff\1\34\1\35\1\uffff\1\44\1\40"+
            "\1\uffff\1\40\1\33\1\uffff\1\46\3\uffff\1\30\2\uffff\1\51\1"+
            "\uffff\1\52\1\53\1\24\1\14\4\uffff\1\55\12\uffff\1\37\21\uffff"+
            "\1\17\11\uffff\1\45\1\uffff\2\31\11\uffff\1\54\1\32\1\uffff"+
            "\1\41\11\uffff\1\36\11\uffff\1\25\3\uffff\1\43\1\31\1\26\2\uffff"+
            "\1\15\1\16\5\uffff\1\47\1\50\5\uffff\1\45\1\23\1\uffff\1\27"+
            "\11\uffff\1\3\1\7\2\uffff\1\10\1\4\2\uffff\1\6\2\uffff\1\1\3"+
            "\uffff\1\20\4\uffff\1\21\3\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA121_eot = DFA.unpackEncodedString(DFA121_eotS);
    static final short[] DFA121_eof = DFA.unpackEncodedString(DFA121_eofS);
    static final char[] DFA121_min = DFA.unpackEncodedStringToUnsignedChars(DFA121_minS);
    static final char[] DFA121_max = DFA.unpackEncodedStringToUnsignedChars(DFA121_maxS);
    static final short[] DFA121_accept = DFA.unpackEncodedString(DFA121_acceptS);
    static final short[] DFA121_special = DFA.unpackEncodedString(DFA121_specialS);
    static final short[][] DFA121_transition;

    static {
        int numStates = DFA121_transitionS.length;
        DFA121_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA121_transition[i] = DFA.unpackEncodedString(DFA121_transitionS[i]);
        }
    }

    class DFA121 extends DFA {

        public DFA121(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 121;
            this.eot = DFA121_eot;
            this.eof = DFA121_eof;
            this.min = DFA121_min;
            this.max = DFA121_max;
            this.accept = DFA121_accept;
            this.special = DFA121_special;
            this.transition = DFA121_transition;
        }
        public String getDescription() {
            return "388:1: row_value_constructor : ( ( row_value_constructor_elem )=> row_value_constructor_elem | LEFT_PAREN row_value_const_list RIGHT_PAREN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA121_0 = input.LA(1);

                         
                        int index121_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA121_0==MINUS_SIGN||LA121_0==PLUS_SIGN) && (synpred177_DmlSQL2Parser())) {s = 1;}

                        else if ( (LA121_0==INTRODUCER) && (synpred177_DmlSQL2Parser())) {s = 2;}

                        else if ( (LA121_0==REGULAR_ID) && (synpred177_DmlSQL2Parser())) {s = 3;}

                        else if ( (LA121_0==DELIMITED_ID) && (synpred177_DmlSQL2Parser())) {s = 4;}

                        else if ( (LA121_0==ADA) && (synpred177_DmlSQL2Parser())) {s = 5;}

                        else if ( (LA121_0==LEFT_PAREN) ) {s = 6;}

                        else if ( ((LA121_0>=UNSIGNED_INTEGER && LA121_0<=APPROXIMATE_NUM_LIT)||LA121_0==EXACT_NUM_LIT) && (synpred177_DmlSQL2Parser())) {s = 7;}

                        else if ( (LA121_0==CHAR_STRING) && (synpred177_DmlSQL2Parser())) {s = 8;}

                        else if ( (LA121_0==NATIONAL_CHAR_STRING_LIT) && (synpred177_DmlSQL2Parser())) {s = 9;}

                        else if ( (LA121_0==BIT_STRING_LIT) && (synpred177_DmlSQL2Parser())) {s = 10;}

                        else if ( (LA121_0==HEX_STRING_LIT) && (synpred177_DmlSQL2Parser())) {s = 11;}

                        else if ( (LA121_0==DATE) && (synpred177_DmlSQL2Parser())) {s = 12;}

                        else if ( (LA121_0==TIME) && (synpred177_DmlSQL2Parser())) {s = 13;}

                        else if ( (LA121_0==TIMESTAMP) && (synpred177_DmlSQL2Parser())) {s = 14;}

                        else if ( (LA121_0==INTERVAL) && (synpred177_DmlSQL2Parser())) {s = 15;}

                        else if ( (LA121_0==COLON) && (synpred177_DmlSQL2Parser())) {s = 16;}

                        else if ( (LA121_0==QUESTION_MARK) && (synpred177_DmlSQL2Parser())) {s = 17;}

                        else if ( (LA121_0==EMBDD_VARIABLE_NAME) && (synpred177_DmlSQL2Parser())) {s = 18;}

                        else if ( (LA121_0==USER) && (synpred177_DmlSQL2Parser())) {s = 19;}

                        else if ( (LA121_0==CURRENT_USER) && (synpred177_DmlSQL2Parser())) {s = 20;}

                        else if ( (LA121_0==SESSION_USER) && (synpred177_DmlSQL2Parser())) {s = 21;}

                        else if ( (LA121_0==SYSTEM_USER) && (synpred177_DmlSQL2Parser())) {s = 22;}

                        else if ( (LA121_0==VALUE) && (synpred177_DmlSQL2Parser())) {s = 23;}

                        else if ( (LA121_0==COUNT) && (synpred177_DmlSQL2Parser())) {s = 24;}

                        else if ( (LA121_0==AVG||(LA121_0>=MAX && LA121_0<=MIN)||LA121_0==SUM) && (synpred177_DmlSQL2Parser())) {s = 25;}

                        else if ( (LA121_0==NULLIF) && (synpred177_DmlSQL2Parser())) {s = 26;}

                        else if ( (LA121_0==COALESCE) && (synpred177_DmlSQL2Parser())) {s = 27;}

                        else if ( (LA121_0==CASE) && (synpred177_DmlSQL2Parser())) {s = 28;}

                        else if ( (LA121_0==CAST) && (synpred177_DmlSQL2Parser())) {s = 29;}

                        else if ( (LA121_0==POSITION) && (synpred177_DmlSQL2Parser())) {s = 30;}

                        else if ( (LA121_0==EXTRACT) && (synpred177_DmlSQL2Parser())) {s = 31;}

                        else if ( (LA121_0==CHAR_LENGTH||LA121_0==CHARACTER_LENGTH) && (synpred177_DmlSQL2Parser())) {s = 32;}

                        else if ( (LA121_0==OCTET_LENGTH) && (synpred177_DmlSQL2Parser())) {s = 33;}

                        else if ( (LA121_0==BIT_LENGTH) && (synpred177_DmlSQL2Parser())) {s = 34;}

                        else if ( (LA121_0==SUBSTRING) && (synpred177_DmlSQL2Parser())) {s = 35;}

                        else if ( (LA121_0==CHAR) && (synpred177_DmlSQL2Parser())) {s = 36;}

                        else if ( (LA121_0==LOWER||LA121_0==UPPER) && (synpred177_DmlSQL2Parser())) {s = 37;}

                        else if ( (LA121_0==CONVERT) && (synpred177_DmlSQL2Parser())) {s = 38;}

                        else if ( (LA121_0==TRANSLATE) && (synpred177_DmlSQL2Parser())) {s = 39;}

                        else if ( (LA121_0==TRIM) && (synpred177_DmlSQL2Parser())) {s = 40;}

                        else if ( (LA121_0==CURRENT_DATE) && (synpred177_DmlSQL2Parser())) {s = 41;}

                        else if ( (LA121_0==CURRENT_TIME) && (synpred177_DmlSQL2Parser())) {s = 42;}

                        else if ( (LA121_0==CURRENT_TIMESTAMP) && (synpred177_DmlSQL2Parser())) {s = 43;}

                        else if ( (LA121_0==NULL) && (synpred177_DmlSQL2Parser())) {s = 44;}

                        else if ( (LA121_0==DEFAULT) && (synpred177_DmlSQL2Parser())) {s = 45;}

                         
                        input.seek(index121_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA121_6 = input.LA(1);

                         
                        int index121_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_DmlSQL2Parser()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index121_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 121, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA125_eotS =
        "\12\uffff";
    static final String DFA125_eofS =
        "\1\1\11\uffff";
    static final String DFA125_minS =
        "\1\4\1\uffff\6\0\2\uffff";
    static final String DFA125_maxS =
        "\1\u00d2\1\uffff\6\0\2\uffff";
    static final String DFA125_acceptS =
        "\1\uffff\1\3\6\uffff\1\1\1\2";
    static final String DFA125_specialS =
        "\2\uffff\1\2\1\0\1\3\1\5\1\4\1\1\2\uffff}>";
    static final String[] DFA125_transitionS = {
            "\1\1\21\uffff\1\1\50\uffff\1\7\24\uffff\1\1\5\uffff\1\1\1\uffff"+
            "\1\4\1\uffff\2\1\3\uffff\1\3\3\uffff\1\1\1\uffff\1\1\2\uffff"+
            "\1\5\1\uffff\1\4\10\uffff\1\1\4\uffff\1\6\7\uffff\1\1\2\uffff"+
            "\1\1\10\uffff\1\1\2\uffff\1\4\25\uffff\1\2\5\uffff\1\1\5\uffff"+
            "\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\2\uffff\1\1\3\uffff"+
            "\1\1\7\uffff\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA125_eot = DFA.unpackEncodedString(DFA125_eotS);
    static final short[] DFA125_eof = DFA.unpackEncodedString(DFA125_eofS);
    static final char[] DFA125_min = DFA.unpackEncodedStringToUnsignedChars(DFA125_minS);
    static final char[] DFA125_max = DFA.unpackEncodedStringToUnsignedChars(DFA125_maxS);
    static final short[] DFA125_accept = DFA.unpackEncodedString(DFA125_acceptS);
    static final short[] DFA125_special = DFA.unpackEncodedString(DFA125_specialS);
    static final short[][] DFA125_transition;

    static {
        int numStates = DFA125_transitionS.length;
        DFA125_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA125_transition[i] = DFA.unpackEncodedString(DFA125_transitionS[i]);
        }
    }

    class DFA125 extends DFA {

        public DFA125(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 125;
            this.eot = DFA125_eot;
            this.eof = DFA125_eof;
            this.min = DFA125_min;
            this.max = DFA125_max;
            this.accept = DFA125_accept;
            this.special = DFA125_special;
            this.transition = DFA125_transition;
        }
        public String getDescription() {
            return "()* loopback of 408:19: ( options {greedy=true; } : qualified_join | cross_join )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA125_3 = input.LA(1);

                         
                        int index125_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_DmlSQL2Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index125_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA125_7 = input.LA(1);

                         
                        int index125_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_DmlSQL2Parser()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index125_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA125_2 = input.LA(1);

                         
                        int index125_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_DmlSQL2Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index125_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA125_4 = input.LA(1);

                         
                        int index125_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_DmlSQL2Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index125_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA125_6 = input.LA(1);

                         
                        int index125_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_DmlSQL2Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index125_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA125_5 = input.LA(1);

                         
                        int index125_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_DmlSQL2Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index125_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 125, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA129_eotS =
        "\34\uffff";
    static final String DFA129_eofS =
        "\1\6\33\uffff";
    static final String DFA129_minS =
        "\1\4\1\uffff\4\0\26\uffff";
    static final String DFA129_maxS =
        "\1\u00d2\1\uffff\4\0\26\uffff";
    static final String DFA129_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\25\uffff";
    static final String DFA129_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\26\uffff}>";
    static final String[] DFA129_transitionS = {
            "\1\6\21\uffff\1\5\7\uffff\1\1\40\uffff\1\6\24\uffff\1\6\5\uffff"+
            "\1\6\1\uffff\1\6\1\uffff\2\6\3\uffff\1\6\3\uffff\1\6\1\uffff"+
            "\1\6\2\uffff\1\6\1\uffff\1\6\10\uffff\1\6\4\uffff\1\6\7\uffff"+
            "\1\6\2\uffff\1\6\10\uffff\1\6\2\uffff\1\6\25\uffff\1\6\5\uffff"+
            "\1\6\5\uffff\1\6\4\uffff\1\3\4\uffff\1\4\3\uffff\1\6\2\uffff"+
            "\1\6\3\uffff\1\6\7\uffff\1\2",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA129_eot = DFA.unpackEncodedString(DFA129_eotS);
    static final short[] DFA129_eof = DFA.unpackEncodedString(DFA129_eofS);
    static final char[] DFA129_min = DFA.unpackEncodedStringToUnsignedChars(DFA129_minS);
    static final char[] DFA129_max = DFA.unpackEncodedStringToUnsignedChars(DFA129_maxS);
    static final short[] DFA129_accept = DFA.unpackEncodedString(DFA129_acceptS);
    static final short[] DFA129_special = DFA.unpackEncodedString(DFA129_specialS);
    static final short[][] DFA129_transition;

    static {
        int numStates = DFA129_transitionS.length;
        DFA129_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA129_transition[i] = DFA.unpackEncodedString(DFA129_transitionS[i]);
        }
    }

    class DFA129 extends DFA {

        public DFA129(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 129;
            this.eot = DFA129_eot;
            this.eof = DFA129_eof;
            this.min = DFA129_min;
            this.max = DFA129_max;
            this.accept = DFA129_accept;
            this.special = DFA129_special;
            this.transition = DFA129_transition;
        }
        public String getDescription() {
            return "411:35: ( ( AS )? correlation_name ( LEFT_PAREN derived_column_list RIGHT_PAREN )? )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA129_2 = input.LA(1);

                         
                        int index129_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred187_DmlSQL2Parser()) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index129_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA129_3 = input.LA(1);

                         
                        int index129_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred187_DmlSQL2Parser()) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index129_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA129_4 = input.LA(1);

                         
                        int index129_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred187_DmlSQL2Parser()) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index129_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA129_5 = input.LA(1);

                         
                        int index129_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred187_DmlSQL2Parser()&&(true))) ) {s = 1;}

                        else if ( ((true)) ) {s = 6;}

                         
                        input.seek(index129_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 129, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA141_eotS =
        "\24\uffff";
    static final String DFA141_eofS =
        "\1\1\23\uffff";
    static final String DFA141_minS =
        "\1\4\17\uffff\1\0\3\uffff";
    static final String DFA141_maxS =
        "\1\u00d2\17\uffff\1\0\3\uffff";
    static final String DFA141_acceptS =
        "\1\uffff\1\2\21\uffff\1\1";
    static final String DFA141_specialS =
        "\20\uffff\1\0\3\uffff}>";
    static final String[] DFA141_transitionS = {
            "\1\1\21\uffff\1\1\75\uffff\1\1\5\uffff\1\1\3\uffff\2\1\7\uffff"+
            "\1\1\1\uffff\1\1\15\uffff\1\1\17\uffff\1\1\10\uffff\1\1\30\uffff"+
            "\1\1\13\uffff\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\2\uffff"+
            "\1\20\3\uffff\1\1\7\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA141_eot = DFA.unpackEncodedString(DFA141_eotS);
    static final short[] DFA141_eof = DFA.unpackEncodedString(DFA141_eofS);
    static final char[] DFA141_min = DFA.unpackEncodedStringToUnsignedChars(DFA141_minS);
    static final char[] DFA141_max = DFA.unpackEncodedStringToUnsignedChars(DFA141_maxS);
    static final short[] DFA141_accept = DFA.unpackEncodedString(DFA141_acceptS);
    static final short[] DFA141_special = DFA.unpackEncodedString(DFA141_specialS);
    static final short[][] DFA141_transition;

    static {
        int numStates = DFA141_transitionS.length;
        DFA141_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA141_transition[i] = DFA.unpackEncodedString(DFA141_transitionS[i]);
        }
    }

    class DFA141 extends DFA {

        public DFA141(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 141;
            this.eot = DFA141_eot;
            this.eof = DFA141_eof;
            this.min = DFA141_min;
            this.max = DFA141_max;
            this.accept = DFA141_accept;
            this.special = DFA141_special;
            this.transition = DFA141_transition;
        }
        public String getDescription() {
            return "()* loopback of 464:25: ( COMMA grouping_column_ref )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA141_16 = input.LA(1);

                         
                        int index141_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred204_DmlSQL2Parser()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index141_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 141, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA157_eotS =
        "\63\uffff";
    static final String DFA157_eofS =
        "\1\3\62\uffff";
    static final String DFA157_minS =
        "\1\4\1\uffff\1\0\60\uffff";
    static final String DFA157_maxS =
        "\1\u00d2\1\uffff\1\0\60\uffff";
    static final String DFA157_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\56\uffff\1\2";
    static final String DFA157_specialS =
        "\2\uffff\1\0\60\uffff}>";
    static final String[] DFA157_transitionS = {
            "\1\3\3\uffff\1\3\2\uffff\4\3\7\uffff\1\3\3\uffff\1\3\3\uffff"+
            "\1\3\3\uffff\1\1\6\uffff\1\3\17\uffff\1\2\5\uffff\1\3\20\uffff"+
            "\3\3\1\uffff\1\3\5\uffff\3\3\1\uffff\2\3\1\uffff\1\3\1\uffff"+
            "\1\3\3\uffff\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\2\uffff\1\3\3\uffff\2\3\3\uffff\1\3\1\uffff\1\3\5\uffff"+
            "\1\3\1\uffff\2\3\2\uffff\1\3\5\uffff\1\3\2\uffff\1\3\12\uffff"+
            "\1\3\12\uffff\1\3\5\uffff\1\3\4\uffff\2\3\4\uffff\1\3\4\uffff"+
            "\1\3\2\uffff\6\3\2\uffff\4\3\4\uffff\1\3",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA157_eot = DFA.unpackEncodedString(DFA157_eotS);
    static final short[] DFA157_eof = DFA.unpackEncodedString(DFA157_eofS);
    static final char[] DFA157_min = DFA.unpackEncodedStringToUnsignedChars(DFA157_minS);
    static final char[] DFA157_max = DFA.unpackEncodedStringToUnsignedChars(DFA157_maxS);
    static final short[] DFA157_accept = DFA.unpackEncodedString(DFA157_acceptS);
    static final short[] DFA157_special = DFA.unpackEncodedString(DFA157_specialS);
    static final short[][] DFA157_transition;

    static {
        int numStates = DFA157_transitionS.length;
        DFA157_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA157_transition[i] = DFA.unpackEncodedString(DFA157_transitionS[i]);
        }
    }

    class DFA157 extends DFA {

        public DFA157(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 157;
            this.eot = DFA157_eot;
            this.eof = DFA157_eof;
            this.min = DFA157_min;
            this.max = DFA157_max;
            this.accept = DFA157_accept;
            this.special = DFA157_special;
            this.transition = DFA157_transition;
        }
        public String getDescription() {
            return "562:25: ( AT time_zone_specifier | collate_clause )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA157_2 = input.LA(1);

                         
                        int index157_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred240_DmlSQL2Parser()) ) {s = 50;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index157_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 157, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA172_eotS =
        "\25\uffff";
    static final String DFA172_eofS =
        "\25\uffff";
    static final String DFA172_minS =
        "\1\4\21\0\3\uffff";
    static final String DFA172_maxS =
        "\1\u00d2\21\0\3\uffff";
    static final String DFA172_acceptS =
        "\22\uffff\1\1\1\2\1\3";
    static final String DFA172_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\3\uffff}>";
    static final String[] DFA172_transitionS = {
            "\2\11\2\uffff\1\10\6\uffff\1\13\1\14\1\15\1\7\3\uffff\1\4\57"+
            "\uffff\1\16\26\uffff\1\5\12\uffff\1\21\10\uffff\1\5\55\uffff"+
            "\1\17\1\20\31\uffff\1\2\1\11\2\uffff\1\12\1\3\5\uffff\1\10\3"+
            "\uffff\1\6\10\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA172_eot = DFA.unpackEncodedString(DFA172_eotS);
    static final short[] DFA172_eof = DFA.unpackEncodedString(DFA172_eofS);
    static final char[] DFA172_min = DFA.unpackEncodedStringToUnsignedChars(DFA172_minS);
    static final char[] DFA172_max = DFA.unpackEncodedStringToUnsignedChars(DFA172_maxS);
    static final short[] DFA172_accept = DFA.unpackEncodedString(DFA172_acceptS);
    static final short[] DFA172_special = DFA.unpackEncodedString(DFA172_specialS);
    static final short[][] DFA172_transition;

    static {
        int numStates = DFA172_transitionS.length;
        DFA172_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA172_transition[i] = DFA.unpackEncodedString(DFA172_transitionS[i]);
        }
    }

    class DFA172 extends DFA {

        public DFA172(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 172;
            this.eot = DFA172_eot;
            this.eof = DFA172_eof;
            this.min = DFA172_min;
            this.max = DFA172_max;
            this.accept = DFA172_accept;
            this.special = DFA172_special;
            this.transition = DFA172_transition;
        }
        public String getDescription() {
            return "668:1: dyn_cursor_name : ({...}? ( ( cursor_name )=> cursor_name | extended_cursor_name ) | {...}? cursor_name | extended_cursor_name );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA172_1 = input.LA(1);

                         
                        int index172_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( ((synpred263_DmlSQL2Parser()&&(input.LA(1) != INTRODUCER))) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA172_2 = input.LA(1);

                         
                        int index172_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( ((synpred263_DmlSQL2Parser()&&(input.LA(1) != INTRODUCER))) ) {s = 19;}

                         
                        input.seek(index172_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA172_3 = input.LA(1);

                         
                        int index172_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( ((synpred263_DmlSQL2Parser()&&(input.LA(1) != INTRODUCER))) ) {s = 19;}

                         
                        input.seek(index172_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA172_4 = input.LA(1);

                         
                        int index172_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))&&(true))) ) {s = 18;}

                        else if ( (((synpred263_DmlSQL2Parser()&&(input.LA(1) != INTRODUCER))&&(true))) ) {s = 19;}

                         
                        input.seek(index172_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA172_5 = input.LA(1);

                         
                        int index172_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA172_6 = input.LA(1);

                         
                        int index172_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA172_7 = input.LA(1);

                         
                        int index172_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA172_8 = input.LA(1);

                         
                        int index172_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA172_9 = input.LA(1);

                         
                        int index172_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA172_10 = input.LA(1);

                         
                        int index172_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA172_11 = input.LA(1);

                         
                        int index172_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA172_12 = input.LA(1);

                         
                        int index172_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA172_13 = input.LA(1);

                         
                        int index172_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA172_14 = input.LA(1);

                         
                        int index172_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA172_15 = input.LA(1);

                         
                        int index172_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA172_16 = input.LA(1);

                         
                        int index172_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA172_17 = input.LA(1);

                         
                        int index172_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred262_DmlSQL2Parser()&&(input.LA(1) == INTRODUCER))) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index172_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 172, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA171_eotS =
        "\22\uffff";
    static final String DFA171_eofS =
        "\22\uffff";
    static final String DFA171_minS =
        "\1\4\1\0\20\uffff";
    static final String DFA171_maxS =
        "\1\u00d2\1\0\20\uffff";
    static final String DFA171_acceptS =
        "\2\uffff\3\1\1\2\14\uffff";
    static final String DFA171_specialS =
        "\1\0\1\1\20\uffff}>";
    static final String[] DFA171_transitionS = {
            "\2\5\2\uffff\1\5\6\uffff\4\5\3\uffff\1\4\57\uffff\1\5\26\uffff"+
            "\1\5\12\uffff\1\5\10\uffff\1\5\55\uffff\2\5\31\uffff\1\2\1\5"+
            "\2\uffff\1\5\1\3\5\uffff\1\5\3\uffff\1\5\10\uffff\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA171_eot = DFA.unpackEncodedString(DFA171_eotS);
    static final short[] DFA171_eof = DFA.unpackEncodedString(DFA171_eofS);
    static final char[] DFA171_min = DFA.unpackEncodedStringToUnsignedChars(DFA171_minS);
    static final char[] DFA171_max = DFA.unpackEncodedStringToUnsignedChars(DFA171_maxS);
    static final short[] DFA171_accept = DFA.unpackEncodedString(DFA171_acceptS);
    static final short[] DFA171_special = DFA.unpackEncodedString(DFA171_specialS);
    static final short[][] DFA171_transition;

    static {
        int numStates = DFA171_transitionS.length;
        DFA171_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA171_transition[i] = DFA.unpackEncodedString(DFA171_transitionS[i]);
        }
    }

    class DFA171 extends DFA {

        public DFA171(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 171;
            this.eot = DFA171_eot;
            this.eof = DFA171_eof;
            this.min = DFA171_min;
            this.max = DFA171_max;
            this.accept = DFA171_accept;
            this.special = DFA171_special;
            this.transition = DFA171_transition;
        }
        public String getDescription() {
            return "669:36: ( ( cursor_name )=> cursor_name | extended_cursor_name )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA171_0 = input.LA(1);

                         
                        int index171_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA171_0==INTRODUCER) ) {s = 1;}

                        else if ( (LA171_0==REGULAR_ID) && (synpred261_DmlSQL2Parser())) {s = 2;}

                        else if ( (LA171_0==DELIMITED_ID) && (synpred261_DmlSQL2Parser())) {s = 3;}

                        else if ( (LA171_0==ADA) && (synpred261_DmlSQL2Parser())) {s = 4;}

                        else if ( ((LA171_0>=UNSIGNED_INTEGER && LA171_0<=APPROXIMATE_NUM_LIT)||LA171_0==MINUS_SIGN||(LA171_0>=NATIONAL_CHAR_STRING_LIT && LA171_0<=EMBDD_VARIABLE_NAME)||LA171_0==DATE||LA171_0==GLOBAL||LA171_0==INTERVAL||LA171_0==LOCAL||(LA171_0>=TIME && LA171_0<=TIMESTAMP)||LA171_0==EXACT_NUM_LIT||LA171_0==CHAR_STRING||LA171_0==PLUS_SIGN||LA171_0==COLON) ) {s = 5;}

                         
                        input.seek(index171_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA171_1 = input.LA(1);

                         
                        int index171_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred261_DmlSQL2Parser()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index171_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 171, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA210_eotS =
        "\26\uffff";
    static final String DFA210_eofS =
        "\26\uffff";
    static final String DFA210_minS =
        "\1\4\1\0\24\uffff";
    static final String DFA210_maxS =
        "\1\u00d2\1\0\24\uffff";
    static final String DFA210_acceptS =
        "\2\uffff\3\1\1\2\20\uffff";
    static final String DFA210_specialS =
        "\1\0\1\1\24\uffff}>";
    static final String[] DFA210_transitionS = {
            "\2\5\11\uffff\4\5\3\uffff\1\4\56\uffff\2\5\41\uffff\1\5\55"+
            "\uffff\1\5\5\uffff\1\5\2\uffff\2\5\15\uffff\1\5\1\uffff\1\5"+
            "\11\uffff\1\2\1\5\2\uffff\1\5\1\3\11\uffff\1\5\4\uffff\1\5\3"+
            "\uffff\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA210_eot = DFA.unpackEncodedString(DFA210_eotS);
    static final short[] DFA210_eof = DFA.unpackEncodedString(DFA210_eofS);
    static final char[] DFA210_min = DFA.unpackEncodedStringToUnsignedChars(DFA210_minS);
    static final char[] DFA210_max = DFA.unpackEncodedStringToUnsignedChars(DFA210_maxS);
    static final short[] DFA210_accept = DFA.unpackEncodedString(DFA210_acceptS);
    static final short[] DFA210_special = DFA.unpackEncodedString(DFA210_specialS);
    static final short[][] DFA210_transition;

    static {
        int numStates = DFA210_transitionS.length;
        DFA210_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA210_transition[i] = DFA.unpackEncodedString(DFA210_transitionS[i]);
        }
    }

    class DFA210 extends DFA {

        public DFA210(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 210;
            this.eot = DFA210_eot;
            this.eof = DFA210_eof;
            this.min = DFA210_min;
            this.max = DFA210_max;
            this.accept = DFA210_accept;
            this.special = DFA210_special;
            this.transition = DFA210_transition;
        }
        public String getDescription() {
            return "128:36: ( ( column_ref )=> column_ref | unsigned_value_spec )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA210_0 = input.LA(1);

                         
                        int index210_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA210_0==INTRODUCER) ) {s = 1;}

                        else if ( (LA210_0==REGULAR_ID) && (synpred54_DmlSQL2Parser())) {s = 2;}

                        else if ( (LA210_0==DELIMITED_ID) && (synpred54_DmlSQL2Parser())) {s = 3;}

                        else if ( (LA210_0==ADA) && (synpred54_DmlSQL2Parser())) {s = 4;}

                        else if ( ((LA210_0>=UNSIGNED_INTEGER && LA210_0<=APPROXIMATE_NUM_LIT)||(LA210_0>=NATIONAL_CHAR_STRING_LIT && LA210_0<=EMBDD_VARIABLE_NAME)||(LA210_0>=CURRENT_USER && LA210_0<=DATE)||LA210_0==INTERVAL||LA210_0==SESSION_USER||LA210_0==SYSTEM_USER||(LA210_0>=TIME && LA210_0<=TIMESTAMP)||LA210_0==USER||LA210_0==VALUE||LA210_0==EXACT_NUM_LIT||LA210_0==CHAR_STRING||LA210_0==COLON||LA210_0==QUESTION_MARK) ) {s = 5;}

                         
                        input.seek(index210_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA210_1 = input.LA(1);

                         
                        int index210_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_DmlSQL2Parser()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index210_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 210, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA259_eotS =
        "\22\uffff";
    static final String DFA259_eofS =
        "\22\uffff";
    static final String DFA259_minS =
        "\1\4\1\0\20\uffff";
    static final String DFA259_maxS =
        "\1\u00d2\1\0\20\uffff";
    static final String DFA259_acceptS =
        "\2\uffff\3\1\1\2\14\uffff";
    static final String DFA259_specialS =
        "\1\0\1\1\20\uffff}>";
    static final String[] DFA259_transitionS = {
            "\2\5\2\uffff\1\5\6\uffff\4\5\3\uffff\1\4\57\uffff\1\5\26\uffff"+
            "\1\5\12\uffff\1\5\10\uffff\1\5\55\uffff\2\5\31\uffff\1\2\1\5"+
            "\2\uffff\1\5\1\3\5\uffff\1\5\3\uffff\1\5\10\uffff\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA259_eot = DFA.unpackEncodedString(DFA259_eotS);
    static final short[] DFA259_eof = DFA.unpackEncodedString(DFA259_eofS);
    static final char[] DFA259_min = DFA.unpackEncodedStringToUnsignedChars(DFA259_minS);
    static final char[] DFA259_max = DFA.unpackEncodedStringToUnsignedChars(DFA259_maxS);
    static final short[] DFA259_accept = DFA.unpackEncodedString(DFA259_acceptS);
    static final short[] DFA259_special = DFA.unpackEncodedString(DFA259_specialS);
    static final short[][] DFA259_transition;

    static {
        int numStates = DFA259_transitionS.length;
        DFA259_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA259_transition[i] = DFA.unpackEncodedString(DFA259_transitionS[i]);
        }
    }

    class DFA259 extends DFA {

        public DFA259(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 259;
            this.eot = DFA259_eot;
            this.eof = DFA259_eof;
            this.min = DFA259_min;
            this.max = DFA259_max;
            this.accept = DFA259_accept;
            this.special = DFA259_special;
            this.transition = DFA259_transition;
        }
        public String getDescription() {
            return "669:36: ( ( cursor_name )=> cursor_name | extended_cursor_name )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA259_0 = input.LA(1);

                         
                        int index259_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA259_0==INTRODUCER) ) {s = 1;}

                        else if ( (LA259_0==REGULAR_ID) && (synpred261_DmlSQL2Parser())) {s = 2;}

                        else if ( (LA259_0==DELIMITED_ID) && (synpred261_DmlSQL2Parser())) {s = 3;}

                        else if ( (LA259_0==ADA) && (synpred261_DmlSQL2Parser())) {s = 4;}

                        else if ( ((LA259_0>=UNSIGNED_INTEGER && LA259_0<=APPROXIMATE_NUM_LIT)||LA259_0==MINUS_SIGN||(LA259_0>=NATIONAL_CHAR_STRING_LIT && LA259_0<=EMBDD_VARIABLE_NAME)||LA259_0==DATE||LA259_0==GLOBAL||LA259_0==INTERVAL||LA259_0==LOCAL||(LA259_0>=TIME && LA259_0<=TIMESTAMP)||LA259_0==EXACT_NUM_LIT||LA259_0==CHAR_STRING||LA259_0==PLUS_SIGN||LA259_0==COLON) ) {s = 5;}

                         
                        input.seek(index259_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA259_1 = input.LA(1);

                         
                        int index259_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred261_DmlSQL2Parser()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index259_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 259, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ANY_CHARS_in_any_char61 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_sql_stmt_in_sql_script80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_sql_script86 = new BitSet(new long[]{0x0000000000400002L,0x0200001000001000L,0x8402100020200000L,0x0000000000040404L});
    public static final BitSet FOLLOW_sql_stmt_in_sql_script89 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_sql_stmt_in_sql_single_stmt108 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_sql_single_stmt113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_data_stmt_in_sql_stmt130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_data_stmt146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_data_stmt155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_data_stmt164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_data_stmt173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_exp_in_select_stmt187 = new BitSet(new long[]{0x0000000000400012L,0x0000020004000000L,0x8400000000000080L,0x0000000000040000L});
    public static final BitSet FOLLOW_into_clause_in_select_stmt198 = new BitSet(new long[]{0x0000000000400012L,0x0000000004000000L,0x8400000000000080L,0x0000000000040000L});
    public static final BitSet FOLLOW_order_by_clause_in_select_stmt201 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_updatability_clause_in_select_stmt206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_order_by_clause_in_select_stmt218 = new BitSet(new long[]{0x0000000000000002L,0x0000020004000000L});
    public static final BitSet FOLLOW_into_clause_in_select_stmt221 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_updatability_clause_in_select_stmt226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updatability_clause_in_select_stmt238 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_into_clause_in_select_stmt241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTO_in_into_clause272 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_target_spec_in_into_clause274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_into_clause277 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_target_spec_in_into_clause279 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ORDER_in_order_by_clause296 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_BY_in_order_by_clause298 = new BitSet(new long[]{0x0000000000400010L,0x0000000000000000L,0x8400000000000080L,0x0000000000040000L});
    public static final BitSet FOLLOW_sort_spec_list_in_order_by_clause303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sort_spec_in_sort_spec_list317 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_sort_spec_list320 = new BitSet(new long[]{0x0000000000400010L,0x0000000000000000L,0x8400000000000080L,0x0000000000040000L});
    public static final BitSet FOLLOW_sort_spec_in_sort_spec_list322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_sort_key_in_sort_spec338 = new BitSet(new long[]{0x0200000100000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_collate_clause_in_sort_spec341 = new BitSet(new long[]{0x0000000100000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ordering_spec_in_sort_spec346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_ref_in_sort_key364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_sort_key373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ordering_spec0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_updatability_clause412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000020000L});
    public static final BitSet FOLLOW_READ_in_updatability_clause416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ONLY_in_updatability_clause418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updatability_clause422 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OF_in_updatability_clause425 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_column_name_list_in_updatability_clause427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt445 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt447 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_table_name_in_insert_stmt455 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000800L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_insert_columns_and_source_in_insert_stmt458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_insert_columns_and_source484 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_column_name_list_in_insert_columns_and_source486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_insert_columns_and_source488 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_query_exp_in_insert_columns_and_source492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_exp_in_insert_columns_and_source506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_columns_and_source515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_columns_and_source517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt533 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8400000000800000L,0x0000000000040000L});
    public static final BitSet FOLLOW_table_name_in_update_stmt545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_SET_in_update_stmt547 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_set_clause_list_in_update_stmt549 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt553 = new BitSet(new long[]{0x45B6202000478130L,0xC23401000060087BL,0xCC0364C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_search_condition_in_update_stmt556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_in_update_stmt558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OF_in_update_stmt560 = new BitSet(new long[]{0x0000000000478130L,0x0002010020000040L,0xCC00000180000000L,0x0000000000040220L});
    public static final BitSet FOLLOW_dyn_cursor_name_in_update_stmt562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_update_stmt581 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_set_clause_list_in_update_stmt583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_CURRENT_in_update_stmt587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OF_in_update_stmt589 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_cursor_name_in_update_stmt591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_clause_in_set_clause_list614 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_set_clause_list617 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_set_clause_in_set_clause_list619 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_column_name_in_set_clause635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EQUALS_OP_in_set_clause637 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040087AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_update_source_in_set_clause639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_update_source655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_update_source664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_update_source673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt690 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt702 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_table_name_in_delete_stmt704 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt708 = new BitSet(new long[]{0x45B6202000478130L,0xC23401000060087BL,0xCC0364C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_search_condition_in_delete_stmt711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_in_delete_stmt713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OF_in_delete_stmt715 = new BitSet(new long[]{0x0000000000478130L,0x0002010020000040L,0xCC00000180000000L,0x0000000000040220L});
    public static final BitSet FOLLOW_dyn_cursor_name_in_delete_stmt717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_CURRENT_in_delete_stmt736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OF_in_delete_stmt738 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_cursor_name_in_delete_stmt740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTRODUCER_in_id763 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_char_set_name_in_id765 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_REGULAR_ID_in_id776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITED_ID_in_id784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_reserved_word_in_id795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_char_set_name810 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_PERIOD_in_char_set_name813 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_id_in_char_set_name815 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_PERIOD_in_char_set_name818 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_id_in_char_set_name820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_schema_name836 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_PERIOD_in_schema_name839 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_id_in_schema_name841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_name856 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_PERIOD_in_qualified_name866 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_id_in_qualified_name868 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_PERIOD_in_qualified_name878 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_id_in_qualified_name880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_select_list900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_sublist_in_select_list908 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_select_list911 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_select_sublist_in_select_list913 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_table_name_in_select_sublist939 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PERIOD_in_select_sublist941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ASTERISK_in_select_sublist943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derived_column_in_select_sublist951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_derived_column965 = new BitSet(new long[]{0x0000000040400002L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_AS_in_derived_column969 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_column_name_in_derived_column973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_user_difine_function_in_value_exp_primary995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scalar_subquery_in_value_exp_primary1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_ref_in_value_exp_primary1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unsigned_value_spec_in_value_exp_primary1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_ref_in_value_exp_primary1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_fct_spec_in_value_exp_primary1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_exp_in_value_exp_primary1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_spec_in_value_exp_primary1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unsigned_value_spec_in_value_exp_primary1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_value_exp_primary1091 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_value_exp_in_value_exp_primary1093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_value_exp_primary1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_user_difine_function1105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_user_difine_function1107 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601085L,0x000000000004422CL});
    public static final BitSet FOLLOW_value_exp_in_user_difine_function1111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_COMMA_in_user_difine_function1114 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_value_exp_in_user_difine_function1116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_order_by_clause_in_user_difine_function1122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_user_difine_function1126 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_OVER_in_user_difine_function1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_user_difine_function1131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_PARTITION_in_user_difine_function1133 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_BY_in_user_difine_function1135 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_grouping_column_ref_list_in_user_difine_function1137 = new BitSet(new long[]{0x0000000000400010L,0x0000000000000000L,0x8400000000000080L,0x0000000000040000L});
    public static final BitSet FOLLOW_order_by_clause_in_user_difine_function1139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_user_difine_function1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_set_fct_spec1160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_set_fct_spec1162 = new BitSet(new long[]{0x45B6202001478130L,0x023401000040407AL,0xCC0360C1BC601005L,0x0000000000044234L});
    public static final BitSet FOLLOW_ASTERISK_in_set_fct_spec1166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_quantifier_in_set_fct_spec1171 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_value_exp_in_set_fct_spec1175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_set_fct_spec1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_set_fct_spec1188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_set_fct_spec1226 = new BitSet(new long[]{0x45B6202001478130L,0x023401000040407AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_set_quantifier_in_set_fct_spec1229 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_value_exp_in_set_fct_spec1233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_set_fct_spec1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_set_quantifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_abbreviation_in_case_exp1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_spec_in_case_exp1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULLIF_in_case_abbreviation1302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation1304 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_value_exp_in_case_abbreviation1306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_case_abbreviation1308 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_value_exp_in_case_abbreviation1310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COALESCE_in_case_abbreviation1321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation1323 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_value_exp_in_case_abbreviation1325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_COMMA_in_case_abbreviation1328 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_value_exp_in_case_abbreviation1330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_case_in_case_spec1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_searched_case_in_case_spec1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_simple_case1374 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_value_exp_in_simple_case1376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_simple_when_clause_in_simple_case1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L,0x0010000000000000L});
    public static final BitSet FOLLOW_else_clause_in_simple_case1384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_simple_case1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_simple_when_clause1402 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_value_exp_in_simple_when_clause1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_THEN_in_simple_when_clause1406 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_result_in_simple_when_clause1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_clause1422 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_result_in_else_clause1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_result1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_result1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_searched_case1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_searched_when_clause_in_searched_case1468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L,0x0010000000000000L});
    public static final BitSet FOLLOW_else_clause_in_searched_case1473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_searched_case1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_searched_when_clause1491 = new BitSet(new long[]{0x45B6202000478130L,0xC23401000060087AL,0xCC0364C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_search_condition_in_searched_when_clause1493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_THEN_in_searched_when_clause1495 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_result_in_searched_when_clause1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_term_in_search_condition1511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_boolean_term_op_in_search_condition1514 = new BitSet(new long[]{0x45B6202000478130L,0xC23401000060087AL,0xCC0364C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_boolean_term_in_search_condition1516 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_OR_in_boolean_term_op1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_factor_in_boolean_term1545 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_boolean_factor_op_in_boolean_term1548 = new BitSet(new long[]{0x45B6202000478130L,0xC23401000060087AL,0xCC0364C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_boolean_factor_in_boolean_term1550 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_AND_in_boolean_factor_op1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_boolean_factor1580 = new BitSet(new long[]{0x45B6202000478130L,0xC23401000060087AL,0xCC0364C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_boolean_test_in_boolean_factor1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_primary_in_boolean_test1598 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_IS_in_boolean_test1601 = new BitSet(new long[]{0x0000000000000000L,0x4000000000800000L,0x0000090000000000L});
    public static final BitSet FOLLOW_NOT_in_boolean_test1604 = new BitSet(new long[]{0x0000000000000000L,0x4000000000800000L,0x0000090000000000L});
    public static final BitSet FOLLOW_truth_value_in_boolean_test1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_truth_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_boolean_primary1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_boolean_primary1674 = new BitSet(new long[]{0x45B6202000478130L,0xC23401000060087AL,0xCC0364C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_search_condition_in_boolean_primary1676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_boolean_primary1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_in_predicate1694 = new BitSet(new long[]{0x0000020000003800L,0x4009040200000000L,0x0000000000000400L,0x0000000000003800L});
    public static final BitSet FOLLOW_comp_predicate_in_predicate1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_predicate1720 = new BitSet(new long[]{0x0000020000000000L,0x4001000200000000L});
    public static final BitSet FOLLOW_between_predicate_in_predicate1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_predicate_in_predicate1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_like_predicate_in_predicate1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_null_predicate_in_predicate1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantified_comp_predicate_in_predicate1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_predicate_in_predicate1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_overlaps_predicate_in_predicate1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exists_predicate_in_predicate1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unique_predicate_in_predicate1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_op_in_comp_predicate1890 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040087AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_row_value_constructor_in_comp_predicate1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comp_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BETWEEN_in_between_predicate1964 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040087AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_row_value_constructor_in_between_predicate1966 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_AND_in_between_predicate1968 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040087AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_row_value_constructor_in_between_predicate1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_in_predicate1984 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_in_predicate_value_in_in_predicate1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_subquery_in_in_predicate_value2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_in_predicate_value2015 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_in_value_list_in_in_predicate_value2017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_in_predicate_value2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_in_value_list2033 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_in_value_list2036 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_value_exp_in_in_value_list2038 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LIKE_in_like_predicate2054 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_pattern_in_like_predicate2056 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_ESCAPE_in_like_predicate2059 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_escape_char_in_like_predicate2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_exp_in_pattern2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_exp_in_escape_char2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_null_predicate2105 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_NOT_in_null_predicate2108 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_NULL_in_null_predicate2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_op_in_quantified_comp_predicate2126 = new BitSet(new long[]{0x0000000011000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_set_in_quantified_comp_predicate2128 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_table_subquery_in_quantified_comp_predicate2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_exists_predicate2154 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_table_subquery_in_exists_predicate2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_unique_predicate2170 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_table_subquery_in_unique_predicate2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_match_predicate2186 = new BitSet(new long[]{0x0000000000400000L,0x0200000010000000L,0x8402040020200800L,0x0000000000040004L});
    public static final BitSet FOLLOW_UNIQUE_in_match_predicate2189 = new BitSet(new long[]{0x0000000000400000L,0x0200000010000000L,0x8402000020200800L,0x0000000000040004L});
    public static final BitSet FOLLOW_set_in_match_predicate2193 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_table_subquery_in_match_predicate2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERLAPS_in_overlaps_predicate2216 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040087AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_row_value_constructor_in_overlaps_predicate2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast_spec2232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_cast_spec2234 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_cast_operand_in_cast_spec2236 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AS_in_cast_spec2238 = new BitSet(new long[]{0x0050080000400000L,0x2800016003008340L,0xC404000181040002L,0x0000000000040008L});
    public static final BitSet FOLLOW_cast_target_in_cast_spec2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_cast_spec2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_cast_operand2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_cast_operand2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_domain_name_in_cast_target2283 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_data_type_in_cast_target2292 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_FORMAT_in_cast_target2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_CHAR_STRING_in_cast_target2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_string_type_in_data_type2317 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_data_type2320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_SET_in_data_type2322 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_char_set_name_in_data_type2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_national_char_string_type_in_data_type2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bit_string_type_in_data_type2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_type_in_data_type2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datetime_type_in_data_type2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interval_type_in_data_type2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_length2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_char_string_type2401 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_char_string_type2404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_char_string_type2406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_char_string_type2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_string_type2419 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_char_string_type2422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_char_string_type2424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_char_string_type2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_char_string_type2437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_VARYING_in_char_string_type2439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_char_string_type2441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_char_string_type2443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_char_string_type2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_string_type2454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_VARYING_in_char_string_type2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_char_string_type2458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_char_string_type2460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_char_string_type2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARCHAR_in_char_string_type2471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_char_string_type2473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_char_string_type2475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_char_string_type2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIONAL_in_national_char_string_type2493 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_CHARACTER_in_national_char_string_type2506 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_national_char_string_type2509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_national_char_string_type2511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_national_char_string_type2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_national_char_string_type2528 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_national_char_string_type2531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_national_char_string_type2533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_national_char_string_type2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_national_char_string_type2550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_VARYING_in_national_char_string_type2552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_national_char_string_type2554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_national_char_string_type2556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_national_char_string_type2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_national_char_string_type2571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_VARYING_in_national_char_string_type2573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_national_char_string_type2575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_national_char_string_type2577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_national_char_string_type2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCHAR_in_national_char_string_type2597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_national_char_string_type2600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_national_char_string_type2602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_national_char_string_type2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCHAR_in_national_char_string_type2615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_VARYING_in_national_char_string_type2617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_national_char_string_type2619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_national_char_string_type2621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_national_char_string_type2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_in_bit_string_type2639 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_bit_string_type2642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_bit_string_type2644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_bit_string_type2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_in_bit_string_type2661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_VARYING_in_bit_string_type2663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_bit_string_type2665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_length_in_bit_string_type2667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_bit_string_type2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_precision2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_scale2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exact_num_type_in_num_type2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_approximate_num_type_in_num_type2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_approximate_num_type2738 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_approximate_num_type2741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_precision_in_approximate_num_type2743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_approximate_num_type2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_approximate_num_type2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_approximate_num_type2765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PRECISION_in_approximate_num_type2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_in_exact_num_type2783 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_exact_num_type2787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_precision_in_exact_num_type2789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_COMMA_in_exact_num_type2792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_scale_in_exact_num_type2794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_exact_num_type2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_exact_num_type2814 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_exact_num_type2818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_precision_in_exact_num_type2820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_COMMA_in_exact_num_type2823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_scale_in_exact_num_type2825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_exact_num_type2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_exact_num_type2841 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_exact_num_type2845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_precision_in_exact_num_type2847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_COMMA_in_exact_num_type2850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_scale_in_exact_num_type2852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_exact_num_type2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_exact_num_type2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_exact_num_type2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLINT_in_exact_num_type2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_datetime_type2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_datetime_type2911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_datetime_type2914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_time_precision_in_datetime_type2916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_datetime_type2918 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_WITH_in_datetime_type2923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_TIME_in_datetime_type2925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_ZONE_in_datetime_type2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_datetime_type2937 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_datetime_type2940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_timestamp_precision_in_datetime_type2942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_datetime_type2944 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_WITH_in_datetime_type2949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_TIME_in_datetime_type2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_ZONE_in_datetime_type2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERVAL_in_interval_type2969 = new BitSet(new long[]{0x0000000000000000L,0x0440000100000080L,0x0080000000100000L});
    public static final BitSet FOLLOW_interval_qualifier_in_interval_type2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_scalar_subquery2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_subquery3000 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_query_exp_in_subquery3002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_subquery3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_term_in_query_exp3018 = new BitSet(new long[]{0x0000000000000002L,0x0080000000100000L,0x0000020000000000L});
    public static final BitSet FOLLOW_set_in_query_exp3022 = new BitSet(new long[]{0x1000000001400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_ALL_in_query_exp3034 = new BitSet(new long[]{0x1000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_corresponding_spec_in_query_exp3039 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_query_term_in_query_exp3043 = new BitSet(new long[]{0x0000000000000002L,0x0080000000100000L,0x0000020000000000L});
    public static final BitSet FOLLOW_query_primary_in_query_term3059 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_INTERSECT_in_query_term3063 = new BitSet(new long[]{0x1000000001400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_ALL_in_query_term3066 = new BitSet(new long[]{0x1000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_corresponding_spec_in_query_term3071 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_query_primary_in_query_term3075 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_CORRESPONDING_in_corresponding_spec3090 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_BY_in_corresponding_spec3093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_corresponding_spec3095 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_column_name_list_in_corresponding_spec3097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_corresponding_spec3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_table_in_query_primary3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_ref_in_query_primary3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_spec_in_simple_table3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_value_constructor_in_simple_table3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_table_in_simple_table3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_query_spec3175 = new BitSet(new long[]{0x45B6202001478130L,0x023401000040407AL,0xCC0360C1BC601005L,0x0000000000044234L});
    public static final BitSet FOLLOW_set_quantifier_in_query_spec3178 = new BitSet(new long[]{0x45B6202001478130L,0x023401000040407AL,0xCC0360C1BC601005L,0x0000000000044234L});
    public static final BitSet FOLLOW_select_list_in_query_spec3182 = new BitSet(new long[]{0x0000000000000000L,0x0000020008000000L});
    public static final BitSet FOLLOW_into_clause_in_query_spec3186 = new BitSet(new long[]{0x0000000000000000L,0x0000020008000000L});
    public static final BitSet FOLLOW_table_exp_in_query_spec3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUES_in_table_value_constructor3205 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040087AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_table_value_const_list_in_table_value_constructor3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_in_table_value_const_list3219 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_table_value_const_list3222 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040087AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_row_value_constructor_in_table_value_const_list3224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_row_value_constructor_elem_in_row_value_constructor3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_row_value_constructor3261 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040087AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_row_value_const_list_in_row_value_constructor3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_row_value_constructor3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_row_value_constructor_elem3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_row_value_constructor_elem3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_row_value_constructor_elem3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_elem_in_row_value_const_list3313 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_row_value_const_list3316 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040087AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_row_value_constructor_elem_in_row_value_const_list3318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_TABLE_in_explicit_table3334 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_table_name_in_explicit_table3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_ref_aux_in_joined_table3350 = new BitSet(new long[]{0x8000000000000000L,0x1000500810000000L,0x0000020000080000L});
    public static final BitSet FOLLOW_qualified_join_in_joined_table3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cross_join_in_joined_table3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_ref_aux_in_table_ref3372 = new BitSet(new long[]{0x8000000000000002L,0x1000500810000000L,0x0000020000080000L});
    public static final BitSet FOLLOW_qualified_join_in_table_ref3382 = new BitSet(new long[]{0x8000000000000002L,0x1000500810000000L,0x0000020000080000L});
    public static final BitSet FOLLOW_cross_join_in_table_ref3386 = new BitSet(new long[]{0x8000000000000002L,0x1000500810000000L,0x0000020000080000L});
    public static final BitSet FOLLOW_table_name_in_table_ref_aux3402 = new BitSet(new long[]{0x0000000040400002L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_table_subquery_in_table_ref_aux3406 = new BitSet(new long[]{0x0000000040400002L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_AS_in_table_ref_aux3411 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_correlation_name_in_table_ref_aux3415 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_table_ref_aux3418 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_derived_column_list_in_table_ref_aux3420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_table_ref_aux3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_list_in_derived_column_list3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_table_subquery3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CROSS_in_cross_join3468 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_JOIN_in_cross_join3470 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_table_ref_in_cross_join3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INNER_in_qualified_join3489 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_outer_join_type_in_qualified_join3493 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OUTER_in_qualified_join3496 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_JOIN_in_qualified_join3503 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_table_ref_in_qualified_join3505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000010L});
    public static final BitSet FOLLOW_join_spec_in_qualified_join3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_qualified_join3516 = new BitSet(new long[]{0x0000000000000000L,0x0000500810000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_INNER_in_qualified_join3520 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_outer_join_type_in_qualified_join3524 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OUTER_in_qualified_join3527 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_JOIN_in_qualified_join3534 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_table_ref_in_qualified_join3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNION_in_qualified_join3545 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_JOIN_in_qualified_join3547 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_table_ref_in_qualified_join3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_outer_join_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_condition_in_join_spec3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_columns_join_in_join_spec3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_condition3622 = new BitSet(new long[]{0x45B6202000478130L,0xC23401000060087AL,0xCC0364C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_search_condition_in_join_condition3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_named_columns_join3638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_named_columns_join3640 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_column_name_list_in_named_columns_join3642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_named_columns_join3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_from_clause_in_table_exp3658 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L,0x0020000000010000L});
    public static final BitSet FOLLOW_where_clause_in_table_exp3666 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_group_by_clause_in_table_exp3676 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_having_clause_in_table_exp3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_from_clause3702 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_table_ref_list_in_from_clause3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_exp_in_table_ref_list3721 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_table_ref_list3724 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_query_exp_in_table_ref_list3726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_WHERE_in_where_clause3741 = new BitSet(new long[]{0x45B6202000478130L,0xC23401000060087AL,0xCC0364C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_search_condition_in_where_clause3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_group_by_clause3757 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_BY_in_group_by_clause3759 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_grouping_column_ref_list_in_group_by_clause3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_grouping_column_ref3775 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_collate_clause_in_grouping_column_ref3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouping_column_ref_in_grouping_column_ref_list3794 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_grouping_column_ref_list3797 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_grouping_column_ref_in_grouping_column_ref_list3799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_HAVING_in_having_clause3814 = new BitSet(new long[]{0x45B6202000478130L,0xC23401000060087AL,0xCC0364C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_search_condition_in_having_clause3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUALIFY_in_having_clause3824 = new BitSet(new long[]{0x45B6202000478130L,0xC23401000060087AL,0xCC0364C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_search_condition_in_having_clause3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unsigned_lit_in_unsigned_value_spec3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_general_value_spec_in_unsigned_value_spec3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_spec_in_general_value_spec3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dyn_parameter_spec_in_general_value_spec3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_spec_in_general_value_spec3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USER_in_general_value_spec3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_USER_in_general_value_spec3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SESSION_USER_in_general_value_spec3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYSTEM_USER_in_general_value_spec3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_general_value_spec3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_name_in_parameter_spec3938 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INDICATOR_in_parameter_spec3942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parameter_name_in_parameter_spec3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_dyn_parameter_spec3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBDD_VARIABLE_NAME_in_variable_spec3976 = new BitSet(new long[]{0x0000000000040002L,0x0000000400000000L});
    public static final BitSet FOLLOW_INDICATOR_in_variable_spec3980 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EMBDD_VARIABLE_NAME_in_variable_spec3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_num_value_exp4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_exp_in_string_value_exp4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_datetime_value_exp4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_interval_value_exp4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_char_value_exp4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_value_exp4068 = new BitSet(new long[]{0x0000000000004102L,0x0100000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_term_op_in_value_exp4079 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_CONCATENATION_OP_in_value_exp4083 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_term_in_value_exp4086 = new BitSet(new long[]{0x0000000000004102L,0x0100000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_char_value_fct_in_string_value_fct4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_substring_fct_in_char_value_fct4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_length_fct_in_char_value_fct4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fold_in_char_value_fct4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_form_conversion_in_char_value_fct4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_translation_in_char_value_fct4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trim_fct_in_char_value_fct4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_STRING_in_char_value_fct4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_length_fct4182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_char_length_fct4184 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_char_value_exp_in_char_length_fct4186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_char_length_fct4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSTRING_in_char_substring_fct4200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_char_substring_fct4202 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_char_value_exp_in_char_substring_fct4204 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_FROM_in_char_substring_fct4206 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_num_value_exp_in_char_substring_fct4208 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_char_substring_fct4216 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_num_value_exp_in_char_substring_fct4218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_char_substring_fct4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_fold4241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_fold4249 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_char_value_exp_in_fold4251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_fold4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONVERT_in_form_conversion4267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_form_conversion4269 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_char_value_exp_in_form_conversion4271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_USING_in_form_conversion4273 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_form_conversion_name_in_form_conversion4275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_form_conversion4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSLATE_in_char_translation4291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_char_translation4293 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_char_value_exp_in_char_translation4295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_USING_in_char_translation4297 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_translation_name_in_char_translation4299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_char_translation4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIM_in_trim_fct4315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_trim_fct4317 = new BitSet(new long[]{0x45B6A02000478130L,0x023421000840007AL,0xCC0360E1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_trim_operands_in_trim_fct4319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_trim_fct4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trim_spec_in_trim_operands4337 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_FROM_in_trim_operands4339 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_char_value_exp_in_trim_operands4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trim_spec_in_trim_operands4350 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_char_value_exp_in_trim_operands4352 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_FROM_in_trim_operands4354 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_char_value_exp_in_trim_operands4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_trim_operands4365 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_char_value_exp_in_trim_operands4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_exp_in_trim_operands4376 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_FROM_in_trim_operands4379 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_char_value_exp_in_trim_operands4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_trim_spec0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_term_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term4451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_factor_op_in_term4461 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_factor_in_term4463 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_set_in_factor_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sign_in_factor4497 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_gen_primary_in_factor4501 = new BitSet(new long[]{0x0200000400000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_AT_in_factor4504 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_time_zone_specifier_in_factor4506 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_collate_clause_in_factor4510 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_factor4515 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_FORMAT_in_factor4517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_CHAR_STRING_in_factor4519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_factor4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_collate_clause4536 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_collation_name_in_collate_clause4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_primary_in_gen_primary4554 = new BitSet(new long[]{0x0000000000000002L,0x0440000100000080L,0x0080000000100000L});
    public static final BitSet FOLLOW_interval_qualifier_in_gen_primary4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_value_fct_in_gen_primary4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_fct_in_gen_primary4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datetime_value_fct_in_gen_primary4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_position_exp_in_num_value_fct4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extract_exp_in_num_value_fct4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_length_exp_in_num_value_fct4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITION_in_position_exp4632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_position_exp4634 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_char_value_exp_in_position_exp4636 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_IN_in_position_exp4638 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_char_value_exp_in_position_exp4640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_position_exp4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTRACT_in_extract_exp4656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_extract_exp4658 = new BitSet(new long[]{0x0000000000000000L,0x0440000100000080L,0x0080000C00100000L});
    public static final BitSet FOLLOW_extract_field_in_extract_exp4660 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_FROM_in_extract_exp4662 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_extract_source_in_extract_exp4664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_extract_exp4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datetime_field_in_extract_field4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_zone_field_in_extract_field4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_second_datetime_field_in_datetime_field4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_datetime_field4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_time_zone_field0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datetime_value_exp_in_extract_source4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_length_exp_in_length_exp4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_octet_length_exp_in_length_exp4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bit_length_exp_in_length_exp4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_char_length_exp4805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_char_length_exp4813 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_string_value_exp_in_char_length_exp4815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_char_length_exp4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTET_LENGTH_in_octet_length_exp4831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_octet_length_exp4833 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_string_value_exp_in_octet_length_exp4835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_octet_length_exp4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_LENGTH_in_bit_length_exp4851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_bit_length_exp4853 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_string_value_exp_in_bit_length_exp4855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_bit_length_exp4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_in_time_zone_specifier4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_time_zone_specifier4888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_ZONE_in_time_zone_specifier4890 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_interval_value_exp_in_time_zone_specifier4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_current_date_value_fct_in_datetime_value_fct4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_current_time_value_fct_in_datetime_value_fct4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_currenttimestamp_value_fct_in_datetime_value_fct4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_currenttimestamp_value_fct4940 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_currenttimestamp_value_fct4943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_timestamp_precision_in_currenttimestamp_value_fct4945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_currenttimestamp_value_fct4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_current_date_value_fct4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_current_time_value_fct4976 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_current_time_value_fct4979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_time_precision_in_current_time_value_fct4981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_current_time_value_fct4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_timestamp_precision4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_time_precision5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_name_in_table_name5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_local_table_name_in_table_name5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_qualified_local_table_name5050 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PERIOD_in_qualified_local_table_name5052 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_id_in_qualified_local_table_name5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_name_in_domain_name5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_column_name5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_column_name_list5097 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_column_name_list5100 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_column_name_in_column_name_list5102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_id_in_correlation_name5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_cursor_name5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cursor_name_in_dyn_cursor_name5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extended_cursor_name_in_dyn_cursor_name5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cursor_name_in_dyn_cursor_name5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extended_cursor_name_in_dyn_cursor_name5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_extended_cursor_name5194 = new BitSet(new long[]{0x0000000000478130L,0x0002010020000040L,0xCC00000180000000L,0x0000000000040220L});
    public static final BitSet FOLLOW_simple_value_spec_in_extended_cursor_name5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_name_in_simple_value_spec5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBDD_VARIABLE_NAME_in_simple_value_spec5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lit_in_simple_value_spec5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_stmt_name5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_parameter_name5265 = new BitSet(new long[]{0x0000000000400010L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_id_in_parameter_name5276 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_PERIOD_in_parameter_name5279 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_id_in_parameter_name5281 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parameter_name5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_spec_in_target_spec5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_spec_in_target_spec5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_column_ref5339 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_PERIOD_in_column_ref5342 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_id_in_column_ref5344 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_PERIOD_in_column_ref5347 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_id_in_column_ref5349 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_PERIOD_in_column_ref5352 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_id_in_column_ref5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_name_in_translation_name5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_name_in_collation_name5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_name_in_form_conversion_name5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sign0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unsigned_num_lit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTRODUCER_in_char_string_lit5465 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_char_set_name_in_char_string_lit5467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_CHAR_STRING_in_char_string_lit5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unsigned_num_lit_in_unsigned_lit5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_general_lit_in_unsigned_lit5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_string_lit_in_general_lit5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIONAL_CHAR_STRING_LIT_in_general_lit5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_STRING_LIT_in_general_lit5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_STRING_LIT_in_general_lit5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datetime_lit_in_general_lit5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interval_lit_in_general_lit5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_lit_in_datetime_lit5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_lit_in_datetime_lit5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_lit_in_datetime_lit5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_date_lit5604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_CHAR_STRING_in_date_lit5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERVAL_in_interval_lit5620 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000000L,0x4000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_sign_in_interval_lit5623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_CHAR_STRING_in_interval_lit5627 = new BitSet(new long[]{0x0000000000000000L,0x0440000100000080L,0x0080000000100000L});
    public static final BitSet FOLLOW_interval_qualifier_in_interval_lit5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_field_in_interval_qualifier5645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_TO_in_interval_qualifier5658 = new BitSet(new long[]{0x0000000000000000L,0x0440000100000080L,0x0080000000100000L});
    public static final BitSet FOLLOW_end_field_in_interval_qualifier5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_interval_qualifier5690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_interval_qualifier5703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_interval_qualifier5705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_COMMA_in_interval_qualifier5717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_interval_qualifier5719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_interval_qualifier5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_second_datetime_field_in_start_field5759 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_start_field5762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_start_field5764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_start_field5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_second_datetime_field_in_end_field5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_end_field5793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_end_field5796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_end_field5798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_end_field5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_non_second_datetime_field0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_num_lit_in_lit5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_general_lit_in_lit5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sign_in_signed_num_lit5894 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_unsigned_num_lit_in_signed_num_lit5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_timestamp_lit5912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_CHAR_STRING_in_timestamp_lit5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_time_lit5929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_CHAR_STRING_in_time_lit5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADA_in_non_reserved_word5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred27_DmlSQL2Parser475 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_column_name_list_in_synpred27_DmlSQL2Parser477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_synpred27_DmlSQL2Parser479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred28_DmlSQL2Parser484 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_column_name_list_in_synpred28_DmlSQL2Parser486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_synpred28_DmlSQL2Parser488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_exp_in_synpred29_DmlSQL2Parser506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_name_in_synpred49_DmlSQL2Parser931 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PERIOD_in_synpred49_DmlSQL2Parser933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ASTERISK_in_synpred49_DmlSQL2Parser935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_user_difine_function_in_synpred52_DmlSQL2Parser992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scalar_subquery_in_synpred53_DmlSQL2Parser1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_ref_in_synpred54_DmlSQL2Parser1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_ref_in_synpred55_DmlSQL2Parser1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unsigned_value_spec_in_synpred55_DmlSQL2Parser1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_ref_in_synpred56_DmlSQL2Parser1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unsigned_value_spec_in_synpred60_DmlSQL2Parser1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_synpred62_DmlSQL2Parser1111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_synpred62_DmlSQL2Parser1114 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_value_exp_in_synpred62_DmlSQL2Parser1116 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_order_by_clause_in_synpred63_DmlSQL2Parser1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_synpred89_DmlSQL2Parser1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_subquery_in_synpred105_DmlSQL2Parser2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred166_DmlSQL2Parser3022 = new BitSet(new long[]{0x1000000001400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_ALL_in_synpred166_DmlSQL2Parser3034 = new BitSet(new long[]{0x1000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_corresponding_spec_in_synpred166_DmlSQL2Parser3039 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_query_term_in_synpred166_DmlSQL2Parser3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_synpred169_DmlSQL2Parser3063 = new BitSet(new long[]{0x1000000001400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_ALL_in_synpred169_DmlSQL2Parser3066 = new BitSet(new long[]{0x1000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_corresponding_spec_in_synpred169_DmlSQL2Parser3071 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_query_primary_in_synpred169_DmlSQL2Parser3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred176_DmlSQL2Parser3222 = new BitSet(new long[]{0x45B6202000478130L,0x823401000040087AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_row_value_constructor_in_synpred176_DmlSQL2Parser3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_elem_in_synpred177_DmlSQL2Parser3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_join_in_synpred182_DmlSQL2Parser3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cross_join_in_synpred183_DmlSQL2Parser3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_synpred187_DmlSQL2Parser3411 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_correlation_name_in_synpred187_DmlSQL2Parser3415 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred187_DmlSQL2Parser3418 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x8400000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_derived_column_list_in_synpred187_DmlSQL2Parser3420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_synpred187_DmlSQL2Parser3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_where_clause_in_synpred199_DmlSQL2Parser3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_by_clause_in_synpred200_DmlSQL2Parser3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_having_clause_in_synpred201_DmlSQL2Parser3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred202_DmlSQL2Parser3724 = new BitSet(new long[]{0x0000000000400000L,0x0200000000000000L,0x8402000020200000L,0x0000000000040004L});
    public static final BitSet FOLLOW_query_exp_in_synpred202_DmlSQL2Parser3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred204_DmlSQL2Parser3797 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_grouping_column_ref_in_synpred204_DmlSQL2Parser3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_op_in_synpred219_DmlSQL2Parser4079 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_CONCATENATION_OP_in_synpred219_DmlSQL2Parser4083 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_term_in_synpred219_DmlSQL2Parser4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_op_in_synpred236_DmlSQL2Parser4461 = new BitSet(new long[]{0x45B6202000478130L,0x023401000040007AL,0xCC0360C1BC601005L,0x0000000000044224L});
    public static final BitSet FOLLOW_factor_in_synpred236_DmlSQL2Parser4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collate_clause_in_synpred240_DmlSQL2Parser4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred241_DmlSQL2Parser4515 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_FORMAT_in_synpred241_DmlSQL2Parser4517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_CHAR_STRING_in_synpred241_DmlSQL2Parser4519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_synpred241_DmlSQL2Parser4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_primary_in_synpred243_DmlSQL2Parser4554 = new BitSet(new long[]{0x0000000000000002L,0x0440000100000080L,0x0080000000100000L});
    public static final BitSet FOLLOW_interval_qualifier_in_synpred243_DmlSQL2Parser4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_fct_in_synpred245_DmlSQL2Parser4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cursor_name_in_synpred261_DmlSQL2Parser5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cursor_name_in_synpred262_DmlSQL2Parser5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extended_cursor_name_in_synpred262_DmlSQL2Parser5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cursor_name_in_synpred263_DmlSQL2Parser5171 = new BitSet(new long[]{0x0000000000000002L});

}