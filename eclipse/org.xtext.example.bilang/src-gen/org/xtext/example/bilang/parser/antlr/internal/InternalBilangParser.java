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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EMAIL_ADDRESS", "RULE_PHONE_NUMBER", "RULE_DUTCH_POSTCODE", "RULE_HOUSENUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'compound'", "'process'", "'task'", "'abstract'", "'with'", "'name'", "'and'", "'parameter'", "'value'", "'send'", "'an'", "'email'", "'to'", "'content'", "'sms'", "'a'", "'snail'", "'mail'", "'retrieve'", "'document'", "'full'", "'address'", "'of'", "'persons'", "'search'", "'phone'", "'call'", "'add'", "'delete'", "'person'", "'alias'", "'first'", "'last'", "'number'", "'zip'", "'code'", "'house'", "'message'", "'invoice'", "'information'", "'about'"
    };
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
    // InternalBilang.g:71:1: ruleModel returns [EObject current=null] : (this_Task_0= ruleTask | this_CompoundProcess_1= ruleCompoundProcess | this_AbstractProcess_2= ruleAbstractProcess ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Task_0 = null;

        EObject this_CompoundProcess_1 = null;

        EObject this_AbstractProcess_2 = null;



        	enterRule();

        try {
            // InternalBilang.g:77:2: ( (this_Task_0= ruleTask | this_CompoundProcess_1= ruleCompoundProcess | this_AbstractProcess_2= ruleAbstractProcess ) )
            // InternalBilang.g:78:2: (this_Task_0= ruleTask | this_CompoundProcess_1= ruleCompoundProcess | this_AbstractProcess_2= ruleAbstractProcess )
            {
            // InternalBilang.g:78:2: (this_Task_0= ruleTask | this_CompoundProcess_1= ruleCompoundProcess | this_AbstractProcess_2= ruleAbstractProcess )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 24:
            case 33:
            case 40:
            case 42:
            case 43:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 18:
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
    // InternalBilang.g:109:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalBilang.g:109:45: (iv_ruleTask= ruleTask EOF )
            // InternalBilang.g:110:2: iv_ruleTask= ruleTask EOF
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
    // InternalBilang.g:116:1: ruleTask returns [EObject current=null] : (this_SendTask_0= ruleSendTask | this_RetrieveTask_1= ruleRetrieveTask | this_PersonTask_2= rulePersonTask ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        EObject this_SendTask_0 = null;

        EObject this_RetrieveTask_1 = null;

        EObject this_PersonTask_2 = null;



        	enterRule();

        try {
            // InternalBilang.g:122:2: ( (this_SendTask_0= ruleSendTask | this_RetrieveTask_1= ruleRetrieveTask | this_PersonTask_2= rulePersonTask ) )
            // InternalBilang.g:123:2: (this_SendTask_0= ruleSendTask | this_RetrieveTask_1= ruleRetrieveTask | this_PersonTask_2= rulePersonTask )
            {
            // InternalBilang.g:123:2: (this_SendTask_0= ruleSendTask | this_RetrieveTask_1= ruleRetrieveTask | this_PersonTask_2= rulePersonTask )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 40:
            case 42:
            case 43:
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
                    // InternalBilang.g:124:3: this_SendTask_0= ruleSendTask
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getSendTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendTask_0=ruleSendTask();

                    state._fsp--;


                    			current = this_SendTask_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:133:3: this_RetrieveTask_1= ruleRetrieveTask
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getRetrieveTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RetrieveTask_1=ruleRetrieveTask();

                    state._fsp--;


                    			current = this_RetrieveTask_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBilang.g:142:3: this_PersonTask_2= rulePersonTask
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getPersonTaskParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersonTask_2=rulePersonTask();

                    state._fsp--;


                    			current = this_PersonTask_2;
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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleCompoundProcess"
    // InternalBilang.g:154:1: entryRuleCompoundProcess returns [EObject current=null] : iv_ruleCompoundProcess= ruleCompoundProcess EOF ;
    public final EObject entryRuleCompoundProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundProcess = null;


        try {
            // InternalBilang.g:154:56: (iv_ruleCompoundProcess= ruleCompoundProcess EOF )
            // InternalBilang.g:155:2: iv_ruleCompoundProcess= ruleCompoundProcess EOF
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
    // InternalBilang.g:161:1: ruleCompoundProcess returns [EObject current=null] : (otherlv_0= 'compound' otherlv_1= 'process' (otherlv_2= 'task' ( (lv_task_3_0= ruleTask ) ) )+ ) ;
    public final EObject ruleCompoundProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_task_3_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:167:2: ( (otherlv_0= 'compound' otherlv_1= 'process' (otherlv_2= 'task' ( (lv_task_3_0= ruleTask ) ) )+ ) )
            // InternalBilang.g:168:2: (otherlv_0= 'compound' otherlv_1= 'process' (otherlv_2= 'task' ( (lv_task_3_0= ruleTask ) ) )+ )
            {
            // InternalBilang.g:168:2: (otherlv_0= 'compound' otherlv_1= 'process' (otherlv_2= 'task' ( (lv_task_3_0= ruleTask ) ) )+ )
            // InternalBilang.g:169:3: otherlv_0= 'compound' otherlv_1= 'process' (otherlv_2= 'task' ( (lv_task_3_0= ruleTask ) ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundProcessAccess().getCompoundKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCompoundProcessAccess().getProcessKeyword_1());
            		
            // InternalBilang.g:177:3: (otherlv_2= 'task' ( (lv_task_3_0= ruleTask ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBilang.g:178:4: otherlv_2= 'task' ( (lv_task_3_0= ruleTask ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getCompoundProcessAccess().getTaskKeyword_2_0());
            	    			
            	    // InternalBilang.g:182:4: ( (lv_task_3_0= ruleTask ) )
            	    // InternalBilang.g:183:5: (lv_task_3_0= ruleTask )
            	    {
            	    // InternalBilang.g:183:5: (lv_task_3_0= ruleTask )
            	    // InternalBilang.g:184:6: lv_task_3_0= ruleTask
            	    {

            	    						newCompositeNode(grammarAccess.getCompoundProcessAccess().getTaskTaskParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_task_3_0=ruleTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompoundProcessRule());
            	    						}
            	    						add(
            	    							current,
            	    							"task",
            	    							lv_task_3_0,
            	    							"org.xtext.example.bilang.Bilang.Task");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // InternalBilang.g:206:1: entryRuleAbstractProcess returns [EObject current=null] : iv_ruleAbstractProcess= ruleAbstractProcess EOF ;
    public final EObject entryRuleAbstractProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProcess = null;


        try {
            // InternalBilang.g:206:56: (iv_ruleAbstractProcess= ruleAbstractProcess EOF )
            // InternalBilang.g:207:2: iv_ruleAbstractProcess= ruleAbstractProcess EOF
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
    // InternalBilang.g:213:1: ruleAbstractProcess returns [EObject current=null] : (otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'and' ( (lv_paramValues_6_0= ruleParamValue ) )+ ) ;
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
            // InternalBilang.g:219:2: ( (otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'and' ( (lv_paramValues_6_0= ruleParamValue ) )+ ) )
            // InternalBilang.g:220:2: (otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'and' ( (lv_paramValues_6_0= ruleParamValue ) )+ )
            {
            // InternalBilang.g:220:2: (otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'and' ( (lv_paramValues_6_0= ruleParamValue ) )+ )
            // InternalBilang.g:221:3: otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'and' ( (lv_paramValues_6_0= ruleParamValue ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractProcessAccess().getAbstractKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractProcessAccess().getProcessKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractProcessAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAbstractProcessAccess().getNameKeyword_3());
            		
            // InternalBilang.g:237:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBilang.g:238:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBilang.g:238:4: (lv_name_4_0= RULE_ID )
            // InternalBilang.g:239:5: lv_name_4_0= RULE_ID
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

            otherlv_5=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getAbstractProcessAccess().getAndKeyword_5());
            		
            // InternalBilang.g:259:3: ( (lv_paramValues_6_0= ruleParamValue ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBilang.g:260:4: (lv_paramValues_6_0= ruleParamValue )
            	    {
            	    // InternalBilang.g:260:4: (lv_paramValues_6_0= ruleParamValue )
            	    // InternalBilang.g:261:5: lv_paramValues_6_0= ruleParamValue
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
    // InternalBilang.g:282:1: entryRuleParamValue returns [EObject current=null] : iv_ruleParamValue= ruleParamValue EOF ;
    public final EObject entryRuleParamValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValue = null;


        try {
            // InternalBilang.g:282:51: (iv_ruleParamValue= ruleParamValue EOF )
            // InternalBilang.g:283:2: iv_ruleParamValue= ruleParamValue EOF
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
    // InternalBilang.g:289:1: ruleParamValue returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'value' ( (lv_value_3_0= RULE_ID ) ) ) ;
    public final EObject ruleParamValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_param_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalBilang.g:295:2: ( (otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'value' ( (lv_value_3_0= RULE_ID ) ) ) )
            // InternalBilang.g:296:2: (otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'value' ( (lv_value_3_0= RULE_ID ) ) )
            {
            // InternalBilang.g:296:2: (otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'value' ( (lv_value_3_0= RULE_ID ) ) )
            // InternalBilang.g:297:3: otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'value' ( (lv_value_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getParamValueAccess().getParameterKeyword_0());
            		
            // InternalBilang.g:301:3: ( (lv_param_1_0= RULE_ID ) )
            // InternalBilang.g:302:4: (lv_param_1_0= RULE_ID )
            {
            // InternalBilang.g:302:4: (lv_param_1_0= RULE_ID )
            // InternalBilang.g:303:5: lv_param_1_0= RULE_ID
            {
            lv_param_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getParamValueAccess().getValueKeyword_2());
            		
            // InternalBilang.g:323:3: ( (lv_value_3_0= RULE_ID ) )
            // InternalBilang.g:324:4: (lv_value_3_0= RULE_ID )
            {
            // InternalBilang.g:324:4: (lv_value_3_0= RULE_ID )
            // InternalBilang.g:325:5: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getParamValueAccess().getValueIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
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
    // InternalBilang.g:345:1: entryRuleRetrieveTask returns [EObject current=null] : iv_ruleRetrieveTask= ruleRetrieveTask EOF ;
    public final EObject entryRuleRetrieveTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieveTask = null;


        try {
            // InternalBilang.g:345:53: (iv_ruleRetrieveTask= ruleRetrieveTask EOF )
            // InternalBilang.g:346:2: iv_ruleRetrieveTask= ruleRetrieveTask EOF
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
    // InternalBilang.g:352:1: ruleRetrieveTask returns [EObject current=null] : (this_RetrieveDocument_0= ruleRetrieveDocument | this_RetrieveFullAddress_1= ruleRetrieveFullAddress | this_RetrievePersons_2= ruleRetrievePersons ) ;
    public final EObject ruleRetrieveTask() throws RecognitionException {
        EObject current = null;

        EObject this_RetrieveDocument_0 = null;

        EObject this_RetrieveFullAddress_1 = null;

        EObject this_RetrievePersons_2 = null;



        	enterRule();

        try {
            // InternalBilang.g:358:2: ( (this_RetrieveDocument_0= ruleRetrieveDocument | this_RetrieveFullAddress_1= ruleRetrieveFullAddress | this_RetrievePersons_2= ruleRetrievePersons ) )
            // InternalBilang.g:359:2: (this_RetrieveDocument_0= ruleRetrieveDocument | this_RetrieveFullAddress_1= ruleRetrieveFullAddress | this_RetrievePersons_2= ruleRetrievePersons )
            {
            // InternalBilang.g:359:2: (this_RetrieveDocument_0= ruleRetrieveDocument | this_RetrieveFullAddress_1= ruleRetrieveFullAddress | this_RetrievePersons_2= ruleRetrievePersons )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    alt5=3;
                    }
                    break;
                case 34:
                    {
                    alt5=1;
                    }
                    break;
                case 35:
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
                    // InternalBilang.g:360:3: this_RetrieveDocument_0= ruleRetrieveDocument
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
                    // InternalBilang.g:369:3: this_RetrieveFullAddress_1= ruleRetrieveFullAddress
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
                    // InternalBilang.g:378:3: this_RetrievePersons_2= ruleRetrievePersons
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
    // InternalBilang.g:390:1: entryRuleSendTask returns [EObject current=null] : iv_ruleSendTask= ruleSendTask EOF ;
    public final EObject entryRuleSendTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendTask = null;


        try {
            // InternalBilang.g:390:49: (iv_ruleSendTask= ruleSendTask EOF )
            // InternalBilang.g:391:2: iv_ruleSendTask= ruleSendTask EOF
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
    // InternalBilang.g:397:1: ruleSendTask returns [EObject current=null] : (this_SendEmail_0= ruleSendEmail | this_SendSMS_1= ruleSendSMS | this_SendSnailMail_2= ruleSendSnailMail ) ;
    public final EObject ruleSendTask() throws RecognitionException {
        EObject current = null;

        EObject this_SendEmail_0 = null;

        EObject this_SendSMS_1 = null;

        EObject this_SendSnailMail_2 = null;



        	enterRule();

        try {
            // InternalBilang.g:403:2: ( (this_SendEmail_0= ruleSendEmail | this_SendSMS_1= ruleSendSMS | this_SendSnailMail_2= ruleSendSnailMail ) )
            // InternalBilang.g:404:2: (this_SendEmail_0= ruleSendEmail | this_SendSMS_1= ruleSendSMS | this_SendSnailMail_2= ruleSendSnailMail )
            {
            // InternalBilang.g:404:2: (this_SendEmail_0= ruleSendEmail | this_SendSMS_1= ruleSendSMS | this_SendSnailMail_2= ruleSendSnailMail )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==30) ) {
                    alt6=3;
                }
                else if ( (LA6_1==25) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==29) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==26) ) {
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
                    // InternalBilang.g:405:3: this_SendEmail_0= ruleSendEmail
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
                    // InternalBilang.g:414:3: this_SendSMS_1= ruleSendSMS
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
                    // InternalBilang.g:423:3: this_SendSnailMail_2= ruleSendSnailMail
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
    // InternalBilang.g:435:1: entryRulePersonTask returns [EObject current=null] : iv_rulePersonTask= rulePersonTask EOF ;
    public final EObject entryRulePersonTask() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonTask = null;


        try {
            // InternalBilang.g:435:51: (iv_rulePersonTask= rulePersonTask EOF )
            // InternalBilang.g:436:2: iv_rulePersonTask= rulePersonTask EOF
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
    // InternalBilang.g:442:1: rulePersonTask returns [EObject current=null] : (this_CallPerson_0= ruleCallPerson | this_AddPerson_1= ruleAddPerson | this_DeletePerson_2= ruleDeletePerson ) ;
    public final EObject rulePersonTask() throws RecognitionException {
        EObject current = null;

        EObject this_CallPerson_0 = null;

        EObject this_AddPerson_1 = null;

        EObject this_DeletePerson_2 = null;



        	enterRule();

        try {
            // InternalBilang.g:448:2: ( (this_CallPerson_0= ruleCallPerson | this_AddPerson_1= ruleAddPerson | this_DeletePerson_2= ruleDeletePerson ) )
            // InternalBilang.g:449:2: (this_CallPerson_0= ruleCallPerson | this_AddPerson_1= ruleAddPerson | this_DeletePerson_2= ruleDeletePerson )
            {
            // InternalBilang.g:449:2: (this_CallPerson_0= ruleCallPerson | this_AddPerson_1= ruleAddPerson | this_DeletePerson_2= ruleDeletePerson )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt7=1;
                }
                break;
            case 42:
                {
                alt7=2;
                }
                break;
            case 43:
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
                    // InternalBilang.g:450:3: this_CallPerson_0= ruleCallPerson
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
                    // InternalBilang.g:459:3: this_AddPerson_1= ruleAddPerson
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
                    // InternalBilang.g:468:3: this_DeletePerson_2= ruleDeletePerson
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
    // InternalBilang.g:480:1: entryRuleSendEmail returns [EObject current=null] : iv_ruleSendEmail= ruleSendEmail EOF ;
    public final EObject entryRuleSendEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendEmail = null;


        try {
            // InternalBilang.g:480:50: (iv_ruleSendEmail= ruleSendEmail EOF )
            // InternalBilang.g:481:2: iv_ruleSendEmail= ruleSendEmail EOF
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
    // InternalBilang.g:487:1: ruleSendEmail returns [EObject current=null] : (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) ) ;
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
            // InternalBilang.g:493:2: ( (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) ) )
            // InternalBilang.g:494:2: (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) )
            {
            // InternalBilang.g:494:2: (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) )
            // InternalBilang.g:495:3: otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSendEmailAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSendEmailAccess().getAnKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSendEmailAccess().getEmailKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getSendEmailAccess().getToKeyword_3());
            		
            // InternalBilang.g:511:3: ( (lv_person_4_0= rulePerson ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==44) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBilang.g:512:4: (lv_person_4_0= rulePerson )
            	    {
            	    // InternalBilang.g:512:4: (lv_person_4_0= rulePerson )
            	    // InternalBilang.g:513:5: lv_person_4_0= rulePerson
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

            otherlv_5=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getSendEmailAccess().getWithKeyword_5());
            		
            otherlv_6=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getSendEmailAccess().getContentKeyword_6());
            		
            // InternalBilang.g:538:3: ( (lv_content_7_0= ruleContent ) )
            // InternalBilang.g:539:4: (lv_content_7_0= ruleContent )
            {
            // InternalBilang.g:539:4: (lv_content_7_0= ruleContent )
            // InternalBilang.g:540:5: lv_content_7_0= ruleContent
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
    // InternalBilang.g:561:1: entryRuleSendSMS returns [EObject current=null] : iv_ruleSendSMS= ruleSendSMS EOF ;
    public final EObject entryRuleSendSMS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendSMS = null;


        try {
            // InternalBilang.g:561:48: (iv_ruleSendSMS= ruleSendSMS EOF )
            // InternalBilang.g:562:2: iv_ruleSendSMS= ruleSendSMS EOF
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
    // InternalBilang.g:568:1: ruleSendSMS returns [EObject current=null] : (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) ) ;
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
            // InternalBilang.g:574:2: ( (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) ) )
            // InternalBilang.g:575:2: (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) )
            {
            // InternalBilang.g:575:2: (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) ) )
            // InternalBilang.g:576:3: otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_person_4_0= rulePerson ) )+ otherlv_5= 'with' otherlv_6= 'content' ( (lv_content_7_0= ruleContent ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSendSMSAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSendSMSAccess().getAnKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSendSMSAccess().getSmsKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getSendSMSAccess().getToKeyword_3());
            		
            // InternalBilang.g:592:3: ( (lv_person_4_0= rulePerson ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==44) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBilang.g:593:4: (lv_person_4_0= rulePerson )
            	    {
            	    // InternalBilang.g:593:4: (lv_person_4_0= rulePerson )
            	    // InternalBilang.g:594:5: lv_person_4_0= rulePerson
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

            otherlv_5=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getSendSMSAccess().getWithKeyword_5());
            		
            otherlv_6=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getSendSMSAccess().getContentKeyword_6());
            		
            // InternalBilang.g:619:3: ( (lv_content_7_0= ruleContent ) )
            // InternalBilang.g:620:4: (lv_content_7_0= ruleContent )
            {
            // InternalBilang.g:620:4: (lv_content_7_0= ruleContent )
            // InternalBilang.g:621:5: lv_content_7_0= ruleContent
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
    // InternalBilang.g:642:1: entryRuleSendSnailMail returns [EObject current=null] : iv_ruleSendSnailMail= ruleSendSnailMail EOF ;
    public final EObject entryRuleSendSnailMail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendSnailMail = null;


        try {
            // InternalBilang.g:642:54: (iv_ruleSendSnailMail= ruleSendSnailMail EOF )
            // InternalBilang.g:643:2: iv_ruleSendSnailMail= ruleSendSnailMail EOF
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
    // InternalBilang.g:649:1: ruleSendSnailMail returns [EObject current=null] : (otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_person_5_0= rulePerson ) )+ otherlv_6= 'with' otherlv_7= 'content' ( (lv_content_8_0= ruleContent ) ) ) ;
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
            // InternalBilang.g:655:2: ( (otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_person_5_0= rulePerson ) )+ otherlv_6= 'with' otherlv_7= 'content' ( (lv_content_8_0= ruleContent ) ) ) )
            // InternalBilang.g:656:2: (otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_person_5_0= rulePerson ) )+ otherlv_6= 'with' otherlv_7= 'content' ( (lv_content_8_0= ruleContent ) ) )
            {
            // InternalBilang.g:656:2: (otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_person_5_0= rulePerson ) )+ otherlv_6= 'with' otherlv_7= 'content' ( (lv_content_8_0= ruleContent ) ) )
            // InternalBilang.g:657:3: otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_person_5_0= rulePerson ) )+ otherlv_6= 'with' otherlv_7= 'content' ( (lv_content_8_0= ruleContent ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getSendSnailMailAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getSendSnailMailAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSendSnailMailAccess().getSnailKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getSendSnailMailAccess().getMailKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getSendSnailMailAccess().getToKeyword_4());
            		
            // InternalBilang.g:677:3: ( (lv_person_5_0= rulePerson ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==44) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBilang.g:678:4: (lv_person_5_0= rulePerson )
            	    {
            	    // InternalBilang.g:678:4: (lv_person_5_0= rulePerson )
            	    // InternalBilang.g:679:5: lv_person_5_0= rulePerson
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

            otherlv_6=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getSendSnailMailAccess().getWithKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getSendSnailMailAccess().getContentKeyword_7());
            		
            // InternalBilang.g:704:3: ( (lv_content_8_0= ruleContent ) )
            // InternalBilang.g:705:4: (lv_content_8_0= ruleContent )
            {
            // InternalBilang.g:705:4: (lv_content_8_0= ruleContent )
            // InternalBilang.g:706:5: lv_content_8_0= ruleContent
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
    // InternalBilang.g:727:1: entryRuleRetrieveDocument returns [EObject current=null] : iv_ruleRetrieveDocument= ruleRetrieveDocument EOF ;
    public final EObject entryRuleRetrieveDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieveDocument = null;


        try {
            // InternalBilang.g:727:57: (iv_ruleRetrieveDocument= ruleRetrieveDocument EOF )
            // InternalBilang.g:728:2: iv_ruleRetrieveDocument= ruleRetrieveDocument EOF
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
    // InternalBilang.g:734:1: ruleRetrieveDocument returns [EObject current=null] : (otherlv_0= 'retrieve' otherlv_1= 'document' ( (lv_document_2_0= ruleDocument ) ) ) ;
    public final EObject ruleRetrieveDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_document_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:740:2: ( (otherlv_0= 'retrieve' otherlv_1= 'document' ( (lv_document_2_0= ruleDocument ) ) ) )
            // InternalBilang.g:741:2: (otherlv_0= 'retrieve' otherlv_1= 'document' ( (lv_document_2_0= ruleDocument ) ) )
            {
            // InternalBilang.g:741:2: (otherlv_0= 'retrieve' otherlv_1= 'document' ( (lv_document_2_0= ruleDocument ) ) )
            // InternalBilang.g:742:3: otherlv_0= 'retrieve' otherlv_1= 'document' ( (lv_document_2_0= ruleDocument ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrieveDocumentAccess().getRetrieveKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRetrieveDocumentAccess().getDocumentKeyword_1());
            		
            // InternalBilang.g:750:3: ( (lv_document_2_0= ruleDocument ) )
            // InternalBilang.g:751:4: (lv_document_2_0= ruleDocument )
            {
            // InternalBilang.g:751:4: (lv_document_2_0= ruleDocument )
            // InternalBilang.g:752:5: lv_document_2_0= ruleDocument
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
    // InternalBilang.g:773:1: entryRuleRetrieveFullAddress returns [EObject current=null] : iv_ruleRetrieveFullAddress= ruleRetrieveFullAddress EOF ;
    public final EObject entryRuleRetrieveFullAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieveFullAddress = null;


        try {
            // InternalBilang.g:773:60: (iv_ruleRetrieveFullAddress= ruleRetrieveFullAddress EOF )
            // InternalBilang.g:774:2: iv_ruleRetrieveFullAddress= ruleRetrieveFullAddress EOF
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
    // InternalBilang.g:780:1: ruleRetrieveFullAddress returns [EObject current=null] : (otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAdress_4_0= rulePersonByAddress ) ) ) ;
    public final EObject ruleRetrieveFullAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_personAdress_4_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:786:2: ( (otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAdress_4_0= rulePersonByAddress ) ) ) )
            // InternalBilang.g:787:2: (otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAdress_4_0= rulePersonByAddress ) ) )
            {
            // InternalBilang.g:787:2: (otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAdress_4_0= rulePersonByAddress ) ) )
            // InternalBilang.g:788:3: otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAdress_4_0= rulePersonByAddress ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrieveFullAddressAccess().getRetrieveKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getRetrieveFullAddressAccess().getFullKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getRetrieveFullAddressAccess().getAddressKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getRetrieveFullAddressAccess().getOfKeyword_3());
            		
            // InternalBilang.g:804:3: ( (lv_personAdress_4_0= rulePersonByAddress ) )
            // InternalBilang.g:805:4: (lv_personAdress_4_0= rulePersonByAddress )
            {
            // InternalBilang.g:805:4: (lv_personAdress_4_0= rulePersonByAddress )
            // InternalBilang.g:806:5: lv_personAdress_4_0= rulePersonByAddress
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
    // InternalBilang.g:827:1: entryRuleRetrievePersons returns [EObject current=null] : iv_ruleRetrievePersons= ruleRetrievePersons EOF ;
    public final EObject entryRuleRetrievePersons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrievePersons = null;


        try {
            // InternalBilang.g:827:56: (iv_ruleRetrievePersons= ruleRetrievePersons EOF )
            // InternalBilang.g:828:2: iv_ruleRetrievePersons= ruleRetrievePersons EOF
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
    // InternalBilang.g:834:1: ruleRetrievePersons returns [EObject current=null] : (otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) ) ) ;
    public final EObject ruleRetrievePersons() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_personSearch_4_0=null;


        	enterRule();

        try {
            // InternalBilang.g:840:2: ( (otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) ) ) )
            // InternalBilang.g:841:2: (otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) ) )
            {
            // InternalBilang.g:841:2: (otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) ) )
            // InternalBilang.g:842:3: otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrievePersonsAccess().getRetrieveKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRetrievePersonsAccess().getPersonsKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getRetrievePersonsAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRetrievePersonsAccess().getSearchKeyword_3());
            		
            // InternalBilang.g:858:3: ( (lv_personSearch_4_0= RULE_ID ) )
            // InternalBilang.g:859:4: (lv_personSearch_4_0= RULE_ID )
            {
            // InternalBilang.g:859:4: (lv_personSearch_4_0= RULE_ID )
            // InternalBilang.g:860:5: lv_personSearch_4_0= RULE_ID
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
    // InternalBilang.g:880:1: entryRuleCallPerson returns [EObject current=null] : iv_ruleCallPerson= ruleCallPerson EOF ;
    public final EObject entryRuleCallPerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallPerson = null;


        try {
            // InternalBilang.g:880:51: (iv_ruleCallPerson= ruleCallPerson EOF )
            // InternalBilang.g:881:2: iv_ruleCallPerson= ruleCallPerson EOF
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
    // InternalBilang.g:887:1: ruleCallPerson returns [EObject current=null] : (otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) ) ) ;
    public final EObject ruleCallPerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_person_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:893:2: ( (otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) ) ) )
            // InternalBilang.g:894:2: (otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) ) )
            {
            // InternalBilang.g:894:2: (otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) ) )
            // InternalBilang.g:895:3: otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getCallPersonAccess().getPhoneKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCallPersonAccess().getCallKeyword_1());
            		
            // InternalBilang.g:903:3: ( (lv_person_2_0= rulePerson ) )
            // InternalBilang.g:904:4: (lv_person_2_0= rulePerson )
            {
            // InternalBilang.g:904:4: (lv_person_2_0= rulePerson )
            // InternalBilang.g:905:5: lv_person_2_0= rulePerson
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
    // InternalBilang.g:926:1: entryRuleAddPerson returns [EObject current=null] : iv_ruleAddPerson= ruleAddPerson EOF ;
    public final EObject entryRuleAddPerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddPerson = null;


        try {
            // InternalBilang.g:926:50: (iv_ruleAddPerson= ruleAddPerson EOF )
            // InternalBilang.g:927:2: iv_ruleAddPerson= ruleAddPerson EOF
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
    // InternalBilang.g:933:1: ruleAddPerson returns [EObject current=null] : (otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+ ) ;
    public final EObject ruleAddPerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_alias_1_0 = null;

        EObject lv_person_3_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:939:2: ( (otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+ ) )
            // InternalBilang.g:940:2: (otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+ )
            {
            // InternalBilang.g:940:2: (otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+ )
            // InternalBilang.g:941:3: otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+
            {
            otherlv_0=(Token)match(input,42,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAddPersonAccess().getAddKeyword_0());
            		
            // InternalBilang.g:945:3: ( (lv_alias_1_0= rulePersonByAlias ) )
            // InternalBilang.g:946:4: (lv_alias_1_0= rulePersonByAlias )
            {
            // InternalBilang.g:946:4: (lv_alias_1_0= rulePersonByAlias )
            // InternalBilang.g:947:5: lv_alias_1_0= rulePersonByAlias
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

            // InternalBilang.g:964:3: (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBilang.g:965:4: otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAddPersonAccess().getAndKeyword_2_0());
            	    			
            	    // InternalBilang.g:969:4: ( (lv_person_3_0= rulePerson ) )
            	    // InternalBilang.g:970:5: (lv_person_3_0= rulePerson )
            	    {
            	    // InternalBilang.g:970:5: (lv_person_3_0= rulePerson )
            	    // InternalBilang.g:971:6: lv_person_3_0= rulePerson
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
    // InternalBilang.g:993:1: entryRuleDeletePerson returns [EObject current=null] : iv_ruleDeletePerson= ruleDeletePerson EOF ;
    public final EObject entryRuleDeletePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletePerson = null;


        try {
            // InternalBilang.g:993:53: (iv_ruleDeletePerson= ruleDeletePerson EOF )
            // InternalBilang.g:994:2: iv_ruleDeletePerson= ruleDeletePerson EOF
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
    // InternalBilang.g:1000:1: ruleDeletePerson returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) ) ) ;
    public final EObject ruleDeletePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_alias_1_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1006:2: ( (otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) ) ) )
            // InternalBilang.g:1007:2: (otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) ) )
            {
            // InternalBilang.g:1007:2: (otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) ) )
            // InternalBilang.g:1008:3: otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDeletePersonAccess().getDeleteKeyword_0());
            		
            // InternalBilang.g:1012:3: ( (lv_alias_1_0= rulePersonByAlias ) )
            // InternalBilang.g:1013:4: (lv_alias_1_0= rulePersonByAlias )
            {
            // InternalBilang.g:1013:4: (lv_alias_1_0= rulePersonByAlias )
            // InternalBilang.g:1014:5: lv_alias_1_0= rulePersonByAlias
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
    // InternalBilang.g:1035:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalBilang.g:1035:47: (iv_rulePerson= rulePerson EOF )
            // InternalBilang.g:1036:2: iv_rulePerson= rulePerson EOF
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
    // InternalBilang.g:1042:1: rulePerson returns [EObject current=null] : (this_PersonByEmail_0= rulePersonByEmail | this_PersonByAlias_1= rulePersonByAlias | this_PersonByName_2= rulePersonByName | this_PersonByPhone_3= rulePersonByPhone | this_PersonByAddress_4= rulePersonByAddress ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        EObject this_PersonByEmail_0 = null;

        EObject this_PersonByAlias_1 = null;

        EObject this_PersonByName_2 = null;

        EObject this_PersonByPhone_3 = null;

        EObject this_PersonByAddress_4 = null;



        	enterRule();

        try {
            // InternalBilang.g:1048:2: ( (this_PersonByEmail_0= rulePersonByEmail | this_PersonByAlias_1= rulePersonByAlias | this_PersonByName_2= rulePersonByName | this_PersonByPhone_3= rulePersonByPhone | this_PersonByAddress_4= rulePersonByAddress ) )
            // InternalBilang.g:1049:2: (this_PersonByEmail_0= rulePersonByEmail | this_PersonByAlias_1= rulePersonByAlias | this_PersonByName_2= rulePersonByName | this_PersonByPhone_3= rulePersonByPhone | this_PersonByAddress_4= rulePersonByAddress )
            {
            // InternalBilang.g:1049:2: (this_PersonByEmail_0= rulePersonByEmail | this_PersonByAlias_1= rulePersonByAlias | this_PersonByName_2= rulePersonByName | this_PersonByPhone_3= rulePersonByPhone | this_PersonByAddress_4= rulePersonByAddress )
            int alt12=5;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==19) ) {
                    switch ( input.LA(3) ) {
                    case 49:
                        {
                        alt12=5;
                        }
                        break;
                    case 40:
                        {
                        alt12=4;
                        }
                        break;
                    case 46:
                        {
                        alt12=3;
                        }
                        break;
                    case 26:
                        {
                        alt12=1;
                        }
                        break;
                    case 45:
                        {
                        alt12=2;
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
                    // InternalBilang.g:1050:3: this_PersonByEmail_0= rulePersonByEmail
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
                    // InternalBilang.g:1059:3: this_PersonByAlias_1= rulePersonByAlias
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
                    // InternalBilang.g:1068:3: this_PersonByName_2= rulePersonByName
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
                    // InternalBilang.g:1077:3: this_PersonByPhone_3= rulePersonByPhone
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
                    // InternalBilang.g:1086:3: this_PersonByAddress_4= rulePersonByAddress
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
    // InternalBilang.g:1098:1: entryRulePersonByEmail returns [EObject current=null] : iv_rulePersonByEmail= rulePersonByEmail EOF ;
    public final EObject entryRulePersonByEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByEmail = null;


        try {
            // InternalBilang.g:1098:54: (iv_rulePersonByEmail= rulePersonByEmail EOF )
            // InternalBilang.g:1099:2: iv_rulePersonByEmail= rulePersonByEmail EOF
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
    // InternalBilang.g:1105:1: rulePersonByEmail returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) ) ) ;
    public final EObject rulePersonByEmail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_emailaddress_3_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1111:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) ) ) )
            // InternalBilang.g:1112:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) ) )
            {
            // InternalBilang.g:1112:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) ) )
            // InternalBilang.g:1113:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByEmailAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByEmailAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByEmailAccess().getEmailKeyword_2());
            		
            // InternalBilang.g:1125:3: ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) )
            // InternalBilang.g:1126:4: (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS )
            {
            // InternalBilang.g:1126:4: (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS )
            // InternalBilang.g:1127:5: lv_emailaddress_3_0= RULE_EMAIL_ADDRESS
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
    // InternalBilang.g:1147:1: entryRulePersonByAlias returns [EObject current=null] : iv_rulePersonByAlias= rulePersonByAlias EOF ;
    public final EObject entryRulePersonByAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByAlias = null;


        try {
            // InternalBilang.g:1147:54: (iv_rulePersonByAlias= rulePersonByAlias EOF )
            // InternalBilang.g:1148:2: iv_rulePersonByAlias= rulePersonByAlias EOF
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
    // InternalBilang.g:1154:1: rulePersonByAlias returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) ) ;
    public final EObject rulePersonByAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1160:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) ) )
            // InternalBilang.g:1161:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )
            {
            // InternalBilang.g:1161:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )
            // InternalBilang.g:1162:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByAliasAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByAliasAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByAliasAccess().getAliasKeyword_2());
            		
            // InternalBilang.g:1174:3: ( (lv_alias_3_0= RULE_ID ) )
            // InternalBilang.g:1175:4: (lv_alias_3_0= RULE_ID )
            {
            // InternalBilang.g:1175:4: (lv_alias_3_0= RULE_ID )
            // InternalBilang.g:1176:5: lv_alias_3_0= RULE_ID
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
    // InternalBilang.g:1196:1: entryRulePersonByName returns [EObject current=null] : iv_rulePersonByName= rulePersonByName EOF ;
    public final EObject entryRulePersonByName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByName = null;


        try {
            // InternalBilang.g:1196:53: (iv_rulePersonByName= rulePersonByName EOF )
            // InternalBilang.g:1197:2: iv_rulePersonByName= rulePersonByName EOF
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
    // InternalBilang.g:1203:1: rulePersonByName returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= ruleTextWithSpaces ) ) ) ;
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
        EObject lv_lastName_8_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1209:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= ruleTextWithSpaces ) ) ) )
            // InternalBilang.g:1210:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= ruleTextWithSpaces ) ) )
            {
            // InternalBilang.g:1210:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= ruleTextWithSpaces ) ) )
            // InternalBilang.g:1211:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= ruleTextWithSpaces ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByNameAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByNameAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByNameAccess().getFirstKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonByNameAccess().getNameKeyword_3());
            		
            // InternalBilang.g:1227:3: ( (lv_firstName_4_0= RULE_ID ) )
            // InternalBilang.g:1228:4: (lv_firstName_4_0= RULE_ID )
            {
            // InternalBilang.g:1228:4: (lv_firstName_4_0= RULE_ID )
            // InternalBilang.g:1229:5: lv_firstName_4_0= RULE_ID
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

            otherlv_5=(Token)match(input,21,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonByNameAccess().getAndKeyword_5());
            		
            otherlv_6=(Token)match(input,47,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonByNameAccess().getLastKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonByNameAccess().getNameKeyword_7());
            		
            // InternalBilang.g:1257:3: ( (lv_lastName_8_0= ruleTextWithSpaces ) )
            // InternalBilang.g:1258:4: (lv_lastName_8_0= ruleTextWithSpaces )
            {
            // InternalBilang.g:1258:4: (lv_lastName_8_0= ruleTextWithSpaces )
            // InternalBilang.g:1259:5: lv_lastName_8_0= ruleTextWithSpaces
            {

            					newCompositeNode(grammarAccess.getPersonByNameAccess().getLastNameTextWithSpacesParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_lastName_8_0=ruleTextWithSpaces();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonByNameRule());
            					}
            					set(
            						current,
            						"lastName",
            						lv_lastName_8_0,
            						"org.xtext.example.bilang.Bilang.TextWithSpaces");
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
    // $ANTLR end "rulePersonByName"


    // $ANTLR start "entryRulePersonByPhone"
    // InternalBilang.g:1280:1: entryRulePersonByPhone returns [EObject current=null] : iv_rulePersonByPhone= rulePersonByPhone EOF ;
    public final EObject entryRulePersonByPhone() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByPhone = null;


        try {
            // InternalBilang.g:1280:54: (iv_rulePersonByPhone= rulePersonByPhone EOF )
            // InternalBilang.g:1281:2: iv_rulePersonByPhone= rulePersonByPhone EOF
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
    // InternalBilang.g:1287:1: rulePersonByPhone returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) ) ) ;
    public final EObject rulePersonByPhone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_phone_4_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1293:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) ) ) )
            // InternalBilang.g:1294:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) ) )
            {
            // InternalBilang.g:1294:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) ) )
            // InternalBilang.g:1295:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByPhoneAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByPhoneAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByPhoneAccess().getPhoneKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonByPhoneAccess().getNumberKeyword_3());
            		
            // InternalBilang.g:1311:3: ( (lv_phone_4_0= RULE_PHONE_NUMBER ) )
            // InternalBilang.g:1312:4: (lv_phone_4_0= RULE_PHONE_NUMBER )
            {
            // InternalBilang.g:1312:4: (lv_phone_4_0= RULE_PHONE_NUMBER )
            // InternalBilang.g:1313:5: lv_phone_4_0= RULE_PHONE_NUMBER
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
    // InternalBilang.g:1333:1: entryRulePersonByAddress returns [EObject current=null] : iv_rulePersonByAddress= rulePersonByAddress EOF ;
    public final EObject entryRulePersonByAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByAddress = null;


        try {
            // InternalBilang.g:1333:56: (iv_rulePersonByAddress= rulePersonByAddress EOF )
            // InternalBilang.g:1334:2: iv_rulePersonByAddress= rulePersonByAddress EOF
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
    // InternalBilang.g:1340:1: rulePersonByAddress returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_HOUSENUMBER ) ) ) ;
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
            // InternalBilang.g:1346:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_HOUSENUMBER ) ) ) )
            // InternalBilang.g:1347:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_HOUSENUMBER ) ) )
            {
            // InternalBilang.g:1347:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_HOUSENUMBER ) ) )
            // InternalBilang.g:1348:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_HOUSENUMBER ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByAddressAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByAddressAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByAddressAccess().getZipKeyword_2());
            		
            otherlv_3=(Token)match(input,50,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonByAddressAccess().getCodeKeyword_3());
            		
            // InternalBilang.g:1364:3: ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) )
            // InternalBilang.g:1365:4: (lv_zipcode_4_0= RULE_DUTCH_POSTCODE )
            {
            // InternalBilang.g:1365:4: (lv_zipcode_4_0= RULE_DUTCH_POSTCODE )
            // InternalBilang.g:1366:5: lv_zipcode_4_0= RULE_DUTCH_POSTCODE
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

            otherlv_5=(Token)match(input,21,FOLLOW_43); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonByAddressAccess().getAndKeyword_5());
            		
            otherlv_6=(Token)match(input,51,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonByAddressAccess().getHouseKeyword_6());
            		
            otherlv_7=(Token)match(input,48,FOLLOW_44); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonByAddressAccess().getNumberKeyword_7());
            		
            // InternalBilang.g:1394:3: ( (lv_housenumber_8_0= RULE_HOUSENUMBER ) )
            // InternalBilang.g:1395:4: (lv_housenumber_8_0= RULE_HOUSENUMBER )
            {
            // InternalBilang.g:1395:4: (lv_housenumber_8_0= RULE_HOUSENUMBER )
            // InternalBilang.g:1396:5: lv_housenumber_8_0= RULE_HOUSENUMBER
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
    // InternalBilang.g:1416:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalBilang.g:1416:48: (iv_ruleContent= ruleContent EOF )
            // InternalBilang.g:1417:2: iv_ruleContent= ruleContent EOF
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
    // InternalBilang.g:1423:1: ruleContent returns [EObject current=null] : (this_Message_0= ruleMessage | this_Document_1= ruleDocument ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_Document_1 = null;



        	enterRule();

        try {
            // InternalBilang.g:1429:2: ( (this_Message_0= ruleMessage | this_Document_1= ruleDocument ) )
            // InternalBilang.g:1430:2: (this_Message_0= ruleMessage | this_Document_1= ruleDocument )
            {
            // InternalBilang.g:1430:2: (this_Message_0= ruleMessage | this_Document_1= ruleDocument )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==52) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=53 && LA13_0<=54)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBilang.g:1431:3: this_Message_0= ruleMessage
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
                    // InternalBilang.g:1440:3: this_Document_1= ruleDocument
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
    // InternalBilang.g:1452:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalBilang.g:1452:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalBilang.g:1453:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalBilang.g:1459:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_message_1_0= ruleTextWithSpaces ) ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_message_1_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1465:2: ( (otherlv_0= 'message' ( (lv_message_1_0= ruleTextWithSpaces ) ) ) )
            // InternalBilang.g:1466:2: (otherlv_0= 'message' ( (lv_message_1_0= ruleTextWithSpaces ) ) )
            {
            // InternalBilang.g:1466:2: (otherlv_0= 'message' ( (lv_message_1_0= ruleTextWithSpaces ) ) )
            // InternalBilang.g:1467:3: otherlv_0= 'message' ( (lv_message_1_0= ruleTextWithSpaces ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
            		
            // InternalBilang.g:1471:3: ( (lv_message_1_0= ruleTextWithSpaces ) )
            // InternalBilang.g:1472:4: (lv_message_1_0= ruleTextWithSpaces )
            {
            // InternalBilang.g:1472:4: (lv_message_1_0= ruleTextWithSpaces )
            // InternalBilang.g:1473:5: lv_message_1_0= ruleTextWithSpaces
            {

            					newCompositeNode(grammarAccess.getMessageAccess().getMessageTextWithSpacesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_message_1_0=ruleTextWithSpaces();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_1_0,
            						"org.xtext.example.bilang.Bilang.TextWithSpaces");
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleDocument"
    // InternalBilang.g:1494:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalBilang.g:1494:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalBilang.g:1495:2: iv_ruleDocument= ruleDocument EOF
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
    // InternalBilang.g:1501:1: ruleDocument returns [EObject current=null] : (this_Invoice_0= ruleInvoice | this_DocumentPerson_1= ruleDocumentPerson ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject this_Invoice_0 = null;

        EObject this_DocumentPerson_1 = null;



        	enterRule();

        try {
            // InternalBilang.g:1507:2: ( (this_Invoice_0= ruleInvoice | this_DocumentPerson_1= ruleDocumentPerson ) )
            // InternalBilang.g:1508:2: (this_Invoice_0= ruleInvoice | this_DocumentPerson_1= ruleDocumentPerson )
            {
            // InternalBilang.g:1508:2: (this_Invoice_0= ruleInvoice | this_DocumentPerson_1= ruleDocumentPerson )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==53) ) {
                alt14=1;
            }
            else if ( (LA14_0==54) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBilang.g:1509:3: this_Invoice_0= ruleInvoice
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
                    // InternalBilang.g:1518:3: this_DocumentPerson_1= ruleDocumentPerson
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
    // InternalBilang.g:1530:1: entryRuleInvoice returns [EObject current=null] : iv_ruleInvoice= ruleInvoice EOF ;
    public final EObject entryRuleInvoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvoice = null;


        try {
            // InternalBilang.g:1530:48: (iv_ruleInvoice= ruleInvoice EOF )
            // InternalBilang.g:1531:2: iv_ruleInvoice= ruleInvoice EOF
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
    // InternalBilang.g:1537:1: ruleInvoice returns [EObject current=null] : (otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) ) ) ;
    public final EObject ruleInvoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_code_3_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1543:2: ( (otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) ) ) )
            // InternalBilang.g:1544:2: (otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) ) )
            {
            // InternalBilang.g:1544:2: (otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) ) )
            // InternalBilang.g:1545:3: otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getInvoiceAccess().getInvoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getInvoiceAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,50,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getInvoiceAccess().getCodeKeyword_2());
            		
            // InternalBilang.g:1557:3: ( (lv_code_3_0= RULE_INT ) )
            // InternalBilang.g:1558:4: (lv_code_3_0= RULE_INT )
            {
            // InternalBilang.g:1558:4: (lv_code_3_0= RULE_INT )
            // InternalBilang.g:1559:5: lv_code_3_0= RULE_INT
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
    // InternalBilang.g:1579:1: entryRuleDocumentPerson returns [EObject current=null] : iv_ruleDocumentPerson= ruleDocumentPerson EOF ;
    public final EObject entryRuleDocumentPerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentPerson = null;


        try {
            // InternalBilang.g:1579:55: (iv_ruleDocumentPerson= ruleDocumentPerson EOF )
            // InternalBilang.g:1580:2: iv_ruleDocumentPerson= ruleDocumentPerson EOF
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
    // InternalBilang.g:1586:1: ruleDocumentPerson returns [EObject current=null] : (otherlv_0= 'information' otherlv_1= 'about' ( (lv_person_2_0= rulePerson ) ) ) ;
    public final EObject ruleDocumentPerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_person_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1592:2: ( (otherlv_0= 'information' otherlv_1= 'about' ( (lv_person_2_0= rulePerson ) ) ) )
            // InternalBilang.g:1593:2: (otherlv_0= 'information' otherlv_1= 'about' ( (lv_person_2_0= rulePerson ) ) )
            {
            // InternalBilang.g:1593:2: (otherlv_0= 'information' otherlv_1= 'about' ( (lv_person_2_0= rulePerson ) ) )
            // InternalBilang.g:1594:3: otherlv_0= 'information' otherlv_1= 'about' ( (lv_person_2_0= rulePerson ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentPersonAccess().getInformationKeyword_0());
            		
            otherlv_1=(Token)match(input,55,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentPersonAccess().getAboutKeyword_1());
            		
            // InternalBilang.g:1602:3: ( (lv_person_2_0= rulePerson ) )
            // InternalBilang.g:1603:4: (lv_person_2_0= rulePerson )
            {
            // InternalBilang.g:1603:4: (lv_person_2_0= rulePerson )
            // InternalBilang.g:1604:5: lv_person_2_0= rulePerson
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


    // $ANTLR start "entryRuleTextWithSpaces"
    // InternalBilang.g:1625:1: entryRuleTextWithSpaces returns [EObject current=null] : iv_ruleTextWithSpaces= ruleTextWithSpaces EOF ;
    public final EObject entryRuleTextWithSpaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextWithSpaces = null;


        try {
            // InternalBilang.g:1625:55: (iv_ruleTextWithSpaces= ruleTextWithSpaces EOF )
            // InternalBilang.g:1626:2: iv_ruleTextWithSpaces= ruleTextWithSpaces EOF
            {
             newCompositeNode(grammarAccess.getTextWithSpacesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextWithSpaces=ruleTextWithSpaces();

            state._fsp--;

             current =iv_ruleTextWithSpaces; 
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
    // $ANTLR end "entryRuleTextWithSpaces"


    // $ANTLR start "ruleTextWithSpaces"
    // InternalBilang.g:1632:1: ruleTextWithSpaces returns [EObject current=null] : ( ( (lv_parts_0_0= RULE_ID ) ) ( (lv_parts_1_0= RULE_ID ) )+ ) ;
    public final EObject ruleTextWithSpaces() throws RecognitionException {
        EObject current = null;

        Token lv_parts_0_0=null;
        Token lv_parts_1_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1638:2: ( ( ( (lv_parts_0_0= RULE_ID ) ) ( (lv_parts_1_0= RULE_ID ) )+ ) )
            // InternalBilang.g:1639:2: ( ( (lv_parts_0_0= RULE_ID ) ) ( (lv_parts_1_0= RULE_ID ) )+ )
            {
            // InternalBilang.g:1639:2: ( ( (lv_parts_0_0= RULE_ID ) ) ( (lv_parts_1_0= RULE_ID ) )+ )
            // InternalBilang.g:1640:3: ( (lv_parts_0_0= RULE_ID ) ) ( (lv_parts_1_0= RULE_ID ) )+
            {
            // InternalBilang.g:1640:3: ( (lv_parts_0_0= RULE_ID ) )
            // InternalBilang.g:1641:4: (lv_parts_0_0= RULE_ID )
            {
            // InternalBilang.g:1641:4: (lv_parts_0_0= RULE_ID )
            // InternalBilang.g:1642:5: lv_parts_0_0= RULE_ID
            {
            lv_parts_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_parts_0_0, grammarAccess.getTextWithSpacesAccess().getPartsIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextWithSpacesRule());
            					}
            					addWithLastConsumed(
            						current,
            						"parts",
            						lv_parts_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBilang.g:1658:3: ( (lv_parts_1_0= RULE_ID ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBilang.g:1659:4: (lv_parts_1_0= RULE_ID )
            	    {
            	    // InternalBilang.g:1659:4: (lv_parts_1_0= RULE_ID )
            	    // InternalBilang.g:1660:5: lv_parts_1_0= RULE_ID
            	    {
            	    lv_parts_1_0=(Token)match(input,RULE_ID,FOLLOW_47); 

            	    					newLeafNode(lv_parts_1_0, grammarAccess.getTextWithSpacesAccess().getPartsIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTextWithSpacesRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"parts",
            	    						lv_parts_1_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


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
    // $ANTLR end "ruleTextWithSpaces"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000D0201000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000012L});

}