package org.xtext.example.bilang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.bilang.services.BilangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBilangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EMAIL_ADDRESS", "RULE_STRING", "RULE_PHONE_NUMBER", "RULE_DUTCH_POSTCODE", "RULE_HOUSENUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'task'", "'empty'", "'process'", "'compound'", "'abstract'", "'with'", "'name'", "'and'", "'parameter'", "'value'", "'send'", "'an'", "'email'", "'to'", "'content'", "'sms'", "'a'", "'snail'", "'mail'", "'retrieve'", "'document'", "'full'", "'address'", "'of'", "'persons'", "'search'", "'phone'", "'call'", "'add'", "'delete'", "'person'", "'alias'", "'first'", "'last'", "'number'", "'zip'", "'code'", "'house'", "'message'", "'invoice'", "'information'", "'about'"
    };
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


        public InternalBilangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBilangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBilangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBilang.g"; }



     	private BilangGrammarAccess grammarAccess;

        public InternalBilangParser(TokenStream input, BilangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BilangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBilang.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBilang.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBilang.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBilang.g:71:1: ruleModel returns [EObject current=null] : (this_Task_0= ruleTask | this_CompoundProcess_1= ruleCompoundProcess | this_AbstractProcess_2= ruleAbstractProcess | ruleEmptyProcess ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Task_0 = null;

        EObject this_CompoundProcess_1 = null;

        EObject this_AbstractProcess_2 = null;



        	enterRule();

        try {
            // InternalBilang.g:77:2: ( (this_Task_0= ruleTask | this_CompoundProcess_1= ruleCompoundProcess | this_AbstractProcess_2= ruleAbstractProcess | ruleEmptyProcess ) )
            // InternalBilang.g:78:2: (this_Task_0= ruleTask | this_CompoundProcess_1= ruleCompoundProcess | this_AbstractProcess_2= ruleAbstractProcess | ruleEmptyProcess )
            {
            // InternalBilang.g:78:2: (this_Task_0= ruleTask | this_CompoundProcess_1= ruleCompoundProcess | this_AbstractProcess_2= ruleAbstractProcess | ruleEmptyProcess )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 16:
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
                    // InternalBilang.g:79:3: this_Task_0= ruleTask
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Task_0=ruleTask();

                    state._fsp--;


                    			current = this_Task_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:88:3: this_CompoundProcess_1= ruleCompoundProcess
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getCompoundProcessParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompoundProcess_1=ruleCompoundProcess();

                    state._fsp--;


                    			current = this_CompoundProcess_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBilang.g:97:3: this_AbstractProcess_2= ruleAbstractProcess
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getAbstractProcessParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractProcess_2=ruleAbstractProcess();

                    state._fsp--;


                    			current = this_AbstractProcess_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBilang.g:106:3: ruleEmptyProcess
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getEmptyProcessParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    ruleEmptyProcess();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTask"
    // InternalBilang.g:117:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalBilang.g:117:45: (iv_ruleTask= ruleTask EOF )
            // InternalBilang.g:118:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalBilang.g:124:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( ( (lv_kind_1_1= ruleSendTask | lv_kind_1_2= ruleRetrieveTask | lv_kind_1_3= rulePersonTask ) ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_kind_1_1 = null;

        EObject lv_kind_1_2 = null;

        EObject lv_kind_1_3 = null;



        	enterRule();

        try {
            // InternalBilang.g:130:2: ( (otherlv_0= 'task' ( ( (lv_kind_1_1= ruleSendTask | lv_kind_1_2= ruleRetrieveTask | lv_kind_1_3= rulePersonTask ) ) ) ) )
            // InternalBilang.g:131:2: (otherlv_0= 'task' ( ( (lv_kind_1_1= ruleSendTask | lv_kind_1_2= ruleRetrieveTask | lv_kind_1_3= rulePersonTask ) ) ) )
            {
            // InternalBilang.g:131:2: (otherlv_0= 'task' ( ( (lv_kind_1_1= ruleSendTask | lv_kind_1_2= ruleRetrieveTask | lv_kind_1_3= rulePersonTask ) ) ) )
            // InternalBilang.g:132:3: otherlv_0= 'task' ( ( (lv_kind_1_1= ruleSendTask | lv_kind_1_2= ruleRetrieveTask | lv_kind_1_3= rulePersonTask ) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalBilang.g:136:3: ( ( (lv_kind_1_1= ruleSendTask | lv_kind_1_2= ruleRetrieveTask | lv_kind_1_3= rulePersonTask ) ) )
            // InternalBilang.g:137:4: ( (lv_kind_1_1= ruleSendTask | lv_kind_1_2= ruleRetrieveTask | lv_kind_1_3= rulePersonTask ) )
            {
            // InternalBilang.g:137:4: ( (lv_kind_1_1= ruleSendTask | lv_kind_1_2= ruleRetrieveTask | lv_kind_1_3= rulePersonTask ) )
            // InternalBilang.g:138:5: (lv_kind_1_1= ruleSendTask | lv_kind_1_2= ruleRetrieveTask | lv_kind_1_3= rulePersonTask )
            {
            // InternalBilang.g:138:5: (lv_kind_1_1= ruleSendTask | lv_kind_1_2= ruleRetrieveTask | lv_kind_1_3= rulePersonTask )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 41:
            case 43:
            case 44:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBilang.g:139:6: lv_kind_1_1= ruleSendTask
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindSendTaskParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_kind_1_1=ruleSendTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						add(
                    							current,
                    							"kind",
                    							lv_kind_1_1,
                    							"org.xtext.example.bilang.Bilang.SendTask");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBilang.g:155:6: lv_kind_1_2= ruleRetrieveTask
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindRetrieveTaskParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_kind_1_2=ruleRetrieveTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						add(
                    							current,
                    							"kind",
                    							lv_kind_1_2,
                    							"org.xtext.example.bilang.Bilang.RetrieveTask");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalBilang.g:171:6: lv_kind_1_3= rulePersonTask
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindPersonTaskParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_kind_1_3=rulePersonTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						add(
                    							current,
                    							"kind",
                    							lv_kind_1_3,
                    							"org.xtext.example.bilang.Bilang.PersonTask");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleEmptyProcess"
    // InternalBilang.g:193:1: entryRuleEmptyProcess returns [String current=null] : iv_ruleEmptyProcess= ruleEmptyProcess EOF ;
    public final String entryRuleEmptyProcess() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmptyProcess = null;


        try {
            // InternalBilang.g:193:52: (iv_ruleEmptyProcess= ruleEmptyProcess EOF )
            // InternalBilang.g:194:2: iv_ruleEmptyProcess= ruleEmptyProcess EOF
            {
             newCompositeNode(grammarAccess.getEmptyProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyProcess=ruleEmptyProcess();

            state._fsp--;

             current =iv_ruleEmptyProcess.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyProcess"


    // $ANTLR start "ruleEmptyProcess"
    // InternalBilang.g:200:1: ruleEmptyProcess returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'empty' kw= 'process' ) ;
    public final AntlrDatatypeRuleToken ruleEmptyProcess() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBilang.g:206:2: ( (kw= 'empty' kw= 'process' ) )
            // InternalBilang.g:207:2: (kw= 'empty' kw= 'process' )
            {
            // InternalBilang.g:207:2: (kw= 'empty' kw= 'process' )
            // InternalBilang.g:208:3: kw= 'empty' kw= 'process'
            {
            kw=(Token)match(input,16,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEmptyProcessAccess().getEmptyKeyword_0());
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEmptyProcessAccess().getProcessKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyProcess"


    // $ANTLR start "entryRuleCompoundProcess"
    // InternalBilang.g:222:1: entryRuleCompoundProcess returns [EObject current=null] : iv_ruleCompoundProcess= ruleCompoundProcess EOF ;
    public final EObject entryRuleCompoundProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundProcess = null;


        try {
            // InternalBilang.g:222:56: (iv_ruleCompoundProcess= ruleCompoundProcess EOF )
            // InternalBilang.g:223:2: iv_ruleCompoundProcess= ruleCompoundProcess EOF
            {
             newCompositeNode(grammarAccess.getCompoundProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompoundProcess=ruleCompoundProcess();

            state._fsp--;

             current =iv_ruleCompoundProcess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompoundProcess"


    // $ANTLR start "ruleCompoundProcess"
    // InternalBilang.g:229:1: ruleCompoundProcess returns [EObject current=null] : (otherlv_0= 'compound' otherlv_1= 'process' ( (lv_task_2_0= ruleTask ) )+ ) ;
    public final EObject ruleCompoundProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_task_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:235:2: ( (otherlv_0= 'compound' otherlv_1= 'process' ( (lv_task_2_0= ruleTask ) )+ ) )
            // InternalBilang.g:236:2: (otherlv_0= 'compound' otherlv_1= 'process' ( (lv_task_2_0= ruleTask ) )+ )
            {
            // InternalBilang.g:236:2: (otherlv_0= 'compound' otherlv_1= 'process' ( (lv_task_2_0= ruleTask ) )+ )
            // InternalBilang.g:237:3: otherlv_0= 'compound' otherlv_1= 'process' ( (lv_task_2_0= ruleTask ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundProcessAccess().getCompoundKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCompoundProcessAccess().getProcessKeyword_1());
            		
            // InternalBilang.g:245:3: ( (lv_task_2_0= ruleTask ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBilang.g:246:4: (lv_task_2_0= ruleTask )
            	    {
            	    // InternalBilang.g:246:4: (lv_task_2_0= ruleTask )
            	    // InternalBilang.g:247:5: lv_task_2_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getCompoundProcessAccess().getTaskTaskParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_task_2_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompoundProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"task",
            	    						lv_task_2_0,
            	    						"org.xtext.example.bilang.Bilang.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompoundProcess"


    // $ANTLR start "entryRuleAbstractProcess"
    // InternalBilang.g:268:1: entryRuleAbstractProcess returns [EObject current=null] : iv_ruleAbstractProcess= ruleAbstractProcess EOF ;
    public final EObject entryRuleAbstractProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProcess = null;


        try {
            // InternalBilang.g:268:56: (iv_ruleAbstractProcess= ruleAbstractProcess EOF )
            // InternalBilang.g:269:2: iv_ruleAbstractProcess= ruleAbstractProcess EOF
            {
             newCompositeNode(grammarAccess.getAbstractProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractProcess=ruleAbstractProcess();

            state._fsp--;

             current =iv_ruleAbstractProcess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractProcess"


    // $ANTLR start "ruleAbstractProcess"
    // InternalBilang.g:275:1: ruleAbstractProcess returns [EObject current=null] : (otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'and' ( (lv_paramValues_6_0= ruleParamValue ) )+ ) ;
    public final EObject ruleAbstractProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_paramValues_6_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:281:2: ( (otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'and' ( (lv_paramValues_6_0= ruleParamValue ) )+ ) )
            // InternalBilang.g:282:2: (otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'and' ( (lv_paramValues_6_0= ruleParamValue ) )+ )
            {
            // InternalBilang.g:282:2: (otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'and' ( (lv_paramValues_6_0= ruleParamValue ) )+ )
            // InternalBilang.g:283:3: otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'and' ( (lv_paramValues_6_0= ruleParamValue ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractProcessAccess().getAbstractKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractProcessAccess().getProcessKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractProcessAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAbstractProcessAccess().getNameKeyword_3());
            		
            // InternalBilang.g:299:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBilang.g:300:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBilang.g:300:4: (lv_name_4_0= RULE_ID )
            // InternalBilang.g:301:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_4_0, grammarAccess.getAbstractProcessAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getAbstractProcessAccess().getAndKeyword_5());
            		
            // InternalBilang.g:321:3: ( (lv_paramValues_6_0= ruleParamValue ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBilang.g:322:4: (lv_paramValues_6_0= ruleParamValue )
            	    {
            	    // InternalBilang.g:322:4: (lv_paramValues_6_0= ruleParamValue )
            	    // InternalBilang.g:323:5: lv_paramValues_6_0= ruleParamValue
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractProcessAccess().getParamValuesParamValueParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_paramValues_6_0=ruleParamValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"paramValues",
            	    						lv_paramValues_6_0,
            	    						"org.xtext.example.bilang.Bilang.ParamValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractProcess"


    // $ANTLR start "entryRuleParamValue"
    // InternalBilang.g:344:1: entryRuleParamValue returns [EObject current=null] : iv_ruleParamValue= ruleParamValue EOF ;
    public final EObject entryRuleParamValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValue = null;


        try {
            // InternalBilang.g:344:51: (iv_ruleParamValue= ruleParamValue EOF )
            // InternalBilang.g:345:2: iv_ruleParamValue= ruleParamValue EOF
            {
             newCompositeNode(grammarAccess.getParamValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamValue=ruleParamValue();

            state._fsp--;

             current =iv_ruleParamValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamValue"


    // $ANTLR start "ruleParamValue"
    // InternalBilang.g:351:1: ruleParamValue returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'and' otherlv_3= 'value' ( (lv_value_4_0= RULE_ID ) ) ) ;
    public final EObject ruleParamValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_param_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalBilang.g:357:2: ( (otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'and' otherlv_3= 'value' ( (lv_value_4_0= RULE_ID ) ) ) )
            // InternalBilang.g:358:2: (otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'and' otherlv_3= 'value' ( (lv_value_4_0= RULE_ID ) ) )
            {
            // InternalBilang.g:358:2: (otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'and' otherlv_3= 'value' ( (lv_value_4_0= RULE_ID ) ) )
            // InternalBilang.g:359:3: otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'and' otherlv_3= 'value' ( (lv_value_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getParamValueAccess().getParameterKeyword_0());
            		
            // InternalBilang.g:363:3: ( (lv_param_1_0= RULE_ID ) )
            // InternalBilang.g:364:4: (lv_param_1_0= RULE_ID )
            {
            // InternalBilang.g:364:4: (lv_param_1_0= RULE_ID )
            // InternalBilang.g:365:5: lv_param_1_0= RULE_ID
            {
            lv_param_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_param_1_0, grammarAccess.getParamValueAccess().getParamIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param",
            						lv_param_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getParamValueAccess().getAndKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getParamValueAccess().getValueKeyword_3());
            		
            // InternalBilang.g:389:3: ( (lv_value_4_0= RULE_ID ) )
            // InternalBilang.g:390:4: (lv_value_4_0= RULE_ID )
            {
            // InternalBilang.g:390:4: (lv_value_4_0= RULE_ID )
            // InternalBilang.g:391:5: lv_value_4_0= RULE_ID
            {
            lv_value_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getParamValueAccess().getValueIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamValue"


    // $ANTLR start "entryRuleRetrieveTask"
    // InternalBilang.g:411:1: entryRuleRetrieveTask returns [EObject current=null] : iv_ruleRetrieveTask= ruleRetrieveTask EOF ;
    public final EObject entryRuleRetrieveTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieveTask = null;


        try {
            // InternalBilang.g:411:53: (iv_ruleRetrieveTask= ruleRetrieveTask EOF )
            // InternalBilang.g:412:2: iv_ruleRetrieveTask= ruleRetrieveTask EOF
            {
             newCompositeNode(grammarAccess.getRetrieveTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetrieveTask=ruleRetrieveTask();

            state._fsp--;

             current =iv_ruleRetrieveTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRetrieveTask"


    // $ANTLR start "ruleRetrieveTask"
    // InternalBilang.g:418:1: ruleRetrieveTask returns [EObject current=null] : (this_RetrieveDocument_0= ruleRetrieveDocument | this_RetrieveFullAddress_1= ruleRetrieveFullAddress | this_RetrievePersons_2= ruleRetrievePersons ) ;
    public final EObject ruleRetrieveTask() throws RecognitionException {
        EObject current = null;

        EObject this_RetrieveDocument_0 = null;

        EObject this_RetrieveFullAddress_1 = null;

        EObject this_RetrievePersons_2 = null;



        	enterRule();

        try {
            // InternalBilang.g:424:2: ( (this_RetrieveDocument_0= ruleRetrieveDocument | this_RetrieveFullAddress_1= ruleRetrieveFullAddress | this_RetrievePersons_2= ruleRetrievePersons ) )
            // InternalBilang.g:425:2: (this_RetrieveDocument_0= ruleRetrieveDocument | this_RetrieveFullAddress_1= ruleRetrieveFullAddress | this_RetrievePersons_2= ruleRetrievePersons )
            {
            // InternalBilang.g:425:2: (this_RetrieveDocument_0= ruleRetrieveDocument | this_RetrieveFullAddress_1= ruleRetrieveFullAddress | this_RetrievePersons_2= ruleRetrievePersons )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                switch ( input.LA(2) ) {
                case 39:
                    {
                    alt5=3;
                    }
                    break;
                case 35:
                    {
                    alt5=1;
                    }
                    break;
                case 36:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBilang.g:426:3: this_RetrieveDocument_0= ruleRetrieveDocument
                    {

                    			newCompositeNode(grammarAccess.getRetrieveTaskAccess().getRetrieveDocumentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RetrieveDocument_0=ruleRetrieveDocument();

                    state._fsp--;


                    			current = this_RetrieveDocument_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:435:3: this_RetrieveFullAddress_1= ruleRetrieveFullAddress
                    {

                    			newCompositeNode(grammarAccess.getRetrieveTaskAccess().getRetrieveFullAddressParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RetrieveFullAddress_1=ruleRetrieveFullAddress();

                    state._fsp--;


                    			current = this_RetrieveFullAddress_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBilang.g:444:3: this_RetrievePersons_2= ruleRetrievePersons
                    {

                    			newCompositeNode(grammarAccess.getRetrieveTaskAccess().getRetrievePersonsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RetrievePersons_2=ruleRetrievePersons();

                    state._fsp--;


                    			current = this_RetrievePersons_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRetrieveTask"


    // $ANTLR start "entryRuleSendTask"
    // InternalBilang.g:456:1: entryRuleSendTask returns [EObject current=null] : iv_ruleSendTask= ruleSendTask EOF ;
    public final EObject entryRuleSendTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendTask = null;


        try {
            // InternalBilang.g:456:49: (iv_ruleSendTask= ruleSendTask EOF )
            // InternalBilang.g:457:2: iv_ruleSendTask= ruleSendTask EOF
            {
             newCompositeNode(grammarAccess.getSendTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendTask=ruleSendTask();

            state._fsp--;

             current =iv_ruleSendTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSendTask"


    // $ANTLR start "ruleSendTask"
    // InternalBilang.g:463:1: ruleSendTask returns [EObject current=null] : (this_SendEmail_0= ruleSendEmail | this_SendSMS_1= ruleSendSMS | this_SendSnailMail_2= ruleSendSnailMail ) ;
    public final EObject ruleSendTask() throws RecognitionException {
        EObject current = null;

        EObject this_SendEmail_0 = null;

        EObject this_SendSMS_1 = null;

        EObject this_SendSnailMail_2 = null;



        	enterRule();

        try {
            // InternalBilang.g:469:2: ( (this_SendEmail_0= ruleSendEmail | this_SendSMS_1= ruleSendSMS | this_SendSnailMail_2= ruleSendSnailMail ) )
            // InternalBilang.g:470:2: (this_SendEmail_0= ruleSendEmail | this_SendSMS_1= ruleSendSMS | this_SendSnailMail_2= ruleSendSnailMail )
            {
            // InternalBilang.g:470:2: (this_SendEmail_0= ruleSendEmail | this_SendSMS_1= ruleSendSMS | this_SendSnailMail_2= ruleSendSnailMail )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==31) ) {
                    alt6=3;
                }
                else if ( (LA6_1==26) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==30) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==27) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBilang.g:471:3: this_SendEmail_0= ruleSendEmail
                    {

                    			newCompositeNode(grammarAccess.getSendTaskAccess().getSendEmailParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendEmail_0=ruleSendEmail();

                    state._fsp--;


                    			current = this_SendEmail_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:480:3: this_SendSMS_1= ruleSendSMS
                    {

                    			newCompositeNode(grammarAccess.getSendTaskAccess().getSendSMSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendSMS_1=ruleSendSMS();

                    state._fsp--;


                    			current = this_SendSMS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBilang.g:489:3: this_SendSnailMail_2= ruleSendSnailMail
                    {

                    			newCompositeNode(grammarAccess.getSendTaskAccess().getSendSnailMailParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendSnailMail_2=ruleSendSnailMail();

                    state._fsp--;


                    			current = this_SendSnailMail_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSendTask"


    // $ANTLR start "entryRulePersonTask"
    // InternalBilang.g:501:1: entryRulePersonTask returns [EObject current=null] : iv_rulePersonTask= rulePersonTask EOF ;
    public final EObject entryRulePersonTask() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonTask = null;


        try {
            // InternalBilang.g:501:51: (iv_rulePersonTask= rulePersonTask EOF )
            // InternalBilang.g:502:2: iv_rulePersonTask= rulePersonTask EOF
            {
             newCompositeNode(grammarAccess.getPersonTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonTask=rulePersonTask();

            state._fsp--;

             current =iv_rulePersonTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonTask"


    // $ANTLR start "rulePersonTask"
    // InternalBilang.g:508:1: rulePersonTask returns [EObject current=null] : (this_CallPerson_0= ruleCallPerson | this_AddPerson_1= ruleAddPerson | this_DeletePerson_2= ruleDeletePerson ) ;
    public final EObject rulePersonTask() throws RecognitionException {
        EObject current = null;

        EObject this_CallPerson_0 = null;

        EObject this_AddPerson_1 = null;

        EObject this_DeletePerson_2 = null;



        	enterRule();

        try {
            // InternalBilang.g:514:2: ( (this_CallPerson_0= ruleCallPerson | this_AddPerson_1= ruleAddPerson | this_DeletePerson_2= ruleDeletePerson ) )
            // InternalBilang.g:515:2: (this_CallPerson_0= ruleCallPerson | this_AddPerson_1= ruleAddPerson | this_DeletePerson_2= ruleDeletePerson )
            {
            // InternalBilang.g:515:2: (this_CallPerson_0= ruleCallPerson | this_AddPerson_1= ruleAddPerson | this_DeletePerson_2= ruleDeletePerson )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt7=1;
                }
                break;
            case 43:
                {
                alt7=2;
                }
                break;
            case 44:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBilang.g:516:3: this_CallPerson_0= ruleCallPerson
                    {

                    			newCompositeNode(grammarAccess.getPersonTaskAccess().getCallPersonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallPerson_0=ruleCallPerson();

                    state._fsp--;


                    			current = this_CallPerson_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:525:3: this_AddPerson_1= ruleAddPerson
                    {

                    			newCompositeNode(grammarAccess.getPersonTaskAccess().getAddPersonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddPerson_1=ruleAddPerson();

                    state._fsp--;


                    			current = this_AddPerson_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBilang.g:534:3: this_DeletePerson_2= ruleDeletePerson
                    {

                    			newCompositeNode(grammarAccess.getPersonTaskAccess().getDeletePersonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeletePerson_2=ruleDeletePerson();

                    state._fsp--;


                    			current = this_DeletePerson_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonTask"


    // $ANTLR start "entryRuleSendEmail"
    // InternalBilang.g:546:1: entryRuleSendEmail returns [EObject current=null] : iv_ruleSendEmail= ruleSendEmail EOF ;
    public final EObject entryRuleSendEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendEmail = null;


        try {
            // InternalBilang.g:546:50: (iv_ruleSendEmail= ruleSendEmail EOF )
            // InternalBilang.g:547:2: iv_ruleSendEmail= ruleSendEmail EOF
            {
             newCompositeNode(grammarAccess.getSendEmailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendEmail=ruleSendEmail();

            state._fsp--;

             current =iv_ruleSendEmail; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSendEmail"


    // $ANTLR start "ruleSendEmail"
    // InternalBilang.g:553:1: ruleSendEmail returns [EObject current=null] : (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) ) ;
    public final EObject ruleSendEmail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_person_4_0 = null;

        EObject lv_content_7_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:559:2: ( (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) ) )
            // InternalBilang.g:560:2: (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) )
            {
            // InternalBilang.g:560:2: (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) )
            // InternalBilang.g:561:3: otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSendEmailAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSendEmailAccess().getAnKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSendEmailAccess().getEmailKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getSendEmailAccess().getToKeyword_3());
            		
            // InternalBilang.g:577:3: ( (lv_person_4_0= rulePerson ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==45) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBilang.g:578:4: (lv_person_4_0= rulePerson )
            	    {
            	    // InternalBilang.g:578:4: (lv_person_4_0= rulePerson )
            	    // InternalBilang.g:579:5: lv_person_4_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getSendEmailAccess().getPersonPersonParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_person_4_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSendEmailRule());
            	    					}
            	    					add(
            	    						current,
            	    						"person",
            	    						lv_person_4_0,
            	    						"org.xtext.example.bilang.Bilang.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getSendEmailAccess().getWithKeyword_5());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getSendEmailAccess().getContentKeyword_6());
            		
            // InternalBilang.g:604:3: ( (lv_content_7_0= ruleContent ) )
            // InternalBilang.g:605:4: (lv_content_7_0= ruleContent )
            {
            // InternalBilang.g:605:4: (lv_content_7_0= ruleContent )
            // InternalBilang.g:606:5: lv_content_7_0= ruleContent
            {

            					newCompositeNode(grammarAccess.getSendEmailAccess().getContentContentParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_7_0=ruleContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSendEmailRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_7_0,
            						"org.xtext.example.bilang.Bilang.Content");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSendEmail"


    // $ANTLR start "entryRuleSendSMS"
    // InternalBilang.g:627:1: entryRuleSendSMS returns [EObject current=null] : iv_ruleSendSMS= ruleSendSMS EOF ;
    public final EObject entryRuleSendSMS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendSMS = null;


        try {
            // InternalBilang.g:627:48: (iv_ruleSendSMS= ruleSendSMS EOF )
            // InternalBilang.g:628:2: iv_ruleSendSMS= ruleSendSMS EOF
            {
             newCompositeNode(grammarAccess.getSendSMSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendSMS=ruleSendSMS();

            state._fsp--;

             current =iv_ruleSendSMS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSendSMS"


    // $ANTLR start "ruleSendSMS"
    // InternalBilang.g:634:1: ruleSendSMS returns [EObject current=null] : (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) ) ;
    public final EObject ruleSendSMS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_person_4_0 = null;

        EObject lv_content_7_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:640:2: ( (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) ) )
            // InternalBilang.g:641:2: (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) )
            {
            // InternalBilang.g:641:2: (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) )
            // InternalBilang.g:642:3: otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSendSMSAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSendSMSAccess().getAnKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSendSMSAccess().getSmsKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getSendSMSAccess().getToKeyword_3());
            		
            // InternalBilang.g:658:3: ( (lv_person_4_0= rulePerson ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==45) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBilang.g:659:4: (lv_person_4_0= rulePerson )
            	    {
            	    // InternalBilang.g:659:4: (lv_person_4_0= rulePerson )
            	    // InternalBilang.g:660:5: lv_person_4_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getSendSMSAccess().getPersonPersonParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_person_4_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSendSMSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"person",
            	    						lv_person_4_0,
            	    						"org.xtext.example.bilang.Bilang.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_5=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getSendSMSAccess().getWithKeyword_5());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getSendSMSAccess().getContentKeyword_6());
            		
            // InternalBilang.g:685:3: ( (lv_content_7_0= ruleContent ) )
            // InternalBilang.g:686:4: (lv_content_7_0= ruleContent )
            {
            // InternalBilang.g:686:4: (lv_content_7_0= ruleContent )
            // InternalBilang.g:687:5: lv_content_7_0= ruleContent
            {

            					newCompositeNode(grammarAccess.getSendSMSAccess().getContentContentParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_7_0=ruleContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSendSMSRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_7_0,
            						"org.xtext.example.bilang.Bilang.Content");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSendSMS"


    // $ANTLR start "entryRuleSendSnailMail"
    // InternalBilang.g:708:1: entryRuleSendSnailMail returns [EObject current=null] : iv_ruleSendSnailMail= ruleSendSnailMail EOF ;
    public final EObject entryRuleSendSnailMail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendSnailMail = null;


        try {
            // InternalBilang.g:708:54: (iv_ruleSendSnailMail= ruleSendSnailMail EOF )
            // InternalBilang.g:709:2: iv_ruleSendSnailMail= ruleSendSnailMail EOF
            {
             newCompositeNode(grammarAccess.getSendSnailMailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendSnailMail=ruleSendSnailMail();

            state._fsp--;

             current =iv_ruleSendSnailMail; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSendSnailMail"


    // $ANTLR start "ruleSendSnailMail"
    // InternalBilang.g:715:1: ruleSendSnailMail returns [EObject current=null] : (otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_person_5_0= rulePerson ) )+ otherlv_6= 'with' otherlv_7= 'content' ( (lv_content_8_0= ruleContent ) ) ) ;
    public final EObject ruleSendSnailMail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_person_5_0 = null;

        EObject lv_content_8_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:721:2: ( (otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_person_5_0= rulePerson ) )+ otherlv_6= 'with' otherlv_7= 'content' ( (lv_content_8_0= ruleContent ) ) ) )
            // InternalBilang.g:722:2: (otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_person_5_0= rulePerson ) )+ otherlv_6= 'with' otherlv_7= 'content' ( (lv_content_8_0= ruleContent ) ) )
            {
            // InternalBilang.g:722:2: (otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_person_5_0= rulePerson ) )+ otherlv_6= 'with' otherlv_7= 'content' ( (lv_content_8_0= ruleContent ) ) )
            // InternalBilang.g:723:3: otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_person_5_0= rulePerson ) )+ otherlv_6= 'with' otherlv_7= 'content' ( (lv_content_8_0= ruleContent ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getSendSnailMailAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getSendSnailMailAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSendSnailMailAccess().getSnailKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getSendSnailMailAccess().getMailKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getSendSnailMailAccess().getToKeyword_4());
            		
            // InternalBilang.g:743:3: ( (lv_person_5_0= rulePerson ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==45) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBilang.g:744:4: (lv_person_5_0= rulePerson )
            	    {
            	    // InternalBilang.g:744:4: (lv_person_5_0= rulePerson )
            	    // InternalBilang.g:745:5: lv_person_5_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getSendSnailMailAccess().getPersonPersonParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_person_5_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSendSnailMailRule());
            	    					}
            	    					add(
            	    						current,
            	    						"person",
            	    						lv_person_5_0,
            	    						"org.xtext.example.bilang.Bilang.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getSendSnailMailAccess().getWithKeyword_6());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getSendSnailMailAccess().getContentKeyword_7());
            		
            // InternalBilang.g:770:3: ( (lv_content_8_0= ruleContent ) )
            // InternalBilang.g:771:4: (lv_content_8_0= ruleContent )
            {
            // InternalBilang.g:771:4: (lv_content_8_0= ruleContent )
            // InternalBilang.g:772:5: lv_content_8_0= ruleContent
            {

            					newCompositeNode(grammarAccess.getSendSnailMailAccess().getContentContentParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_8_0=ruleContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSendSnailMailRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_8_0,
            						"org.xtext.example.bilang.Bilang.Content");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSendSnailMail"


    // $ANTLR start "entryRuleRetrieveDocument"
    // InternalBilang.g:793:1: entryRuleRetrieveDocument returns [EObject current=null] : iv_ruleRetrieveDocument= ruleRetrieveDocument EOF ;
    public final EObject entryRuleRetrieveDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieveDocument = null;


        try {
            // InternalBilang.g:793:57: (iv_ruleRetrieveDocument= ruleRetrieveDocument EOF )
            // InternalBilang.g:794:2: iv_ruleRetrieveDocument= ruleRetrieveDocument EOF
            {
             newCompositeNode(grammarAccess.getRetrieveDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetrieveDocument=ruleRetrieveDocument();

            state._fsp--;

             current =iv_ruleRetrieveDocument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRetrieveDocument"


    // $ANTLR start "ruleRetrieveDocument"
    // InternalBilang.g:800:1: ruleRetrieveDocument returns [EObject current=null] : (otherlv_0= 'retrieve' otherlv_1= 'document' ( (lv_document_2_0= ruleDocument ) ) ) ;
    public final EObject ruleRetrieveDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_document_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:806:2: ( (otherlv_0= 'retrieve' otherlv_1= 'document' ( (lv_document_2_0= ruleDocument ) ) ) )
            // InternalBilang.g:807:2: (otherlv_0= 'retrieve' otherlv_1= 'document' ( (lv_document_2_0= ruleDocument ) ) )
            {
            // InternalBilang.g:807:2: (otherlv_0= 'retrieve' otherlv_1= 'document' ( (lv_document_2_0= ruleDocument ) ) )
            // InternalBilang.g:808:3: otherlv_0= 'retrieve' otherlv_1= 'document' ( (lv_document_2_0= ruleDocument ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrieveDocumentAccess().getRetrieveKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRetrieveDocumentAccess().getDocumentKeyword_1());
            		
            // InternalBilang.g:816:3: ( (lv_document_2_0= ruleDocument ) )
            // InternalBilang.g:817:4: (lv_document_2_0= ruleDocument )
            {
            // InternalBilang.g:817:4: (lv_document_2_0= ruleDocument )
            // InternalBilang.g:818:5: lv_document_2_0= ruleDocument
            {

            					newCompositeNode(grammarAccess.getRetrieveDocumentAccess().getDocumentDocumentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_document_2_0=ruleDocument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetrieveDocumentRule());
            					}
            					set(
            						current,
            						"document",
            						lv_document_2_0,
            						"org.xtext.example.bilang.Bilang.Document");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRetrieveDocument"


    // $ANTLR start "entryRuleRetrieveFullAddress"
    // InternalBilang.g:839:1: entryRuleRetrieveFullAddress returns [EObject current=null] : iv_ruleRetrieveFullAddress= ruleRetrieveFullAddress EOF ;
    public final EObject entryRuleRetrieveFullAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieveFullAddress = null;


        try {
            // InternalBilang.g:839:60: (iv_ruleRetrieveFullAddress= ruleRetrieveFullAddress EOF )
            // InternalBilang.g:840:2: iv_ruleRetrieveFullAddress= ruleRetrieveFullAddress EOF
            {
             newCompositeNode(grammarAccess.getRetrieveFullAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetrieveFullAddress=ruleRetrieveFullAddress();

            state._fsp--;

             current =iv_ruleRetrieveFullAddress; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRetrieveFullAddress"


    // $ANTLR start "ruleRetrieveFullAddress"
    // InternalBilang.g:846:1: ruleRetrieveFullAddress returns [EObject current=null] : (otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAdress_4_0= rulePersonByAddress ) ) ) ;
    public final EObject ruleRetrieveFullAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_personAdress_4_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:852:2: ( (otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAdress_4_0= rulePersonByAddress ) ) ) )
            // InternalBilang.g:853:2: (otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAdress_4_0= rulePersonByAddress ) ) )
            {
            // InternalBilang.g:853:2: (otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAdress_4_0= rulePersonByAddress ) ) )
            // InternalBilang.g:854:3: otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAdress_4_0= rulePersonByAddress ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrieveFullAddressAccess().getRetrieveKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getRetrieveFullAddressAccess().getFullKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getRetrieveFullAddressAccess().getAddressKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getRetrieveFullAddressAccess().getOfKeyword_3());
            		
            // InternalBilang.g:870:3: ( (lv_personAdress_4_0= rulePersonByAddress ) )
            // InternalBilang.g:871:4: (lv_personAdress_4_0= rulePersonByAddress )
            {
            // InternalBilang.g:871:4: (lv_personAdress_4_0= rulePersonByAddress )
            // InternalBilang.g:872:5: lv_personAdress_4_0= rulePersonByAddress
            {

            					newCompositeNode(grammarAccess.getRetrieveFullAddressAccess().getPersonAdressPersonByAddressParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_personAdress_4_0=rulePersonByAddress();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetrieveFullAddressRule());
            					}
            					set(
            						current,
            						"personAdress",
            						lv_personAdress_4_0,
            						"org.xtext.example.bilang.Bilang.PersonByAddress");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRetrieveFullAddress"


    // $ANTLR start "entryRuleRetrievePersons"
    // InternalBilang.g:893:1: entryRuleRetrievePersons returns [EObject current=null] : iv_ruleRetrievePersons= ruleRetrievePersons EOF ;
    public final EObject entryRuleRetrievePersons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrievePersons = null;


        try {
            // InternalBilang.g:893:56: (iv_ruleRetrievePersons= ruleRetrievePersons EOF )
            // InternalBilang.g:894:2: iv_ruleRetrievePersons= ruleRetrievePersons EOF
            {
             newCompositeNode(grammarAccess.getRetrievePersonsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetrievePersons=ruleRetrievePersons();

            state._fsp--;

             current =iv_ruleRetrievePersons; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRetrievePersons"


    // $ANTLR start "ruleRetrievePersons"
    // InternalBilang.g:900:1: ruleRetrievePersons returns [EObject current=null] : (otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) ) ) ;
    public final EObject ruleRetrievePersons() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_personSearch_4_0=null;


        	enterRule();

        try {
            // InternalBilang.g:906:2: ( (otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) ) ) )
            // InternalBilang.g:907:2: (otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) ) )
            {
            // InternalBilang.g:907:2: (otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) ) )
            // InternalBilang.g:908:3: otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrievePersonsAccess().getRetrieveKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRetrievePersonsAccess().getPersonsKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getRetrievePersonsAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRetrievePersonsAccess().getSearchKeyword_3());
            		
            // InternalBilang.g:924:3: ( (lv_personSearch_4_0= RULE_ID ) )
            // InternalBilang.g:925:4: (lv_personSearch_4_0= RULE_ID )
            {
            // InternalBilang.g:925:4: (lv_personSearch_4_0= RULE_ID )
            // InternalBilang.g:926:5: lv_personSearch_4_0= RULE_ID
            {
            lv_personSearch_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_personSearch_4_0, grammarAccess.getRetrievePersonsAccess().getPersonSearchIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRetrievePersonsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"personSearch",
            						lv_personSearch_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRetrievePersons"


    // $ANTLR start "entryRuleCallPerson"
    // InternalBilang.g:946:1: entryRuleCallPerson returns [EObject current=null] : iv_ruleCallPerson= ruleCallPerson EOF ;
    public final EObject entryRuleCallPerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallPerson = null;


        try {
            // InternalBilang.g:946:51: (iv_ruleCallPerson= ruleCallPerson EOF )
            // InternalBilang.g:947:2: iv_ruleCallPerson= ruleCallPerson EOF
            {
             newCompositeNode(grammarAccess.getCallPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallPerson=ruleCallPerson();

            state._fsp--;

             current =iv_ruleCallPerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallPerson"


    // $ANTLR start "ruleCallPerson"
    // InternalBilang.g:953:1: ruleCallPerson returns [EObject current=null] : (otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) ) ) ;
    public final EObject ruleCallPerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_person_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:959:2: ( (otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) ) ) )
            // InternalBilang.g:960:2: (otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) ) )
            {
            // InternalBilang.g:960:2: (otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) ) )
            // InternalBilang.g:961:3: otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getCallPersonAccess().getPhoneKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCallPersonAccess().getCallKeyword_1());
            		
            // InternalBilang.g:969:3: ( (lv_person_2_0= rulePerson ) )
            // InternalBilang.g:970:4: (lv_person_2_0= rulePerson )
            {
            // InternalBilang.g:970:4: (lv_person_2_0= rulePerson )
            // InternalBilang.g:971:5: lv_person_2_0= rulePerson
            {

            					newCompositeNode(grammarAccess.getCallPersonAccess().getPersonPersonParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_person_2_0=rulePerson();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCallPersonRule());
            					}
            					set(
            						current,
            						"person",
            						lv_person_2_0,
            						"org.xtext.example.bilang.Bilang.Person");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallPerson"


    // $ANTLR start "entryRuleAddPerson"
    // InternalBilang.g:992:1: entryRuleAddPerson returns [EObject current=null] : iv_ruleAddPerson= ruleAddPerson EOF ;
    public final EObject entryRuleAddPerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddPerson = null;


        try {
            // InternalBilang.g:992:50: (iv_ruleAddPerson= ruleAddPerson EOF )
            // InternalBilang.g:993:2: iv_ruleAddPerson= ruleAddPerson EOF
            {
             newCompositeNode(grammarAccess.getAddPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddPerson=ruleAddPerson();

            state._fsp--;

             current =iv_ruleAddPerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddPerson"


    // $ANTLR start "ruleAddPerson"
    // InternalBilang.g:999:1: ruleAddPerson returns [EObject current=null] : (otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+ ) ;
    public final EObject ruleAddPerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_alias_1_0 = null;

        EObject lv_person_3_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1005:2: ( (otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+ ) )
            // InternalBilang.g:1006:2: (otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+ )
            {
            // InternalBilang.g:1006:2: (otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+ )
            // InternalBilang.g:1007:3: otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+
            {
            otherlv_0=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAddPersonAccess().getAddKeyword_0());
            		
            // InternalBilang.g:1011:3: ( (lv_alias_1_0= rulePersonByAlias ) )
            // InternalBilang.g:1012:4: (lv_alias_1_0= rulePersonByAlias )
            {
            // InternalBilang.g:1012:4: (lv_alias_1_0= rulePersonByAlias )
            // InternalBilang.g:1013:5: lv_alias_1_0= rulePersonByAlias
            {

            					newCompositeNode(grammarAccess.getAddPersonAccess().getAliasPersonByAliasParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_alias_1_0=rulePersonByAlias();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddPersonRule());
            					}
            					set(
            						current,
            						"alias",
            						lv_alias_1_0,
            						"org.xtext.example.bilang.Bilang.PersonByAlias");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBilang.g:1030:3: (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBilang.g:1031:4: otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAddPersonAccess().getAndKeyword_2_0());
            	    			
            	    // InternalBilang.g:1035:4: ( (lv_person_3_0= rulePerson ) )
            	    // InternalBilang.g:1036:5: (lv_person_3_0= rulePerson )
            	    {
            	    // InternalBilang.g:1036:5: (lv_person_3_0= rulePerson )
            	    // InternalBilang.g:1037:6: lv_person_3_0= rulePerson
            	    {

            	    						newCompositeNode(grammarAccess.getAddPersonAccess().getPersonPersonParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_person_3_0=rulePerson();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddPersonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"person",
            	    							lv_person_3_0,
            	    							"org.xtext.example.bilang.Bilang.Person");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddPerson"


    // $ANTLR start "entryRuleDeletePerson"
    // InternalBilang.g:1059:1: entryRuleDeletePerson returns [EObject current=null] : iv_ruleDeletePerson= ruleDeletePerson EOF ;
    public final EObject entryRuleDeletePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletePerson = null;


        try {
            // InternalBilang.g:1059:53: (iv_ruleDeletePerson= ruleDeletePerson EOF )
            // InternalBilang.g:1060:2: iv_ruleDeletePerson= ruleDeletePerson EOF
            {
             newCompositeNode(grammarAccess.getDeletePersonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeletePerson=ruleDeletePerson();

            state._fsp--;

             current =iv_ruleDeletePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeletePerson"


    // $ANTLR start "ruleDeletePerson"
    // InternalBilang.g:1066:1: ruleDeletePerson returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) ) ) ;
    public final EObject ruleDeletePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_alias_1_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1072:2: ( (otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) ) ) )
            // InternalBilang.g:1073:2: (otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) ) )
            {
            // InternalBilang.g:1073:2: (otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) ) )
            // InternalBilang.g:1074:3: otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDeletePersonAccess().getDeleteKeyword_0());
            		
            // InternalBilang.g:1078:3: ( (lv_alias_1_0= rulePersonByAlias ) )
            // InternalBilang.g:1079:4: (lv_alias_1_0= rulePersonByAlias )
            {
            // InternalBilang.g:1079:4: (lv_alias_1_0= rulePersonByAlias )
            // InternalBilang.g:1080:5: lv_alias_1_0= rulePersonByAlias
            {

            					newCompositeNode(grammarAccess.getDeletePersonAccess().getAliasPersonByAliasParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_alias_1_0=rulePersonByAlias();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeletePersonRule());
            					}
            					set(
            						current,
            						"alias",
            						lv_alias_1_0,
            						"org.xtext.example.bilang.Bilang.PersonByAlias");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeletePerson"


    // $ANTLR start "entryRulePerson"
    // InternalBilang.g:1101:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalBilang.g:1101:47: (iv_rulePerson= rulePerson EOF )
            // InternalBilang.g:1102:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalBilang.g:1108:1: rulePerson returns [EObject current=null] : (this_PersonByEmail_0= rulePersonByEmail | this_PersonByAlias_1= rulePersonByAlias | this_PersonByName_2= rulePersonByName | this_PersonByPhone_3= rulePersonByPhone | this_PersonByAddress_4= rulePersonByAddress ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        EObject this_PersonByEmail_0 = null;

        EObject this_PersonByAlias_1 = null;

        EObject this_PersonByName_2 = null;

        EObject this_PersonByPhone_3 = null;

        EObject this_PersonByAddress_4 = null;



        	enterRule();

        try {
            // InternalBilang.g:1114:2: ( (this_PersonByEmail_0= rulePersonByEmail | this_PersonByAlias_1= rulePersonByAlias | this_PersonByName_2= rulePersonByName | this_PersonByPhone_3= rulePersonByPhone | this_PersonByAddress_4= rulePersonByAddress ) )
            // InternalBilang.g:1115:2: (this_PersonByEmail_0= rulePersonByEmail | this_PersonByAlias_1= rulePersonByAlias | this_PersonByName_2= rulePersonByName | this_PersonByPhone_3= rulePersonByPhone | this_PersonByAddress_4= rulePersonByAddress )
            {
            // InternalBilang.g:1115:2: (this_PersonByEmail_0= rulePersonByEmail | this_PersonByAlias_1= rulePersonByAlias | this_PersonByName_2= rulePersonByName | this_PersonByPhone_3= rulePersonByPhone | this_PersonByAddress_4= rulePersonByAddress )
            int alt12=5;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==45) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==20) ) {
                    switch ( input.LA(3) ) {
                    case 46:
                        {
                        alt12=2;
                        }
                        break;
                    case 50:
                        {
                        alt12=5;
                        }
                        break;
                    case 41:
                        {
                        alt12=4;
                        }
                        break;
                    case 47:
                        {
                        alt12=3;
                        }
                        break;
                    case 27:
                        {
                        alt12=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBilang.g:1116:3: this_PersonByEmail_0= rulePersonByEmail
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getPersonByEmailParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersonByEmail_0=rulePersonByEmail();

                    state._fsp--;


                    			current = this_PersonByEmail_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:1125:3: this_PersonByAlias_1= rulePersonByAlias
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getPersonByAliasParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersonByAlias_1=rulePersonByAlias();

                    state._fsp--;


                    			current = this_PersonByAlias_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBilang.g:1134:3: this_PersonByName_2= rulePersonByName
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getPersonByNameParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersonByName_2=rulePersonByName();

                    state._fsp--;


                    			current = this_PersonByName_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBilang.g:1143:3: this_PersonByPhone_3= rulePersonByPhone
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getPersonByPhoneParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersonByPhone_3=rulePersonByPhone();

                    state._fsp--;


                    			current = this_PersonByPhone_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBilang.g:1152:3: this_PersonByAddress_4= rulePersonByAddress
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getPersonByAddressParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersonByAddress_4=rulePersonByAddress();

                    state._fsp--;


                    			current = this_PersonByAddress_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRulePersonByEmail"
    // InternalBilang.g:1164:1: entryRulePersonByEmail returns [EObject current=null] : iv_rulePersonByEmail= rulePersonByEmail EOF ;
    public final EObject entryRulePersonByEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByEmail = null;


        try {
            // InternalBilang.g:1164:54: (iv_rulePersonByEmail= rulePersonByEmail EOF )
            // InternalBilang.g:1165:2: iv_rulePersonByEmail= rulePersonByEmail EOF
            {
             newCompositeNode(grammarAccess.getPersonByEmailRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonByEmail=rulePersonByEmail();

            state._fsp--;

             current =iv_rulePersonByEmail; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonByEmail"


    // $ANTLR start "rulePersonByEmail"
    // InternalBilang.g:1171:1: rulePersonByEmail returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) ) ) ;
    public final EObject rulePersonByEmail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_emailaddress_3_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1177:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) ) ) )
            // InternalBilang.g:1178:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) ) )
            {
            // InternalBilang.g:1178:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) ) )
            // InternalBilang.g:1179:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByEmailAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByEmailAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByEmailAccess().getEmailKeyword_2());
            		
            // InternalBilang.g:1191:3: ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) )
            // InternalBilang.g:1192:4: (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS )
            {
            // InternalBilang.g:1192:4: (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS )
            // InternalBilang.g:1193:5: lv_emailaddress_3_0= RULE_EMAIL_ADDRESS
            {
            lv_emailaddress_3_0=(Token)match(input,RULE_EMAIL_ADDRESS,FOLLOW_2); 

            					newLeafNode(lv_emailaddress_3_0, grammarAccess.getPersonByEmailAccess().getEmailaddressEMAIL_ADDRESSTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonByEmailRule());
            					}
            					setWithLastConsumed(
            						current,
            						"emailaddress",
            						lv_emailaddress_3_0,
            						"org.xtext.example.bilang.Bilang.EMAIL_ADDRESS");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonByEmail"


    // $ANTLR start "entryRulePersonByAlias"
    // InternalBilang.g:1213:1: entryRulePersonByAlias returns [EObject current=null] : iv_rulePersonByAlias= rulePersonByAlias EOF ;
    public final EObject entryRulePersonByAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByAlias = null;


        try {
            // InternalBilang.g:1213:54: (iv_rulePersonByAlias= rulePersonByAlias EOF )
            // InternalBilang.g:1214:2: iv_rulePersonByAlias= rulePersonByAlias EOF
            {
             newCompositeNode(grammarAccess.getPersonByAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonByAlias=rulePersonByAlias();

            state._fsp--;

             current =iv_rulePersonByAlias; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonByAlias"


    // $ANTLR start "rulePersonByAlias"
    // InternalBilang.g:1220:1: rulePersonByAlias returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) ) ;
    public final EObject rulePersonByAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1226:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) ) )
            // InternalBilang.g:1227:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )
            {
            // InternalBilang.g:1227:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )
            // InternalBilang.g:1228:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByAliasAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByAliasAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByAliasAccess().getAliasKeyword_2());
            		
            // InternalBilang.g:1240:3: ( (lv_alias_3_0= RULE_ID ) )
            // InternalBilang.g:1241:4: (lv_alias_3_0= RULE_ID )
            {
            // InternalBilang.g:1241:4: (lv_alias_3_0= RULE_ID )
            // InternalBilang.g:1242:5: lv_alias_3_0= RULE_ID
            {
            lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_alias_3_0, grammarAccess.getPersonByAliasAccess().getAliasIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonByAliasRule());
            					}
            					setWithLastConsumed(
            						current,
            						"alias",
            						lv_alias_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonByAlias"


    // $ANTLR start "entryRulePersonByName"
    // InternalBilang.g:1262:1: entryRulePersonByName returns [EObject current=null] : iv_rulePersonByName= rulePersonByName EOF ;
    public final EObject entryRulePersonByName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByName = null;


        try {
            // InternalBilang.g:1262:53: (iv_rulePersonByName= rulePersonByName EOF )
            // InternalBilang.g:1263:2: iv_rulePersonByName= rulePersonByName EOF
            {
             newCompositeNode(grammarAccess.getPersonByNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonByName=rulePersonByName();

            state._fsp--;

             current =iv_rulePersonByName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonByName"


    // $ANTLR start "rulePersonByName"
    // InternalBilang.g:1269:1: rulePersonByName returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= RULE_STRING ) ) ) ;
    public final EObject rulePersonByName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_firstName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_lastName_8_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1275:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= RULE_STRING ) ) ) )
            // InternalBilang.g:1276:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= RULE_STRING ) ) )
            {
            // InternalBilang.g:1276:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= RULE_STRING ) ) )
            // InternalBilang.g:1277:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByNameAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByNameAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByNameAccess().getFirstKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonByNameAccess().getNameKeyword_3());
            		
            // InternalBilang.g:1293:3: ( (lv_firstName_4_0= RULE_ID ) )
            // InternalBilang.g:1294:4: (lv_firstName_4_0= RULE_ID )
            {
            // InternalBilang.g:1294:4: (lv_firstName_4_0= RULE_ID )
            // InternalBilang.g:1295:5: lv_firstName_4_0= RULE_ID
            {
            lv_firstName_4_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_firstName_4_0, grammarAccess.getPersonByNameAccess().getFirstNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonByNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"firstName",
            						lv_firstName_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonByNameAccess().getAndKeyword_5());
            		
            otherlv_6=(Token)match(input,48,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonByNameAccess().getLastKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_37); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonByNameAccess().getNameKeyword_7());
            		
            // InternalBilang.g:1323:3: ( (lv_lastName_8_0= RULE_STRING ) )
            // InternalBilang.g:1324:4: (lv_lastName_8_0= RULE_STRING )
            {
            // InternalBilang.g:1324:4: (lv_lastName_8_0= RULE_STRING )
            // InternalBilang.g:1325:5: lv_lastName_8_0= RULE_STRING
            {
            lv_lastName_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_lastName_8_0, grammarAccess.getPersonByNameAccess().getLastNameSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonByNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lastName",
            						lv_lastName_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonByName"


    // $ANTLR start "entryRulePersonByPhone"
    // InternalBilang.g:1345:1: entryRulePersonByPhone returns [EObject current=null] : iv_rulePersonByPhone= rulePersonByPhone EOF ;
    public final EObject entryRulePersonByPhone() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByPhone = null;


        try {
            // InternalBilang.g:1345:54: (iv_rulePersonByPhone= rulePersonByPhone EOF )
            // InternalBilang.g:1346:2: iv_rulePersonByPhone= rulePersonByPhone EOF
            {
             newCompositeNode(grammarAccess.getPersonByPhoneRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonByPhone=rulePersonByPhone();

            state._fsp--;

             current =iv_rulePersonByPhone; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonByPhone"


    // $ANTLR start "rulePersonByPhone"
    // InternalBilang.g:1352:1: rulePersonByPhone returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) ) ) ;
    public final EObject rulePersonByPhone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_phone_4_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1358:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) ) ) )
            // InternalBilang.g:1359:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) ) )
            {
            // InternalBilang.g:1359:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) ) )
            // InternalBilang.g:1360:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByPhoneAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByPhoneAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByPhoneAccess().getPhoneKeyword_2());
            		
            otherlv_3=(Token)match(input,49,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonByPhoneAccess().getNumberKeyword_3());
            		
            // InternalBilang.g:1376:3: ( (lv_phone_4_0= RULE_PHONE_NUMBER ) )
            // InternalBilang.g:1377:4: (lv_phone_4_0= RULE_PHONE_NUMBER )
            {
            // InternalBilang.g:1377:4: (lv_phone_4_0= RULE_PHONE_NUMBER )
            // InternalBilang.g:1378:5: lv_phone_4_0= RULE_PHONE_NUMBER
            {
            lv_phone_4_0=(Token)match(input,RULE_PHONE_NUMBER,FOLLOW_2); 

            					newLeafNode(lv_phone_4_0, grammarAccess.getPersonByPhoneAccess().getPhonePHONE_NUMBERTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonByPhoneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"phone",
            						lv_phone_4_0,
            						"org.xtext.example.bilang.Bilang.PHONE_NUMBER");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonByPhone"


    // $ANTLR start "entryRulePersonByAddress"
    // InternalBilang.g:1398:1: entryRulePersonByAddress returns [EObject current=null] : iv_rulePersonByAddress= rulePersonByAddress EOF ;
    public final EObject entryRulePersonByAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByAddress = null;


        try {
            // InternalBilang.g:1398:56: (iv_rulePersonByAddress= rulePersonByAddress EOF )
            // InternalBilang.g:1399:2: iv_rulePersonByAddress= rulePersonByAddress EOF
            {
             newCompositeNode(grammarAccess.getPersonByAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonByAddress=rulePersonByAddress();

            state._fsp--;

             current =iv_rulePersonByAddress; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonByAddress"


    // $ANTLR start "rulePersonByAddress"
    // InternalBilang.g:1405:1: rulePersonByAddress returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_HOUSENUMBER ) ) ) ;
    public final EObject rulePersonByAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_zipcode_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_housenumber_8_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1411:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_HOUSENUMBER ) ) ) )
            // InternalBilang.g:1412:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_HOUSENUMBER ) ) )
            {
            // InternalBilang.g:1412:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_HOUSENUMBER ) ) )
            // InternalBilang.g:1413:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_HOUSENUMBER ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByAddressAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByAddressAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,50,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByAddressAccess().getZipKeyword_2());
            		
            otherlv_3=(Token)match(input,51,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonByAddressAccess().getCodeKeyword_3());
            		
            // InternalBilang.g:1429:3: ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) )
            // InternalBilang.g:1430:4: (lv_zipcode_4_0= RULE_DUTCH_POSTCODE )
            {
            // InternalBilang.g:1430:4: (lv_zipcode_4_0= RULE_DUTCH_POSTCODE )
            // InternalBilang.g:1431:5: lv_zipcode_4_0= RULE_DUTCH_POSTCODE
            {
            lv_zipcode_4_0=(Token)match(input,RULE_DUTCH_POSTCODE,FOLLOW_10); 

            					newLeafNode(lv_zipcode_4_0, grammarAccess.getPersonByAddressAccess().getZipcodeDUTCH_POSTCODETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonByAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"zipcode",
            						lv_zipcode_4_0,
            						"org.xtext.example.bilang.Bilang.DUTCH_POSTCODE");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_44); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonByAddressAccess().getAndKeyword_5());
            		
            otherlv_6=(Token)match(input,52,FOLLOW_39); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonByAddressAccess().getHouseKeyword_6());
            		
            otherlv_7=(Token)match(input,49,FOLLOW_45); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonByAddressAccess().getNumberKeyword_7());
            		
            // InternalBilang.g:1459:3: ( (lv_housenumber_8_0= RULE_HOUSENUMBER ) )
            // InternalBilang.g:1460:4: (lv_housenumber_8_0= RULE_HOUSENUMBER )
            {
            // InternalBilang.g:1460:4: (lv_housenumber_8_0= RULE_HOUSENUMBER )
            // InternalBilang.g:1461:5: lv_housenumber_8_0= RULE_HOUSENUMBER
            {
            lv_housenumber_8_0=(Token)match(input,RULE_HOUSENUMBER,FOLLOW_2); 

            					newLeafNode(lv_housenumber_8_0, grammarAccess.getPersonByAddressAccess().getHousenumberHOUSENUMBERTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonByAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"housenumber",
            						lv_housenumber_8_0,
            						"org.xtext.example.bilang.Bilang.HOUSENUMBER");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonByAddress"


    // $ANTLR start "entryRuleContent"
    // InternalBilang.g:1481:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalBilang.g:1481:48: (iv_ruleContent= ruleContent EOF )
            // InternalBilang.g:1482:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalBilang.g:1488:1: ruleContent returns [EObject current=null] : (this_Message_0= ruleMessage | this_Document_1= ruleDocument ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_Document_1 = null;



        	enterRule();

        try {
            // InternalBilang.g:1494:2: ( (this_Message_0= ruleMessage | this_Document_1= ruleDocument ) )
            // InternalBilang.g:1495:2: (this_Message_0= ruleMessage | this_Document_1= ruleDocument )
            {
            // InternalBilang.g:1495:2: (this_Message_0= ruleMessage | this_Document_1= ruleDocument )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==53) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=54 && LA13_0<=55)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBilang.g:1496:3: this_Message_0= ruleMessage
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Message_0=ruleMessage();

                    state._fsp--;


                    			current = this_Message_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:1505:3: this_Document_1= ruleDocument
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getDocumentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Document_1=ruleDocument();

                    state._fsp--;


                    			current = this_Document_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleMessage"
    // InternalBilang.g:1517:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalBilang.g:1517:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalBilang.g:1518:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalBilang.g:1524:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_message_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_message_1_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1530:2: ( (otherlv_0= 'message' ( (lv_message_1_0= RULE_STRING ) ) ) )
            // InternalBilang.g:1531:2: (otherlv_0= 'message' ( (lv_message_1_0= RULE_STRING ) ) )
            {
            // InternalBilang.g:1531:2: (otherlv_0= 'message' ( (lv_message_1_0= RULE_STRING ) ) )
            // InternalBilang.g:1532:3: otherlv_0= 'message' ( (lv_message_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
            		
            // InternalBilang.g:1536:3: ( (lv_message_1_0= RULE_STRING ) )
            // InternalBilang.g:1537:4: (lv_message_1_0= RULE_STRING )
            {
            // InternalBilang.g:1537:4: (lv_message_1_0= RULE_STRING )
            // InternalBilang.g:1538:5: lv_message_1_0= RULE_STRING
            {
            lv_message_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_message_1_0, grammarAccess.getMessageAccess().getMessageSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleDocument"
    // InternalBilang.g:1558:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalBilang.g:1558:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalBilang.g:1559:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalBilang.g:1565:1: ruleDocument returns [EObject current=null] : (this_Invoice_0= ruleInvoice | this_DocumentPerson_1= ruleDocumentPerson ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject this_Invoice_0 = null;

        EObject this_DocumentPerson_1 = null;



        	enterRule();

        try {
            // InternalBilang.g:1571:2: ( (this_Invoice_0= ruleInvoice | this_DocumentPerson_1= ruleDocumentPerson ) )
            // InternalBilang.g:1572:2: (this_Invoice_0= ruleInvoice | this_DocumentPerson_1= ruleDocumentPerson )
            {
            // InternalBilang.g:1572:2: (this_Invoice_0= ruleInvoice | this_DocumentPerson_1= ruleDocumentPerson )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==54) ) {
                alt14=1;
            }
            else if ( (LA14_0==55) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBilang.g:1573:3: this_Invoice_0= ruleInvoice
                    {

                    			newCompositeNode(grammarAccess.getDocumentAccess().getInvoiceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Invoice_0=ruleInvoice();

                    state._fsp--;


                    			current = this_Invoice_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:1582:3: this_DocumentPerson_1= ruleDocumentPerson
                    {

                    			newCompositeNode(grammarAccess.getDocumentAccess().getDocumentPersonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DocumentPerson_1=ruleDocumentPerson();

                    state._fsp--;


                    			current = this_DocumentPerson_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleInvoice"
    // InternalBilang.g:1594:1: entryRuleInvoice returns [EObject current=null] : iv_ruleInvoice= ruleInvoice EOF ;
    public final EObject entryRuleInvoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvoice = null;


        try {
            // InternalBilang.g:1594:48: (iv_ruleInvoice= ruleInvoice EOF )
            // InternalBilang.g:1595:2: iv_ruleInvoice= ruleInvoice EOF
            {
             newCompositeNode(grammarAccess.getInvoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvoice=ruleInvoice();

            state._fsp--;

             current =iv_ruleInvoice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvoice"


    // $ANTLR start "ruleInvoice"
    // InternalBilang.g:1601:1: ruleInvoice returns [EObject current=null] : (otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) ) ) ;
    public final EObject ruleInvoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_code_3_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1607:2: ( (otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) ) ) )
            // InternalBilang.g:1608:2: (otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) ) )
            {
            // InternalBilang.g:1608:2: (otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) ) )
            // InternalBilang.g:1609:3: otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getInvoiceAccess().getInvoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getInvoiceAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getInvoiceAccess().getCodeKeyword_2());
            		
            // InternalBilang.g:1621:3: ( (lv_code_3_0= RULE_INT ) )
            // InternalBilang.g:1622:4: (lv_code_3_0= RULE_INT )
            {
            // InternalBilang.g:1622:4: (lv_code_3_0= RULE_INT )
            // InternalBilang.g:1623:5: lv_code_3_0= RULE_INT
            {
            lv_code_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_code_3_0, grammarAccess.getInvoiceAccess().getCodeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInvoiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvoice"


    // $ANTLR start "entryRuleDocumentPerson"
    // InternalBilang.g:1643:1: entryRuleDocumentPerson returns [EObject current=null] : iv_ruleDocumentPerson= ruleDocumentPerson EOF ;
    public final EObject entryRuleDocumentPerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentPerson = null;


        try {
            // InternalBilang.g:1643:55: (iv_ruleDocumentPerson= ruleDocumentPerson EOF )
            // InternalBilang.g:1644:2: iv_ruleDocumentPerson= ruleDocumentPerson EOF
            {
             newCompositeNode(grammarAccess.getDocumentPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentPerson=ruleDocumentPerson();

            state._fsp--;

             current =iv_ruleDocumentPerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentPerson"


    // $ANTLR start "ruleDocumentPerson"
    // InternalBilang.g:1650:1: ruleDocumentPerson returns [EObject current=null] : (otherlv_0= 'information' otherlv_1= 'about' ( (lv_person_2_0= rulePerson ) ) ) ;
    public final EObject ruleDocumentPerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_person_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1656:2: ( (otherlv_0= 'information' otherlv_1= 'about' ( (lv_person_2_0= rulePerson ) ) ) )
            // InternalBilang.g:1657:2: (otherlv_0= 'information' otherlv_1= 'about' ( (lv_person_2_0= rulePerson ) ) )
            {
            // InternalBilang.g:1657:2: (otherlv_0= 'information' otherlv_1= 'about' ( (lv_person_2_0= rulePerson ) ) )
            // InternalBilang.g:1658:3: otherlv_0= 'information' otherlv_1= 'about' ( (lv_person_2_0= rulePerson ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentPersonAccess().getInformationKeyword_0());
            		
            otherlv_1=(Token)match(input,56,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentPersonAccess().getAboutKeyword_1());
            		
            // InternalBilang.g:1666:3: ( (lv_person_2_0= rulePerson ) )
            // InternalBilang.g:1667:4: (lv_person_2_0= rulePerson )
            {
            // InternalBilang.g:1667:4: (lv_person_2_0= rulePerson )
            // InternalBilang.g:1668:5: lv_person_2_0= rulePerson
            {

            					newCompositeNode(grammarAccess.getDocumentPersonAccess().getPersonPersonParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_person_2_0=rulePerson();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentPersonRule());
            					}
            					set(
            						current,
            						"person",
            						lv_person_2_0,
            						"org.xtext.example.bilang.Bilang.Person");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumentPerson"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00001A0402000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000000000L});

}