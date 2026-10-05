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
    public static final int RULE_DUTCH_POSTCODE=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=10;
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
    public static final int RULE_HOUSENUMBER=8;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_EMAIL_ADDRESS=5;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_PHONE_NUMBER=6;
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
            // InternalBilang.g:11:7: ( 'compound' )
            // InternalBilang.g:11:9: 'compound'
            {
            match("compound"); 


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
            // InternalBilang.g:12:7: ( 'process' )
            // InternalBilang.g:12:9: 'process'
            {
            match("process"); 


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
            // InternalBilang.g:13:7: ( 'task' )
            // InternalBilang.g:13:9: 'task'
            {
            match("task"); 


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
            // InternalBilang.g:14:7: ( 'abstract' )
            // InternalBilang.g:14:9: 'abstract'
            {
            match("abstract"); 


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
            // InternalBilang.g:15:7: ( 'with' )
            // InternalBilang.g:15:9: 'with'
            {
            match("with"); 


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
            // InternalBilang.g:16:7: ( 'name' )
            // InternalBilang.g:16:9: 'name'
            {
            match("name"); 


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
            // InternalBilang.g:17:7: ( 'and' )
            // InternalBilang.g:17:9: 'and'
            {
            match("and"); 


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
            // InternalBilang.g:18:7: ( 'parameter' )
            // InternalBilang.g:18:9: 'parameter'
            {
            match("parameter"); 


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
            // InternalBilang.g:19:7: ( 'value' )
            // InternalBilang.g:19:9: 'value'
            {
            match("value"); 


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
            // InternalBilang.g:20:7: ( 'send' )
            // InternalBilang.g:20:9: 'send'
            {
            match("send"); 


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
            // InternalBilang.g:21:7: ( 'an' )
            // InternalBilang.g:21:9: 'an'
            {
            match("an"); 


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
            // InternalBilang.g:22:7: ( 'email' )
            // InternalBilang.g:22:9: 'email'
            {
            match("email"); 


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
            // InternalBilang.g:23:7: ( 'to' )
            // InternalBilang.g:23:9: 'to'
            {
            match("to"); 


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
            // InternalBilang.g:24:7: ( 'content' )
            // InternalBilang.g:24:9: 'content'
            {
            match("content"); 


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
            // InternalBilang.g:25:7: ( 'sms' )
            // InternalBilang.g:25:9: 'sms'
            {
            match("sms"); 


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
            // InternalBilang.g:26:7: ( 'a' )
            // InternalBilang.g:26:9: 'a'
            {
            match('a'); 

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
            // InternalBilang.g:27:7: ( 'snail' )
            // InternalBilang.g:27:9: 'snail'
            {
            match("snail"); 


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
            // InternalBilang.g:28:7: ( 'mail' )
            // InternalBilang.g:28:9: 'mail'
            {
            match("mail"); 


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
            // InternalBilang.g:29:7: ( 'retrieve' )
            // InternalBilang.g:29:9: 'retrieve'
            {
            match("retrieve"); 


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
            // InternalBilang.g:30:7: ( 'document' )
            // InternalBilang.g:30:9: 'document'
            {
            match("document"); 


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
            // InternalBilang.g:31:7: ( 'full' )
            // InternalBilang.g:31:9: 'full'
            {
            match("full"); 


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
            // InternalBilang.g:32:7: ( 'address' )
            // InternalBilang.g:32:9: 'address'
            {
            match("address"); 


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
            // InternalBilang.g:33:7: ( 'of' )
            // InternalBilang.g:33:9: 'of'
            {
            match("of"); 


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
            // InternalBilang.g:34:7: ( 'persons' )
            // InternalBilang.g:34:9: 'persons'
            {
            match("persons"); 


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
            // InternalBilang.g:35:7: ( 'search' )
            // InternalBilang.g:35:9: 'search'
            {
            match("search"); 


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
            // InternalBilang.g:36:7: ( 'phone' )
            // InternalBilang.g:36:9: 'phone'
            {
            match("phone"); 


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
            // InternalBilang.g:37:7: ( 'call' )
            // InternalBilang.g:37:9: 'call'
            {
            match("call"); 


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
            // InternalBilang.g:38:7: ( 'add' )
            // InternalBilang.g:38:9: 'add'
            {
            match("add"); 


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
            // InternalBilang.g:39:7: ( 'delete' )
            // InternalBilang.g:39:9: 'delete'
            {
            match("delete"); 


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
            // InternalBilang.g:40:7: ( 'person' )
            // InternalBilang.g:40:9: 'person'
            {
            match("person"); 


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
            // InternalBilang.g:41:7: ( 'alias' )
            // InternalBilang.g:41:9: 'alias'
            {
            match("alias"); 


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
            // InternalBilang.g:42:7: ( 'first' )
            // InternalBilang.g:42:9: 'first'
            {
            match("first"); 


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
            // InternalBilang.g:43:7: ( 'last' )
            // InternalBilang.g:43:9: 'last'
            {
            match("last"); 


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
            // InternalBilang.g:44:7: ( 'number' )
            // InternalBilang.g:44:9: 'number'
            {
            match("number"); 


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
            // InternalBilang.g:45:7: ( 'zip' )
            // InternalBilang.g:45:9: 'zip'
            {
            match("zip"); 


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
            // InternalBilang.g:46:7: ( 'code' )
            // InternalBilang.g:46:9: 'code'
            {
            match("code"); 


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
            // InternalBilang.g:47:7: ( 'house' )
            // InternalBilang.g:47:9: 'house'
            {
            match("house"); 


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
            // InternalBilang.g:48:7: ( 'message' )
            // InternalBilang.g:48:9: 'message'
            {
            match("message"); 


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
            // InternalBilang.g:49:7: ( 'invoice' )
            // InternalBilang.g:49:9: 'invoice'
            {
            match("invoice"); 


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
            // InternalBilang.g:50:7: ( 'information' )
            // InternalBilang.g:50:9: 'information'
            {
            match("information"); 


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
            // InternalBilang.g:51:7: ( 'about' )
            // InternalBilang.g:51:9: 'about'
            {
            match("about"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "RULE_EMAIL_ADDRESS"
    public final void mRULE_EMAIL_ADDRESS() throws RecognitionException {
        try {
            int _type = RULE_EMAIL_ADDRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:4354:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' )+ '@' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+ )
            // InternalBilang.g:4354:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' )+ '@' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+
            {
            // InternalBilang.g:4354:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' )+
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
            // InternalBilang.g:4354:68: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+
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
            // InternalBilang.g:4356:19: ( '+' ( '0' .. '9' )+ )
            // InternalBilang.g:4356:21: '+' ( '0' .. '9' )+
            {
            match('+'); 
            // InternalBilang.g:4356:25: ( '0' .. '9' )+
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
            	    // InternalBilang.g:4356:26: '0' .. '9'
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
            // InternalBilang.g:4358:18: ( ( '0' .. '9' )+ ( 'a' .. 'z' | 'A' .. 'Z' )? )
            // InternalBilang.g:4358:20: ( '0' .. '9' )+ ( 'a' .. 'z' | 'A' .. 'Z' )?
            {
            // InternalBilang.g:4358:20: ( '0' .. '9' )+
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
            	    // InternalBilang.g:4358:21: '0' .. '9'
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

            // InternalBilang.g:4358:32: ( 'a' .. 'z' | 'A' .. 'Z' )?
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
            // InternalBilang.g:4360:21: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( ' ' )? 'A' .. 'Z' 'A' .. 'Z' )
            // InternalBilang.g:4360:23: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( ' ' )? 'A' .. 'Z' 'A' .. 'Z'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            // InternalBilang.g:4360:59: ( ' ' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==' ') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBilang.g:4360:59: ' '
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
            // InternalBilang.g:4362:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBilang.g:4362:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBilang.g:4362:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBilang.g:4362:11: '^'
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

            // InternalBilang.g:4362:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalBilang.g:4364:10: ( ( '0' .. '9' )+ )
            // InternalBilang.g:4364:12: ( '0' .. '9' )+
            {
            // InternalBilang.g:4364:12: ( '0' .. '9' )+
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
            	    // InternalBilang.g:4364:13: '0' .. '9'
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
            // InternalBilang.g:4366:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBilang.g:4366:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBilang.g:4366:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalBilang.g:4366:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBilang.g:4366:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalBilang.g:4366:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBilang.g:4366:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalBilang.g:4366:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBilang.g:4366:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalBilang.g:4366:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBilang.g:4366:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalBilang.g:4368:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBilang.g:4368:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBilang.g:4368:24: ( options {greedy=false; } : . )*
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
            	    // InternalBilang.g:4368:52: .
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
            // InternalBilang.g:4370:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBilang.g:4370:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBilang.g:4370:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBilang.g:4370:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalBilang.g:4370:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBilang.g:4370:41: ( '\\r' )? '\\n'
                    {
                    // InternalBilang.g:4370:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalBilang.g:4370:41: '\\r'
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
            // InternalBilang.g:4372:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBilang.g:4372:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBilang.g:4372:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalBilang.g:4374:16: ( . )
            // InternalBilang.g:4374:18: .
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
        // InternalBilang.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_EMAIL_ADDRESS | RULE_PHONE_NUMBER | RULE_HOUSENUMBER | RULE_DUTCH_POSTCODE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=52;
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
                // InternalBilang.g:1:256: RULE_EMAIL_ADDRESS
                {
                mRULE_EMAIL_ADDRESS(); 

                }
                break;
            case 43 :
                // InternalBilang.g:1:275: RULE_PHONE_NUMBER
                {
                mRULE_PHONE_NUMBER(); 

                }
                break;
            case 44 :
                // InternalBilang.g:1:293: RULE_HOUSENUMBER
                {
                mRULE_HOUSENUMBER(); 

                }
                break;
            case 45 :
                // InternalBilang.g:1:310: RULE_DUTCH_POSTCODE
                {
                mRULE_DUTCH_POSTCODE(); 

                }
                break;
            case 46 :
                // InternalBilang.g:1:330: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 47 :
                // InternalBilang.g:1:338: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 48 :
                // InternalBilang.g:1:347: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 49 :
                // InternalBilang.g:1:359: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // InternalBilang.g:1:375: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 51 :
                // InternalBilang.g:1:391: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 52 :
                // InternalBilang.g:1:399: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\3\40\1\54\16\40\1\103\1\34\1\40\5\34\2\uffff\3\40\2\uffff\5\40\1\122\1\40\1\126\2\40\1\uffff\17\40\1\151\4\40\2\103\6\uffff\11\40\1\uffff\2\40\1\173\1\uffff\1\175\7\40\1\u0085\11\40\1\uffff\1\40\1\u0090\3\40\1\103\2\40\1\u0097\1\u0098\4\40\1\u009d\2\40\1\uffff\1\40\1\uffff\1\40\1\u00a2\1\u00a3\2\40\1\u00a6\1\40\1\uffff\2\40\1\u00aa\4\40\1\u00af\1\40\1\u00b1\1\uffff\3\40\1\103\2\40\2\uffff\3\40\1\u00bd\1\uffff\1\40\1\u00bf\1\40\1\u00c1\2\uffff\1\40\1\u00c3\1\uffff\1\40\1\u00c5\1\u00c6\1\uffff\4\40\1\uffff\1\u00cb\1\uffff\1\u00cc\2\40\2\103\1\uffff\4\40\1\u00d5\1\uffff\1\40\1\uffff\1\40\1\uffff\1\u00d8\1\uffff\1\u00d9\2\uffff\3\40\1\u00dd\2\uffff\2\40\1\u00b7\1\40\1\u00e1\1\u00e2\1\40\1\u00e4\1\uffff\1\40\1\u00e6\2\uffff\1\u00e7\2\40\1\uffff\1\u00ea\1\40\1\u00ec\2\uffff\1\40\1\uffff\1\u00ee\2\uffff\1\u00ef\1\u00f0\1\uffff\1\40\1\uffff\1\u00f2\3\uffff\1\40\1\uffff\1\40\1\u00f5\1\uffff";
    static final String DFA18_eofS =
        "\u00f6\uffff";
    static final String DFA18_minS =
        "\1\0\23\55\1\60\1\55\1\101\1\55\2\0\1\52\2\uffff\3\55\2\uffff\12\55\1\uffff\26\55\6\uffff\11\55\1\uffff\3\55\1\uffff\22\55\1\uffff\21\55\1\uffff\1\55\1\uffff\7\55\1\uffff\12\55\1\uffff\3\55\1\40\2\55\2\uffff\4\55\1\uffff\4\55\2\uffff\2\55\1\uffff\3\55\1\uffff\4\55\1\uffff\1\55\1\uffff\5\55\1\uffff\5\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\2\uffff\4\55\2\uffff\10\55\1\uffff\2\55\2\uffff\3\55\1\uffff\3\55\2\uffff\1\55\1\uffff\1\55\2\uffff\2\55\1\uffff\1\55\1\uffff\1\55\3\uffff\1\55\1\uffff\2\55\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\23\172\1\71\3\172\2\uffff\1\57\2\uffff\3\172\2\uffff\12\172\1\uffff\26\172\6\uffff\11\172\1\uffff\3\172\1\uffff\22\172\1\uffff\21\172\1\uffff\1\172\1\uffff\7\172\1\uffff\12\172\1\uffff\6\172\2\uffff\4\172\1\uffff\4\172\2\uffff\2\172\1\uffff\3\172\1\uffff\4\172\1\uffff\1\172\1\uffff\5\172\1\uffff\5\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\2\uffff\4\172\2\uffff\10\172\1\uffff\2\172\2\uffff\3\172\1\uffff\3\172\2\uffff\1\172\1\uffff\1\172\2\uffff\2\172\1\uffff\1\172\1\uffff\1\172\3\uffff\1\172\1\uffff\2\172\1\uffff";
    static final String DFA18_acceptS =
        "\33\uffff\1\63\1\64\3\uffff\1\56\1\52\12\uffff\1\20\26\uffff\1\54\1\53\1\60\1\61\1\62\1\63\11\uffff\1\15\3\uffff\1\13\22\uffff\1\27\21\uffff\1\7\1\uffff\1\34\7\uffff\1\17\12\uffff\1\43\6\uffff\1\44\1\33\4\uffff\1\3\4\uffff\1\5\1\6\2\uffff\1\12\3\uffff\1\22\4\uffff\1\25\1\uffff\1\41\5\uffff\1\55\5\uffff\1\32\1\uffff\1\51\1\uffff\1\37\1\uffff\1\11\1\uffff\1\21\1\14\4\uffff\1\40\1\45\10\uffff\1\36\2\uffff\1\42\1\31\3\uffff\1\35\3\uffff\1\16\1\2\1\uffff\1\30\1\uffff\1\26\1\46\2\uffff\1\47\1\uffff\1\1\1\uffff\1\4\1\23\1\24\1\uffff\1\10\2\uffff\1\50";
    static final String DFA18_specialS =
        "\1\2\27\uffff\1\1\1\0\u00dc\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\3\34\1\24\1\34\2\27\1\32\12\23\7\34\32\25\3\34\1\26\1\25\1\34\1\4\1\25\1\1\1\14\1\11\1\15\1\25\1\21\1\22\2\25\1\17\1\12\1\6\1\16\1\2\1\25\1\13\1\10\1\3\1\25\1\7\1\5\2\25\1\20\uff85\34",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\36\15\37\1\35\13\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\43\3\37\1\44\2\37\1\45\11\37\1\42\10\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\46\15\37\1\47\13\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\37\1\50\1\37\1\52\7\37\1\53\1\37\1\51\14\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\10\37\1\55\21\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\56\23\37\1\57\5\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\60\31\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\61\7\37\1\62\1\63\14\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\14\37\1\64\15\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\65\3\37\1\66\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\67\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\71\11\37\1\70\13\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\10\37\1\73\13\37\1\72\5\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\5\37\1\74\24\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\75\31\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\10\37\1\76\21\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\16\37\1\77\13\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\15\37\1\100\14\37",
            "\2\41\1\uffff\12\101\6\uffff\1\41\32\102\4\uffff\1\41\1\uffff\32\102",
            "\12\104",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "\2\41\1\uffff\12\41\6\uffff\33\41\4\uffff\1\41\1\uffff\32\41",
            "\0\105",
            "\0\105",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\3\37\1\113\10\37\1\111\1\112\14\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\13\37\1\114\16\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\16\37\1\115\13\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\21\37\1\116\10\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\21\37\1\117\10\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\16\37\1\120\13\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\121\7\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\16\37\1\124\3\37\1\123\7\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\3\37\1\125\26\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\3\37\1\127\26\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\10\37\1\130\21\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\131\6\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\14\37\1\132\15\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\14\37\1\133\15\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\13\37\1\134\16\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\136\14\37\1\135\14\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\137\7\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\140\31\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\141\31\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\10\37\1\142\21\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\143\7\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\144\6\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\2\37\1\145\27\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\13\37\1\146\16\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\13\37\1\147\16\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\21\37\1\150\10\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\152\7\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\17\37\1\153\12\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\24\37\1\154\5\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\5\37\1\156\17\37\1\155\4\37",
            "\2\41\1\uffff\12\157\6\uffff\1\41\32\102\4\uffff\1\41\1\uffff\32\102",
            "\2\41\1\uffff\12\41\6\uffff\33\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\17\37\1\160\12\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\161\6\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\162\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\13\37\1\163\16\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\2\37\1\164\27\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\165\31\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\166\7\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\15\37\1\167\14\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\12\37\1\170\17\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\171\6\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\24\37\1\172\5\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\21\37\1\174\10\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\176\31\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\7\37\1\177\22\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u0080\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\37\1\u0081\30\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\24\37\1\u0082\5\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\3\37\1\u0083\26\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\21\37\1\u0084\10\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\10\37\1\u0086\21\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\10\37\1\u0087\21\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\13\37\1\u0088\16\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\u0089\7\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\21\37\1\u008a\10\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\24\37\1\u008b\5\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u008c\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\13\37\1\u008d\16\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\u008e\7\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\u008f\6\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\u0091\7\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\16\37\1\u0092\13\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\16\37\1\u0093\13\37",
            "\2\41\1\uffff\12\u0094\6\uffff\1\41\32\102\4\uffff\1\41\1\uffff\32\102",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\16\37\1\u0095\13\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u0096\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u0099\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\14\37\1\u009a\15\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\16\37\1\u009b\13\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u009c\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\21\37\1\u009e\10\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\u009f\6\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u00a0\25\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\u00a1\7\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u00a4\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u00a5\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\2\37\1\u00a7\27\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\13\37\1\u00a8\16\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\13\37\1\u00a9\16\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\u00ab\31\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\10\37\1\u00ac\21\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\14\37\1\u00ad\15\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\u00ae\6\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\u00b0\6\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u00b2\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\10\37\1\u00b3\21\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\21\37\1\u00b4\10\37",
            "\1\u00b7\14\uffff\2\41\1\uffff\12\u00b6\6\uffff\1\41\32\u00b5\4\uffff\1\41\1\uffff\32\102",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\24\37\1\u00b8\5\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\15\37\1\u00b9\14\37",
            "",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\u00ba\7\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u00bb\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\15\37\1\u00bc\14\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\u00be\31\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\u00c0\7\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\21\37\1\u00c2\10\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\7\37\1\u00c4\22\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\6\37\1\u00c7\23\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u00c8\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u00c9\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u00ca\25\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\2\37\1\u00cd\27\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\14\37\1\u00ce\15\37",
            "\2\41\1\uffff\12\41\6\uffff\1\41\32\u00cf\4\uffff\1\41\1\uffff\32\41",
            "\2\41\1\uffff\12\u00b6\6\uffff\1\41\32\102\4\uffff\1\41\1\uffff\32\102",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\15\37\1\u00d0\14\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\u00d1\6\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\u00d2\7\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\u00d3\6\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\u00d4\7\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\2\37\1\u00d6\27\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\22\37\1\u00d7\7\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u00da\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\25\37\1\u00db\4\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\15\37\1\u00dc\14\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u00de\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\1\u00df\31\37",
            "\2\41\1\uffff\12\41\6\uffff\33\41\4\uffff\1\41\1\uffff\32\41",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\3\37\1\u00e0\26\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u00e3\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\u00e5\6\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\4\37\1\u00e8\25\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\u00e9\6\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\23\37\1\u00eb\6\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\21\37\1\u00ed\10\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\10\37\1\u00f1\21\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\16\37\1\u00f3\13\37",
            "",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\15\37\1\u00f4\14\37",
            "\2\41\1\uffff\12\37\6\uffff\1\41\32\37\4\uffff\1\37\1\uffff\32\37",
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
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_EMAIL_ADDRESS | RULE_PHONE_NUMBER | RULE_HOUSENUMBER | RULE_DUTCH_POSTCODE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_25 = input.LA(1);

                        s = -1;
                        if ( ((LA18_25>='\u0000' && LA18_25<='\uFFFF')) ) {s = 69;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_24 = input.LA(1);

                        s = -1;
                        if ( ((LA18_24>='\u0000' && LA18_24<='\uFFFF')) ) {s = 69;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='c') ) {s = 1;}

                        else if ( (LA18_0=='p') ) {s = 2;}

                        else if ( (LA18_0=='t') ) {s = 3;}

                        else if ( (LA18_0=='a') ) {s = 4;}

                        else if ( (LA18_0=='w') ) {s = 5;}

                        else if ( (LA18_0=='n') ) {s = 6;}

                        else if ( (LA18_0=='v') ) {s = 7;}

                        else if ( (LA18_0=='s') ) {s = 8;}

                        else if ( (LA18_0=='e') ) {s = 9;}

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
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}