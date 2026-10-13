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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_EMAIL_ADDRESS", "RULE_PHONE_NUMBER", "RULE_DUTCH_POSTCODE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'empty'", "'process'", "'compound'", "'abstract'", "'with'", "'name'", "'and'", "'parameter'", "'value'", "'workflow'", "'{'", "'}'", "'define'", "'('", "','", "')'", "':'", "'text'", "'number'", "'boolean'", "'person'", "'document'", "'list'", "'task'", "'as'", "'let'", "'='", "'or'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'true'", "'false'", "'['", "']'", "'if'", "'then'", "'else'", "'for'", "'in'", "'while'", "'do'", "'parallel'", "'branch'", "'try'", "'catch'", "'finally'", "'retry'", "'up'", "'to'", "'times'", "'timeout'", "'compensate'", "'require'", "'before'", "'wait'", "'seconds'", "'minutes'", "'hours'", "'days'", "'assert'", "'message'", "'log'", "'run'", "'retrieve'", "'invoices'", "'codes'", "'full'", "'address'", "'of'", "'persons'", "'search'", "'send'", "'an'", "'email'", "'attachment'", "'sms'", "'a'", "'snail'", "'mail'", "'phone'", "'call'", "'add'", "'delete'", "'update'", "'set'", "'alias'", "'first'", "'last'", "'zip'", "'code'", "'house'", "'suffix'", "'invoice'", "'information'", "'about'", "'topic'", "'filter'", "'documents'", "'where'", "'equals'", "'contains'", "'starts'", "'sort'", "'by'", "'ascending'", "'descending'", "'archive'", "'create'", "'products'", "'product'", "'description'", "'price'", "'order'", "'status'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_PHONE_NUMBER=8;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_DUTCH_POSTCODE=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=12;
    public static final int RULE_EMAIL_ADDRESS=7;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // InternalBilang.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_elements_0_0= ruleWorkflow ) ) | ( (lv_elements_1_0= ruleWorkflowDefinition ) ) | ( (lv_elements_2_0= ruleTask ) ) | ( (lv_elements_3_0= ruleCompoundProcess ) ) | ( (lv_elements_4_0= ruleAbstractProcess ) ) | ( (lv_elements_5_0= ruleEmptyProcess ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:77:2: ( ( ( (lv_elements_0_0= ruleWorkflow ) ) | ( (lv_elements_1_0= ruleWorkflowDefinition ) ) | ( (lv_elements_2_0= ruleTask ) ) | ( (lv_elements_3_0= ruleCompoundProcess ) ) | ( (lv_elements_4_0= ruleAbstractProcess ) ) | ( (lv_elements_5_0= ruleEmptyProcess ) ) )* )
            // InternalBilang.g:78:2: ( ( (lv_elements_0_0= ruleWorkflow ) ) | ( (lv_elements_1_0= ruleWorkflowDefinition ) ) | ( (lv_elements_2_0= ruleTask ) ) | ( (lv_elements_3_0= ruleCompoundProcess ) ) | ( (lv_elements_4_0= ruleAbstractProcess ) ) | ( (lv_elements_5_0= ruleEmptyProcess ) ) )*
            {
            // InternalBilang.g:78:2: ( ( (lv_elements_0_0= ruleWorkflow ) ) | ( (lv_elements_1_0= ruleWorkflowDefinition ) ) | ( (lv_elements_2_0= ruleTask ) ) | ( (lv_elements_3_0= ruleCompoundProcess ) ) | ( (lv_elements_4_0= ruleAbstractProcess ) ) | ( (lv_elements_5_0= ruleEmptyProcess ) ) )*
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    alt1=1;
                    }
                    break;
                case 26:
                    {
                    alt1=2;
                    }
                    break;
                case 27:
                    {
                    alt1=3;
                    }
                    break;
                case 16:
                    {
                    alt1=4;
                    }
                    break;
                case 17:
                    {
                    alt1=5;
                    }
                    break;
                case 14:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalBilang.g:79:3: ( (lv_elements_0_0= ruleWorkflow ) )
            	    {
            	    // InternalBilang.g:79:3: ( (lv_elements_0_0= ruleWorkflow ) )
            	    // InternalBilang.g:80:4: (lv_elements_0_0= ruleWorkflow )
            	    {
            	    // InternalBilang.g:80:4: (lv_elements_0_0= ruleWorkflow )
            	    // InternalBilang.g:81:5: lv_elements_0_0= ruleWorkflow
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsWorkflowParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleWorkflow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"org.xtext.example.bilang.Bilang.Workflow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBilang.g:99:3: ( (lv_elements_1_0= ruleWorkflowDefinition ) )
            	    {
            	    // InternalBilang.g:99:3: ( (lv_elements_1_0= ruleWorkflowDefinition ) )
            	    // InternalBilang.g:100:4: (lv_elements_1_0= ruleWorkflowDefinition )
            	    {
            	    // InternalBilang.g:100:4: (lv_elements_1_0= ruleWorkflowDefinition )
            	    // InternalBilang.g:101:5: lv_elements_1_0= ruleWorkflowDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsWorkflowDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleWorkflowDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"org.xtext.example.bilang.Bilang.WorkflowDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBilang.g:119:3: ( (lv_elements_2_0= ruleTask ) )
            	    {
            	    // InternalBilang.g:119:3: ( (lv_elements_2_0= ruleTask ) )
            	    // InternalBilang.g:120:4: (lv_elements_2_0= ruleTask )
            	    {
            	    // InternalBilang.g:120:4: (lv_elements_2_0= ruleTask )
            	    // InternalBilang.g:121:5: lv_elements_2_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsTaskParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_2_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.example.bilang.Bilang.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBilang.g:139:3: ( (lv_elements_3_0= ruleCompoundProcess ) )
            	    {
            	    // InternalBilang.g:139:3: ( (lv_elements_3_0= ruleCompoundProcess ) )
            	    // InternalBilang.g:140:4: (lv_elements_3_0= ruleCompoundProcess )
            	    {
            	    // InternalBilang.g:140:4: (lv_elements_3_0= ruleCompoundProcess )
            	    // InternalBilang.g:141:5: lv_elements_3_0= ruleCompoundProcess
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsCompoundProcessParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_3_0=ruleCompoundProcess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.example.bilang.Bilang.CompoundProcess");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalBilang.g:159:3: ( (lv_elements_4_0= ruleAbstractProcess ) )
            	    {
            	    // InternalBilang.g:159:3: ( (lv_elements_4_0= ruleAbstractProcess ) )
            	    // InternalBilang.g:160:4: (lv_elements_4_0= ruleAbstractProcess )
            	    {
            	    // InternalBilang.g:160:4: (lv_elements_4_0= ruleAbstractProcess )
            	    // InternalBilang.g:161:5: lv_elements_4_0= ruleAbstractProcess
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractProcessParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_4_0=ruleAbstractProcess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"org.xtext.example.bilang.Bilang.AbstractProcess");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalBilang.g:179:3: ( (lv_elements_5_0= ruleEmptyProcess ) )
            	    {
            	    // InternalBilang.g:179:3: ( (lv_elements_5_0= ruleEmptyProcess ) )
            	    // InternalBilang.g:180:4: (lv_elements_5_0= ruleEmptyProcess )
            	    {
            	    // InternalBilang.g:180:4: (lv_elements_5_0= ruleEmptyProcess )
            	    // InternalBilang.g:181:5: lv_elements_5_0= ruleEmptyProcess
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsEmptyProcessParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_5_0=ruleEmptyProcess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"org.xtext.example.bilang.Bilang.EmptyProcess");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleEmptyProcess"
    // InternalBilang.g:202:1: entryRuleEmptyProcess returns [EObject current=null] : iv_ruleEmptyProcess= ruleEmptyProcess EOF ;
    public final EObject entryRuleEmptyProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyProcess = null;


        try {
            // InternalBilang.g:202:53: (iv_ruleEmptyProcess= ruleEmptyProcess EOF )
            // InternalBilang.g:203:2: iv_ruleEmptyProcess= ruleEmptyProcess EOF
            {
             newCompositeNode(grammarAccess.getEmptyProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyProcess=ruleEmptyProcess();

            state._fsp--;

             current =iv_ruleEmptyProcess; 
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
    // InternalBilang.g:209:1: ruleEmptyProcess returns [EObject current=null] : ( () otherlv_1= 'empty' otherlv_2= 'process' ) ;
    public final EObject ruleEmptyProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBilang.g:215:2: ( ( () otherlv_1= 'empty' otherlv_2= 'process' ) )
            // InternalBilang.g:216:2: ( () otherlv_1= 'empty' otherlv_2= 'process' )
            {
            // InternalBilang.g:216:2: ( () otherlv_1= 'empty' otherlv_2= 'process' )
            // InternalBilang.g:217:3: () otherlv_1= 'empty' otherlv_2= 'process'
            {
            // InternalBilang.g:217:3: ()
            // InternalBilang.g:218:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyProcessAccess().getEmptyProcessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptyProcessAccess().getEmptyKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEmptyProcessAccess().getProcessKeyword_2());
            		

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
    // InternalBilang.g:236:1: entryRuleCompoundProcess returns [EObject current=null] : iv_ruleCompoundProcess= ruleCompoundProcess EOF ;
    public final EObject entryRuleCompoundProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundProcess = null;


        try {
            // InternalBilang.g:236:56: (iv_ruleCompoundProcess= ruleCompoundProcess EOF )
            // InternalBilang.g:237:2: iv_ruleCompoundProcess= ruleCompoundProcess EOF
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
    // InternalBilang.g:243:1: ruleCompoundProcess returns [EObject current=null] : (otherlv_0= 'compound' otherlv_1= 'process' ( (lv_tasks_2_0= ruleTask ) )+ ) ;
    public final EObject ruleCompoundProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_tasks_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:249:2: ( (otherlv_0= 'compound' otherlv_1= 'process' ( (lv_tasks_2_0= ruleTask ) )+ ) )
            // InternalBilang.g:250:2: (otherlv_0= 'compound' otherlv_1= 'process' ( (lv_tasks_2_0= ruleTask ) )+ )
            {
            // InternalBilang.g:250:2: (otherlv_0= 'compound' otherlv_1= 'process' ( (lv_tasks_2_0= ruleTask ) )+ )
            // InternalBilang.g:251:3: otherlv_0= 'compound' otherlv_1= 'process' ( (lv_tasks_2_0= ruleTask ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundProcessAccess().getCompoundKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCompoundProcessAccess().getProcessKeyword_1());
            		
            // InternalBilang.g:259:3: ( (lv_tasks_2_0= ruleTask ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalBilang.g:260:4: (lv_tasks_2_0= ruleTask )
            	    {
            	    // InternalBilang.g:260:4: (lv_tasks_2_0= ruleTask )
            	    // InternalBilang.g:261:5: lv_tasks_2_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getCompoundProcessAccess().getTasksTaskParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_tasks_2_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompoundProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_2_0,
            	    						"org.xtext.example.bilang.Bilang.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // InternalBilang.g:282:1: entryRuleAbstractProcess returns [EObject current=null] : iv_ruleAbstractProcess= ruleAbstractProcess EOF ;
    public final EObject entryRuleAbstractProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProcess = null;


        try {
            // InternalBilang.g:282:56: (iv_ruleAbstractProcess= ruleAbstractProcess EOF )
            // InternalBilang.g:283:2: iv_ruleAbstractProcess= ruleAbstractProcess EOF
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
    // InternalBilang.g:289:1: ruleAbstractProcess returns [EObject current=null] : (otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'and' ( (lv_parameters_6_0= ruleParamValue ) ) )* ) ;
    public final EObject ruleAbstractProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:295:2: ( (otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'and' ( (lv_parameters_6_0= ruleParamValue ) ) )* ) )
            // InternalBilang.g:296:2: (otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'and' ( (lv_parameters_6_0= ruleParamValue ) ) )* )
            {
            // InternalBilang.g:296:2: (otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'and' ( (lv_parameters_6_0= ruleParamValue ) ) )* )
            // InternalBilang.g:297:3: otherlv_0= 'abstract' otherlv_1= 'process' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'and' ( (lv_parameters_6_0= ruleParamValue ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractProcessAccess().getAbstractKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractProcessAccess().getProcessKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractProcessAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAbstractProcessAccess().getNameKeyword_3());
            		
            // InternalBilang.g:313:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBilang.g:314:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBilang.g:314:4: (lv_name_4_0= RULE_ID )
            // InternalBilang.g:315:5: lv_name_4_0= RULE_ID
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

            // InternalBilang.g:331:3: (otherlv_5= 'and' ( (lv_parameters_6_0= ruleParamValue ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBilang.g:332:4: otherlv_5= 'and' ( (lv_parameters_6_0= ruleParamValue ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAbstractProcessAccess().getAndKeyword_5_0());
            	    			
            	    // InternalBilang.g:336:4: ( (lv_parameters_6_0= ruleParamValue ) )
            	    // InternalBilang.g:337:5: (lv_parameters_6_0= ruleParamValue )
            	    {
            	    // InternalBilang.g:337:5: (lv_parameters_6_0= ruleParamValue )
            	    // InternalBilang.g:338:6: lv_parameters_6_0= ruleParamValue
            	    {

            	    						newCompositeNode(grammarAccess.getAbstractProcessAccess().getParametersParamValueParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_parameters_6_0=ruleParamValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAbstractProcessRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_6_0,
            	    							"org.xtext.example.bilang.Bilang.ParamValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // InternalBilang.g:360:1: entryRuleParamValue returns [EObject current=null] : iv_ruleParamValue= ruleParamValue EOF ;
    public final EObject entryRuleParamValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValue = null;


        try {
            // InternalBilang.g:360:51: (iv_ruleParamValue= ruleParamValue EOF )
            // InternalBilang.g:361:2: iv_ruleParamValue= ruleParamValue EOF
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
    // InternalBilang.g:367:1: ruleParamValue returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'and' otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleParamValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_param_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalBilang.g:373:2: ( (otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'and' otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // InternalBilang.g:374:2: (otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'and' otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // InternalBilang.g:374:2: (otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'and' otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) )
            // InternalBilang.g:375:3: otherlv_0= 'parameter' ( (lv_param_1_0= RULE_ID ) ) otherlv_2= 'and' otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getParamValueAccess().getParameterKeyword_0());
            		
            // InternalBilang.g:379:3: ( (lv_param_1_0= RULE_ID ) )
            // InternalBilang.g:380:4: (lv_param_1_0= RULE_ID )
            {
            // InternalBilang.g:380:4: (lv_param_1_0= RULE_ID )
            // InternalBilang.g:381:5: lv_param_1_0= RULE_ID
            {
            lv_param_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getParamValueAccess().getAndKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getParamValueAccess().getValueKeyword_3());
            		
            // InternalBilang.g:405:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalBilang.g:406:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalBilang.g:406:4: (lv_value_4_0= RULE_STRING )
            // InternalBilang.g:407:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getParamValueAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
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
    // $ANTLR end "ruleParamValue"


    // $ANTLR start "entryRuleWorkflow"
    // InternalBilang.g:427:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // InternalBilang.g:427:49: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalBilang.g:428:2: iv_ruleWorkflow= ruleWorkflow EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflow=ruleWorkflow();

            state._fsp--;

             current =iv_ruleWorkflow; 
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
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalBilang.g:434:1: ruleWorkflow returns [EObject current=null] : (otherlv_0= 'workflow' otherlv_1= 'with' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_statements_5_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:440:2: ( (otherlv_0= 'workflow' otherlv_1= 'with' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            // InternalBilang.g:441:2: (otherlv_0= 'workflow' otherlv_1= 'with' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )
            {
            // InternalBilang.g:441:2: (otherlv_0= 'workflow' otherlv_1= 'with' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )
            // InternalBilang.g:442:3: otherlv_0= 'workflow' otherlv_1= 'with' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowAccess().getWorkflowKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkflowAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowAccess().getNameKeyword_2());
            		
            // InternalBilang.g:454:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBilang.g:455:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBilang.g:455:4: (lv_name_3_0= RULE_ID )
            // InternalBilang.g:456:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_3_0, grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBilang.g:476:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||LA4_0==27||LA4_0==39||LA4_0==52||LA4_0==55||LA4_0==57||LA4_0==59||LA4_0==61||LA4_0==64||(LA4_0>=69 && LA4_0<=70)||LA4_0==72||LA4_0==77||(LA4_0>=79 && LA4_0<=80)||LA4_0==100||LA4_0==114||LA4_0==120||LA4_0==124) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBilang.g:477:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalBilang.g:477:4: (lv_statements_5_0= ruleStatement )
            	    // InternalBilang.g:478:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.xtext.example.bilang.Bilang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleWorkflowDefinition"
    // InternalBilang.g:503:1: entryRuleWorkflowDefinition returns [EObject current=null] : iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF ;
    public final EObject entryRuleWorkflowDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDefinition = null;


        try {
            // InternalBilang.g:503:59: (iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF )
            // InternalBilang.g:504:2: iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkflowDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowDefinition=ruleWorkflowDefinition();

            state._fsp--;

             current =iv_ruleWorkflowDefinition; 
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
    // $ANTLR end "entryRuleWorkflowDefinition"


    // $ANTLR start "ruleWorkflowDefinition"
    // InternalBilang.g:510:1: ruleWorkflowDefinition returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'workflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* otherlv_10= '}' ) ;
    public final EObject ruleWorkflowDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_statements_9_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:516:2: ( (otherlv_0= 'define' otherlv_1= 'workflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* otherlv_10= '}' ) )
            // InternalBilang.g:517:2: (otherlv_0= 'define' otherlv_1= 'workflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* otherlv_10= '}' )
            {
            // InternalBilang.g:517:2: (otherlv_0= 'define' otherlv_1= 'workflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* otherlv_10= '}' )
            // InternalBilang.g:518:3: otherlv_0= 'define' otherlv_1= 'workflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowDefinitionAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkflowDefinitionAccess().getWorkflowKeyword_1());
            		
            // InternalBilang.g:526:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBilang.g:527:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBilang.g:527:4: (lv_name_2_0= RULE_ID )
            // InternalBilang.g:528:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getWorkflowDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkflowDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBilang.g:548:3: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBilang.g:549:4: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // InternalBilang.g:549:4: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalBilang.g:550:5: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalBilang.g:550:5: (lv_parameters_4_0= ruleParameter )
                    // InternalBilang.g:551:6: lv_parameters_4_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getParametersParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkflowDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"org.xtext.example.bilang.Bilang.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBilang.g:568:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==28) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBilang.g:569:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getWorkflowDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalBilang.g:573:5: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalBilang.g:574:6: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalBilang.g:574:6: (lv_parameters_6_0= ruleParameter )
                    	    // InternalBilang.g:575:7: lv_parameters_6_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkflowDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_6_0,
                    	    								"org.xtext.example.bilang.Bilang.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getWorkflowDefinitionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getWorkflowDefinitionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBilang.g:602:3: ( (lv_statements_9_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||LA7_0==27||LA7_0==39||LA7_0==52||LA7_0==55||LA7_0==57||LA7_0==59||LA7_0==61||LA7_0==64||(LA7_0>=69 && LA7_0<=70)||LA7_0==72||LA7_0==77||(LA7_0>=79 && LA7_0<=80)||LA7_0==100||LA7_0==114||LA7_0==120||LA7_0==124) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBilang.g:603:4: (lv_statements_9_0= ruleStatement )
            	    {
            	    // InternalBilang.g:603:4: (lv_statements_9_0= ruleStatement )
            	    // InternalBilang.g:604:5: lv_statements_9_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getStatementsStatementParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_statements_9_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_9_0,
            	    						"org.xtext.example.bilang.Bilang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getWorkflowDefinitionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleWorkflowDefinition"


    // $ANTLR start "entryRuleParameter"
    // InternalBilang.g:629:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalBilang.g:629:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalBilang.g:630:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalBilang.g:636:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:642:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleParameterType ) ) ) )
            // InternalBilang.g:643:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleParameterType ) ) )
            {
            // InternalBilang.g:643:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleParameterType ) ) )
            // InternalBilang.g:644:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleParameterType ) )
            {
            // InternalBilang.g:644:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBilang.g:645:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBilang.g:645:4: (lv_name_0_0= RULE_ID )
            // InternalBilang.g:646:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalBilang.g:666:3: ( (lv_type_2_0= ruleParameterType ) )
            // InternalBilang.g:667:4: (lv_type_2_0= ruleParameterType )
            {
            // InternalBilang.g:667:4: (lv_type_2_0= ruleParameterType )
            // InternalBilang.g:668:5: lv_type_2_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.bilang.Bilang.ParameterType");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterType"
    // InternalBilang.g:689:1: entryRuleParameterType returns [String current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final String entryRuleParameterType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterType = null;


        try {
            // InternalBilang.g:689:53: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalBilang.g:690:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType.getText(); 
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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalBilang.g:696:1: ruleParameterType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'text' | kw= 'number' | kw= 'boolean' | kw= 'person' | kw= 'document' | kw= 'list' ) ;
    public final AntlrDatatypeRuleToken ruleParameterType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBilang.g:702:2: ( (kw= 'text' | kw= 'number' | kw= 'boolean' | kw= 'person' | kw= 'document' | kw= 'list' ) )
            // InternalBilang.g:703:2: (kw= 'text' | kw= 'number' | kw= 'boolean' | kw= 'person' | kw= 'document' | kw= 'list' )
            {
            // InternalBilang.g:703:2: (kw= 'text' | kw= 'number' | kw= 'boolean' | kw= 'person' | kw= 'document' | kw= 'list' )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt8=1;
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                alt8=3;
                }
                break;
            case 34:
                {
                alt8=4;
                }
                break;
            case 35:
                {
                alt8=5;
                }
                break;
            case 36:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBilang.g:704:3: kw= 'text'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getParameterTypeAccess().getTextKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:710:3: kw= 'number'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getParameterTypeAccess().getNumberKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBilang.g:716:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getParameterTypeAccess().getBooleanKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBilang.g:722:3: kw= 'person'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getParameterTypeAccess().getPersonKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBilang.g:728:3: kw= 'document'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getParameterTypeAccess().getDocumentKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBilang.g:734:3: kw= 'list'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getParameterTypeAccess().getListKeyword_5());
                    		

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
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleStatement"
    // InternalBilang.g:743:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalBilang.g:743:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalBilang.g:744:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalBilang.g:750:1: ruleStatement returns [EObject current=null] : (this_Task_0= ruleTask | this_LetStatement_1= ruleLetStatement | this_IfStatement_2= ruleIfStatement | this_ForEachStatement_3= ruleForEachStatement | this_WhileStatement_4= ruleWhileStatement | this_ParallelProcess_5= ruleParallelProcess | this_TryCatchStatement_6= ruleTryCatchStatement | this_RetryStatement_7= ruleRetryStatement | this_TimeoutStatement_8= ruleTimeoutStatement | this_CompensateStatement_9= ruleCompensateStatement | this_RequireStatement_10= ruleRequireStatement | this_WaitStatement_11= ruleWaitStatement | this_AssertStatement_12= ruleAssertStatement | this_LogStatement_13= ruleLogStatement | this_WorkflowCall_14= ruleWorkflowCall | this_DocumentOperation_15= ruleDocumentOperation ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Task_0 = null;

        EObject this_LetStatement_1 = null;

        EObject this_IfStatement_2 = null;

        EObject this_ForEachStatement_3 = null;

        EObject this_WhileStatement_4 = null;

        EObject this_ParallelProcess_5 = null;

        EObject this_TryCatchStatement_6 = null;

        EObject this_RetryStatement_7 = null;

        EObject this_TimeoutStatement_8 = null;

        EObject this_CompensateStatement_9 = null;

        EObject this_RequireStatement_10 = null;

        EObject this_WaitStatement_11 = null;

        EObject this_AssertStatement_12 = null;

        EObject this_LogStatement_13 = null;

        EObject this_WorkflowCall_14 = null;

        EObject this_DocumentOperation_15 = null;



        	enterRule();

        try {
            // InternalBilang.g:756:2: ( (this_Task_0= ruleTask | this_LetStatement_1= ruleLetStatement | this_IfStatement_2= ruleIfStatement | this_ForEachStatement_3= ruleForEachStatement | this_WhileStatement_4= ruleWhileStatement | this_ParallelProcess_5= ruleParallelProcess | this_TryCatchStatement_6= ruleTryCatchStatement | this_RetryStatement_7= ruleRetryStatement | this_TimeoutStatement_8= ruleTimeoutStatement | this_CompensateStatement_9= ruleCompensateStatement | this_RequireStatement_10= ruleRequireStatement | this_WaitStatement_11= ruleWaitStatement | this_AssertStatement_12= ruleAssertStatement | this_LogStatement_13= ruleLogStatement | this_WorkflowCall_14= ruleWorkflowCall | this_DocumentOperation_15= ruleDocumentOperation ) )
            // InternalBilang.g:757:2: (this_Task_0= ruleTask | this_LetStatement_1= ruleLetStatement | this_IfStatement_2= ruleIfStatement | this_ForEachStatement_3= ruleForEachStatement | this_WhileStatement_4= ruleWhileStatement | this_ParallelProcess_5= ruleParallelProcess | this_TryCatchStatement_6= ruleTryCatchStatement | this_RetryStatement_7= ruleRetryStatement | this_TimeoutStatement_8= ruleTimeoutStatement | this_CompensateStatement_9= ruleCompensateStatement | this_RequireStatement_10= ruleRequireStatement | this_WaitStatement_11= ruleWaitStatement | this_AssertStatement_12= ruleAssertStatement | this_LogStatement_13= ruleLogStatement | this_WorkflowCall_14= ruleWorkflowCall | this_DocumentOperation_15= ruleDocumentOperation )
            {
            // InternalBilang.g:757:2: (this_Task_0= ruleTask | this_LetStatement_1= ruleLetStatement | this_IfStatement_2= ruleIfStatement | this_ForEachStatement_3= ruleForEachStatement | this_WhileStatement_4= ruleWhileStatement | this_ParallelProcess_5= ruleParallelProcess | this_TryCatchStatement_6= ruleTryCatchStatement | this_RetryStatement_7= ruleRetryStatement | this_TimeoutStatement_8= ruleTimeoutStatement | this_CompensateStatement_9= ruleCompensateStatement | this_RequireStatement_10= ruleRequireStatement | this_WaitStatement_11= ruleWaitStatement | this_AssertStatement_12= ruleAssertStatement | this_LogStatement_13= ruleLogStatement | this_WorkflowCall_14= ruleWorkflowCall | this_DocumentOperation_15= ruleDocumentOperation )
            int alt9=16;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 39:
                {
                alt9=2;
                }
                break;
            case 52:
                {
                alt9=3;
                }
                break;
            case 55:
                {
                alt9=4;
                }
                break;
            case 57:
                {
                alt9=5;
                }
                break;
            case 59:
                {
                alt9=6;
                }
                break;
            case 61:
                {
                alt9=7;
                }
                break;
            case 64:
                {
                alt9=8;
                }
                break;
            case 18:
                {
                alt9=9;
                }
                break;
            case 69:
                {
                alt9=10;
                }
                break;
            case 70:
                {
                alt9=11;
                }
                break;
            case 72:
                {
                alt9=12;
                }
                break;
            case 77:
                {
                alt9=13;
                }
                break;
            case 79:
                {
                alt9=14;
                }
                break;
            case 80:
                {
                alt9=15;
                }
                break;
            case 100:
            case 114:
            case 120:
            case 124:
                {
                alt9=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBilang.g:758:3: this_Task_0= ruleTask
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Task_0=ruleTask();

                    state._fsp--;


                    			current = this_Task_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:767:3: this_LetStatement_1= ruleLetStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLetStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetStatement_1=ruleLetStatement();

                    state._fsp--;


                    			current = this_LetStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBilang.g:776:3: this_IfStatement_2= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_2=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBilang.g:785:3: this_ForEachStatement_3= ruleForEachStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getForEachStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForEachStatement_3=ruleForEachStatement();

                    state._fsp--;


                    			current = this_ForEachStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBilang.g:794:3: this_WhileStatement_4= ruleWhileStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_4=ruleWhileStatement();

                    state._fsp--;


                    			current = this_WhileStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBilang.g:803:3: this_ParallelProcess_5= ruleParallelProcess
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getParallelProcessParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParallelProcess_5=ruleParallelProcess();

                    state._fsp--;


                    			current = this_ParallelProcess_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBilang.g:812:3: this_TryCatchStatement_6= ruleTryCatchStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTryCatchStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_TryCatchStatement_6=ruleTryCatchStatement();

                    state._fsp--;


                    			current = this_TryCatchStatement_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalBilang.g:821:3: this_RetryStatement_7= ruleRetryStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRetryStatementParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_RetryStatement_7=ruleRetryStatement();

                    state._fsp--;


                    			current = this_RetryStatement_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalBilang.g:830:3: this_TimeoutStatement_8= ruleTimeoutStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTimeoutStatementParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeoutStatement_8=ruleTimeoutStatement();

                    state._fsp--;


                    			current = this_TimeoutStatement_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalBilang.g:839:3: this_CompensateStatement_9= ruleCompensateStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCompensateStatementParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompensateStatement_9=ruleCompensateStatement();

                    state._fsp--;


                    			current = this_CompensateStatement_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalBilang.g:848:3: this_RequireStatement_10= ruleRequireStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRequireStatementParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequireStatement_10=ruleRequireStatement();

                    state._fsp--;


                    			current = this_RequireStatement_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalBilang.g:857:3: this_WaitStatement_11= ruleWaitStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWaitStatementParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_WaitStatement_11=ruleWaitStatement();

                    state._fsp--;


                    			current = this_WaitStatement_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalBilang.g:866:3: this_AssertStatement_12= ruleAssertStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssertStatementParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssertStatement_12=ruleAssertStatement();

                    state._fsp--;


                    			current = this_AssertStatement_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalBilang.g:875:3: this_LogStatement_13= ruleLogStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLogStatementParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogStatement_13=ruleLogStatement();

                    state._fsp--;


                    			current = this_LogStatement_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalBilang.g:884:3: this_WorkflowCall_14= ruleWorkflowCall
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWorkflowCallParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkflowCall_14=ruleWorkflowCall();

                    state._fsp--;


                    			current = this_WorkflowCall_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalBilang.g:893:3: this_DocumentOperation_15= ruleDocumentOperation
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDocumentOperationParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_DocumentOperation_15=ruleDocumentOperation();

                    state._fsp--;


                    			current = this_DocumentOperation_15;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleTask"
    // InternalBilang.g:905:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalBilang.g:905:45: (iv_ruleTask= ruleTask EOF )
            // InternalBilang.g:906:2: iv_ruleTask= ruleTask EOF
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
    // InternalBilang.g:912:1: ruleTask returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'task' ( ( (lv_kind_2_1= ruleSendEmail | lv_kind_2_2= ruleSendSMS | lv_kind_2_3= ruleSendSnailMail | lv_kind_2_4= ruleRetrieveDocument | lv_kind_2_5= ruleRetrieveInvoices | lv_kind_2_6= ruleRetrieveFullAddress | lv_kind_2_7= ruleRetrievePersons | lv_kind_2_8= ruleCallPerson | lv_kind_2_9= ruleAddPerson | lv_kind_2_10= ruleDeletePerson | lv_kind_2_11= ruleUpdatePerson | lv_kind_2_12= ruleSearchPerson | lv_kind_2_13= ruleCreateInvoiceWithProducts | lv_kind_2_14= ruleCreateProduct | lv_kind_2_15= ruleRetrieveProductInformation | lv_kind_2_16= ruleRetrieveOrderStatusByInvoice ) ) ) (otherlv_3= 'as' ( (lv_result_4_0= RULE_ID ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_result_4_0=null;
        Token otherlv_5=null;
        EObject lv_kind_2_1 = null;

        EObject lv_kind_2_2 = null;

        EObject lv_kind_2_3 = null;

        EObject lv_kind_2_4 = null;

        EObject lv_kind_2_5 = null;

        EObject lv_kind_2_6 = null;

        EObject lv_kind_2_7 = null;

        EObject lv_kind_2_8 = null;

        EObject lv_kind_2_9 = null;

        EObject lv_kind_2_10 = null;

        EObject lv_kind_2_11 = null;

        EObject lv_kind_2_12 = null;

        EObject lv_kind_2_13 = null;

        EObject lv_kind_2_14 = null;

        EObject lv_kind_2_15 = null;

        EObject lv_kind_2_16 = null;



        	enterRule();

        try {
            // InternalBilang.g:918:2: ( (otherlv_0= '(' otherlv_1= 'task' ( ( (lv_kind_2_1= ruleSendEmail | lv_kind_2_2= ruleSendSMS | lv_kind_2_3= ruleSendSnailMail | lv_kind_2_4= ruleRetrieveDocument | lv_kind_2_5= ruleRetrieveInvoices | lv_kind_2_6= ruleRetrieveFullAddress | lv_kind_2_7= ruleRetrievePersons | lv_kind_2_8= ruleCallPerson | lv_kind_2_9= ruleAddPerson | lv_kind_2_10= ruleDeletePerson | lv_kind_2_11= ruleUpdatePerson | lv_kind_2_12= ruleSearchPerson | lv_kind_2_13= ruleCreateInvoiceWithProducts | lv_kind_2_14= ruleCreateProduct | lv_kind_2_15= ruleRetrieveProductInformation | lv_kind_2_16= ruleRetrieveOrderStatusByInvoice ) ) ) (otherlv_3= 'as' ( (lv_result_4_0= RULE_ID ) ) )? otherlv_5= ')' ) )
            // InternalBilang.g:919:2: (otherlv_0= '(' otherlv_1= 'task' ( ( (lv_kind_2_1= ruleSendEmail | lv_kind_2_2= ruleSendSMS | lv_kind_2_3= ruleSendSnailMail | lv_kind_2_4= ruleRetrieveDocument | lv_kind_2_5= ruleRetrieveInvoices | lv_kind_2_6= ruleRetrieveFullAddress | lv_kind_2_7= ruleRetrievePersons | lv_kind_2_8= ruleCallPerson | lv_kind_2_9= ruleAddPerson | lv_kind_2_10= ruleDeletePerson | lv_kind_2_11= ruleUpdatePerson | lv_kind_2_12= ruleSearchPerson | lv_kind_2_13= ruleCreateInvoiceWithProducts | lv_kind_2_14= ruleCreateProduct | lv_kind_2_15= ruleRetrieveProductInformation | lv_kind_2_16= ruleRetrieveOrderStatusByInvoice ) ) ) (otherlv_3= 'as' ( (lv_result_4_0= RULE_ID ) ) )? otherlv_5= ')' )
            {
            // InternalBilang.g:919:2: (otherlv_0= '(' otherlv_1= 'task' ( ( (lv_kind_2_1= ruleSendEmail | lv_kind_2_2= ruleSendSMS | lv_kind_2_3= ruleSendSnailMail | lv_kind_2_4= ruleRetrieveDocument | lv_kind_2_5= ruleRetrieveInvoices | lv_kind_2_6= ruleRetrieveFullAddress | lv_kind_2_7= ruleRetrievePersons | lv_kind_2_8= ruleCallPerson | lv_kind_2_9= ruleAddPerson | lv_kind_2_10= ruleDeletePerson | lv_kind_2_11= ruleUpdatePerson | lv_kind_2_12= ruleSearchPerson | lv_kind_2_13= ruleCreateInvoiceWithProducts | lv_kind_2_14= ruleCreateProduct | lv_kind_2_15= ruleRetrieveProductInformation | lv_kind_2_16= ruleRetrieveOrderStatusByInvoice ) ) ) (otherlv_3= 'as' ( (lv_result_4_0= RULE_ID ) ) )? otherlv_5= ')' )
            // InternalBilang.g:920:3: otherlv_0= '(' otherlv_1= 'task' ( ( (lv_kind_2_1= ruleSendEmail | lv_kind_2_2= ruleSendSMS | lv_kind_2_3= ruleSendSnailMail | lv_kind_2_4= ruleRetrieveDocument | lv_kind_2_5= ruleRetrieveInvoices | lv_kind_2_6= ruleRetrieveFullAddress | lv_kind_2_7= ruleRetrievePersons | lv_kind_2_8= ruleCallPerson | lv_kind_2_9= ruleAddPerson | lv_kind_2_10= ruleDeletePerson | lv_kind_2_11= ruleUpdatePerson | lv_kind_2_12= ruleSearchPerson | lv_kind_2_13= ruleCreateInvoiceWithProducts | lv_kind_2_14= ruleCreateProduct | lv_kind_2_15= ruleRetrieveProductInformation | lv_kind_2_16= ruleRetrieveOrderStatusByInvoice ) ) ) (otherlv_3= 'as' ( (lv_result_4_0= RULE_ID ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getTaskKeyword_1());
            		
            // InternalBilang.g:928:3: ( ( (lv_kind_2_1= ruleSendEmail | lv_kind_2_2= ruleSendSMS | lv_kind_2_3= ruleSendSnailMail | lv_kind_2_4= ruleRetrieveDocument | lv_kind_2_5= ruleRetrieveInvoices | lv_kind_2_6= ruleRetrieveFullAddress | lv_kind_2_7= ruleRetrievePersons | lv_kind_2_8= ruleCallPerson | lv_kind_2_9= ruleAddPerson | lv_kind_2_10= ruleDeletePerson | lv_kind_2_11= ruleUpdatePerson | lv_kind_2_12= ruleSearchPerson | lv_kind_2_13= ruleCreateInvoiceWithProducts | lv_kind_2_14= ruleCreateProduct | lv_kind_2_15= ruleRetrieveProductInformation | lv_kind_2_16= ruleRetrieveOrderStatusByInvoice ) ) )
            // InternalBilang.g:929:4: ( (lv_kind_2_1= ruleSendEmail | lv_kind_2_2= ruleSendSMS | lv_kind_2_3= ruleSendSnailMail | lv_kind_2_4= ruleRetrieveDocument | lv_kind_2_5= ruleRetrieveInvoices | lv_kind_2_6= ruleRetrieveFullAddress | lv_kind_2_7= ruleRetrievePersons | lv_kind_2_8= ruleCallPerson | lv_kind_2_9= ruleAddPerson | lv_kind_2_10= ruleDeletePerson | lv_kind_2_11= ruleUpdatePerson | lv_kind_2_12= ruleSearchPerson | lv_kind_2_13= ruleCreateInvoiceWithProducts | lv_kind_2_14= ruleCreateProduct | lv_kind_2_15= ruleRetrieveProductInformation | lv_kind_2_16= ruleRetrieveOrderStatusByInvoice ) )
            {
            // InternalBilang.g:929:4: ( (lv_kind_2_1= ruleSendEmail | lv_kind_2_2= ruleSendSMS | lv_kind_2_3= ruleSendSnailMail | lv_kind_2_4= ruleRetrieveDocument | lv_kind_2_5= ruleRetrieveInvoices | lv_kind_2_6= ruleRetrieveFullAddress | lv_kind_2_7= ruleRetrievePersons | lv_kind_2_8= ruleCallPerson | lv_kind_2_9= ruleAddPerson | lv_kind_2_10= ruleDeletePerson | lv_kind_2_11= ruleUpdatePerson | lv_kind_2_12= ruleSearchPerson | lv_kind_2_13= ruleCreateInvoiceWithProducts | lv_kind_2_14= ruleCreateProduct | lv_kind_2_15= ruleRetrieveProductInformation | lv_kind_2_16= ruleRetrieveOrderStatusByInvoice ) )
            // InternalBilang.g:930:5: (lv_kind_2_1= ruleSendEmail | lv_kind_2_2= ruleSendSMS | lv_kind_2_3= ruleSendSnailMail | lv_kind_2_4= ruleRetrieveDocument | lv_kind_2_5= ruleRetrieveInvoices | lv_kind_2_6= ruleRetrieveFullAddress | lv_kind_2_7= ruleRetrievePersons | lv_kind_2_8= ruleCallPerson | lv_kind_2_9= ruleAddPerson | lv_kind_2_10= ruleDeletePerson | lv_kind_2_11= ruleUpdatePerson | lv_kind_2_12= ruleSearchPerson | lv_kind_2_13= ruleCreateInvoiceWithProducts | lv_kind_2_14= ruleCreateProduct | lv_kind_2_15= ruleRetrieveProductInformation | lv_kind_2_16= ruleRetrieveOrderStatusByInvoice )
            {
            // InternalBilang.g:930:5: (lv_kind_2_1= ruleSendEmail | lv_kind_2_2= ruleSendSMS | lv_kind_2_3= ruleSendSnailMail | lv_kind_2_4= ruleRetrieveDocument | lv_kind_2_5= ruleRetrieveInvoices | lv_kind_2_6= ruleRetrieveFullAddress | lv_kind_2_7= ruleRetrievePersons | lv_kind_2_8= ruleCallPerson | lv_kind_2_9= ruleAddPerson | lv_kind_2_10= ruleDeletePerson | lv_kind_2_11= ruleUpdatePerson | lv_kind_2_12= ruleSearchPerson | lv_kind_2_13= ruleCreateInvoiceWithProducts | lv_kind_2_14= ruleCreateProduct | lv_kind_2_15= ruleRetrieveProductInformation | lv_kind_2_16= ruleRetrieveOrderStatusByInvoice )
            int alt10=16;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalBilang.g:931:6: lv_kind_2_1= ruleSendEmail
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindSendEmailParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_1=ruleSendEmail();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_1,
                    							"org.xtext.example.bilang.Bilang.SendEmail");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBilang.g:947:6: lv_kind_2_2= ruleSendSMS
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindSendSMSParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_2=ruleSendSMS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_2,
                    							"org.xtext.example.bilang.Bilang.SendSMS");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalBilang.g:963:6: lv_kind_2_3= ruleSendSnailMail
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindSendSnailMailParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_3=ruleSendSnailMail();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_3,
                    							"org.xtext.example.bilang.Bilang.SendSnailMail");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalBilang.g:979:6: lv_kind_2_4= ruleRetrieveDocument
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindRetrieveDocumentParserRuleCall_2_0_3());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_4=ruleRetrieveDocument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_4,
                    							"org.xtext.example.bilang.Bilang.RetrieveDocument");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 5 :
                    // InternalBilang.g:995:6: lv_kind_2_5= ruleRetrieveInvoices
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindRetrieveInvoicesParserRuleCall_2_0_4());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_5=ruleRetrieveInvoices();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_5,
                    							"org.xtext.example.bilang.Bilang.RetrieveInvoices");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 6 :
                    // InternalBilang.g:1011:6: lv_kind_2_6= ruleRetrieveFullAddress
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindRetrieveFullAddressParserRuleCall_2_0_5());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_6=ruleRetrieveFullAddress();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_6,
                    							"org.xtext.example.bilang.Bilang.RetrieveFullAddress");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 7 :
                    // InternalBilang.g:1027:6: lv_kind_2_7= ruleRetrievePersons
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindRetrievePersonsParserRuleCall_2_0_6());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_7=ruleRetrievePersons();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_7,
                    							"org.xtext.example.bilang.Bilang.RetrievePersons");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 8 :
                    // InternalBilang.g:1043:6: lv_kind_2_8= ruleCallPerson
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindCallPersonParserRuleCall_2_0_7());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_8=ruleCallPerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_8,
                    							"org.xtext.example.bilang.Bilang.CallPerson");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 9 :
                    // InternalBilang.g:1059:6: lv_kind_2_9= ruleAddPerson
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindAddPersonParserRuleCall_2_0_8());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_9=ruleAddPerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_9,
                    							"org.xtext.example.bilang.Bilang.AddPerson");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 10 :
                    // InternalBilang.g:1075:6: lv_kind_2_10= ruleDeletePerson
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindDeletePersonParserRuleCall_2_0_9());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_10=ruleDeletePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_10,
                    							"org.xtext.example.bilang.Bilang.DeletePerson");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 11 :
                    // InternalBilang.g:1091:6: lv_kind_2_11= ruleUpdatePerson
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindUpdatePersonParserRuleCall_2_0_10());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_11=ruleUpdatePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_11,
                    							"org.xtext.example.bilang.Bilang.UpdatePerson");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 12 :
                    // InternalBilang.g:1107:6: lv_kind_2_12= ruleSearchPerson
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindSearchPersonParserRuleCall_2_0_11());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_12=ruleSearchPerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_12,
                    							"org.xtext.example.bilang.Bilang.SearchPerson");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 13 :
                    // InternalBilang.g:1123:6: lv_kind_2_13= ruleCreateInvoiceWithProducts
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindCreateInvoiceWithProductsParserRuleCall_2_0_12());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_13=ruleCreateInvoiceWithProducts();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_13,
                    							"org.xtext.example.bilang.Bilang.CreateInvoiceWithProducts");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 14 :
                    // InternalBilang.g:1139:6: lv_kind_2_14= ruleCreateProduct
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindCreateProductParserRuleCall_2_0_13());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_14=ruleCreateProduct();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_14,
                    							"org.xtext.example.bilang.Bilang.CreateProduct");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 15 :
                    // InternalBilang.g:1155:6: lv_kind_2_15= ruleRetrieveProductInformation
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindRetrieveProductInformationParserRuleCall_2_0_14());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_15=ruleRetrieveProductInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_15,
                    							"org.xtext.example.bilang.Bilang.RetrieveProductInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 16 :
                    // InternalBilang.g:1171:6: lv_kind_2_16= ruleRetrieveOrderStatusByInvoice
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getKindRetrieveOrderStatusByInvoiceParserRuleCall_2_0_15());
                    					
                    pushFollow(FOLLOW_24);
                    lv_kind_2_16=ruleRetrieveOrderStatusByInvoice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_16,
                    							"org.xtext.example.bilang.Bilang.RetrieveOrderStatusByInvoice");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalBilang.g:1189:3: (otherlv_3= 'as' ( (lv_result_4_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBilang.g:1190:4: otherlv_3= 'as' ( (lv_result_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getAsKeyword_3_0());
                    			
                    // InternalBilang.g:1194:4: ( (lv_result_4_0= RULE_ID ) )
                    // InternalBilang.g:1195:5: (lv_result_4_0= RULE_ID )
                    {
                    // InternalBilang.g:1195:5: (lv_result_4_0= RULE_ID )
                    // InternalBilang.g:1196:6: lv_result_4_0= RULE_ID
                    {
                    lv_result_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_result_4_0, grammarAccess.getTaskAccess().getResultIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"result",
                    							lv_result_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "entryRuleLetStatement"
    // InternalBilang.g:1221:1: entryRuleLetStatement returns [EObject current=null] : iv_ruleLetStatement= ruleLetStatement EOF ;
    public final EObject entryRuleLetStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetStatement = null;


        try {
            // InternalBilang.g:1221:53: (iv_ruleLetStatement= ruleLetStatement EOF )
            // InternalBilang.g:1222:2: iv_ruleLetStatement= ruleLetStatement EOF
            {
             newCompositeNode(grammarAccess.getLetStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetStatement=ruleLetStatement();

            state._fsp--;

             current =iv_ruleLetStatement; 
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
    // $ANTLR end "entryRuleLetStatement"


    // $ANTLR start "ruleLetStatement"
    // InternalBilang.g:1228:1: ruleLetStatement returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleLetStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1234:2: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // InternalBilang.g:1235:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // InternalBilang.g:1235:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // InternalBilang.g:1236:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLetStatementAccess().getLetKeyword_0());
            		
            // InternalBilang.g:1240:3: ( (lv_variable_1_0= ruleVariableDeclaration ) )
            // InternalBilang.g:1241:4: (lv_variable_1_0= ruleVariableDeclaration )
            {
            // InternalBilang.g:1241:4: (lv_variable_1_0= ruleVariableDeclaration )
            // InternalBilang.g:1242:5: lv_variable_1_0= ruleVariableDeclaration
            {

            					newCompositeNode(grammarAccess.getLetStatementAccess().getVariableVariableDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_variable_1_0=ruleVariableDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetStatementRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.example.bilang.Bilang.VariableDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getLetStatementAccess().getEqualsSignKeyword_2());
            		
            // InternalBilang.g:1263:3: ( (lv_value_3_0= ruleExpression ) )
            // InternalBilang.g:1264:4: (lv_value_3_0= ruleExpression )
            {
            // InternalBilang.g:1264:4: (lv_value_3_0= ruleExpression )
            // InternalBilang.g:1265:5: lv_value_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLetStatementAccess().getValueExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.bilang.Bilang.Expression");
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
    // $ANTLR end "ruleLetStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalBilang.g:1286:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalBilang.g:1286:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalBilang.g:1287:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalBilang.g:1293:1: ruleVariableDeclaration returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBilang.g:1299:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBilang.g:1300:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBilang.g:1300:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBilang.g:1301:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBilang.g:1301:3: (lv_name_0_0= RULE_ID )
            // InternalBilang.g:1302:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableDeclarationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleExpression"
    // InternalBilang.g:1321:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalBilang.g:1321:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalBilang.g:1322:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalBilang.g:1328:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1334:2: (this_OrExpression_0= ruleOrExpression )
            // InternalBilang.g:1335:2: this_OrExpression_0= ruleOrExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            		current = this_OrExpression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalBilang.g:1346:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalBilang.g:1346:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalBilang.g:1347:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalBilang.g:1353:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= 'or' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1359:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= 'or' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalBilang.g:1360:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= 'or' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalBilang.g:1360:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= 'or' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalBilang.g:1361:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= 'or' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBilang.g:1369:3: ( () ( (lv_operator_2_0= 'or' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBilang.g:1370:4: () ( (lv_operator_2_0= 'or' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalBilang.g:1370:4: ()
            	    // InternalBilang.g:1371:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBilang.g:1377:4: ( (lv_operator_2_0= 'or' ) )
            	    // InternalBilang.g:1378:5: (lv_operator_2_0= 'or' )
            	    {
            	    // InternalBilang.g:1378:5: (lv_operator_2_0= 'or' )
            	    // InternalBilang.g:1379:6: lv_operator_2_0= 'or'
            	    {
            	    lv_operator_2_0=(Token)match(input,41,FOLLOW_27); 

            	    						newLeafNode(lv_operator_2_0, grammarAccess.getOrExpressionAccess().getOperatorOrKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOrExpressionRule());
            	    						}
            	    						setWithLastConsumed(current, "operator", lv_operator_2_0, "or");
            	    					

            	    }


            	    }

            	    // InternalBilang.g:1391:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalBilang.g:1392:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalBilang.g:1392:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalBilang.g:1393:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.bilang.Bilang.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalBilang.g:1415:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalBilang.g:1415:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalBilang.g:1416:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalBilang.g:1422:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= 'and' ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1428:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= 'and' ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalBilang.g:1429:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= 'and' ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalBilang.g:1429:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= 'and' ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalBilang.g:1430:3: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= 'and' ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;


            			current = this_ComparisonExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBilang.g:1438:3: ( () ( (lv_operator_2_0= 'and' ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBilang.g:1439:4: () ( (lv_operator_2_0= 'and' ) ) ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalBilang.g:1439:4: ()
            	    // InternalBilang.g:1440:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBilang.g:1446:4: ( (lv_operator_2_0= 'and' ) )
            	    // InternalBilang.g:1447:5: (lv_operator_2_0= 'and' )
            	    {
            	    // InternalBilang.g:1447:5: (lv_operator_2_0= 'and' )
            	    // InternalBilang.g:1448:6: lv_operator_2_0= 'and'
            	    {
            	    lv_operator_2_0=(Token)match(input,20,FOLLOW_27); 

            	    						newLeafNode(lv_operator_2_0, grammarAccess.getAndExpressionAccess().getOperatorAndKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAndExpressionRule());
            	    						}
            	    						setWithLastConsumed(current, "operator", lv_operator_2_0, "and");
            	    					

            	    }


            	    }

            	    // InternalBilang.g:1460:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalBilang.g:1461:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalBilang.g:1461:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalBilang.g:1462:6: lv_right_3_0= ruleComparisonExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.bilang.Bilang.ComparisonExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalBilang.g:1484:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalBilang.g:1484:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalBilang.g:1485:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalBilang.g:1491:1: ruleComparisonExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        Token lv_operator_2_6=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1497:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalBilang.g:1498:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalBilang.g:1498:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalBilang.g:1499:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBilang.g:1507:3: ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=42 && LA15_0<=47)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBilang.g:1508:4: () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalBilang.g:1508:4: ()
            	    // InternalBilang.g:1509:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBilang.g:1515:4: ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '>=' ) ) )
            	    // InternalBilang.g:1516:5: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '>=' ) )
            	    {
            	    // InternalBilang.g:1516:5: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '>=' ) )
            	    // InternalBilang.g:1517:6: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '>=' )
            	    {
            	    // InternalBilang.g:1517:6: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '<' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '>=' )
            	    int alt14=6;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt14=4;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt14=5;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt14=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // InternalBilang.g:1518:7: lv_operator_2_1= '=='
            	            {
            	            lv_operator_2_1=(Token)match(input,42,FOLLOW_27); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalBilang.g:1529:7: lv_operator_2_2= '!='
            	            {
            	            lv_operator_2_2=(Token)match(input,43,FOLLOW_27); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getComparisonExpressionAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalBilang.g:1540:7: lv_operator_2_3= '<'
            	            {
            	            lv_operator_2_3=(Token)match(input,44,FOLLOW_27); 

            	            							newLeafNode(lv_operator_2_3, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalBilang.g:1551:7: lv_operator_2_4= '<='
            	            {
            	            lv_operator_2_4=(Token)match(input,45,FOLLOW_27); 

            	            							newLeafNode(lv_operator_2_4, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalBilang.g:1562:7: lv_operator_2_5= '>'
            	            {
            	            lv_operator_2_5=(Token)match(input,46,FOLLOW_27); 

            	            							newLeafNode(lv_operator_2_5, grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalBilang.g:1573:7: lv_operator_2_6= '>='
            	            {
            	            lv_operator_2_6=(Token)match(input,47,FOLLOW_27); 

            	            							newLeafNode(lv_operator_2_6, grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_6, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBilang.g:1586:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalBilang.g:1587:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalBilang.g:1587:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalBilang.g:1588:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.bilang.Bilang.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalBilang.g:1610:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalBilang.g:1610:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalBilang.g:1611:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalBilang.g:1617:1: rulePrimaryExpression returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ) | ( () otherlv_13= '[' ( ( (lv_elements_14_0= ruleExpression ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleExpression ) ) )* )? otherlv_17= ']' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_1=null;
        Token lv_value_9_2=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_expression_2_0 = null;

        EObject lv_elements_14_0 = null;

        EObject lv_elements_16_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1623:2: ( ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ) | ( () otherlv_13= '[' ( ( (lv_elements_14_0= ruleExpression ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleExpression ) ) )* )? otherlv_17= ']' ) ) )
            // InternalBilang.g:1624:2: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ) | ( () otherlv_13= '[' ( ( (lv_elements_14_0= ruleExpression ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleExpression ) ) )* )? otherlv_17= ']' ) )
            {
            // InternalBilang.g:1624:2: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ) | ( () otherlv_13= '[' ( ( (lv_elements_14_0= ruleExpression ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleExpression ) ) )* )? otherlv_17= ']' ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt19=1;
                }
                break;
            case RULE_STRING:
                {
                alt19=2;
                }
                break;
            case RULE_INT:
                {
                alt19=3;
                }
                break;
            case 48:
            case 49:
                {
                alt19=4;
                }
                break;
            case RULE_ID:
                {
                alt19=5;
                }
                break;
            case 50:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalBilang.g:1625:3: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalBilang.g:1625:3: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalBilang.g:1626:4: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    // InternalBilang.g:1626:4: ()
                    // InternalBilang.g:1627:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalBilang.g:1637:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalBilang.g:1638:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalBilang.g:1638:5: (lv_expression_2_0= ruleExpression )
                    // InternalBilang.g:1639:6: lv_expression_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"org.xtext.example.bilang.Bilang.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBilang.g:1662:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // InternalBilang.g:1662:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // InternalBilang.g:1663:4: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // InternalBilang.g:1663:4: ()
                    // InternalBilang.g:1664:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalBilang.g:1670:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalBilang.g:1671:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalBilang.g:1671:5: (lv_value_5_0= RULE_STRING )
                    // InternalBilang.g:1672:6: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBilang.g:1690:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    {
                    // InternalBilang.g:1690:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    // InternalBilang.g:1691:4: () ( (lv_value_7_0= RULE_INT ) )
                    {
                    // InternalBilang.g:1691:4: ()
                    // InternalBilang.g:1692:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalBilang.g:1698:4: ( (lv_value_7_0= RULE_INT ) )
                    // InternalBilang.g:1699:5: (lv_value_7_0= RULE_INT )
                    {
                    // InternalBilang.g:1699:5: (lv_value_7_0= RULE_INT )
                    // InternalBilang.g:1700:6: lv_value_7_0= RULE_INT
                    {
                    lv_value_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getPrimaryExpressionAccess().getValueINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBilang.g:1718:3: ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) )
                    {
                    // InternalBilang.g:1718:3: ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) )
                    // InternalBilang.g:1719:4: () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) )
                    {
                    // InternalBilang.g:1719:4: ()
                    // InternalBilang.g:1720:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getBooleanLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalBilang.g:1726:4: ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) )
                    // InternalBilang.g:1727:5: ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) )
                    {
                    // InternalBilang.g:1727:5: ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) )
                    // InternalBilang.g:1728:6: (lv_value_9_1= 'true' | lv_value_9_2= 'false' )
                    {
                    // InternalBilang.g:1728:6: (lv_value_9_1= 'true' | lv_value_9_2= 'false' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==48) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==49) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalBilang.g:1729:7: lv_value_9_1= 'true'
                            {
                            lv_value_9_1=(Token)match(input,48,FOLLOW_2); 

                            							newLeafNode(lv_value_9_1, grammarAccess.getPrimaryExpressionAccess().getValueTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalBilang.g:1740:7: lv_value_9_2= 'false'
                            {
                            lv_value_9_2=(Token)match(input,49,FOLLOW_2); 

                            							newLeafNode(lv_value_9_2, grammarAccess.getPrimaryExpressionAccess().getValueFalseKeyword_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_9_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalBilang.g:1755:3: ( () ( (otherlv_11= RULE_ID ) ) )
                    {
                    // InternalBilang.g:1755:3: ( () ( (otherlv_11= RULE_ID ) ) )
                    // InternalBilang.g:1756:4: () ( (otherlv_11= RULE_ID ) )
                    {
                    // InternalBilang.g:1756:4: ()
                    // InternalBilang.g:1757:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_4_0(),
                    						current);
                    				

                    }

                    // InternalBilang.g:1763:4: ( (otherlv_11= RULE_ID ) )
                    // InternalBilang.g:1764:5: (otherlv_11= RULE_ID )
                    {
                    // InternalBilang.g:1764:5: (otherlv_11= RULE_ID )
                    // InternalBilang.g:1765:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationCrossReference_4_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalBilang.g:1778:3: ( () otherlv_13= '[' ( ( (lv_elements_14_0= ruleExpression ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleExpression ) ) )* )? otherlv_17= ']' )
                    {
                    // InternalBilang.g:1778:3: ( () otherlv_13= '[' ( ( (lv_elements_14_0= ruleExpression ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleExpression ) ) )* )? otherlv_17= ']' )
                    // InternalBilang.g:1779:4: () otherlv_13= '[' ( ( (lv_elements_14_0= ruleExpression ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleExpression ) ) )* )? otherlv_17= ']'
                    {
                    // InternalBilang.g:1779:4: ()
                    // InternalBilang.g:1780:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getListLiteralAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,50,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimaryExpressionAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalBilang.g:1790:4: ( ( (lv_elements_14_0= ruleExpression ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleExpression ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||LA18_0==27||(LA18_0>=48 && LA18_0<=50)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalBilang.g:1791:5: ( (lv_elements_14_0= ruleExpression ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleExpression ) ) )*
                            {
                            // InternalBilang.g:1791:5: ( (lv_elements_14_0= ruleExpression ) )
                            // InternalBilang.g:1792:6: (lv_elements_14_0= ruleExpression )
                            {
                            // InternalBilang.g:1792:6: (lv_elements_14_0= ruleExpression )
                            // InternalBilang.g:1793:7: lv_elements_14_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElementsExpressionParserRuleCall_5_2_0_0());
                            						
                            pushFollow(FOLLOW_31);
                            lv_elements_14_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            							}
                            							add(
                            								current,
                            								"elements",
                            								lv_elements_14_0,
                            								"org.xtext.example.bilang.Bilang.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalBilang.g:1810:5: (otherlv_15= ',' ( (lv_elements_16_0= ruleExpression ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==28) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalBilang.g:1811:6: otherlv_15= ',' ( (lv_elements_16_0= ruleExpression ) )
                            	    {
                            	    otherlv_15=(Token)match(input,28,FOLLOW_27); 

                            	    						newLeafNode(otherlv_15, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_5_2_1_0());
                            	    					
                            	    // InternalBilang.g:1815:6: ( (lv_elements_16_0= ruleExpression ) )
                            	    // InternalBilang.g:1816:7: (lv_elements_16_0= ruleExpression )
                            	    {
                            	    // InternalBilang.g:1816:7: (lv_elements_16_0= ruleExpression )
                            	    // InternalBilang.g:1817:8: lv_elements_16_0= ruleExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElementsExpressionParserRuleCall_5_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_31);
                            	    lv_elements_16_0=ruleExpression();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"elements",
                            	    									lv_elements_16_0,
                            	    									"org.xtext.example.bilang.Bilang.Expression");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getRightSquareBracketKeyword_5_3());
                    			

                    }


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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleIfStatement"
    // InternalBilang.g:1845:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalBilang.g:1845:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalBilang.g:1846:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalBilang.g:1852:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' otherlv_3= '{' ( (lv_thenBranch_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_elseBranch_8_0= ruleStatement ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenBranch_4_0 = null;

        EObject lv_elseBranch_8_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1858:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' otherlv_3= '{' ( (lv_thenBranch_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_elseBranch_8_0= ruleStatement ) )* otherlv_9= '}' )? ) )
            // InternalBilang.g:1859:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' otherlv_3= '{' ( (lv_thenBranch_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_elseBranch_8_0= ruleStatement ) )* otherlv_9= '}' )? )
            {
            // InternalBilang.g:1859:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' otherlv_3= '{' ( (lv_thenBranch_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_elseBranch_8_0= ruleStatement ) )* otherlv_9= '}' )? )
            // InternalBilang.g:1860:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' otherlv_3= '{' ( (lv_thenBranch_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_elseBranch_8_0= ruleStatement ) )* otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            // InternalBilang.g:1864:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalBilang.g:1865:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalBilang.g:1865:4: (lv_condition_1_0= ruleExpression )
            // InternalBilang.g:1866:5: lv_condition_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.xtext.example.bilang.Bilang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getThenKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBilang.g:1891:3: ( (lv_thenBranch_4_0= ruleStatement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18||LA20_0==27||LA20_0==39||LA20_0==52||LA20_0==55||LA20_0==57||LA20_0==59||LA20_0==61||LA20_0==64||(LA20_0>=69 && LA20_0<=70)||LA20_0==72||LA20_0==77||(LA20_0>=79 && LA20_0<=80)||LA20_0==100||LA20_0==114||LA20_0==120||LA20_0==124) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBilang.g:1892:4: (lv_thenBranch_4_0= ruleStatement )
            	    {
            	    // InternalBilang.g:1892:4: (lv_thenBranch_4_0= ruleStatement )
            	    // InternalBilang.g:1893:5: lv_thenBranch_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementAccess().getThenBranchStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_thenBranch_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"thenBranch",
            	    						lv_thenBranch_4_0,
            	    						"org.xtext.example.bilang.Bilang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_33); 

            			newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalBilang.g:1914:3: (otherlv_6= 'else' otherlv_7= '{' ( (lv_elseBranch_8_0= ruleStatement ) )* otherlv_9= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==54) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBilang.g:1915:4: otherlv_6= 'else' otherlv_7= '{' ( (lv_elseBranch_8_0= ruleStatement ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getElseKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalBilang.g:1923:4: ( (lv_elseBranch_8_0= ruleStatement ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==18||LA21_0==27||LA21_0==39||LA21_0==52||LA21_0==55||LA21_0==57||LA21_0==59||LA21_0==61||LA21_0==64||(LA21_0>=69 && LA21_0<=70)||LA21_0==72||LA21_0==77||(LA21_0>=79 && LA21_0<=80)||LA21_0==100||LA21_0==114||LA21_0==120||LA21_0==124) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalBilang.g:1924:5: (lv_elseBranch_8_0= ruleStatement )
                    	    {
                    	    // InternalBilang.g:1924:5: (lv_elseBranch_8_0= ruleStatement )
                    	    // InternalBilang.g:1925:6: lv_elseBranch_8_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfStatementAccess().getElseBranchStatementParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_elseBranch_8_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elseBranch",
                    	    							lv_elseBranch_8_0,
                    	    							"org.xtext.example.bilang.Bilang.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleForEachStatement"
    // InternalBilang.g:1951:1: entryRuleForEachStatement returns [EObject current=null] : iv_ruleForEachStatement= ruleForEachStatement EOF ;
    public final EObject entryRuleForEachStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachStatement = null;


        try {
            // InternalBilang.g:1951:57: (iv_ruleForEachStatement= ruleForEachStatement EOF )
            // InternalBilang.g:1952:2: iv_ruleForEachStatement= ruleForEachStatement EOF
            {
             newCompositeNode(grammarAccess.getForEachStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEachStatement=ruleForEachStatement();

            state._fsp--;

             current =iv_ruleForEachStatement; 
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
    // $ANTLR end "entryRuleForEachStatement"


    // $ANTLR start "ruleForEachStatement"
    // InternalBilang.g:1958:1: ruleForEachStatement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= 'in' ( (lv_collection_3_0= ruleExpression ) ) otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}' ) ;
    public final EObject ruleForEachStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_variable_1_0 = null;

        EObject lv_collection_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:1964:2: ( (otherlv_0= 'for' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= 'in' ( (lv_collection_3_0= ruleExpression ) ) otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            // InternalBilang.g:1965:2: (otherlv_0= 'for' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= 'in' ( (lv_collection_3_0= ruleExpression ) ) otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}' )
            {
            // InternalBilang.g:1965:2: (otherlv_0= 'for' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= 'in' ( (lv_collection_3_0= ruleExpression ) ) otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}' )
            // InternalBilang.g:1966:3: otherlv_0= 'for' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= 'in' ( (lv_collection_3_0= ruleExpression ) ) otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachStatementAccess().getForKeyword_0());
            		
            // InternalBilang.g:1970:3: ( (lv_variable_1_0= ruleVariableDeclaration ) )
            // InternalBilang.g:1971:4: (lv_variable_1_0= ruleVariableDeclaration )
            {
            // InternalBilang.g:1971:4: (lv_variable_1_0= ruleVariableDeclaration )
            // InternalBilang.g:1972:5: lv_variable_1_0= ruleVariableDeclaration
            {

            					newCompositeNode(grammarAccess.getForEachStatementAccess().getVariableVariableDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_variable_1_0=ruleVariableDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachStatementRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.example.bilang.Bilang.VariableDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachStatementAccess().getInKeyword_2());
            		
            // InternalBilang.g:1993:3: ( (lv_collection_3_0= ruleExpression ) )
            // InternalBilang.g:1994:4: (lv_collection_3_0= ruleExpression )
            {
            // InternalBilang.g:1994:4: (lv_collection_3_0= ruleExpression )
            // InternalBilang.g:1995:5: lv_collection_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getForEachStatementAccess().getCollectionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_collection_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachStatementRule());
            					}
            					set(
            						current,
            						"collection",
            						lv_collection_3_0,
            						"org.xtext.example.bilang.Bilang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getForEachStatementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBilang.g:2016:3: ( (lv_body_5_0= ruleStatement ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==18||LA23_0==27||LA23_0==39||LA23_0==52||LA23_0==55||LA23_0==57||LA23_0==59||LA23_0==61||LA23_0==64||(LA23_0>=69 && LA23_0<=70)||LA23_0==72||LA23_0==77||(LA23_0>=79 && LA23_0<=80)||LA23_0==100||LA23_0==114||LA23_0==120||LA23_0==124) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBilang.g:2017:4: (lv_body_5_0= ruleStatement )
            	    {
            	    // InternalBilang.g:2017:4: (lv_body_5_0= ruleStatement )
            	    // InternalBilang.g:2018:5: lv_body_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getForEachStatementAccess().getBodyStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_body_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForEachStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_5_0,
            	    						"org.xtext.example.bilang.Bilang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getForEachStatementAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleForEachStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalBilang.g:2043:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalBilang.g:2043:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalBilang.g:2044:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;

             current =iv_ruleWhileStatement; 
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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalBilang.g:2050:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) )* otherlv_5= '}' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_1_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2056:2: ( (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) )* otherlv_5= '}' ) )
            // InternalBilang.g:2057:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) )* otherlv_5= '}' )
            {
            // InternalBilang.g:2057:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) )* otherlv_5= '}' )
            // InternalBilang.g:2058:3: otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
            		
            // InternalBilang.g:2062:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalBilang.g:2063:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalBilang.g:2063:4: (lv_condition_1_0= ruleExpression )
            // InternalBilang.g:2064:5: lv_condition_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.xtext.example.bilang.Bilang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,58,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getDoKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBilang.g:2089:3: ( (lv_body_4_0= ruleStatement ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18||LA24_0==27||LA24_0==39||LA24_0==52||LA24_0==55||LA24_0==57||LA24_0==59||LA24_0==61||LA24_0==64||(LA24_0>=69 && LA24_0<=70)||LA24_0==72||LA24_0==77||(LA24_0>=79 && LA24_0<=80)||LA24_0==100||LA24_0==114||LA24_0==120||LA24_0==124) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBilang.g:2090:4: (lv_body_4_0= ruleStatement )
            	    {
            	    // InternalBilang.g:2090:4: (lv_body_4_0= ruleStatement )
            	    // InternalBilang.g:2091:5: lv_body_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileStatementAccess().getBodyStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_body_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_4_0,
            	    						"org.xtext.example.bilang.Bilang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWhileStatementAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleParallelProcess"
    // InternalBilang.g:2116:1: entryRuleParallelProcess returns [EObject current=null] : iv_ruleParallelProcess= ruleParallelProcess EOF ;
    public final EObject entryRuleParallelProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelProcess = null;


        try {
            // InternalBilang.g:2116:56: (iv_ruleParallelProcess= ruleParallelProcess EOF )
            // InternalBilang.g:2117:2: iv_ruleParallelProcess= ruleParallelProcess EOF
            {
             newCompositeNode(grammarAccess.getParallelProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelProcess=ruleParallelProcess();

            state._fsp--;

             current =iv_ruleParallelProcess; 
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
    // $ANTLR end "entryRuleParallelProcess"


    // $ANTLR start "ruleParallelProcess"
    // InternalBilang.g:2123:1: ruleParallelProcess returns [EObject current=null] : (otherlv_0= 'parallel' otherlv_1= '{' ( (lv_branches_2_0= ruleParallelBranch ) )+ otherlv_3= '}' ) ;
    public final EObject ruleParallelProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_branches_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2129:2: ( (otherlv_0= 'parallel' otherlv_1= '{' ( (lv_branches_2_0= ruleParallelBranch ) )+ otherlv_3= '}' ) )
            // InternalBilang.g:2130:2: (otherlv_0= 'parallel' otherlv_1= '{' ( (lv_branches_2_0= ruleParallelBranch ) )+ otherlv_3= '}' )
            {
            // InternalBilang.g:2130:2: (otherlv_0= 'parallel' otherlv_1= '{' ( (lv_branches_2_0= ruleParallelBranch ) )+ otherlv_3= '}' )
            // InternalBilang.g:2131:3: otherlv_0= 'parallel' otherlv_1= '{' ( (lv_branches_2_0= ruleParallelBranch ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelProcessAccess().getParallelKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelProcessAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBilang.g:2139:3: ( (lv_branches_2_0= ruleParallelBranch ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==60) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBilang.g:2140:4: (lv_branches_2_0= ruleParallelBranch )
            	    {
            	    // InternalBilang.g:2140:4: (lv_branches_2_0= ruleParallelBranch )
            	    // InternalBilang.g:2141:5: lv_branches_2_0= ruleParallelBranch
            	    {

            	    					newCompositeNode(grammarAccess.getParallelProcessAccess().getBranchesParallelBranchParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_branches_2_0=ruleParallelBranch();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParallelProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"branches",
            	    						lv_branches_2_0,
            	    						"org.xtext.example.bilang.Bilang.ParallelBranch");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParallelProcessAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleParallelProcess"


    // $ANTLR start "entryRuleParallelBranch"
    // InternalBilang.g:2166:1: entryRuleParallelBranch returns [EObject current=null] : iv_ruleParallelBranch= ruleParallelBranch EOF ;
    public final EObject entryRuleParallelBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelBranch = null;


        try {
            // InternalBilang.g:2166:55: (iv_ruleParallelBranch= ruleParallelBranch EOF )
            // InternalBilang.g:2167:2: iv_ruleParallelBranch= ruleParallelBranch EOF
            {
             newCompositeNode(grammarAccess.getParallelBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelBranch=ruleParallelBranch();

            state._fsp--;

             current =iv_ruleParallelBranch; 
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
    // $ANTLR end "entryRuleParallelBranch"


    // $ANTLR start "ruleParallelBranch"
    // InternalBilang.g:2173:1: ruleParallelBranch returns [EObject current=null] : (otherlv_0= 'branch' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleParallelBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2179:2: ( (otherlv_0= 'branch' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalBilang.g:2180:2: (otherlv_0= 'branch' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalBilang.g:2180:2: (otherlv_0= 'branch' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalBilang.g:2181:3: otherlv_0= 'branch' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelBranchAccess().getBranchKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelBranchAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBilang.g:2189:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18||LA26_0==27||LA26_0==39||LA26_0==52||LA26_0==55||LA26_0==57||LA26_0==59||LA26_0==61||LA26_0==64||(LA26_0>=69 && LA26_0<=70)||LA26_0==72||LA26_0==77||(LA26_0>=79 && LA26_0<=80)||LA26_0==100||LA26_0==114||LA26_0==120||LA26_0==124) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBilang.g:2190:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalBilang.g:2190:4: (lv_statements_2_0= ruleStatement )
            	    // InternalBilang.g:2191:5: lv_statements_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getParallelBranchAccess().getStatementsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParallelBranchRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"org.xtext.example.bilang.Bilang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParallelBranchAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleParallelBranch"


    // $ANTLR start "entryRuleTryCatchStatement"
    // InternalBilang.g:2216:1: entryRuleTryCatchStatement returns [EObject current=null] : iv_ruleTryCatchStatement= ruleTryCatchStatement EOF ;
    public final EObject entryRuleTryCatchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTryCatchStatement = null;


        try {
            // InternalBilang.g:2216:58: (iv_ruleTryCatchStatement= ruleTryCatchStatement EOF )
            // InternalBilang.g:2217:2: iv_ruleTryCatchStatement= ruleTryCatchStatement EOF
            {
             newCompositeNode(grammarAccess.getTryCatchStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTryCatchStatement=ruleTryCatchStatement();

            state._fsp--;

             current =iv_ruleTryCatchStatement; 
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
    // $ANTLR end "entryRuleTryCatchStatement"


    // $ANTLR start "ruleTryCatchStatement"
    // InternalBilang.g:2223:1: ruleTryCatchStatement returns [EObject current=null] : (otherlv_0= 'try' otherlv_1= '{' ( (lv_tryBody_2_0= ruleStatement ) )* otherlv_3= '}' otherlv_4= 'catch' ( (lv_errorVariable_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_catchBody_7_0= ruleStatement ) )* otherlv_8= '}' (otherlv_9= 'finally' otherlv_10= '{' ( (lv_finallyBody_11_0= ruleStatement ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleTryCatchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_errorVariable_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_tryBody_2_0 = null;

        EObject lv_catchBody_7_0 = null;

        EObject lv_finallyBody_11_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2229:2: ( (otherlv_0= 'try' otherlv_1= '{' ( (lv_tryBody_2_0= ruleStatement ) )* otherlv_3= '}' otherlv_4= 'catch' ( (lv_errorVariable_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_catchBody_7_0= ruleStatement ) )* otherlv_8= '}' (otherlv_9= 'finally' otherlv_10= '{' ( (lv_finallyBody_11_0= ruleStatement ) )* otherlv_12= '}' )? ) )
            // InternalBilang.g:2230:2: (otherlv_0= 'try' otherlv_1= '{' ( (lv_tryBody_2_0= ruleStatement ) )* otherlv_3= '}' otherlv_4= 'catch' ( (lv_errorVariable_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_catchBody_7_0= ruleStatement ) )* otherlv_8= '}' (otherlv_9= 'finally' otherlv_10= '{' ( (lv_finallyBody_11_0= ruleStatement ) )* otherlv_12= '}' )? )
            {
            // InternalBilang.g:2230:2: (otherlv_0= 'try' otherlv_1= '{' ( (lv_tryBody_2_0= ruleStatement ) )* otherlv_3= '}' otherlv_4= 'catch' ( (lv_errorVariable_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_catchBody_7_0= ruleStatement ) )* otherlv_8= '}' (otherlv_9= 'finally' otherlv_10= '{' ( (lv_finallyBody_11_0= ruleStatement ) )* otherlv_12= '}' )? )
            // InternalBilang.g:2231:3: otherlv_0= 'try' otherlv_1= '{' ( (lv_tryBody_2_0= ruleStatement ) )* otherlv_3= '}' otherlv_4= 'catch' ( (lv_errorVariable_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_catchBody_7_0= ruleStatement ) )* otherlv_8= '}' (otherlv_9= 'finally' otherlv_10= '{' ( (lv_finallyBody_11_0= ruleStatement ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getTryCatchStatementAccess().getTryKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTryCatchStatementAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBilang.g:2239:3: ( (lv_tryBody_2_0= ruleStatement ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18||LA27_0==27||LA27_0==39||LA27_0==52||LA27_0==55||LA27_0==57||LA27_0==59||LA27_0==61||LA27_0==64||(LA27_0>=69 && LA27_0<=70)||LA27_0==72||LA27_0==77||(LA27_0>=79 && LA27_0<=80)||LA27_0==100||LA27_0==114||LA27_0==120||LA27_0==124) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBilang.g:2240:4: (lv_tryBody_2_0= ruleStatement )
            	    {
            	    // InternalBilang.g:2240:4: (lv_tryBody_2_0= ruleStatement )
            	    // InternalBilang.g:2241:5: lv_tryBody_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTryCatchStatementAccess().getTryBodyStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_tryBody_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTryCatchStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tryBody",
            	    						lv_tryBody_2_0,
            	    						"org.xtext.example.bilang.Bilang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getTryCatchStatementAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,62,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getTryCatchStatementAccess().getCatchKeyword_4());
            		
            // InternalBilang.g:2266:3: ( (lv_errorVariable_5_0= RULE_ID ) )
            // InternalBilang.g:2267:4: (lv_errorVariable_5_0= RULE_ID )
            {
            // InternalBilang.g:2267:4: (lv_errorVariable_5_0= RULE_ID )
            // InternalBilang.g:2268:5: lv_errorVariable_5_0= RULE_ID
            {
            lv_errorVariable_5_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_errorVariable_5_0, grammarAccess.getTryCatchStatementAccess().getErrorVariableIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTryCatchStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"errorVariable",
            						lv_errorVariable_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getTryCatchStatementAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBilang.g:2288:3: ( (lv_catchBody_7_0= ruleStatement ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==18||LA28_0==27||LA28_0==39||LA28_0==52||LA28_0==55||LA28_0==57||LA28_0==59||LA28_0==61||LA28_0==64||(LA28_0>=69 && LA28_0<=70)||LA28_0==72||LA28_0==77||(LA28_0>=79 && LA28_0<=80)||LA28_0==100||LA28_0==114||LA28_0==120||LA28_0==124) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBilang.g:2289:4: (lv_catchBody_7_0= ruleStatement )
            	    {
            	    // InternalBilang.g:2289:4: (lv_catchBody_7_0= ruleStatement )
            	    // InternalBilang.g:2290:5: lv_catchBody_7_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTryCatchStatementAccess().getCatchBodyStatementParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_catchBody_7_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTryCatchStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"catchBody",
            	    						lv_catchBody_7_0,
            	    						"org.xtext.example.bilang.Bilang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_39); 

            			newLeafNode(otherlv_8, grammarAccess.getTryCatchStatementAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalBilang.g:2311:3: (otherlv_9= 'finally' otherlv_10= '{' ( (lv_finallyBody_11_0= ruleStatement ) )* otherlv_12= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==63) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBilang.g:2312:4: otherlv_9= 'finally' otherlv_10= '{' ( (lv_finallyBody_11_0= ruleStatement ) )* otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,63,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getTryCatchStatementAccess().getFinallyKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getTryCatchStatementAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalBilang.g:2320:4: ( (lv_finallyBody_11_0= ruleStatement ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==18||LA29_0==27||LA29_0==39||LA29_0==52||LA29_0==55||LA29_0==57||LA29_0==59||LA29_0==61||LA29_0==64||(LA29_0>=69 && LA29_0<=70)||LA29_0==72||LA29_0==77||(LA29_0>=79 && LA29_0<=80)||LA29_0==100||LA29_0==114||LA29_0==120||LA29_0==124) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalBilang.g:2321:5: (lv_finallyBody_11_0= ruleStatement )
                    	    {
                    	    // InternalBilang.g:2321:5: (lv_finallyBody_11_0= ruleStatement )
                    	    // InternalBilang.g:2322:6: lv_finallyBody_11_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getTryCatchStatementAccess().getFinallyBodyStatementParserRuleCall_9_2_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_finallyBody_11_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTryCatchStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"finallyBody",
                    	    							lv_finallyBody_11_0,
                    	    							"org.xtext.example.bilang.Bilang.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getTryCatchStatementAccess().getRightCurlyBracketKeyword_9_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleTryCatchStatement"


    // $ANTLR start "entryRuleRetryStatement"
    // InternalBilang.g:2348:1: entryRuleRetryStatement returns [EObject current=null] : iv_ruleRetryStatement= ruleRetryStatement EOF ;
    public final EObject entryRuleRetryStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetryStatement = null;


        try {
            // InternalBilang.g:2348:55: (iv_ruleRetryStatement= ruleRetryStatement EOF )
            // InternalBilang.g:2349:2: iv_ruleRetryStatement= ruleRetryStatement EOF
            {
             newCompositeNode(grammarAccess.getRetryStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetryStatement=ruleRetryStatement();

            state._fsp--;

             current =iv_ruleRetryStatement; 
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
    // $ANTLR end "entryRuleRetryStatement"


    // $ANTLR start "ruleRetryStatement"
    // InternalBilang.g:2355:1: ruleRetryStatement returns [EObject current=null] : (otherlv_0= 'retry' otherlv_1= 'up' otherlv_2= 'to' ( (lv_attempts_3_0= RULE_INT ) ) otherlv_4= 'times' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) )* otherlv_7= '}' ) ;
    public final EObject ruleRetryStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_attempts_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2361:2: ( (otherlv_0= 'retry' otherlv_1= 'up' otherlv_2= 'to' ( (lv_attempts_3_0= RULE_INT ) ) otherlv_4= 'times' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) )* otherlv_7= '}' ) )
            // InternalBilang.g:2362:2: (otherlv_0= 'retry' otherlv_1= 'up' otherlv_2= 'to' ( (lv_attempts_3_0= RULE_INT ) ) otherlv_4= 'times' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) )* otherlv_7= '}' )
            {
            // InternalBilang.g:2362:2: (otherlv_0= 'retry' otherlv_1= 'up' otherlv_2= 'to' ( (lv_attempts_3_0= RULE_INT ) ) otherlv_4= 'times' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) )* otherlv_7= '}' )
            // InternalBilang.g:2363:3: otherlv_0= 'retry' otherlv_1= 'up' otherlv_2= 'to' ( (lv_attempts_3_0= RULE_INT ) ) otherlv_4= 'times' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getRetryStatementAccess().getRetryKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getRetryStatementAccess().getUpKeyword_1());
            		
            otherlv_2=(Token)match(input,66,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getRetryStatementAccess().getToKeyword_2());
            		
            // InternalBilang.g:2375:3: ( (lv_attempts_3_0= RULE_INT ) )
            // InternalBilang.g:2376:4: (lv_attempts_3_0= RULE_INT )
            {
            // InternalBilang.g:2376:4: (lv_attempts_3_0= RULE_INT )
            // InternalBilang.g:2377:5: lv_attempts_3_0= RULE_INT
            {
            lv_attempts_3_0=(Token)match(input,RULE_INT,FOLLOW_43); 

            					newLeafNode(lv_attempts_3_0, grammarAccess.getRetryStatementAccess().getAttemptsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRetryStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attempts",
            						lv_attempts_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,67,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getRetryStatementAccess().getTimesKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getRetryStatementAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBilang.g:2401:3: ( (lv_body_6_0= ruleStatement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18||LA31_0==27||LA31_0==39||LA31_0==52||LA31_0==55||LA31_0==57||LA31_0==59||LA31_0==61||LA31_0==64||(LA31_0>=69 && LA31_0<=70)||LA31_0==72||LA31_0==77||(LA31_0>=79 && LA31_0<=80)||LA31_0==100||LA31_0==114||LA31_0==120||LA31_0==124) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBilang.g:2402:4: (lv_body_6_0= ruleStatement )
            	    {
            	    // InternalBilang.g:2402:4: (lv_body_6_0= ruleStatement )
            	    // InternalBilang.g:2403:5: lv_body_6_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getRetryStatementAccess().getBodyStatementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_body_6_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRetryStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_6_0,
            	    						"org.xtext.example.bilang.Bilang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRetryStatementAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRetryStatement"


    // $ANTLR start "entryRuleTimeoutStatement"
    // InternalBilang.g:2428:1: entryRuleTimeoutStatement returns [EObject current=null] : iv_ruleTimeoutStatement= ruleTimeoutStatement EOF ;
    public final EObject entryRuleTimeoutStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeoutStatement = null;


        try {
            // InternalBilang.g:2428:57: (iv_ruleTimeoutStatement= ruleTimeoutStatement EOF )
            // InternalBilang.g:2429:2: iv_ruleTimeoutStatement= ruleTimeoutStatement EOF
            {
             newCompositeNode(grammarAccess.getTimeoutStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeoutStatement=ruleTimeoutStatement();

            state._fsp--;

             current =iv_ruleTimeoutStatement; 
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
    // $ANTLR end "entryRuleTimeoutStatement"


    // $ANTLR start "ruleTimeoutStatement"
    // InternalBilang.g:2435:1: ruleTimeoutStatement returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'timeout' ( (lv_duration_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}' ) ;
    public final EObject ruleTimeoutStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_duration_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_unit_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2441:2: ( (otherlv_0= 'with' otherlv_1= 'timeout' ( (lv_duration_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            // InternalBilang.g:2442:2: (otherlv_0= 'with' otherlv_1= 'timeout' ( (lv_duration_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}' )
            {
            // InternalBilang.g:2442:2: (otherlv_0= 'with' otherlv_1= 'timeout' ( (lv_duration_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}' )
            // InternalBilang.g:2443:3: otherlv_0= 'with' otherlv_1= 'timeout' ( (lv_duration_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutStatementAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,68,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeoutStatementAccess().getTimeoutKeyword_1());
            		
            // InternalBilang.g:2451:3: ( (lv_duration_2_0= RULE_INT ) )
            // InternalBilang.g:2452:4: (lv_duration_2_0= RULE_INT )
            {
            // InternalBilang.g:2452:4: (lv_duration_2_0= RULE_INT )
            // InternalBilang.g:2453:5: lv_duration_2_0= RULE_INT
            {
            lv_duration_2_0=(Token)match(input,RULE_INT,FOLLOW_45); 

            					newLeafNode(lv_duration_2_0, grammarAccess.getTimeoutStatementAccess().getDurationINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeoutStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalBilang.g:2469:3: ( (lv_unit_3_0= ruleTimeUnit ) )
            // InternalBilang.g:2470:4: (lv_unit_3_0= ruleTimeUnit )
            {
            // InternalBilang.g:2470:4: (lv_unit_3_0= ruleTimeUnit )
            // InternalBilang.g:2471:5: lv_unit_3_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getTimeoutStatementAccess().getUnitTimeUnitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_unit_3_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeoutStatementRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_3_0,
            						"org.xtext.example.bilang.Bilang.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getTimeoutStatementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBilang.g:2492:3: ( (lv_body_5_0= ruleStatement ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==18||LA32_0==27||LA32_0==39||LA32_0==52||LA32_0==55||LA32_0==57||LA32_0==59||LA32_0==61||LA32_0==64||(LA32_0>=69 && LA32_0<=70)||LA32_0==72||LA32_0==77||(LA32_0>=79 && LA32_0<=80)||LA32_0==100||LA32_0==114||LA32_0==120||LA32_0==124) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBilang.g:2493:4: (lv_body_5_0= ruleStatement )
            	    {
            	    // InternalBilang.g:2493:4: (lv_body_5_0= ruleStatement )
            	    // InternalBilang.g:2494:5: lv_body_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTimeoutStatementAccess().getBodyStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_body_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTimeoutStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_5_0,
            	    						"org.xtext.example.bilang.Bilang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTimeoutStatementAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTimeoutStatement"


    // $ANTLR start "entryRuleCompensateStatement"
    // InternalBilang.g:2519:1: entryRuleCompensateStatement returns [EObject current=null] : iv_ruleCompensateStatement= ruleCompensateStatement EOF ;
    public final EObject entryRuleCompensateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompensateStatement = null;


        try {
            // InternalBilang.g:2519:60: (iv_ruleCompensateStatement= ruleCompensateStatement EOF )
            // InternalBilang.g:2520:2: iv_ruleCompensateStatement= ruleCompensateStatement EOF
            {
             newCompositeNode(grammarAccess.getCompensateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompensateStatement=ruleCompensateStatement();

            state._fsp--;

             current =iv_ruleCompensateStatement; 
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
    // $ANTLR end "entryRuleCompensateStatement"


    // $ANTLR start "ruleCompensateStatement"
    // InternalBilang.g:2526:1: ruleCompensateStatement returns [EObject current=null] : (otherlv_0= 'compensate' otherlv_1= 'with' otherlv_2= '{' ( (lv_actions_3_0= ruleStatement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleCompensateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actions_3_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2532:2: ( (otherlv_0= 'compensate' otherlv_1= 'with' otherlv_2= '{' ( (lv_actions_3_0= ruleStatement ) )+ otherlv_4= '}' ) )
            // InternalBilang.g:2533:2: (otherlv_0= 'compensate' otherlv_1= 'with' otherlv_2= '{' ( (lv_actions_3_0= ruleStatement ) )+ otherlv_4= '}' )
            {
            // InternalBilang.g:2533:2: (otherlv_0= 'compensate' otherlv_1= 'with' otherlv_2= '{' ( (lv_actions_3_0= ruleStatement ) )+ otherlv_4= '}' )
            // InternalBilang.g:2534:3: otherlv_0= 'compensate' otherlv_1= 'with' otherlv_2= '{' ( (lv_actions_3_0= ruleStatement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCompensateStatementAccess().getCompensateKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCompensateStatementAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getCompensateStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBilang.g:2546:3: ( (lv_actions_3_0= ruleStatement ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==18||LA33_0==27||LA33_0==39||LA33_0==52||LA33_0==55||LA33_0==57||LA33_0==59||LA33_0==61||LA33_0==64||(LA33_0>=69 && LA33_0<=70)||LA33_0==72||LA33_0==77||(LA33_0>=79 && LA33_0<=80)||LA33_0==100||LA33_0==114||LA33_0==120||LA33_0==124) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBilang.g:2547:4: (lv_actions_3_0= ruleStatement )
            	    {
            	    // InternalBilang.g:2547:4: (lv_actions_3_0= ruleStatement )
            	    // InternalBilang.g:2548:5: lv_actions_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getCompensateStatementAccess().getActionsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_actions_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompensateStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_3_0,
            	    						"org.xtext.example.bilang.Bilang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCompensateStatementAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCompensateStatement"


    // $ANTLR start "entryRuleRequireStatement"
    // InternalBilang.g:2573:1: entryRuleRequireStatement returns [EObject current=null] : iv_ruleRequireStatement= ruleRequireStatement EOF ;
    public final EObject entryRuleRequireStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequireStatement = null;


        try {
            // InternalBilang.g:2573:57: (iv_ruleRequireStatement= ruleRequireStatement EOF )
            // InternalBilang.g:2574:2: iv_ruleRequireStatement= ruleRequireStatement EOF
            {
             newCompositeNode(grammarAccess.getRequireStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequireStatement=ruleRequireStatement();

            state._fsp--;

             current =iv_ruleRequireStatement; 
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
    // $ANTLR end "entryRuleRequireStatement"


    // $ANTLR start "ruleRequireStatement"
    // InternalBilang.g:2580:1: ruleRequireStatement returns [EObject current=null] : (otherlv_0= 'require' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'before' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) )* otherlv_5= '}' ) ;
    public final EObject ruleRequireStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_1_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2586:2: ( (otherlv_0= 'require' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'before' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) )* otherlv_5= '}' ) )
            // InternalBilang.g:2587:2: (otherlv_0= 'require' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'before' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) )* otherlv_5= '}' )
            {
            // InternalBilang.g:2587:2: (otherlv_0= 'require' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'before' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) )* otherlv_5= '}' )
            // InternalBilang.g:2588:3: otherlv_0= 'require' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'before' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getRequireStatementAccess().getRequireKeyword_0());
            		
            // InternalBilang.g:2592:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalBilang.g:2593:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalBilang.g:2593:4: (lv_condition_1_0= ruleExpression )
            // InternalBilang.g:2594:5: lv_condition_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRequireStatementAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequireStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.xtext.example.bilang.Bilang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,71,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getRequireStatementAccess().getBeforeKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getRequireStatementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBilang.g:2619:3: ( (lv_body_4_0= ruleStatement ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==18||LA34_0==27||LA34_0==39||LA34_0==52||LA34_0==55||LA34_0==57||LA34_0==59||LA34_0==61||LA34_0==64||(LA34_0>=69 && LA34_0<=70)||LA34_0==72||LA34_0==77||(LA34_0>=79 && LA34_0<=80)||LA34_0==100||LA34_0==114||LA34_0==120||LA34_0==124) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBilang.g:2620:4: (lv_body_4_0= ruleStatement )
            	    {
            	    // InternalBilang.g:2620:4: (lv_body_4_0= ruleStatement )
            	    // InternalBilang.g:2621:5: lv_body_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getRequireStatementAccess().getBodyStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_body_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequireStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_4_0,
            	    						"org.xtext.example.bilang.Bilang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRequireStatementAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRequireStatement"


    // $ANTLR start "entryRuleWaitStatement"
    // InternalBilang.g:2646:1: entryRuleWaitStatement returns [EObject current=null] : iv_ruleWaitStatement= ruleWaitStatement EOF ;
    public final EObject entryRuleWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaitStatement = null;


        try {
            // InternalBilang.g:2646:54: (iv_ruleWaitStatement= ruleWaitStatement EOF )
            // InternalBilang.g:2647:2: iv_ruleWaitStatement= ruleWaitStatement EOF
            {
             newCompositeNode(grammarAccess.getWaitStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWaitStatement=ruleWaitStatement();

            state._fsp--;

             current =iv_ruleWaitStatement; 
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
    // $ANTLR end "entryRuleWaitStatement"


    // $ANTLR start "ruleWaitStatement"
    // InternalBilang.g:2653:1: ruleWaitStatement returns [EObject current=null] : (otherlv_0= 'wait' otherlv_1= 'for' ( (lv_duration_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleWaitStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_duration_2_0=null;
        AntlrDatatypeRuleToken lv_unit_3_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2659:2: ( (otherlv_0= 'wait' otherlv_1= 'for' ( (lv_duration_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) ) )
            // InternalBilang.g:2660:2: (otherlv_0= 'wait' otherlv_1= 'for' ( (lv_duration_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) )
            {
            // InternalBilang.g:2660:2: (otherlv_0= 'wait' otherlv_1= 'for' ( (lv_duration_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) )
            // InternalBilang.g:2661:3: otherlv_0= 'wait' otherlv_1= 'for' ( (lv_duration_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTimeUnit ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitStatementAccess().getWaitKeyword_0());
            		
            otherlv_1=(Token)match(input,55,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitStatementAccess().getForKeyword_1());
            		
            // InternalBilang.g:2669:3: ( (lv_duration_2_0= RULE_INT ) )
            // InternalBilang.g:2670:4: (lv_duration_2_0= RULE_INT )
            {
            // InternalBilang.g:2670:4: (lv_duration_2_0= RULE_INT )
            // InternalBilang.g:2671:5: lv_duration_2_0= RULE_INT
            {
            lv_duration_2_0=(Token)match(input,RULE_INT,FOLLOW_45); 

            					newLeafNode(lv_duration_2_0, grammarAccess.getWaitStatementAccess().getDurationINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaitStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalBilang.g:2687:3: ( (lv_unit_3_0= ruleTimeUnit ) )
            // InternalBilang.g:2688:4: (lv_unit_3_0= ruleTimeUnit )
            {
            // InternalBilang.g:2688:4: (lv_unit_3_0= ruleTimeUnit )
            // InternalBilang.g:2689:5: lv_unit_3_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getWaitStatementAccess().getUnitTimeUnitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_3_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitStatementRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_3_0,
            						"org.xtext.example.bilang.Bilang.TimeUnit");
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
    // $ANTLR end "ruleWaitStatement"


    // $ANTLR start "entryRuleTimeUnit"
    // InternalBilang.g:2710:1: entryRuleTimeUnit returns [String current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final String entryRuleTimeUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnit = null;


        try {
            // InternalBilang.g:2710:48: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // InternalBilang.g:2711:2: iv_ruleTimeUnit= ruleTimeUnit EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeUnit=ruleTimeUnit();

            state._fsp--;

             current =iv_ruleTimeUnit.getText(); 
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
    // $ANTLR end "entryRuleTimeUnit"


    // $ANTLR start "ruleTimeUnit"
    // InternalBilang.g:2717:1: ruleTimeUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'seconds' | kw= 'minutes' | kw= 'hours' | kw= 'days' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBilang.g:2723:2: ( (kw= 'seconds' | kw= 'minutes' | kw= 'hours' | kw= 'days' ) )
            // InternalBilang.g:2724:2: (kw= 'seconds' | kw= 'minutes' | kw= 'hours' | kw= 'days' )
            {
            // InternalBilang.g:2724:2: (kw= 'seconds' | kw= 'minutes' | kw= 'hours' | kw= 'days' )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt35=1;
                }
                break;
            case 74:
                {
                alt35=2;
                }
                break;
            case 75:
                {
                alt35=3;
                }
                break;
            case 76:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalBilang.g:2725:3: kw= 'seconds'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getSecondsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:2731:3: kw= 'minutes'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMinutesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBilang.g:2737:3: kw= 'hours'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getHoursKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBilang.g:2743:3: kw= 'days'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getDaysKeyword_3());
                    		

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "entryRuleAssertStatement"
    // InternalBilang.g:2752:1: entryRuleAssertStatement returns [EObject current=null] : iv_ruleAssertStatement= ruleAssertStatement EOF ;
    public final EObject entryRuleAssertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertStatement = null;


        try {
            // InternalBilang.g:2752:56: (iv_ruleAssertStatement= ruleAssertStatement EOF )
            // InternalBilang.g:2753:2: iv_ruleAssertStatement= ruleAssertStatement EOF
            {
             newCompositeNode(grammarAccess.getAssertStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertStatement=ruleAssertStatement();

            state._fsp--;

             current =iv_ruleAssertStatement; 
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
    // $ANTLR end "entryRuleAssertStatement"


    // $ANTLR start "ruleAssertStatement"
    // InternalBilang.g:2759:1: ruleAssertStatement returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'with' otherlv_3= 'message' ( (lv_message_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleAssertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_message_4_0=null;
        EObject lv_condition_1_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2765:2: ( (otherlv_0= 'assert' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'with' otherlv_3= 'message' ( (lv_message_4_0= RULE_STRING ) ) ) )
            // InternalBilang.g:2766:2: (otherlv_0= 'assert' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'with' otherlv_3= 'message' ( (lv_message_4_0= RULE_STRING ) ) )
            {
            // InternalBilang.g:2766:2: (otherlv_0= 'assert' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'with' otherlv_3= 'message' ( (lv_message_4_0= RULE_STRING ) ) )
            // InternalBilang.g:2767:3: otherlv_0= 'assert' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'with' otherlv_3= 'message' ( (lv_message_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertStatementAccess().getAssertKeyword_0());
            		
            // InternalBilang.g:2771:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalBilang.g:2772:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalBilang.g:2772:4: (lv_condition_1_0= ruleExpression )
            // InternalBilang.g:2773:5: lv_condition_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssertStatementAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.xtext.example.bilang.Bilang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getAssertStatementAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,78,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getAssertStatementAccess().getMessageKeyword_3());
            		
            // InternalBilang.g:2798:3: ( (lv_message_4_0= RULE_STRING ) )
            // InternalBilang.g:2799:4: (lv_message_4_0= RULE_STRING )
            {
            // InternalBilang.g:2799:4: (lv_message_4_0= RULE_STRING )
            // InternalBilang.g:2800:5: lv_message_4_0= RULE_STRING
            {
            lv_message_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_message_4_0, grammarAccess.getAssertStatementAccess().getMessageSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_4_0,
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
    // $ANTLR end "ruleAssertStatement"


    // $ANTLR start "entryRuleLogStatement"
    // InternalBilang.g:2820:1: entryRuleLogStatement returns [EObject current=null] : iv_ruleLogStatement= ruleLogStatement EOF ;
    public final EObject entryRuleLogStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogStatement = null;


        try {
            // InternalBilang.g:2820:53: (iv_ruleLogStatement= ruleLogStatement EOF )
            // InternalBilang.g:2821:2: iv_ruleLogStatement= ruleLogStatement EOF
            {
             newCompositeNode(grammarAccess.getLogStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogStatement=ruleLogStatement();

            state._fsp--;

             current =iv_ruleLogStatement; 
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
    // $ANTLR end "entryRuleLogStatement"


    // $ANTLR start "ruleLogStatement"
    // InternalBilang.g:2827:1: ruleLogStatement returns [EObject current=null] : (otherlv_0= 'log' ( (lv_value_1_0= ruleExpression ) ) ) ;
    public final EObject ruleLogStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2833:2: ( (otherlv_0= 'log' ( (lv_value_1_0= ruleExpression ) ) ) )
            // InternalBilang.g:2834:2: (otherlv_0= 'log' ( (lv_value_1_0= ruleExpression ) ) )
            {
            // InternalBilang.g:2834:2: (otherlv_0= 'log' ( (lv_value_1_0= ruleExpression ) ) )
            // InternalBilang.g:2835:3: otherlv_0= 'log' ( (lv_value_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getLogStatementAccess().getLogKeyword_0());
            		
            // InternalBilang.g:2839:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalBilang.g:2840:4: (lv_value_1_0= ruleExpression )
            {
            // InternalBilang.g:2840:4: (lv_value_1_0= ruleExpression )
            // InternalBilang.g:2841:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLogStatementAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.bilang.Bilang.Expression");
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
    // $ANTLR end "ruleLogStatement"


    // $ANTLR start "entryRuleWorkflowCall"
    // InternalBilang.g:2862:1: entryRuleWorkflowCall returns [EObject current=null] : iv_ruleWorkflowCall= ruleWorkflowCall EOF ;
    public final EObject entryRuleWorkflowCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowCall = null;


        try {
            // InternalBilang.g:2862:53: (iv_ruleWorkflowCall= ruleWorkflowCall EOF )
            // InternalBilang.g:2863:2: iv_ruleWorkflowCall= ruleWorkflowCall EOF
            {
             newCompositeNode(grammarAccess.getWorkflowCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowCall=ruleWorkflowCall();

            state._fsp--;

             current =iv_ruleWorkflowCall; 
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
    // $ANTLR end "entryRuleWorkflowCall"


    // $ANTLR start "ruleWorkflowCall"
    // InternalBilang.g:2869:1: ruleWorkflowCall returns [EObject current=null] : (otherlv_0= 'run' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleWorkflowCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2875:2: ( (otherlv_0= 'run' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) )
            // InternalBilang.g:2876:2: (otherlv_0= 'run' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            {
            // InternalBilang.g:2876:2: (otherlv_0= 'run' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            // InternalBilang.g:2877:3: otherlv_0= 'run' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowCallAccess().getRunKeyword_0());
            		
            // InternalBilang.g:2881:3: ( (otherlv_1= RULE_ID ) )
            // InternalBilang.g:2882:4: (otherlv_1= RULE_ID )
            {
            // InternalBilang.g:2882:4: (otherlv_1= RULE_ID )
            // InternalBilang.g:2883:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowCallRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getWorkflowCallAccess().getWorkflowWorkflowDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBilang.g:2898:3: ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBilang.g:2899:4: ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    {
                    // InternalBilang.g:2899:4: ( (lv_arguments_3_0= ruleArgument ) )
                    // InternalBilang.g:2900:5: (lv_arguments_3_0= ruleArgument )
                    {
                    // InternalBilang.g:2900:5: (lv_arguments_3_0= ruleArgument )
                    // InternalBilang.g:2901:6: lv_arguments_3_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getWorkflowCallAccess().getArgumentsArgumentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_arguments_3_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkflowCallRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"org.xtext.example.bilang.Bilang.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBilang.g:2918:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==28) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalBilang.g:2919:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getWorkflowCallAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalBilang.g:2923:5: ( (lv_arguments_5_0= ruleArgument ) )
                    	    // InternalBilang.g:2924:6: (lv_arguments_5_0= ruleArgument )
                    	    {
                    	    // InternalBilang.g:2924:6: (lv_arguments_5_0= ruleArgument )
                    	    // InternalBilang.g:2925:7: lv_arguments_5_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkflowCallAccess().getArgumentsArgumentParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_arguments_5_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkflowCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"org.xtext.example.bilang.Bilang.Argument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWorkflowCallAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleWorkflowCall"


    // $ANTLR start "entryRuleArgument"
    // InternalBilang.g:2952:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalBilang.g:2952:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalBilang.g:2953:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalBilang.g:2959:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:2965:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalBilang.g:2966:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalBilang.g:2966:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalBilang.g:2967:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalBilang.g:2967:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBilang.g:2968:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBilang.g:2968:4: (lv_name_0_0= RULE_ID )
            // InternalBilang.g:2969:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getEqualsSignKeyword_1());
            		
            // InternalBilang.g:2989:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalBilang.g:2990:4: (lv_value_2_0= ruleExpression )
            {
            // InternalBilang.g:2990:4: (lv_value_2_0= ruleExpression )
            // InternalBilang.g:2991:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getArgumentAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.bilang.Bilang.Expression");
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleRetrieveDocument"
    // InternalBilang.g:3012:1: entryRuleRetrieveDocument returns [EObject current=null] : iv_ruleRetrieveDocument= ruleRetrieveDocument EOF ;
    public final EObject entryRuleRetrieveDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieveDocument = null;


        try {
            // InternalBilang.g:3012:57: (iv_ruleRetrieveDocument= ruleRetrieveDocument EOF )
            // InternalBilang.g:3013:2: iv_ruleRetrieveDocument= ruleRetrieveDocument EOF
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
    // InternalBilang.g:3019:1: ruleRetrieveDocument returns [EObject current=null] : (otherlv_0= 'retrieve' ( (lv_document_1_0= ruleDocument ) ) ) ;
    public final EObject ruleRetrieveDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_document_1_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:3025:2: ( (otherlv_0= 'retrieve' ( (lv_document_1_0= ruleDocument ) ) ) )
            // InternalBilang.g:3026:2: (otherlv_0= 'retrieve' ( (lv_document_1_0= ruleDocument ) ) )
            {
            // InternalBilang.g:3026:2: (otherlv_0= 'retrieve' ( (lv_document_1_0= ruleDocument ) ) )
            // InternalBilang.g:3027:3: otherlv_0= 'retrieve' ( (lv_document_1_0= ruleDocument ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrieveDocumentAccess().getRetrieveKeyword_0());
            		
            // InternalBilang.g:3031:3: ( (lv_document_1_0= ruleDocument ) )
            // InternalBilang.g:3032:4: (lv_document_1_0= ruleDocument )
            {
            // InternalBilang.g:3032:4: (lv_document_1_0= ruleDocument )
            // InternalBilang.g:3033:5: lv_document_1_0= ruleDocument
            {

            					newCompositeNode(grammarAccess.getRetrieveDocumentAccess().getDocumentDocumentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_document_1_0=ruleDocument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetrieveDocumentRule());
            					}
            					set(
            						current,
            						"document",
            						lv_document_1_0,
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


    // $ANTLR start "entryRuleRetrieveInvoices"
    // InternalBilang.g:3054:1: entryRuleRetrieveInvoices returns [EObject current=null] : iv_ruleRetrieveInvoices= ruleRetrieveInvoices EOF ;
    public final EObject entryRuleRetrieveInvoices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieveInvoices = null;


        try {
            // InternalBilang.g:3054:57: (iv_ruleRetrieveInvoices= ruleRetrieveInvoices EOF )
            // InternalBilang.g:3055:2: iv_ruleRetrieveInvoices= ruleRetrieveInvoices EOF
            {
             newCompositeNode(grammarAccess.getRetrieveInvoicesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetrieveInvoices=ruleRetrieveInvoices();

            state._fsp--;

             current =iv_ruleRetrieveInvoices; 
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
    // $ANTLR end "entryRuleRetrieveInvoices"


    // $ANTLR start "ruleRetrieveInvoices"
    // InternalBilang.g:3061:1: ruleRetrieveInvoices returns [EObject current=null] : (otherlv_0= 'retrieve' otherlv_1= 'invoices' otherlv_2= 'with' otherlv_3= 'codes' ( (lv_invoiceNumbers_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_invoiceNumbers_6_0= RULE_INT ) ) )* ) ;
    public final EObject ruleRetrieveInvoices() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_invoiceNumbers_4_0=null;
        Token otherlv_5=null;
        Token lv_invoiceNumbers_6_0=null;


        	enterRule();

        try {
            // InternalBilang.g:3067:2: ( (otherlv_0= 'retrieve' otherlv_1= 'invoices' otherlv_2= 'with' otherlv_3= 'codes' ( (lv_invoiceNumbers_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_invoiceNumbers_6_0= RULE_INT ) ) )* ) )
            // InternalBilang.g:3068:2: (otherlv_0= 'retrieve' otherlv_1= 'invoices' otherlv_2= 'with' otherlv_3= 'codes' ( (lv_invoiceNumbers_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_invoiceNumbers_6_0= RULE_INT ) ) )* )
            {
            // InternalBilang.g:3068:2: (otherlv_0= 'retrieve' otherlv_1= 'invoices' otherlv_2= 'with' otherlv_3= 'codes' ( (lv_invoiceNumbers_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_invoiceNumbers_6_0= RULE_INT ) ) )* )
            // InternalBilang.g:3069:3: otherlv_0= 'retrieve' otherlv_1= 'invoices' otherlv_2= 'with' otherlv_3= 'codes' ( (lv_invoiceNumbers_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_invoiceNumbers_6_0= RULE_INT ) ) )*
            {
            otherlv_0=(Token)match(input,81,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrieveInvoicesAccess().getRetrieveKeyword_0());
            		
            otherlv_1=(Token)match(input,82,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRetrieveInvoicesAccess().getInvoicesKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getRetrieveInvoicesAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,83,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getRetrieveInvoicesAccess().getCodesKeyword_3());
            		
            // InternalBilang.g:3085:3: ( (lv_invoiceNumbers_4_0= RULE_INT ) )
            // InternalBilang.g:3086:4: (lv_invoiceNumbers_4_0= RULE_INT )
            {
            // InternalBilang.g:3086:4: (lv_invoiceNumbers_4_0= RULE_INT )
            // InternalBilang.g:3087:5: lv_invoiceNumbers_4_0= RULE_INT
            {
            lv_invoiceNumbers_4_0=(Token)match(input,RULE_INT,FOLLOW_52); 

            					newLeafNode(lv_invoiceNumbers_4_0, grammarAccess.getRetrieveInvoicesAccess().getInvoiceNumbersINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRetrieveInvoicesRule());
            					}
            					addWithLastConsumed(
            						current,
            						"invoiceNumbers",
            						lv_invoiceNumbers_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalBilang.g:3103:3: (otherlv_5= ',' ( (lv_invoiceNumbers_6_0= RULE_INT ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==28) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBilang.g:3104:4: otherlv_5= ',' ( (lv_invoiceNumbers_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,28,FOLLOW_42); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRetrieveInvoicesAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalBilang.g:3108:4: ( (lv_invoiceNumbers_6_0= RULE_INT ) )
            	    // InternalBilang.g:3109:5: (lv_invoiceNumbers_6_0= RULE_INT )
            	    {
            	    // InternalBilang.g:3109:5: (lv_invoiceNumbers_6_0= RULE_INT )
            	    // InternalBilang.g:3110:6: lv_invoiceNumbers_6_0= RULE_INT
            	    {
            	    lv_invoiceNumbers_6_0=(Token)match(input,RULE_INT,FOLLOW_52); 

            	    						newLeafNode(lv_invoiceNumbers_6_0, grammarAccess.getRetrieveInvoicesAccess().getInvoiceNumbersINTTerminalRuleCall_5_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRetrieveInvoicesRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"invoiceNumbers",
            	    							lv_invoiceNumbers_6_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
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
    // $ANTLR end "ruleRetrieveInvoices"


    // $ANTLR start "entryRuleRetrieveFullAddress"
    // InternalBilang.g:3131:1: entryRuleRetrieveFullAddress returns [EObject current=null] : iv_ruleRetrieveFullAddress= ruleRetrieveFullAddress EOF ;
    public final EObject entryRuleRetrieveFullAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieveFullAddress = null;


        try {
            // InternalBilang.g:3131:60: (iv_ruleRetrieveFullAddress= ruleRetrieveFullAddress EOF )
            // InternalBilang.g:3132:2: iv_ruleRetrieveFullAddress= ruleRetrieveFullAddress EOF
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
    // InternalBilang.g:3138:1: ruleRetrieveFullAddress returns [EObject current=null] : (otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAddress_4_0= rulePersonByAddress ) ) ) ;
    public final EObject ruleRetrieveFullAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_personAddress_4_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:3144:2: ( (otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAddress_4_0= rulePersonByAddress ) ) ) )
            // InternalBilang.g:3145:2: (otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAddress_4_0= rulePersonByAddress ) ) )
            {
            // InternalBilang.g:3145:2: (otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAddress_4_0= rulePersonByAddress ) ) )
            // InternalBilang.g:3146:3: otherlv_0= 'retrieve' otherlv_1= 'full' otherlv_2= 'address' otherlv_3= 'of' ( (lv_personAddress_4_0= rulePersonByAddress ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrieveFullAddressAccess().getRetrieveKeyword_0());
            		
            otherlv_1=(Token)match(input,84,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getRetrieveFullAddressAccess().getFullKeyword_1());
            		
            otherlv_2=(Token)match(input,85,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getRetrieveFullAddressAccess().getAddressKeyword_2());
            		
            otherlv_3=(Token)match(input,86,FOLLOW_56); 

            			newLeafNode(otherlv_3, grammarAccess.getRetrieveFullAddressAccess().getOfKeyword_3());
            		
            // InternalBilang.g:3162:3: ( (lv_personAddress_4_0= rulePersonByAddress ) )
            // InternalBilang.g:3163:4: (lv_personAddress_4_0= rulePersonByAddress )
            {
            // InternalBilang.g:3163:4: (lv_personAddress_4_0= rulePersonByAddress )
            // InternalBilang.g:3164:5: lv_personAddress_4_0= rulePersonByAddress
            {

            					newCompositeNode(grammarAccess.getRetrieveFullAddressAccess().getPersonAddressPersonByAddressParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_personAddress_4_0=rulePersonByAddress();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetrieveFullAddressRule());
            					}
            					set(
            						current,
            						"personAddress",
            						lv_personAddress_4_0,
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
    // InternalBilang.g:3185:1: entryRuleRetrievePersons returns [EObject current=null] : iv_ruleRetrievePersons= ruleRetrievePersons EOF ;
    public final EObject entryRuleRetrievePersons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrievePersons = null;


        try {
            // InternalBilang.g:3185:56: (iv_ruleRetrievePersons= ruleRetrievePersons EOF )
            // InternalBilang.g:3186:2: iv_ruleRetrievePersons= ruleRetrievePersons EOF
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
    // InternalBilang.g:3192:1: ruleRetrievePersons returns [EObject current=null] : (otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) ) ) ;
    public final EObject ruleRetrievePersons() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_personSearch_4_0=null;


        	enterRule();

        try {
            // InternalBilang.g:3198:2: ( (otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) ) ) )
            // InternalBilang.g:3199:2: (otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) ) )
            {
            // InternalBilang.g:3199:2: (otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) ) )
            // InternalBilang.g:3200:3: otherlv_0= 'retrieve' otherlv_1= 'persons' otherlv_2= 'with' otherlv_3= 'search' ( (lv_personSearch_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrievePersonsAccess().getRetrieveKeyword_0());
            		
            otherlv_1=(Token)match(input,87,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRetrievePersonsAccess().getPersonsKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getRetrievePersonsAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,88,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRetrievePersonsAccess().getSearchKeyword_3());
            		
            // InternalBilang.g:3216:3: ( (lv_personSearch_4_0= RULE_ID ) )
            // InternalBilang.g:3217:4: (lv_personSearch_4_0= RULE_ID )
            {
            // InternalBilang.g:3217:4: (lv_personSearch_4_0= RULE_ID )
            // InternalBilang.g:3218:5: lv_personSearch_4_0= RULE_ID
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


    // $ANTLR start "entryRuleSendEmail"
    // InternalBilang.g:3238:1: entryRuleSendEmail returns [EObject current=null] : iv_ruleSendEmail= ruleSendEmail EOF ;
    public final EObject entryRuleSendEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendEmail = null;


        try {
            // InternalBilang.g:3238:50: (iv_ruleSendEmail= ruleSendEmail EOF )
            // InternalBilang.g:3239:2: iv_ruleSendEmail= ruleSendEmail EOF
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
    // InternalBilang.g:3245:1: ruleSendEmail returns [EObject current=null] : (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_recipients_4_0= rulePerson ) )+ otherlv_5= 'with' ( (lv_message_6_0= ruleMessage ) ) (otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )* )? ) ;
    public final EObject ruleSendEmail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_recipients_4_0 = null;

        EObject lv_message_6_0 = null;

        EObject lv_attachments_9_0 = null;

        EObject lv_attachments_12_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:3251:2: ( (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_recipients_4_0= rulePerson ) )+ otherlv_5= 'with' ( (lv_message_6_0= ruleMessage ) ) (otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )* )? ) )
            // InternalBilang.g:3252:2: (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_recipients_4_0= rulePerson ) )+ otherlv_5= 'with' ( (lv_message_6_0= ruleMessage ) ) (otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )* )? )
            {
            // InternalBilang.g:3252:2: (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_recipients_4_0= rulePerson ) )+ otherlv_5= 'with' ( (lv_message_6_0= ruleMessage ) ) (otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )* )? )
            // InternalBilang.g:3253:3: otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'email' otherlv_3= 'to' ( (lv_recipients_4_0= rulePerson ) )+ otherlv_5= 'with' ( (lv_message_6_0= ruleMessage ) ) (otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )* )?
            {
            otherlv_0=(Token)match(input,89,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getSendEmailAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,90,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getSendEmailAccess().getAnKeyword_1());
            		
            otherlv_2=(Token)match(input,91,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getSendEmailAccess().getEmailKeyword_2());
            		
            otherlv_3=(Token)match(input,66,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSendEmailAccess().getToKeyword_3());
            		
            // InternalBilang.g:3269:3: ( (lv_recipients_4_0= rulePerson ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==27) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalBilang.g:3270:4: (lv_recipients_4_0= rulePerson )
            	    {
            	    // InternalBilang.g:3270:4: (lv_recipients_4_0= rulePerson )
            	    // InternalBilang.g:3271:5: lv_recipients_4_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getSendEmailAccess().getRecipientsPersonParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_61);
            	    lv_recipients_4_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSendEmailRule());
            	    					}
            	    					add(
            	    						current,
            	    						"recipients",
            	    						lv_recipients_4_0,
            	    						"org.xtext.example.bilang.Bilang.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_5=(Token)match(input,18,FOLLOW_49); 

            			newLeafNode(otherlv_5, grammarAccess.getSendEmailAccess().getWithKeyword_5());
            		
            // InternalBilang.g:3292:3: ( (lv_message_6_0= ruleMessage ) )
            // InternalBilang.g:3293:4: (lv_message_6_0= ruleMessage )
            {
            // InternalBilang.g:3293:4: (lv_message_6_0= ruleMessage )
            // InternalBilang.g:3294:5: lv_message_6_0= ruleMessage
            {

            					newCompositeNode(grammarAccess.getSendEmailAccess().getMessageMessageParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_message_6_0=ruleMessage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSendEmailRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_6_0,
            						"org.xtext.example.bilang.Bilang.Message");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBilang.g:3311:3: (otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBilang.g:3312:4: otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )*
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_62); 

                    				newLeafNode(otherlv_7, grammarAccess.getSendEmailAccess().getAndKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,92,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getSendEmailAccess().getAttachmentKeyword_7_1());
                    			
                    // InternalBilang.g:3320:4: ( (lv_attachments_9_0= ruleDocument ) )
                    // InternalBilang.g:3321:5: (lv_attachments_9_0= ruleDocument )
                    {
                    // InternalBilang.g:3321:5: (lv_attachments_9_0= ruleDocument )
                    // InternalBilang.g:3322:6: lv_attachments_9_0= ruleDocument
                    {

                    						newCompositeNode(grammarAccess.getSendEmailAccess().getAttachmentsDocumentParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_attachments_9_0=ruleDocument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSendEmailRule());
                    						}
                    						add(
                    							current,
                    							"attachments",
                    							lv_attachments_9_0,
                    							"org.xtext.example.bilang.Bilang.Document");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBilang.g:3339:4: (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==20) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalBilang.g:3340:5: otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_62); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getSendEmailAccess().getAndKeyword_7_3_0());
                    	    				
                    	    otherlv_11=(Token)match(input,92,FOLLOW_5); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getSendEmailAccess().getAttachmentKeyword_7_3_1());
                    	    				
                    	    // InternalBilang.g:3348:5: ( (lv_attachments_12_0= ruleDocument ) )
                    	    // InternalBilang.g:3349:6: (lv_attachments_12_0= ruleDocument )
                    	    {
                    	    // InternalBilang.g:3349:6: (lv_attachments_12_0= ruleDocument )
                    	    // InternalBilang.g:3350:7: lv_attachments_12_0= ruleDocument
                    	    {

                    	    							newCompositeNode(grammarAccess.getSendEmailAccess().getAttachmentsDocumentParserRuleCall_7_3_2_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_attachments_12_0=ruleDocument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSendEmailRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attachments",
                    	    								lv_attachments_12_0,
                    	    								"org.xtext.example.bilang.Bilang.Document");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

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
    // InternalBilang.g:3373:1: entryRuleSendSMS returns [EObject current=null] : iv_ruleSendSMS= ruleSendSMS EOF ;
    public final EObject entryRuleSendSMS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendSMS = null;


        try {
            // InternalBilang.g:3373:48: (iv_ruleSendSMS= ruleSendSMS EOF )
            // InternalBilang.g:3374:2: iv_ruleSendSMS= ruleSendSMS EOF
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
    // InternalBilang.g:3380:1: ruleSendSMS returns [EObject current=null] : (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_recipients_4_0= rulePerson ) )+ otherlv_5= 'with' ( (lv_message_6_0= ruleMessage ) ) (otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )* )? ) ;
    public final EObject ruleSendSMS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_recipients_4_0 = null;

        EObject lv_message_6_0 = null;

        EObject lv_attachments_9_0 = null;

        EObject lv_attachments_12_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:3386:2: ( (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_recipients_4_0= rulePerson ) )+ otherlv_5= 'with' ( (lv_message_6_0= ruleMessage ) ) (otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )* )? ) )
            // InternalBilang.g:3387:2: (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_recipients_4_0= rulePerson ) )+ otherlv_5= 'with' ( (lv_message_6_0= ruleMessage ) ) (otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )* )? )
            {
            // InternalBilang.g:3387:2: (otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_recipients_4_0= rulePerson ) )+ otherlv_5= 'with' ( (lv_message_6_0= ruleMessage ) ) (otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )* )? )
            // InternalBilang.g:3388:3: otherlv_0= 'send' otherlv_1= 'an' otherlv_2= 'sms' otherlv_3= 'to' ( (lv_recipients_4_0= rulePerson ) )+ otherlv_5= 'with' ( (lv_message_6_0= ruleMessage ) ) (otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )* )?
            {
            otherlv_0=(Token)match(input,89,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getSendSMSAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,90,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getSendSMSAccess().getAnKeyword_1());
            		
            otherlv_2=(Token)match(input,93,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getSendSMSAccess().getSmsKeyword_2());
            		
            otherlv_3=(Token)match(input,66,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSendSMSAccess().getToKeyword_3());
            		
            // InternalBilang.g:3404:3: ( (lv_recipients_4_0= rulePerson ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==27) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBilang.g:3405:4: (lv_recipients_4_0= rulePerson )
            	    {
            	    // InternalBilang.g:3405:4: (lv_recipients_4_0= rulePerson )
            	    // InternalBilang.g:3406:5: lv_recipients_4_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getSendSMSAccess().getRecipientsPersonParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_61);
            	    lv_recipients_4_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSendSMSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"recipients",
            	    						lv_recipients_4_0,
            	    						"org.xtext.example.bilang.Bilang.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_49); 

            			newLeafNode(otherlv_5, grammarAccess.getSendSMSAccess().getWithKeyword_5());
            		
            // InternalBilang.g:3427:3: ( (lv_message_6_0= ruleMessage ) )
            // InternalBilang.g:3428:4: (lv_message_6_0= ruleMessage )
            {
            // InternalBilang.g:3428:4: (lv_message_6_0= ruleMessage )
            // InternalBilang.g:3429:5: lv_message_6_0= ruleMessage
            {

            					newCompositeNode(grammarAccess.getSendSMSAccess().getMessageMessageParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_message_6_0=ruleMessage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSendSMSRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_6_0,
            						"org.xtext.example.bilang.Bilang.Message");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBilang.g:3446:3: (otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBilang.g:3447:4: otherlv_7= 'and' otherlv_8= 'attachment' ( (lv_attachments_9_0= ruleDocument ) ) (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )*
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_62); 

                    				newLeafNode(otherlv_7, grammarAccess.getSendSMSAccess().getAndKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,92,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getSendSMSAccess().getAttachmentKeyword_7_1());
                    			
                    // InternalBilang.g:3455:4: ( (lv_attachments_9_0= ruleDocument ) )
                    // InternalBilang.g:3456:5: (lv_attachments_9_0= ruleDocument )
                    {
                    // InternalBilang.g:3456:5: (lv_attachments_9_0= ruleDocument )
                    // InternalBilang.g:3457:6: lv_attachments_9_0= ruleDocument
                    {

                    						newCompositeNode(grammarAccess.getSendSMSAccess().getAttachmentsDocumentParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_attachments_9_0=ruleDocument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSendSMSRule());
                    						}
                    						add(
                    							current,
                    							"attachments",
                    							lv_attachments_9_0,
                    							"org.xtext.example.bilang.Bilang.Document");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBilang.g:3474:4: (otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==20) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalBilang.g:3475:5: otherlv_10= 'and' otherlv_11= 'attachment' ( (lv_attachments_12_0= ruleDocument ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_62); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getSendSMSAccess().getAndKeyword_7_3_0());
                    	    				
                    	    otherlv_11=(Token)match(input,92,FOLLOW_5); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getSendSMSAccess().getAttachmentKeyword_7_3_1());
                    	    				
                    	    // InternalBilang.g:3483:5: ( (lv_attachments_12_0= ruleDocument ) )
                    	    // InternalBilang.g:3484:6: (lv_attachments_12_0= ruleDocument )
                    	    {
                    	    // InternalBilang.g:3484:6: (lv_attachments_12_0= ruleDocument )
                    	    // InternalBilang.g:3485:7: lv_attachments_12_0= ruleDocument
                    	    {

                    	    							newCompositeNode(grammarAccess.getSendSMSAccess().getAttachmentsDocumentParserRuleCall_7_3_2_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_attachments_12_0=ruleDocument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSendSMSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attachments",
                    	    								lv_attachments_12_0,
                    	    								"org.xtext.example.bilang.Bilang.Document");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

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
    // InternalBilang.g:3508:1: entryRuleSendSnailMail returns [EObject current=null] : iv_ruleSendSnailMail= ruleSendSnailMail EOF ;
    public final EObject entryRuleSendSnailMail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendSnailMail = null;


        try {
            // InternalBilang.g:3508:54: (iv_ruleSendSnailMail= ruleSendSnailMail EOF )
            // InternalBilang.g:3509:2: iv_ruleSendSnailMail= ruleSendSnailMail EOF
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
    // InternalBilang.g:3515:1: ruleSendSnailMail returns [EObject current=null] : (otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_recipients_5_0= rulePerson ) )+ otherlv_6= 'with' ( (lv_message_7_0= ruleMessage ) ) (otherlv_8= 'and' otherlv_9= 'attachment' ( (lv_attachments_10_0= ruleDocument ) ) (otherlv_11= 'and' otherlv_12= 'attachment' ( (lv_attachments_13_0= ruleDocument ) ) )* )? ) ;
    public final EObject ruleSendSnailMail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_recipients_5_0 = null;

        EObject lv_message_7_0 = null;

        EObject lv_attachments_10_0 = null;

        EObject lv_attachments_13_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:3521:2: ( (otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_recipients_5_0= rulePerson ) )+ otherlv_6= 'with' ( (lv_message_7_0= ruleMessage ) ) (otherlv_8= 'and' otherlv_9= 'attachment' ( (lv_attachments_10_0= ruleDocument ) ) (otherlv_11= 'and' otherlv_12= 'attachment' ( (lv_attachments_13_0= ruleDocument ) ) )* )? ) )
            // InternalBilang.g:3522:2: (otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_recipients_5_0= rulePerson ) )+ otherlv_6= 'with' ( (lv_message_7_0= ruleMessage ) ) (otherlv_8= 'and' otherlv_9= 'attachment' ( (lv_attachments_10_0= ruleDocument ) ) (otherlv_11= 'and' otherlv_12= 'attachment' ( (lv_attachments_13_0= ruleDocument ) ) )* )? )
            {
            // InternalBilang.g:3522:2: (otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_recipients_5_0= rulePerson ) )+ otherlv_6= 'with' ( (lv_message_7_0= ruleMessage ) ) (otherlv_8= 'and' otherlv_9= 'attachment' ( (lv_attachments_10_0= ruleDocument ) ) (otherlv_11= 'and' otherlv_12= 'attachment' ( (lv_attachments_13_0= ruleDocument ) ) )* )? )
            // InternalBilang.g:3523:3: otherlv_0= 'send' otherlv_1= 'a' otherlv_2= 'snail' otherlv_3= 'mail' otherlv_4= 'to' ( (lv_recipients_5_0= rulePerson ) )+ otherlv_6= 'with' ( (lv_message_7_0= ruleMessage ) ) (otherlv_8= 'and' otherlv_9= 'attachment' ( (lv_attachments_10_0= ruleDocument ) ) (otherlv_11= 'and' otherlv_12= 'attachment' ( (lv_attachments_13_0= ruleDocument ) ) )* )?
            {
            otherlv_0=(Token)match(input,89,FOLLOW_64); 

            			newLeafNode(otherlv_0, grammarAccess.getSendSnailMailAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,94,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getSendSnailMailAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,95,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getSendSnailMailAccess().getSnailKeyword_2());
            		
            otherlv_3=(Token)match(input,96,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getSendSnailMailAccess().getMailKeyword_3());
            		
            otherlv_4=(Token)match(input,66,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSendSnailMailAccess().getToKeyword_4());
            		
            // InternalBilang.g:3543:3: ( (lv_recipients_5_0= rulePerson ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==27) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalBilang.g:3544:4: (lv_recipients_5_0= rulePerson )
            	    {
            	    // InternalBilang.g:3544:4: (lv_recipients_5_0= rulePerson )
            	    // InternalBilang.g:3545:5: lv_recipients_5_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getSendSnailMailAccess().getRecipientsPersonParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_61);
            	    lv_recipients_5_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSendSnailMailRule());
            	    					}
            	    					add(
            	    						current,
            	    						"recipients",
            	    						lv_recipients_5_0,
            	    						"org.xtext.example.bilang.Bilang.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_49); 

            			newLeafNode(otherlv_6, grammarAccess.getSendSnailMailAccess().getWithKeyword_6());
            		
            // InternalBilang.g:3566:3: ( (lv_message_7_0= ruleMessage ) )
            // InternalBilang.g:3567:4: (lv_message_7_0= ruleMessage )
            {
            // InternalBilang.g:3567:4: (lv_message_7_0= ruleMessage )
            // InternalBilang.g:3568:5: lv_message_7_0= ruleMessage
            {

            					newCompositeNode(grammarAccess.getSendSnailMailAccess().getMessageMessageParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_message_7_0=ruleMessage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSendSnailMailRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_7_0,
            						"org.xtext.example.bilang.Bilang.Message");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBilang.g:3585:3: (otherlv_8= 'and' otherlv_9= 'attachment' ( (lv_attachments_10_0= ruleDocument ) ) (otherlv_11= 'and' otherlv_12= 'attachment' ( (lv_attachments_13_0= ruleDocument ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==20) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBilang.g:3586:4: otherlv_8= 'and' otherlv_9= 'attachment' ( (lv_attachments_10_0= ruleDocument ) ) (otherlv_11= 'and' otherlv_12= 'attachment' ( (lv_attachments_13_0= ruleDocument ) ) )*
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_62); 

                    				newLeafNode(otherlv_8, grammarAccess.getSendSnailMailAccess().getAndKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,92,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getSendSnailMailAccess().getAttachmentKeyword_8_1());
                    			
                    // InternalBilang.g:3594:4: ( (lv_attachments_10_0= ruleDocument ) )
                    // InternalBilang.g:3595:5: (lv_attachments_10_0= ruleDocument )
                    {
                    // InternalBilang.g:3595:5: (lv_attachments_10_0= ruleDocument )
                    // InternalBilang.g:3596:6: lv_attachments_10_0= ruleDocument
                    {

                    						newCompositeNode(grammarAccess.getSendSnailMailAccess().getAttachmentsDocumentParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_attachments_10_0=ruleDocument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSendSnailMailRule());
                    						}
                    						add(
                    							current,
                    							"attachments",
                    							lv_attachments_10_0,
                    							"org.xtext.example.bilang.Bilang.Document");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBilang.g:3613:4: (otherlv_11= 'and' otherlv_12= 'attachment' ( (lv_attachments_13_0= ruleDocument ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==20) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalBilang.g:3614:5: otherlv_11= 'and' otherlv_12= 'attachment' ( (lv_attachments_13_0= ruleDocument ) )
                    	    {
                    	    otherlv_11=(Token)match(input,20,FOLLOW_62); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getSendSnailMailAccess().getAndKeyword_8_3_0());
                    	    				
                    	    otherlv_12=(Token)match(input,92,FOLLOW_5); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSendSnailMailAccess().getAttachmentKeyword_8_3_1());
                    	    				
                    	    // InternalBilang.g:3622:5: ( (lv_attachments_13_0= ruleDocument ) )
                    	    // InternalBilang.g:3623:6: (lv_attachments_13_0= ruleDocument )
                    	    {
                    	    // InternalBilang.g:3623:6: (lv_attachments_13_0= ruleDocument )
                    	    // InternalBilang.g:3624:7: lv_attachments_13_0= ruleDocument
                    	    {

                    	    							newCompositeNode(grammarAccess.getSendSnailMailAccess().getAttachmentsDocumentParserRuleCall_8_3_2_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_attachments_13_0=ruleDocument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSendSnailMailRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attachments",
                    	    								lv_attachments_13_0,
                    	    								"org.xtext.example.bilang.Bilang.Document");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

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


    // $ANTLR start "entryRuleMessage"
    // InternalBilang.g:3647:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalBilang.g:3647:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalBilang.g:3648:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalBilang.g:3654:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_message_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_message_1_0=null;


        	enterRule();

        try {
            // InternalBilang.g:3660:2: ( (otherlv_0= 'message' ( (lv_message_1_0= RULE_STRING ) ) ) )
            // InternalBilang.g:3661:2: (otherlv_0= 'message' ( (lv_message_1_0= RULE_STRING ) ) )
            {
            // InternalBilang.g:3661:2: (otherlv_0= 'message' ( (lv_message_1_0= RULE_STRING ) ) )
            // InternalBilang.g:3662:3: otherlv_0= 'message' ( (lv_message_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
            		
            // InternalBilang.g:3666:3: ( (lv_message_1_0= RULE_STRING ) )
            // InternalBilang.g:3667:4: (lv_message_1_0= RULE_STRING )
            {
            // InternalBilang.g:3667:4: (lv_message_1_0= RULE_STRING )
            // InternalBilang.g:3668:5: lv_message_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleCallPerson"
    // InternalBilang.g:3688:1: entryRuleCallPerson returns [EObject current=null] : iv_ruleCallPerson= ruleCallPerson EOF ;
    public final EObject entryRuleCallPerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallPerson = null;


        try {
            // InternalBilang.g:3688:51: (iv_ruleCallPerson= ruleCallPerson EOF )
            // InternalBilang.g:3689:2: iv_ruleCallPerson= ruleCallPerson EOF
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
    // InternalBilang.g:3695:1: ruleCallPerson returns [EObject current=null] : (otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) ) ) ;
    public final EObject ruleCallPerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_person_2_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:3701:2: ( (otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) ) ) )
            // InternalBilang.g:3702:2: (otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) ) )
            {
            // InternalBilang.g:3702:2: (otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) ) )
            // InternalBilang.g:3703:3: otherlv_0= 'phone' otherlv_1= 'call' ( (lv_person_2_0= rulePerson ) )
            {
            otherlv_0=(Token)match(input,97,FOLLOW_67); 

            			newLeafNode(otherlv_0, grammarAccess.getCallPersonAccess().getPhoneKeyword_0());
            		
            otherlv_1=(Token)match(input,98,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCallPersonAccess().getCallKeyword_1());
            		
            // InternalBilang.g:3711:3: ( (lv_person_2_0= rulePerson ) )
            // InternalBilang.g:3712:4: (lv_person_2_0= rulePerson )
            {
            // InternalBilang.g:3712:4: (lv_person_2_0= rulePerson )
            // InternalBilang.g:3713:5: lv_person_2_0= rulePerson
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
    // InternalBilang.g:3734:1: entryRuleAddPerson returns [EObject current=null] : iv_ruleAddPerson= ruleAddPerson EOF ;
    public final EObject entryRuleAddPerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddPerson = null;


        try {
            // InternalBilang.g:3734:50: (iv_ruleAddPerson= ruleAddPerson EOF )
            // InternalBilang.g:3735:2: iv_ruleAddPerson= ruleAddPerson EOF
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
    // InternalBilang.g:3741:1: ruleAddPerson returns [EObject current=null] : (otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+ ) ;
    public final EObject ruleAddPerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_alias_1_0 = null;

        EObject lv_person_3_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:3747:2: ( (otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+ ) )
            // InternalBilang.g:3748:2: (otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+ )
            {
            // InternalBilang.g:3748:2: (otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+ )
            // InternalBilang.g:3749:3: otherlv_0= 'add' ( (lv_alias_1_0= rulePersonByAlias ) ) (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+
            {
            otherlv_0=(Token)match(input,99,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getAddPersonAccess().getAddKeyword_0());
            		
            // InternalBilang.g:3753:3: ( (lv_alias_1_0= rulePersonByAlias ) )
            // InternalBilang.g:3754:4: (lv_alias_1_0= rulePersonByAlias )
            {
            // InternalBilang.g:3754:4: (lv_alias_1_0= rulePersonByAlias )
            // InternalBilang.g:3755:5: lv_alias_1_0= rulePersonByAlias
            {

            					newCompositeNode(grammarAccess.getAddPersonAccess().getAliasPersonByAliasParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalBilang.g:3772:3: (otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==20) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBilang.g:3773:4: otherlv_2= 'and' ( (lv_person_3_0= rulePerson ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAddPersonAccess().getAndKeyword_2_0());
            	    			
            	    // InternalBilang.g:3777:4: ( (lv_person_3_0= rulePerson ) )
            	    // InternalBilang.g:3778:5: (lv_person_3_0= rulePerson )
            	    {
            	    // InternalBilang.g:3778:5: (lv_person_3_0= rulePerson )
            	    // InternalBilang.g:3779:6: lv_person_3_0= rulePerson
            	    {

            	    						newCompositeNode(grammarAccess.getAddPersonAccess().getPersonPersonParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
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
    // InternalBilang.g:3801:1: entryRuleDeletePerson returns [EObject current=null] : iv_ruleDeletePerson= ruleDeletePerson EOF ;
    public final EObject entryRuleDeletePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletePerson = null;


        try {
            // InternalBilang.g:3801:53: (iv_ruleDeletePerson= ruleDeletePerson EOF )
            // InternalBilang.g:3802:2: iv_ruleDeletePerson= ruleDeletePerson EOF
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
    // InternalBilang.g:3808:1: ruleDeletePerson returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) ) ) ;
    public final EObject ruleDeletePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_alias_1_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:3814:2: ( (otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) ) ) )
            // InternalBilang.g:3815:2: (otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) ) )
            {
            // InternalBilang.g:3815:2: (otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) ) )
            // InternalBilang.g:3816:3: otherlv_0= 'delete' ( (lv_alias_1_0= rulePersonByAlias ) )
            {
            otherlv_0=(Token)match(input,100,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getDeletePersonAccess().getDeleteKeyword_0());
            		
            // InternalBilang.g:3820:3: ( (lv_alias_1_0= rulePersonByAlias ) )
            // InternalBilang.g:3821:4: (lv_alias_1_0= rulePersonByAlias )
            {
            // InternalBilang.g:3821:4: (lv_alias_1_0= rulePersonByAlias )
            // InternalBilang.g:3822:5: lv_alias_1_0= rulePersonByAlias
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


    // $ANTLR start "entryRuleUpdatePerson"
    // InternalBilang.g:3843:1: entryRuleUpdatePerson returns [EObject current=null] : iv_ruleUpdatePerson= ruleUpdatePerson EOF ;
    public final EObject entryRuleUpdatePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdatePerson = null;


        try {
            // InternalBilang.g:3843:53: (iv_ruleUpdatePerson= ruleUpdatePerson EOF )
            // InternalBilang.g:3844:2: iv_ruleUpdatePerson= ruleUpdatePerson EOF
            {
             newCompositeNode(grammarAccess.getUpdatePersonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdatePerson=ruleUpdatePerson();

            state._fsp--;

             current =iv_ruleUpdatePerson; 
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
    // $ANTLR end "entryRuleUpdatePerson"


    // $ANTLR start "ruleUpdatePerson"
    // InternalBilang.g:3850:1: ruleUpdatePerson returns [EObject current=null] : (otherlv_0= 'update' otherlv_1= 'person' ( (lv_person_2_0= rulePerson ) ) otherlv_3= 'set' ( (lv_changes_4_0= rulePersonChange ) ) (otherlv_5= 'and' ( (lv_changes_6_0= rulePersonChange ) ) )* ) ;
    public final EObject ruleUpdatePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_person_2_0 = null;

        EObject lv_changes_4_0 = null;

        EObject lv_changes_6_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:3856:2: ( (otherlv_0= 'update' otherlv_1= 'person' ( (lv_person_2_0= rulePerson ) ) otherlv_3= 'set' ( (lv_changes_4_0= rulePersonChange ) ) (otherlv_5= 'and' ( (lv_changes_6_0= rulePersonChange ) ) )* ) )
            // InternalBilang.g:3857:2: (otherlv_0= 'update' otherlv_1= 'person' ( (lv_person_2_0= rulePerson ) ) otherlv_3= 'set' ( (lv_changes_4_0= rulePersonChange ) ) (otherlv_5= 'and' ( (lv_changes_6_0= rulePersonChange ) ) )* )
            {
            // InternalBilang.g:3857:2: (otherlv_0= 'update' otherlv_1= 'person' ( (lv_person_2_0= rulePerson ) ) otherlv_3= 'set' ( (lv_changes_4_0= rulePersonChange ) ) (otherlv_5= 'and' ( (lv_changes_6_0= rulePersonChange ) ) )* )
            // InternalBilang.g:3858:3: otherlv_0= 'update' otherlv_1= 'person' ( (lv_person_2_0= rulePerson ) ) otherlv_3= 'set' ( (lv_changes_4_0= rulePersonChange ) ) (otherlv_5= 'and' ( (lv_changes_6_0= rulePersonChange ) ) )*
            {
            otherlv_0=(Token)match(input,101,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdatePersonAccess().getUpdateKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdatePersonAccess().getPersonKeyword_1());
            		
            // InternalBilang.g:3866:3: ( (lv_person_2_0= rulePerson ) )
            // InternalBilang.g:3867:4: (lv_person_2_0= rulePerson )
            {
            // InternalBilang.g:3867:4: (lv_person_2_0= rulePerson )
            // InternalBilang.g:3868:5: lv_person_2_0= rulePerson
            {

            					newCompositeNode(grammarAccess.getUpdatePersonAccess().getPersonPersonParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_68);
            lv_person_2_0=rulePerson();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdatePersonRule());
            					}
            					set(
            						current,
            						"person",
            						lv_person_2_0,
            						"org.xtext.example.bilang.Bilang.Person");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,102,FOLLOW_69); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdatePersonAccess().getSetKeyword_3());
            		
            // InternalBilang.g:3889:3: ( (lv_changes_4_0= rulePersonChange ) )
            // InternalBilang.g:3890:4: (lv_changes_4_0= rulePersonChange )
            {
            // InternalBilang.g:3890:4: (lv_changes_4_0= rulePersonChange )
            // InternalBilang.g:3891:5: lv_changes_4_0= rulePersonChange
            {

            					newCompositeNode(grammarAccess.getUpdatePersonAccess().getChangesPersonChangeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_changes_4_0=rulePersonChange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdatePersonRule());
            					}
            					add(
            						current,
            						"changes",
            						lv_changes_4_0,
            						"org.xtext.example.bilang.Bilang.PersonChange");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBilang.g:3908:3: (otherlv_5= 'and' ( (lv_changes_6_0= rulePersonChange ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==20) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalBilang.g:3909:4: otherlv_5= 'and' ( (lv_changes_6_0= rulePersonChange ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_69); 

            	    				newLeafNode(otherlv_5, grammarAccess.getUpdatePersonAccess().getAndKeyword_5_0());
            	    			
            	    // InternalBilang.g:3913:4: ( (lv_changes_6_0= rulePersonChange ) )
            	    // InternalBilang.g:3914:5: (lv_changes_6_0= rulePersonChange )
            	    {
            	    // InternalBilang.g:3914:5: (lv_changes_6_0= rulePersonChange )
            	    // InternalBilang.g:3915:6: lv_changes_6_0= rulePersonChange
            	    {

            	    						newCompositeNode(grammarAccess.getUpdatePersonAccess().getChangesPersonChangeParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_changes_6_0=rulePersonChange();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpdatePersonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"changes",
            	    							lv_changes_6_0,
            	    							"org.xtext.example.bilang.Bilang.PersonChange");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
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
    // $ANTLR end "ruleUpdatePerson"


    // $ANTLR start "entryRulePersonChange"
    // InternalBilang.g:3937:1: entryRulePersonChange returns [EObject current=null] : iv_rulePersonChange= rulePersonChange EOF ;
    public final EObject entryRulePersonChange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonChange = null;


        try {
            // InternalBilang.g:3937:53: (iv_rulePersonChange= rulePersonChange EOF )
            // InternalBilang.g:3938:2: iv_rulePersonChange= rulePersonChange EOF
            {
             newCompositeNode(grammarAccess.getPersonChangeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonChange=rulePersonChange();

            state._fsp--;

             current =iv_rulePersonChange; 
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
    // $ANTLR end "entryRulePersonChange"


    // $ANTLR start "rulePersonChange"
    // InternalBilang.g:3944:1: rulePersonChange returns [EObject current=null] : ( (otherlv_0= 'email' otherlv_1= 'to' ( (lv_email_2_0= RULE_EMAIL_ADDRESS ) ) ) | (otherlv_3= 'phone' otherlv_4= 'to' ( (lv_phone_5_0= RULE_PHONE_NUMBER ) ) ) | (otherlv_6= 'alias' otherlv_7= 'to' ( (lv_alias_8_0= RULE_ID ) ) ) ) ;
    public final EObject rulePersonChange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_email_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_phone_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_alias_8_0=null;


        	enterRule();

        try {
            // InternalBilang.g:3950:2: ( ( (otherlv_0= 'email' otherlv_1= 'to' ( (lv_email_2_0= RULE_EMAIL_ADDRESS ) ) ) | (otherlv_3= 'phone' otherlv_4= 'to' ( (lv_phone_5_0= RULE_PHONE_NUMBER ) ) ) | (otherlv_6= 'alias' otherlv_7= 'to' ( (lv_alias_8_0= RULE_ID ) ) ) ) )
            // InternalBilang.g:3951:2: ( (otherlv_0= 'email' otherlv_1= 'to' ( (lv_email_2_0= RULE_EMAIL_ADDRESS ) ) ) | (otherlv_3= 'phone' otherlv_4= 'to' ( (lv_phone_5_0= RULE_PHONE_NUMBER ) ) ) | (otherlv_6= 'alias' otherlv_7= 'to' ( (lv_alias_8_0= RULE_ID ) ) ) )
            {
            // InternalBilang.g:3951:2: ( (otherlv_0= 'email' otherlv_1= 'to' ( (lv_email_2_0= RULE_EMAIL_ADDRESS ) ) ) | (otherlv_3= 'phone' otherlv_4= 'to' ( (lv_phone_5_0= RULE_PHONE_NUMBER ) ) ) | (otherlv_6= 'alias' otherlv_7= 'to' ( (lv_alias_8_0= RULE_ID ) ) ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt50=1;
                }
                break;
            case 97:
                {
                alt50=2;
                }
                break;
            case 103:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalBilang.g:3952:3: (otherlv_0= 'email' otherlv_1= 'to' ( (lv_email_2_0= RULE_EMAIL_ADDRESS ) ) )
                    {
                    // InternalBilang.g:3952:3: (otherlv_0= 'email' otherlv_1= 'to' ( (lv_email_2_0= RULE_EMAIL_ADDRESS ) ) )
                    // InternalBilang.g:3953:4: otherlv_0= 'email' otherlv_1= 'to' ( (lv_email_2_0= RULE_EMAIL_ADDRESS ) )
                    {
                    otherlv_0=(Token)match(input,91,FOLLOW_41); 

                    				newLeafNode(otherlv_0, grammarAccess.getPersonChangeAccess().getEmailKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,66,FOLLOW_70); 

                    				newLeafNode(otherlv_1, grammarAccess.getPersonChangeAccess().getToKeyword_0_1());
                    			
                    // InternalBilang.g:3961:4: ( (lv_email_2_0= RULE_EMAIL_ADDRESS ) )
                    // InternalBilang.g:3962:5: (lv_email_2_0= RULE_EMAIL_ADDRESS )
                    {
                    // InternalBilang.g:3962:5: (lv_email_2_0= RULE_EMAIL_ADDRESS )
                    // InternalBilang.g:3963:6: lv_email_2_0= RULE_EMAIL_ADDRESS
                    {
                    lv_email_2_0=(Token)match(input,RULE_EMAIL_ADDRESS,FOLLOW_2); 

                    						newLeafNode(lv_email_2_0, grammarAccess.getPersonChangeAccess().getEmailEMAIL_ADDRESSTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonChangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"email",
                    							lv_email_2_0,
                    							"org.xtext.example.bilang.Bilang.EMAIL_ADDRESS");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBilang.g:3981:3: (otherlv_3= 'phone' otherlv_4= 'to' ( (lv_phone_5_0= RULE_PHONE_NUMBER ) ) )
                    {
                    // InternalBilang.g:3981:3: (otherlv_3= 'phone' otherlv_4= 'to' ( (lv_phone_5_0= RULE_PHONE_NUMBER ) ) )
                    // InternalBilang.g:3982:4: otherlv_3= 'phone' otherlv_4= 'to' ( (lv_phone_5_0= RULE_PHONE_NUMBER ) )
                    {
                    otherlv_3=(Token)match(input,97,FOLLOW_41); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonChangeAccess().getPhoneKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,66,FOLLOW_71); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonChangeAccess().getToKeyword_1_1());
                    			
                    // InternalBilang.g:3990:4: ( (lv_phone_5_0= RULE_PHONE_NUMBER ) )
                    // InternalBilang.g:3991:5: (lv_phone_5_0= RULE_PHONE_NUMBER )
                    {
                    // InternalBilang.g:3991:5: (lv_phone_5_0= RULE_PHONE_NUMBER )
                    // InternalBilang.g:3992:6: lv_phone_5_0= RULE_PHONE_NUMBER
                    {
                    lv_phone_5_0=(Token)match(input,RULE_PHONE_NUMBER,FOLLOW_2); 

                    						newLeafNode(lv_phone_5_0, grammarAccess.getPersonChangeAccess().getPhonePHONE_NUMBERTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonChangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"phone",
                    							lv_phone_5_0,
                    							"org.xtext.example.bilang.Bilang.PHONE_NUMBER");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBilang.g:4010:3: (otherlv_6= 'alias' otherlv_7= 'to' ( (lv_alias_8_0= RULE_ID ) ) )
                    {
                    // InternalBilang.g:4010:3: (otherlv_6= 'alias' otherlv_7= 'to' ( (lv_alias_8_0= RULE_ID ) ) )
                    // InternalBilang.g:4011:4: otherlv_6= 'alias' otherlv_7= 'to' ( (lv_alias_8_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,103,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getPersonChangeAccess().getAliasKeyword_2_0());
                    			
                    otherlv_7=(Token)match(input,66,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getPersonChangeAccess().getToKeyword_2_1());
                    			
                    // InternalBilang.g:4019:4: ( (lv_alias_8_0= RULE_ID ) )
                    // InternalBilang.g:4020:5: (lv_alias_8_0= RULE_ID )
                    {
                    // InternalBilang.g:4020:5: (lv_alias_8_0= RULE_ID )
                    // InternalBilang.g:4021:6: lv_alias_8_0= RULE_ID
                    {
                    lv_alias_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_alias_8_0, grammarAccess.getPersonChangeAccess().getAliasIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonChangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "rulePersonChange"


    // $ANTLR start "entryRuleSearchPerson"
    // InternalBilang.g:4042:1: entryRuleSearchPerson returns [EObject current=null] : iv_ruleSearchPerson= ruleSearchPerson EOF ;
    public final EObject entryRuleSearchPerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearchPerson = null;


        try {
            // InternalBilang.g:4042:53: (iv_ruleSearchPerson= ruleSearchPerson EOF )
            // InternalBilang.g:4043:2: iv_ruleSearchPerson= ruleSearchPerson EOF
            {
             newCompositeNode(grammarAccess.getSearchPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSearchPerson=ruleSearchPerson();

            state._fsp--;

             current =iv_ruleSearchPerson; 
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
    // $ANTLR end "entryRuleSearchPerson"


    // $ANTLR start "ruleSearchPerson"
    // InternalBilang.g:4049:1: ruleSearchPerson returns [EObject current=null] : (otherlv_0= 'search' otherlv_1= 'for' otherlv_2= 'person' (otherlv_3= 'with' otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) )? (otherlv_6= 'with' otherlv_7= 'email' ( (lv_email_8_0= RULE_EMAIL_ADDRESS ) ) )? (otherlv_9= 'with' otherlv_10= 'phone' ( (lv_phone_11_0= RULE_PHONE_NUMBER ) ) )? ) ;
    public final EObject ruleSearchPerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_email_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_phone_11_0=null;


        	enterRule();

        try {
            // InternalBilang.g:4055:2: ( (otherlv_0= 'search' otherlv_1= 'for' otherlv_2= 'person' (otherlv_3= 'with' otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) )? (otherlv_6= 'with' otherlv_7= 'email' ( (lv_email_8_0= RULE_EMAIL_ADDRESS ) ) )? (otherlv_9= 'with' otherlv_10= 'phone' ( (lv_phone_11_0= RULE_PHONE_NUMBER ) ) )? ) )
            // InternalBilang.g:4056:2: (otherlv_0= 'search' otherlv_1= 'for' otherlv_2= 'person' (otherlv_3= 'with' otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) )? (otherlv_6= 'with' otherlv_7= 'email' ( (lv_email_8_0= RULE_EMAIL_ADDRESS ) ) )? (otherlv_9= 'with' otherlv_10= 'phone' ( (lv_phone_11_0= RULE_PHONE_NUMBER ) ) )? )
            {
            // InternalBilang.g:4056:2: (otherlv_0= 'search' otherlv_1= 'for' otherlv_2= 'person' (otherlv_3= 'with' otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) )? (otherlv_6= 'with' otherlv_7= 'email' ( (lv_email_8_0= RULE_EMAIL_ADDRESS ) ) )? (otherlv_9= 'with' otherlv_10= 'phone' ( (lv_phone_11_0= RULE_PHONE_NUMBER ) ) )? )
            // InternalBilang.g:4057:3: otherlv_0= 'search' otherlv_1= 'for' otherlv_2= 'person' (otherlv_3= 'with' otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) )? (otherlv_6= 'with' otherlv_7= 'email' ( (lv_email_8_0= RULE_EMAIL_ADDRESS ) ) )? (otherlv_9= 'with' otherlv_10= 'phone' ( (lv_phone_11_0= RULE_PHONE_NUMBER ) ) )?
            {
            otherlv_0=(Token)match(input,88,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getSearchPersonAccess().getSearchKeyword_0());
            		
            otherlv_1=(Token)match(input,55,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getSearchPersonAccess().getForKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getSearchPersonAccess().getPersonKeyword_2());
            		
            // InternalBilang.g:4069:3: (otherlv_3= 'with' otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==18) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==19) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // InternalBilang.g:4070:4: otherlv_3= 'with' otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getSearchPersonAccess().getWithKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getSearchPersonAccess().getNameKeyword_3_1());
                    			
                    // InternalBilang.g:4078:4: ( (lv_name_5_0= RULE_STRING ) )
                    // InternalBilang.g:4079:5: (lv_name_5_0= RULE_STRING )
                    {
                    // InternalBilang.g:4079:5: (lv_name_5_0= RULE_STRING )
                    // InternalBilang.g:4080:6: lv_name_5_0= RULE_STRING
                    {
                    lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_72); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getSearchPersonAccess().getNameSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSearchPersonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBilang.g:4097:3: (otherlv_6= 'with' otherlv_7= 'email' ( (lv_email_8_0= RULE_EMAIL_ADDRESS ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==18) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==91) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalBilang.g:4098:4: otherlv_6= 'with' otherlv_7= 'email' ( (lv_email_8_0= RULE_EMAIL_ADDRESS ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_60); 

                    				newLeafNode(otherlv_6, grammarAccess.getSearchPersonAccess().getWithKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,91,FOLLOW_70); 

                    				newLeafNode(otherlv_7, grammarAccess.getSearchPersonAccess().getEmailKeyword_4_1());
                    			
                    // InternalBilang.g:4106:4: ( (lv_email_8_0= RULE_EMAIL_ADDRESS ) )
                    // InternalBilang.g:4107:5: (lv_email_8_0= RULE_EMAIL_ADDRESS )
                    {
                    // InternalBilang.g:4107:5: (lv_email_8_0= RULE_EMAIL_ADDRESS )
                    // InternalBilang.g:4108:6: lv_email_8_0= RULE_EMAIL_ADDRESS
                    {
                    lv_email_8_0=(Token)match(input,RULE_EMAIL_ADDRESS,FOLLOW_72); 

                    						newLeafNode(lv_email_8_0, grammarAccess.getSearchPersonAccess().getEmailEMAIL_ADDRESSTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSearchPersonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"email",
                    							lv_email_8_0,
                    							"org.xtext.example.bilang.Bilang.EMAIL_ADDRESS");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBilang.g:4125:3: (otherlv_9= 'with' otherlv_10= 'phone' ( (lv_phone_11_0= RULE_PHONE_NUMBER ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==18) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBilang.g:4126:4: otherlv_9= 'with' otherlv_10= 'phone' ( (lv_phone_11_0= RULE_PHONE_NUMBER ) )
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_73); 

                    				newLeafNode(otherlv_9, grammarAccess.getSearchPersonAccess().getWithKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,97,FOLLOW_71); 

                    				newLeafNode(otherlv_10, grammarAccess.getSearchPersonAccess().getPhoneKeyword_5_1());
                    			
                    // InternalBilang.g:4134:4: ( (lv_phone_11_0= RULE_PHONE_NUMBER ) )
                    // InternalBilang.g:4135:5: (lv_phone_11_0= RULE_PHONE_NUMBER )
                    {
                    // InternalBilang.g:4135:5: (lv_phone_11_0= RULE_PHONE_NUMBER )
                    // InternalBilang.g:4136:6: lv_phone_11_0= RULE_PHONE_NUMBER
                    {
                    lv_phone_11_0=(Token)match(input,RULE_PHONE_NUMBER,FOLLOW_2); 

                    						newLeafNode(lv_phone_11_0, grammarAccess.getSearchPersonAccess().getPhonePHONE_NUMBERTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSearchPersonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"phone",
                    							lv_phone_11_0,
                    							"org.xtext.example.bilang.Bilang.PHONE_NUMBER");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSearchPerson"


    // $ANTLR start "entryRulePerson"
    // InternalBilang.g:4157:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalBilang.g:4157:47: (iv_rulePerson= rulePerson EOF )
            // InternalBilang.g:4158:2: iv_rulePerson= rulePerson EOF
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
    // InternalBilang.g:4164:1: rulePerson returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_kind_1_1= rulePersonByEmail | lv_kind_1_2= rulePersonByAlias | lv_kind_1_3= rulePersonByName | lv_kind_1_4= rulePersonByPhone | lv_kind_1_5= rulePersonByAddress ) ) ) otherlv_2= ')' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_kind_1_1 = null;

        EObject lv_kind_1_2 = null;

        EObject lv_kind_1_3 = null;

        EObject lv_kind_1_4 = null;

        EObject lv_kind_1_5 = null;



        	enterRule();

        try {
            // InternalBilang.g:4170:2: ( (otherlv_0= '(' ( ( (lv_kind_1_1= rulePersonByEmail | lv_kind_1_2= rulePersonByAlias | lv_kind_1_3= rulePersonByName | lv_kind_1_4= rulePersonByPhone | lv_kind_1_5= rulePersonByAddress ) ) ) otherlv_2= ')' ) )
            // InternalBilang.g:4171:2: (otherlv_0= '(' ( ( (lv_kind_1_1= rulePersonByEmail | lv_kind_1_2= rulePersonByAlias | lv_kind_1_3= rulePersonByName | lv_kind_1_4= rulePersonByPhone | lv_kind_1_5= rulePersonByAddress ) ) ) otherlv_2= ')' )
            {
            // InternalBilang.g:4171:2: (otherlv_0= '(' ( ( (lv_kind_1_1= rulePersonByEmail | lv_kind_1_2= rulePersonByAlias | lv_kind_1_3= rulePersonByName | lv_kind_1_4= rulePersonByPhone | lv_kind_1_5= rulePersonByAddress ) ) ) otherlv_2= ')' )
            // InternalBilang.g:4172:3: otherlv_0= '(' ( ( (lv_kind_1_1= rulePersonByEmail | lv_kind_1_2= rulePersonByAlias | lv_kind_1_3= rulePersonByName | lv_kind_1_4= rulePersonByPhone | lv_kind_1_5= rulePersonByAddress ) ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBilang.g:4176:3: ( ( (lv_kind_1_1= rulePersonByEmail | lv_kind_1_2= rulePersonByAlias | lv_kind_1_3= rulePersonByName | lv_kind_1_4= rulePersonByPhone | lv_kind_1_5= rulePersonByAddress ) ) )
            // InternalBilang.g:4177:4: ( (lv_kind_1_1= rulePersonByEmail | lv_kind_1_2= rulePersonByAlias | lv_kind_1_3= rulePersonByName | lv_kind_1_4= rulePersonByPhone | lv_kind_1_5= rulePersonByAddress ) )
            {
            // InternalBilang.g:4177:4: ( (lv_kind_1_1= rulePersonByEmail | lv_kind_1_2= rulePersonByAlias | lv_kind_1_3= rulePersonByName | lv_kind_1_4= rulePersonByPhone | lv_kind_1_5= rulePersonByAddress ) )
            // InternalBilang.g:4178:5: (lv_kind_1_1= rulePersonByEmail | lv_kind_1_2= rulePersonByAlias | lv_kind_1_3= rulePersonByName | lv_kind_1_4= rulePersonByPhone | lv_kind_1_5= rulePersonByAddress )
            {
            // InternalBilang.g:4178:5: (lv_kind_1_1= rulePersonByEmail | lv_kind_1_2= rulePersonByAlias | lv_kind_1_3= rulePersonByName | lv_kind_1_4= rulePersonByPhone | lv_kind_1_5= rulePersonByAddress )
            int alt54=5;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==34) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==18) ) {
                    switch ( input.LA(3) ) {
                    case 103:
                        {
                        alt54=2;
                        }
                        break;
                    case 106:
                        {
                        alt54=5;
                        }
                        break;
                    case 97:
                        {
                        alt54=4;
                        }
                        break;
                    case 104:
                        {
                        alt54=3;
                        }
                        break;
                    case 91:
                        {
                        alt54=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalBilang.g:4179:6: lv_kind_1_1= rulePersonByEmail
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getKindPersonByEmailParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_kind_1_1=rulePersonByEmail();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						add(
                    							current,
                    							"kind",
                    							lv_kind_1_1,
                    							"org.xtext.example.bilang.Bilang.PersonByEmail");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBilang.g:4195:6: lv_kind_1_2= rulePersonByAlias
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getKindPersonByAliasParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_25);
                    lv_kind_1_2=rulePersonByAlias();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						add(
                    							current,
                    							"kind",
                    							lv_kind_1_2,
                    							"org.xtext.example.bilang.Bilang.PersonByAlias");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalBilang.g:4211:6: lv_kind_1_3= rulePersonByName
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getKindPersonByNameParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_25);
                    lv_kind_1_3=rulePersonByName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						add(
                    							current,
                    							"kind",
                    							lv_kind_1_3,
                    							"org.xtext.example.bilang.Bilang.PersonByName");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalBilang.g:4227:6: lv_kind_1_4= rulePersonByPhone
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getKindPersonByPhoneParserRuleCall_1_0_3());
                    					
                    pushFollow(FOLLOW_25);
                    lv_kind_1_4=rulePersonByPhone();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						add(
                    							current,
                    							"kind",
                    							lv_kind_1_4,
                    							"org.xtext.example.bilang.Bilang.PersonByPhone");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 5 :
                    // InternalBilang.g:4243:6: lv_kind_1_5= rulePersonByAddress
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getKindPersonByAddressParserRuleCall_1_0_4());
                    					
                    pushFollow(FOLLOW_25);
                    lv_kind_1_5=rulePersonByAddress();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						add(
                    							current,
                    							"kind",
                    							lv_kind_1_5,
                    							"org.xtext.example.bilang.Bilang.PersonByAddress");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getRightParenthesisKeyword_2());
            		

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
    // InternalBilang.g:4269:1: entryRulePersonByEmail returns [EObject current=null] : iv_rulePersonByEmail= rulePersonByEmail EOF ;
    public final EObject entryRulePersonByEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByEmail = null;


        try {
            // InternalBilang.g:4269:54: (iv_rulePersonByEmail= rulePersonByEmail EOF )
            // InternalBilang.g:4270:2: iv_rulePersonByEmail= rulePersonByEmail EOF
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
    // InternalBilang.g:4276:1: rulePersonByEmail returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) ) ) ;
    public final EObject rulePersonByEmail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_emailaddress_3_0=null;


        	enterRule();

        try {
            // InternalBilang.g:4282:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) ) ) )
            // InternalBilang.g:4283:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) ) )
            {
            // InternalBilang.g:4283:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) ) )
            // InternalBilang.g:4284:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'email' ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByEmailAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByEmailAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,91,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByEmailAccess().getEmailKeyword_2());
            		
            // InternalBilang.g:4296:3: ( (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS ) )
            // InternalBilang.g:4297:4: (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS )
            {
            // InternalBilang.g:4297:4: (lv_emailaddress_3_0= RULE_EMAIL_ADDRESS )
            // InternalBilang.g:4298:5: lv_emailaddress_3_0= RULE_EMAIL_ADDRESS
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
    // InternalBilang.g:4318:1: entryRulePersonByAlias returns [EObject current=null] : iv_rulePersonByAlias= rulePersonByAlias EOF ;
    public final EObject entryRulePersonByAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByAlias = null;


        try {
            // InternalBilang.g:4318:54: (iv_rulePersonByAlias= rulePersonByAlias EOF )
            // InternalBilang.g:4319:2: iv_rulePersonByAlias= rulePersonByAlias EOF
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
    // InternalBilang.g:4325:1: rulePersonByAlias returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) ) ;
    public final EObject rulePersonByAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;


        	enterRule();

        try {
            // InternalBilang.g:4331:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) ) )
            // InternalBilang.g:4332:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )
            {
            // InternalBilang.g:4332:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )
            // InternalBilang.g:4333:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByAliasAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_74); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByAliasAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,103,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByAliasAccess().getAliasKeyword_2());
            		
            // InternalBilang.g:4345:3: ( (lv_alias_3_0= RULE_ID ) )
            // InternalBilang.g:4346:4: (lv_alias_3_0= RULE_ID )
            {
            // InternalBilang.g:4346:4: (lv_alias_3_0= RULE_ID )
            // InternalBilang.g:4347:5: lv_alias_3_0= RULE_ID
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
    // InternalBilang.g:4367:1: entryRulePersonByName returns [EObject current=null] : iv_rulePersonByName= rulePersonByName EOF ;
    public final EObject entryRulePersonByName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByName = null;


        try {
            // InternalBilang.g:4367:53: (iv_rulePersonByName= rulePersonByName EOF )
            // InternalBilang.g:4368:2: iv_rulePersonByName= rulePersonByName EOF
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
    // InternalBilang.g:4374:1: rulePersonByName returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= RULE_STRING ) ) ) ;
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
            // InternalBilang.g:4380:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= RULE_STRING ) ) ) )
            // InternalBilang.g:4381:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= RULE_STRING ) ) )
            {
            // InternalBilang.g:4381:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= RULE_STRING ) ) )
            // InternalBilang.g:4382:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'first' otherlv_3= 'name' ( (lv_firstName_4_0= RULE_ID ) ) otherlv_5= 'and' otherlv_6= 'last' otherlv_7= 'name' ( (lv_lastName_8_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByNameAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByNameAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,104,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByNameAccess().getFirstKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonByNameAccess().getNameKeyword_3());
            		
            // InternalBilang.g:4398:3: ( (lv_firstName_4_0= RULE_ID ) )
            // InternalBilang.g:4399:4: (lv_firstName_4_0= RULE_ID )
            {
            // InternalBilang.g:4399:4: (lv_firstName_4_0= RULE_ID )
            // InternalBilang.g:4400:5: lv_firstName_4_0= RULE_ID
            {
            lv_firstName_4_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_76); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonByNameAccess().getAndKeyword_5());
            		
            otherlv_6=(Token)match(input,105,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonByNameAccess().getLastKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonByNameAccess().getNameKeyword_7());
            		
            // InternalBilang.g:4428:3: ( (lv_lastName_8_0= RULE_STRING ) )
            // InternalBilang.g:4429:4: (lv_lastName_8_0= RULE_STRING )
            {
            // InternalBilang.g:4429:4: (lv_lastName_8_0= RULE_STRING )
            // InternalBilang.g:4430:5: lv_lastName_8_0= RULE_STRING
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
    // InternalBilang.g:4450:1: entryRulePersonByPhone returns [EObject current=null] : iv_rulePersonByPhone= rulePersonByPhone EOF ;
    public final EObject entryRulePersonByPhone() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByPhone = null;


        try {
            // InternalBilang.g:4450:54: (iv_rulePersonByPhone= rulePersonByPhone EOF )
            // InternalBilang.g:4451:2: iv_rulePersonByPhone= rulePersonByPhone EOF
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
    // InternalBilang.g:4457:1: rulePersonByPhone returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) ) ) ;
    public final EObject rulePersonByPhone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_phone_4_0=null;


        	enterRule();

        try {
            // InternalBilang.g:4463:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) ) ) )
            // InternalBilang.g:4464:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) ) )
            {
            // InternalBilang.g:4464:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) ) )
            // InternalBilang.g:4465:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'phone' otherlv_3= 'number' ( (lv_phone_4_0= RULE_PHONE_NUMBER ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByPhoneAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_73); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByPhoneAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,97,FOLLOW_77); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByPhoneAccess().getPhoneKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonByPhoneAccess().getNumberKeyword_3());
            		
            // InternalBilang.g:4481:3: ( (lv_phone_4_0= RULE_PHONE_NUMBER ) )
            // InternalBilang.g:4482:4: (lv_phone_4_0= RULE_PHONE_NUMBER )
            {
            // InternalBilang.g:4482:4: (lv_phone_4_0= RULE_PHONE_NUMBER )
            // InternalBilang.g:4483:5: lv_phone_4_0= RULE_PHONE_NUMBER
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
    // InternalBilang.g:4503:1: entryRulePersonByAddress returns [EObject current=null] : iv_rulePersonByAddress= rulePersonByAddress EOF ;
    public final EObject entryRulePersonByAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonByAddress = null;


        try {
            // InternalBilang.g:4503:56: (iv_rulePersonByAddress= rulePersonByAddress EOF )
            // InternalBilang.g:4504:2: iv_rulePersonByAddress= rulePersonByAddress EOF
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
    // InternalBilang.g:4510:1: rulePersonByAddress returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_INT ) ) (otherlv_9= 'and' otherlv_10= 'suffix' ( (lv_suffix_11_0= RULE_STRING ) ) )? ) ;
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
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_suffix_11_0=null;


        	enterRule();

        try {
            // InternalBilang.g:4516:2: ( (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_INT ) ) (otherlv_9= 'and' otherlv_10= 'suffix' ( (lv_suffix_11_0= RULE_STRING ) ) )? ) )
            // InternalBilang.g:4517:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_INT ) ) (otherlv_9= 'and' otherlv_10= 'suffix' ( (lv_suffix_11_0= RULE_STRING ) ) )? )
            {
            // InternalBilang.g:4517:2: (otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_INT ) ) (otherlv_9= 'and' otherlv_10= 'suffix' ( (lv_suffix_11_0= RULE_STRING ) ) )? )
            // InternalBilang.g:4518:3: otherlv_0= 'person' otherlv_1= 'with' otherlv_2= 'zip' otherlv_3= 'code' ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) ) otherlv_5= 'and' otherlv_6= 'house' otherlv_7= 'number' ( (lv_housenumber_8_0= RULE_INT ) ) (otherlv_9= 'and' otherlv_10= 'suffix' ( (lv_suffix_11_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonByAddressAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonByAddressAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,106,FOLLOW_79); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonByAddressAccess().getZipKeyword_2());
            		
            otherlv_3=(Token)match(input,107,FOLLOW_80); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonByAddressAccess().getCodeKeyword_3());
            		
            // InternalBilang.g:4534:3: ( (lv_zipcode_4_0= RULE_DUTCH_POSTCODE ) )
            // InternalBilang.g:4535:4: (lv_zipcode_4_0= RULE_DUTCH_POSTCODE )
            {
            // InternalBilang.g:4535:4: (lv_zipcode_4_0= RULE_DUTCH_POSTCODE )
            // InternalBilang.g:4536:5: lv_zipcode_4_0= RULE_DUTCH_POSTCODE
            {
            lv_zipcode_4_0=(Token)match(input,RULE_DUTCH_POSTCODE,FOLLOW_12); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_81); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonByAddressAccess().getAndKeyword_5());
            		
            otherlv_6=(Token)match(input,108,FOLLOW_77); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonByAddressAccess().getHouseKeyword_6());
            		
            otherlv_7=(Token)match(input,32,FOLLOW_42); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonByAddressAccess().getNumberKeyword_7());
            		
            // InternalBilang.g:4564:3: ( (lv_housenumber_8_0= RULE_INT ) )
            // InternalBilang.g:4565:4: (lv_housenumber_8_0= RULE_INT )
            {
            // InternalBilang.g:4565:4: (lv_housenumber_8_0= RULE_INT )
            // InternalBilang.g:4566:5: lv_housenumber_8_0= RULE_INT
            {
            lv_housenumber_8_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_housenumber_8_0, grammarAccess.getPersonByAddressAccess().getHousenumberINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonByAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"housenumber",
            						lv_housenumber_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalBilang.g:4582:3: (otherlv_9= 'and' otherlv_10= 'suffix' ( (lv_suffix_11_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==20) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBilang.g:4583:4: otherlv_9= 'and' otherlv_10= 'suffix' ( (lv_suffix_11_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_82); 

                    				newLeafNode(otherlv_9, grammarAccess.getPersonByAddressAccess().getAndKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,109,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getPersonByAddressAccess().getSuffixKeyword_9_1());
                    			
                    // InternalBilang.g:4591:4: ( (lv_suffix_11_0= RULE_STRING ) )
                    // InternalBilang.g:4592:5: (lv_suffix_11_0= RULE_STRING )
                    {
                    // InternalBilang.g:4592:5: (lv_suffix_11_0= RULE_STRING )
                    // InternalBilang.g:4593:6: lv_suffix_11_0= RULE_STRING
                    {
                    lv_suffix_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_suffix_11_0, grammarAccess.getPersonByAddressAccess().getSuffixSTRINGTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonByAddressRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"suffix",
                    							lv_suffix_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleDocument"
    // InternalBilang.g:4614:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalBilang.g:4614:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalBilang.g:4615:2: iv_ruleDocument= ruleDocument EOF
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
    // InternalBilang.g:4621:1: ruleDocument returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'document' ( ( (lv_kind_2_1= ruleInvoice | lv_kind_2_2= ruleDocumentPerson | lv_kind_2_3= ruleDocumentTopic ) ) ) otherlv_3= ')' ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_kind_2_1 = null;

        EObject lv_kind_2_2 = null;

        EObject lv_kind_2_3 = null;



        	enterRule();

        try {
            // InternalBilang.g:4627:2: ( (otherlv_0= '(' otherlv_1= 'document' ( ( (lv_kind_2_1= ruleInvoice | lv_kind_2_2= ruleDocumentPerson | lv_kind_2_3= ruleDocumentTopic ) ) ) otherlv_3= ')' ) )
            // InternalBilang.g:4628:2: (otherlv_0= '(' otherlv_1= 'document' ( ( (lv_kind_2_1= ruleInvoice | lv_kind_2_2= ruleDocumentPerson | lv_kind_2_3= ruleDocumentTopic ) ) ) otherlv_3= ')' )
            {
            // InternalBilang.g:4628:2: (otherlv_0= '(' otherlv_1= 'document' ( ( (lv_kind_2_1= ruleInvoice | lv_kind_2_2= ruleDocumentPerson | lv_kind_2_3= ruleDocumentTopic ) ) ) otherlv_3= ')' )
            // InternalBilang.g:4629:3: otherlv_0= '(' otherlv_1= 'document' ( ( (lv_kind_2_1= ruleInvoice | lv_kind_2_2= ruleDocumentPerson | lv_kind_2_3= ruleDocumentTopic ) ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_83); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_84); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentAccess().getDocumentKeyword_1());
            		
            // InternalBilang.g:4637:3: ( ( (lv_kind_2_1= ruleInvoice | lv_kind_2_2= ruleDocumentPerson | lv_kind_2_3= ruleDocumentTopic ) ) )
            // InternalBilang.g:4638:4: ( (lv_kind_2_1= ruleInvoice | lv_kind_2_2= ruleDocumentPerson | lv_kind_2_3= ruleDocumentTopic ) )
            {
            // InternalBilang.g:4638:4: ( (lv_kind_2_1= ruleInvoice | lv_kind_2_2= ruleDocumentPerson | lv_kind_2_3= ruleDocumentTopic ) )
            // InternalBilang.g:4639:5: (lv_kind_2_1= ruleInvoice | lv_kind_2_2= ruleDocumentPerson | lv_kind_2_3= ruleDocumentTopic )
            {
            // InternalBilang.g:4639:5: (lv_kind_2_1= ruleInvoice | lv_kind_2_2= ruleDocumentPerson | lv_kind_2_3= ruleDocumentTopic )
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==110) ) {
                alt56=1;
            }
            else if ( (LA56_0==111) ) {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==112) ) {
                    int LA56_3 = input.LA(3);

                    if ( (LA56_3==34) ) {
                        alt56=2;
                    }
                    else if ( (LA56_3==113) ) {
                        alt56=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalBilang.g:4640:6: lv_kind_2_1= ruleInvoice
                    {

                    						newCompositeNode(grammarAccess.getDocumentAccess().getKindInvoiceParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_kind_2_1=ruleInvoice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDocumentRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_1,
                    							"org.xtext.example.bilang.Bilang.Invoice");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBilang.g:4656:6: lv_kind_2_2= ruleDocumentPerson
                    {

                    						newCompositeNode(grammarAccess.getDocumentAccess().getKindDocumentPersonParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_25);
                    lv_kind_2_2=ruleDocumentPerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDocumentRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_2,
                    							"org.xtext.example.bilang.Bilang.DocumentPerson");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalBilang.g:4672:6: lv_kind_2_3= ruleDocumentTopic
                    {

                    						newCompositeNode(grammarAccess.getDocumentAccess().getKindDocumentTopicParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_25);
                    lv_kind_2_3=ruleDocumentTopic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDocumentRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_2_3,
                    							"org.xtext.example.bilang.Bilang.DocumentTopic");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDocumentAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalBilang.g:4698:1: entryRuleInvoice returns [EObject current=null] : iv_ruleInvoice= ruleInvoice EOF ;
    public final EObject entryRuleInvoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvoice = null;


        try {
            // InternalBilang.g:4698:48: (iv_ruleInvoice= ruleInvoice EOF )
            // InternalBilang.g:4699:2: iv_ruleInvoice= ruleInvoice EOF
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
    // InternalBilang.g:4705:1: ruleInvoice returns [EObject current=null] : (otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) ) ) ;
    public final EObject ruleInvoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_code_3_0=null;


        	enterRule();

        try {
            // InternalBilang.g:4711:2: ( (otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) ) ) )
            // InternalBilang.g:4712:2: (otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) ) )
            {
            // InternalBilang.g:4712:2: (otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) ) )
            // InternalBilang.g:4713:3: otherlv_0= 'invoice' otherlv_1= 'with' otherlv_2= 'code' ( (lv_code_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,110,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getInvoiceAccess().getInvoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_79); 

            			newLeafNode(otherlv_1, grammarAccess.getInvoiceAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,107,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getInvoiceAccess().getCodeKeyword_2());
            		
            // InternalBilang.g:4725:3: ( (lv_code_3_0= RULE_INT ) )
            // InternalBilang.g:4726:4: (lv_code_3_0= RULE_INT )
            {
            // InternalBilang.g:4726:4: (lv_code_3_0= RULE_INT )
            // InternalBilang.g:4727:5: lv_code_3_0= RULE_INT
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
    // InternalBilang.g:4747:1: entryRuleDocumentPerson returns [EObject current=null] : iv_ruleDocumentPerson= ruleDocumentPerson EOF ;
    public final EObject entryRuleDocumentPerson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentPerson = null;


        try {
            // InternalBilang.g:4747:55: (iv_ruleDocumentPerson= ruleDocumentPerson EOF )
            // InternalBilang.g:4748:2: iv_ruleDocumentPerson= ruleDocumentPerson EOF
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
    // InternalBilang.g:4754:1: ruleDocumentPerson returns [EObject current=null] : (otherlv_0= 'information' otherlv_1= 'about' otherlv_2= 'person' ( (lv_person_3_0= rulePerson ) ) ) ;
    public final EObject ruleDocumentPerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_person_3_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:4760:2: ( (otherlv_0= 'information' otherlv_1= 'about' otherlv_2= 'person' ( (lv_person_3_0= rulePerson ) ) ) )
            // InternalBilang.g:4761:2: (otherlv_0= 'information' otherlv_1= 'about' otherlv_2= 'person' ( (lv_person_3_0= rulePerson ) ) )
            {
            // InternalBilang.g:4761:2: (otherlv_0= 'information' otherlv_1= 'about' otherlv_2= 'person' ( (lv_person_3_0= rulePerson ) ) )
            // InternalBilang.g:4762:3: otherlv_0= 'information' otherlv_1= 'about' otherlv_2= 'person' ( (lv_person_3_0= rulePerson ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_85); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentPersonAccess().getInformationKeyword_0());
            		
            otherlv_1=(Token)match(input,112,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentPersonAccess().getAboutKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDocumentPersonAccess().getPersonKeyword_2());
            		
            // InternalBilang.g:4774:3: ( (lv_person_3_0= rulePerson ) )
            // InternalBilang.g:4775:4: (lv_person_3_0= rulePerson )
            {
            // InternalBilang.g:4775:4: (lv_person_3_0= rulePerson )
            // InternalBilang.g:4776:5: lv_person_3_0= rulePerson
            {

            					newCompositeNode(grammarAccess.getDocumentPersonAccess().getPersonPersonParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_person_3_0=rulePerson();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentPersonRule());
            					}
            					set(
            						current,
            						"person",
            						lv_person_3_0,
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


    // $ANTLR start "entryRuleDocumentTopic"
    // InternalBilang.g:4797:1: entryRuleDocumentTopic returns [EObject current=null] : iv_ruleDocumentTopic= ruleDocumentTopic EOF ;
    public final EObject entryRuleDocumentTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentTopic = null;


        try {
            // InternalBilang.g:4797:54: (iv_ruleDocumentTopic= ruleDocumentTopic EOF )
            // InternalBilang.g:4798:2: iv_ruleDocumentTopic= ruleDocumentTopic EOF
            {
             newCompositeNode(grammarAccess.getDocumentTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentTopic=ruleDocumentTopic();

            state._fsp--;

             current =iv_ruleDocumentTopic; 
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
    // $ANTLR end "entryRuleDocumentTopic"


    // $ANTLR start "ruleDocumentTopic"
    // InternalBilang.g:4804:1: ruleDocumentTopic returns [EObject current=null] : (otherlv_0= 'information' otherlv_1= 'about' otherlv_2= 'topic' ( (lv_topic_3_0= ruleTopic ) ) ) ;
    public final EObject ruleDocumentTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_topic_3_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:4810:2: ( (otherlv_0= 'information' otherlv_1= 'about' otherlv_2= 'topic' ( (lv_topic_3_0= ruleTopic ) ) ) )
            // InternalBilang.g:4811:2: (otherlv_0= 'information' otherlv_1= 'about' otherlv_2= 'topic' ( (lv_topic_3_0= ruleTopic ) ) )
            {
            // InternalBilang.g:4811:2: (otherlv_0= 'information' otherlv_1= 'about' otherlv_2= 'topic' ( (lv_topic_3_0= ruleTopic ) ) )
            // InternalBilang.g:4812:3: otherlv_0= 'information' otherlv_1= 'about' otherlv_2= 'topic' ( (lv_topic_3_0= ruleTopic ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_85); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentTopicAccess().getInformationKeyword_0());
            		
            otherlv_1=(Token)match(input,112,FOLLOW_86); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentTopicAccess().getAboutKeyword_1());
            		
            otherlv_2=(Token)match(input,113,FOLLOW_87); 

            			newLeafNode(otherlv_2, grammarAccess.getDocumentTopicAccess().getTopicKeyword_2());
            		
            // InternalBilang.g:4824:3: ( (lv_topic_3_0= ruleTopic ) )
            // InternalBilang.g:4825:4: (lv_topic_3_0= ruleTopic )
            {
            // InternalBilang.g:4825:4: (lv_topic_3_0= ruleTopic )
            // InternalBilang.g:4826:5: lv_topic_3_0= ruleTopic
            {

            					newCompositeNode(grammarAccess.getDocumentTopicAccess().getTopicTopicParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_topic_3_0=ruleTopic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentTopicRule());
            					}
            					set(
            						current,
            						"topic",
            						lv_topic_3_0,
            						"org.xtext.example.bilang.Bilang.Topic");
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
    // $ANTLR end "ruleDocumentTopic"


    // $ANTLR start "entryRuleTopic"
    // InternalBilang.g:4847:1: entryRuleTopic returns [String current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final String entryRuleTopic() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTopic = null;


        try {
            // InternalBilang.g:4847:45: (iv_ruleTopic= ruleTopic EOF )
            // InternalBilang.g:4848:2: iv_ruleTopic= ruleTopic EOF
            {
             newCompositeNode(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopic=ruleTopic();

            state._fsp--;

             current =iv_ruleTopic.getText(); 
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
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalBilang.g:4854:1: ruleTopic returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleTopic() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBilang.g:4860:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBilang.g:4861:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBilang.g:4861:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalBilang.g:4862:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getTopicAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:4870:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getTopicAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRuleDocumentOperation"
    // InternalBilang.g:4881:1: entryRuleDocumentOperation returns [EObject current=null] : iv_ruleDocumentOperation= ruleDocumentOperation EOF ;
    public final EObject entryRuleDocumentOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentOperation = null;


        try {
            // InternalBilang.g:4881:58: (iv_ruleDocumentOperation= ruleDocumentOperation EOF )
            // InternalBilang.g:4882:2: iv_ruleDocumentOperation= ruleDocumentOperation EOF
            {
             newCompositeNode(grammarAccess.getDocumentOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentOperation=ruleDocumentOperation();

            state._fsp--;

             current =iv_ruleDocumentOperation; 
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
    // $ANTLR end "entryRuleDocumentOperation"


    // $ANTLR start "ruleDocumentOperation"
    // InternalBilang.g:4888:1: ruleDocumentOperation returns [EObject current=null] : (this_FilterDocuments_0= ruleFilterDocuments | this_SortDocuments_1= ruleSortDocuments | this_ArchiveDocument_2= ruleArchiveDocument | this_DeleteDocument_3= ruleDeleteDocument ) ;
    public final EObject ruleDocumentOperation() throws RecognitionException {
        EObject current = null;

        EObject this_FilterDocuments_0 = null;

        EObject this_SortDocuments_1 = null;

        EObject this_ArchiveDocument_2 = null;

        EObject this_DeleteDocument_3 = null;



        	enterRule();

        try {
            // InternalBilang.g:4894:2: ( (this_FilterDocuments_0= ruleFilterDocuments | this_SortDocuments_1= ruleSortDocuments | this_ArchiveDocument_2= ruleArchiveDocument | this_DeleteDocument_3= ruleDeleteDocument ) )
            // InternalBilang.g:4895:2: (this_FilterDocuments_0= ruleFilterDocuments | this_SortDocuments_1= ruleSortDocuments | this_ArchiveDocument_2= ruleArchiveDocument | this_DeleteDocument_3= ruleDeleteDocument )
            {
            // InternalBilang.g:4895:2: (this_FilterDocuments_0= ruleFilterDocuments | this_SortDocuments_1= ruleSortDocuments | this_ArchiveDocument_2= ruleArchiveDocument | this_DeleteDocument_3= ruleDeleteDocument )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt58=1;
                }
                break;
            case 120:
                {
                alt58=2;
                }
                break;
            case 124:
                {
                alt58=3;
                }
                break;
            case 100:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalBilang.g:4896:3: this_FilterDocuments_0= ruleFilterDocuments
                    {

                    			newCompositeNode(grammarAccess.getDocumentOperationAccess().getFilterDocumentsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FilterDocuments_0=ruleFilterDocuments();

                    state._fsp--;


                    			current = this_FilterDocuments_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:4905:3: this_SortDocuments_1= ruleSortDocuments
                    {

                    			newCompositeNode(grammarAccess.getDocumentOperationAccess().getSortDocumentsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SortDocuments_1=ruleSortDocuments();

                    state._fsp--;


                    			current = this_SortDocuments_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBilang.g:4914:3: this_ArchiveDocument_2= ruleArchiveDocument
                    {

                    			newCompositeNode(grammarAccess.getDocumentOperationAccess().getArchiveDocumentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArchiveDocument_2=ruleArchiveDocument();

                    state._fsp--;


                    			current = this_ArchiveDocument_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBilang.g:4923:3: this_DeleteDocument_3= ruleDeleteDocument
                    {

                    			newCompositeNode(grammarAccess.getDocumentOperationAccess().getDeleteDocumentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteDocument_3=ruleDeleteDocument();

                    state._fsp--;


                    			current = this_DeleteDocument_3;
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
    // $ANTLR end "ruleDocumentOperation"


    // $ANTLR start "entryRuleFilterDocuments"
    // InternalBilang.g:4935:1: entryRuleFilterDocuments returns [EObject current=null] : iv_ruleFilterDocuments= ruleFilterDocuments EOF ;
    public final EObject entryRuleFilterDocuments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterDocuments = null;


        try {
            // InternalBilang.g:4935:56: (iv_ruleFilterDocuments= ruleFilterDocuments EOF )
            // InternalBilang.g:4936:2: iv_ruleFilterDocuments= ruleFilterDocuments EOF
            {
             newCompositeNode(grammarAccess.getFilterDocumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterDocuments=ruleFilterDocuments();

            state._fsp--;

             current =iv_ruleFilterDocuments; 
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
    // $ANTLR end "entryRuleFilterDocuments"


    // $ANTLR start "ruleFilterDocuments"
    // InternalBilang.g:4942:1: ruleFilterDocuments returns [EObject current=null] : (otherlv_0= 'filter' otherlv_1= 'documents' otherlv_2= 'where' ( (lv_field_3_0= RULE_ID ) ) ( (lv_operator_4_0= ruleFilterOperator ) ) ( (lv_value_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleFilterDocuments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_field_3_0=null;
        Token lv_value_5_0=null;
        AntlrDatatypeRuleToken lv_operator_4_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:4948:2: ( (otherlv_0= 'filter' otherlv_1= 'documents' otherlv_2= 'where' ( (lv_field_3_0= RULE_ID ) ) ( (lv_operator_4_0= ruleFilterOperator ) ) ( (lv_value_5_0= RULE_STRING ) ) ) )
            // InternalBilang.g:4949:2: (otherlv_0= 'filter' otherlv_1= 'documents' otherlv_2= 'where' ( (lv_field_3_0= RULE_ID ) ) ( (lv_operator_4_0= ruleFilterOperator ) ) ( (lv_value_5_0= RULE_STRING ) ) )
            {
            // InternalBilang.g:4949:2: (otherlv_0= 'filter' otherlv_1= 'documents' otherlv_2= 'where' ( (lv_field_3_0= RULE_ID ) ) ( (lv_operator_4_0= ruleFilterOperator ) ) ( (lv_value_5_0= RULE_STRING ) ) )
            // InternalBilang.g:4950:3: otherlv_0= 'filter' otherlv_1= 'documents' otherlv_2= 'where' ( (lv_field_3_0= RULE_ID ) ) ( (lv_operator_4_0= ruleFilterOperator ) ) ( (lv_value_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,114,FOLLOW_88); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterDocumentsAccess().getFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,115,FOLLOW_89); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterDocumentsAccess().getDocumentsKeyword_1());
            		
            otherlv_2=(Token)match(input,116,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFilterDocumentsAccess().getWhereKeyword_2());
            		
            // InternalBilang.g:4962:3: ( (lv_field_3_0= RULE_ID ) )
            // InternalBilang.g:4963:4: (lv_field_3_0= RULE_ID )
            {
            // InternalBilang.g:4963:4: (lv_field_3_0= RULE_ID )
            // InternalBilang.g:4964:5: lv_field_3_0= RULE_ID
            {
            lv_field_3_0=(Token)match(input,RULE_ID,FOLLOW_90); 

            					newLeafNode(lv_field_3_0, grammarAccess.getFilterDocumentsAccess().getFieldIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterDocumentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"field",
            						lv_field_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBilang.g:4980:3: ( (lv_operator_4_0= ruleFilterOperator ) )
            // InternalBilang.g:4981:4: (lv_operator_4_0= ruleFilterOperator )
            {
            // InternalBilang.g:4981:4: (lv_operator_4_0= ruleFilterOperator )
            // InternalBilang.g:4982:5: lv_operator_4_0= ruleFilterOperator
            {

            					newCompositeNode(grammarAccess.getFilterDocumentsAccess().getOperatorFilterOperatorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_operator_4_0=ruleFilterOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterDocumentsRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_4_0,
            						"org.xtext.example.bilang.Bilang.FilterOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBilang.g:4999:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalBilang.g:5000:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalBilang.g:5000:4: (lv_value_5_0= RULE_STRING )
            // InternalBilang.g:5001:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_5_0, grammarAccess.getFilterDocumentsAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterDocumentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
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
    // $ANTLR end "ruleFilterDocuments"


    // $ANTLR start "entryRuleFilterOperator"
    // InternalBilang.g:5021:1: entryRuleFilterOperator returns [String current=null] : iv_ruleFilterOperator= ruleFilterOperator EOF ;
    public final String entryRuleFilterOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilterOperator = null;


        try {
            // InternalBilang.g:5021:54: (iv_ruleFilterOperator= ruleFilterOperator EOF )
            // InternalBilang.g:5022:2: iv_ruleFilterOperator= ruleFilterOperator EOF
            {
             newCompositeNode(grammarAccess.getFilterOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterOperator=ruleFilterOperator();

            state._fsp--;

             current =iv_ruleFilterOperator.getText(); 
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
    // $ANTLR end "entryRuleFilterOperator"


    // $ANTLR start "ruleFilterOperator"
    // InternalBilang.g:5028:1: ruleFilterOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'equals' | kw= 'contains' | (kw= 'starts' kw= 'with' ) ) ;
    public final AntlrDatatypeRuleToken ruleFilterOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBilang.g:5034:2: ( (kw= 'equals' | kw= 'contains' | (kw= 'starts' kw= 'with' ) ) )
            // InternalBilang.g:5035:2: (kw= 'equals' | kw= 'contains' | (kw= 'starts' kw= 'with' ) )
            {
            // InternalBilang.g:5035:2: (kw= 'equals' | kw= 'contains' | (kw= 'starts' kw= 'with' ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt59=1;
                }
                break;
            case 118:
                {
                alt59=2;
                }
                break;
            case 119:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalBilang.g:5036:3: kw= 'equals'
                    {
                    kw=(Token)match(input,117,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFilterOperatorAccess().getEqualsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBilang.g:5042:3: kw= 'contains'
                    {
                    kw=(Token)match(input,118,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFilterOperatorAccess().getContainsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBilang.g:5048:3: (kw= 'starts' kw= 'with' )
                    {
                    // InternalBilang.g:5048:3: (kw= 'starts' kw= 'with' )
                    // InternalBilang.g:5049:4: kw= 'starts' kw= 'with'
                    {
                    kw=(Token)match(input,119,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFilterOperatorAccess().getStartsKeyword_2_0());
                    			
                    kw=(Token)match(input,18,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFilterOperatorAccess().getWithKeyword_2_1());
                    			

                    }


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
    // $ANTLR end "ruleFilterOperator"


    // $ANTLR start "entryRuleSortDocuments"
    // InternalBilang.g:5064:1: entryRuleSortDocuments returns [EObject current=null] : iv_ruleSortDocuments= ruleSortDocuments EOF ;
    public final EObject entryRuleSortDocuments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortDocuments = null;


        try {
            // InternalBilang.g:5064:54: (iv_ruleSortDocuments= ruleSortDocuments EOF )
            // InternalBilang.g:5065:2: iv_ruleSortDocuments= ruleSortDocuments EOF
            {
             newCompositeNode(grammarAccess.getSortDocumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSortDocuments=ruleSortDocuments();

            state._fsp--;

             current =iv_ruleSortDocuments; 
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
    // $ANTLR end "entryRuleSortDocuments"


    // $ANTLR start "ruleSortDocuments"
    // InternalBilang.g:5071:1: ruleSortDocuments returns [EObject current=null] : (otherlv_0= 'sort' otherlv_1= 'documents' otherlv_2= 'by' ( (lv_field_3_0= RULE_ID ) ) ( ( (lv_direction_4_1= 'ascending' | lv_direction_4_2= 'descending' ) ) )? ) ;
    public final EObject ruleSortDocuments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_field_3_0=null;
        Token lv_direction_4_1=null;
        Token lv_direction_4_2=null;


        	enterRule();

        try {
            // InternalBilang.g:5077:2: ( (otherlv_0= 'sort' otherlv_1= 'documents' otherlv_2= 'by' ( (lv_field_3_0= RULE_ID ) ) ( ( (lv_direction_4_1= 'ascending' | lv_direction_4_2= 'descending' ) ) )? ) )
            // InternalBilang.g:5078:2: (otherlv_0= 'sort' otherlv_1= 'documents' otherlv_2= 'by' ( (lv_field_3_0= RULE_ID ) ) ( ( (lv_direction_4_1= 'ascending' | lv_direction_4_2= 'descending' ) ) )? )
            {
            // InternalBilang.g:5078:2: (otherlv_0= 'sort' otherlv_1= 'documents' otherlv_2= 'by' ( (lv_field_3_0= RULE_ID ) ) ( ( (lv_direction_4_1= 'ascending' | lv_direction_4_2= 'descending' ) ) )? )
            // InternalBilang.g:5079:3: otherlv_0= 'sort' otherlv_1= 'documents' otherlv_2= 'by' ( (lv_field_3_0= RULE_ID ) ) ( ( (lv_direction_4_1= 'ascending' | lv_direction_4_2= 'descending' ) ) )?
            {
            otherlv_0=(Token)match(input,120,FOLLOW_88); 

            			newLeafNode(otherlv_0, grammarAccess.getSortDocumentsAccess().getSortKeyword_0());
            		
            otherlv_1=(Token)match(input,115,FOLLOW_91); 

            			newLeafNode(otherlv_1, grammarAccess.getSortDocumentsAccess().getDocumentsKeyword_1());
            		
            otherlv_2=(Token)match(input,121,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSortDocumentsAccess().getByKeyword_2());
            		
            // InternalBilang.g:5091:3: ( (lv_field_3_0= RULE_ID ) )
            // InternalBilang.g:5092:4: (lv_field_3_0= RULE_ID )
            {
            // InternalBilang.g:5092:4: (lv_field_3_0= RULE_ID )
            // InternalBilang.g:5093:5: lv_field_3_0= RULE_ID
            {
            lv_field_3_0=(Token)match(input,RULE_ID,FOLLOW_92); 

            					newLeafNode(lv_field_3_0, grammarAccess.getSortDocumentsAccess().getFieldIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSortDocumentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"field",
            						lv_field_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBilang.g:5109:3: ( ( (lv_direction_4_1= 'ascending' | lv_direction_4_2= 'descending' ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=122 && LA61_0<=123)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalBilang.g:5110:4: ( (lv_direction_4_1= 'ascending' | lv_direction_4_2= 'descending' ) )
                    {
                    // InternalBilang.g:5110:4: ( (lv_direction_4_1= 'ascending' | lv_direction_4_2= 'descending' ) )
                    // InternalBilang.g:5111:5: (lv_direction_4_1= 'ascending' | lv_direction_4_2= 'descending' )
                    {
                    // InternalBilang.g:5111:5: (lv_direction_4_1= 'ascending' | lv_direction_4_2= 'descending' )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==122) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==123) ) {
                        alt60=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalBilang.g:5112:6: lv_direction_4_1= 'ascending'
                            {
                            lv_direction_4_1=(Token)match(input,122,FOLLOW_2); 

                            						newLeafNode(lv_direction_4_1, grammarAccess.getSortDocumentsAccess().getDirectionAscendingKeyword_4_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSortDocumentsRule());
                            						}
                            						setWithLastConsumed(current, "direction", lv_direction_4_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalBilang.g:5123:6: lv_direction_4_2= 'descending'
                            {
                            lv_direction_4_2=(Token)match(input,123,FOLLOW_2); 

                            						newLeafNode(lv_direction_4_2, grammarAccess.getSortDocumentsAccess().getDirectionDescendingKeyword_4_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSortDocumentsRule());
                            						}
                            						setWithLastConsumed(current, "direction", lv_direction_4_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSortDocuments"


    // $ANTLR start "entryRuleArchiveDocument"
    // InternalBilang.g:5140:1: entryRuleArchiveDocument returns [EObject current=null] : iv_ruleArchiveDocument= ruleArchiveDocument EOF ;
    public final EObject entryRuleArchiveDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchiveDocument = null;


        try {
            // InternalBilang.g:5140:56: (iv_ruleArchiveDocument= ruleArchiveDocument EOF )
            // InternalBilang.g:5141:2: iv_ruleArchiveDocument= ruleArchiveDocument EOF
            {
             newCompositeNode(grammarAccess.getArchiveDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchiveDocument=ruleArchiveDocument();

            state._fsp--;

             current =iv_ruleArchiveDocument; 
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
    // $ANTLR end "entryRuleArchiveDocument"


    // $ANTLR start "ruleArchiveDocument"
    // InternalBilang.g:5147:1: ruleArchiveDocument returns [EObject current=null] : (otherlv_0= 'archive' ( (lv_document_1_0= ruleDocument ) ) ) ;
    public final EObject ruleArchiveDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_document_1_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:5153:2: ( (otherlv_0= 'archive' ( (lv_document_1_0= ruleDocument ) ) ) )
            // InternalBilang.g:5154:2: (otherlv_0= 'archive' ( (lv_document_1_0= ruleDocument ) ) )
            {
            // InternalBilang.g:5154:2: (otherlv_0= 'archive' ( (lv_document_1_0= ruleDocument ) ) )
            // InternalBilang.g:5155:3: otherlv_0= 'archive' ( (lv_document_1_0= ruleDocument ) )
            {
            otherlv_0=(Token)match(input,124,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getArchiveDocumentAccess().getArchiveKeyword_0());
            		
            // InternalBilang.g:5159:3: ( (lv_document_1_0= ruleDocument ) )
            // InternalBilang.g:5160:4: (lv_document_1_0= ruleDocument )
            {
            // InternalBilang.g:5160:4: (lv_document_1_0= ruleDocument )
            // InternalBilang.g:5161:5: lv_document_1_0= ruleDocument
            {

            					newCompositeNode(grammarAccess.getArchiveDocumentAccess().getDocumentDocumentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_document_1_0=ruleDocument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchiveDocumentRule());
            					}
            					set(
            						current,
            						"document",
            						lv_document_1_0,
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
    // $ANTLR end "ruleArchiveDocument"


    // $ANTLR start "entryRuleDeleteDocument"
    // InternalBilang.g:5182:1: entryRuleDeleteDocument returns [EObject current=null] : iv_ruleDeleteDocument= ruleDeleteDocument EOF ;
    public final EObject entryRuleDeleteDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteDocument = null;


        try {
            // InternalBilang.g:5182:55: (iv_ruleDeleteDocument= ruleDeleteDocument EOF )
            // InternalBilang.g:5183:2: iv_ruleDeleteDocument= ruleDeleteDocument EOF
            {
             newCompositeNode(grammarAccess.getDeleteDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteDocument=ruleDeleteDocument();

            state._fsp--;

             current =iv_ruleDeleteDocument; 
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
    // $ANTLR end "entryRuleDeleteDocument"


    // $ANTLR start "ruleDeleteDocument"
    // InternalBilang.g:5189:1: ruleDeleteDocument returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_document_1_0= ruleDocument ) ) ) ;
    public final EObject ruleDeleteDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_document_1_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:5195:2: ( (otherlv_0= 'delete' ( (lv_document_1_0= ruleDocument ) ) ) )
            // InternalBilang.g:5196:2: (otherlv_0= 'delete' ( (lv_document_1_0= ruleDocument ) ) )
            {
            // InternalBilang.g:5196:2: (otherlv_0= 'delete' ( (lv_document_1_0= ruleDocument ) ) )
            // InternalBilang.g:5197:3: otherlv_0= 'delete' ( (lv_document_1_0= ruleDocument ) )
            {
            otherlv_0=(Token)match(input,100,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteDocumentAccess().getDeleteKeyword_0());
            		
            // InternalBilang.g:5201:3: ( (lv_document_1_0= ruleDocument ) )
            // InternalBilang.g:5202:4: (lv_document_1_0= ruleDocument )
            {
            // InternalBilang.g:5202:4: (lv_document_1_0= ruleDocument )
            // InternalBilang.g:5203:5: lv_document_1_0= ruleDocument
            {

            					newCompositeNode(grammarAccess.getDeleteDocumentAccess().getDocumentDocumentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_document_1_0=ruleDocument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteDocumentRule());
            					}
            					set(
            						current,
            						"document",
            						lv_document_1_0,
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
    // $ANTLR end "ruleDeleteDocument"


    // $ANTLR start "entryRuleCreateInvoiceWithProducts"
    // InternalBilang.g:5224:1: entryRuleCreateInvoiceWithProducts returns [EObject current=null] : iv_ruleCreateInvoiceWithProducts= ruleCreateInvoiceWithProducts EOF ;
    public final EObject entryRuleCreateInvoiceWithProducts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateInvoiceWithProducts = null;


        try {
            // InternalBilang.g:5224:66: (iv_ruleCreateInvoiceWithProducts= ruleCreateInvoiceWithProducts EOF )
            // InternalBilang.g:5225:2: iv_ruleCreateInvoiceWithProducts= ruleCreateInvoiceWithProducts EOF
            {
             newCompositeNode(grammarAccess.getCreateInvoiceWithProductsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateInvoiceWithProducts=ruleCreateInvoiceWithProducts();

            state._fsp--;

             current =iv_ruleCreateInvoiceWithProducts; 
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
    // $ANTLR end "entryRuleCreateInvoiceWithProducts"


    // $ANTLR start "ruleCreateInvoiceWithProducts"
    // InternalBilang.g:5231:1: ruleCreateInvoiceWithProducts returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'invoice' otherlv_2= 'with' otherlv_3= 'products' ( (lv_products_4_0= ruleProductReference ) ) (otherlv_5= ',' ( (lv_products_6_0= ruleProductReference ) ) )* ) ;
    public final EObject ruleCreateInvoiceWithProducts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_products_4_0 = null;

        EObject lv_products_6_0 = null;



        	enterRule();

        try {
            // InternalBilang.g:5237:2: ( (otherlv_0= 'create' otherlv_1= 'invoice' otherlv_2= 'with' otherlv_3= 'products' ( (lv_products_4_0= ruleProductReference ) ) (otherlv_5= ',' ( (lv_products_6_0= ruleProductReference ) ) )* ) )
            // InternalBilang.g:5238:2: (otherlv_0= 'create' otherlv_1= 'invoice' otherlv_2= 'with' otherlv_3= 'products' ( (lv_products_4_0= ruleProductReference ) ) (otherlv_5= ',' ( (lv_products_6_0= ruleProductReference ) ) )* )
            {
            // InternalBilang.g:5238:2: (otherlv_0= 'create' otherlv_1= 'invoice' otherlv_2= 'with' otherlv_3= 'products' ( (lv_products_4_0= ruleProductReference ) ) (otherlv_5= ',' ( (lv_products_6_0= ruleProductReference ) ) )* )
            // InternalBilang.g:5239:3: otherlv_0= 'create' otherlv_1= 'invoice' otherlv_2= 'with' otherlv_3= 'products' ( (lv_products_4_0= ruleProductReference ) ) (otherlv_5= ',' ( (lv_products_6_0= ruleProductReference ) ) )*
            {
            otherlv_0=(Token)match(input,125,FOLLOW_93); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateInvoiceWithProductsAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,110,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateInvoiceWithProductsAccess().getInvoiceKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_94); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateInvoiceWithProductsAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,126,FOLLOW_95); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateInvoiceWithProductsAccess().getProductsKeyword_3());
            		
            // InternalBilang.g:5255:3: ( (lv_products_4_0= ruleProductReference ) )
            // InternalBilang.g:5256:4: (lv_products_4_0= ruleProductReference )
            {
            // InternalBilang.g:5256:4: (lv_products_4_0= ruleProductReference )
            // InternalBilang.g:5257:5: lv_products_4_0= ruleProductReference
            {

            					newCompositeNode(grammarAccess.getCreateInvoiceWithProductsAccess().getProductsProductReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_52);
            lv_products_4_0=ruleProductReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateInvoiceWithProductsRule());
            					}
            					add(
            						current,
            						"products",
            						lv_products_4_0,
            						"org.xtext.example.bilang.Bilang.ProductReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBilang.g:5274:3: (otherlv_5= ',' ( (lv_products_6_0= ruleProductReference ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==28) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalBilang.g:5275:4: otherlv_5= ',' ( (lv_products_6_0= ruleProductReference ) )
            	    {
            	    otherlv_5=(Token)match(input,28,FOLLOW_95); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCreateInvoiceWithProductsAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalBilang.g:5279:4: ( (lv_products_6_0= ruleProductReference ) )
            	    // InternalBilang.g:5280:5: (lv_products_6_0= ruleProductReference )
            	    {
            	    // InternalBilang.g:5280:5: (lv_products_6_0= ruleProductReference )
            	    // InternalBilang.g:5281:6: lv_products_6_0= ruleProductReference
            	    {

            	    						newCompositeNode(grammarAccess.getCreateInvoiceWithProductsAccess().getProductsProductReferenceParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_52);
            	    lv_products_6_0=ruleProductReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCreateInvoiceWithProductsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"products",
            	    							lv_products_6_0,
            	    							"org.xtext.example.bilang.Bilang.ProductReference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
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
    // $ANTLR end "ruleCreateInvoiceWithProducts"


    // $ANTLR start "entryRuleProductReference"
    // InternalBilang.g:5303:1: entryRuleProductReference returns [EObject current=null] : iv_ruleProductReference= ruleProductReference EOF ;
    public final EObject entryRuleProductReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductReference = null;


        try {
            // InternalBilang.g:5303:57: (iv_ruleProductReference= ruleProductReference EOF )
            // InternalBilang.g:5304:2: iv_ruleProductReference= ruleProductReference EOF
            {
             newCompositeNode(grammarAccess.getProductReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductReference=ruleProductReference();

            state._fsp--;

             current =iv_ruleProductReference; 
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
    // $ANTLR end "entryRuleProductReference"


    // $ANTLR start "ruleProductReference"
    // InternalBilang.g:5310:1: ruleProductReference returns [EObject current=null] : (otherlv_0= 'product' otherlv_1= 'with' otherlv_2= 'name' ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleProductReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalBilang.g:5316:2: ( (otherlv_0= 'product' otherlv_1= 'with' otherlv_2= 'name' ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalBilang.g:5317:2: (otherlv_0= 'product' otherlv_1= 'with' otherlv_2= 'name' ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalBilang.g:5317:2: (otherlv_0= 'product' otherlv_1= 'with' otherlv_2= 'name' ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalBilang.g:5318:3: otherlv_0= 'product' otherlv_1= 'with' otherlv_2= 'name' ( (lv_name_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,127,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProductReferenceAccess().getProductKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getProductReferenceAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getProductReferenceAccess().getNameKeyword_2());
            		
            // InternalBilang.g:5330:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalBilang.g:5331:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalBilang.g:5331:4: (lv_name_3_0= RULE_STRING )
            // InternalBilang.g:5332:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getProductReferenceAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
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
    // $ANTLR end "ruleProductReference"


    // $ANTLR start "entryRuleCreateProduct"
    // InternalBilang.g:5352:1: entryRuleCreateProduct returns [EObject current=null] : iv_ruleCreateProduct= ruleCreateProduct EOF ;
    public final EObject entryRuleCreateProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateProduct = null;


        try {
            // InternalBilang.g:5352:54: (iv_ruleCreateProduct= ruleCreateProduct EOF )
            // InternalBilang.g:5353:2: iv_ruleCreateProduct= ruleCreateProduct EOF
            {
             newCompositeNode(grammarAccess.getCreateProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateProduct=ruleCreateProduct();

            state._fsp--;

             current =iv_ruleCreateProduct; 
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
    // $ANTLR end "entryRuleCreateProduct"


    // $ANTLR start "ruleCreateProduct"
    // InternalBilang.g:5359:1: ruleCreateProduct returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'product' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'and' otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'and' otherlv_9= 'price' ( (lv_price_10_0= RULE_INT ) ) ) ;
    public final EObject ruleCreateProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_price_10_0=null;


        	enterRule();

        try {
            // InternalBilang.g:5365:2: ( (otherlv_0= 'create' otherlv_1= 'product' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'and' otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'and' otherlv_9= 'price' ( (lv_price_10_0= RULE_INT ) ) ) )
            // InternalBilang.g:5366:2: (otherlv_0= 'create' otherlv_1= 'product' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'and' otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'and' otherlv_9= 'price' ( (lv_price_10_0= RULE_INT ) ) )
            {
            // InternalBilang.g:5366:2: (otherlv_0= 'create' otherlv_1= 'product' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'and' otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'and' otherlv_9= 'price' ( (lv_price_10_0= RULE_INT ) ) )
            // InternalBilang.g:5367:3: otherlv_0= 'create' otherlv_1= 'product' otherlv_2= 'with' otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'and' otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'and' otherlv_9= 'price' ( (lv_price_10_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,125,FOLLOW_95); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateProductAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,127,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateProductAccess().getProductKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateProductAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateProductAccess().getNameKeyword_3());
            		
            // InternalBilang.g:5383:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalBilang.g:5384:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalBilang.g:5384:4: (lv_name_4_0= RULE_STRING )
            // InternalBilang.g:5385:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_name_4_0, grammarAccess.getCreateProductAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateProductRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_96); 

            			newLeafNode(otherlv_5, grammarAccess.getCreateProductAccess().getAndKeyword_5());
            		
            otherlv_6=(Token)match(input,128,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getCreateProductAccess().getDescriptionKeyword_6());
            		
            // InternalBilang.g:5409:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalBilang.g:5410:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalBilang.g:5410:4: (lv_description_7_0= RULE_STRING )
            // InternalBilang.g:5411:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_description_7_0, grammarAccess.getCreateProductAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateProductRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_97); 

            			newLeafNode(otherlv_8, grammarAccess.getCreateProductAccess().getAndKeyword_8());
            		
            otherlv_9=(Token)match(input,129,FOLLOW_42); 

            			newLeafNode(otherlv_9, grammarAccess.getCreateProductAccess().getPriceKeyword_9());
            		
            // InternalBilang.g:5435:3: ( (lv_price_10_0= RULE_INT ) )
            // InternalBilang.g:5436:4: (lv_price_10_0= RULE_INT )
            {
            // InternalBilang.g:5436:4: (lv_price_10_0= RULE_INT )
            // InternalBilang.g:5437:5: lv_price_10_0= RULE_INT
            {
            lv_price_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_price_10_0, grammarAccess.getCreateProductAccess().getPriceINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateProductRule());
            					}
            					setWithLastConsumed(
            						current,
            						"price",
            						lv_price_10_0,
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
    // $ANTLR end "ruleCreateProduct"


    // $ANTLR start "entryRuleRetrieveProductInformation"
    // InternalBilang.g:5457:1: entryRuleRetrieveProductInformation returns [EObject current=null] : iv_ruleRetrieveProductInformation= ruleRetrieveProductInformation EOF ;
    public final EObject entryRuleRetrieveProductInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieveProductInformation = null;


        try {
            // InternalBilang.g:5457:67: (iv_ruleRetrieveProductInformation= ruleRetrieveProductInformation EOF )
            // InternalBilang.g:5458:2: iv_ruleRetrieveProductInformation= ruleRetrieveProductInformation EOF
            {
             newCompositeNode(grammarAccess.getRetrieveProductInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetrieveProductInformation=ruleRetrieveProductInformation();

            state._fsp--;

             current =iv_ruleRetrieveProductInformation; 
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
    // $ANTLR end "entryRuleRetrieveProductInformation"


    // $ANTLR start "ruleRetrieveProductInformation"
    // InternalBilang.g:5464:1: ruleRetrieveProductInformation returns [EObject current=null] : (otherlv_0= 'retrieve' otherlv_1= 'product' otherlv_2= 'information' otherlv_3= 'for' otherlv_4= 'product' otherlv_5= 'with' otherlv_6= 'name' ( (lv_name_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleRetrieveProductInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;


        	enterRule();

        try {
            // InternalBilang.g:5470:2: ( (otherlv_0= 'retrieve' otherlv_1= 'product' otherlv_2= 'information' otherlv_3= 'for' otherlv_4= 'product' otherlv_5= 'with' otherlv_6= 'name' ( (lv_name_7_0= RULE_STRING ) ) ) )
            // InternalBilang.g:5471:2: (otherlv_0= 'retrieve' otherlv_1= 'product' otherlv_2= 'information' otherlv_3= 'for' otherlv_4= 'product' otherlv_5= 'with' otherlv_6= 'name' ( (lv_name_7_0= RULE_STRING ) ) )
            {
            // InternalBilang.g:5471:2: (otherlv_0= 'retrieve' otherlv_1= 'product' otherlv_2= 'information' otherlv_3= 'for' otherlv_4= 'product' otherlv_5= 'with' otherlv_6= 'name' ( (lv_name_7_0= RULE_STRING ) ) )
            // InternalBilang.g:5472:3: otherlv_0= 'retrieve' otherlv_1= 'product' otherlv_2= 'information' otherlv_3= 'for' otherlv_4= 'product' otherlv_5= 'with' otherlv_6= 'name' ( (lv_name_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_95); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrieveProductInformationAccess().getRetrieveKeyword_0());
            		
            otherlv_1=(Token)match(input,127,FOLLOW_98); 

            			newLeafNode(otherlv_1, grammarAccess.getRetrieveProductInformationAccess().getProductKeyword_1());
            		
            otherlv_2=(Token)match(input,111,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getRetrieveProductInformationAccess().getInformationKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_95); 

            			newLeafNode(otherlv_3, grammarAccess.getRetrieveProductInformationAccess().getForKeyword_3());
            		
            otherlv_4=(Token)match(input,127,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getRetrieveProductInformationAccess().getProductKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRetrieveProductInformationAccess().getWithKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getRetrieveProductInformationAccess().getNameKeyword_6());
            		
            // InternalBilang.g:5500:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalBilang.g:5501:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalBilang.g:5501:4: (lv_name_7_0= RULE_STRING )
            // InternalBilang.g:5502:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_7_0, grammarAccess.getRetrieveProductInformationAccess().getNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRetrieveProductInformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
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
    // $ANTLR end "ruleRetrieveProductInformation"


    // $ANTLR start "entryRuleRetrieveOrderStatusByInvoice"
    // InternalBilang.g:5522:1: entryRuleRetrieveOrderStatusByInvoice returns [EObject current=null] : iv_ruleRetrieveOrderStatusByInvoice= ruleRetrieveOrderStatusByInvoice EOF ;
    public final EObject entryRuleRetrieveOrderStatusByInvoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieveOrderStatusByInvoice = null;


        try {
            // InternalBilang.g:5522:69: (iv_ruleRetrieveOrderStatusByInvoice= ruleRetrieveOrderStatusByInvoice EOF )
            // InternalBilang.g:5523:2: iv_ruleRetrieveOrderStatusByInvoice= ruleRetrieveOrderStatusByInvoice EOF
            {
             newCompositeNode(grammarAccess.getRetrieveOrderStatusByInvoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetrieveOrderStatusByInvoice=ruleRetrieveOrderStatusByInvoice();

            state._fsp--;

             current =iv_ruleRetrieveOrderStatusByInvoice; 
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
    // $ANTLR end "entryRuleRetrieveOrderStatusByInvoice"


    // $ANTLR start "ruleRetrieveOrderStatusByInvoice"
    // InternalBilang.g:5529:1: ruleRetrieveOrderStatusByInvoice returns [EObject current=null] : (otherlv_0= 'retrieve' otherlv_1= 'order' otherlv_2= 'status' otherlv_3= 'by' otherlv_4= 'invoice' otherlv_5= 'with' otherlv_6= 'code' ( (lv_invoiceCode_7_0= RULE_INT ) ) ) ;
    public final EObject ruleRetrieveOrderStatusByInvoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_invoiceCode_7_0=null;


        	enterRule();

        try {
            // InternalBilang.g:5535:2: ( (otherlv_0= 'retrieve' otherlv_1= 'order' otherlv_2= 'status' otherlv_3= 'by' otherlv_4= 'invoice' otherlv_5= 'with' otherlv_6= 'code' ( (lv_invoiceCode_7_0= RULE_INT ) ) ) )
            // InternalBilang.g:5536:2: (otherlv_0= 'retrieve' otherlv_1= 'order' otherlv_2= 'status' otherlv_3= 'by' otherlv_4= 'invoice' otherlv_5= 'with' otherlv_6= 'code' ( (lv_invoiceCode_7_0= RULE_INT ) ) )
            {
            // InternalBilang.g:5536:2: (otherlv_0= 'retrieve' otherlv_1= 'order' otherlv_2= 'status' otherlv_3= 'by' otherlv_4= 'invoice' otherlv_5= 'with' otherlv_6= 'code' ( (lv_invoiceCode_7_0= RULE_INT ) ) )
            // InternalBilang.g:5537:3: otherlv_0= 'retrieve' otherlv_1= 'order' otherlv_2= 'status' otherlv_3= 'by' otherlv_4= 'invoice' otherlv_5= 'with' otherlv_6= 'code' ( (lv_invoiceCode_7_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_99); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrieveOrderStatusByInvoiceAccess().getRetrieveKeyword_0());
            		
            otherlv_1=(Token)match(input,130,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getRetrieveOrderStatusByInvoiceAccess().getOrderKeyword_1());
            		
            otherlv_2=(Token)match(input,131,FOLLOW_91); 

            			newLeafNode(otherlv_2, grammarAccess.getRetrieveOrderStatusByInvoiceAccess().getStatusKeyword_2());
            		
            otherlv_3=(Token)match(input,121,FOLLOW_93); 

            			newLeafNode(otherlv_3, grammarAccess.getRetrieveOrderStatusByInvoiceAccess().getByKeyword_3());
            		
            otherlv_4=(Token)match(input,110,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getRetrieveOrderStatusByInvoiceAccess().getInvoiceKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_79); 

            			newLeafNode(otherlv_5, grammarAccess.getRetrieveOrderStatusByInvoiceAccess().getWithKeyword_5());
            		
            otherlv_6=(Token)match(input,107,FOLLOW_42); 

            			newLeafNode(otherlv_6, grammarAccess.getRetrieveOrderStatusByInvoiceAccess().getCodeKeyword_6());
            		
            // InternalBilang.g:5565:3: ( (lv_invoiceCode_7_0= RULE_INT ) )
            // InternalBilang.g:5566:4: (lv_invoiceCode_7_0= RULE_INT )
            {
            // InternalBilang.g:5566:4: (lv_invoiceCode_7_0= RULE_INT )
            // InternalBilang.g:5567:5: lv_invoiceCode_7_0= RULE_INT
            {
            lv_invoiceCode_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_invoiceCode_7_0, grammarAccess.getRetrieveOrderStatusByInvoiceAccess().getInvoiceCodeINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRetrieveOrderStatusByInvoiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"invoiceCode",
            						lv_invoiceCode_7_0,
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
    // $ANTLR end "ruleRetrieveOrderStatusByInvoice"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\u025b\uffff";
    static final String dfa_2s = "\1\1\u025a\uffff";
    static final String dfa_3s = "\1\16\1\uffff\1\45\1\121\1\132\1\33\1\142\3\42\1\67\1\156\1\133\1\137\1\22\1\u0083\1\43\1\22\1\157\1\125\1\33\2\22\1\33\1\42\2\22\2\102\1\140\1\123\1\171\1\156\1\130\1\67\1\126\1\42\2\147\1\42\1\22\1\23\1\176\2\33\1\102\1\6\1\156\1\22\1\160\1\4\1\177\1\42\1\22\2\4\1\22\1\23\1\4\1\uffff\1\5\1\177\2\42\1\33\1\34\1\22\1\153\1\42\1\35\2\22\1\133\1\24\1\35\1\133\1\7\1\5\1\10\1\35\1\24\3\22\1\42\1\6\1\153\1\6\1\4\1\33\1\23\1\152\1\40\1\23\1\7\1\153\1\4\1\33\1\40\1\23\1\7\1\153\1\4\2\22\1\35\1\u0080\1\23\2\133\1\22\1\34\1\6\3\35\1\42\1\5\1\153\1\10\1\4\1\35\1\11\1\35\1\42\1\10\1\4\1\35\1\11\1\35\1\141\1\133\2\5\1\40\1\7\1\23\1\153\1\4\1\23\1\40\1\7\1\153\1\4\1\133\2\35\1\22\1\35\1\11\1\35\1\24\1\35\1\24\1\22\1\35\1\24\1\146\2\24\1\34\1\10\1\35\1\4\1\11\1\35\1\4\1\10\1\35\1\11\1\35\1\4\1\153\1\40\1\23\1\7\1\133\1\24\1\151\1\154\1\133\1\151\1\133\1\154\1\u0081\1\177\1\35\1\22\3\24\1\35\1\22\1\24\1\35\1\11\1\10\1\4\1\35\1\7\1\153\1\4\1\40\1\23\1\154\1\23\1\40\1\23\1\7\1\153\1\4\1\40\1\23\3\102\1\40\1\6\1\22\1\116\1\151\1\154\1\151\1\116\1\154\1\22\1\24\1\35\1\24\1\35\1\11\1\35\1\10\1\4\1\40\1\5\1\6\1\4\1\35\1\11\1\35\1\10\1\5\1\7\1\10\1\4\1\6\1\35\1\23\1\5\1\23\1\40\1\23\1\5\1\40\1\116\1\154\1\151\1\35\1\24\1\35\1\24\1\6\1\35\4\24\2\35\4\24\1\5\1\24\1\5\1\6\1\5\1\24\1\6\1\5\1\40\1\23\1\154\1\151\1\24\1\155\1\151\1\154\1\133\1\155\1\34\1\134\1\35\1\24\1\35\1\134\2\24\1\6\1\5\1\40\1\23\1\155\1\5\1\23\1\40\3\102\1\5\1\33\1\155\1\33\1\155\1\134\1\24\1\35\1\6\2\5\1\35\1\5\1\6\1\7\1\10\1\4\1\35\1\43\1\5\1\43\1\5\1\33\1\155\1\24\3\35\4\24\1\156\1\35\1\156\1\35\1\43\1\5\2\155\1\22\1\160\1\22\1\160\1\156\1\35\2\5\1\153\1\42\1\153\1\42\1\22\1\160\2\35\1\6\1\33\1\4\1\6\1\4\1\33\1\153\1\42\1\35\1\42\5\35\1\42\1\6\1\33\1\4\1\24\1\22\1\24\1\22\1\35\1\42\2\35\1\134\1\133\1\134\1\133\1\24\1\22\1\33\1\4\1\153\1\40\1\23\1\7\1\33\1\7\1\153\1\4\1\40\1\23\1\134\1\133\1\43\1\35\1\11\1\10\1\4\1\35\1\43\1\35\1\11\1\35\1\10\1\4\1\33\1\23\1\40\1\7\1\153\1\4\1\156\1\35\1\24\1\35\1\24\1\156\1\35\1\24\1\35\1\24\1\43\1\4\1\10\1\35\1\11\1\35\1\22\1\160\1\154\1\151\1\22\1\160\1\154\1\151\1\156\1\24\2\35\1\24\1\153\1\42\1\40\1\23\1\153\1\42\1\40\1\23\1\22\1\160\1\151\1\154\1\6\1\33\1\4\1\6\1\5\1\6\1\4\1\33\1\6\1\5\1\153\1\42\1\23\1\40\1\35\1\42\2\35\1\24\4\35\1\42\1\24\1\35\1\6\1\33\1\4\1\5\1\6\1\24\1\22\1\155\1\24\1\22\1\155\1\35\1\42\3\35\1\24\1\133\1\5\1\133\1\5\1\24\1\22\1\155\1\153\1\4\1\40\1\23\1\7\1\35\1\7\1\153\1\4\1\40\1\23\1\35\1\133\1\5\1\11\1\35\1\10\1\4\2\35\1\11\1\35\1\10\1\4\1\40\1\23\1\7\1\153\1\4\1\35\1\24\2\35\1\24\1\35\1\24\1\35\1\24\1\10\1\4\1\35\1\11\1\35\1\154\1\151\1\154\1\151\1\35\1\24\1\35\1\24\1\40\1\23\1\40\1\23\1\151\1\154\1\6\1\5\1\6\1\5\1\23\1\40\1\24\1\35\1\24\1\35\1\5\1\6\2\155\1\35\1\24\2\5\1\155\2\35\1\5\1\35";
    static final String dfa_4s = "\1\33\1\uffff\1\45\1\175\1\136\1\u0082\1\142\3\42\1\67\1\177\1\135\1\137\1\22\1\u0083\1\43\1\22\1\157\1\125\1\33\2\22\1\33\1\42\2\22\2\102\1\140\1\123\1\171\1\157\1\130\1\67\1\126\1\42\2\147\1\42\1\46\1\23\1\176\2\33\1\102\1\6\1\156\1\22\1\160\1\4\1\177\1\42\1\22\2\4\1\22\1\141\1\4\1\uffff\1\5\1\177\2\42\1\33\1\46\1\22\1\153\1\161\1\46\2\22\1\152\1\24\1\46\1\152\1\7\1\5\1\10\1\35\1\24\3\22\1\42\1\6\1\153\1\6\1\5\1\33\1\23\1\152\1\40\1\23\1\7\1\153\1\4\1\33\1\40\1\23\1\7\1\153\1\4\3\46\1\u0080\1\23\2\152\1\22\1\46\1\6\3\35\1\42\1\5\1\153\1\10\1\4\1\35\1\11\1\35\1\42\1\10\1\4\1\35\1\11\1\35\2\141\2\5\1\40\1\7\1\23\1\153\1\4\1\23\1\40\1\7\1\153\1\4\1\152\2\46\1\22\1\46\1\11\1\35\1\24\1\46\1\24\1\22\1\35\1\24\1\146\2\24\1\46\1\10\1\35\1\4\1\11\1\35\1\4\1\10\1\35\1\11\1\35\1\4\1\153\1\40\1\23\1\7\1\152\1\24\1\151\1\154\1\152\1\151\1\147\1\154\1\u0081\1\177\1\35\1\33\3\24\1\35\1\33\1\24\1\35\1\11\1\10\1\4\1\35\1\7\1\153\1\4\1\40\1\23\1\154\1\23\1\40\1\23\1\7\1\153\1\4\1\40\1\23\3\102\1\40\1\6\1\22\1\116\1\151\1\154\1\151\1\116\1\154\1\33\1\24\1\35\1\24\1\35\1\11\1\35\1\10\1\4\1\40\1\5\1\6\1\4\1\35\1\11\1\35\1\10\1\5\1\7\1\10\1\4\1\6\1\46\1\23\1\5\1\23\1\40\1\23\1\5\1\40\1\116\1\154\1\151\1\35\1\24\1\35\1\24\1\6\2\35\1\24\1\46\1\24\2\35\3\46\1\35\1\5\1\46\1\5\1\6\1\5\1\46\1\6\1\5\1\40\1\23\1\154\1\151\1\46\1\155\1\151\1\154\1\147\1\155\1\46\1\134\3\35\1\134\1\35\1\46\1\6\1\5\1\40\1\23\1\155\1\5\1\23\1\40\3\102\1\5\1\33\1\155\1\33\1\155\1\134\2\35\1\6\2\5\1\35\1\5\1\6\1\7\1\10\1\4\1\35\1\43\1\5\1\43\1\5\1\33\1\155\2\35\1\46\2\35\3\46\1\157\1\35\1\157\1\35\1\43\1\5\2\155\1\22\1\160\1\22\1\160\1\157\1\35\2\5\1\153\1\161\1\153\1\161\1\22\1\160\2\35\1\6\1\33\1\5\1\6\1\5\1\33\1\153\1\161\1\35\1\42\5\35\1\42\1\6\1\33\1\5\1\46\1\22\1\46\1\22\1\35\1\42\2\35\1\134\1\152\1\134\1\152\1\46\1\22\1\33\1\4\1\153\1\40\1\23\1\7\1\33\1\7\1\153\1\4\1\40\1\23\1\134\1\152\1\43\1\35\1\11\1\10\1\4\1\35\1\43\1\35\1\11\1\35\1\10\1\4\1\33\1\23\1\40\1\7\1\153\1\4\1\157\1\35\1\24\1\35\1\24\1\157\1\35\1\24\1\35\1\24\1\43\1\4\1\10\1\35\1\11\1\35\1\22\1\160\1\154\1\151\1\22\1\160\1\154\1\151\1\157\1\24\2\35\1\24\1\153\1\161\1\40\1\23\1\153\1\161\1\40\1\23\1\22\1\160\1\151\1\154\1\6\1\33\1\5\1\6\1\5\1\6\1\5\1\33\1\6\1\5\1\153\1\161\1\23\1\40\1\35\1\42\7\35\1\42\2\35\1\6\1\33\2\5\1\6\1\46\1\22\1\155\1\46\1\22\1\155\1\35\1\42\4\35\1\152\1\5\1\152\1\5\1\46\1\22\1\155\1\153\1\4\1\40\1\23\1\7\1\35\1\7\1\153\1\4\1\40\1\23\1\35\1\152\1\5\1\11\1\35\1\10\1\4\2\35\1\11\1\35\1\10\1\4\1\40\1\23\1\7\1\153\1\4\1\35\1\24\2\35\1\24\1\35\1\24\1\35\1\24\1\10\1\4\1\35\1\11\1\35\1\154\1\151\1\154\1\151\1\35\1\24\1\35\1\24\1\40\1\23\1\40\1\23\1\151\1\154\1\6\1\5\1\6\1\5\1\23\1\40\4\35\1\5\1\6\2\155\2\35\2\5\1\155\2\35\1\5\1\35";
    static final String dfa_5s = "\1\uffff\1\2\71\uffff\1\1\u021f\uffff";
    static final String dfa_6s = "\u025b\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\2\1\5\uffff\1\1\2\uffff\1\1\1\2",
            "",
            "\1\3",
            "\1\5\6\uffff\1\12\1\4\7\uffff\1\6\1\uffff\1\7\1\10\1\11\27\uffff\1\13",
            "\1\14\3\uffff\1\15",
            "\1\20\66\uffff\1\16\1\uffff\1\23\2\uffff\1\21\47\uffff\1\22\2\uffff\1\17",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\32\20\uffff\1\31",
            "\1\33\1\uffff\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71\12\uffff\1\73\10\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\107\uffff\1\114\5\uffff\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125\1\73\10\uffff\1\72",
            "\1\126",
            "\1\127",
            "\1\131\116\uffff\1\130",
            "\1\73\10\uffff\1\72",
            "\1\132",
            "\1\133",
            "\1\136\5\uffff\1\134\5\uffff\1\140\1\135\1\uffff\1\137",
            "\1\141",
            "\1\73\10\uffff\1\72",
            "\1\144\5\uffff\1\142\5\uffff\1\146\1\143\1\uffff\1\145",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\73",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\163\1\162",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\12\uffff\1\73\10\uffff\1\72",
            "\1\u0083\12\uffff\1\73\10\uffff\1\72",
            "\1\73\10\uffff\1\72",
            "\1\u0084",
            "\1\u0085",
            "\1\u0087\5\uffff\1\u0086\5\uffff\1\u008a\1\u0088\1\uffff\1\u0089",
            "\1\u008d\5\uffff\1\u008c\5\uffff\1\u008f\1\u008b\1\uffff\1\u008e",
            "\1\u0090",
            "\1\125\1\73\10\uffff\1\72",
            "\1\u0091",
            "\1\u0092",
            "\1\u0092",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u0098",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009d",
            "\1\116",
            "\1\114\5\uffff\1\116",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00af\5\uffff\1\u00ad\5\uffff\1\u00ab\1\u00ae\1\uffff\1\u00ac",
            "\1\73\10\uffff\1\72",
            "\1\73\10\uffff\1\72",
            "\1\u00b0",
            "\1\73\10\uffff\1\72",
            "\1\u00b1",
            "\1\u0098",
            "\1\u00b2",
            "\1\73\10\uffff\1\72",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u009d",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9\1\73\10\uffff\1\72",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00bb",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c0",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7\5\uffff\1\u00ca\5\uffff\1\u00c9\1\u00cb\1\uffff\1\u00c8",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00d0\5\uffff\1\u00d3\5\uffff\1\u00d2\1\u00cf\1\uffff\1\u00d1",
            "\1\u00d4",
            "\1\u00d5\5\uffff\1\u00d6\5\uffff\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00bb",
            "\1\u00db\10\uffff\1\76",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00c0",
            "\1\u00df\10\uffff\1\77",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e1",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff\10\uffff\1\124",
            "\1\u0100",
            "\1\u00e1",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0102",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010a",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\73\10\uffff\1\72",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u0092",
            "\1\u011c",
            "\1\u0102",
            "\1\u011d",
            "\1\u011e",
            "\1\u0098",
            "\1\u011f\10\uffff\1\u0098",
            "\1\u0120",
            "\1\141\10\uffff\1\73\10\uffff\1\72",
            "\1\u0121",
            "\1\u010a",
            "\1\u009d",
            "\1\u0122\10\uffff\1\73\10\uffff\1\72",
            "\1\u0122\10\uffff\1\73\10\uffff\1\72",
            "\1\u0122\10\uffff\1\73\10\uffff\1\72",
            "\1\u0123\10\uffff\1\u009d",
            "\1\u0124",
            "\1\u0125\10\uffff\1\73\10\uffff\1\72",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129\10\uffff\1\73\10\uffff\1\72",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130\10\uffff\1\73\10\uffff\1\72",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134\5\uffff\1\u0135\5\uffff\1\u0136",
            "\1\u0137",
            "\1\u00b9\1\73\10\uffff\1\72",
            "\1\u0138",
            "\1\u00bb",
            "\1\u0139\10\uffff\1\u00bb",
            "\1\u00c0",
            "\1\u013a",
            "\1\u013b\10\uffff\1\u00c0",
            "\1\u013c\10\uffff\1\73\10\uffff\1\72",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e\10\uffff\1\u00e1",
            "\1\u00e1",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0098",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u009d",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d\10\uffff\1\u0102",
            "\1\u0102",
            "\1\73\10\uffff\1\72",
            "\1\u010a",
            "\1\u015e\10\uffff\1\u010a",
            "\1\u0122\10\uffff\1\73\10\uffff\1\72",
            "\1\u0122\10\uffff\1\73\10\uffff\1\72",
            "\1\u0122\10\uffff\1\73\10\uffff\1\72",
            "\1\u015f\1\u0160",
            "\1\u00bb",
            "\1\u0161\1\u0162",
            "\1\u00c0",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b\1\u016c",
            "\1\u00e1",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170\116\uffff\1\u0171",
            "\1\u0172",
            "\1\u0174\116\uffff\1\u0173",
            "\1\u0175",
            "\1\u0176",
            "\1\u0102",
            "\1\u010a",
            "\1\u0177",
            "\1\u0178",
            "\1\u017a\1\u0179",
            "\1\u017b",
            "\1\u017d\1\u017c",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180\116\uffff\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0182",
            "\1\u0182",
            "\1\u0184",
            "\1\u0184",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0189\1\u0188",
            "\1\u018a\10\uffff\1\73\10\uffff\1\72",
            "\1\u018b",
            "\1\u018c\10\uffff\1\73\10\uffff\1\72",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u018e",
            "\1\u018e",
            "\1\u0190",
            "\1\u0195\5\uffff\1\u0193\5\uffff\1\u0191\1\u0194\1\uffff\1\u0192",
            "\1\u0196",
            "\1\u0197\5\uffff\1\u019a\5\uffff\1\u0199\1\u019b\1\uffff\1\u0198",
            "\1\u019c\10\uffff\1\73\10\uffff\1\72",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ad\5\uffff\1\u01ac\5\uffff\1\u01af\1\u01ab\1\uffff\1\u01ae",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b1",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b6",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0\1\u01c1",
            "\1\u0182",
            "\1\u01c2",
            "\1\u01b1",
            "\1\u01c3",
            "\1\u01c4\1\u01c5",
            "\1\u0184",
            "\1\u01c6",
            "\1\u01b6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cb",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5\1\u01d6",
            "\1\u01d7",
            "\1\u01cb",
            "\1\u018e",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da\116\uffff\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01e0\116\uffff\1\u01df",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01ea\1\u01e9",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ef\1\u01ee",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4\116\uffff\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01f8",
            "\1\u01f8",
            "\1\u01fa\10\uffff\1\u01b1",
            "\1\u01b1",
            "\1\u01fb",
            "\1\u01fb",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd\10\uffff\1\u01b6",
            "\1\u01b6",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0201\1\u0200",
            "\1\u0202",
            "\1\u0203",
            "\1\u018a\10\uffff\1\73\10\uffff\1\72",
            "\1\u0204",
            "\1\u0205",
            "\1\u018c\10\uffff\1\73\10\uffff\1\72",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u0208",
            "\1\u0208",
            "\1\u01cb",
            "\1\u020a\10\uffff\1\u01cb",
            "\1\u020f\5\uffff\1\u020d\5\uffff\1\u020c\1\u020e\1\uffff\1\u020b",
            "\1\u0210",
            "\1\u0211\5\uffff\1\u0214\5\uffff\1\u0213\1\u0215\1\uffff\1\u0212",
            "\1\u0216",
            "\1\u019c\10\uffff\1\73\10\uffff\1\72",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u01b1",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u01b6",
            "\1\u0225\5\uffff\1\u0223\5\uffff\1\u0227\1\u0224\1\uffff\1\u0226",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022a",
            "\1\u022d",
            "\1\u022e",
            "\1\u022d",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u01cb",
            "\1\u0236",
            "\1\u01f8",
            "\1\u022a",
            "\1\u0237",
            "\1\u01fb",
            "\1\u0238",
            "\1\u022d",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023c",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u023c",
            "\1\u0242",
            "\1\u0208",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250\10\uffff\1\u022a",
            "\1\u022a",
            "\1\u0251\10\uffff\1\u022d",
            "\1\u022d",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u023c",
            "\1\u0256\10\uffff\1\u023c",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u022a",
            "\1\u022d",
            "\1\u025a",
            "\1\u023c"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 259:3: ( (lv_tasks_2_0= ruleTask ) )+";
        }
    }
    static final String dfa_8s = "\25\uffff";
    static final String dfa_9s = "\1\121\1\132\1\33\5\uffff\1\156\1\133\13\uffff";
    static final String dfa_10s = "\1\175\1\136\1\u0082\5\uffff\1\177\1\135\13\uffff";
    static final String dfa_11s = "\3\uffff\1\10\1\11\1\12\1\13\1\14\2\uffff\1\3\1\5\1\4\1\17\1\7\1\20\1\6\1\16\1\15\1\1\1\2";
    static final String dfa_12s = "\25\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\6\uffff\1\7\1\1\7\uffff\1\3\1\uffff\1\4\1\5\1\6\27\uffff\1\10",
            "\1\11\3\uffff\1\12",
            "\1\14\66\uffff\1\13\1\uffff\1\20\2\uffff\1\16\47\uffff\1\15\2\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "\1\22\20\uffff\1\21",
            "\1\23\1\uffff\1\24",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "930:5: (lv_kind_2_1= ruleSendEmail | lv_kind_2_2= ruleSendSMS | lv_kind_2_3= ruleSendSnailMail | lv_kind_2_4= ruleRetrieveDocument | lv_kind_2_5= ruleRetrieveInvoices | lv_kind_2_6= ruleRetrieveFullAddress | lv_kind_2_7= ruleRetrievePersons | lv_kind_2_8= ruleCallPerson | lv_kind_2_9= ruleAddPerson | lv_kind_2_10= ruleDeletePerson | lv_kind_2_11= ruleUpdatePerson | lv_kind_2_12= ruleSearchPerson | lv_kind_2_13= ruleCreateInvoiceWithProducts | lv_kind_2_14= ruleCreateProduct | lv_kind_2_15= ruleRetrieveProductInformation | lv_kind_2_16= ruleRetrieveOrderStatusByInvoice )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000C834002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x2A9000800A040000L,0x110400100001A161L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x2000003A03020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0007000008000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000FC0000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000F000008000070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1000000002000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2A90008008040000L,0x110400100001A161L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000008208000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x00E0000000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x0C00000000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});

}