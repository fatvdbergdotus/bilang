package org.xtext.example.bilang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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
    public static final int T__14=14;
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
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=11;
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
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_EMAIL_ADDRESS=5;
    public static final int RULE_ANY_OTHER=13;
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

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:30:7: ( 'full' )
            // InternalBilang.g:30:9: 'full'
            {
            match("full"); 


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
            // InternalBilang.g:31:7: ( 'address' )
            // InternalBilang.g:31:9: 'address'
            {
            match("address"); 


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
            // InternalBilang.g:32:7: ( 'of' )
            // InternalBilang.g:32:9: 'of'
            {
            match("of"); 


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
            // InternalBilang.g:33:7: ( 'persons' )
            // InternalBilang.g:33:9: 'persons'
            {
            match("persons"); 


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
            // InternalBilang.g:34:7: ( 'search' )
            // InternalBilang.g:34:9: 'search'
            {
            match("search"); 


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
            // InternalBilang.g:35:7: ( 'phone' )
            // InternalBilang.g:35:9: 'phone'
            {
            match("phone"); 


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
            // InternalBilang.g:36:7: ( 'call' )
            // InternalBilang.g:36:9: 'call'
            {
            match("call"); 


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
            // InternalBilang.g:37:7: ( 'add' )
            // InternalBilang.g:37:9: 'add'
            {
            match("add"); 


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
            // InternalBilang.g:38:7: ( 'delete' )
            // InternalBilang.g:38:9: 'delete'
            {
            match("delete"); 


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
            // InternalBilang.g:39:7: ( 'person' )
            // InternalBilang.g:39:9: 'person'
            {
            match("person"); 


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
            // InternalBilang.g:40:7: ( 'alias' )
            // InternalBilang.g:40:9: 'alias'
            {
            match("alias"); 


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
            // InternalBilang.g:41:7: ( 'first' )
            // InternalBilang.g:41:9: 'first'
            {
            match("first"); 


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
            // InternalBilang.g:42:7: ( 'last' )
            // InternalBilang.g:42:9: 'last'
            {
            match("last"); 


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
            // InternalBilang.g:43:7: ( 'number' )
            // InternalBilang.g:43:9: 'number'
            {
            match("number"); 


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
            // InternalBilang.g:44:7: ( 'zip' )
            // InternalBilang.g:44:9: 'zip'
            {
            match("zip"); 


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
            // InternalBilang.g:45:7: ( 'code' )
            // InternalBilang.g:45:9: 'code'
            {
            match("code"); 


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
            // InternalBilang.g:46:7: ( 'house' )
            // InternalBilang.g:46:9: 'house'
            {
            match("house"); 


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
            // InternalBilang.g:47:7: ( 'suffix' )
            // InternalBilang.g:47:9: 'suffix'
            {
            match("suffix"); 


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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:49:7: ( 'document' )
            // InternalBilang.g:49:9: 'document'
            {
            match("document"); 


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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:53:7: ( 'topic' )
            // InternalBilang.g:53:9: 'topic'
            {
            match("topic"); 


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
            // InternalBilang.g:1828:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' )+ '@' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+ )
            // InternalBilang.g:1828:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' )+ '@' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+
            {
            // InternalBilang.g:1828:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' )+
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
            // InternalBilang.g:1828:68: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+
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
            // InternalBilang.g:1830:19: ( '+' ( '0' .. '9' )+ )
            // InternalBilang.g:1830:21: '+' ( '0' .. '9' )+
            {
            match('+'); 
            // InternalBilang.g:1830:25: ( '0' .. '9' )+
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
            	    // InternalBilang.g:1830:26: '0' .. '9'
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

    // $ANTLR start "RULE_DUTCH_POSTCODE"
    public final void mRULE_DUTCH_POSTCODE() throws RecognitionException {
        try {
            int _type = RULE_DUTCH_POSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBilang.g:1832:21: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( ' ' )? 'A' .. 'Z' 'A' .. 'Z' )
            // InternalBilang.g:1832:23: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( ' ' )? 'A' .. 'Z' 'A' .. 'Z'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            // InternalBilang.g:1832:59: ( ' ' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==' ') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBilang.g:1832:59: ' '
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
            // InternalBilang.g:1834:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBilang.g:1834:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBilang.g:1834:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBilang.g:1834:11: '^'
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

            // InternalBilang.g:1834:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    break loop6;
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
            // InternalBilang.g:1836:10: ( ( '0' .. '9' )+ )
            // InternalBilang.g:1836:12: ( '0' .. '9' )+
            {
            // InternalBilang.g:1836:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBilang.g:1836:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalBilang.g:1838:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBilang.g:1838:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBilang.g:1838:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBilang.g:1838:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBilang.g:1838:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalBilang.g:1838:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBilang.g:1838:28: ~ ( ( '\\\\' | '\"' ) )
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

                    }
                    break;
                case 2 :
                    // InternalBilang.g:1838:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBilang.g:1838:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBilang.g:1838:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBilang.g:1838:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalBilang.g:1840:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBilang.g:1840:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBilang.g:1840:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBilang.g:1840:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalBilang.g:1842:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBilang.g:1842:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBilang.g:1842:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBilang.g:1842:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalBilang.g:1842:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBilang.g:1842:41: ( '\\r' )? '\\n'
                    {
                    // InternalBilang.g:1842:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalBilang.g:1842:41: '\\r'
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
            // InternalBilang.g:1844:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBilang.g:1844:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBilang.g:1844:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalBilang.g:1846:16: ( . )
            // InternalBilang.g:1846:18: .
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
        // InternalBilang.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_EMAIL_ADDRESS | RULE_PHONE_NUMBER | RULE_DUTCH_POSTCODE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=53;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalBilang.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalBilang.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalBilang.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalBilang.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalBilang.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalBilang.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalBilang.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalBilang.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalBilang.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalBilang.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalBilang.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalBilang.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalBilang.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalBilang.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalBilang.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalBilang.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalBilang.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalBilang.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalBilang.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalBilang.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalBilang.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalBilang.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalBilang.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalBilang.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalBilang.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalBilang.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalBilang.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalBilang.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalBilang.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalBilang.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalBilang.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalBilang.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalBilang.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalBilang.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalBilang.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalBilang.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalBilang.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalBilang.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalBilang.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalBilang.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalBilang.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalBilang.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalBilang.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalBilang.g:1:268: RULE_EMAIL_ADDRESS
                {
                mRULE_EMAIL_ADDRESS(); 

                }
                break;
            case 45 :
                // InternalBilang.g:1:287: RULE_PHONE_NUMBER
                {
                mRULE_PHONE_NUMBER(); 

                }
                break;
            case 46 :
                // InternalBilang.g:1:305: RULE_DUTCH_POSTCODE
                {
                mRULE_DUTCH_POSTCODE(); 

                }
                break;
            case 47 :
                // InternalBilang.g:1:325: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // InternalBilang.g:1:333: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // InternalBilang.g:1:342: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // InternalBilang.g:1:354: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 51 :
                // InternalBilang.g:1:370: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 52 :
                // InternalBilang.g:1:386: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 53 :
                // InternalBilang.g:1:394: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\4\37\1\55\15\37\1\103\1\34\1\37\5\34\2\uffff\1\37\1\113\2\uffff\11\37\1\130\2\37\1\uffff\15\37\1\151\6\37\1\103\6\uffff\2\37\1\uffff\13\37\1\177\1\uffff\1\u0081\7\37\1\u0089\7\37\1\uffff\3\37\1\u0094\3\37\1\103\1\u0099\10\37\1\u00a2\1\u00a3\2\37\1\uffff\1\37\1\uffff\1\37\1\u00a8\1\u00a9\2\37\1\u00ac\1\37\1\uffff\2\37\1\u00b0\2\37\1\u00b3\3\37\1\u00b7\1\uffff\3\37\1\103\1\uffff\1\u00be\1\u00bf\1\u00c0\3\37\1\u00c4\1\37\2\uffff\1\37\1\u00c7\1\37\1\u00c9\2\uffff\1\37\1\u00cb\1\uffff\1\37\1\u00cd\1\37\1\uffff\2\37\1\uffff\1\u00d1\2\37\1\uffff\1\u00d4\2\37\2\uffff\1\103\3\uffff\2\37\1\u00db\1\uffff\2\37\1\uffff\1\37\1\uffff\1\u00df\1\uffff\1\u00e0\1\uffff\1\u00e1\2\37\1\uffff\1\u00e4\1\37\1\uffff\2\37\1\u00bc\1\u00e8\1\37\1\u00ea\1\uffff\2\37\1\u00ed\3\uffff\1\u00ee\1\37\1\uffff\1\37\1\u00f1\1\37\1\uffff\1\37\1\uffff\1\u00f4\1\u00f5\2\uffff\1\u00f6\1\u00f7\1\uffff\1\37\1\u00f9\4\uffff\1\37\1\uffff\1\37\1\u00fc\1\uffff";
    static final String DFA16_eofS =
        "\u00fd\uffff";
    static final String DFA16_minS =
        "\1\0\23\55\1\60\1\55\1\101\1\55\2\0\1\52\2\uffff\2\55\2\uffff\14\55\1\uffff\25\55\6\uffff\2\55\1\uffff\14\55\1\uffff\20\55\1\uffff\25\55\1\uffff\1\55\1\uffff\7\55\1\uffff\12\55\1\uffff\3\55\1\40\1\uffff\10\55\2\uffff\4\55\2\uffff\2\55\1\uffff\3\55\1\uffff\2\55\1\uffff\3\55\1\uffff\4\55\1\uffff\1\55\3\uffff\3\55\1\uffff\2\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\1\uffff\3\55\1\uffff\2\55\1\uffff\6\55\1\uffff\3\55\3\uffff\2\55\1\uffff\3\55\1\uffff\1\55\1\uffff\2\55\2\uffff\2\55\1\uffff\2\55\4\uffff\1\55\1\uffff\2\55\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\23\172\1\71\3\172\2\uffff\1\57\2\uffff\2\172\2\uffff\14\172\1\uffff\25\172\6\uffff\2\172\1\uffff\14\172\1\uffff\20\172\1\uffff\25\172\1\uffff\1\172\1\uffff\7\172\1\uffff\12\172\1\uffff\4\172\1\uffff\10\172\2\uffff\4\172\2\uffff\2\172\1\uffff\3\172\1\uffff\2\172\1\uffff\3\172\1\uffff\4\172\1\uffff\1\172\3\uffff\3\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\uffff\2\172\1\uffff\6\172\1\uffff\3\172\3\uffff\2\172\1\uffff\3\172\1\uffff\1\172\1\uffff\2\172\2\uffff\2\172\1\uffff\2\172\4\uffff\1\172\1\uffff\2\172\1\uffff";
    static final String DFA16_acceptS =
        "\33\uffff\1\64\1\65\2\uffff\1\57\1\54\14\uffff\1\20\25\uffff\1\60\1\55\1\61\1\62\1\63\1\64\2\uffff\1\16\14\uffff\1\14\20\uffff\1\26\25\uffff\1\10\1\uffff\1\33\7\uffff\1\17\12\uffff\1\42\4\uffff\1\1\10\uffff\1\43\1\32\4\uffff\1\6\1\7\2\uffff\1\13\3\uffff\1\22\2\uffff\1\24\3\uffff\1\40\4\uffff\1\56\1\uffff\1\53\1\2\1\15\3\uffff\1\31\2\uffff\1\52\1\uffff\1\36\1\uffff\1\12\1\uffff\1\21\3\uffff\1\37\2\uffff\1\44\6\uffff\1\35\3\uffff\1\41\1\30\1\45\2\uffff\1\34\3\uffff\1\3\1\uffff\1\27\2\uffff\1\25\1\46\2\uffff\1\50\2\uffff\1\4\1\5\1\23\1\47\1\uffff\1\11\2\uffff\1\51";
    static final String DFA16_specialS =
        "\1\1\27\uffff\1\0\1\2\u00e3\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\3\34\1\24\1\34\2\27\1\32\12\23\7\34\32\25\3\34\1\26\1\25\1\34\1\5\1\25\1\4\1\16\1\2\1\14\1\25\1\21\1\22\2\25\1\17\1\12\1\7\1\15\1\3\1\25\1\13\1\11\1\1\1\25\1\10\1\6\2\25\1\20\uff85\34",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\35\15\41\1\36\13\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\14\41\1\42\15\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\44\3\41\1\45\2\41\1\46\11\41\1\43\10\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\50\15\41\1\47\13\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\41\1\51\1\41\1\53\7\41\1\54\1\41\1\52\14\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\10\41\1\56\21\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\57\23\41\1\60\5\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\61\31\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\62\7\41\1\63\1\64\6\41\1\65\5\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\66\3\41\1\67\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\70\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\10\41\1\72\13\41\1\71\5\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\5\41\1\73\24\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\74\11\41\1\75\13\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\76\31\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\10\41\1\77\21\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\16\41\1\100\13\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\15\41\1\101\14\41",
            "\2\40\1\uffff\12\102\6\uffff\33\40\4\uffff\1\40\1\uffff\32\40",
            "\12\104",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "\2\40\1\uffff\12\40\6\uffff\33\40\4\uffff\1\40\1\uffff\32\40",
            "\0\105",
            "\0\105",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\111\7\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\17\41\1\112\12\41",
            "",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\115\16\41\1\114\12\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\16\41\1\116\13\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\21\41\1\117\10\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\21\41\1\120\10\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\16\41\1\121\13\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\3\41\1\123\10\41\1\122\15\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\13\41\1\124\16\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\16\41\1\126\3\41\1\125\7\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\3\41\1\127\26\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\3\41\1\131\26\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\10\41\1\132\21\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\23\41\1\133\6\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\14\41\1\134\15\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\14\41\1\135\15\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\13\41\1\136\16\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\140\14\41\1\137\14\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\141\7\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\142\31\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\5\41\1\143\24\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\10\41\1\144\21\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\145\7\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\23\41\1\146\6\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\13\41\1\147\16\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\21\41\1\150\10\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\13\41\1\152\16\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\2\41\1\153\27\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\154\7\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\17\41\1\155\12\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\24\41\1\156\5\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\5\41\1\160\17\41\1\157\4\41",
            "\2\40\1\uffff\12\161\6\uffff\33\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\12\41\1\162\17\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\10\41\1\163\21\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\23\41\1\164\6\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\10\41\1\165\21\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\2\41\1\166\27\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\167\31\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\170\7\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\15\41\1\171\14\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\17\41\1\172\12\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\173\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\13\41\1\174\16\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\23\41\1\175\6\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\24\41\1\176\5\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\21\41\1\u0080\10\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\u0082\31\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\7\41\1\u0083\22\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u0084\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\41\1\u0085\30\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\24\41\1\u0086\5\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\3\41\1\u0087\26\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\21\41\1\u0088\10\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\10\41\1\u008a\21\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\5\41\1\u008b\24\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\13\41\1\u008c\16\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\u008d\7\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\21\41\1\u008e\10\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\13\41\1\u008f\16\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\u0090\7\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u0091\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\24\41\1\u0092\5\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\23\41\1\u0093\6\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\u0095\7\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\16\41\1\u0096\13\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\16\41\1\u0097\13\41",
            "\2\40\1\uffff\12\u0098\6\uffff\33\40\4\uffff\1\40\1\uffff\32\40",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\2\41\1\u009a\27\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\30\41\1\u009b\1\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\13\41\1\u009c\16\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u009d\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\14\41\1\u009e\15\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\16\41\1\u009f\13\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00a0\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\16\41\1\u00a1\13\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\21\41\1\u00a4\10\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\23\41\1\u00a5\6\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00a6\25\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\u00a7\7\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00aa\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00ab\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\2\41\1\u00ad\27\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\13\41\1\u00ae\16\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\10\41\1\u00af\21\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\u00b1\31\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\10\41\1\u00b2\21\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\23\41\1\u00b4\6\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\23\41\1\u00b5\6\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\14\41\1\u00b6\15\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00b8\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\10\41\1\u00b9\21\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\21\41\1\u00ba\10\41",
            "\1\u00bc\14\uffff\2\40\1\uffff\12\u00bd\6\uffff\1\40\32\u00bb\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\u00c1\7\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00c2\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\15\41\1\u00c3\14\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\24\41\1\u00c5\5\41",
            "",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\u00c6\31\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\u00c8\7\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\21\41\1\u00ca\10\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\7\41\1\u00cc\22\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\27\41\1\u00ce\2\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\6\41\1\u00cf\23\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00d0\25\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00d2\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00d3\25\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\2\41\1\u00d5\27\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\14\41\1\u00d6\15\41",
            "\2\40\1\uffff\12\40\6\uffff\1\40\32\u00d7\4\uffff\1\40\1\uffff\32\40",
            "",
            "\2\40\1\uffff\12\u00bd\6\uffff\33\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\u00d8\7\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\23\41\1\u00d9\6\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\u00da\7\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\15\41\1\u00dc\14\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\2\41\1\u00dd\27\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\22\41\1\u00de\7\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00e2\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\25\41\1\u00e3\4\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\15\41\1\u00e5\14\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00e6\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\1\u00e7\31\41",
            "\2\40\1\uffff\12\40\6\uffff\33\40\4\uffff\1\40\1\uffff\32\40",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00e9\25\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\3\41\1\u00eb\26\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\23\41\1\u00ec\6\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\4\41\1\u00ef\25\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\23\41\1\u00f0\6\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\23\41\1\u00f2\6\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\21\41\1\u00f3\10\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\10\41\1\u00f8\21\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\16\41\1\u00fa\13\41",
            "",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\15\41\1\u00fb\14\41",
            "\2\40\1\uffff\12\41\6\uffff\1\40\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_EMAIL_ADDRESS | RULE_PHONE_NUMBER | RULE_DUTCH_POSTCODE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_24 = input.LA(1);

                        s = -1;
                        if ( ((LA16_24>='\u0000' && LA16_24<='\uFFFF')) ) {s = 69;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='t') ) {s = 1;}

                        else if ( (LA16_0=='e') ) {s = 2;}

                        else if ( (LA16_0=='p') ) {s = 3;}

                        else if ( (LA16_0=='c') ) {s = 4;}

                        else if ( (LA16_0=='a') ) {s = 5;}

                        else if ( (LA16_0=='w') ) {s = 6;}

                        else if ( (LA16_0=='n') ) {s = 7;}

                        else if ( (LA16_0=='v') ) {s = 8;}

                        else if ( (LA16_0=='s') ) {s = 9;}

                        else if ( (LA16_0=='m') ) {s = 10;}

                        else if ( (LA16_0=='r') ) {s = 11;}

                        else if ( (LA16_0=='f') ) {s = 12;}

                        else if ( (LA16_0=='o') ) {s = 13;}

                        else if ( (LA16_0=='d') ) {s = 14;}

                        else if ( (LA16_0=='l') ) {s = 15;}

                        else if ( (LA16_0=='z') ) {s = 16;}

                        else if ( (LA16_0=='h') ) {s = 17;}

                        else if ( (LA16_0=='i') ) {s = 18;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 19;}

                        else if ( (LA16_0=='+') ) {s = 20;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='b'||LA16_0=='g'||(LA16_0>='j' && LA16_0<='k')||LA16_0=='q'||LA16_0=='u'||(LA16_0>='x' && LA16_0<='y')) ) {s = 21;}

                        else if ( (LA16_0=='^') ) {s = 22;}

                        else if ( ((LA16_0>='-' && LA16_0<='.')) ) {s = 23;}

                        else if ( (LA16_0=='\"') ) {s = 24;}

                        else if ( (LA16_0=='\'') ) {s = 25;}

                        else if ( (LA16_0=='/') ) {s = 26;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 27;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='*')||LA16_0==','||(LA16_0>=':' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='{' && LA16_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_25 = input.LA(1);

                        s = -1;
                        if ( ((LA16_25>='\u0000' && LA16_25<='\uFFFF')) ) {s = 69;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}