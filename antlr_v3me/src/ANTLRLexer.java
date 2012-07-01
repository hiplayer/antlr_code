// $ANTLR 3.3 Nov 30, 2010 12:50:56 E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g 2012-07-01 15:45:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ANTLRLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int SEMPRED=4;
    public static final int DOC_COMMENT=5;
    public static final int STRING_LITERAL=6;
    public static final int ACTION=7;
    public static final int OPTIONS=8;
    public static final int INT=9;
    public static final int OR=10;
    public static final int CHAR_LITERAL=11;
    public static final int RANGE=12;
    public static final int TOKENS=13;
    public static final int TOKEN_REF=14;
    public static final int RCURLY=15;
    public static final int OPEN_ELEMENT_OPTION=16;
    public static final int CLOSE_ELEMENT_OPTION=17;
    public static final int LPAREN=18;
    public static final int RPAREN=19;
    public static final int BANG=20;
    public static final int ARG_ACTION=21;
    public static final int COLON=22;
    public static final int COMMA=23;
    public static final int RULE_REF=24;
    public static final int NOT_OP=25;
    public static final int TREE_BEGIN=26;
    public static final int QUESTION=27;
    public static final int STAR=28;
    public static final int PLUS=29;
    public static final int IMPLIES=30;
    public static final int CARET=31;
    public static final int WILDCARD=32;
    public static final int WS=33;
    public static final int SL_COMMENT=34;
    public static final int ML_COMMENT=35;
    public static final int COMMENT=36;
    public static final int ESC=37;
    public static final int XDIGIT=38;
    public static final int DIGIT=39;
    public static final int WS_LOOP=40;
    public static final int NESTED_ARG_ACTION=41;
    public static final int NESTED_ACTION=42;
    public static final int INTERNAL_RULE_REF=43;
    public static final int WS_OPT=44;

    // delegates
    // delegators

    public ANTLRLexer() {;} 
    public ANTLRLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ANTLRLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g"; }

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:3:7: ( 'header' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:3:9: 'header'
            {
            match("header"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:4:7: ( '=' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:4:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:5:7: ( ';' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:5:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:6:7: ( 'class' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:6:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:7:7: ( 'extends' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:7:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:8:7: ( 'Parser' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:8:9: 'Parser'
            {
            match("Parser"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:9:7: ( 'Lexer' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:9:9: 'Lexer'
            {
            match("Lexer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:10:7: ( 'TreeParser' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:10:9: 'TreeParser'
            {
            match("TreeParser"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:11:7: ( 'protected' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:11:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:12:7: ( 'public' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:12:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:13:7: ( 'private' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:13:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:14:7: ( 'returns' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:14:9: 'returns'
            {
            match("returns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:15:7: ( 'throws' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:15:9: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:16:7: ( 'exception' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:16:9: 'exception'
            {
            match("exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:17:7: ( 'catch' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:17:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:438:4: ( ( ' ' | '\\t' | '\\r' '\\n' | '\\n' ) )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:438:6: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' )
            {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:438:6: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt1=1;
                }
                break;
            case '\t':
                {
                alt1=2;
                }
                break;
            case '\r':
                {
                alt1=3;
                }
                break;
            case '\n':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:438:8: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:439:5: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:440:5: '\\r' '\\n'
                    {
                    match('\r'); 
                    match('\n'); 

                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:441:5: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:448:2: ( SL_COMMENT | ML_COMMENT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='/') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='/') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='*') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:448:4: SL_COMMENT
                    {
                    mSL_COMMENT(); 

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:448:17: ML_COMMENT
                    {
                    mML_COMMENT(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:452:5: ( '//' ( . )* ( '\\r' )? '\\n' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:452:9: '//' ( . )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:452:14: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\r') ) {
                    alt3=2;
                }
                else if ( (LA3_0=='\n') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:452:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:452:17: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:452:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:456:5: ( '/*' ( '*' )? ( . )* '*/' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:456:9: '/*' ( '*' )? ( . )* '*/'
            {
            match("/*"); 

            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:456:14: ( '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='*') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:456:15: '*'
                    {
                    match('*'); 
                    /*type=DOC_COMMENT;*/

                    }
                    break;

            }

            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:456:45: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:456:45: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "OPEN_ELEMENT_OPTION"
    public final void mOPEN_ELEMENT_OPTION() throws RecognitionException {
        try {
            int _type = OPEN_ELEMENT_OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:460:2: ( '<' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:460:4: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_ELEMENT_OPTION"

    // $ANTLR start "CLOSE_ELEMENT_OPTION"
    public final void mCLOSE_ELEMENT_OPTION() throws RecognitionException {
        try {
            int _type = CLOSE_ELEMENT_OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:464:2: ( '>' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:464:4: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_ELEMENT_OPTION"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:467:7: ( ',' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:467:9: ','
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

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:469:10: ( '?' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:469:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "TREE_BEGIN"
    public final void mTREE_BEGIN() throws RecognitionException {
        try {
            int _type = TREE_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:471:12: ( '#(' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:471:14: '#('
            {
            match("#("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TREE_BEGIN"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:473:7: ( '(' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:473:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:475:7: ( ')' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:475:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:477:7: ( ':' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:477:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:479:5: ( '*' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:479:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:481:5: ( '+' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:481:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "IMPLIES"
    public final void mIMPLIES() throws RecognitionException {
        try {
            int _type = IMPLIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:483:9: ( '=>' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:483:11: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPLIES"

    // $ANTLR start "CARET"
    public final void mCARET() throws RecognitionException {
        try {
            int _type = CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:485:7: ( '^' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:485:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CARET"

    // $ANTLR start "BANG"
    public final void mBANG() throws RecognitionException {
        try {
            int _type = BANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:487:6: ( '!' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:487:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BANG"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:489:4: ( '|' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:489:6: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "WILDCARD"
    public final void mWILDCARD() throws RecognitionException {
        try {
            int _type = WILDCARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:491:10: ( '.' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:491:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WILDCARD"

    // $ANTLR start "RANGE"
    public final void mRANGE() throws RecognitionException {
        try {
            int _type = RANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:493:7: ( '..' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:493:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANGE"

    // $ANTLR start "NOT_OP"
    public final void mNOT_OP() throws RecognitionException {
        try {
            int _type = NOT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:495:8: ( '~' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:495:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_OP"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:497:7: ( '}' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:497:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "CHAR_LITERAL"
    public final void mCHAR_LITERAL() throws RecognitionException {
        try {
            int _type = CHAR_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:500:2: ( '\\'' ( ESC | ~ '\\'' ) '\\'' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:500:4: '\\'' ( ESC | ~ '\\'' ) '\\''
            {
            match('\''); 
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:500:9: ( ESC | ~ '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\\') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='\"'||(LA7_1>='0' && LA7_1<='7')||LA7_1=='\\'||(LA7_1>='a' && LA7_1<='b')||LA7_1=='f'||LA7_1=='n'||LA7_1=='r'||(LA7_1>='t' && LA7_1<='u')||LA7_1=='w') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='\'') ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4=='\'') ) {
                        alt7=1;
                    }
                    else {
                        alt7=2;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:500:10: ESC
                    {
                    mESC(); 

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:500:14: ~ '\\''
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:504:2: ( '\"' ( ESC | ~ ( '\\\\' | '\"' ) )* '\"' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:504:4: '\"' ( ESC | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:504:8: ( ESC | ~ ( '\\\\' | '\"' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    alt8=1;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:504:9: ESC
            	    {
            	    mESC(); 

            	    }
            	    break;
            	case 2 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:504:13: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\"'); 

            			String s = getText();
            			s = s.substring(1,s.length()-1);
            			setText("'"+s+"'");
            		

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:513:5: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | 'w' | 'a' | '\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ( '0' .. '7' )? )? | ( '4' .. '7' ) ( '0' .. '7' )? | 'u' XDIGIT XDIGIT XDIGIT XDIGIT ) )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:513:7: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | 'w' | 'a' | '\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ( '0' .. '7' )? )? | ( '4' .. '7' ) ( '0' .. '7' )? | 'u' XDIGIT XDIGIT XDIGIT XDIGIT )
            {
            match('\\'); 
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:514:3: ( 'n' | 'r' | 't' | 'b' | 'f' | 'w' | 'a' | '\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ( '0' .. '7' )? )? | ( '4' .. '7' ) ( '0' .. '7' )? | 'u' XDIGIT XDIGIT XDIGIT XDIGIT )
            int alt12=13;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt12=1;
                }
                break;
            case 'r':
                {
                alt12=2;
                }
                break;
            case 't':
                {
                alt12=3;
                }
                break;
            case 'b':
                {
                alt12=4;
                }
                break;
            case 'f':
                {
                alt12=5;
                }
                break;
            case 'w':
                {
                alt12=6;
                }
                break;
            case 'a':
                {
                alt12=7;
                }
                break;
            case '\"':
                {
                alt12=8;
                }
                break;
            case '\'':
                {
                alt12=9;
                }
                break;
            case '\\':
                {
                alt12=10;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
                {
                alt12=11;
                }
                break;
            case '4':
            case '5':
            case '6':
            case '7':
                {
                alt12=12;
                }
                break;
            case 'u':
                {
                alt12=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:514:5: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 2 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:515:5: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 3 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:516:5: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:517:5: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 5 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:518:5: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:519:5: 'w'
                    {
                    match('w'); 

                    }
                    break;
                case 7 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:520:5: 'a'
                    {
                    match('a'); 

                    }
                    break;
                case 8 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:521:5: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 9 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:522:5: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 10 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:523:5: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 11 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:524:5: ( '0' .. '3' ) ( '0' .. '7' ( '0' .. '7' )? )?
                    {
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:524:5: ( '0' .. '3' )
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:524:6: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:525:4: ( '0' .. '7' ( '0' .. '7' )? )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>='0' && LA10_0<='7')) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:525:6: '0' .. '7' ( '0' .. '7' )?
                            {
                            matchRange('0','7'); 
                            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:525:15: ( '0' .. '7' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( ((LA9_0>='0' && LA9_0<='7')) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:525:17: '0' .. '7'
                                    {
                                    matchRange('0','7'); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 12 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:526:5: ( '4' .. '7' ) ( '0' .. '7' )?
                    {
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:526:5: ( '4' .. '7' )
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:526:6: '4' .. '7'
                    {
                    matchRange('4','7'); 

                    }

                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:527:4: ( '0' .. '7' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>='0' && LA11_0<='7')) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:527:6: '0' .. '7'
                            {
                            matchRange('0','7'); 

                            }
                            break;

                    }


                    }
                    break;
                case 13 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:528:5: 'u' XDIGIT XDIGIT XDIGIT XDIGIT
                    {
                    match('u'); 
                    mXDIGIT(); 
                    mXDIGIT(); 
                    mXDIGIT(); 
                    mXDIGIT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:534:2: ( '0' .. '9' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:534:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "XDIGIT"
    public final void mXDIGIT() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:538:8: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
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
    // $ANTLR end "XDIGIT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:544:5: ( ( '0' .. '9' )+ )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:544:7: ( '0' .. '9' )+
            {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:544:7: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:544:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "OPTIONS"
    public final void mOPTIONS() throws RecognitionException {
        try {
            int _type = OPTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:548:2: ( 'options' WS_LOOP '{' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:548:4: 'options' WS_LOOP '{'
            {
            match("options"); 

            mWS_LOOP(); 
            match('{'); 
            _channel=0;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPTIONS"

    // $ANTLR start "TOKENS"
    public final void mTOKENS() throws RecognitionException {
        try {
            int _type = TOKENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:552:2: ( 'tokens' WS_LOOP '{' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:552:4: 'tokens' WS_LOOP '{'
            {
            match("tokens"); 

            mWS_LOOP(); 
            match('{'); 
            _channel=0;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TOKENS"

    // $ANTLR start "ARG_ACTION"
    public final void mARG_ACTION() throws RecognitionException {
        try {
            int _type = ARG_ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:556:4: ( NESTED_ARG_ACTION )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:557:2: NESTED_ARG_ACTION
            {
            mNESTED_ARG_ACTION(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARG_ACTION"

    // $ANTLR start "NESTED_ARG_ACTION"
    public final void mNESTED_ARG_ACTION() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:563:2: ( '[' ( options {greedy=false; k=1; } : NESTED_ARG_ACTION | CHAR_LITERAL | STRING_LITERAL | . )* ']' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:563:4: '[' ( options {greedy=false; k=1; } : NESTED_ARG_ACTION | CHAR_LITERAL | STRING_LITERAL | . )* ']'
            {
            match('['); 
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:564:3: ( options {greedy=false; k=1; } : NESTED_ARG_ACTION | CHAR_LITERAL | STRING_LITERAL | . )*
            loop14:
            do {
                int alt14=5;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==']') ) {
                    alt14=5;
                }
                else if ( (LA14_0=='[') ) {
                    alt14=1;
                }
                else if ( (LA14_0=='\'') ) {
                    alt14=2;
                }
                else if ( (LA14_0=='\"') ) {
                    alt14=3;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='Z')||LA14_0=='\\'||(LA14_0>='^' && LA14_0<='\uFFFF')) ) {
                    alt14=4;
                }


                switch (alt14) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:565:5: NESTED_ARG_ACTION
            	    {
            	    mNESTED_ARG_ACTION(); 

            	    }
            	    break;
            	case 2 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:566:5: CHAR_LITERAL
            	    {
            	    mCHAR_LITERAL(); 

            	    }
            	    break;
            	case 3 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:567:5: STRING_LITERAL
            	    {
            	    mSTRING_LITERAL(); 

            	    }
            	    break;
            	case 4 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:568:5: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(']'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "NESTED_ARG_ACTION"

    // $ANTLR start "ACTION"
    public final void mACTION() throws RecognitionException {
        try {
            int _type = ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:574:2: ( NESTED_ACTION ( '?' )? )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:574:4: NESTED_ACTION ( '?' )?
            {
            mNESTED_ACTION(); 
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:574:18: ( '?' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='?') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:574:19: '?'
                    {
                    match('?'); 
                    /*type=SEMPRED;*/

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
    // $ANTLR end "ACTION"

    // $ANTLR start "NESTED_ACTION"
    public final void mNESTED_ACTION() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:579:2: ( '{' ( options {greedy=false; k=1; } : NESTED_ACTION | CHAR_LITERAL | COMMENT | STRING_LITERAL | . )* '}' )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:579:4: '{' ( options {greedy=false; k=1; } : NESTED_ACTION | CHAR_LITERAL | COMMENT | STRING_LITERAL | . )* '}'
            {
            match('{'); 
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:580:3: ( options {greedy=false; k=1; } : NESTED_ACTION | CHAR_LITERAL | COMMENT | STRING_LITERAL | . )*
            loop16:
            do {
                int alt16=6;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='}') ) {
                    alt16=6;
                }
                else if ( (LA16_0=='{') ) {
                    alt16=1;
                }
                else if ( (LA16_0=='\'') ) {
                    alt16=2;
                }
                else if ( (LA16_0=='/') ) {
                    alt16=3;
                }
                else if ( (LA16_0=='\"') ) {
                    alt16=4;
                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='.')||(LA16_0>='0' && LA16_0<='z')||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {
                    alt16=5;
                }


                switch (alt16) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:581:5: NESTED_ACTION
            	    {
            	    mNESTED_ACTION(); 

            	    }
            	    break;
            	case 2 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:582:5: CHAR_LITERAL
            	    {
            	    mCHAR_LITERAL(); 

            	    }
            	    break;
            	case 3 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:583:5: COMMENT
            	    {
            	    mCOMMENT(); 

            	    }
            	    break;
            	case 4 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:584:5: STRING_LITERAL
            	    {
            	    mSTRING_LITERAL(); 

            	    }
            	    break;
            	case 5 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:585:5: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match('}'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "NESTED_ACTION"

    // $ANTLR start "TOKEN_REF"
    public final void mTOKEN_REF() throws RecognitionException {
        try {
            int _type = TOKEN_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:591:2: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:591:4: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:592:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TOKEN_REF"

    // $ANTLR start "RULE_REF"
    public final void mRULE_REF() throws RecognitionException {
        try {
            int _type = RULE_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:596:2: ( INTERNAL_RULE_REF )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:596:4: INTERNAL_RULE_REF
            {
            mINTERNAL_RULE_REF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REF"

    // $ANTLR start "WS_LOOP"
    public final void mWS_LOOP() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:601:2: ( ( WS | COMMENT )* )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:601:4: ( WS | COMMENT )*
            {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:601:4: ( WS | COMMENT )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }
                else if ( (LA18_0=='/') ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:601:8: WS
            	    {
            	    mWS(); 

            	    }
            	    break;
            	case 2 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:602:5: COMMENT
            	    {
            	    mCOMMENT(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "WS_LOOP"

    // $ANTLR start "INTERNAL_RULE_REF"
    public final void mINTERNAL_RULE_REF() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:608:2: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:608:4: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:609:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "INTERNAL_RULE_REF"

    // $ANTLR start "WS_OPT"
    public final void mWS_OPT() throws RecognitionException {
        try {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:616:8: ( ( WS )? )
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:616:10: ( WS )?
            {
            // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:616:10: ( WS )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:616:10: WS
                    {
                    mWS(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "WS_OPT"

    public void mTokens() throws RecognitionException {
        // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:8: ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | WS | SL_COMMENT | ML_COMMENT | OPEN_ELEMENT_OPTION | CLOSE_ELEMENT_OPTION | COMMA | QUESTION | TREE_BEGIN | LPAREN | RPAREN | COLON | STAR | PLUS | IMPLIES | CARET | BANG | OR | WILDCARD | RANGE | NOT_OP | RCURLY | CHAR_LITERAL | STRING_LITERAL | INT | OPTIONS | TOKENS | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF )
        int alt21=45;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:10: T__45
                {
                mT__45(); 

                }
                break;
            case 2 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:16: T__46
                {
                mT__46(); 

                }
                break;
            case 3 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:22: T__47
                {
                mT__47(); 

                }
                break;
            case 4 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:28: T__48
                {
                mT__48(); 

                }
                break;
            case 5 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:34: T__49
                {
                mT__49(); 

                }
                break;
            case 6 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:40: T__50
                {
                mT__50(); 

                }
                break;
            case 7 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:46: T__51
                {
                mT__51(); 

                }
                break;
            case 8 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:52: T__52
                {
                mT__52(); 

                }
                break;
            case 9 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:58: T__53
                {
                mT__53(); 

                }
                break;
            case 10 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:64: T__54
                {
                mT__54(); 

                }
                break;
            case 11 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:70: T__55
                {
                mT__55(); 

                }
                break;
            case 12 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:76: T__56
                {
                mT__56(); 

                }
                break;
            case 13 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:82: T__57
                {
                mT__57(); 

                }
                break;
            case 14 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:88: T__58
                {
                mT__58(); 

                }
                break;
            case 15 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:94: T__59
                {
                mT__59(); 

                }
                break;
            case 16 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:100: WS
                {
                mWS(); 

                }
                break;
            case 17 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:103: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 18 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:114: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 19 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:125: OPEN_ELEMENT_OPTION
                {
                mOPEN_ELEMENT_OPTION(); 

                }
                break;
            case 20 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:145: CLOSE_ELEMENT_OPTION
                {
                mCLOSE_ELEMENT_OPTION(); 

                }
                break;
            case 21 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:166: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 22 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:172: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 23 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:181: TREE_BEGIN
                {
                mTREE_BEGIN(); 

                }
                break;
            case 24 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:192: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 25 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:199: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 26 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:206: COLON
                {
                mCOLON(); 

                }
                break;
            case 27 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:212: STAR
                {
                mSTAR(); 

                }
                break;
            case 28 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:217: PLUS
                {
                mPLUS(); 

                }
                break;
            case 29 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:222: IMPLIES
                {
                mIMPLIES(); 

                }
                break;
            case 30 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:230: CARET
                {
                mCARET(); 

                }
                break;
            case 31 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:236: BANG
                {
                mBANG(); 

                }
                break;
            case 32 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:241: OR
                {
                mOR(); 

                }
                break;
            case 33 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:244: WILDCARD
                {
                mWILDCARD(); 

                }
                break;
            case 34 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:253: RANGE
                {
                mRANGE(); 

                }
                break;
            case 35 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:259: NOT_OP
                {
                mNOT_OP(); 

                }
                break;
            case 36 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:266: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 37 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:273: CHAR_LITERAL
                {
                mCHAR_LITERAL(); 

                }
                break;
            case 38 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:286: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 39 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:301: INT
                {
                mINT(); 

                }
                break;
            case 40 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:305: OPTIONS
                {
                mOPTIONS(); 

                }
                break;
            case 41 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:313: TOKENS
                {
                mTOKENS(); 

                }
                break;
            case 42 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:320: ARG_ACTION
                {
                mARG_ACTION(); 

                }
                break;
            case 43 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:331: ACTION
                {
                mACTION(); 

                }
                break;
            case 44 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:338: TOKEN_REF
                {
                mTOKEN_REF(); 

                }
                break;
            case 45 :
                // E:\\JAVA\\workspace\\Antlr_v2v3\\src\\ANTLR.g:1:348: RULE_REF
                {
                mRULE_REF(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\1\45\1\50\1\uffff\2\45\3\44\3\45\17\uffff\1\67\5\uffff"+
        "\1\45\4\uffff\1\45\2\uffff\3\45\3\44\5\45\4\uffff\6\45\3\44\14\45"+
        "\3\44\10\45\1\147\1\150\2\45\1\44\1\154\1\44\7\45\1\165\2\uffff"+
        "\2\45\1\170\1\uffff\1\44\2\45\1\174\1\45\1\176\2\45\1\uffff\1\u0081"+
        "\1\45\1\uffff\1\44\1\45\1\u0085\1\uffff\1\u0086\2\uffff\1\45\1\uffff"+
        "\1\45\1\44\1\45\3\uffff\1\u008b\1\44\1\u008d\1\uffff\1\u008e\2\uffff";
    static final String DFA21_eofS =
        "\u008f\uffff";
    static final String DFA21_minS =
        "\1\11\1\145\1\76\1\uffff\1\141\1\170\1\141\1\145\2\162\1\145\1"+
        "\150\1\uffff\1\52\15\uffff\1\56\5\uffff\1\160\4\uffff\1\141\2\uffff"+
        "\1\141\1\164\1\143\1\162\1\170\1\145\1\151\1\142\1\164\1\162\1\153"+
        "\4\uffff\1\164\1\144\1\163\1\143\2\145\1\163\2\145\1\164\1\166\1"+
        "\154\1\165\1\157\1\145\1\151\1\145\1\163\1\150\1\156\1\160\1\145"+
        "\1\162\1\120\1\145\1\141\1\151\1\162\1\167\1\156\1\157\1\162\2\60"+
        "\1\144\1\164\1\162\1\60\1\141\1\143\1\164\1\143\1\156\2\163\1\156"+
        "\1\60\2\uffff\1\163\1\151\1\60\1\uffff\1\162\1\164\1\145\1\60\1"+
        "\163\1\60\1\11\1\163\1\uffff\1\60\1\157\1\uffff\1\163\1\145\1\60"+
        "\1\uffff\1\60\2\uffff\1\11\1\uffff\1\156\1\145\1\144\3\uffff\1\60"+
        "\1\162\1\60\1\uffff\1\60\2\uffff";
    static final String DFA21_maxS =
        "\1\176\1\145\1\76\1\uffff\1\154\1\170\1\141\1\145\1\162\1\165\1"+
        "\145\1\157\1\uffff\1\57\15\uffff\1\56\5\uffff\1\160\4\uffff\1\141"+
        "\2\uffff\1\141\2\164\1\162\1\170\1\145\1\157\1\142\1\164\1\162\1"+
        "\153\4\uffff\1\164\1\144\1\163\1\143\2\145\1\163\2\145\1\164\1\166"+
        "\1\154\1\165\1\157\1\145\1\151\1\145\1\163\1\150\1\156\1\160\1\145"+
        "\1\162\1\120\1\145\1\141\1\151\1\162\1\167\1\156\1\157\1\162\2\172"+
        "\1\144\1\164\1\162\1\172\1\141\1\143\1\164\1\143\1\156\2\163\1\156"+
        "\1\172\2\uffff\1\163\1\151\1\172\1\uffff\1\162\1\164\1\145\1\172"+
        "\1\163\1\172\1\173\1\163\1\uffff\1\172\1\157\1\uffff\1\163\1\145"+
        "\1\172\1\uffff\1\172\2\uffff\1\173\1\uffff\1\156\1\145\1\144\3\uffff"+
        "\1\172\1\162\1\172\1\uffff\1\172\2\uffff";
    static final String DFA21_acceptS =
        "\3\uffff\1\3\10\uffff\1\20\1\uffff\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\36\1\37\1\40\1\uffff\1\43\1\44\1\45\1\46"+
        "\1\47\1\uffff\1\52\1\53\1\54\1\55\1\uffff\1\35\1\2\13\uffff\1\21"+
        "\1\22\1\42\1\41\57\uffff\1\4\1\17\3\uffff\1\7\10\uffff\1\1\2\uffff"+
        "\1\6\3\uffff\1\12\1\uffff\1\15\1\51\1\uffff\1\5\3\uffff\1\13\1\14"+
        "\1\50\3\uffff\1\16\1\uffff\1\11\1\10";
    static final String DFA21_specialS =
        "\u008f\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\14\2\uffff\1\14\22\uffff\1\14\1\31\1\37\1\22\3\uffff\1\36"+
            "\1\23\1\24\1\26\1\27\1\20\1\uffff\1\33\1\15\12\40\1\25\1\3\1"+
            "\16\1\2\1\17\1\21\1\uffff\13\44\1\7\3\44\1\6\3\44\1\10\6\44"+
            "\1\42\2\uffff\1\30\2\uffff\2\45\1\4\1\45\1\5\2\45\1\1\6\45\1"+
            "\41\1\11\1\45\1\12\1\45\1\13\6\45\1\43\1\32\1\35\1\34",
            "\1\46",
            "\1\47",
            "",
            "\1\52\12\uffff\1\51",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57\2\uffff\1\60",
            "\1\61",
            "\1\62\6\uffff\1\63",
            "",
            "\1\65\4\uffff\1\64",
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
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "\1\70",
            "",
            "",
            "",
            "",
            "\1\71",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\75\20\uffff\1\74",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\102\5\uffff\1\101",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\166",
            "\1\167",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\175",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\2\177\2\uffff\1\177\22\uffff\1\177\16\uffff\1\177\113\uffff"+
            "\1\177",
            "\1\u0080",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\2\u0087\2\uffff\1\u0087\22\uffff\1\u0087\16\uffff\1\u0087"+
            "\113\uffff\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u008c",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | WS | SL_COMMENT | ML_COMMENT | OPEN_ELEMENT_OPTION | CLOSE_ELEMENT_OPTION | COMMA | QUESTION | TREE_BEGIN | LPAREN | RPAREN | COLON | STAR | PLUS | IMPLIES | CARET | BANG | OR | WILDCARD | RANGE | NOT_OP | RCURLY | CHAR_LITERAL | STRING_LITERAL | INT | OPTIONS | TOKENS | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF );";
        }
    }
 

}