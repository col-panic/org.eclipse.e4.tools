package org.eclipse.e4.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.e4.services.CSSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_WS", "RULE_IDENT", "RULE_HEXDIGITS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "','", "'{'", "';'", "'}'", "'@import'", "':'", "'*'", "'!important'", "'/'", "'('", "')'", "'url'", "'\\\\'", "'.'", "'%'", "'em'", "'ex'", "'px'", "'cm'", "'mm'", "'in'", "'pt'", "'pc'", "'deg'", "'rad'", "'grad'", "'ms'", "'s'", "'hz'", "'khz'", "'#'", "'+'", "'>'", "'-'"
    };
    public static final int RULE_ID=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_IDENT=6;
    public static final int T__39=39;
    public static final int RULE_HEXDIGITS=7;
    public static final int RULE_WS=5;

    // delegates
    // delegators


        public InternalCSSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCSSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCSSParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g"; }



     	private CSSGrammarAccess grammarAccess;
     	
        public InternalCSSParser(TokenStream input, CSSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "stylesheet";	
       	}
       	
       	@Override
       	protected CSSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulestylesheet"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:67:1: entryRulestylesheet returns [EObject current=null] : iv_rulestylesheet= rulestylesheet EOF ;
    public final EObject entryRulestylesheet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestylesheet = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:68:2: (iv_rulestylesheet= rulestylesheet EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:69:2: iv_rulestylesheet= rulestylesheet EOF
            {
             newCompositeNode(grammarAccess.getStylesheetRule()); 
            pushFollow(FOLLOW_rulestylesheet_in_entryRulestylesheet75);
            iv_rulestylesheet=rulestylesheet();

            state._fsp--;

             current =iv_rulestylesheet; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestylesheet85); 

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
    // $ANTLR end "entryRulestylesheet"


    // $ANTLR start "rulestylesheet"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:76:1: rulestylesheet returns [EObject current=null] : ( ( (lv_location_0_0= RULE_STRING ) )? ( (lv_importName_1_0= rulecss_import ) )* ( (lv_ruleset_2_0= ruleRules ) )* ) ;
    public final EObject rulestylesheet() throws RecognitionException {
        EObject current = null;

        Token lv_location_0_0=null;
        EObject lv_importName_1_0 = null;

        EObject lv_ruleset_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:79:28: ( ( ( (lv_location_0_0= RULE_STRING ) )? ( (lv_importName_1_0= rulecss_import ) )* ( (lv_ruleset_2_0= ruleRules ) )* ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:80:1: ( ( (lv_location_0_0= RULE_STRING ) )? ( (lv_importName_1_0= rulecss_import ) )* ( (lv_ruleset_2_0= ruleRules ) )* )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:80:1: ( ( (lv_location_0_0= RULE_STRING ) )? ( (lv_importName_1_0= rulecss_import ) )* ( (lv_ruleset_2_0= ruleRules ) )* )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:80:2: ( (lv_location_0_0= RULE_STRING ) )? ( (lv_importName_1_0= rulecss_import ) )* ( (lv_ruleset_2_0= ruleRules ) )*
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:80:2: ( (lv_location_0_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:81:1: (lv_location_0_0= RULE_STRING )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:81:1: (lv_location_0_0= RULE_STRING )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:82:3: lv_location_0_0= RULE_STRING
                    {
                    lv_location_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulestylesheet127); 

                    			newLeafNode(lv_location_0_0, grammarAccess.getStylesheetAccess().getLocationSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStylesheetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"location",
                            		lv_location_0_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:98:3: ( (lv_importName_1_0= rulecss_import ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:99:1: (lv_importName_1_0= rulecss_import )
            	    {
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:99:1: (lv_importName_1_0= rulecss_import )
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:100:3: lv_importName_1_0= rulecss_import
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getImportNameCss_importParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecss_import_in_rulestylesheet154);
            	    lv_importName_1_0=rulecss_import();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"importName",
            	            		lv_importName_1_0, 
            	            		"css_import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:116:3: ( (lv_ruleset_2_0= ruleRules ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_IDENT||LA3_0==19||LA3_0==26||LA3_0==43) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:117:1: (lv_ruleset_2_0= ruleRules )
            	    {
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:117:1: (lv_ruleset_2_0= ruleRules )
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:118:3: lv_ruleset_2_0= ruleRules
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getRulesetRulesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRules_in_rulestylesheet176);
            	    lv_ruleset_2_0=ruleRules();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ruleset",
            	            		lv_ruleset_2_0, 
            	            		"Rules");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "rulestylesheet"


    // $ANTLR start "entryRuleRules"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:142:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:143:2: (iv_ruleRules= ruleRules EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:144:2: iv_ruleRules= ruleRules EOF
            {
             newCompositeNode(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_ruleRules_in_entryRuleRules213);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRules223); 

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
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:151:1: ruleRules returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleselector ) ) (otherlv_1= ',' ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( (lv_declarations_4_0= ruledeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruledeclaration ) )? )* otherlv_7= '}' ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_selectors_0_0 = null;

        EObject lv_selectors_2_0 = null;

        EObject lv_declarations_4_0 = null;

        EObject lv_declarations_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:154:28: ( ( ( (lv_selectors_0_0= ruleselector ) ) (otherlv_1= ',' ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( (lv_declarations_4_0= ruledeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruledeclaration ) )? )* otherlv_7= '}' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:155:1: ( ( (lv_selectors_0_0= ruleselector ) ) (otherlv_1= ',' ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( (lv_declarations_4_0= ruledeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruledeclaration ) )? )* otherlv_7= '}' )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:155:1: ( ( (lv_selectors_0_0= ruleselector ) ) (otherlv_1= ',' ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( (lv_declarations_4_0= ruledeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruledeclaration ) )? )* otherlv_7= '}' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:155:2: ( (lv_selectors_0_0= ruleselector ) ) (otherlv_1= ',' ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( (lv_declarations_4_0= ruledeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruledeclaration ) )? )* otherlv_7= '}'
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:155:2: ( (lv_selectors_0_0= ruleselector ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:156:1: (lv_selectors_0_0= ruleselector )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:156:1: (lv_selectors_0_0= ruleselector )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:157:3: lv_selectors_0_0= ruleselector
            {
             
            	        newCompositeNode(grammarAccess.getRulesAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleselector_in_ruleRules269);
            lv_selectors_0_0=ruleselector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRulesRule());
            	        }
                   		add(
                   			current, 
                   			"selectors",
                    		lv_selectors_0_0, 
                    		"selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:173:2: (otherlv_1= ',' ( (lv_selectors_2_0= ruleselector ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:173:4: otherlv_1= ',' ( (lv_selectors_2_0= ruleselector ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleRules282); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRulesAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:177:1: ( (lv_selectors_2_0= ruleselector ) )
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:178:1: (lv_selectors_2_0= ruleselector )
            	    {
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:178:1: (lv_selectors_2_0= ruleselector )
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:179:3: lv_selectors_2_0= ruleselector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRulesAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleselector_in_ruleRules303);
            	    lv_selectors_2_0=ruleselector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRulesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"selectors",
            	            		lv_selectors_2_0, 
            	            		"selector");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleRules317); 

                	newLeafNode(otherlv_3, grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:199:1: ( (lv_declarations_4_0= ruledeclaration ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_IDENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:200:1: (lv_declarations_4_0= ruledeclaration )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:200:1: (lv_declarations_4_0= ruledeclaration )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:201:3: lv_declarations_4_0= ruledeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getRulesAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruledeclaration_in_ruleRules338);
                    lv_declarations_4_0=ruledeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRulesRule());
                    	        }
                           		add(
                           			current, 
                           			"declarations",
                            		lv_declarations_4_0, 
                            		"declaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:217:3: (otherlv_5= ';' ( (lv_declarations_6_0= ruledeclaration ) )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:217:5: otherlv_5= ';' ( (lv_declarations_6_0= ruledeclaration ) )?
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleRules352); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRulesAccess().getSemicolonKeyword_4_0());
            	        
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:221:1: ( (lv_declarations_6_0= ruledeclaration ) )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_IDENT) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:222:1: (lv_declarations_6_0= ruledeclaration )
            	            {
            	            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:222:1: (lv_declarations_6_0= ruledeclaration )
            	            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:223:3: lv_declarations_6_0= ruledeclaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getRulesAccess().getDeclarationsDeclarationParserRuleCall_4_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruledeclaration_in_ruleRules373);
            	            lv_declarations_6_0=ruledeclaration();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getRulesRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"declarations",
            	                    		lv_declarations_6_0, 
            	                    		"declaration");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleRules388); 

                	newLeafNode(otherlv_7, grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRulecss_import"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:251:1: entryRulecss_import returns [EObject current=null] : iv_rulecss_import= rulecss_import EOF ;
    public final EObject entryRulecss_import() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_import = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:252:2: (iv_rulecss_import= rulecss_import EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:253:2: iv_rulecss_import= rulecss_import EOF
            {
             newCompositeNode(grammarAccess.getCss_importRule()); 
            pushFollow(FOLLOW_rulecss_import_in_entryRulecss_import424);
            iv_rulecss_import=rulecss_import();

            state._fsp--;

             current =iv_rulecss_import; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_import434); 

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
    // $ANTLR end "entryRulecss_import"


    // $ANTLR start "rulecss_import"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:260:1: rulecss_import returns [EObject current=null] : (otherlv_0= '@import' ( ( (lv_string_name_1_0= RULE_STRING ) ) | this_URI_2= ruleURI ) otherlv_3= ';' ) ;
    public final EObject rulecss_import() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_string_name_1_0=null;
        Token otherlv_3=null;
        EObject this_URI_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:263:28: ( (otherlv_0= '@import' ( ( (lv_string_name_1_0= RULE_STRING ) ) | this_URI_2= ruleURI ) otherlv_3= ';' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:264:1: (otherlv_0= '@import' ( ( (lv_string_name_1_0= RULE_STRING ) ) | this_URI_2= ruleURI ) otherlv_3= ';' )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:264:1: (otherlv_0= '@import' ( ( (lv_string_name_1_0= RULE_STRING ) ) | this_URI_2= ruleURI ) otherlv_3= ';' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:264:3: otherlv_0= '@import' ( ( (lv_string_name_1_0= RULE_STRING ) ) | this_URI_2= ruleURI ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulecss_import471); 

                	newLeafNode(otherlv_0, grammarAccess.getCss_importAccess().getImportKeyword_0());
                
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:268:1: ( ( (lv_string_name_1_0= RULE_STRING ) ) | this_URI_2= ruleURI )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:268:2: ( (lv_string_name_1_0= RULE_STRING ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:268:2: ( (lv_string_name_1_0= RULE_STRING ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:269:1: (lv_string_name_1_0= RULE_STRING )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:269:1: (lv_string_name_1_0= RULE_STRING )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:270:3: lv_string_name_1_0= RULE_STRING
                    {
                    lv_string_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulecss_import489); 

                    			newLeafNode(lv_string_name_1_0, grammarAccess.getCss_importAccess().getString_nameSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCss_importRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string_name",
                            		lv_string_name_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:288:5: this_URI_2= ruleURI
                    {
                     
                            newCompositeNode(grammarAccess.getCss_importAccess().getURIParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleURI_in_rulecss_import522);
                    this_URI_2=ruleURI();

                    state._fsp--;

                     
                            current = this_URI_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulecss_import534); 

                	newLeafNode(otherlv_3, grammarAccess.getCss_importAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "rulecss_import"


    // $ANTLR start "entryRuleselector"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:308:1: entryRuleselector returns [EObject current=null] : iv_ruleselector= ruleselector EOF ;
    public final EObject entryRuleselector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleselector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:312:2: (iv_ruleselector= ruleselector EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:313:2: iv_ruleselector= ruleselector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector576);
            iv_ruleselector=ruleselector();

            state._fsp--;

             current =iv_ruleselector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector586); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleselector"


    // $ANTLR start "ruleselector"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:323:1: ruleselector returns [EObject current=null] : ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )? ) ;
    public final EObject ruleselector() throws RecognitionException {
        EObject current = null;

        Token this_WS_3=null;
        EObject lv_simpleselectors_0_0 = null;

        AntlrDatatypeRuleToken lv_combinator_1_0 = null;

        EObject lv_selector_2_0 = null;

        AntlrDatatypeRuleToken lv_combinator_4_0 = null;

        EObject lv_selector_5_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:327:28: ( ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )? ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:328:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )? )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:328:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )? )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:328:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )?
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:328:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:329:1: (lv_simpleselectors_0_0= rulesimple_selector )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:329:1: (lv_simpleselectors_0_0= rulesimple_selector )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:330:3: lv_simpleselectors_0_0= rulesimple_selector
            {
             
            	        newCompositeNode(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulesimple_selector_in_ruleselector636);
            lv_simpleselectors_0_0=rulesimple_selector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectorRule());
            	        }
                   		set(
                   			current, 
                   			"simpleselectors",
                    		lv_simpleselectors_0_0, 
                    		"simple_selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:346:2: ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=44 && LA12_0<=45)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_WS) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:346:3: ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:346:3: ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:346:4: ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:346:4: ( (lv_combinator_1_0= rulecombinator ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:347:1: (lv_combinator_1_0= rulecombinator )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:347:1: (lv_combinator_1_0= rulecombinator )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:348:3: lv_combinator_1_0= rulecombinator
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecombinator_in_ruleselector659);
                    lv_combinator_1_0=rulecombinator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                    	        }
                           		set(
                           			current, 
                           			"combinator",
                            		lv_combinator_1_0, 
                            		"combinator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:364:2: ( (lv_selector_2_0= ruleselector ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:365:1: (lv_selector_2_0= ruleselector )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:365:1: (lv_selector_2_0= ruleselector )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:366:3: lv_selector_2_0= ruleselector
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleselector_in_ruleselector680);
                    lv_selector_2_0=ruleselector();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                    	        }
                           		set(
                           			current, 
                           			"selector",
                            		lv_selector_2_0, 
                            		"selector");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:383:6: ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:383:6: ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:383:7: (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )?
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:383:7: (this_WS_3= RULE_WS )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_WS) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:383:8: this_WS_3= RULE_WS
                    	    {
                    	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector700); 
                    	     
                    	        newLeafNode(this_WS_3, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
                    	        

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

                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:387:3: ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_IDENT||LA11_0==19||LA11_0==26||(LA11_0>=43 && LA11_0<=45)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:387:4: ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) )
                            {
                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:387:4: ( (lv_combinator_4_0= rulecombinator ) )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( ((LA10_0>=44 && LA10_0<=45)) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:388:1: (lv_combinator_4_0= rulecombinator )
                                    {
                                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:388:1: (lv_combinator_4_0= rulecombinator )
                                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:389:3: lv_combinator_4_0= rulecombinator
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_rulecombinator_in_ruleselector723);
                                    lv_combinator_4_0=rulecombinator();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"combinator",
                                            		lv_combinator_4_0, 
                                            		"combinator");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:405:3: ( (lv_selector_5_0= ruleselector ) )
                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:406:1: (lv_selector_5_0= ruleselector )
                            {
                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:406:1: (lv_selector_5_0= ruleselector )
                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:407:3: lv_selector_5_0= ruleselector
                            {
                             
                            	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleselector_in_ruleselector745);
                            lv_selector_5_0=ruleselector();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"selector",
                                    		lv_selector_5_0, 
                                    		"selector");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleselector"


    // $ANTLR start "entryRulesimple_selector"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:434:1: entryRulesimple_selector returns [EObject current=null] : iv_rulesimple_selector= rulesimple_selector EOF ;
    public final EObject entryRulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_selector = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:435:2: (iv_rulesimple_selector= rulesimple_selector EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:436:2: iv_rulesimple_selector= rulesimple_selector EOF
            {
             newCompositeNode(grammarAccess.getSimple_selectorRule()); 
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector790);
            iv_rulesimple_selector=rulesimple_selector();

            state._fsp--;

             current =iv_rulesimple_selector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector800); 

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
    // $ANTLR end "entryRulesimple_selector"


    // $ANTLR start "rulesimple_selector"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:443:1: rulesimple_selector returns [EObject current=null] : ( ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_id_1_0= rulecss_hash_class ) )* ( (lv_pseudo_2_0= rulepseudo ) )* ) | ( (lv_id_3_0= rulecss_hash_class ) )+ ) ;
    public final EObject rulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_id_1_0 = null;

        EObject lv_pseudo_2_0 = null;

        EObject lv_id_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:446:28: ( ( ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_id_1_0= rulecss_hash_class ) )* ( (lv_pseudo_2_0= rulepseudo ) )* ) | ( (lv_id_3_0= rulecss_hash_class ) )+ ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:447:1: ( ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_id_1_0= rulecss_hash_class ) )* ( (lv_pseudo_2_0= rulepseudo ) )* ) | ( (lv_id_3_0= rulecss_hash_class ) )+ )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:447:1: ( ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_id_1_0= rulecss_hash_class ) )* ( (lv_pseudo_2_0= rulepseudo ) )* ) | ( (lv_id_3_0= rulecss_hash_class ) )+ )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_IDENT||LA16_0==19) ) {
                alt16=1;
            }
            else if ( (LA16_0==26||LA16_0==43) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:447:2: ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_id_1_0= rulecss_hash_class ) )* ( (lv_pseudo_2_0= rulepseudo ) )* )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:447:2: ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_id_1_0= rulecss_hash_class ) )* ( (lv_pseudo_2_0= rulepseudo ) )* )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:447:3: ( (lv_element_0_0= ruleelement_name ) ) ( (lv_id_1_0= rulecss_hash_class ) )* ( (lv_pseudo_2_0= rulepseudo ) )*
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:447:3: ( (lv_element_0_0= ruleelement_name ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:448:1: (lv_element_0_0= ruleelement_name )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:448:1: (lv_element_0_0= ruleelement_name )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:449:3: lv_element_0_0= ruleelement_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getElementElement_nameParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleelement_name_in_rulesimple_selector847);
                    lv_element_0_0=ruleelement_name();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_0_0, 
                            		"element_name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:465:2: ( (lv_id_1_0= rulecss_hash_class ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==26||LA13_0==43) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:466:1: (lv_id_1_0= rulecss_hash_class )
                    	    {
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:466:1: (lv_id_1_0= rulecss_hash_class )
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:467:3: lv_id_1_0= rulecss_hash_class
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getIdCss_hash_classParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulecss_hash_class_in_rulesimple_selector868);
                    	    lv_id_1_0=rulecss_hash_class();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"id",
                    	            		lv_id_1_0, 
                    	            		"css_hash_class");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:483:3: ( (lv_pseudo_2_0= rulepseudo ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_IDENT||LA14_0==18) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:484:1: (lv_pseudo_2_0= rulepseudo )
                    	    {
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:484:1: (lv_pseudo_2_0= rulepseudo )
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:485:3: lv_pseudo_2_0= rulepseudo
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getPseudoPseudoParserRuleCall_0_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulepseudo_in_rulesimple_selector890);
                    	    lv_pseudo_2_0=rulepseudo();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"pseudo",
                    	            		lv_pseudo_2_0, 
                    	            		"pseudo");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:502:6: ( (lv_id_3_0= rulecss_hash_class ) )+
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:502:6: ( (lv_id_3_0= rulecss_hash_class ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==26||LA15_0==43) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:503:1: (lv_id_3_0= rulecss_hash_class )
                    	    {
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:503:1: (lv_id_3_0= rulecss_hash_class )
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:504:3: lv_id_3_0= rulecss_hash_class
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getIdCss_hash_classParserRuleCall_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulecss_hash_class_in_rulesimple_selector919);
                    	    lv_id_3_0=rulecss_hash_class();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"id",
                    	            		lv_id_3_0, 
                    	            		"css_hash_class");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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
    // $ANTLR end "rulesimple_selector"


    // $ANTLR start "entryRulepseudo"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:528:1: entryRulepseudo returns [EObject current=null] : iv_rulepseudo= rulepseudo EOF ;
    public final EObject entryRulepseudo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepseudo = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:529:2: (iv_rulepseudo= rulepseudo EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:530:2: iv_rulepseudo= rulepseudo EOF
            {
             newCompositeNode(grammarAccess.getPseudoRule()); 
            pushFollow(FOLLOW_rulepseudo_in_entryRulepseudo956);
            iv_rulepseudo=rulepseudo();

            state._fsp--;

             current =iv_rulepseudo; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepseudo966); 

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
    // $ANTLR end "entryRulepseudo"


    // $ANTLR start "rulepseudo"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:537:1: rulepseudo returns [EObject current=null] : ( (otherlv_0= ':' ( (lv_name_1_0= RULE_IDENT ) ) ) | ( ( (lv_function_2_0= rulefunction ) ) ( (lv_name_3_0= RULE_IDENT ) )? ) ) ;
    public final EObject rulepseudo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_name_3_0=null;
        EObject lv_function_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:540:28: ( ( (otherlv_0= ':' ( (lv_name_1_0= RULE_IDENT ) ) ) | ( ( (lv_function_2_0= rulefunction ) ) ( (lv_name_3_0= RULE_IDENT ) )? ) ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:541:1: ( (otherlv_0= ':' ( (lv_name_1_0= RULE_IDENT ) ) ) | ( ( (lv_function_2_0= rulefunction ) ) ( (lv_name_3_0= RULE_IDENT ) )? ) )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:541:1: ( (otherlv_0= ':' ( (lv_name_1_0= RULE_IDENT ) ) ) | ( ( (lv_function_2_0= rulefunction ) ) ( (lv_name_3_0= RULE_IDENT ) )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_IDENT) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:541:2: (otherlv_0= ':' ( (lv_name_1_0= RULE_IDENT ) ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:541:2: (otherlv_0= ':' ( (lv_name_1_0= RULE_IDENT ) ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:541:4: otherlv_0= ':' ( (lv_name_1_0= RULE_IDENT ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulepseudo1004); 

                        	newLeafNode(otherlv_0, grammarAccess.getPseudoAccess().getColonKeyword_0_0());
                        
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:545:1: ( (lv_name_1_0= RULE_IDENT ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:546:1: (lv_name_1_0= RULE_IDENT )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:546:1: (lv_name_1_0= RULE_IDENT )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:547:3: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulepseudo1021); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getPseudoAccess().getNameIdentTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPseudoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ident");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:564:6: ( ( (lv_function_2_0= rulefunction ) ) ( (lv_name_3_0= RULE_IDENT ) )? )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:564:6: ( ( (lv_function_2_0= rulefunction ) ) ( (lv_name_3_0= RULE_IDENT ) )? )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:564:7: ( (lv_function_2_0= rulefunction ) ) ( (lv_name_3_0= RULE_IDENT ) )?
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:564:7: ( (lv_function_2_0= rulefunction ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:565:1: (lv_function_2_0= rulefunction )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:565:1: (lv_function_2_0= rulefunction )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:566:3: lv_function_2_0= rulefunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getPseudoAccess().getFunctionFunctionParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_in_rulepseudo1055);
                    lv_function_2_0=rulefunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPseudoRule());
                    	        }
                           		set(
                           			current, 
                           			"function",
                            		lv_function_2_0, 
                            		"function");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:582:2: ( (lv_name_3_0= RULE_IDENT ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_IDENT) ) {
                        int LA17_1 = input.LA(2);

                        if ( (LA17_1==EOF||(LA17_1>=RULE_WS && LA17_1<=RULE_IDENT)||(LA17_1>=13 && LA17_1<=14)||LA17_1==18||(LA17_1>=44 && LA17_1<=45)) ) {
                            alt17=1;
                        }
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:583:1: (lv_name_3_0= RULE_IDENT )
                            {
                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:583:1: (lv_name_3_0= RULE_IDENT )
                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:584:3: lv_name_3_0= RULE_IDENT
                            {
                            lv_name_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulepseudo1072); 

                            			newLeafNode(lv_name_3_0, grammarAccess.getPseudoAccess().getNameIdentTerminalRuleCall_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPseudoRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_3_0, 
                                    		"ident");
                            	    

                            }


                            }
                            break;

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
    // $ANTLR end "rulepseudo"


    // $ANTLR start "entryRuleelement_name"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:608:1: entryRuleelement_name returns [EObject current=null] : iv_ruleelement_name= ruleelement_name EOF ;
    public final EObject entryRuleelement_name() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelement_name = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:609:2: (iv_ruleelement_name= ruleelement_name EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:610:2: iv_ruleelement_name= ruleelement_name EOF
            {
             newCompositeNode(grammarAccess.getElement_nameRule()); 
            pushFollow(FOLLOW_ruleelement_name_in_entryRuleelement_name1115);
            iv_ruleelement_name=ruleelement_name();

            state._fsp--;

             current =iv_ruleelement_name; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement_name1125); 

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
    // $ANTLR end "entryRuleelement_name"


    // $ANTLR start "ruleelement_name"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:617:1: ruleelement_name returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) | ( (lv_name_1_0= '*' ) ) ) ;
    public final EObject ruleelement_name() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:620:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) | ( (lv_name_1_0= '*' ) ) ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:621:1: ( ( (lv_name_0_0= RULE_IDENT ) ) | ( (lv_name_1_0= '*' ) ) )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:621:1: ( ( (lv_name_0_0= RULE_IDENT ) ) | ( (lv_name_1_0= '*' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_IDENT) ) {
                alt19=1;
            }
            else if ( (LA19_0==19) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:621:2: ( (lv_name_0_0= RULE_IDENT ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:621:2: ( (lv_name_0_0= RULE_IDENT ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:622:1: (lv_name_0_0= RULE_IDENT )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:622:1: (lv_name_0_0= RULE_IDENT )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:623:3: lv_name_0_0= RULE_IDENT
                    {
                    lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleelement_name1167); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getElement_nameAccess().getNameIdentTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getElement_nameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ident");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:640:6: ( (lv_name_1_0= '*' ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:640:6: ( (lv_name_1_0= '*' ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:641:1: (lv_name_1_0= '*' )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:641:1: (lv_name_1_0= '*' )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:642:3: lv_name_1_0= '*'
                    {
                    lv_name_1_0=(Token)match(input,19,FOLLOW_19_in_ruleelement_name1196); 

                            newLeafNode(lv_name_1_0, grammarAccess.getElement_nameAccess().getNameAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getElement_nameRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "*");
                    	    

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
    // $ANTLR end "ruleelement_name"


    // $ANTLR start "entryRuledeclaration"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:663:1: entryRuledeclaration returns [EObject current=null] : iv_ruledeclaration= ruledeclaration EOF ;
    public final EObject entryRuledeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:664:2: (iv_ruledeclaration= ruledeclaration EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:665:2: iv_ruledeclaration= ruledeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruledeclaration_in_entryRuledeclaration1245);
            iv_ruledeclaration=ruledeclaration();

            state._fsp--;

             current =iv_ruledeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration1255); 

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
    // $ANTLR end "entryRuledeclaration"


    // $ANTLR start "ruledeclaration"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:672:1: ruledeclaration returns [EObject current=null] : ( ( (lv_property_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleexpr ) ) ( (lv_priority_3_0= '!important' ) )? ) ;
    public final EObject ruledeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        Token otherlv_1=null;
        Token lv_priority_3_0=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:675:28: ( ( ( (lv_property_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleexpr ) ) ( (lv_priority_3_0= '!important' ) )? ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:676:1: ( ( (lv_property_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleexpr ) ) ( (lv_priority_3_0= '!important' ) )? )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:676:1: ( ( (lv_property_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleexpr ) ) ( (lv_priority_3_0= '!important' ) )? )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:676:2: ( (lv_property_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleexpr ) ) ( (lv_priority_3_0= '!important' ) )?
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:676:2: ( (lv_property_0_0= RULE_IDENT ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:677:1: (lv_property_0_0= RULE_IDENT )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:677:1: (lv_property_0_0= RULE_IDENT )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:678:3: lv_property_0_0= RULE_IDENT
            {
            lv_property_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruledeclaration1297); 

            			newLeafNode(lv_property_0_0, grammarAccess.getDeclarationAccess().getPropertyIdentTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"property",
                    		lv_property_0_0, 
                    		"ident");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruledeclaration1314); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getColonKeyword_1());
                
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:698:1: ( (lv_expr_2_0= ruleexpr ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:699:1: (lv_expr_2_0= ruleexpr )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:699:1: (lv_expr_2_0= ruleexpr )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:700:3: lv_expr_2_0= ruleexpr
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleexpr_in_ruledeclaration1335);
            lv_expr_2_0=ruleexpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:716:2: ( (lv_priority_3_0= '!important' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:717:1: (lv_priority_3_0= '!important' )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:717:1: (lv_priority_3_0= '!important' )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:718:3: lv_priority_3_0= '!important'
                    {
                    lv_priority_3_0=(Token)match(input,20,FOLLOW_20_in_ruledeclaration1353); 

                            newLeafNode(lv_priority_3_0, grammarAccess.getDeclarationAccess().getPriorityImportantKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_3_0, "!important");
                    	    

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
    // $ANTLR end "ruledeclaration"


    // $ANTLR start "entryRuleexpr"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:739:1: entryRuleexpr returns [EObject current=null] : iv_ruleexpr= ruleexpr EOF ;
    public final EObject entryRuleexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpr = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:740:2: (iv_ruleexpr= ruleexpr EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:741:2: iv_ruleexpr= ruleexpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr1403);
            iv_ruleexpr=ruleexpr();

            state._fsp--;

             current =iv_ruleexpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr1413); 

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
    // $ANTLR end "entryRuleexpr"


    // $ANTLR start "ruleexpr"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:748:1: ruleexpr returns [EObject current=null] : ( ( (lv_term_0_0= ruleterm ) ) ( ( ( (lv_operators_1_1= '/' | lv_operators_1_2= ',' ) ) )? ( (lv_term_2_0= ruleterm ) ) )* ) ;
    public final EObject ruleexpr() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_1=null;
        Token lv_operators_1_2=null;
        EObject lv_term_0_0 = null;

        EObject lv_term_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:751:28: ( ( ( (lv_term_0_0= ruleterm ) ) ( ( ( (lv_operators_1_1= '/' | lv_operators_1_2= ',' ) ) )? ( (lv_term_2_0= ruleterm ) ) )* ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:752:1: ( ( (lv_term_0_0= ruleterm ) ) ( ( ( (lv_operators_1_1= '/' | lv_operators_1_2= ',' ) ) )? ( (lv_term_2_0= ruleterm ) ) )* )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:752:1: ( ( (lv_term_0_0= ruleterm ) ) ( ( ( (lv_operators_1_1= '/' | lv_operators_1_2= ',' ) ) )? ( (lv_term_2_0= ruleterm ) ) )* )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:752:2: ( (lv_term_0_0= ruleterm ) ) ( ( ( (lv_operators_1_1= '/' | lv_operators_1_2= ',' ) ) )? ( (lv_term_2_0= ruleterm ) ) )*
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:752:2: ( (lv_term_0_0= ruleterm ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:753:1: (lv_term_0_0= ruleterm )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:753:1: (lv_term_0_0= ruleterm )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:754:3: lv_term_0_0= ruleterm
            {
             
            	        newCompositeNode(grammarAccess.getExprAccess().getTermTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleterm_in_ruleexpr1459);
            lv_term_0_0=ruleterm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprRule());
            	        }
                   		add(
                   			current, 
                   			"term",
                    		lv_term_0_0, 
                    		"term");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:770:2: ( ( ( (lv_operators_1_1= '/' | lv_operators_1_2= ',' ) ) )? ( (lv_term_2_0= ruleterm ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING||(LA23_0>=RULE_IDENT && LA23_0<=RULE_INT)||LA23_0==13||LA23_0==21||LA23_0==24||LA23_0==44||LA23_0==46) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:770:3: ( ( (lv_operators_1_1= '/' | lv_operators_1_2= ',' ) ) )? ( (lv_term_2_0= ruleterm ) )
            	    {
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:770:3: ( ( (lv_operators_1_1= '/' | lv_operators_1_2= ',' ) ) )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==13||LA22_0==21) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:771:1: ( (lv_operators_1_1= '/' | lv_operators_1_2= ',' ) )
            	            {
            	            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:771:1: ( (lv_operators_1_1= '/' | lv_operators_1_2= ',' ) )
            	            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:772:1: (lv_operators_1_1= '/' | lv_operators_1_2= ',' )
            	            {
            	            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:772:1: (lv_operators_1_1= '/' | lv_operators_1_2= ',' )
            	            int alt21=2;
            	            int LA21_0 = input.LA(1);

            	            if ( (LA21_0==21) ) {
            	                alt21=1;
            	            }
            	            else if ( (LA21_0==13) ) {
            	                alt21=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 21, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt21) {
            	                case 1 :
            	                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:773:3: lv_operators_1_1= '/'
            	                    {
            	                    lv_operators_1_1=(Token)match(input,21,FOLLOW_21_in_ruleexpr1480); 

            	                            newLeafNode(lv_operators_1_1, grammarAccess.getExprAccess().getOperatorsSolidusKeyword_1_0_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getExprRule());
            	                    	        }
            	                           		addWithLastConsumed(current, "operators", lv_operators_1_1, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:785:8: lv_operators_1_2= ','
            	                    {
            	                    lv_operators_1_2=(Token)match(input,13,FOLLOW_13_in_ruleexpr1509); 

            	                            newLeafNode(lv_operators_1_2, grammarAccess.getExprAccess().getOperatorsCommaKeyword_1_0_0_1());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getExprRule());
            	                    	        }
            	                           		addWithLastConsumed(current, "operators", lv_operators_1_2, null);
            	                    	    

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:800:3: ( (lv_term_2_0= ruleterm ) )
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:801:1: (lv_term_2_0= ruleterm )
            	    {
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:801:1: (lv_term_2_0= ruleterm )
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:802:3: lv_term_2_0= ruleterm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAccess().getTermTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleterm_in_ruleexpr1547);
            	    lv_term_2_0=ruleterm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"term",
            	            		lv_term_2_0, 
            	            		"term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleexpr"


    // $ANTLR start "entryRuleterm"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:826:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:827:2: (iv_ruleterm= ruleterm EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:828:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm1585);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm1595); 

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
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:835:1: ruleterm returns [EObject current=null] : ( ( ( (lv_unary_0_0= ruleunary_operator ) )? ( (lv_number_1_0= ruleunary_numbers ) ) ) | ( (lv_name_2_0= RULE_STRING ) ) | ( (lv_id_3_0= RULE_IDENT ) ) | ( (lv_uri_4_0= ruleURI ) ) | ( (lv_color_5_0= RULE_HEXDIGITS ) ) | ( (lv_function_6_0= rulefunction ) ) ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_id_3_0=null;
        Token lv_color_5_0=null;
        AntlrDatatypeRuleToken lv_unary_0_0 = null;

        AntlrDatatypeRuleToken lv_number_1_0 = null;

        EObject lv_uri_4_0 = null;

        EObject lv_function_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:838:28: ( ( ( ( (lv_unary_0_0= ruleunary_operator ) )? ( (lv_number_1_0= ruleunary_numbers ) ) ) | ( (lv_name_2_0= RULE_STRING ) ) | ( (lv_id_3_0= RULE_IDENT ) ) | ( (lv_uri_4_0= ruleURI ) ) | ( (lv_color_5_0= RULE_HEXDIGITS ) ) | ( (lv_function_6_0= rulefunction ) ) ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:839:1: ( ( ( (lv_unary_0_0= ruleunary_operator ) )? ( (lv_number_1_0= ruleunary_numbers ) ) ) | ( (lv_name_2_0= RULE_STRING ) ) | ( (lv_id_3_0= RULE_IDENT ) ) | ( (lv_uri_4_0= ruleURI ) ) | ( (lv_color_5_0= RULE_HEXDIGITS ) ) | ( (lv_function_6_0= rulefunction ) ) )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:839:1: ( ( ( (lv_unary_0_0= ruleunary_operator ) )? ( (lv_number_1_0= ruleunary_numbers ) ) ) | ( (lv_name_2_0= RULE_STRING ) ) | ( (lv_id_3_0= RULE_IDENT ) ) | ( (lv_uri_4_0= ruleURI ) ) | ( (lv_color_5_0= RULE_HEXDIGITS ) ) | ( (lv_function_6_0= rulefunction ) ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 44:
            case 46:
                {
                alt25=1;
                }
                break;
            case RULE_STRING:
                {
                alt25=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==22) ) {
                    alt25=6;
                }
                else if ( (LA25_3==EOF||LA25_3==RULE_STRING||(LA25_3>=RULE_IDENT && LA25_3<=RULE_INT)||LA25_3==13||(LA25_3>=15 && LA25_3<=16)||(LA25_3>=20 && LA25_3<=21)||(LA25_3>=23 && LA25_3<=24)||LA25_3==44||LA25_3==46) ) {
                    alt25=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt25=4;
                }
                break;
            case RULE_HEXDIGITS:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:839:2: ( ( (lv_unary_0_0= ruleunary_operator ) )? ( (lv_number_1_0= ruleunary_numbers ) ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:839:2: ( ( (lv_unary_0_0= ruleunary_operator ) )? ( (lv_number_1_0= ruleunary_numbers ) ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:839:3: ( (lv_unary_0_0= ruleunary_operator ) )? ( (lv_number_1_0= ruleunary_numbers ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:839:3: ( (lv_unary_0_0= ruleunary_operator ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==44||LA24_0==46) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:840:1: (lv_unary_0_0= ruleunary_operator )
                            {
                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:840:1: (lv_unary_0_0= ruleunary_operator )
                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:841:3: lv_unary_0_0= ruleunary_operator
                            {
                             
                            	        newCompositeNode(grammarAccess.getTermAccess().getUnaryUnary_operatorParserRuleCall_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleunary_operator_in_ruleterm1642);
                            lv_unary_0_0=ruleunary_operator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTermRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"unary",
                                    		lv_unary_0_0, 
                                    		"unary_operator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:857:3: ( (lv_number_1_0= ruleunary_numbers ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:858:1: (lv_number_1_0= ruleunary_numbers )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:858:1: (lv_number_1_0= ruleunary_numbers )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:859:3: lv_number_1_0= ruleunary_numbers
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getNumberUnary_numbersParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleunary_numbers_in_ruleterm1664);
                    lv_number_1_0=ruleunary_numbers();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_1_0, 
                            		"unary_numbers");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:876:6: ( (lv_name_2_0= RULE_STRING ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:876:6: ( (lv_name_2_0= RULE_STRING ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:877:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:877:1: (lv_name_2_0= RULE_STRING )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:878:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleterm1688); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getTermAccess().getNameSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:895:6: ( (lv_id_3_0= RULE_IDENT ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:895:6: ( (lv_id_3_0= RULE_IDENT ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:896:1: (lv_id_3_0= RULE_IDENT )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:896:1: (lv_id_3_0= RULE_IDENT )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:897:3: lv_id_3_0= RULE_IDENT
                    {
                    lv_id_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleterm1716); 

                    			newLeafNode(lv_id_3_0, grammarAccess.getTermAccess().getIdIdentTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"ident");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:914:6: ( (lv_uri_4_0= ruleURI ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:914:6: ( (lv_uri_4_0= ruleURI ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:915:1: (lv_uri_4_0= ruleURI )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:915:1: (lv_uri_4_0= ruleURI )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:916:3: lv_uri_4_0= ruleURI
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getUriURIParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleURI_in_ruleterm1748);
                    lv_uri_4_0=ruleURI();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"uri",
                            		lv_uri_4_0, 
                            		"URI");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:933:6: ( (lv_color_5_0= RULE_HEXDIGITS ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:933:6: ( (lv_color_5_0= RULE_HEXDIGITS ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:934:1: (lv_color_5_0= RULE_HEXDIGITS )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:934:1: (lv_color_5_0= RULE_HEXDIGITS )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:935:3: lv_color_5_0= RULE_HEXDIGITS
                    {
                    lv_color_5_0=(Token)match(input,RULE_HEXDIGITS,FOLLOW_RULE_HEXDIGITS_in_ruleterm1771); 

                    			newLeafNode(lv_color_5_0, grammarAccess.getTermAccess().getColorHexdigitsTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"color",
                            		lv_color_5_0, 
                            		"hexdigits");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:952:6: ( (lv_function_6_0= rulefunction ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:952:6: ( (lv_function_6_0= rulefunction ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:953:1: (lv_function_6_0= rulefunction )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:953:1: (lv_function_6_0= rulefunction )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:954:3: lv_function_6_0= rulefunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_in_ruleterm1803);
                    lv_function_6_0=rulefunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"function",
                            		lv_function_6_0, 
                            		"function");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefunction"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:978:1: entryRulefunction returns [EObject current=null] : iv_rulefunction= rulefunction EOF ;
    public final EObject entryRulefunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:979:2: (iv_rulefunction= rulefunction EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:980:2: iv_rulefunction= rulefunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction1839);
            iv_rulefunction=rulefunction();

            state._fsp--;

             current =iv_rulefunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction1849); 

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
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:987:1: rulefunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_expr_2_0= ruleexpr ) ) otherlv_3= ')' ) ;
    public final EObject rulefunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:990:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_expr_2_0= ruleexpr ) ) otherlv_3= ')' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:991:1: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_expr_2_0= ruleexpr ) ) otherlv_3= ')' )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:991:1: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_expr_2_0= ruleexpr ) ) otherlv_3= ')' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:991:2: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_expr_2_0= ruleexpr ) ) otherlv_3= ')'
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:991:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:992:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:992:1: (lv_name_0_0= RULE_IDENT )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:993:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulefunction1891); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFunctionAccess().getNameIdentTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ident");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulefunction1908); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1013:1: ( (lv_expr_2_0= ruleexpr ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1014:1: (lv_expr_2_0= ruleexpr )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1014:1: (lv_expr_2_0= ruleexpr )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1015:3: lv_expr_2_0= ruleexpr
            {
             
            	        newCompositeNode(grammarAccess.getFunctionAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleexpr_in_rulefunction1929);
            lv_expr_2_0=ruleexpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulefunction1941); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRuleURI"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1043:1: entryRuleURI returns [EObject current=null] : iv_ruleURI= ruleURI EOF ;
    public final EObject entryRuleURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURI = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1044:2: (iv_ruleURI= ruleURI EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1045:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI1977);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI1987); 

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
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1052:1: ruleURI returns [EObject current=null] : (otherlv_0= 'url' otherlv_1= '(' () ( ( (lv_name_3_0= RULE_STRING ) ) | ( (otherlv_4= '\\\\' | otherlv_5= '/' ) ( (lv_id_6_0= RULE_IDENT ) ) ) )* (otherlv_7= '.' ( (lv_id_8_0= RULE_IDENT ) ) )? otherlv_9= ')' ) ;
    public final EObject ruleURI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_id_6_0=null;
        Token otherlv_7=null;
        Token lv_id_8_0=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1055:28: ( (otherlv_0= 'url' otherlv_1= '(' () ( ( (lv_name_3_0= RULE_STRING ) ) | ( (otherlv_4= '\\\\' | otherlv_5= '/' ) ( (lv_id_6_0= RULE_IDENT ) ) ) )* (otherlv_7= '.' ( (lv_id_8_0= RULE_IDENT ) ) )? otherlv_9= ')' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1056:1: (otherlv_0= 'url' otherlv_1= '(' () ( ( (lv_name_3_0= RULE_STRING ) ) | ( (otherlv_4= '\\\\' | otherlv_5= '/' ) ( (lv_id_6_0= RULE_IDENT ) ) ) )* (otherlv_7= '.' ( (lv_id_8_0= RULE_IDENT ) ) )? otherlv_9= ')' )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1056:1: (otherlv_0= 'url' otherlv_1= '(' () ( ( (lv_name_3_0= RULE_STRING ) ) | ( (otherlv_4= '\\\\' | otherlv_5= '/' ) ( (lv_id_6_0= RULE_IDENT ) ) ) )* (otherlv_7= '.' ( (lv_id_8_0= RULE_IDENT ) ) )? otherlv_9= ')' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1056:3: otherlv_0= 'url' otherlv_1= '(' () ( ( (lv_name_3_0= RULE_STRING ) ) | ( (otherlv_4= '\\\\' | otherlv_5= '/' ) ( (lv_id_6_0= RULE_IDENT ) ) ) )* (otherlv_7= '.' ( (lv_id_8_0= RULE_IDENT ) ) )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleURI2024); 

                	newLeafNode(otherlv_0, grammarAccess.getURIAccess().getUrlKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleURI2036); 

                	newLeafNode(otherlv_1, grammarAccess.getURIAccess().getLeftParenthesisKeyword_1());
                
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1064:1: ()
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1065:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getURIAccess().getURIAction_2(),
                        current);
                

            }

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1070:2: ( ( (lv_name_3_0= RULE_STRING ) ) | ( (otherlv_4= '\\\\' | otherlv_5= '/' ) ( (lv_id_6_0= RULE_IDENT ) ) ) )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_STRING) ) {
                    alt27=1;
                }
                else if ( (LA27_0==21||LA27_0==25) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1070:3: ( (lv_name_3_0= RULE_STRING ) )
            	    {
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1070:3: ( (lv_name_3_0= RULE_STRING ) )
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1071:1: (lv_name_3_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1071:1: (lv_name_3_0= RULE_STRING )
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1072:3: lv_name_3_0= RULE_STRING
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleURI2063); 

            	    			newLeafNode(lv_name_3_0, grammarAccess.getURIAccess().getNameSTRINGTerminalRuleCall_3_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getURIRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_3_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1089:6: ( (otherlv_4= '\\\\' | otherlv_5= '/' ) ( (lv_id_6_0= RULE_IDENT ) ) )
            	    {
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1089:6: ( (otherlv_4= '\\\\' | otherlv_5= '/' ) ( (lv_id_6_0= RULE_IDENT ) ) )
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1089:7: (otherlv_4= '\\\\' | otherlv_5= '/' ) ( (lv_id_6_0= RULE_IDENT ) )
            	    {
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1089:7: (otherlv_4= '\\\\' | otherlv_5= '/' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==25) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==21) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1089:9: otherlv_4= '\\\\'
            	            {
            	            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleURI2088); 

            	                	newLeafNode(otherlv_4, grammarAccess.getURIAccess().getReverseSolidusKeyword_3_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1094:7: otherlv_5= '/'
            	            {
            	            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleURI2106); 

            	                	newLeafNode(otherlv_5, grammarAccess.getURIAccess().getSolidusKeyword_3_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1098:2: ( (lv_id_6_0= RULE_IDENT ) )
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1099:1: (lv_id_6_0= RULE_IDENT )
            	    {
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1099:1: (lv_id_6_0= RULE_IDENT )
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1100:3: lv_id_6_0= RULE_IDENT
            	    {
            	    lv_id_6_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleURI2124); 

            	    			newLeafNode(lv_id_6_0, grammarAccess.getURIAccess().getIdIdentTerminalRuleCall_3_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getURIRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_6_0, 
            	            		"ident");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1116:5: (otherlv_7= '.' ( (lv_id_8_0= RULE_IDENT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1116:7: otherlv_7= '.' ( (lv_id_8_0= RULE_IDENT ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleURI2145); 

                        	newLeafNode(otherlv_7, grammarAccess.getURIAccess().getFullStopKeyword_4_0());
                        
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1120:1: ( (lv_id_8_0= RULE_IDENT ) )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1121:1: (lv_id_8_0= RULE_IDENT )
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1121:1: (lv_id_8_0= RULE_IDENT )
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1122:3: lv_id_8_0= RULE_IDENT
                    {
                    lv_id_8_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleURI2162); 

                    			newLeafNode(lv_id_8_0, grammarAccess.getURIAccess().getIdIdentTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getURIRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_8_0, 
                            		"ident");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleURI2181); 

                	newLeafNode(otherlv_9, grammarAccess.getURIAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleURI"


    // $ANTLR start "entryRuleunary_numbers"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1150:1: entryRuleunary_numbers returns [String current=null] : iv_ruleunary_numbers= ruleunary_numbers EOF ;
    public final String entryRuleunary_numbers() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_numbers = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1151:2: (iv_ruleunary_numbers= ruleunary_numbers EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1152:2: iv_ruleunary_numbers= ruleunary_numbers EOF
            {
             newCompositeNode(grammarAccess.getUnary_numbersRule()); 
            pushFollow(FOLLOW_ruleunary_numbers_in_entryRuleunary_numbers2218);
            iv_ruleunary_numbers=ruleunary_numbers();

            state._fsp--;

             current =iv_ruleunary_numbers.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_numbers2229); 

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
    // $ANTLR end "entryRuleunary_numbers"


    // $ANTLR start "ruleunary_numbers"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1159:1: ruleunary_numbers returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_PERCENTAGE_1= rulePERCENTAGE | this_LENGTH_2= ruleLENGTH | this_EMS_3= ruleEMS | this_EXS_4= ruleEXS | this_ANGLE_5= ruleANGLE | this_TIME_6= ruleTIME | this_FREQ_7= ruleFREQ ) ;
    public final AntlrDatatypeRuleToken ruleunary_numbers() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_PERCENTAGE_1 = null;

        AntlrDatatypeRuleToken this_LENGTH_2 = null;

        AntlrDatatypeRuleToken this_EMS_3 = null;

        AntlrDatatypeRuleToken this_EXS_4 = null;

        AntlrDatatypeRuleToken this_ANGLE_5 = null;

        AntlrDatatypeRuleToken this_TIME_6 = null;

        AntlrDatatypeRuleToken this_FREQ_7 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1162:28: ( (this_INT_0= RULE_INT | this_PERCENTAGE_1= rulePERCENTAGE | this_LENGTH_2= ruleLENGTH | this_EMS_3= ruleEMS | this_EXS_4= ruleEXS | this_ANGLE_5= ruleANGLE | this_TIME_6= ruleTIME | this_FREQ_7= ruleFREQ ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1163:1: (this_INT_0= RULE_INT | this_PERCENTAGE_1= rulePERCENTAGE | this_LENGTH_2= ruleLENGTH | this_EMS_3= ruleEMS | this_EXS_4= ruleEXS | this_ANGLE_5= ruleANGLE | this_TIME_6= ruleTIME | this_FREQ_7= ruleFREQ )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1163:1: (this_INT_0= RULE_INT | this_PERCENTAGE_1= rulePERCENTAGE | this_LENGTH_2= ruleLENGTH | this_EMS_3= ruleEMS | this_EXS_4= ruleEXS | this_ANGLE_5= ruleANGLE | this_TIME_6= ruleTIME | this_FREQ_7= ruleFREQ )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1163:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleunary_numbers2269); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getUnary_numbersAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1172:5: this_PERCENTAGE_1= rulePERCENTAGE
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_numbersAccess().getPERCENTAGEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePERCENTAGE_in_ruleunary_numbers2302);
                    this_PERCENTAGE_1=rulePERCENTAGE();

                    state._fsp--;


                    		current.merge(this_PERCENTAGE_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1184:5: this_LENGTH_2= ruleLENGTH
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_numbersAccess().getLENGTHParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLENGTH_in_ruleunary_numbers2335);
                    this_LENGTH_2=ruleLENGTH();

                    state._fsp--;


                    		current.merge(this_LENGTH_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1196:5: this_EMS_3= ruleEMS
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_numbersAccess().getEMSParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEMS_in_ruleunary_numbers2368);
                    this_EMS_3=ruleEMS();

                    state._fsp--;


                    		current.merge(this_EMS_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1208:5: this_EXS_4= ruleEXS
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_numbersAccess().getEXSParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEXS_in_ruleunary_numbers2401);
                    this_EXS_4=ruleEXS();

                    state._fsp--;


                    		current.merge(this_EXS_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1220:5: this_ANGLE_5= ruleANGLE
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_numbersAccess().getANGLEParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleANGLE_in_ruleunary_numbers2434);
                    this_ANGLE_5=ruleANGLE();

                    state._fsp--;


                    		current.merge(this_ANGLE_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1232:5: this_TIME_6= ruleTIME
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_numbersAccess().getTIMEParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleTIME_in_ruleunary_numbers2467);
                    this_TIME_6=ruleTIME();

                    state._fsp--;


                    		current.merge(this_TIME_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1244:5: this_FREQ_7= ruleFREQ
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_numbersAccess().getFREQParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleFREQ_in_ruleunary_numbers2500);
                    this_FREQ_7=ruleFREQ();

                    state._fsp--;


                    		current.merge(this_FREQ_7);
                        
                     
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
    // $ANTLR end "ruleunary_numbers"


    // $ANTLR start "entryRulePERCENTAGE"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1262:1: entryRulePERCENTAGE returns [String current=null] : iv_rulePERCENTAGE= rulePERCENTAGE EOF ;
    public final String entryRulePERCENTAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePERCENTAGE = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1263:2: (iv_rulePERCENTAGE= rulePERCENTAGE EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1264:2: iv_rulePERCENTAGE= rulePERCENTAGE EOF
            {
             newCompositeNode(grammarAccess.getPERCENTAGERule()); 
            pushFollow(FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE2546);
            iv_rulePERCENTAGE=rulePERCENTAGE();

            state._fsp--;

             current =iv_rulePERCENTAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePERCENTAGE2557); 

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
    // $ANTLR end "entryRulePERCENTAGE"


    // $ANTLR start "rulePERCENTAGE"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1271:1: rulePERCENTAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '%' ) ;
    public final AntlrDatatypeRuleToken rulePERCENTAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1274:28: ( (this_INT_0= RULE_INT kw= '%' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1275:1: (this_INT_0= RULE_INT kw= '%' )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1275:1: (this_INT_0= RULE_INT kw= '%' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1275:6: this_INT_0= RULE_INT kw= '%'
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePERCENTAGE2597); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getPERCENTAGEAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,27,FOLLOW_27_in_rulePERCENTAGE2615); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPERCENTAGEAccess().getPercentSignKeyword_1()); 
                

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
    // $ANTLR end "rulePERCENTAGE"


    // $ANTLR start "entryRuleEMS"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1296:1: entryRuleEMS returns [String current=null] : iv_ruleEMS= ruleEMS EOF ;
    public final String entryRuleEMS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMS = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1297:2: (iv_ruleEMS= ruleEMS EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1298:2: iv_ruleEMS= ruleEMS EOF
            {
             newCompositeNode(grammarAccess.getEMSRule()); 
            pushFollow(FOLLOW_ruleEMS_in_entryRuleEMS2656);
            iv_ruleEMS=ruleEMS();

            state._fsp--;

             current =iv_ruleEMS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMS2667); 

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
    // $ANTLR end "entryRuleEMS"


    // $ANTLR start "ruleEMS"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1305:1: ruleEMS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= 'em' ) ;
    public final AntlrDatatypeRuleToken ruleEMS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1308:28: ( (this_INT_0= RULE_INT kw= 'em' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1309:1: (this_INT_0= RULE_INT kw= 'em' )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1309:1: (this_INT_0= RULE_INT kw= 'em' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1309:6: this_INT_0= RULE_INT kw= 'em'
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEMS2707); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEMSAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,28,FOLLOW_28_in_ruleEMS2725); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEMSAccess().getEmKeyword_1()); 
                

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
    // $ANTLR end "ruleEMS"


    // $ANTLR start "entryRuleEXS"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1330:1: entryRuleEXS returns [String current=null] : iv_ruleEXS= ruleEXS EOF ;
    public final String entryRuleEXS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXS = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1331:2: (iv_ruleEXS= ruleEXS EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1332:2: iv_ruleEXS= ruleEXS EOF
            {
             newCompositeNode(grammarAccess.getEXSRule()); 
            pushFollow(FOLLOW_ruleEXS_in_entryRuleEXS2766);
            iv_ruleEXS=ruleEXS();

            state._fsp--;

             current =iv_ruleEXS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXS2777); 

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
    // $ANTLR end "entryRuleEXS"


    // $ANTLR start "ruleEXS"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1339:1: ruleEXS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= 'ex' ) ;
    public final AntlrDatatypeRuleToken ruleEXS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1342:28: ( (this_INT_0= RULE_INT kw= 'ex' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1343:1: (this_INT_0= RULE_INT kw= 'ex' )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1343:1: (this_INT_0= RULE_INT kw= 'ex' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1343:6: this_INT_0= RULE_INT kw= 'ex'
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEXS2817); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEXSAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,29,FOLLOW_29_in_ruleEXS2835); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEXSAccess().getExKeyword_1()); 
                

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
    // $ANTLR end "ruleEXS"


    // $ANTLR start "entryRuleLENGTH"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1364:1: entryRuleLENGTH returns [String current=null] : iv_ruleLENGTH= ruleLENGTH EOF ;
    public final String entryRuleLENGTH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLENGTH = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1368:2: (iv_ruleLENGTH= ruleLENGTH EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1369:2: iv_ruleLENGTH= ruleLENGTH EOF
            {
             newCompositeNode(grammarAccess.getLENGTHRule()); 
            pushFollow(FOLLOW_ruleLENGTH_in_entryRuleLENGTH2882);
            iv_ruleLENGTH=ruleLENGTH();

            state._fsp--;

             current =iv_ruleLENGTH.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLENGTH2893); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLENGTH"


    // $ANTLR start "ruleLENGTH"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1379:1: ruleLENGTH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) ) ;
    public final AntlrDatatypeRuleToken ruleLENGTH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1383:28: ( (this_INT_0= RULE_INT (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1384:1: (this_INT_0= RULE_INT (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1384:1: (this_INT_0= RULE_INT (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1384:6: this_INT_0= RULE_INT (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' )
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLENGTH2937); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getLENGTHAccess().getINTTerminalRuleCall_0()); 
                
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1391:1: (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt30=1;
                }
                break;
            case 31:
                {
                alt30=2;
                }
                break;
            case 32:
                {
                alt30=3;
                }
                break;
            case 33:
                {
                alt30=4;
                }
                break;
            case 34:
                {
                alt30=5;
                }
                break;
            case 35:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1392:2: kw= 'px'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleLENGTH2956); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1399:2: kw= 'cm'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleLENGTH2975); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1406:2: kw= 'mm'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleLENGTH2994); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1413:2: kw= 'in'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleLENGTH3013); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1420:2: kw= 'pt'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleLENGTH3032); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1427:2: kw= 'pc'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleLENGTH3051); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPcKeyword_1_5()); 
                        

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLENGTH"


    // $ANTLR start "entryRuleANGLE"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1443:1: entryRuleANGLE returns [String current=null] : iv_ruleANGLE= ruleANGLE EOF ;
    public final String entryRuleANGLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANGLE = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1444:2: (iv_ruleANGLE= ruleANGLE EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1445:2: iv_ruleANGLE= ruleANGLE EOF
            {
             newCompositeNode(grammarAccess.getANGLERule()); 
            pushFollow(FOLLOW_ruleANGLE_in_entryRuleANGLE3097);
            iv_ruleANGLE=ruleANGLE();

            state._fsp--;

             current =iv_ruleANGLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANGLE3108); 

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
    // $ANTLR end "entryRuleANGLE"


    // $ANTLR start "ruleANGLE"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1452:1: ruleANGLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= 'deg' | kw= 'rad' | kw= 'grad' ) ) ;
    public final AntlrDatatypeRuleToken ruleANGLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1455:28: ( (this_INT_0= RULE_INT (kw= 'deg' | kw= 'rad' | kw= 'grad' ) ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1456:1: (this_INT_0= RULE_INT (kw= 'deg' | kw= 'rad' | kw= 'grad' ) )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1456:1: (this_INT_0= RULE_INT (kw= 'deg' | kw= 'rad' | kw= 'grad' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1456:6: this_INT_0= RULE_INT (kw= 'deg' | kw= 'rad' | kw= 'grad' )
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleANGLE3148); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getANGLEAccess().getINTTerminalRuleCall_0()); 
                
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1463:1: (kw= 'deg' | kw= 'rad' | kw= 'grad' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt31=1;
                }
                break;
            case 37:
                {
                alt31=2;
                }
                break;
            case 38:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1464:2: kw= 'deg'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleANGLE3167); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1471:2: kw= 'rad'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleANGLE3186); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1478:2: kw= 'grad'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleANGLE3205); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getGradKeyword_1_2()); 
                        

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
    // $ANTLR end "ruleANGLE"


    // $ANTLR start "entryRuleTIME"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1491:1: entryRuleTIME returns [String current=null] : iv_ruleTIME= ruleTIME EOF ;
    public final String entryRuleTIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1492:2: (iv_ruleTIME= ruleTIME EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1493:2: iv_ruleTIME= ruleTIME EOF
            {
             newCompositeNode(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_ruleTIME_in_entryRuleTIME3247);
            iv_ruleTIME=ruleTIME();

            state._fsp--;

             current =iv_ruleTIME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTIME3258); 

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
    // $ANTLR end "entryRuleTIME"


    // $ANTLR start "ruleTIME"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1500:1: ruleTIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= 'ms' | kw= 's' ) ) ;
    public final AntlrDatatypeRuleToken ruleTIME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1503:28: ( (this_INT_0= RULE_INT (kw= 'ms' | kw= 's' ) ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1504:1: (this_INT_0= RULE_INT (kw= 'ms' | kw= 's' ) )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1504:1: (this_INT_0= RULE_INT (kw= 'ms' | kw= 's' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1504:6: this_INT_0= RULE_INT (kw= 'ms' | kw= 's' )
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTIME3298); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getTIMEAccess().getINTTerminalRuleCall_0()); 
                
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1511:1: (kw= 'ms' | kw= 's' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            else if ( (LA32_0==40) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1512:2: kw= 'ms'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleTIME3317); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1519:2: kw= 's'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleTIME3336); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTIMEAccess().getSKeyword_1_1()); 
                        

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
    // $ANTLR end "ruleTIME"


    // $ANTLR start "entryRuleFREQ"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1532:1: entryRuleFREQ returns [String current=null] : iv_ruleFREQ= ruleFREQ EOF ;
    public final String entryRuleFREQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFREQ = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1533:2: (iv_ruleFREQ= ruleFREQ EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1534:2: iv_ruleFREQ= ruleFREQ EOF
            {
             newCompositeNode(grammarAccess.getFREQRule()); 
            pushFollow(FOLLOW_ruleFREQ_in_entryRuleFREQ3378);
            iv_ruleFREQ=ruleFREQ();

            state._fsp--;

             current =iv_ruleFREQ.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFREQ3389); 

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
    // $ANTLR end "entryRuleFREQ"


    // $ANTLR start "ruleFREQ"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1541:1: ruleFREQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= 'hz' | kw= 'khz' ) ) ;
    public final AntlrDatatypeRuleToken ruleFREQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1544:28: ( (this_INT_0= RULE_INT (kw= 'hz' | kw= 'khz' ) ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1545:1: (this_INT_0= RULE_INT (kw= 'hz' | kw= 'khz' ) )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1545:1: (this_INT_0= RULE_INT (kw= 'hz' | kw= 'khz' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1545:6: this_INT_0= RULE_INT (kw= 'hz' | kw= 'khz' )
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFREQ3429); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getFREQAccess().getINTTerminalRuleCall_0()); 
                
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1552:1: (kw= 'hz' | kw= 'khz' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            else if ( (LA33_0==42) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1553:2: kw= 'hz'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleFREQ3448); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFREQAccess().getHzKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1560:2: kw= 'khz'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleFREQ3467); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFREQAccess().getKhzKeyword_1_1()); 
                        

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
    // $ANTLR end "ruleFREQ"


    // $ANTLR start "entryRulecss_hash_class"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1573:1: entryRulecss_hash_class returns [EObject current=null] : iv_rulecss_hash_class= rulecss_hash_class EOF ;
    public final EObject entryRulecss_hash_class() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_hash_class = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1574:2: (iv_rulecss_hash_class= rulecss_hash_class EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1575:2: iv_rulecss_hash_class= rulecss_hash_class EOF
            {
             newCompositeNode(grammarAccess.getCss_hash_classRule()); 
            pushFollow(FOLLOW_rulecss_hash_class_in_entryRulecss_hash_class3508);
            iv_rulecss_hash_class=rulecss_hash_class();

            state._fsp--;

             current =iv_rulecss_hash_class; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_hash_class3518); 

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
    // $ANTLR end "entryRulecss_hash_class"


    // $ANTLR start "rulecss_hash_class"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1582:1: rulecss_hash_class returns [EObject current=null] : ( ( ( (lv_type_0_1= '#' | lv_type_0_2= '.' ) ) ) ( (lv_name_1_0= RULE_IDENT ) ) ) ;
    public final EObject rulecss_hash_class() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1585:28: ( ( ( ( (lv_type_0_1= '#' | lv_type_0_2= '.' ) ) ) ( (lv_name_1_0= RULE_IDENT ) ) ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1586:1: ( ( ( (lv_type_0_1= '#' | lv_type_0_2= '.' ) ) ) ( (lv_name_1_0= RULE_IDENT ) ) )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1586:1: ( ( ( (lv_type_0_1= '#' | lv_type_0_2= '.' ) ) ) ( (lv_name_1_0= RULE_IDENT ) ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1586:2: ( ( (lv_type_0_1= '#' | lv_type_0_2= '.' ) ) ) ( (lv_name_1_0= RULE_IDENT ) )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1586:2: ( ( (lv_type_0_1= '#' | lv_type_0_2= '.' ) ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1587:1: ( (lv_type_0_1= '#' | lv_type_0_2= '.' ) )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1587:1: ( (lv_type_0_1= '#' | lv_type_0_2= '.' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1588:1: (lv_type_0_1= '#' | lv_type_0_2= '.' )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1588:1: (lv_type_0_1= '#' | lv_type_0_2= '.' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            else if ( (LA34_0==26) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1589:3: lv_type_0_1= '#'
                    {
                    lv_type_0_1=(Token)match(input,43,FOLLOW_43_in_rulecss_hash_class3563); 

                            newLeafNode(lv_type_0_1, grammarAccess.getCss_hash_classAccess().getTypeNumberSignKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCss_hash_classRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1601:8: lv_type_0_2= '.'
                    {
                    lv_type_0_2=(Token)match(input,26,FOLLOW_26_in_rulecss_hash_class3592); 

                            newLeafNode(lv_type_0_2, grammarAccess.getCss_hash_classAccess().getTypeFullStopKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCss_hash_classRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1616:2: ( (lv_name_1_0= RULE_IDENT ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1617:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1617:1: (lv_name_1_0= RULE_IDENT )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1618:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_hash_class3625); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCss_hash_classAccess().getNameIdentTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCss_hash_classRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ident");
            	    

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
    // $ANTLR end "rulecss_hash_class"


    // $ANTLR start "entryRulecombinator"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1642:1: entryRulecombinator returns [String current=null] : iv_rulecombinator= rulecombinator EOF ;
    public final String entryRulecombinator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecombinator = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1646:2: (iv_rulecombinator= rulecombinator EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1647:2: iv_rulecombinator= rulecombinator EOF
            {
             newCompositeNode(grammarAccess.getCombinatorRule()); 
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator3673);
            iv_rulecombinator=rulecombinator();

            state._fsp--;

             current =iv_rulecombinator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator3684); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulecombinator"


    // $ANTLR start "rulecombinator"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1657:1: rulecombinator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken rulecombinator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1661:28: ( (kw= '+' | kw= '>' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1662:1: (kw= '+' | kw= '>' )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1662:1: (kw= '+' | kw= '>' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            else if ( (LA35_0==45) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1663:2: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulecombinator3726); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1670:2: kw= '>'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_rulecombinator3745); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_1()); 
                        

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulecombinator"


    // $ANTLR start "entryRuleunary_operator"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1686:1: entryRuleunary_operator returns [String current=null] : iv_ruleunary_operator= ruleunary_operator EOF ;
    public final String entryRuleunary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_operator = null;


        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1687:2: (iv_ruleunary_operator= ruleunary_operator EOF )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1688:2: iv_ruleunary_operator= ruleunary_operator EOF
            {
             newCompositeNode(grammarAccess.getUnary_operatorRule()); 
            pushFollow(FOLLOW_ruleunary_operator_in_entryRuleunary_operator3790);
            iv_ruleunary_operator=ruleunary_operator();

            state._fsp--;

             current =iv_ruleunary_operator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_operator3801); 

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
    // $ANTLR end "entryRuleunary_operator"


    // $ANTLR start "ruleunary_operator"
    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1695:1: ruleunary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleunary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1698:28: ( (kw= '-' | kw= '+' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1699:1: (kw= '-' | kw= '+' )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1699:1: (kw= '-' | kw= '+' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            else if ( (LA36_0==44) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1700:2: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleunary_operator3839); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1707:2: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleunary_operator3858); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 
                        

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
    // $ANTLR end "ruleunary_operator"

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA29_eotS =
        "\12\uffff";
    static final String DFA29_eofS =
        "\1\uffff\1\7\10\uffff";
    static final String DFA29_minS =
        "\1\10\1\4\10\uffff";
    static final String DFA29_maxS =
        "\1\10\1\56\10\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\5\1\10\1\7\1\3\1\4\1\1\1\6\1\2";
    static final String DFA29_specialS =
        "\12\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1",
            "\1\7\1\uffff\3\7\4\uffff\1\7\1\uffff\2\7\3\uffff\2\7\1\uffff"+
            "\2\7\2\uffff\1\11\1\6\1\2\6\5\3\10\2\4\2\3\1\uffff\1\7\1\uffff"+
            "\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1163:1: (this_INT_0= RULE_INT | this_PERCENTAGE_1= rulePERCENTAGE | this_LENGTH_2= ruleLENGTH | this_EMS_3= ruleEMS | this_EXS_4= ruleEXS | this_ANGLE_5= ruleANGLE | this_TIME_6= ruleTIME | this_FREQ_7= ruleFREQ )";
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulestylesheet127 = new BitSet(new long[]{0x00000800040A0042L});
    public static final BitSet FOLLOW_rulecss_import_in_rulestylesheet154 = new BitSet(new long[]{0x00000800040A0042L});
    public static final BitSet FOLLOW_ruleRules_in_rulestylesheet176 = new BitSet(new long[]{0x0000080004080042L});
    public static final BitSet FOLLOW_ruleRules_in_entryRuleRules213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRules223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_ruleRules269 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleRules282 = new BitSet(new long[]{0x0000080004080040L});
    public static final BitSet FOLLOW_ruleselector_in_ruleRules303 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleRules317 = new BitSet(new long[]{0x0000000000018040L});
    public static final BitSet FOLLOW_ruledeclaration_in_ruleRules338 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleRules352 = new BitSet(new long[]{0x0000000000018040L});
    public static final BitSet FOLLOW_ruledeclaration_in_ruleRules373 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleRules388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_import_in_entryRulecss_import424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_import434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulecss_import471 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulecss_import489 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleURI_in_rulecss_import522 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulecss_import534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_ruleselector636 = new BitSet(new long[]{0x0000300000000022L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector659 = new BitSet(new long[]{0x0000080004080040L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector700 = new BitSet(new long[]{0x0000380004080062L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector723 = new BitSet(new long[]{0x0000080004080040L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_rulesimple_selector847 = new BitSet(new long[]{0x00000800040C0042L});
    public static final BitSet FOLLOW_rulecss_hash_class_in_rulesimple_selector868 = new BitSet(new long[]{0x00000800040C0042L});
    public static final BitSet FOLLOW_rulepseudo_in_rulesimple_selector890 = new BitSet(new long[]{0x0000000000040042L});
    public static final BitSet FOLLOW_rulecss_hash_class_in_rulesimple_selector919 = new BitSet(new long[]{0x0000080004080042L});
    public static final BitSet FOLLOW_rulepseudo_in_entryRulepseudo956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepseudo966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulepseudo1004 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulepseudo1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_rulepseudo1055 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulepseudo1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_entryRuleelement_name1115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement_name1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleelement_name1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleelement_name1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_entryRuledeclaration1245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruledeclaration1297 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruledeclaration1314 = new BitSet(new long[]{0x00005000010401D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruledeclaration1335 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruledeclaration1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr1403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_ruleexpr1459 = new BitSet(new long[]{0x00005000012421D2L});
    public static final BitSet FOLLOW_21_in_ruleexpr1480 = new BitSet(new long[]{0x00005000010401D0L});
    public static final BitSet FOLLOW_13_in_ruleexpr1509 = new BitSet(new long[]{0x00005000010401D0L});
    public static final BitSet FOLLOW_ruleterm_in_ruleexpr1547 = new BitSet(new long[]{0x00005000012421D2L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_ruleterm1642 = new BitSet(new long[]{0x0000500000000100L});
    public static final BitSet FOLLOW_ruleunary_numbers_in_ruleterm1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleterm1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleterm1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_ruleterm1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXDIGITS_in_ruleterm1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_ruleterm1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction1839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulefunction1891 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulefunction1908 = new BitSet(new long[]{0x00005000010401D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulefunction1929 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulefunction1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI1977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleURI2024 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleURI2036 = new BitSet(new long[]{0x0000000006A00010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleURI2063 = new BitSet(new long[]{0x0000000006A00010L});
    public static final BitSet FOLLOW_25_in_ruleURI2088 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21_in_ruleURI2106 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleURI2124 = new BitSet(new long[]{0x0000000006A00010L});
    public static final BitSet FOLLOW_26_in_ruleURI2145 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleURI2162 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleURI2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_numbers_in_entryRuleunary_numbers2218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_numbers2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleunary_numbers2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_ruleunary_numbers2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_ruleunary_numbers2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_ruleunary_numbers2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_ruleunary_numbers2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_ruleunary_numbers2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_ruleunary_numbers2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_ruleunary_numbers2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE2546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePERCENTAGE2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePERCENTAGE2597 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePERCENTAGE2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_entryRuleEMS2656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMS2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEMS2707 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEMS2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_entryRuleEXS2766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXS2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEXS2817 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEXS2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_entryRuleLENGTH2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLENGTH2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLENGTH2937 = new BitSet(new long[]{0x0000000FC0000000L});
    public static final BitSet FOLLOW_30_in_ruleLENGTH2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLENGTH2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleLENGTH2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLENGTH3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleLENGTH3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLENGTH3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_entryRuleANGLE3097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANGLE3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleANGLE3148 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_36_in_ruleANGLE3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleANGLE3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleANGLE3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_entryRuleTIME3247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTIME3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTIME3298 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_39_in_ruleTIME3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTIME3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_entryRuleFREQ3378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFREQ3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFREQ3429 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_ruleFREQ3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFREQ3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_hash_class_in_entryRulecss_hash_class3508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_hash_class3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulecss_hash_class3563 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26_in_rulecss_hash_class3592 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_hash_class3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator3673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulecombinator3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulecombinator3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator3790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleunary_operator3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleunary_operator3858 = new BitSet(new long[]{0x0000000000000002L});

}