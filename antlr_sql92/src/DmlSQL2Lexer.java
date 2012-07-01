// $ANTLR 3.3 Nov 30, 2010 12:50:56 E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g 2012-07-01 15:44:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DmlSQL2Lexer extends Lexer {
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

    public DmlSQL2Lexer() {;} 
    public DmlSQL2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DmlSQL2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g"; }

    // $ANTLR start "ADA"
    public final void mADA() throws RecognitionException {
        try {
            int _type = ADA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:25:27: ( A D A )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:25:28: A D A
            {
            mA(); 
            mD(); 
            mA(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADA"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:26:27: ( A L L )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:26:28: A L L
            {
            mA(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:27:27: ( A N D )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:27:28: A N D
            {
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "ANY"
    public final void mANY() throws RecognitionException {
        try {
            int _type = ANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:28:27: ( A N Y )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:28:28: A N Y
            {
            mA(); 
            mN(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANY"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:29:27: ( A S )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:29:28: A S
            {
            mA(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:30:27: ( A S C )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:30:28: A S C
            {
            mA(); 
            mS(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:31:27: ( A T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:31:28: A T
            {
            mA(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "AVG"
    public final void mAVG() throws RecognitionException {
        try {
            int _type = AVG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:32:27: ( A V G )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:32:28: A V G
            {
            mA(); 
            mV(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AVG"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:33:27: ( B E T W E E N )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:33:28: B E T W E E N
            {
            mB(); 
            mE(); 
            mT(); 
            mW(); 
            mE(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "BIT"
    public final void mBIT() throws RecognitionException {
        try {
            int _type = BIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:34:27: ( B I T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:34:28: B I T
            {
            mB(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIT"

    // $ANTLR start "BIT_LENGTH"
    public final void mBIT_LENGTH() throws RecognitionException {
        try {
            int _type = BIT_LENGTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:35:27: ( B I T UNDERSCORE L E N G T H )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:35:28: B I T UNDERSCORE L E N G T H
            {
            mB(); 
            mI(); 
            mT(); 
            mUNDERSCORE(); 
            mL(); 
            mE(); 
            mN(); 
            mG(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIT_LENGTH"

    // $ANTLR start "BOTH"
    public final void mBOTH() throws RecognitionException {
        try {
            int _type = BOTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:36:27: ( B O T H )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:36:28: B O T H
            {
            mB(); 
            mO(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOTH"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:37:27: ( B Y )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:37:28: B Y
            {
            mB(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:38:27: ( C A S E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:38:28: C A S E
            {
            mC(); 
            mA(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CAST"
    public final void mCAST() throws RecognitionException {
        try {
            int _type = CAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:39:27: ( C A S T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:39:28: C A S T
            {
            mC(); 
            mA(); 
            mS(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAST"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:40:27: ( C H A R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:40:28: C H A R
            {
            mC(); 
            mH(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "CHAR_LENGTH"
    public final void mCHAR_LENGTH() throws RecognitionException {
        try {
            int _type = CHAR_LENGTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:41:27: ( C H A R UNDERSCORE L E N G T H )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:41:28: C H A R UNDERSCORE L E N G T H
            {
            mC(); 
            mH(); 
            mA(); 
            mR(); 
            mUNDERSCORE(); 
            mL(); 
            mE(); 
            mN(); 
            mG(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR_LENGTH"

    // $ANTLR start "CHARACTER"
    public final void mCHARACTER() throws RecognitionException {
        try {
            int _type = CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:42:27: ( C H A R A C T E R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:42:28: C H A R A C T E R
            {
            mC(); 
            mH(); 
            mA(); 
            mR(); 
            mA(); 
            mC(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARACTER"

    // $ANTLR start "CHARACTER_LENGTH"
    public final void mCHARACTER_LENGTH() throws RecognitionException {
        try {
            int _type = CHARACTER_LENGTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:43:27: ( C H A R A C T E R UNDERSCORE L E N G T H )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:43:28: C H A R A C T E R UNDERSCORE L E N G T H
            {
            mC(); 
            mH(); 
            mA(); 
            mR(); 
            mA(); 
            mC(); 
            mT(); 
            mE(); 
            mR(); 
            mUNDERSCORE(); 
            mL(); 
            mE(); 
            mN(); 
            mG(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARACTER_LENGTH"

    // $ANTLR start "COALESCE"
    public final void mCOALESCE() throws RecognitionException {
        try {
            int _type = COALESCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:44:27: ( C O A L E S C E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:44:28: C O A L E S C E
            {
            mC(); 
            mO(); 
            mA(); 
            mL(); 
            mE(); 
            mS(); 
            mC(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COALESCE"

    // $ANTLR start "COLLATE"
    public final void mCOLLATE() throws RecognitionException {
        try {
            int _type = COLLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:45:27: ( C O L L A T E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:45:28: C O L L A T E
            {
            mC(); 
            mO(); 
            mL(); 
            mL(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLLATE"

    // $ANTLR start "CONVERT"
    public final void mCONVERT() throws RecognitionException {
        try {
            int _type = CONVERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:46:27: ( C O N V E R T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:46:28: C O N V E R T
            {
            mC(); 
            mO(); 
            mN(); 
            mV(); 
            mE(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONVERT"

    // $ANTLR start "CORRESPONDING"
    public final void mCORRESPONDING() throws RecognitionException {
        try {
            int _type = CORRESPONDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:47:27: ( C O R R E S P O N D I N G )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:47:28: C O R R E S P O N D I N G
            {
            mC(); 
            mO(); 
            mR(); 
            mR(); 
            mE(); 
            mS(); 
            mP(); 
            mO(); 
            mN(); 
            mD(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CORRESPONDING"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:48:27: ( C O U N T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:48:28: C O U N T
            {
            mC(); 
            mO(); 
            mU(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "CROSS"
    public final void mCROSS() throws RecognitionException {
        try {
            int _type = CROSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:49:27: ( C R O S S )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:49:28: C R O S S
            {
            mC(); 
            mR(); 
            mO(); 
            mS(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CROSS"

    // $ANTLR start "CURRENT"
    public final void mCURRENT() throws RecognitionException {
        try {
            int _type = CURRENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:50:27: ( C U R R E N T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:50:28: C U R R E N T
            {
            mC(); 
            mU(); 
            mR(); 
            mR(); 
            mE(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT"

    // $ANTLR start "CURRENT_DATE"
    public final void mCURRENT_DATE() throws RecognitionException {
        try {
            int _type = CURRENT_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:51:27: ( C U R R E N T UNDERSCORE D A T E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:51:28: C U R R E N T UNDERSCORE D A T E
            {
            mC(); 
            mU(); 
            mR(); 
            mR(); 
            mE(); 
            mN(); 
            mT(); 
            mUNDERSCORE(); 
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT_DATE"

    // $ANTLR start "CURRENT_TIME"
    public final void mCURRENT_TIME() throws RecognitionException {
        try {
            int _type = CURRENT_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:52:27: ( C U R R E N T UNDERSCORE T I M E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:52:28: C U R R E N T UNDERSCORE T I M E
            {
            mC(); 
            mU(); 
            mR(); 
            mR(); 
            mE(); 
            mN(); 
            mT(); 
            mUNDERSCORE(); 
            mT(); 
            mI(); 
            mM(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT_TIME"

    // $ANTLR start "CURRENT_TIMESTAMP"
    public final void mCURRENT_TIMESTAMP() throws RecognitionException {
        try {
            int _type = CURRENT_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:53:27: ( C U R R E N T UNDERSCORE T I M E S T A M P )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:53:28: C U R R E N T UNDERSCORE T I M E S T A M P
            {
            mC(); 
            mU(); 
            mR(); 
            mR(); 
            mE(); 
            mN(); 
            mT(); 
            mUNDERSCORE(); 
            mT(); 
            mI(); 
            mM(); 
            mE(); 
            mS(); 
            mT(); 
            mA(); 
            mM(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT_TIMESTAMP"

    // $ANTLR start "CURRENT_USER"
    public final void mCURRENT_USER() throws RecognitionException {
        try {
            int _type = CURRENT_USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:54:27: ( C U R R E N T UNDERSCORE U S E R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:54:28: C U R R E N T UNDERSCORE U S E R
            {
            mC(); 
            mU(); 
            mR(); 
            mR(); 
            mE(); 
            mN(); 
            mT(); 
            mUNDERSCORE(); 
            mU(); 
            mS(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT_USER"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:55:27: ( D A T E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:55:28: D A T E
            {
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "DAY"
    public final void mDAY() throws RecognitionException {
        try {
            int _type = DAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:56:27: ( D A Y )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:56:28: D A Y
            {
            mD(); 
            mA(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DAY"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:57:27: ( D E C )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:57:28: D E C
            {
            mD(); 
            mE(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:58:27: ( D E C I M A L )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:58:28: D E C I M A L
            {
            mD(); 
            mE(); 
            mC(); 
            mI(); 
            mM(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:59:27: ( D E F A U L T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:59:28: D E F A U L T
            {
            mD(); 
            mE(); 
            mF(); 
            mA(); 
            mU(); 
            mL(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:60:27: ( D E L E T E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:60:28: D E L E T E
            {
            mD(); 
            mE(); 
            mL(); 
            mE(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:61:27: ( D E S C )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:61:28: D E S C
            {
            mD(); 
            mE(); 
            mS(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:62:27: ( D I S T I N C T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:62:28: D I S T I N C T
            {
            mD(); 
            mI(); 
            mS(); 
            mT(); 
            mI(); 
            mN(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISTINCT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:63:27: ( D O U B L E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:63:28: D O U B L E
            {
            mD(); 
            mO(); 
            mU(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:64:27: ( E L S E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:64:28: E L S E
            {
            mE(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:65:27: ( E N D )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:65:28: E N D
            {
            mE(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "ESCAPE"
    public final void mESCAPE() throws RecognitionException {
        try {
            int _type = ESCAPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:66:27: ( E S C A P E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:66:28: E S C A P E
            {
            mE(); 
            mS(); 
            mC(); 
            mA(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE"

    // $ANTLR start "EXCEPT"
    public final void mEXCEPT() throws RecognitionException {
        try {
            int _type = EXCEPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:67:27: ( E X C E P T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:67:28: E X C E P T
            {
            mE(); 
            mX(); 
            mC(); 
            mE(); 
            mP(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPT"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:68:27: ( E X I S T S )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:68:28: E X I S T S
            {
            mE(); 
            mX(); 
            mI(); 
            mS(); 
            mT(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "EXTRACT"
    public final void mEXTRACT() throws RecognitionException {
        try {
            int _type = EXTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:69:27: ( E X T R A C T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:69:28: E X T R A C T
            {
            mE(); 
            mX(); 
            mT(); 
            mR(); 
            mA(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTRACT"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:70:27: ( F A L S E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:70:28: F A L S E
            {
            mF(); 
            mA(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:71:27: ( F L O A T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:71:28: F L O A T
            {
            mF(); 
            mL(); 
            mO(); 
            mA(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "FORMAT"
    public final void mFORMAT() throws RecognitionException {
        try {
            int _type = FORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:72:14: ( F O R M A T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:72:15: F O R M A T
            {
            mF(); 
            mO(); 
            mR(); 
            mM(); 
            mA(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORMAT"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:73:27: ( F O R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:73:28: F O R
            {
            mF(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:74:27: ( F R O M )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:74:28: F R O M
            {
            mF(); 
            mR(); 
            mO(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "FULL"
    public final void mFULL() throws RecognitionException {
        try {
            int _type = FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:75:27: ( F U L L )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:75:28: F U L L
            {
            mF(); 
            mU(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FULL"

    // $ANTLR start "GLOBAL"
    public final void mGLOBAL() throws RecognitionException {
        try {
            int _type = GLOBAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:76:27: ( G L O B A L )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:76:28: G L O B A L
            {
            mG(); 
            mL(); 
            mO(); 
            mB(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GLOBAL"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:77:27: ( G R O U P )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:77:28: G R O U P
            {
            mG(); 
            mR(); 
            mO(); 
            mU(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:78:27: ( H A V I N G )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:78:28: H A V I N G
            {
            mH(); 
            mA(); 
            mV(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HAVING"

    // $ANTLR start "HOUR"
    public final void mHOUR() throws RecognitionException {
        try {
            int _type = HOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:79:27: ( H O U R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:79:28: H O U R
            {
            mH(); 
            mO(); 
            mU(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HOUR"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:80:27: ( I N )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:80:28: I N
            {
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INDICATOR"
    public final void mINDICATOR() throws RecognitionException {
        try {
            int _type = INDICATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:81:27: ( I N D I C A T O R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:81:28: I N D I C A T O R
            {
            mI(); 
            mN(); 
            mD(); 
            mI(); 
            mC(); 
            mA(); 
            mT(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDICATOR"

    // $ANTLR start "INNER"
    public final void mINNER() throws RecognitionException {
        try {
            int _type = INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:82:27: ( I N N E R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:82:28: I N N E R
            {
            mI(); 
            mN(); 
            mN(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INNER"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:83:27: ( I N S E R T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:83:28: I N S E R T
            {
            mI(); 
            mN(); 
            mS(); 
            mE(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:84:27: ( I N T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:84:28: I N T
            {
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:85:27: ( I N T E G E R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:85:28: I N T E G E R
            {
            mI(); 
            mN(); 
            mT(); 
            mE(); 
            mG(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "INTERSECT"
    public final void mINTERSECT() throws RecognitionException {
        try {
            int _type = INTERSECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:86:27: ( I N T E R S E C T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:86:28: I N T E R S E C T
            {
            mI(); 
            mN(); 
            mT(); 
            mE(); 
            mR(); 
            mS(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERSECT"

    // $ANTLR start "INTERVAL"
    public final void mINTERVAL() throws RecognitionException {
        try {
            int _type = INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:87:27: ( I N T E R V A L )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:87:28: I N T E R V A L
            {
            mI(); 
            mN(); 
            mT(); 
            mE(); 
            mR(); 
            mV(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERVAL"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:88:27: ( I N T O )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:88:28: I N T O
            {
            mI(); 
            mN(); 
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:89:27: ( I S )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:89:28: I S
            {
            mI(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:90:27: ( J O I N )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:90:28: J O I N
            {
            mJ(); 
            mO(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "LEADING"
    public final void mLEADING() throws RecognitionException {
        try {
            int _type = LEADING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:91:27: ( L E A D I N G )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:91:28: L E A D I N G
            {
            mL(); 
            mE(); 
            mA(); 
            mD(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEADING"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:92:27: ( L E F T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:92:28: L E F T
            {
            mL(); 
            mE(); 
            mF(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT"

    // $ANTLR start "LIKE"
    public final void mLIKE() throws RecognitionException {
        try {
            int _type = LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:93:27: ( L I K E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:93:28: L I K E
            {
            mL(); 
            mI(); 
            mK(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIKE"

    // $ANTLR start "LOCAL"
    public final void mLOCAL() throws RecognitionException {
        try {
            int _type = LOCAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:94:27: ( L O C A L )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:94:28: L O C A L
            {
            mL(); 
            mO(); 
            mC(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOCAL"

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            int _type = LOWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:95:27: ( L O W E R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:95:28: L O W E R
            {
            mL(); 
            mO(); 
            mW(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOWER"

    // $ANTLR start "MATCH"
    public final void mMATCH() throws RecognitionException {
        try {
            int _type = MATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:96:27: ( M A T C H )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:96:28: M A T C H
            {
            mM(); 
            mA(); 
            mT(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MATCH"

    // $ANTLR start "MAX"
    public final void mMAX() throws RecognitionException {
        try {
            int _type = MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:97:27: ( M A X )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:97:28: M A X
            {
            mM(); 
            mA(); 
            mX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAX"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:98:27: ( M I N )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:98:28: M I N
            {
            mM(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "MINUTE"
    public final void mMINUTE() throws RecognitionException {
        try {
            int _type = MINUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:99:27: ( M I N U T E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:99:28: M I N U T E
            {
            mM(); 
            mI(); 
            mN(); 
            mU(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUTE"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:100:13: ( M I N U S )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:100:14: M I N U S
            {
            mM(); 
            mI(); 
            mN(); 
            mU(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:101:27: ( M O D )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:101:28: M O D
            {
            mM(); 
            mO(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:102:27: ( M O D U L E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:102:28: M O D U L E
            {
            mM(); 
            mO(); 
            mD(); 
            mU(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULE"

    // $ANTLR start "MONTH"
    public final void mMONTH() throws RecognitionException {
        try {
            int _type = MONTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:103:27: ( M O N T H )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:103:28: M O N T H
            {
            mM(); 
            mO(); 
            mN(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MONTH"

    // $ANTLR start "NATIONAL"
    public final void mNATIONAL() throws RecognitionException {
        try {
            int _type = NATIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:104:27: ( N A T I O N A L )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:104:28: N A T I O N A L
            {
            mN(); 
            mA(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NATIONAL"

    // $ANTLR start "NATURAL"
    public final void mNATURAL() throws RecognitionException {
        try {
            int _type = NATURAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:105:27: ( N A T U R A L )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:105:28: N A T U R A L
            {
            mN(); 
            mA(); 
            mT(); 
            mU(); 
            mR(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NATURAL"

    // $ANTLR start "NCHAR"
    public final void mNCHAR() throws RecognitionException {
        try {
            int _type = NCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:106:27: ( N C H A R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:106:28: N C H A R
            {
            mN(); 
            mC(); 
            mH(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NCHAR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:107:27: ( N O T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:107:28: N O T
            {
            mN(); 
            mO(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:108:27: ( N U L L )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:108:28: N U L L
            {
            mN(); 
            mU(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "NULLIF"
    public final void mNULLIF() throws RecognitionException {
        try {
            int _type = NULLIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:109:27: ( N U L L I F )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:109:28: N U L L I F
            {
            mN(); 
            mU(); 
            mL(); 
            mL(); 
            mI(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULLIF"

    // $ANTLR start "NUMERIC"
    public final void mNUMERIC() throws RecognitionException {
        try {
            int _type = NUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:110:27: ( N U M E R I C )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:110:28: N U M E R I C
            {
            mN(); 
            mU(); 
            mM(); 
            mE(); 
            mR(); 
            mI(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMERIC"

    // $ANTLR start "OCTET_LENGTH"
    public final void mOCTET_LENGTH() throws RecognitionException {
        try {
            int _type = OCTET_LENGTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:111:27: ( O C T E T UNDERSCORE L E N G T H )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:111:28: O C T E T UNDERSCORE L E N G T H
            {
            mO(); 
            mC(); 
            mT(); 
            mE(); 
            mT(); 
            mUNDERSCORE(); 
            mL(); 
            mE(); 
            mN(); 
            mG(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OCTET_LENGTH"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:112:27: ( O F )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:112:28: O F
            {
            mO(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:113:27: ( O N )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:113:28: O N
            {
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "ONLY"
    public final void mONLY() throws RecognitionException {
        try {
            int _type = ONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:114:27: ( O N L Y )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:114:28: O N L Y
            {
            mO(); 
            mN(); 
            mL(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ONLY"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:115:27: ( O R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:115:28: O R
            {
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:116:27: ( O R D E R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:116:28: O R D E R
            {
            mO(); 
            mR(); 
            mD(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "OUTER"
    public final void mOUTER() throws RecognitionException {
        try {
            int _type = OUTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:117:27: ( O U T E R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:117:28: O U T E R
            {
            mO(); 
            mU(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OUTER"

    // $ANTLR start "OVER"
    public final void mOVER() throws RecognitionException {
        try {
            int _type = OVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:118:12: ( O V E R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:118:13: O V E R
            {
            mO(); 
            mV(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OVER"

    // $ANTLR start "OVERLAPS"
    public final void mOVERLAPS() throws RecognitionException {
        try {
            int _type = OVERLAPS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:119:27: ( O V E R L A P S )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:119:28: O V E R L A P S
            {
            mO(); 
            mV(); 
            mE(); 
            mR(); 
            mL(); 
            mA(); 
            mP(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OVERLAPS"

    // $ANTLR start "PARTIAL"
    public final void mPARTIAL() throws RecognitionException {
        try {
            int _type = PARTIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:120:27: ( P A R T I A L )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:120:28: P A R T I A L
            {
            mP(); 
            mA(); 
            mR(); 
            mT(); 
            mI(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARTIAL"

    // $ANTLR start "POSITION"
    public final void mPOSITION() throws RecognitionException {
        try {
            int _type = POSITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:121:27: ( P O S I T I O N )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:121:28: P O S I T I O N
            {
            mP(); 
            mO(); 
            mS(); 
            mI(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POSITION"

    // $ANTLR start "PRECISION"
    public final void mPRECISION() throws RecognitionException {
        try {
            int _type = PRECISION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:122:27: ( P R E C I S I O N )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:122:28: P R E C I S I O N
            {
            mP(); 
            mR(); 
            mE(); 
            mC(); 
            mI(); 
            mS(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRECISION"

    // $ANTLR start "PARTITION"
    public final void mPARTITION() throws RecognitionException {
        try {
            int _type = PARTITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:123:27: ( P A R T I T I O N )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:123:28: P A R T I T I O N
            {
            mP(); 
            mA(); 
            mR(); 
            mT(); 
            mI(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARTITION"

    // $ANTLR start "QUALIFY"
    public final void mQUALIFY() throws RecognitionException {
        try {
            int _type = QUALIFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:124:27: ( Q U A L I F Y )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:124:28: Q U A L I F Y
            {
            mQ(); 
            mU(); 
            mA(); 
            mL(); 
            mI(); 
            mF(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUALIFY"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:125:27: ( R E A D )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:125:28: R E A D
            {
            mR(); 
            mE(); 
            mA(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:126:27: ( R E A L )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:126:28: R E A L
            {
            mR(); 
            mE(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "RIGHT"
    public final void mRIGHT() throws RecognitionException {
        try {
            int _type = RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:127:27: ( R I G H T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:127:28: R I G H T
            {
            mR(); 
            mI(); 
            mG(); 
            mH(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT"

    // $ANTLR start "SECOND"
    public final void mSECOND() throws RecognitionException {
        try {
            int _type = SECOND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:128:27: ( S E C O N D )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:128:28: S E C O N D
            {
            mS(); 
            mE(); 
            mC(); 
            mO(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SECOND"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:129:27: ( S E L E C T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:129:28: S E L E C T
            {
            mS(); 
            mE(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "SESSION_USER"
    public final void mSESSION_USER() throws RecognitionException {
        try {
            int _type = SESSION_USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:130:27: ( S E S S I O N UNDERSCORE U S E R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:130:28: S E S S I O N UNDERSCORE U S E R
            {
            mS(); 
            mE(); 
            mS(); 
            mS(); 
            mI(); 
            mO(); 
            mN(); 
            mUNDERSCORE(); 
            mU(); 
            mS(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SESSION_USER"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:131:27: ( S E T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:131:28: S E T
            {
            mS(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "SMALLINT"
    public final void mSMALLINT() throws RecognitionException {
        try {
            int _type = SMALLINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:132:27: ( S M A L L I N T )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:132:28: S M A L L I N T
            {
            mS(); 
            mM(); 
            mA(); 
            mL(); 
            mL(); 
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SMALLINT"

    // $ANTLR start "SOME"
    public final void mSOME() throws RecognitionException {
        try {
            int _type = SOME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:133:27: ( S O M E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:133:28: S O M E
            {
            mS(); 
            mO(); 
            mM(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOME"

    // $ANTLR start "SUBSTRING"
    public final void mSUBSTRING() throws RecognitionException {
        try {
            int _type = SUBSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:134:27: ( S U B S T R I N G )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:134:28: S U B S T R I N G
            {
            mS(); 
            mU(); 
            mB(); 
            mS(); 
            mT(); 
            mR(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBSTRING"

    // $ANTLR start "SUM"
    public final void mSUM() throws RecognitionException {
        try {
            int _type = SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:135:27: ( S U M )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:135:28: S U M
            {
            mS(); 
            mU(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUM"

    // $ANTLR start "SYSTEM_USER"
    public final void mSYSTEM_USER() throws RecognitionException {
        try {
            int _type = SYSTEM_USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:136:27: ( S Y S T E M UNDERSCORE U S E R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:136:28: S Y S T E M UNDERSCORE U S E R
            {
            mS(); 
            mY(); 
            mS(); 
            mT(); 
            mE(); 
            mM(); 
            mUNDERSCORE(); 
            mU(); 
            mS(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SYSTEM_USER"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:137:27: ( T A B L E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:137:28: T A B L E
            {
            mT(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:138:27: ( T H E N )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:138:28: T H E N
            {
            mT(); 
            mH(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:139:27: ( T I M E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:139:28: T I M E
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIME"

    // $ANTLR start "TIMESTAMP"
    public final void mTIMESTAMP() throws RecognitionException {
        try {
            int _type = TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:140:27: ( T I M E S T A M P )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:140:28: T I M E S T A M P
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 
            mS(); 
            mT(); 
            mA(); 
            mM(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMESTAMP"

    // $ANTLR start "TIMEZONE_HOUR"
    public final void mTIMEZONE_HOUR() throws RecognitionException {
        try {
            int _type = TIMEZONE_HOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:141:27: ( T I M E Z O N E UNDERSCORE H O U R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:141:28: T I M E Z O N E UNDERSCORE H O U R
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 
            mZ(); 
            mO(); 
            mN(); 
            mE(); 
            mUNDERSCORE(); 
            mH(); 
            mO(); 
            mU(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEZONE_HOUR"

    // $ANTLR start "TIMEZONE_MINUTE"
    public final void mTIMEZONE_MINUTE() throws RecognitionException {
        try {
            int _type = TIMEZONE_MINUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:142:27: ( T I M E Z O N E UNDERSCORE M I N U T E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:142:28: T I M E Z O N E UNDERSCORE M I N U T E
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 
            mZ(); 
            mO(); 
            mN(); 
            mE(); 
            mUNDERSCORE(); 
            mM(); 
            mI(); 
            mN(); 
            mU(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEZONE_MINUTE"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:143:27: ( T O )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:143:28: T O
            {
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "TRAILING"
    public final void mTRAILING() throws RecognitionException {
        try {
            int _type = TRAILING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:144:27: ( T R A I L I N G )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:144:28: T R A I L I N G
            {
            mT(); 
            mR(); 
            mA(); 
            mI(); 
            mL(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRAILING"

    // $ANTLR start "TRANSLATE"
    public final void mTRANSLATE() throws RecognitionException {
        try {
            int _type = TRANSLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:145:27: ( T R A N S L A T E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:145:28: T R A N S L A T E
            {
            mT(); 
            mR(); 
            mA(); 
            mN(); 
            mS(); 
            mL(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRANSLATE"

    // $ANTLR start "TRIM"
    public final void mTRIM() throws RecognitionException {
        try {
            int _type = TRIM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:146:27: ( T R I M )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:146:28: T R I M
            {
            mT(); 
            mR(); 
            mI(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRIM"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:147:27: ( T R U E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:147:28: T R U E
            {
            mT(); 
            mR(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "UNION"
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:148:27: ( U N I O N )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:148:28: U N I O N
            {
            mU(); 
            mN(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNION"

    // $ANTLR start "UNIQUE"
    public final void mUNIQUE() throws RecognitionException {
        try {
            int _type = UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:149:27: ( U N I Q U E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:149:28: U N I Q U E
            {
            mU(); 
            mN(); 
            mI(); 
            mQ(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNIQUE"

    // $ANTLR start "UNKNOWN"
    public final void mUNKNOWN() throws RecognitionException {
        try {
            int _type = UNKNOWN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:150:27: ( U N K N O W N )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:150:28: U N K N O W N
            {
            mU(); 
            mN(); 
            mK(); 
            mN(); 
            mO(); 
            mW(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNKNOWN"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:151:27: ( U P D A T E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:151:28: U P D A T E
            {
            mU(); 
            mP(); 
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            int _type = UPPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:152:27: ( U P P E R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:152:28: U P P E R
            {
            mU(); 
            mP(); 
            mP(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPPER"

    // $ANTLR start "USER"
    public final void mUSER() throws RecognitionException {
        try {
            int _type = USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:153:27: ( U S E R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:153:28: U S E R
            {
            mU(); 
            mS(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USER"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:154:27: ( U S I N G )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:154:28: U S I N G
            {
            mU(); 
            mS(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:155:27: ( V A L U E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:155:28: V A L U E
            {
            mV(); 
            mA(); 
            mL(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUE"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:156:27: ( V A L U E S )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:156:28: V A L U E S
            {
            mV(); 
            mA(); 
            mL(); 
            mU(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "VARCHAR"
    public final void mVARCHAR() throws RecognitionException {
        try {
            int _type = VARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:157:27: ( V A R C H A R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:157:28: V A R C H A R
            {
            mV(); 
            mA(); 
            mR(); 
            mC(); 
            mH(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARCHAR"

    // $ANTLR start "VARYING"
    public final void mVARYING() throws RecognitionException {
        try {
            int _type = VARYING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:158:27: ( V A R Y I N G )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:158:28: V A R Y I N G
            {
            mV(); 
            mA(); 
            mR(); 
            mY(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARYING"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:159:27: ( W H E N )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:159:28: W H E N
            {
            mW(); 
            mH(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:160:27: ( W H E R E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:160:28: W H E R E
            {
            mW(); 
            mH(); 
            mE(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:161:27: ( W I T H )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:161:28: W I T H
            {
            mW(); 
            mI(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "YEAR"
    public final void mYEAR() throws RecognitionException {
        try {
            int _type = YEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:162:27: ( Y E A R )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:162:28: Y E A R
            {
            mY(); 
            mE(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YEAR"

    // $ANTLR start "ZONE"
    public final void mZONE() throws RecognitionException {
        try {
            int _type = ZONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:163:27: ( Z O N E )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:163:28: Z O N E
            {
            mZ(); 
            mO(); 
            mN(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ZONE"

    // $ANTLR start "REGULAR_ID"
    public final void mREGULAR_ID() throws RecognitionException {
        try {
            int _type = REGULAR_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:165:12: ( ( NATIONAL_CHAR_STRING_LIT | BIT_STRING_LIT | HEX_STRING_LIT ) | ( SIMPLE_LETTER ) ( SIMPLE_LETTER | '_' | '0' .. '9' )* )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 'N':
            case 'n':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='\'') ) {
                    alt3=1;
                }
                else {
                    alt3=2;}
                }
                break;
            case 'B':
            case 'b':
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='\'') ) {
                    alt3=1;
                }
                else {
                    alt3=2;}
                }
                break;
            case 'X':
            case 'x':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='\'') ) {
                    alt3=1;
                }
                else {
                    alt3=2;}
                }
                break;
            case '\"':
            case '$':
            case ':':
            case 'A':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'Y':
            case 'Z':
            case 'a':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'y':
            case 'z':
            case '{':
            case '}':
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:166:5: ( NATIONAL_CHAR_STRING_LIT | BIT_STRING_LIT | HEX_STRING_LIT )
                    {
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:166:5: ( NATIONAL_CHAR_STRING_LIT | BIT_STRING_LIT | HEX_STRING_LIT )
                    int alt1=3;
                    switch ( input.LA(1) ) {
                    case 'N':
                    case 'n':
                        {
                        alt1=1;
                        }
                        break;
                    case 'B':
                    case 'b':
                        {
                        alt1=2;
                        }
                        break;
                    case 'X':
                    case 'x':
                        {
                        alt1=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }

                    switch (alt1) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:166:7: NATIONAL_CHAR_STRING_LIT
                            {
                            mNATIONAL_CHAR_STRING_LIT(); 
                             _type = NATIONAL_CHAR_STRING_LIT;

                            }
                            break;
                        case 2 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:167:7: BIT_STRING_LIT
                            {
                            mBIT_STRING_LIT(); 
                             _type = BIT_STRING_LIT;

                            }
                            break;
                        case 3 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:168:7: HEX_STRING_LIT
                            {
                            mHEX_STRING_LIT(); 
                             _type = HEX_STRING_LIT;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:171:7: ( SIMPLE_LETTER ) ( SIMPLE_LETTER | '_' | '0' .. '9' )*
                    {
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:171:7: ( SIMPLE_LETTER )
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:171:8: SIMPLE_LETTER
                    {
                    mSIMPLE_LETTER(); 

                    }

                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:171:23: ( SIMPLE_LETTER | '_' | '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\"'||LA2_0=='$'||(LA2_0>='0' && LA2_0<=':')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='{')||LA2_0=='}') ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
                    	    {
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='{')||input.LA(1)=='}' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                     _type = REGULAR_ID;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGULAR_ID"

    // $ANTLR start "EXACT_NUM_LIT"
    public final void mEXACT_NUM_LIT() throws RecognitionException {
        try {
            int _type = EXACT_NUM_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:173:15: ( UNSIGNED_INTEGER ( '.' ( UNSIGNED_INTEGER )? | ) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.' | '.' '.' )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='.') ) {
                switch ( input.LA(2) ) {
                case '.':
                    {
                    alt10=4;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt10=2;
                    }
                    break;
                default:
                    alt10=3;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:174:7: UNSIGNED_INTEGER ( '.' ( UNSIGNED_INTEGER )? | ) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
                    {
                    mUNSIGNED_INTEGER(); 
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:175:9: ( '.' ( UNSIGNED_INTEGER )? | )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    else {
                        alt5=2;}
                    switch (alt5) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:175:11: '.' ( UNSIGNED_INTEGER )?
                            {
                            match('.'); 
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:175:15: ( UNSIGNED_INTEGER )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:175:16: UNSIGNED_INTEGER
                                    {
                                    mUNSIGNED_INTEGER(); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:176:13: 
                            {
                             _type = UNSIGNED_INTEGER;

                            }
                            break;

                    }

                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:177:11: ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:177:13: ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:177:25: ( '+' | '-' )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0=='+'||LA6_0=='-') ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            mUNSIGNED_INTEGER(); 
                             _type = APPROXIMATE_NUM_LIT;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:178:7: '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
                    {
                    match('.'); 
                    mUNSIGNED_INTEGER(); 
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:178:28: ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:178:30: ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:178:42: ( '+' | '-' )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0=='+'||LA8_0=='-') ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            mUNSIGNED_INTEGER(); 
                             _type = APPROXIMATE_NUM_LIT;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:179:7: '.'
                    {
                    match('.'); 
                     _type = PERIOD;

                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:180:7: '.' '.'
                    {
                    match('.'); 
                    match('.'); 
                     _type = DOUBLE_PERIOD;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXACT_NUM_LIT"

    // $ANTLR start "UNSIGNED_INTEGER"
    public final void mUNSIGNED_INTEGER() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:183:18: ( ( '0' .. '9' )+ )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:184:5: ( '0' .. '9' )+
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:184:5: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:184:6: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "UNSIGNED_INTEGER"

    // $ANTLR start "NATIONAL_CHAR_STRING_LIT"
    public final void mNATIONAL_CHAR_STRING_LIT() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:187:26: ( ( 'N' | 'n' ) ( '\\'' ( options {greedy=true; } : ~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' ( SEPARATOR )? )+ )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:188:5: ( 'N' | 'n' ) ( '\\'' ( options {greedy=true; } : ~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' ( SEPARATOR )? )+
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:188:17: ( '\\'' ( options {greedy=true; } : ~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' ( SEPARATOR )? )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\'') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:188:18: '\\'' ( options {greedy=true; } : ~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' ( SEPARATOR )?
            	    {
            	    match('\''); 
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:188:23: ( options {greedy=true; } : ~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )*
            	    loop12:
            	    do {
            	        int alt12=4;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0=='\'') ) {
            	            int LA12_1 = input.LA(2);

            	            if ( (LA12_1=='\'') ) {
            	                alt12=2;
            	            }


            	        }
            	        else if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='\uFFFF')) ) {
            	            alt12=1;
            	        }
            	        else if ( (LA12_0=='\n'||LA12_0=='\r') ) {
            	            alt12=3;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:188:47: ~ ( '\\'' | '\\r' | '\\n' )
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:188:72: '\\'' '\\''
            	    	    {
            	    	    match('\''); 
            	    	    match('\''); 

            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:188:84: NEWLINE
            	    	    {
            	    	    mNEWLINE(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);

            	    match('\''); 
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:188:99: ( SEPARATOR )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' '||LA13_0=='-'||LA13_0=='/') ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:188:100: SEPARATOR
            	            {
            	            mSEPARATOR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "NATIONAL_CHAR_STRING_LIT"

    // $ANTLR start "BIT_STRING_LIT"
    public final void mBIT_STRING_LIT() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:191:16: ( ( 'B' | 'b' ) ( '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )? )+ )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:192:5: ( 'B' | 'b' ) ( '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )? )+
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:192:17: ( '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )? )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\'') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:192:18: '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )?
            	    {
            	    match('\''); 
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:192:23: ( '0' | '1' )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( ((LA15_0>='0' && LA15_0<='1')) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);

            	    match('\''); 
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:192:41: ( SEPARATOR )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' '||LA16_0=='-'||LA16_0=='/') ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:192:42: SEPARATOR
            	            {
            	            mSEPARATOR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "BIT_STRING_LIT"

    // $ANTLR start "HEX_STRING_LIT"
    public final void mHEX_STRING_LIT() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:195:16: ( ( 'X' | 'x' ) ( '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )? )+ )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:196:5: ( 'X' | 'x' ) ( '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )? )+
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:196:17: ( '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )? )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\'') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:196:18: '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )?
            	    {
            	    match('\''); 
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:196:23: ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='F')||(LA18_0>='a' && LA18_0<='f')) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);

            	    match('\''); 
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:196:62: ( SEPARATOR )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' '||LA19_0=='-'||LA19_0=='/') ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:196:63: SEPARATOR
            	            {
            	            mSEPARATOR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_STRING_LIT"

    // $ANTLR start "CHAR_STRING"
    public final void mCHAR_STRING() throws RecognitionException {
        try {
            int _type = CHAR_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:198:13: ( ( '\\'' ( options {greedy=true; } : ~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' ( SEPARATOR )? )+ | '\\'' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\'') ) {
                int LA24_1 = input.LA(2);

                if ( ((LA24_1>='\u0000' && LA24_1<='\uFFFF')) ) {
                    alt24=1;
                }
                else {
                    alt24=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:199:7: ( '\\'' ( options {greedy=true; } : ~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' ( SEPARATOR )? )+
                    {
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:199:7: ( '\\'' ( options {greedy=true; } : ~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' ( SEPARATOR )? )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\'') ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:199:8: '\\'' ( options {greedy=true; } : ~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' ( SEPARATOR )?
                    	    {
                    	    match('\''); 
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:199:13: ( options {greedy=true; } : ~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )*
                    	    loop21:
                    	    do {
                    	        int alt21=4;
                    	        int LA21_0 = input.LA(1);

                    	        if ( (LA21_0=='\'') ) {
                    	            int LA21_1 = input.LA(2);

                    	            if ( (LA21_1=='\'') ) {
                    	                alt21=2;
                    	            }


                    	        }
                    	        else if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='\uFFFF')) ) {
                    	            alt21=1;
                    	        }
                    	        else if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                    	            alt21=3;
                    	        }


                    	        switch (alt21) {
                    	    	case 1 :
                    	    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:199:37: ~ ( '\\'' | '\\r' | '\\n' )
                    	    	    {
                    	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}


                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:199:61: '\\'' '\\''
                    	    	    {
                    	    	    match('\''); 
                    	    	    match('\''); 

                    	    	    }
                    	    	    break;
                    	    	case 3 :
                    	    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:199:73: NEWLINE
                    	    	    {
                    	    	    mNEWLINE(); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop21;
                    	        }
                    	    } while (true);

                    	    match('\''); 
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:199:88: ( SEPARATOR )?
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' '||LA22_0=='-'||LA22_0=='/') ) {
                    	        alt22=1;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:199:89: SEPARATOR
                    	            {
                    	            mSEPARATOR(); 

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:200:7: '\\''
                    {
                    match('\''); 
                     _type = QUOTE;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR_STRING"

    // $ANTLR start "DELIMITED_ID"
    public final void mDELIMITED_ID() throws RecognitionException {
        try {
            int _type = DELIMITED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:202:14: ( '\"' (~ ( '\"' | '\\r' | '\\n' ) | '\"' '\"' )+ '\"' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:203:5: '\"' (~ ( '\"' | '\\r' | '\\n' ) | '\"' '\"' )+ '\"'
            {
            match('\"'); 
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:203:9: (~ ( '\"' | '\\r' | '\\n' ) | '\"' '\"' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\"') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='\"') ) {
                        alt25=2;
                    }


                }
                else if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='!')||(LA25_0>='#' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:203:10: ~ ( '\"' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:203:33: '\"' '\"'
            	    {
            	    match('\"'); 
            	    match('\"'); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELIMITED_ID"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:205:9: ( '%' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:205:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:206:11: ( '&' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:206:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:207:12: ( '(' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:207:14: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:208:13: ( ')' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:208:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:209:10: ( '*' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:209:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "PLUS_SIGN"
    public final void mPLUS_SIGN() throws RecognitionException {
        try {
            int _type = PLUS_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:210:11: ( '+' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:210:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS_SIGN"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:211:7: ( ',' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:211:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SOLIDUS"
    public final void mSOLIDUS() throws RecognitionException {
        try {
            int _type = SOLIDUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:212:9: ( '/' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:212:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOLIDUS"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:213:7: ( ':' | ':' ( SIMPLE_LETTER_2 | '0' .. '9' | '.' | '_' | '#' | '$' | '&' | '%' | '@' )+ )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==':') ) {
                int LA27_1 = input.LA(2);

                if ( ((LA27_1>='#' && LA27_1<='&')||LA27_1=='.'||(LA27_1>='0' && LA27_1<='9')||(LA27_1>='@' && LA27_1<='Z')||LA27_1=='_'||(LA27_1>='a' && LA27_1<='z')) ) {
                    alt27=2;
                }
                else {
                    alt27=1;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:214:7: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:215:7: ':' ( SIMPLE_LETTER_2 | '0' .. '9' | '.' | '_' | '#' | '$' | '&' | '%' | '@' )+
                    {
                    match(':'); 
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:215:11: ( SIMPLE_LETTER_2 | '0' .. '9' | '.' | '_' | '#' | '$' | '&' | '%' | '@' )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>='#' && LA26_0<='&')||LA26_0=='.'||(LA26_0>='0' && LA26_0<='9')||(LA26_0>='@' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
                    	    {
                    	    if ( (input.LA(1)>='#' && input.LA(1)<='&')||input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                     _type = EMBDD_VARIABLE_NAME;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:217:11: ( ';' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:217:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "LESS_THAN_OP"
    public final void mLESS_THAN_OP() throws RecognitionException {
        try {
            int _type = LESS_THAN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:218:14: ( '<' ( '>' | '=' )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:218:16: '<' ( '>' | '=' )?
            {
            match('<'); 
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:218:20: ( '>' | '=' )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='>') ) {
                alt28=1;
            }
            else if ( (LA28_0=='=') ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:218:21: '>'
                    {
                    match('>'); 
                     _type = NOT_EQUALS_OP;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:218:53: '='
                    {
                    match('='); 
                     _type = LESS_THAN_OR_EQUALS_OP;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_THAN_OP"

    // $ANTLR start "EQUALS_OP"
    public final void mEQUALS_OP() throws RecognitionException {
        try {
            int _type = EQUALS_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:219:11: ( '=' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:219:13: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS_OP"

    // $ANTLR start "GREATER_THAN_OP"
    public final void mGREATER_THAN_OP() throws RecognitionException {
        try {
            int _type = GREATER_THAN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:220:17: ( '>' ( '=' )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:220:19: '>' ( '=' )?
            {
            match('>'); 
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:220:23: ( '=' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='=') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:220:24: '='
                    {
                    match('='); 
                     _type = GREATER_THAN_OR_EQUALS_OP;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_THAN_OP"

    // $ANTLR start "QUESTION_MARK"
    public final void mQUESTION_MARK() throws RecognitionException {
        try {
            int _type = QUESTION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:221:15: ( '?' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:221:17: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION_MARK"

    // $ANTLR start "VERTICAL_BAR"
    public final void mVERTICAL_BAR() throws RecognitionException {
        try {
            int _type = VERTICAL_BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:222:14: ( '|' ( '|' )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:222:16: '|' ( '|' )?
            {
            match('|'); 
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:222:20: ( '|' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='|') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:222:21: '|'
                    {
                    match('|'); 
                     _type = CONCATENATION_OP;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VERTICAL_BAR"

    // $ANTLR start "LEFT_BRACKET"
    public final void mLEFT_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:223:14: ( '[' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:223:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_BRACKET"

    // $ANTLR start "RIGHT_BRACKET"
    public final void mRIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:224:15: ( ']' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:224:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_BRACKET"

    // $ANTLR start "INTRODUCER"
    public final void mINTRODUCER() throws RecognitionException {
        try {
            int _type = INTRODUCER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:225:12: ( '_' ( SEPARATOR )? )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:225:14: '_' ( SEPARATOR )?
            {
            match('_'); 
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:225:18: ( SEPARATOR )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>='\t' && LA31_0<='\n')||LA31_0=='\r'||LA31_0==' '||LA31_0=='-'||LA31_0=='/') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:225:19: SEPARATOR
                    {
                    mSEPARATOR(); 
                     _type = UNDERSCORE;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTRODUCER"

    // $ANTLR start "SIMPLE_LETTER"
    public final void mSIMPLE_LETTER() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:227:15: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '{' | '}' | ':' | '\"' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='$'||input.LA(1)==':'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='{')||input.LA(1)=='}' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SIMPLE_LETTER"

    // $ANTLR start "SIMPLE_LETTER_2"
    public final void mSIMPLE_LETTER_2() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:232:17: ( 'a' .. 'z' | 'A' .. 'Z' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SIMPLE_LETTER_2"

    // $ANTLR start "SEPARATOR"
    public final void mSEPARATOR() throws RecognitionException {
        try {
            int _type = SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:235:11: ( '-' | COMMENT | ( SPACE | NEWLINE )+ )
            int alt33=3;
            switch ( input.LA(1) ) {
            case '-':
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1=='-') ) {
                    alt33=2;
                }
                else {
                    alt33=1;}
                }
                break;
            case '/':
                {
                alt33=2;
                }
                break;
            case '\t':
            case '\n':
            case '\r':
            case ' ':
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:236:7: '-'
                    {
                    match('-'); 
                     _type = MINUS_SIGN;

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:237:7: COMMENT
                    {
                    mCOMMENT(); 
                      _type = ANTLR_USE_NAMESPACE;_channel=HIDDEN; 

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:238:7: ( SPACE | NEWLINE )+
                    {
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:238:7: ( SPACE | NEWLINE )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=3;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0=='\t'||LA32_0==' ') ) {
                            alt32=1;
                        }
                        else if ( (LA32_0=='\n'||LA32_0=='\r') ) {
                            alt32=2;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:238:8: SPACE
                    	    {
                    	    mSPACE(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:238:16: NEWLINE
                    	    {
                    	    mNEWLINE(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                      _type = ANTLR_USE_NAMESPACE;_channel=HIDDEN; 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEPARATOR"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:241:9: ( '-' '-' (~ ( '\\r' | '\\n' ) )* NEWLINE | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='-') ) {
                alt36=1;
            }
            else if ( (LA36_0=='/') ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:242:5: '-' '-' (~ ( '\\r' | '\\n' ) )* NEWLINE
                    {
                    match('-'); 
                    match('-'); 
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:242:13: (~ ( '\\r' | '\\n' ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>='\u0000' && LA34_0<='\t')||(LA34_0>='\u000B' && LA34_0<='\f')||(LA34_0>='\u000E' && LA34_0<='\uFFFF')) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:242:15: ~ ( '\\r' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    mNEWLINE(); 

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:243:6: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:243:11: ( options {greedy=false; } : . )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0=='*') ) {
                            int LA35_1 = input.LA(2);

                            if ( (LA35_1=='/') ) {
                                alt35=2;
                            }
                            else if ( ((LA35_1>='\u0000' && LA35_1<='.')||(LA35_1>='0' && LA35_1<='\uFFFF')) ) {
                                alt35=1;
                            }


                        }
                        else if ( ((LA35_0>='\u0000' && LA35_0<=')')||(LA35_0>='+' && LA35_0<='\uFFFF')) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:243:39: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    match("*/"); 


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:249:9: ( ( '\\r' ( options {greedy=true; } : '\\n' )? | '\\n' ) )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:250:5: ( '\\r' ( options {greedy=true; } : '\\n' )? | '\\n' )
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:250:5: ( '\\r' ( options {greedy=true; } : '\\n' )? | '\\n' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='\r') ) {
                alt38=1;
            }
            else if ( (LA38_0=='\n') ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:250:7: '\\r' ( options {greedy=true; } : '\\n' )?
                    {
                    match('\r'); 
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:250:12: ( options {greedy=true; } : '\\n' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0=='\n') ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:250:36: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:250:45: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:253:7: ( ' ' | '\\t' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "ANY_CHAR"
    public final void mANY_CHAR() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:257:10: ( . )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:258:5: .
            {
            matchAny(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "ANY_CHAR"

    // $ANTLR start "ANY_CHARS"
    public final void mANY_CHARS() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:261:11: ( ( ANY_CHAR )+ )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:262:5: ( ANY_CHAR )+
            {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:262:5: ( ANY_CHAR )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>='\u0000' && LA39_0<='\uFFFF')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:262:5: ANY_CHAR
            	    {
            	    mANY_CHAR(); 

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "ANY_CHARS"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:265:5: ( 'A' | 'a' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:268:5: ( 'B' | 'b' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:271:5: ( 'C' | 'c' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:274:5: ( 'D' | 'd' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:277:5: ( 'E' | 'e' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:280:5: ( 'F' | 'f' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:283:5: ( 'G' | 'g' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:286:5: ( 'H' | 'h' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:289:5: ( 'I' | 'i' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:292:5: ( 'J' | 'j' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:295:5: ( 'K' | 'k' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:298:5: ( 'L' | 'l' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:301:5: ( 'M' | 'm' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:304:5: ( 'N' | 'n' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:307:5: ( 'O' | 'o' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:310:5: ( 'P' | 'p' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:313:5: ( 'Q' | 'q' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:316:5: ( 'R' | 'r' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:319:5: ( 'S' | 's' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:322:5: ( 'T' | 't' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:325:5: ( 'U' | 'u' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:328:5: ( 'V' | 'v' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:331:5: ( 'W' | 'w' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:334:5: ( 'X' | 'x' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:337:5: ( 'Y' | 'y' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:340:5: ( 'Z' | 'z' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:342:5: ( '_' )
            // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:342:9: '_'
            {
            match('_'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    public void mTokens() throws RecognitionException {
        // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:8: ( ADA | ALL | AND | ANY | AS | ASC | AT | AVG | BETWEEN | BIT | BIT_LENGTH | BOTH | BY | CASE | CAST | CHAR | CHAR_LENGTH | CHARACTER | CHARACTER_LENGTH | COALESCE | COLLATE | CONVERT | CORRESPONDING | COUNT | CROSS | CURRENT | CURRENT_DATE | CURRENT_TIME | CURRENT_TIMESTAMP | CURRENT_USER | DATE | DAY | DEC | DECIMAL | DEFAULT | DELETE | DESC | DISTINCT | DOUBLE | ELSE | END | ESCAPE | EXCEPT | EXISTS | EXTRACT | FALSE | FLOAT | FORMAT | FOR | FROM | FULL | GLOBAL | GROUP | HAVING | HOUR | IN | INDICATOR | INNER | INSERT | INT | INTEGER | INTERSECT | INTERVAL | INTO | IS | JOIN | LEADING | LEFT | LIKE | LOCAL | LOWER | MATCH | MAX | MIN | MINUTE | MINUS | MOD | MODULE | MONTH | NATIONAL | NATURAL | NCHAR | NOT | NULL | NULLIF | NUMERIC | OCTET_LENGTH | OF | ON | ONLY | OR | ORDER | OUTER | OVER | OVERLAPS | PARTIAL | POSITION | PRECISION | PARTITION | QUALIFY | READ | REAL | RIGHT | SECOND | SELECT | SESSION_USER | SET | SMALLINT | SOME | SUBSTRING | SUM | SYSTEM_USER | TABLE | THEN | TIME | TIMESTAMP | TIMEZONE_HOUR | TIMEZONE_MINUTE | TO | TRAILING | TRANSLATE | TRIM | TRUE | UNION | UNIQUE | UNKNOWN | UPDATE | UPPER | USER | USING | VALUE | VALUES | VARCHAR | VARYING | WHEN | WHERE | WITH | YEAR | ZONE | REGULAR_ID | EXACT_NUM_LIT | CHAR_STRING | DELIMITED_ID | PERCENT | AMPERSAND | LEFT_PAREN | RIGHT_PAREN | ASTERISK | PLUS_SIGN | COMMA | SOLIDUS | COLON | SEMICOLON | LESS_THAN_OP | EQUALS_OP | GREATER_THAN_OP | QUESTION_MARK | VERTICAL_BAR | LEFT_BRACKET | RIGHT_BRACKET | INTRODUCER | SEPARATOR )
        int alt40=162;
        alt40 = dfa40.predict(input);
        switch (alt40) {
            case 1 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:10: ADA
                {
                mADA(); 

                }
                break;
            case 2 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:14: ALL
                {
                mALL(); 

                }
                break;
            case 3 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:18: AND
                {
                mAND(); 

                }
                break;
            case 4 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:22: ANY
                {
                mANY(); 

                }
                break;
            case 5 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:26: AS
                {
                mAS(); 

                }
                break;
            case 6 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:29: ASC
                {
                mASC(); 

                }
                break;
            case 7 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:33: AT
                {
                mAT(); 

                }
                break;
            case 8 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:36: AVG
                {
                mAVG(); 

                }
                break;
            case 9 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:40: BETWEEN
                {
                mBETWEEN(); 

                }
                break;
            case 10 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:48: BIT
                {
                mBIT(); 

                }
                break;
            case 11 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:52: BIT_LENGTH
                {
                mBIT_LENGTH(); 

                }
                break;
            case 12 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:63: BOTH
                {
                mBOTH(); 

                }
                break;
            case 13 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:68: BY
                {
                mBY(); 

                }
                break;
            case 14 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:71: CASE
                {
                mCASE(); 

                }
                break;
            case 15 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:76: CAST
                {
                mCAST(); 

                }
                break;
            case 16 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:81: CHAR
                {
                mCHAR(); 

                }
                break;
            case 17 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:86: CHAR_LENGTH
                {
                mCHAR_LENGTH(); 

                }
                break;
            case 18 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:98: CHARACTER
                {
                mCHARACTER(); 

                }
                break;
            case 19 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:108: CHARACTER_LENGTH
                {
                mCHARACTER_LENGTH(); 

                }
                break;
            case 20 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:125: COALESCE
                {
                mCOALESCE(); 

                }
                break;
            case 21 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:134: COLLATE
                {
                mCOLLATE(); 

                }
                break;
            case 22 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:142: CONVERT
                {
                mCONVERT(); 

                }
                break;
            case 23 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:150: CORRESPONDING
                {
                mCORRESPONDING(); 

                }
                break;
            case 24 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:164: COUNT
                {
                mCOUNT(); 

                }
                break;
            case 25 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:170: CROSS
                {
                mCROSS(); 

                }
                break;
            case 26 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:176: CURRENT
                {
                mCURRENT(); 

                }
                break;
            case 27 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:184: CURRENT_DATE
                {
                mCURRENT_DATE(); 

                }
                break;
            case 28 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:197: CURRENT_TIME
                {
                mCURRENT_TIME(); 

                }
                break;
            case 29 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:210: CURRENT_TIMESTAMP
                {
                mCURRENT_TIMESTAMP(); 

                }
                break;
            case 30 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:228: CURRENT_USER
                {
                mCURRENT_USER(); 

                }
                break;
            case 31 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:241: DATE
                {
                mDATE(); 

                }
                break;
            case 32 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:246: DAY
                {
                mDAY(); 

                }
                break;
            case 33 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:250: DEC
                {
                mDEC(); 

                }
                break;
            case 34 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:254: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 35 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:262: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 36 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:270: DELETE
                {
                mDELETE(); 

                }
                break;
            case 37 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:277: DESC
                {
                mDESC(); 

                }
                break;
            case 38 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:282: DISTINCT
                {
                mDISTINCT(); 

                }
                break;
            case 39 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:291: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 40 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:298: ELSE
                {
                mELSE(); 

                }
                break;
            case 41 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:303: END
                {
                mEND(); 

                }
                break;
            case 42 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:307: ESCAPE
                {
                mESCAPE(); 

                }
                break;
            case 43 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:314: EXCEPT
                {
                mEXCEPT(); 

                }
                break;
            case 44 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:321: EXISTS
                {
                mEXISTS(); 

                }
                break;
            case 45 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:328: EXTRACT
                {
                mEXTRACT(); 

                }
                break;
            case 46 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:336: FALSE
                {
                mFALSE(); 

                }
                break;
            case 47 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:342: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 48 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:348: FORMAT
                {
                mFORMAT(); 

                }
                break;
            case 49 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:355: FOR
                {
                mFOR(); 

                }
                break;
            case 50 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:359: FROM
                {
                mFROM(); 

                }
                break;
            case 51 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:364: FULL
                {
                mFULL(); 

                }
                break;
            case 52 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:369: GLOBAL
                {
                mGLOBAL(); 

                }
                break;
            case 53 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:376: GROUP
                {
                mGROUP(); 

                }
                break;
            case 54 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:382: HAVING
                {
                mHAVING(); 

                }
                break;
            case 55 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:389: HOUR
                {
                mHOUR(); 

                }
                break;
            case 56 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:394: IN
                {
                mIN(); 

                }
                break;
            case 57 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:397: INDICATOR
                {
                mINDICATOR(); 

                }
                break;
            case 58 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:407: INNER
                {
                mINNER(); 

                }
                break;
            case 59 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:413: INSERT
                {
                mINSERT(); 

                }
                break;
            case 60 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:420: INT
                {
                mINT(); 

                }
                break;
            case 61 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:424: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 62 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:432: INTERSECT
                {
                mINTERSECT(); 

                }
                break;
            case 63 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:442: INTERVAL
                {
                mINTERVAL(); 

                }
                break;
            case 64 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:451: INTO
                {
                mINTO(); 

                }
                break;
            case 65 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:456: IS
                {
                mIS(); 

                }
                break;
            case 66 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:459: JOIN
                {
                mJOIN(); 

                }
                break;
            case 67 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:464: LEADING
                {
                mLEADING(); 

                }
                break;
            case 68 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:472: LEFT
                {
                mLEFT(); 

                }
                break;
            case 69 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:477: LIKE
                {
                mLIKE(); 

                }
                break;
            case 70 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:482: LOCAL
                {
                mLOCAL(); 

                }
                break;
            case 71 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:488: LOWER
                {
                mLOWER(); 

                }
                break;
            case 72 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:494: MATCH
                {
                mMATCH(); 

                }
                break;
            case 73 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:500: MAX
                {
                mMAX(); 

                }
                break;
            case 74 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:504: MIN
                {
                mMIN(); 

                }
                break;
            case 75 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:508: MINUTE
                {
                mMINUTE(); 

                }
                break;
            case 76 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:515: MINUS
                {
                mMINUS(); 

                }
                break;
            case 77 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:521: MOD
                {
                mMOD(); 

                }
                break;
            case 78 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:525: MODULE
                {
                mMODULE(); 

                }
                break;
            case 79 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:532: MONTH
                {
                mMONTH(); 

                }
                break;
            case 80 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:538: NATIONAL
                {
                mNATIONAL(); 

                }
                break;
            case 81 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:547: NATURAL
                {
                mNATURAL(); 

                }
                break;
            case 82 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:555: NCHAR
                {
                mNCHAR(); 

                }
                break;
            case 83 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:561: NOT
                {
                mNOT(); 

                }
                break;
            case 84 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:565: NULL
                {
                mNULL(); 

                }
                break;
            case 85 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:570: NULLIF
                {
                mNULLIF(); 

                }
                break;
            case 86 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:577: NUMERIC
                {
                mNUMERIC(); 

                }
                break;
            case 87 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:585: OCTET_LENGTH
                {
                mOCTET_LENGTH(); 

                }
                break;
            case 88 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:598: OF
                {
                mOF(); 

                }
                break;
            case 89 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:601: ON
                {
                mON(); 

                }
                break;
            case 90 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:604: ONLY
                {
                mONLY(); 

                }
                break;
            case 91 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:609: OR
                {
                mOR(); 

                }
                break;
            case 92 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:612: ORDER
                {
                mORDER(); 

                }
                break;
            case 93 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:618: OUTER
                {
                mOUTER(); 

                }
                break;
            case 94 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:624: OVER
                {
                mOVER(); 

                }
                break;
            case 95 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:629: OVERLAPS
                {
                mOVERLAPS(); 

                }
                break;
            case 96 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:638: PARTIAL
                {
                mPARTIAL(); 

                }
                break;
            case 97 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:646: POSITION
                {
                mPOSITION(); 

                }
                break;
            case 98 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:655: PRECISION
                {
                mPRECISION(); 

                }
                break;
            case 99 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:665: PARTITION
                {
                mPARTITION(); 

                }
                break;
            case 100 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:675: QUALIFY
                {
                mQUALIFY(); 

                }
                break;
            case 101 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:683: READ
                {
                mREAD(); 

                }
                break;
            case 102 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:688: REAL
                {
                mREAL(); 

                }
                break;
            case 103 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:693: RIGHT
                {
                mRIGHT(); 

                }
                break;
            case 104 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:699: SECOND
                {
                mSECOND(); 

                }
                break;
            case 105 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:706: SELECT
                {
                mSELECT(); 

                }
                break;
            case 106 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:713: SESSION_USER
                {
                mSESSION_USER(); 

                }
                break;
            case 107 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:726: SET
                {
                mSET(); 

                }
                break;
            case 108 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:730: SMALLINT
                {
                mSMALLINT(); 

                }
                break;
            case 109 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:739: SOME
                {
                mSOME(); 

                }
                break;
            case 110 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:744: SUBSTRING
                {
                mSUBSTRING(); 

                }
                break;
            case 111 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:754: SUM
                {
                mSUM(); 

                }
                break;
            case 112 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:758: SYSTEM_USER
                {
                mSYSTEM_USER(); 

                }
                break;
            case 113 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:770: TABLE
                {
                mTABLE(); 

                }
                break;
            case 114 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:776: THEN
                {
                mTHEN(); 

                }
                break;
            case 115 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:781: TIME
                {
                mTIME(); 

                }
                break;
            case 116 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:786: TIMESTAMP
                {
                mTIMESTAMP(); 

                }
                break;
            case 117 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:796: TIMEZONE_HOUR
                {
                mTIMEZONE_HOUR(); 

                }
                break;
            case 118 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:810: TIMEZONE_MINUTE
                {
                mTIMEZONE_MINUTE(); 

                }
                break;
            case 119 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:826: TO
                {
                mTO(); 

                }
                break;
            case 120 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:829: TRAILING
                {
                mTRAILING(); 

                }
                break;
            case 121 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:838: TRANSLATE
                {
                mTRANSLATE(); 

                }
                break;
            case 122 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:848: TRIM
                {
                mTRIM(); 

                }
                break;
            case 123 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:853: TRUE
                {
                mTRUE(); 

                }
                break;
            case 124 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:858: UNION
                {
                mUNION(); 

                }
                break;
            case 125 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:864: UNIQUE
                {
                mUNIQUE(); 

                }
                break;
            case 126 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:871: UNKNOWN
                {
                mUNKNOWN(); 

                }
                break;
            case 127 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:879: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 128 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:886: UPPER
                {
                mUPPER(); 

                }
                break;
            case 129 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:892: USER
                {
                mUSER(); 

                }
                break;
            case 130 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:897: USING
                {
                mUSING(); 

                }
                break;
            case 131 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:903: VALUE
                {
                mVALUE(); 

                }
                break;
            case 132 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:909: VALUES
                {
                mVALUES(); 

                }
                break;
            case 133 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:916: VARCHAR
                {
                mVARCHAR(); 

                }
                break;
            case 134 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:924: VARYING
                {
                mVARYING(); 

                }
                break;
            case 135 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:932: WHEN
                {
                mWHEN(); 

                }
                break;
            case 136 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:937: WHERE
                {
                mWHERE(); 

                }
                break;
            case 137 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:943: WITH
                {
                mWITH(); 

                }
                break;
            case 138 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:948: YEAR
                {
                mYEAR(); 

                }
                break;
            case 139 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:953: ZONE
                {
                mZONE(); 

                }
                break;
            case 140 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:958: REGULAR_ID
                {
                mREGULAR_ID(); 

                }
                break;
            case 141 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:969: EXACT_NUM_LIT
                {
                mEXACT_NUM_LIT(); 

                }
                break;
            case 142 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:983: CHAR_STRING
                {
                mCHAR_STRING(); 

                }
                break;
            case 143 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:995: DELIMITED_ID
                {
                mDELIMITED_ID(); 

                }
                break;
            case 144 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1008: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 145 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1016: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 146 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1026: LEFT_PAREN
                {
                mLEFT_PAREN(); 

                }
                break;
            case 147 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1037: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 

                }
                break;
            case 148 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1049: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 149 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1058: PLUS_SIGN
                {
                mPLUS_SIGN(); 

                }
                break;
            case 150 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1068: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 151 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1074: SOLIDUS
                {
                mSOLIDUS(); 

                }
                break;
            case 152 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1082: COLON
                {
                mCOLON(); 

                }
                break;
            case 153 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1088: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 154 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1098: LESS_THAN_OP
                {
                mLESS_THAN_OP(); 

                }
                break;
            case 155 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1111: EQUALS_OP
                {
                mEQUALS_OP(); 

                }
                break;
            case 156 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1121: GREATER_THAN_OP
                {
                mGREATER_THAN_OP(); 

                }
                break;
            case 157 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1137: QUESTION_MARK
                {
                mQUESTION_MARK(); 

                }
                break;
            case 158 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1151: VERTICAL_BAR
                {
                mVERTICAL_BAR(); 

                }
                break;
            case 159 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1164: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 

                }
                break;
            case 160 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1177: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 

                }
                break;
            case 161 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1191: INTRODUCER
                {
                mINTRODUCER(); 

                }
                break;
            case 162 :
                // E:\\JAVA\\workspace\\Antlr_sql92\\DmlSQL2Lexer.g:1:1202: SEPARATOR
                {
                mSEPARATOR(); 

                }
                break;

        }

    }


    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA40_eotS =
        "\1\uffff\30\31\1\uffff\1\31\2\uffff\1\31\7\uffff\1\u0080\12\uffff"+
        "\3\31\1\u0085\1\u0087\4\31\1\u008c\26\31\1\u00ad\1\u00b2\14\31\1"+
        "\u00c4\1\u00c5\1\u00c7\20\31\1\u00dd\13\31\1\uffff\1\31\2\uffff"+
        "\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\uffff\1\u00f3\1\uffff\1\u00f4"+
        "\1\31\1\u00f6\1\31\1\uffff\12\31\1\u0104\1\u0105\6\31\1\u010d\6"+
        "\31\1\u0114\6\31\1\uffff\3\31\1\u011f\1\uffff\7\31\1\u0129\1\u012a"+
        "\1\u012c\3\31\1\u0132\3\31\2\uffff\1\31\1\uffff\14\31\1\u0144\3"+
        "\31\1\u0148\4\31\1\uffff\21\31\6\uffff\1\31\1\uffff\1\31\1\u0162"+
        "\1\u0163\1\u0164\1\u0165\7\31\1\u016f\2\uffff\3\31\1\u0173\2\31"+
        "\1\u0176\1\uffff\6\31\1\uffff\1\31\1\u017e\1\u017f\3\31\1\u0183"+
        "\3\31\1\uffff\1\31\1\u0189\1\u018a\1\31\1\u018c\1\u018d\3\31\2\uffff"+
        "\1\31\1\uffff\5\31\1\uffff\1\u0198\2\31\1\u019c\2\31\1\u019f\4\31"+
        "\1\u01a5\1\u01a6\4\31\1\uffff\1\31\1\u01ac\1\31\1\uffff\2\31\1\u01b0"+
        "\1\u01b1\2\31\1\u01b6\1\u01b7\5\31\1\u01bd\4\31\1\u01c2\1\31\1\u01c4"+
        "\1\u01c5\1\u01c6\2\31\4\uffff\6\31\1\u01cf\1\u01d0\1\31\1\uffff"+
        "\3\31\1\uffff\2\31\1\uffff\4\31\1\u01db\1\u01dc\1\31\2\uffff\1\31"+
        "\1\u01df\1\31\1\uffff\1\31\1\u01e2\3\31\2\uffff\1\31\2\uffff\1\u01e8"+
        "\1\u01e9\1\u01ea\1\31\1\u01ec\1\31\1\u01ee\2\31\1\u01f1\1\uffff"+
        "\3\31\1\uffff\1\u01f5\1\u01f6\1\uffff\5\31\2\uffff\1\u01fd\4\31"+
        "\1\uffff\2\31\1\u0204\2\uffff\4\31\2\uffff\1\u0209\3\31\1\u020d"+
        "\1\uffff\1\u020e\1\u020f\2\31\1\uffff\1\u0213\3\uffff\10\31\2\uffff"+
        "\3\31\1\u021f\1\31\1\u0221\1\u0222\1\u0223\1\u0224\1\31\2\uffff"+
        "\1\u0226\1\u0227\1\uffff\1\u0228\1\31\1\uffff\1\u022a\4\31\3\uffff"+
        "\1\u022f\1\uffff\1\u0230\1\uffff\2\31\1\uffff\1\u0233\2\31\2\uffff"+
        "\6\31\1\uffff\1\u023c\1\u023d\4\31\1\uffff\4\31\1\uffff\1\u0246"+
        "\1\31\1\u0248\3\uffff\1\u0249\2\31\1\uffff\1\u024c\4\31\1\u0251"+
        "\1\u0252\1\31\1\u0254\1\u0256\1\u0257\1\uffff\1\31\4\uffff\1\u0259"+
        "\3\uffff\1\31\1\uffff\1\u025b\2\31\1\u025e\2\uffff\1\31\1\u0260"+
        "\1\uffff\1\u0261\2\31\1\u0264\3\31\1\u0268\2\uffff\10\31\1\uffff"+
        "\1\u0271\2\uffff\1\u0272\1\u0273\1\uffff\3\31\1\u0277\2\uffff\1"+
        "\31\1\uffff\1\31\2\uffff\1\u027c\1\uffff\1\31\1\uffff\1\31\1\u027f"+
        "\1\uffff\1\u0280\2\uffff\1\31\1\u0282\1\uffff\1\31\1\u0284\1\31"+
        "\1\uffff\1\31\1\u0287\4\31\1\u028c\1\31\3\uffff\2\31\1\u0290\1\uffff"+
        "\4\31\1\uffff\1\u0296\1\u0297\2\uffff\1\31\1\uffff\1\u0299\1\uffff"+
        "\1\u029a\1\31\1\uffff\1\u029c\1\31\1\u029e\1\31\1\uffff\1\u02a1"+
        "\1\u02a2\1\31\1\uffff\5\31\2\uffff\1\31\2\uffff\1\31\1\uffff\1\31"+
        "\1\uffff\2\31\2\uffff\1\u02ae\7\31\1\u02b6\2\31\1\uffff\2\31\1\u02bb"+
        "\1\u02bc\1\u02be\1\u02bf\1\u02c0\1\uffff\3\31\1\u02c4\2\uffff\1"+
        "\31\3\uffff\1\u02c6\2\31\1\uffff\1\31\1\uffff\3\31\1\u02cd\1\u02ce"+
        "\1\31\2\uffff\1\u02d0\1\uffff";
    static final String DFA40_eofS =
        "\u02d1\uffff";
    static final String DFA40_minS =
        "\1\11\1\104\1\105\2\101\1\114\1\101\1\114\1\101\1\116\1\117\1\105"+
        "\2\101\1\103\1\101\1\125\2\105\1\101\1\116\1\101\1\110\1\105\1\117"+
        "\1\uffff\1\0\2\uffff\1\43\7\uffff\1\52\12\uffff\1\101\1\114\1\104"+
        "\2\42\1\107\3\124\1\42\1\123\2\101\1\117\1\122\1\124\1\103\1\123"+
        "\1\125\1\123\1\104\2\103\1\114\1\117\1\122\1\117\1\114\2\117\1\126"+
        "\1\125\2\42\1\111\1\101\1\113\1\103\1\124\1\116\1\104\1\124\1\110"+
        "\1\124\1\114\1\124\3\42\1\124\1\105\1\122\1\123\1\105\2\101\1\107"+
        "\1\103\1\101\1\115\1\102\1\123\1\102\1\105\1\115\1\42\1\101\1\111"+
        "\1\104\1\105\1\114\1\105\1\124\1\101\1\116\1\0\1\42\1\uffff\1\43"+
        "\2\uffff\4\42\1\uffff\1\42\1\uffff\1\42\1\127\1\42\1\110\1\uffff"+
        "\1\105\1\122\2\114\1\126\1\122\1\116\1\123\1\122\1\105\2\42\1\101"+
        "\1\105\1\103\1\124\1\102\1\105\1\42\1\101\1\105\1\123\1\122\1\123"+
        "\1\101\1\42\1\115\1\114\1\102\1\125\1\111\1\122\1\uffff\1\111\2"+
        "\105\1\42\1\uffff\1\116\1\104\1\124\1\105\1\101\1\105\1\103\3\42"+
        "\1\124\1\111\1\101\1\42\1\114\2\105\2\uffff\1\131\1\uffff\2\105"+
        "\1\122\1\124\1\111\1\103\1\114\1\104\1\110\1\117\1\105\1\123\1\42"+
        "\1\114\1\105\1\123\1\42\1\124\1\114\1\116\1\105\1\uffff\1\111\1"+
        "\115\1\105\1\117\1\116\1\101\1\105\1\122\1\116\1\125\1\103\1\116"+
        "\1\110\1\122\1\105\1\42\1\0\6\uffff\1\105\1\uffff\1\114\4\42\1\105"+
        "\1\101\2\105\1\124\1\123\1\105\1\42\2\uffff\1\115\1\125\1\124\1"+
        "\42\1\111\1\114\1\42\1\uffff\2\120\1\124\1\101\1\105\1\124\1\uffff"+
        "\1\101\2\42\1\101\1\120\1\116\1\42\1\103\2\122\1\uffff\1\107\2\42"+
        "\1\111\2\42\1\114\1\122\1\110\2\uffff\1\123\1\uffff\1\114\1\110"+
        "\1\117\2\122\1\uffff\1\42\1\122\1\124\1\42\2\122\1\42\1\111\1\124"+
        "\2\111\2\42\1\124\1\116\1\103\1\111\1\uffff\1\114\1\42\1\124\1\uffff"+
        "\2\105\2\42\1\114\1\123\2\42\1\116\1\125\1\117\1\124\1\122\1\42"+
        "\1\107\1\105\1\110\1\111\1\42\1\105\3\42\2\105\4\uffff\1\114\1\103"+
        "\1\123\1\124\1\122\1\123\2\42\1\116\1\uffff\1\101\1\114\1\105\1"+
        "\uffff\1\116\1\105\1\uffff\1\105\1\124\1\123\1\103\2\42\1\124\2"+
        "\uffff\1\114\1\42\1\107\1\uffff\1\101\1\42\1\124\1\105\1\123\2\uffff"+
        "\1\116\2\uffff\3\42\1\105\1\42\1\105\1\42\1\116\1\101\1\42\1\uffff"+
        "\1\106\1\111\1\137\1\uffff\2\42\1\uffff\2\101\1\111\1\123\1\106"+
        "\2\uffff\1\42\1\104\1\124\1\117\1\111\1\uffff\1\122\1\115\1\42\2"+
        "\uffff\1\124\1\117\1\111\1\114\2\uffff\1\42\1\105\1\127\1\105\1"+
        "\42\1\uffff\2\42\1\101\1\116\1\uffff\1\42\3\uffff\2\116\1\105\1"+
        "\124\1\103\1\105\1\124\1\120\2\uffff\1\124\1\114\1\124\1\42\1\103"+
        "\4\42\1\124\2\uffff\2\42\1\uffff\1\42\1\124\1\uffff\1\42\1\122\1"+
        "\105\1\101\1\107\3\uffff\1\42\1\uffff\1\42\1\uffff\1\101\1\114\1"+
        "\uffff\1\42\1\103\1\114\2\uffff\1\120\1\114\1\111\1\117\1\111\1"+
        "\131\1\uffff\2\42\2\116\1\111\1\137\1\uffff\1\101\2\116\1\101\1"+
        "\uffff\1\42\1\116\1\42\3\uffff\1\42\1\122\1\107\1\uffff\1\42\1\107"+
        "\1\116\2\105\2\42\1\117\3\42\1\uffff\1\124\4\uffff\1\42\3\uffff"+
        "\1\117\1\uffff\1\42\1\103\1\114\1\42\2\uffff\1\114\1\42\1\uffff"+
        "\1\42\1\105\1\123\1\42\1\117\1\116\1\117\1\42\2\uffff\1\137\1\124"+
        "\1\116\1\125\1\115\1\105\1\107\1\124\1\uffff\1\42\2\uffff\2\42\1"+
        "\uffff\1\124\1\107\1\122\1\42\2\uffff\1\116\1\uffff\1\104\2\uffff"+
        "\1\42\1\uffff\1\122\1\uffff\1\124\1\42\1\uffff\1\42\2\uffff\1\116"+
        "\1\42\1\uffff\1\116\1\42\1\116\1\uffff\1\125\1\42\1\107\1\123\1"+
        "\120\1\137\1\42\1\105\3\uffff\1\110\1\124\1\42\1\uffff\1\104\1\101"+
        "\1\111\1\123\1\uffff\2\42\2\uffff\1\107\1\uffff\1\42\1\uffff\1\42"+
        "\1\123\1\uffff\1\42\1\105\1\42\1\110\1\uffff\2\42\1\110\1\uffff"+
        "\1\114\1\111\1\124\1\115\1\105\2\uffff\1\124\2\uffff\1\105\1\uffff"+
        "\1\122\1\uffff\1\117\1\111\2\uffff\1\42\1\105\1\116\2\105\1\122"+
        "\1\110\1\122\1\42\1\125\1\116\1\uffff\1\116\1\107\5\42\1\uffff\1"+
        "\122\1\125\1\107\1\42\2\uffff\1\124\3\uffff\1\42\2\124\1\uffff\1"+
        "\101\1\uffff\1\105\1\110\1\115\2\42\1\120\2\uffff\1\42\1\uffff";
    static final String DFA40_maxS =
        "\1\175\1\166\1\171\1\165\1\157\1\170\1\165\1\162\1\157\1\163\3"+
        "\157\1\165\1\166\1\162\1\165\1\151\1\171\1\162\1\163\1\141\1\151"+
        "\1\145\1\157\1\uffff\1\uffff\2\uffff\1\172\7\uffff\1\52\12\uffff"+
        "\1\141\1\154\1\171\2\175\1\147\3\164\1\175\1\163\1\141\1\165\1\157"+
        "\1\162\1\171\2\163\1\165\1\163\1\144\1\143\1\164\1\154\1\157\1\162"+
        "\1\157\1\154\2\157\1\166\1\165\2\175\1\151\1\146\1\153\1\167\1\170"+
        "\2\156\1\164\1\150\1\164\1\155\1\164\3\175\1\164\1\145\1\162\1\163"+
        "\1\145\2\141\1\147\1\164\1\141\2\155\1\163\1\142\1\145\1\155\1\175"+
        "\1\165\1\153\1\160\1\151\1\162\1\145\1\164\1\141\1\156\1\uffff\1"+
        "\42\1\uffff\1\172\2\uffff\4\175\1\uffff\1\175\1\uffff\1\175\1\167"+
        "\1\175\1\150\1\uffff\1\164\1\162\2\154\1\166\1\162\1\156\1\163\1"+
        "\162\1\145\2\175\1\141\1\145\1\143\1\164\1\142\1\145\1\175\1\141"+
        "\1\145\1\163\1\162\1\163\1\141\1\175\1\155\1\154\1\142\1\165\1\151"+
        "\1\162\1\uffff\1\151\2\145\1\175\1\uffff\1\156\1\144\1\164\1\145"+
        "\1\141\1\145\1\143\3\175\1\164\1\165\1\141\1\175\1\154\2\145\2\uffff"+
        "\1\171\1\uffff\2\145\1\162\1\164\1\151\1\143\2\154\1\150\1\157\1"+
        "\145\1\163\1\175\1\154\1\145\1\163\1\175\1\164\1\154\1\156\1\145"+
        "\1\uffff\1\156\1\155\1\145\1\161\1\156\1\141\1\145\1\162\1\156\1"+
        "\165\1\171\1\162\1\150\1\162\1\145\1\42\1\uffff\6\uffff\1\145\1"+
        "\uffff\1\154\4\175\1\145\1\141\2\145\1\164\1\163\1\145\1\175\2\uffff"+
        "\1\155\1\165\1\164\1\175\1\151\1\154\1\175\1\uffff\2\160\1\164\1"+
        "\141\1\145\1\164\1\uffff\1\141\2\175\1\141\1\160\1\156\1\175\1\143"+
        "\2\162\1\uffff\1\162\2\175\1\151\2\175\1\154\1\162\1\150\2\uffff"+
        "\1\164\1\uffff\1\154\1\150\1\157\2\162\1\uffff\1\175\1\162\1\164"+
        "\1\175\2\162\1\175\1\151\1\164\2\151\2\175\1\164\1\156\1\143\1\151"+
        "\1\uffff\1\154\1\175\1\164\1\uffff\2\145\2\175\1\154\1\163\2\175"+
        "\1\156\1\165\1\157\1\164\1\162\1\175\1\147\1\145\1\150\1\151\1\175"+
        "\1\145\3\175\2\145\4\uffff\1\154\1\143\1\163\1\164\1\162\1\163\2"+
        "\175\1\156\1\uffff\1\141\1\154\1\145\1\uffff\1\156\1\145\1\uffff"+
        "\1\145\1\164\1\163\1\143\2\175\1\164\2\uffff\1\154\1\175\1\147\1"+
        "\uffff\1\141\1\175\1\164\1\145\1\166\2\uffff\1\156\2\uffff\3\175"+
        "\1\145\1\175\1\145\1\175\1\156\1\141\1\175\1\uffff\1\146\1\151\1"+
        "\137\1\uffff\2\175\1\uffff\1\141\1\164\1\151\1\163\1\146\2\uffff"+
        "\1\175\1\144\1\164\1\157\1\151\1\uffff\1\162\1\155\1\175\2\uffff"+
        "\1\164\1\157\1\151\1\154\2\uffff\1\175\1\145\1\167\1\145\1\175\1"+
        "\uffff\2\175\1\141\1\156\1\uffff\1\175\3\uffff\2\156\1\145\1\164"+
        "\1\143\1\145\1\164\1\160\2\uffff\1\164\1\154\1\164\1\175\1\143\4"+
        "\175\1\164\2\uffff\2\175\1\uffff\1\175\1\164\1\uffff\1\175\1\162"+
        "\1\145\1\141\1\147\3\uffff\1\175\1\uffff\1\175\1\uffff\1\141\1\154"+
        "\1\uffff\1\175\1\143\1\154\2\uffff\1\160\1\154\1\151\1\157\1\151"+
        "\1\171\1\uffff\2\175\2\156\1\151\1\137\1\uffff\1\141\2\156\1\141"+
        "\1\uffff\1\175\1\156\1\175\3\uffff\1\175\1\162\1\147\1\uffff\1\175"+
        "\1\147\1\156\2\145\2\175\1\157\3\175\1\uffff\1\164\4\uffff\1\175"+
        "\3\uffff\1\157\1\uffff\1\175\1\143\1\154\1\175\2\uffff\1\154\1\175"+
        "\1\uffff\1\175\1\145\1\163\1\175\1\157\1\156\1\157\1\175\2\uffff"+
        "\1\137\1\164\1\156\1\165\1\155\1\145\1\147\1\164\1\uffff\1\175\2"+
        "\uffff\2\175\1\uffff\1\164\1\147\1\162\1\175\2\uffff\1\156\1\uffff"+
        "\1\165\2\uffff\1\175\1\uffff\1\162\1\uffff\1\164\1\175\1\uffff\1"+
        "\175\2\uffff\1\156\1\175\1\uffff\1\156\1\175\1\156\1\uffff\1\165"+
        "\1\175\1\147\1\163\1\160\1\137\1\175\1\145\3\uffff\1\150\1\164\1"+
        "\175\1\uffff\1\144\1\141\1\151\1\163\1\uffff\2\175\2\uffff\1\147"+
        "\1\uffff\1\175\1\uffff\1\175\1\163\1\uffff\1\175\1\145\1\175\1\155"+
        "\1\uffff\2\175\1\150\1\uffff\1\154\1\151\1\164\1\155\1\145\2\uffff"+
        "\1\164\2\uffff\1\145\1\uffff\1\162\1\uffff\1\157\1\151\2\uffff\1"+
        "\175\1\145\1\156\2\145\1\162\1\150\1\162\1\175\1\165\1\156\1\uffff"+
        "\1\156\1\147\5\175\1\uffff\1\162\1\165\1\147\1\175\2\uffff\1\164"+
        "\3\uffff\1\175\2\164\1\uffff\1\141\1\uffff\1\145\1\150\1\155\2\175"+
        "\1\160\2\uffff\1\175\1\uffff";
    static final String DFA40_acceptS =
        "\31\uffff\1\u008c\1\uffff\1\u008d\1\u008e\1\uffff\1\u0090\1\u0091"+
        "\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\uffff\1\u0099\1\u009a"+
        "\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2"+
        "\115\uffff\1\u008f\1\uffff\1\u0098\1\u0097\4\uffff\1\5\1\uffff\1"+
        "\7\4\uffff\1\15\40\uffff\1\70\4\uffff\1\101\21\uffff\1\130\1\131"+
        "\1\uffff\1\133\25\uffff\1\167\21\uffff\1\1\1\2\1\3\1\4\1\6\1\10"+
        "\1\uffff\1\12\15\uffff\1\40\1\41\7\uffff\1\51\6\uffff\1\61\12\uffff"+
        "\1\74\11\uffff\1\111\1\112\1\uffff\1\115\5\uffff\1\123\21\uffff"+
        "\1\153\3\uffff\1\157\31\uffff\1\14\1\16\1\17\1\20\11\uffff\1\37"+
        "\3\uffff\1\45\2\uffff\1\50\7\uffff\1\62\1\63\3\uffff\1\67\5\uffff"+
        "\1\100\1\102\1\uffff\1\104\1\105\12\uffff\1\124\3\uffff\1\132\2"+
        "\uffff\1\136\5\uffff\1\145\1\146\5\uffff\1\155\3\uffff\1\162\1\163"+
        "\4\uffff\1\172\1\173\5\uffff\1\u0081\4\uffff\1\u0087\1\uffff\1\u0089"+
        "\1\u008a\1\u008b\10\uffff\1\30\1\31\12\uffff\1\56\1\57\2\uffff\1"+
        "\65\2\uffff\1\72\5\uffff\1\106\1\107\1\110\1\uffff\1\114\1\uffff"+
        "\1\117\2\uffff\1\122\3\uffff\1\134\1\135\6\uffff\1\147\6\uffff\1"+
        "\161\4\uffff\1\174\3\uffff\1\u0080\1\u0082\1\u0083\3\uffff\1\u0088"+
        "\13\uffff\1\44\1\uffff\1\47\1\52\1\53\1\54\1\uffff\1\60\1\64\1\66"+
        "\1\uffff\1\73\4\uffff\1\113\1\116\2\uffff\1\125\10\uffff\1\150\1"+
        "\151\10\uffff\1\175\1\uffff\1\177\1\u0084\2\uffff\1\11\4\uffff\1"+
        "\25\1\26\1\uffff\1\32\1\uffff\1\42\1\43\1\uffff\1\55\1\uffff\1\75"+
        "\2\uffff\1\103\1\uffff\1\121\1\126\2\uffff\1\140\3\uffff\1\144\10"+
        "\uffff\1\176\1\u0085\1\u0086\3\uffff\1\24\4\uffff\1\46\2\uffff\1"+
        "\77\1\120\1\uffff\1\137\1\uffff\1\141\2\uffff\1\154\4\uffff\1\170"+
        "\3\uffff\1\22\5\uffff\1\71\1\76\1\uffff\1\143\1\142\1\uffff\1\156"+
        "\1\uffff\1\164\2\uffff\1\171\1\13\13\uffff\1\21\7\uffff\1\160\4"+
        "\uffff\1\33\1\34\1\uffff\1\36\1\127\1\152\3\uffff\1\27\1\uffff\1"+
        "\165\6\uffff\1\166\1\23\1\uffff\1\35";
    static final String DFA40_specialS =
        "\32\uffff\1\0\140\uffff\1\1\162\uffff\1\2\u01e2\uffff}>";
    static final String[] DFA40_transitionS = {
            "\2\57\2\uffff\1\57\22\uffff\1\57\1\uffff\1\32\1\uffff\1\31"+
            "\1\36\1\37\1\34\1\40\1\41\1\42\1\43\1\44\1\57\1\33\1\45\12\33"+
            "\1\35\1\46\1\47\1\50\1\51\1\52\1\uffff\1\1\1\2\1\3\1\4\1\5\1"+
            "\6\1\7\1\10\1\11\1\12\1\31\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
            "\1\22\1\23\1\24\1\25\1\26\1\31\1\27\1\30\1\54\1\uffff\1\55\1"+
            "\uffff\1\56\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1"+
            "\12\1\31\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1"+
            "\25\1\26\1\31\1\27\1\30\1\31\1\53\1\31",
            "\1\60\7\uffff\1\61\1\uffff\1\62\4\uffff\1\63\1\64\1\uffff"+
            "\1\65\15\uffff\1\60\7\uffff\1\61\1\uffff\1\62\4\uffff\1\63\1"+
            "\64\1\uffff\1\65",
            "\1\66\3\uffff\1\67\5\uffff\1\70\11\uffff\1\71\13\uffff\1\66"+
            "\3\uffff\1\67\5\uffff\1\70\11\uffff\1\71",
            "\1\72\6\uffff\1\73\6\uffff\1\74\2\uffff\1\75\2\uffff\1\76"+
            "\13\uffff\1\72\6\uffff\1\73\6\uffff\1\74\2\uffff\1\75\2\uffff"+
            "\1\76",
            "\1\77\3\uffff\1\100\3\uffff\1\101\5\uffff\1\102\21\uffff\1"+
            "\77\3\uffff\1\100\3\uffff\1\101\5\uffff\1\102",
            "\1\103\1\uffff\1\104\4\uffff\1\105\4\uffff\1\106\23\uffff"+
            "\1\103\1\uffff\1\104\4\uffff\1\105\4\uffff\1\106",
            "\1\107\12\uffff\1\110\2\uffff\1\111\2\uffff\1\112\2\uffff"+
            "\1\113\13\uffff\1\107\12\uffff\1\110\2\uffff\1\111\2\uffff\1"+
            "\112\2\uffff\1\113",
            "\1\114\5\uffff\1\115\31\uffff\1\114\5\uffff\1\115",
            "\1\116\15\uffff\1\117\21\uffff\1\116\15\uffff\1\117",
            "\1\120\4\uffff\1\121\32\uffff\1\120\4\uffff\1\121",
            "\1\122\37\uffff\1\122",
            "\1\123\3\uffff\1\124\5\uffff\1\125\25\uffff\1\123\3\uffff"+
            "\1\124\5\uffff\1\125",
            "\1\126\7\uffff\1\127\5\uffff\1\130\21\uffff\1\126\7\uffff"+
            "\1\127\5\uffff\1\130",
            "\1\131\1\uffff\1\132\13\uffff\1\133\5\uffff\1\134\13\uffff"+
            "\1\131\1\uffff\1\132\13\uffff\1\133\5\uffff\1\134",
            "\1\135\2\uffff\1\136\7\uffff\1\137\3\uffff\1\140\2\uffff\1"+
            "\141\1\142\14\uffff\1\135\2\uffff\1\136\7\uffff\1\137\3\uffff"+
            "\1\140\2\uffff\1\141\1\142",
            "\1\143\15\uffff\1\144\2\uffff\1\145\16\uffff\1\143\15\uffff"+
            "\1\144\2\uffff\1\145",
            "\1\146\37\uffff\1\146",
            "\1\147\3\uffff\1\150\33\uffff\1\147\3\uffff\1\150",
            "\1\151\7\uffff\1\152\1\uffff\1\153\5\uffff\1\154\3\uffff\1"+
            "\155\13\uffff\1\151\7\uffff\1\152\1\uffff\1\153\5\uffff\1\154"+
            "\3\uffff\1\155",
            "\1\156\6\uffff\1\157\1\160\5\uffff\1\161\2\uffff\1\162\16"+
            "\uffff\1\156\6\uffff\1\157\1\160\5\uffff\1\161\2\uffff\1\162",
            "\1\163\1\uffff\1\164\2\uffff\1\165\32\uffff\1\163\1\uffff"+
            "\1\164\2\uffff\1\165",
            "\1\166\37\uffff\1\166",
            "\1\167\1\170\36\uffff\1\167\1\170",
            "\1\171\37\uffff\1\171",
            "\1\172\37\uffff\1\172",
            "",
            "\12\175\1\uffff\2\175\1\uffff\24\175\1\174\1\175\1\173\13"+
            "\175\13\173\6\175\32\173\4\175\1\173\1\175\33\173\1\175\1\173"+
            "\uff82\175",
            "",
            "",
            "\1\177\1\176\2\177\7\uffff\1\177\1\uffff\12\176\6\uffff\1"+
            "\177\32\176\4\uffff\1\176\1\uffff\32\176",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
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
            "\1\u0081\37\uffff\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "\1\u0083\24\uffff\1\u0084\12\uffff\1\u0083\24\uffff\1\u0084",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\2\31\1\u0086\27"+
            "\31\4\uffff\1\31\1\uffff\2\31\1\u0086\30\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u008d\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u008f\12\uffff\1\u0090\1\uffff\1\u0091\3\uffff\1\u0092"+
            "\2\uffff\1\u0093\13\uffff\1\u008f\12\uffff\1\u0090\1\uffff\1"+
            "\u0091\3\uffff\1\u0092\2\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0096\4\uffff\1\u0097\32\uffff\1\u0096\4\uffff\1\u0097",
            "\1\u0098\2\uffff\1\u0099\5\uffff\1\u009a\6\uffff\1\u009b\17"+
            "\uffff\1\u0098\2\uffff\1\u0099\5\uffff\1\u009a\6\uffff\1\u009b",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "\1\u009f\37\uffff\1\u009f",
            "\1\u00a0\37\uffff\1\u00a0",
            "\1\u00a1\5\uffff\1\u00a2\12\uffff\1\u00a3\16\uffff\1\u00a1"+
            "\5\uffff\1\u00a2\12\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\1\u00a5\37\uffff\1\u00a5",
            "\1\u00a6\37\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\3\31\1\u00ae\11"+
            "\31\1\u00af\4\31\1\u00b0\1\u00b1\6\31\4\uffff\1\31\1\uffff\3"+
            "\31\1\u00ae\11\31\1\u00af\4\31\1\u00b0\1\u00b1\7\31\1\uffff"+
            "\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b4\4\uffff\1\u00b5\32\uffff\1\u00b4\4\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\1\u00b7\23\uffff\1\u00b8\13\uffff\1\u00b7\23\uffff\1\u00b8",
            "\1\u00b9\3\uffff\1\u00ba\33\uffff\1\u00b9\3\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\1\u00bc\11\uffff\1\u00bd\25\uffff\1\u00bc\11\uffff\1\u00bd",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00bf\37\uffff\1\u00bf",
            "\1\u00c0\37\uffff\1\u00c0",
            "\1\u00c1\1\u00c2\36\uffff\1\u00c1\1\u00c2",
            "\1\u00c3\37\uffff\1\u00c3",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\13\31\1\u00c6\16"+
            "\31\4\uffff\1\31\1\uffff\13\31\1\u00c6\17\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\3\31\1\u00c8\26"+
            "\31\4\uffff\1\31\1\uffff\3\31\1\u00c8\27\31\1\uffff\1\31",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cb\37\uffff\1\u00cb",
            "\1\u00cc\37\uffff\1\u00cc",
            "\1\u00cd\37\uffff\1\u00cd",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d1\10\uffff\1\u00d2\6\uffff\1\u00d3\1\u00d4\16\uffff"+
            "\1\u00d1\10\uffff\1\u00d2\6\uffff\1\u00d3\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d6",
            "\1\u00d7\12\uffff\1\u00d8\24\uffff\1\u00d7\12\uffff\1\u00d8",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "\1\u00dc\37\uffff\1\u00dc",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u00de\7\uffff\1\u00df\13\uffff\1\u00e0\13\uffff\1\u00de"+
            "\7\uffff\1\u00df\13\uffff\1\u00e0",
            "\1\u00e1\1\uffff\1\u00e2\35\uffff\1\u00e1\1\uffff\1\u00e2",
            "\1\u00e3\13\uffff\1\u00e4\23\uffff\1\u00e3\13\uffff\1\u00e4",
            "\1\u00e5\3\uffff\1\u00e6\33\uffff\1\u00e5\3\uffff\1\u00e6",
            "\1\u00e7\5\uffff\1\u00e8\31\uffff\1\u00e7\5\uffff\1\u00e8",
            "\1\u00e9\37\uffff\1\u00e9",
            "\1\u00ea\37\uffff\1\u00ea",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\12\175\1\uffff\2\175\1\uffff\24\175\1\u00ed\1\175\1\173\13"+
            "\175\13\173\6\175\32\173\4\175\1\173\1\175\33\173\1\175\1\173"+
            "\uff82\175",
            "\1\u00ee",
            "",
            "\1\177\1\176\2\177\7\uffff\1\177\1\uffff\12\176\6\uffff\1"+
            "\177\32\176\4\uffff\1\176\1\uffff\32\176",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\u00f7\1\uffff\33\31\1\uffff\1\31",
            "\1\u00f8\37\uffff\1\u00f8",
            "",
            "\1\u00f9\16\uffff\1\u00fa\20\uffff\1\u00f9\16\uffff\1\u00fa",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc\37\uffff\1\u00fc",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "\1\u0102\37\uffff\1\u0102",
            "\1\u0103\37\uffff\1\u0103",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\10\31\1\u0106\21"+
            "\31\4\uffff\1\31\1\uffff\10\31\1\u0106\22\31\1\uffff\1\31",
            "\1\u0107\37\uffff\1\u0107",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u0109\37\uffff\1\u0109",
            "\1\u010a\37\uffff\1\u010a",
            "\1\u010b\37\uffff\1\u010b",
            "\1\u010c\37\uffff\1\u010c",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u010e\37\uffff\1\u010e",
            "\1\u010f\37\uffff\1\u010f",
            "\1\u0110\37\uffff\1\u0110",
            "\1\u0111\37\uffff\1\u0111",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\14\31\1\u0115\15"+
            "\31\4\uffff\1\31\1\uffff\14\31\1\u0115\16\31\1\uffff\1\31",
            "\1\u0116\37\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0118\37\uffff\1\u0118",
            "\1\u0119\37\uffff\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "\1\u011b\37\uffff\1\u011b",
            "",
            "\1\u011c\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011d",
            "\1\u011e\37\uffff\1\u011e",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\4\31\1\u0120\11"+
            "\31\1\u0121\13\31\4\uffff\1\31\1\uffff\4\31\1\u0120\11\31\1"+
            "\u0121\14\31\1\uffff\1\31",
            "",
            "\1\u0122\37\uffff\1\u0122",
            "\1\u0123\37\uffff\1\u0123",
            "\1\u0124\37\uffff\1\u0124",
            "\1\u0125\37\uffff\1\u0125",
            "\1\u0126\37\uffff\1\u0126",
            "\1\u0127\37\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\24\31\1\u012b\5"+
            "\31\4\uffff\1\31\1\uffff\24\31\1\u012b\6\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\24\31\1\u012d\5"+
            "\31\4\uffff\1\31\1\uffff\24\31\1\u012d\6\31\1\uffff\1\31",
            "\1\u012e\37\uffff\1\u012e",
            "\1\u012f\13\uffff\1\u0130\23\uffff\1\u012f\13\uffff\1\u0130",
            "\1\u0131\37\uffff\1\u0131",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "\1\u0135\37\uffff\1\u0135",
            "",
            "",
            "\1\u0136\37\uffff\1\u0136",
            "",
            "\1\u0137\37\uffff\1\u0137",
            "\1\u0138\37\uffff\1\u0138",
            "\1\u0139\37\uffff\1\u0139",
            "\1\u013a\37\uffff\1\u013a",
            "\1\u013b\37\uffff\1\u013b",
            "\1\u013c\37\uffff\1\u013c",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013e\7\uffff\1\u013f\27\uffff\1\u013e\7\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0141\37\uffff\1\u0141",
            "\1\u0142\37\uffff\1\u0142",
            "\1\u0143\37\uffff\1\u0143",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0145\37\uffff\1\u0145",
            "\1\u0146\37\uffff\1\u0146",
            "\1\u0147\37\uffff\1\u0147",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0149\37\uffff\1\u0149",
            "\1\u014a\37\uffff\1\u014a",
            "\1\u014b\37\uffff\1\u014b",
            "\1\u014c\37\uffff\1\u014c",
            "",
            "\1\u014d\4\uffff\1\u014e\32\uffff\1\u014d\4\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "\1\u0150\37\uffff\1\u0150",
            "\1\u0151\1\uffff\1\u0152\35\uffff\1\u0151\1\uffff\1\u0152",
            "\1\u0153\37\uffff\1\u0153",
            "\1\u0154\37\uffff\1\u0154",
            "\1\u0155\37\uffff\1\u0155",
            "\1\u0156\37\uffff\1\u0156",
            "\1\u0157\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\1\u0159\25\uffff\1\u015a\11\uffff\1\u0159\25\uffff\1\u015a",
            "\1\u015b\3\uffff\1\u015c\33\uffff\1\u015b\3\uffff\1\u015c",
            "\1\u015d\37\uffff\1\u015d",
            "\1\u015e\37\uffff\1\u015e",
            "\1\u015f\37\uffff\1\u015f",
            "\1\u00ee",
            "\12\175\1\uffff\2\175\1\uffff\24\175\1\u00ed\1\175\1\173\13"+
            "\175\13\173\6\175\32\173\4\175\1\173\1\175\33\173\1\175\1\173"+
            "\uff82\175",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0160\37\uffff\1\u0160",
            "",
            "\1\u0161\37\uffff\1\u0161",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\1\u0167\31\31\4"+
            "\uffff\1\u0166\1\uffff\1\u0167\32\31\1\uffff\1\31",
            "\1\u0168\37\uffff\1\u0168",
            "\1\u0169\37\uffff\1\u0169",
            "\1\u016a\37\uffff\1\u016a",
            "\1\u016b\37\uffff\1\u016b",
            "\1\u016c\37\uffff\1\u016c",
            "\1\u016d\37\uffff\1\u016d",
            "\1\u016e\37\uffff\1\u016e",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "",
            "\1\u0170\37\uffff\1\u0170",
            "\1\u0171\37\uffff\1\u0171",
            "\1\u0172\37\uffff\1\u0172",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0174\37\uffff\1\u0174",
            "\1\u0175\37\uffff\1\u0175",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\u0177\37\uffff\1\u0177",
            "\1\u0178\37\uffff\1\u0178",
            "\1\u0179\37\uffff\1\u0179",
            "\1\u017a\37\uffff\1\u017a",
            "\1\u017b\37\uffff\1\u017b",
            "\1\u017c\37\uffff\1\u017c",
            "",
            "\1\u017d\37\uffff\1\u017d",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0180\37\uffff\1\u0180",
            "\1\u0181\37\uffff\1\u0181",
            "\1\u0182\37\uffff\1\u0182",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0184\37\uffff\1\u0184",
            "\1\u0185\37\uffff\1\u0185",
            "\1\u0186\37\uffff\1\u0186",
            "",
            "\1\u0187\12\uffff\1\u0188\24\uffff\1\u0187\12\uffff\1\u0188",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u018b\37\uffff\1\u018b",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u018e\37\uffff\1\u018e",
            "\1\u018f\37\uffff\1\u018f",
            "\1\u0190\37\uffff\1\u0190",
            "",
            "",
            "\1\u0192\1\u0191\36\uffff\1\u0192\1\u0191",
            "",
            "\1\u0193\37\uffff\1\u0193",
            "\1\u0194\37\uffff\1\u0194",
            "\1\u0195\37\uffff\1\u0195",
            "\1\u0196\37\uffff\1\u0196",
            "\1\u0197\37\uffff\1\u0197",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\10\31\1\u0199\21"+
            "\31\4\uffff\1\31\1\uffff\10\31\1\u0199\22\31\1\uffff\1\31",
            "\1\u019a\37\uffff\1\u019a",
            "\1\u019b\37\uffff\1\u019b",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u019d\37\uffff\1\u019d",
            "\1\u019e\37\uffff\1\u019e",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\13\31\1\u01a0\16"+
            "\31\4\uffff\1\31\1\uffff\13\31\1\u01a0\17\31\1\uffff\1\31",
            "\1\u01a1\37\uffff\1\u01a1",
            "\1\u01a2\37\uffff\1\u01a2",
            "\1\u01a3\37\uffff\1\u01a3",
            "\1\u01a4\37\uffff\1\u01a4",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01a7\37\uffff\1\u01a7",
            "\1\u01a8\37\uffff\1\u01a8",
            "\1\u01a9\37\uffff\1\u01a9",
            "\1\u01aa\37\uffff\1\u01aa",
            "",
            "\1\u01ab\37\uffff\1\u01ab",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01ad\37\uffff\1\u01ad",
            "",
            "\1\u01ae\37\uffff\1\u01ae",
            "\1\u01af\37\uffff\1\u01af",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\22\31\1\u01b2\6"+
            "\31\1\u01b3\4\uffff\1\31\1\uffff\22\31\1\u01b2\6\31\1\u01b3"+
            "\1\31\1\uffff\1\31",
            "\1\u01b4\37\uffff\1\u01b4",
            "\1\u01b5\37\uffff\1\u01b5",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01b8\37\uffff\1\u01b8",
            "\1\u01b9\37\uffff\1\u01b9",
            "\1\u01ba\37\uffff\1\u01ba",
            "\1\u01bb\37\uffff\1\u01bb",
            "\1\u01bc\37\uffff\1\u01bc",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01be\37\uffff\1\u01be",
            "\1\u01bf\37\uffff\1\u01bf",
            "\1\u01c0\37\uffff\1\u01c0",
            "\1\u01c1\37\uffff\1\u01c1",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01c3\37\uffff\1\u01c3",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01c7\37\uffff\1\u01c7",
            "\1\u01c8\37\uffff\1\u01c8",
            "",
            "",
            "",
            "",
            "\1\u01c9\37\uffff\1\u01c9",
            "\1\u01ca\37\uffff\1\u01ca",
            "\1\u01cb\37\uffff\1\u01cb",
            "\1\u01cc\37\uffff\1\u01cc",
            "\1\u01cd\37\uffff\1\u01cd",
            "\1\u01ce\37\uffff\1\u01ce",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01d1\37\uffff\1\u01d1",
            "",
            "\1\u01d2\37\uffff\1\u01d2",
            "\1\u01d3\37\uffff\1\u01d3",
            "\1\u01d4\37\uffff\1\u01d4",
            "",
            "\1\u01d5\37\uffff\1\u01d5",
            "\1\u01d6\37\uffff\1\u01d6",
            "",
            "\1\u01d7\37\uffff\1\u01d7",
            "\1\u01d8\37\uffff\1\u01d8",
            "\1\u01d9\37\uffff\1\u01d9",
            "\1\u01da\37\uffff\1\u01da",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01dd\37\uffff\1\u01dd",
            "",
            "",
            "\1\u01de\37\uffff\1\u01de",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01e0\37\uffff\1\u01e0",
            "",
            "\1\u01e1\37\uffff\1\u01e1",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01e3\37\uffff\1\u01e3",
            "\1\u01e4\37\uffff\1\u01e4",
            "\1\u01e5\2\uffff\1\u01e6\34\uffff\1\u01e5\2\uffff\1\u01e6",
            "",
            "",
            "\1\u01e7\37\uffff\1\u01e7",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01eb\37\uffff\1\u01eb",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01ed\37\uffff\1\u01ed",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01ef\37\uffff\1\u01ef",
            "\1\u01f0\37\uffff\1\u01f0",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\u01f2\37\uffff\1\u01f2",
            "\1\u01f3\37\uffff\1\u01f3",
            "\1\u01f4",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\u01f7\37\uffff\1\u01f7",
            "\1\u01f8\22\uffff\1\u01f9\14\uffff\1\u01f8\22\uffff\1\u01f9",
            "\1\u01fa\37\uffff\1\u01fa",
            "\1\u01fb\37\uffff\1\u01fb",
            "\1\u01fc\37\uffff\1\u01fc",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u01fe\37\uffff\1\u01fe",
            "\1\u01ff\37\uffff\1\u01ff",
            "\1\u0200\37\uffff\1\u0200",
            "\1\u0201\37\uffff\1\u0201",
            "",
            "\1\u0202\37\uffff\1\u0202",
            "\1\u0203\37\uffff\1\u0203",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "",
            "\1\u0205\37\uffff\1\u0205",
            "\1\u0206\37\uffff\1\u0206",
            "\1\u0207\37\uffff\1\u0207",
            "\1\u0208\37\uffff\1\u0208",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u020a\37\uffff\1\u020a",
            "\1\u020b\37\uffff\1\u020b",
            "\1\u020c\37\uffff\1\u020c",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\22\31\1\u0210\7"+
            "\31\4\uffff\1\31\1\uffff\22\31\1\u0210\10\31\1\uffff\1\31",
            "\1\u0211\37\uffff\1\u0211",
            "\1\u0212\37\uffff\1\u0212",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "",
            "",
            "\1\u0214\37\uffff\1\u0214",
            "\1\u0215\37\uffff\1\u0215",
            "\1\u0216\37\uffff\1\u0216",
            "\1\u0217\37\uffff\1\u0217",
            "\1\u0218\37\uffff\1\u0218",
            "\1\u0219\37\uffff\1\u0219",
            "\1\u021a\37\uffff\1\u021a",
            "\1\u021b\37\uffff\1\u021b",
            "",
            "",
            "\1\u021c\37\uffff\1\u021c",
            "\1\u021d\37\uffff\1\u021d",
            "\1\u021e\37\uffff\1\u021e",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0220\37\uffff\1\u0220",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0225\37\uffff\1\u0225",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0229\37\uffff\1\u0229",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u022b\37\uffff\1\u022b",
            "\1\u022c\37\uffff\1\u022c",
            "\1\u022d\37\uffff\1\u022d",
            "\1\u022e\37\uffff\1\u022e",
            "",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\u0231\37\uffff\1\u0231",
            "\1\u0232\37\uffff\1\u0232",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0234\37\uffff\1\u0234",
            "\1\u0235\37\uffff\1\u0235",
            "",
            "",
            "\1\u0236\37\uffff\1\u0236",
            "\1\u0237\37\uffff\1\u0237",
            "\1\u0238\37\uffff\1\u0238",
            "\1\u0239\37\uffff\1\u0239",
            "\1\u023a\37\uffff\1\u023a",
            "\1\u023b\37\uffff\1\u023b",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u023e\37\uffff\1\u023e",
            "\1\u023f\37\uffff\1\u023f",
            "\1\u0240\37\uffff\1\u0240",
            "\1\u0241",
            "",
            "\1\u0242\37\uffff\1\u0242",
            "\1\u0243\37\uffff\1\u0243",
            "\1\u0244\37\uffff\1\u0244",
            "\1\u0245\37\uffff\1\u0245",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0247\37\uffff\1\u0247",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u024a\37\uffff\1\u024a",
            "\1\u024b\37\uffff\1\u024b",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u024d\37\uffff\1\u024d",
            "\1\u024e\37\uffff\1\u024e",
            "\1\u024f\37\uffff\1\u024f",
            "\1\u0250\37\uffff\1\u0250",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0253\37\uffff\1\u0253",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\u0255\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\u0258\37\uffff\1\u0258",
            "",
            "",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "",
            "",
            "\1\u025a\37\uffff\1\u025a",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u025c\37\uffff\1\u025c",
            "\1\u025d\37\uffff\1\u025d",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "",
            "\1\u025f\37\uffff\1\u025f",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0262\37\uffff\1\u0262",
            "\1\u0263\37\uffff\1\u0263",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0265\37\uffff\1\u0265",
            "\1\u0266\37\uffff\1\u0266",
            "\1\u0267\37\uffff\1\u0267",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "",
            "\1\u0269",
            "\1\u026a\37\uffff\1\u026a",
            "\1\u026b\37\uffff\1\u026b",
            "\1\u026c\37\uffff\1\u026c",
            "\1\u026d\37\uffff\1\u026d",
            "\1\u026e\37\uffff\1\u026e",
            "\1\u026f\37\uffff\1\u026f",
            "\1\u0270\37\uffff\1\u0270",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\u0274\37\uffff\1\u0274",
            "\1\u0275\37\uffff\1\u0275",
            "\1\u0276\37\uffff\1\u0276",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "",
            "\1\u0278\37\uffff\1\u0278",
            "",
            "\1\u0279\17\uffff\1\u027a\1\u027b\16\uffff\1\u0279\17\uffff"+
            "\1\u027a\1\u027b",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\u027d\37\uffff\1\u027d",
            "",
            "\1\u027e\37\uffff\1\u027e",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "",
            "\1\u0281\37\uffff\1\u0281",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\u0283\37\uffff\1\u0283",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0285\37\uffff\1\u0285",
            "",
            "\1\u0286\37\uffff\1\u0286",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u0288\37\uffff\1\u0288",
            "\1\u0289\37\uffff\1\u0289",
            "\1\u028a\37\uffff\1\u028a",
            "\1\u028b",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u028d\37\uffff\1\u028d",
            "",
            "",
            "",
            "\1\u028e\37\uffff\1\u028e",
            "\1\u028f\37\uffff\1\u028f",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\u0291\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\u0292\37\uffff\1\u0292",
            "\1\u0293\37\uffff\1\u0293",
            "\1\u0294\37\uffff\1\u0294",
            "\1\u0295\37\uffff\1\u0295",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "",
            "\1\u0298\37\uffff\1\u0298",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u029b\37\uffff\1\u029b",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u029d\37\uffff\1\u029d",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u029f\4\uffff\1\u02a0\32\uffff\1\u029f\4\uffff\1\u02a0",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u02a3\37\uffff\1\u02a3",
            "",
            "\1\u02a4\37\uffff\1\u02a4",
            "\1\u02a5\37\uffff\1\u02a5",
            "\1\u02a6\37\uffff\1\u02a6",
            "\1\u02a7\37\uffff\1\u02a7",
            "\1\u02a8\37\uffff\1\u02a8",
            "",
            "",
            "\1\u02a9\37\uffff\1\u02a9",
            "",
            "",
            "\1\u02aa\37\uffff\1\u02aa",
            "",
            "\1\u02ab\37\uffff\1\u02ab",
            "",
            "\1\u02ac\37\uffff\1\u02ac",
            "\1\u02ad\37\uffff\1\u02ad",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u02af\37\uffff\1\u02af",
            "\1\u02b0\37\uffff\1\u02b0",
            "\1\u02b1\37\uffff\1\u02b1",
            "\1\u02b2\37\uffff\1\u02b2",
            "\1\u02b3\37\uffff\1\u02b3",
            "\1\u02b4\37\uffff\1\u02b4",
            "\1\u02b5\37\uffff\1\u02b5",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u02b7\37\uffff\1\u02b7",
            "\1\u02b8\37\uffff\1\u02b8",
            "",
            "\1\u02b9\37\uffff\1\u02b9",
            "\1\u02ba\37\uffff\1\u02ba",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\22\31\1\u02bd\7"+
            "\31\4\uffff\1\31\1\uffff\22\31\1\u02bd\10\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\1\u02c1\37\uffff\1\u02c1",
            "\1\u02c2\37\uffff\1\u02c2",
            "\1\u02c3\37\uffff\1\u02c3",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "",
            "\1\u02c5\37\uffff\1\u02c5",
            "",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u02c7\37\uffff\1\u02c7",
            "\1\u02c8\37\uffff\1\u02c8",
            "",
            "\1\u02c9\37\uffff\1\u02c9",
            "",
            "\1\u02ca\37\uffff\1\u02ca",
            "\1\u02cb\37\uffff\1\u02cb",
            "\1\u02cc\37\uffff\1\u02cc",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            "\1\u02cf\37\uffff\1\u02cf",
            "",
            "",
            "\1\31\1\uffff\1\31\13\uffff\13\31\6\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\33\31\1\uffff\1\31",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ADA | ALL | AND | ANY | AS | ASC | AT | AVG | BETWEEN | BIT | BIT_LENGTH | BOTH | BY | CASE | CAST | CHAR | CHAR_LENGTH | CHARACTER | CHARACTER_LENGTH | COALESCE | COLLATE | CONVERT | CORRESPONDING | COUNT | CROSS | CURRENT | CURRENT_DATE | CURRENT_TIME | CURRENT_TIMESTAMP | CURRENT_USER | DATE | DAY | DEC | DECIMAL | DEFAULT | DELETE | DESC | DISTINCT | DOUBLE | ELSE | END | ESCAPE | EXCEPT | EXISTS | EXTRACT | FALSE | FLOAT | FORMAT | FOR | FROM | FULL | GLOBAL | GROUP | HAVING | HOUR | IN | INDICATOR | INNER | INSERT | INT | INTEGER | INTERSECT | INTERVAL | INTO | IS | JOIN | LEADING | LEFT | LIKE | LOCAL | LOWER | MATCH | MAX | MIN | MINUTE | MINUS | MOD | MODULE | MONTH | NATIONAL | NATURAL | NCHAR | NOT | NULL | NULLIF | NUMERIC | OCTET_LENGTH | OF | ON | ONLY | OR | ORDER | OUTER | OVER | OVERLAPS | PARTIAL | POSITION | PRECISION | PARTITION | QUALIFY | READ | REAL | RIGHT | SECOND | SELECT | SESSION_USER | SET | SMALLINT | SOME | SUBSTRING | SUM | SYSTEM_USER | TABLE | THEN | TIME | TIMESTAMP | TIMEZONE_HOUR | TIMEZONE_MINUTE | TO | TRAILING | TRANSLATE | TRIM | TRUE | UNION | UNIQUE | UNKNOWN | UPDATE | UPPER | USER | USING | VALUE | VALUES | VARCHAR | VARYING | WHEN | WHERE | WITH | YEAR | ZONE | REGULAR_ID | EXACT_NUM_LIT | CHAR_STRING | DELIMITED_ID | PERCENT | AMPERSAND | LEFT_PAREN | RIGHT_PAREN | ASTERISK | PLUS_SIGN | COMMA | SOLIDUS | COLON | SEMICOLON | LESS_THAN_OP | EQUALS_OP | GREATER_THAN_OP | QUESTION_MARK | VERTICAL_BAR | LEFT_BRACKET | RIGHT_BRACKET | INTRODUCER | SEPARATOR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_26 = input.LA(1);

                        s = -1;
                        if ( (LA40_26=='$'||(LA40_26>='0' && LA40_26<=':')||(LA40_26>='A' && LA40_26<='Z')||LA40_26=='_'||(LA40_26>='a' && LA40_26<='{')||LA40_26=='}') ) {s = 123;}

                        else if ( (LA40_26=='\"') ) {s = 124;}

                        else if ( ((LA40_26>='\u0000' && LA40_26<='\t')||(LA40_26>='\u000B' && LA40_26<='\f')||(LA40_26>='\u000E' && LA40_26<='!')||LA40_26=='#'||(LA40_26>='%' && LA40_26<='/')||(LA40_26>=';' && LA40_26<='@')||(LA40_26>='[' && LA40_26<='^')||LA40_26=='`'||LA40_26=='|'||(LA40_26>='~' && LA40_26<='\uFFFF')) ) {s = 125;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_123 = input.LA(1);

                        s = -1;
                        if ( (LA40_123=='\"') ) {s = 237;}

                        else if ( (LA40_123=='$'||(LA40_123>='0' && LA40_123<=':')||(LA40_123>='A' && LA40_123<='Z')||LA40_123=='_'||(LA40_123>='a' && LA40_123<='{')||LA40_123=='}') ) {s = 123;}

                        else if ( ((LA40_123>='\u0000' && LA40_123<='\t')||(LA40_123>='\u000B' && LA40_123<='\f')||(LA40_123>='\u000E' && LA40_123<='!')||LA40_123=='#'||(LA40_123>='%' && LA40_123<='/')||(LA40_123>=';' && LA40_123<='@')||(LA40_123>='[' && LA40_123<='^')||LA40_123=='`'||LA40_123=='|'||(LA40_123>='~' && LA40_123<='\uFFFF')) ) {s = 125;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_238 = input.LA(1);

                        s = -1;
                        if ( (LA40_238=='\"') ) {s = 237;}

                        else if ( (LA40_238=='$'||(LA40_238>='0' && LA40_238<=':')||(LA40_238>='A' && LA40_238<='Z')||LA40_238=='_'||(LA40_238>='a' && LA40_238<='{')||LA40_238=='}') ) {s = 123;}

                        else if ( ((LA40_238>='\u0000' && LA40_238<='\t')||(LA40_238>='\u000B' && LA40_238<='\f')||(LA40_238>='\u000E' && LA40_238<='!')||LA40_238=='#'||(LA40_238>='%' && LA40_238<='/')||(LA40_238>=';' && LA40_238<='@')||(LA40_238>='[' && LA40_238<='^')||LA40_238=='`'||LA40_238=='|'||(LA40_238>='~' && LA40_238<='\uFFFF')) ) {s = 125;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}