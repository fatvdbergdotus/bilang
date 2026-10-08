package org.xtext.example.bilang.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBilangLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_DUTCH_POSTCODE=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_HOUSENUMBER=9;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_EMAIL_ADDRESS=5;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_PHONE_NUMBER=7;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalBilangLexer() {;} 
    public InternalBilangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBilangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBilang.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:11:7: ( 'task' )
            // InternalBilang.g:11:9: 'task'
            {
            match("task"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:12:7: ( 'empty' )
            // InternalBilang.g:12:9: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:13:7: ( 'process' )
            // InternalBilang.g:13:9: 'process'
            {
            match("process"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:14:7: ( 'compound' )
            // InternalBilang.g:14:9: 'compound'
            {
            match("compound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:15:7: ( 'abstract' )
            // InternalBilang.g:15:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:16:7: ( 'with' )
            // InternalBilang.g:16:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:17:7: ( 'name' )
            // InternalBilang.g:17:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:18:7: ( 'and' )
            // InternalBilang.g:18:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:19:7: ( 'parameter' )
            // InternalBilang.g:19:9: 'parameter'
            {
            match("parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:20:7: ( 'value' )
            // InternalBilang.g:20:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:21:7: ( 'send' )
            // InternalBilang.g:21:9: 'send'
            {
            match("send"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:22:7: ( 'an' )
            // InternalBilang.g:22:9: 'an'
            {
            match("an"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:23:7: ( 'email' )
            // InternalBilang.g:23:9: 'email'
            {
            match("email"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:24:7: ( 'to' )
            // InternalBilang.g:24:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:25:7: ( 'content' )
            // InternalBilang.g:25:9: 'content'
            {
            match("content"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:26:7: ( 'sms' )
            // InternalBilang.g:26:9: 'sms'
            {
            match("sms"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:27:7: ( 'a' )
            // InternalBilang.g:27:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:28:7: ( 'snail' )
            // InternalBilang.g:28:9: 'snail'
            {
            match("snail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:29:7: ( 'mail' )
            // InternalBilang.g:29:9: 'mail'
            {
            match("mail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:30:7: ( 'retrieve' )
            // InternalBilang.g:30:9: 'retrieve'
            {
            match("retrieve"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:31:7: ( 'document' )
            // InternalBilang.g:31:9: 'document'
            {
            match("document"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:32:7: ( 'full' )
            // InternalBilang.g:32:9: 'full'
            {
            match("full"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:33:7: ( 'address' )
            // InternalBilang.g:33:9: 'address'
            {
            match("address"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:34:7: ( 'of' )
            // InternalBilang.g:34:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:35:7: ( 'persons' )
            // InternalBilang.g:35:9: 'persons'
            {
            match("persons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:36:7: ( 'search' )
            // InternalBilang.g:36:9: 'search'
            {
            match("search"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:37:7: ( 'phone' )
            // InternalBilang.g:37:9: 'phone'
            {
            match("phone"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:38:7: ( 'call' )
            // InternalBilang.g:38:9: 'call'
            {
            match("call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:39:7: ( 'add' )
            // InternalBilang.g:39:9: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:40:7: ( 'delete' )
            // InternalBilang.g:40:9: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:41:7: ( 'person' )
            // InternalBilang.g:41:9: 'person'
            {
            match("person"); 


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
            // InternalBilang.g:42:7: ( 'alias' )
            // InternalBilang.g:42:9: 'alias'
            {
            match("alias"); 


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
            // InternalBilang.g:43:7: ( 'first' )
            // InternalBilang.g:43:9: 'first'
            {
            match("first"); 


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
            // InternalBilang.g:44:7: ( 'last' )
            // InternalBilang.g:44:9: 'last'
            {
            match("last"); 


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
            // InternalBilang.g:45:7: ( 'number' )
            // InternalBilang.g:45:9: 'number'
            {
            match("number"); 


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
            // InternalBilang.g:46:7: ( 'zip' )
            // InternalBilang.g:46:9: 'zip'
            {
            match("zip"); 


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
            // InternalBilang.g:47:7: ( 'code' )
            // InternalBilang.g:47:9: 'code'
            {
            match("code"); 


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
            // InternalBilang.g:48:7: ( 'house' )
            // InternalBilang.g:48:9: 'house'
            {
            match("house"); 


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
            // InternalBilang.g:49:7: ( 'message' )
            // InternalBilang.g:49:9: 'message'
            {
            match("message"); 


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
            // InternalBilang.g:50:7: ( 'invoice' )
            // InternalBilang.g:50:9: 'invoice'
            {
            match("invoice"); 


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
            // InternalBilang.g:51:7: ( 'information' )
            // InternalBilang.g:51:9: 'information'
            {
            match("information"); 


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
            // InternalBilang.g:52:7: ( 'about' )
            // InternalBilang.g:52:9: 'about'
            {
            match("about"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "RULE_EMAIL_ADDRESS"
    public final void mRULE_EMAIL_ADDRESS() throws RecognitionException {
        try {
            int _type = RULE_EMAIL_ADDRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:4358:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' )+ '@' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+ )
            // InternalBilang.g:4358:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' )+ '@' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+
            {
            // InternalBilang.g:4358:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='-' && LA1_0<='.')||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBilang.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('@'); 
            // InternalBilang.g:4358:68: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='-' && LA2_0<='.')||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBilang.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EMAIL_ADDRESS"

    // $ANTLR start "RULE_PHONE_NUMBER"
    public final void mRULE_PHONE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_PHONE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:4360:19: ( '+' ( '0' .. '9' )+ )
            // InternalBilang.g:4360:21: '+' ( '0' .. '9' )+
            {
            match('+'); 
            // InternalBilang.g:4360:25: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBilang.g:4360:26: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PHONE_NUMBER"

    // $ANTLR start "RULE_HOUSENUMBER"
    public final void mRULE_HOUSENUMBER() throws RecognitionException {
        try {
            int _type = RULE_HOUSENUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:4362:18: ( ( '0' .. '9' )+ ( 'a' .. 'z' | 'A' .. 'Z' )? )
            // InternalBilang.g:4362:20: ( '0' .. '9' )+ ( 'a' .. 'z' | 'A' .. 'Z' )?
            {
            // InternalBilang.g:4362:20: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBilang.g:4362:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalBilang.g:4362:32: ( 'a' .. 'z' | 'A' .. 'Z' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBilang.g:
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_HOUSENUMBER"

    // $ANTLR start "RULE_DUTCH_POSTCODE"
    public final void mRULE_DUTCH_POSTCODE() throws RecognitionException {
        try {
            int _type = RULE_DUTCH_POSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:4364:21: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( ' ' )? 'A' .. 'Z' 'A' .. 'Z' )
            // InternalBilang.g:4364:23: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( ' ' )? 'A' .. 'Z' 'A' .. 'Z'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            // InternalBilang.g:4364:59: ( ' ' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==' ') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBilang.g:4364:59: ' '
                    {
                    match(' '); 

                    }
                    break;

            }

            matchRange('A','Z'); 
            matchRange('A','Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DUTCH_POSTCODE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:4366:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBilang.g:4366:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBilang.g:4366:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBilang.g:4366:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBilang.g:4366:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBilang.g:
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
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:4368:10: ( ( '0' .. '9' )+ )
            // InternalBilang.g:4368:12: ( '0' .. '9' )+
            {
            // InternalBilang.g:4368:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBilang.g:4368:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:4370:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBilang.g:4370:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBilang.g:4370:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBilang.g:4370:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBilang.g:4370:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalBilang.g:4370:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBilang.g:4370:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalBilang.g:4370:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBilang.g:4370:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBilang.g:4370:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBilang.g:4370:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:4372:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBilang.g:4372:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBilang.g:4372:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBilang.g:4372:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:4374:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBilang.g:4374:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBilang.g:4374:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBilang.g:4374:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // InternalBilang.g:4374:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBilang.g:4374:41: ( '\\r' )? '\\n'
                    {
                    // InternalBilang.g:4374:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalBilang.g:4374:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:4376:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBilang.g:4376:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBilang.g:4376:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBilang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:4378:16: ( . )
            // InternalBilang.g:4378:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalBilang.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_EMAIL_ADDRESS | RULE_PHONE_NUMBER | RULE_HOUSENUMBER | RULE_DUTCH_POSTCODE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=53;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalBilang.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalBilang.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalBilang.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalBilang.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalBilang.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalBilang.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalBilang.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalBilang.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalBilang.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalBilang.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalBilang.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalBilang.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalBilang.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalBilang.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalBilang.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalBilang.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalBilang.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalBilang.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalBilang.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalBilang.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalBilang.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalBilang.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalBilang.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalBilang.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalBilang.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalBilang.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalBilang.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalBilang.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalBilang.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalBilang.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalBilang.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalBilang.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalBilang.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalBilang.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalBilang.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalBilang.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalBilang.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalBilang.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalBilang.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalBilang.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalBilang.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalBilang.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalBilang.g:1:262: RULE_EMAIL_ADDRESS
                {
                mRULE_EMAIL_ADDRESS(); 

                }
                break;
            case 44 :
                // InternalBilang.g:1:281: RULE_PHONE_NUMBER
                {
                mRULE_PHONE_NUMBER(); 

                }
                break;
            case 45 :
                // InternalBilang.g:1:299: RULE_HOUSENUMBER
                {
                mRULE_HOUSENUMBER(); 

                }
                break;
            case 46 :
                // InternalBilang.g:1:316: RULE_DUTCH_POSTCODE
                {
                mRULE_DUTCH_POSTCODE(); 

                }
                break;
            case 47 :
                // InternalBilang.g:1:336: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // InternalBilang.g:1:344: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // InternalBilang.g:1:353: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // InternalBilang.g:1:365: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 51 :
                // InternalBilang.g:1:381: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 52 :
                // InternalBilang.g:1:397: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 53 :
                // InternalBilang.g:1:405: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\4\41\1\55\15\41\1\102\1\34\1\41\5\34\2\uffff\1\41\1\112\1\uffff\1\41\1\uffff\10\41\1\130\2\41\1\uffff\16\41\1\152\4\41\1\102\1\uffff\1\102\5\uffff\1\41\1\uffff\14\41\1\176\1\uffff\1\u0080\7\41\1\u0088\10\41\1\uffff\1\41\1\u0092\3\41\1\102\1\u0097\10\41\1\u00a0\1\u00a1\2\41\1\uffff\1\41\1\uffff\1\41\1\u00a6\1\u00a7\2\41\1\u00aa\1\41\1\uffff\1\41\1\u00ad\4\41\1\u00b2\1\41\1\u00b4\1\uffff\3\41\1\102\1\uffff\1\u00bb\1\u00bc\3\41\1\u00c0\2\41\2\uffff\1\41\1\u00c4\1\41\1\u00c6\2\uffff\1\41\1\u00c8\1\uffff\1\41\1\u00ca\1\uffff\4\41\1\uffff\1\u00cf\1\uffff\1\u00d0\2\41\1\uffff\2\102\2\uffff\2\41\1\u00d7\1\uffff\3\41\1\uffff\1\41\1\uffff\1\u00dc\1\uffff\1\u00dd\1\uffff\3\41\1\u00e1\2\uffff\2\41\1\u00b8\1\u00e4\1\41\1\u00e6\1\uffff\1\41\1\u00e8\1\41\1\u00ea\2\uffff\1\u00eb\2\41\1\uffff\1\u00ee\1\41\1\uffff\1\41\1\uffff\1\u00f1\1\uffff\1\u00f2\2\uffff\1\u00f3\1\u00f4\1\uffff\1\41\1\u00f6\4\uffff\1\41\1\uffff\1\41\1\u00f9\1\uffff";
    static final String DFA18_eofS =
        "\u00fa\uffff";
    static final String DFA18_minS =
        "\1\0\23\55\1\60\1\55\1\101\1\55\2\0\1\52\2\uffff\2\55\1\uffff\1\55\1\uffff\13\55\1\uffff\24\55\1\uffff\1\55\5\uffff\1\55\1\uffff\15\55\1\uffff\21\55\1\uffff\23\55\1\uffff\1\55\1\uffff\7\55\1\uffff\11\55\1\uffff\3\55\1\40\1\uffff\10\55\2\uffff\4\55\2\uffff\2\55\1\uffff\2\55\1\uffff\4\55\1\uffff\1\55\1\uffff\3\55\1\uffff\2\55\2\uffff\3\55\1\uffff\3\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\1\uffff\4\55\2\uffff\6\55\1\uffff\4\55\2\uffff\3\55\1\uffff\2\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\2\uffff\2\55\1\uffff\2\55\4\uffff\1\55\1\uffff\2\55\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\23\172\1\71\3\172\2\uffff\1\57\2\uffff\2\172\1\uffff\1\172\1\uffff\13\172\1\uffff\24\172\1\uffff\1\172\5\uffff\1\172\1\uffff\15\172\1\uffff\21\172\1\uffff\23\172\1\uffff\1\172\1\uffff\7\172\1\uffff\11\172\1\uffff\4\172\1\uffff\10\172\2\uffff\4\172\2\uffff\2\172\1\uffff\2\172\1\uffff\4\172\1\uffff\1\172\1\uffff\3\172\1\uffff\2\172\2\uffff\3\172\1\uffff\3\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\4\172\2\uffff\6\172\1\uffff\4\172\2\uffff\3\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\2\uffff\2\172\1\uffff\2\172\4\uffff\1\172\1\uffff\2\172\1\uffff";
    static final String DFA18_acceptS =
        "\33\uffff\1\64\1\65\2\uffff\1\53\1\uffff\1\57\13\uffff\1\21\24\uffff\1\55\1\uffff\1\54\1\61\1\62\1\63\1\64\1\uffff\1\16\15\uffff\1\14\21\uffff\1\30\23\uffff\1\10\1\uffff\1\35\7\uffff\1\20\11\uffff\1\44\4\uffff\1\1\10\uffff\1\45\1\34\4\uffff\1\6\1\7\2\uffff\1\13\2\uffff\1\23\4\uffff\1\26\1\uffff\1\42\3\uffff\1\56\2\uffff\1\2\1\15\3\uffff\1\33\3\uffff\1\52\1\uffff\1\40\1\uffff\1\12\1\uffff\1\22\4\uffff\1\41\1\46\6\uffff\1\37\4\uffff\1\43\1\32\3\uffff\1\36\2\uffff\1\3\1\uffff\1\31\1\uffff\1\17\1\uffff\1\27\1\47\2\uffff\1\50\2\uffff\1\4\1\5\1\24\1\25\1\uffff\1\11\2\uffff\1\51";
    static final String DFA18_specialS =
        "\1\1\27\uffff\1\0\1\2\u00e0\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\3\34\1\24\1\34\2\27\1\32\12\23\7\34\32\25\3\34\1\26\1\25\1\34\1\5\1\25\1\4\1\14\1\2\1\15\1\25\1\21\1\22\2\25\1\17\1\12\1\7\1\16\1\3\1\25\1\13\1\11\1\1\1\25\1\10\1\6\2\25\1\20\uff85\34",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\35\15\40\1\36\13\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\14\40\1\42\15\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\44\3\40\1\45\2\40\1\46\11\40\1\43\10\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\50\15\40\1\47\13\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\40\1\51\1\40\1\53\7\40\1\54\1\40\1\52\14\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\10\40\1\56\21\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\57\23\40\1\60\5\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\61\31\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\62\7\40\1\63\1\64\14\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\65\3\40\1\66\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\67\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\71\11\40\1\70\13\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\10\40\1\73\13\40\1\72\5\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\5\40\1\74\24\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\75\31\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\10\40\1\76\21\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\16\40\1\77\13\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\15\40\1\100\14\40",
            "\2\37\1\uffff\12\101\6\uffff\1\37\32\103\4\uffff\1\37\1\uffff\32\103",
            "\12\104",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\37\1\uffff\12\37\6\uffff\33\37\4\uffff\1\37\1\uffff\32\37",
            "\0\105",
            "\0\105",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\111\7\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\114\16\40\1\113\12\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\16\40\1\115\13\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\21\40\1\116\10\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\21\40\1\117\10\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\16\40\1\120\13\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\3\40\1\123\10\40\1\121\1\122\14\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\13\40\1\124\16\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\16\40\1\126\3\40\1\125\7\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\3\40\1\127\26\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\3\40\1\131\26\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\10\40\1\132\21\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\133\6\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\14\40\1\134\15\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\14\40\1\135\15\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\13\40\1\136\16\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\140\14\40\1\137\14\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\141\7\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\142\31\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\10\40\1\143\21\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\144\7\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\145\6\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\2\40\1\146\27\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\13\40\1\147\16\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\13\40\1\150\16\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\21\40\1\151\10\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\153\7\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\17\40\1\154\12\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\24\40\1\155\5\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\5\40\1\157\17\40\1\156\4\40",
            "\2\37\1\uffff\12\160\6\uffff\1\37\32\103\4\uffff\1\37\1\uffff\32\103",
            "",
            "\2\37\1\uffff\12\37\6\uffff\33\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\12\40\1\161\17\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\162\6\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\10\40\1\163\21\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\2\40\1\164\27\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\165\31\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\166\7\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\15\40\1\167\14\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\17\40\1\170\12\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\171\6\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\172\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\13\40\1\173\16\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\174\6\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\24\40\1\175\5\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\21\40\1\177\10\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\u0081\31\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\7\40\1\u0082\22\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u0083\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\40\1\u0084\30\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\24\40\1\u0085\5\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\3\40\1\u0086\26\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\21\40\1\u0087\10\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\10\40\1\u0089\21\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\13\40\1\u008a\16\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\u008b\7\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\21\40\1\u008c\10\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\24\40\1\u008d\5\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u008e\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\13\40\1\u008f\16\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\u0090\7\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\u0091\6\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\u0093\7\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\16\40\1\u0094\13\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\16\40\1\u0095\13\40",
            "\2\37\1\uffff\12\u0096\6\uffff\1\37\32\103\4\uffff\1\37\1\uffff\32\103",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\30\40\1\u0098\1\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\13\40\1\u0099\16\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u009a\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\14\40\1\u009b\15\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\16\40\1\u009c\13\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u009d\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\16\40\1\u009e\13\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u009f\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\21\40\1\u00a2\10\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\u00a3\6\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u00a4\25\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\u00a5\7\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u00a8\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u00a9\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\2\40\1\u00ab\27\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\13\40\1\u00ac\16\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\u00ae\31\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\10\40\1\u00af\21\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\14\40\1\u00b0\15\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\u00b1\6\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\u00b3\6\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u00b5\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\10\40\1\u00b6\21\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\21\40\1\u00b7\10\40",
            "\1\u00b8\14\uffff\2\37\1\uffff\12\u00ba\6\uffff\1\37\32\u00b9\4\uffff\1\37\1\uffff\32\103",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\u00bd\7\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u00be\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\15\40\1\u00bf\14\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\24\40\1\u00c1\5\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\15\40\1\u00c2\14\40",
            "",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\u00c3\31\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\u00c5\7\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\21\40\1\u00c7\10\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\7\40\1\u00c9\22\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\6\40\1\u00cb\23\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u00cc\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u00cd\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u00ce\25\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\2\40\1\u00d1\27\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\14\40\1\u00d2\15\40",
            "",
            "\2\37\1\uffff\12\37\6\uffff\1\37\32\u00d3\4\uffff\1\37\1\uffff\32\37",
            "\2\37\1\uffff\12\u00ba\6\uffff\1\37\32\103\4\uffff\1\37\1\uffff\32\103",
            "",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\u00d4\7\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\u00d5\6\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\u00d6\7\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\15\40\1\u00d8\14\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\u00d9\6\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\2\40\1\u00da\27\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\22\40\1\u00db\7\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u00de\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\25\40\1\u00df\4\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\15\40\1\u00e0\14\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u00e2\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\1\u00e3\31\40",
            "\2\37\1\uffff\12\37\6\uffff\33\37\4\uffff\1\37\1\uffff\32\37",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u00e5\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\3\40\1\u00e7\26\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\u00e9\6\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\4\40\1\u00ec\25\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\u00ed\6\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\23\40\1\u00ef\6\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\21\40\1\u00f0\10\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\10\40\1\u00f5\21\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\16\40\1\u00f7\13\40",
            "",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\15\40\1\u00f8\14\40",
            "\2\37\1\uffff\12\40\6\uffff\1\37\32\40\4\uffff\1\40\1\uffff\32\40",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_EMAIL_ADDRESS | RULE_PHONE_NUMBER | RULE_HOUSENUMBER | RULE_DUTCH_POSTCODE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_24 = input.LA(1);

                        s = -1;
                        if ( ((LA18_24>='\u0000' && LA18_24<='\uFFFF')) ) {s = 69;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='t') ) {s = 1;}

                        else if ( (LA18_0=='e') ) {s = 2;}

                        else if ( (LA18_0=='p') ) {s = 3;}

                        else if ( (LA18_0=='c') ) {s = 4;}

                        else if ( (LA18_0=='a') ) {s = 5;}

                        else if ( (LA18_0=='w') ) {s = 6;}

                        else if ( (LA18_0=='n') ) {s = 7;}

                        else if ( (LA18_0=='v') ) {s = 8;}

                        else if ( (LA18_0=='s') ) {s = 9;}

                        else if ( (LA18_0=='m') ) {s = 10;}

                        else if ( (LA18_0=='r') ) {s = 11;}

                        else if ( (LA18_0=='d') ) {s = 12;}

                        else if ( (LA18_0=='f') ) {s = 13;}

                        else if ( (LA18_0=='o') ) {s = 14;}

                        else if ( (LA18_0=='l') ) {s = 15;}

                        else if ( (LA18_0=='z') ) {s = 16;}

                        else if ( (LA18_0=='h') ) {s = 17;}

                        else if ( (LA18_0=='i') ) {s = 18;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 19;}

                        else if ( (LA18_0=='+') ) {s = 20;}

                        else if ( ((LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='b'||LA18_0=='g'||(LA18_0>='j' && LA18_0<='k')||LA18_0=='q'||LA18_0=='u'||(LA18_0>='x' && LA18_0<='y')) ) {s = 21;}

                        else if ( (LA18_0=='^') ) {s = 22;}

                        else if ( ((LA18_0>='-' && LA18_0<='.')) ) {s = 23;}

                        else if ( (LA18_0=='\"') ) {s = 24;}

                        else if ( (LA18_0=='\'') ) {s = 25;}

                        else if ( (LA18_0=='/') ) {s = 26;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 27;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='*')||LA18_0==','||(LA18_0>=':' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_25 = input.LA(1);

                        s = -1;
                        if ( ((LA18_25>='\u0000' && LA18_25<='\uFFFF')) ) {s = 69;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}