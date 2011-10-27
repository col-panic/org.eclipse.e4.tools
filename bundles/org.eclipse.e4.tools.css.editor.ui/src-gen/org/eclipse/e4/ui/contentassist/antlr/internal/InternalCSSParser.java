package org.eclipse.e4.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.e4.services.CSSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_WS", "RULE_STRING", "RULE_IDENT", "RULE_HEXDIGITS", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'/'", "','", "'\\\\'", "'px'", "'cm'", "'mm'", "'in'", "'pt'", "'pc'", "'deg'", "'rad'", "'grad'", "'ms'", "'s'", "'hz'", "'khz'", "'#'", "'.'", "'+'", "'>'", "'-'", "'{'", "'}'", "';'", "'@import'", "':'", "'('", "')'", "'url'", "'%'", "'em'", "'ex'", "'*'", "'!important'"
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
    public static final int RULE_INT=4;
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
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_IDENT=7;
    public static final int T__39=39;
    public static final int RULE_HEXDIGITS=8;
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
    public String getGrammarFileName() { return "../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g"; }


     
     	private CSSGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CSSGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulestylesheet"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:60:1: entryRulestylesheet : rulestylesheet EOF ;
    public final void entryRulestylesheet() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:61:1: ( rulestylesheet EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:62:1: rulestylesheet EOF
            {
             before(grammarAccess.getStylesheetRule()); 
            pushFollow(FOLLOW_rulestylesheet_in_entryRulestylesheet61);
            rulestylesheet();

            state._fsp--;

             after(grammarAccess.getStylesheetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestylesheet68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestylesheet"


    // $ANTLR start "rulestylesheet"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:69:1: rulestylesheet : ( ( rule__Stylesheet__Group__0 ) ) ;
    public final void rulestylesheet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:73:2: ( ( ( rule__Stylesheet__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:74:1: ( ( rule__Stylesheet__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:74:1: ( ( rule__Stylesheet__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:75:1: ( rule__Stylesheet__Group__0 )
            {
             before(grammarAccess.getStylesheetAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:76:1: ( rule__Stylesheet__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:76:2: rule__Stylesheet__Group__0
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__0_in_rulestylesheet94);
            rule__Stylesheet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStylesheetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestylesheet"


    // $ANTLR start "entryRuleRules"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:88:1: entryRuleRules : ruleRules EOF ;
    public final void entryRuleRules() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:89:1: ( ruleRules EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:90:1: ruleRules EOF
            {
             before(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_ruleRules_in_entryRuleRules121);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getRulesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRules128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:97:1: ruleRules : ( ( rule__Rules__Group__0 ) ) ;
    public final void ruleRules() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:101:2: ( ( ( rule__Rules__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:102:1: ( ( rule__Rules__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:102:1: ( ( rule__Rules__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:103:1: ( rule__Rules__Group__0 )
            {
             before(grammarAccess.getRulesAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:104:1: ( rule__Rules__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:104:2: rule__Rules__Group__0
            {
            pushFollow(FOLLOW_rule__Rules__Group__0_in_ruleRules154);
            rule__Rules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRulecss_import"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:116:1: entryRulecss_import : rulecss_import EOF ;
    public final void entryRulecss_import() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:117:1: ( rulecss_import EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:118:1: rulecss_import EOF
            {
             before(grammarAccess.getCss_importRule()); 
            pushFollow(FOLLOW_rulecss_import_in_entryRulecss_import181);
            rulecss_import();

            state._fsp--;

             after(grammarAccess.getCss_importRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_import188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_import"


    // $ANTLR start "rulecss_import"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:125:1: rulecss_import : ( ( rule__Css_import__Group__0 ) ) ;
    public final void rulecss_import() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:129:2: ( ( ( rule__Css_import__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:130:1: ( ( rule__Css_import__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:130:1: ( ( rule__Css_import__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:131:1: ( rule__Css_import__Group__0 )
            {
             before(grammarAccess.getCss_importAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:132:1: ( rule__Css_import__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:132:2: rule__Css_import__Group__0
            {
            pushFollow(FOLLOW_rule__Css_import__Group__0_in_rulecss_import214);
            rule__Css_import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_importAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_import"


    // $ANTLR start "entryRuleselector"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:144:1: entryRuleselector : ruleselector EOF ;
    public final void entryRuleselector() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:148:1: ( ruleselector EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:149:1: ruleselector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector246);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector253); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleselector"


    // $ANTLR start "ruleselector"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:159:1: ruleselector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleselector() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:164:2: ( ( ( rule__Selector__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:165:1: ( ( rule__Selector__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:165:1: ( ( rule__Selector__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:166:1: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:167:1: ( rule__Selector__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:167:2: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_rule__Selector__Group__0_in_ruleselector283);
            rule__Selector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleselector"


    // $ANTLR start "entryRulesimple_selector"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:180:1: entryRulesimple_selector : rulesimple_selector EOF ;
    public final void entryRulesimple_selector() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:181:1: ( rulesimple_selector EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:182:1: rulesimple_selector EOF
            {
             before(grammarAccess.getSimple_selectorRule()); 
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector310);
            rulesimple_selector();

            state._fsp--;

             after(grammarAccess.getSimple_selectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector317); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesimple_selector"


    // $ANTLR start "rulesimple_selector"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:189:1: rulesimple_selector : ( ( rule__Simple_selector__Alternatives ) ) ;
    public final void rulesimple_selector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:193:2: ( ( ( rule__Simple_selector__Alternatives ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:194:1: ( ( rule__Simple_selector__Alternatives ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:194:1: ( ( rule__Simple_selector__Alternatives ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:195:1: ( rule__Simple_selector__Alternatives )
            {
             before(grammarAccess.getSimple_selectorAccess().getAlternatives()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:196:1: ( rule__Simple_selector__Alternatives )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:196:2: rule__Simple_selector__Alternatives
            {
            pushFollow(FOLLOW_rule__Simple_selector__Alternatives_in_rulesimple_selector343);
            rule__Simple_selector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimple_selectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesimple_selector"


    // $ANTLR start "entryRulepseudo"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:208:1: entryRulepseudo : rulepseudo EOF ;
    public final void entryRulepseudo() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:209:1: ( rulepseudo EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:210:1: rulepseudo EOF
            {
             before(grammarAccess.getPseudoRule()); 
            pushFollow(FOLLOW_rulepseudo_in_entryRulepseudo370);
            rulepseudo();

            state._fsp--;

             after(grammarAccess.getPseudoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepseudo377); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepseudo"


    // $ANTLR start "rulepseudo"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:217:1: rulepseudo : ( ( rule__Pseudo__Alternatives ) ) ;
    public final void rulepseudo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:221:2: ( ( ( rule__Pseudo__Alternatives ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:222:1: ( ( rule__Pseudo__Alternatives ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:222:1: ( ( rule__Pseudo__Alternatives ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:223:1: ( rule__Pseudo__Alternatives )
            {
             before(grammarAccess.getPseudoAccess().getAlternatives()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:224:1: ( rule__Pseudo__Alternatives )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:224:2: rule__Pseudo__Alternatives
            {
            pushFollow(FOLLOW_rule__Pseudo__Alternatives_in_rulepseudo403);
            rule__Pseudo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPseudoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepseudo"


    // $ANTLR start "entryRuleelement_name"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:236:1: entryRuleelement_name : ruleelement_name EOF ;
    public final void entryRuleelement_name() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:237:1: ( ruleelement_name EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:238:1: ruleelement_name EOF
            {
             before(grammarAccess.getElement_nameRule()); 
            pushFollow(FOLLOW_ruleelement_name_in_entryRuleelement_name430);
            ruleelement_name();

            state._fsp--;

             after(grammarAccess.getElement_nameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement_name437); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleelement_name"


    // $ANTLR start "ruleelement_name"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:245:1: ruleelement_name : ( ( rule__Element_name__Alternatives ) ) ;
    public final void ruleelement_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:249:2: ( ( ( rule__Element_name__Alternatives ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:250:1: ( ( rule__Element_name__Alternatives ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:250:1: ( ( rule__Element_name__Alternatives ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:251:1: ( rule__Element_name__Alternatives )
            {
             before(grammarAccess.getElement_nameAccess().getAlternatives()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:252:1: ( rule__Element_name__Alternatives )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:252:2: rule__Element_name__Alternatives
            {
            pushFollow(FOLLOW_rule__Element_name__Alternatives_in_ruleelement_name463);
            rule__Element_name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElement_nameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleelement_name"


    // $ANTLR start "entryRuledeclaration"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:264:1: entryRuledeclaration : ruledeclaration EOF ;
    public final void entryRuledeclaration() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:265:1: ( ruledeclaration EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:266:1: ruledeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruledeclaration_in_entryRuledeclaration490);
            ruledeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration497); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledeclaration"


    // $ANTLR start "ruledeclaration"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:273:1: ruledeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruledeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:277:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:278:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:278:1: ( ( rule__Declaration__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:279:1: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:280:1: ( rule__Declaration__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:280:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruledeclaration523);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledeclaration"


    // $ANTLR start "entryRuleexpr"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:292:1: entryRuleexpr : ruleexpr EOF ;
    public final void entryRuleexpr() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:293:1: ( ruleexpr EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:294:1: ruleexpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr550);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr557); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpr"


    // $ANTLR start "ruleexpr"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:301:1: ruleexpr : ( ( rule__Expr__Group__0 ) ) ;
    public final void ruleexpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:305:2: ( ( ( rule__Expr__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:306:1: ( ( rule__Expr__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:306:1: ( ( rule__Expr__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:307:1: ( rule__Expr__Group__0 )
            {
             before(grammarAccess.getExprAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:308:1: ( rule__Expr__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:308:2: rule__Expr__Group__0
            {
            pushFollow(FOLLOW_rule__Expr__Group__0_in_ruleexpr583);
            rule__Expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpr"


    // $ANTLR start "entryRuleterm"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:320:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:321:1: ( ruleterm EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:322:1: ruleterm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm610);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm617); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:329:1: ruleterm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:333:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:334:1: ( ( rule__Term__Alternatives ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:334:1: ( ( rule__Term__Alternatives ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:335:1: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:336:1: ( rule__Term__Alternatives )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:336:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleterm643);
            rule__Term__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefunction"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:348:1: entryRulefunction : rulefunction EOF ;
    public final void entryRulefunction() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:349:1: ( rulefunction EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:350:1: rulefunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction670);
            rulefunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction677); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:357:1: rulefunction : ( ( rule__Function__Group__0 ) ) ;
    public final void rulefunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:361:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:362:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:362:1: ( ( rule__Function__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:363:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:364:1: ( rule__Function__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:364:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_rulefunction703);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRuleURI"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:376:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:377:1: ( ruleURI EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:378:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI730);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI737); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:385:1: ruleURI : ( ( rule__URI__Group__0 ) ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:389:2: ( ( ( rule__URI__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:390:1: ( ( rule__URI__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:390:1: ( ( rule__URI__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:391:1: ( rule__URI__Group__0 )
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:392:1: ( rule__URI__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:392:2: rule__URI__Group__0
            {
            pushFollow(FOLLOW_rule__URI__Group__0_in_ruleURI763);
            rule__URI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURI"


    // $ANTLR start "entryRuleunary_numbers"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:404:1: entryRuleunary_numbers : ruleunary_numbers EOF ;
    public final void entryRuleunary_numbers() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:405:1: ( ruleunary_numbers EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:406:1: ruleunary_numbers EOF
            {
             before(grammarAccess.getUnary_numbersRule()); 
            pushFollow(FOLLOW_ruleunary_numbers_in_entryRuleunary_numbers790);
            ruleunary_numbers();

            state._fsp--;

             after(grammarAccess.getUnary_numbersRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_numbers797); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunary_numbers"


    // $ANTLR start "ruleunary_numbers"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:413:1: ruleunary_numbers : ( ( rule__Unary_numbers__Alternatives ) ) ;
    public final void ruleunary_numbers() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:417:2: ( ( ( rule__Unary_numbers__Alternatives ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:418:1: ( ( rule__Unary_numbers__Alternatives ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:418:1: ( ( rule__Unary_numbers__Alternatives ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:419:1: ( rule__Unary_numbers__Alternatives )
            {
             before(grammarAccess.getUnary_numbersAccess().getAlternatives()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:420:1: ( rule__Unary_numbers__Alternatives )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:420:2: rule__Unary_numbers__Alternatives
            {
            pushFollow(FOLLOW_rule__Unary_numbers__Alternatives_in_ruleunary_numbers823);
            rule__Unary_numbers__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnary_numbersAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunary_numbers"


    // $ANTLR start "entryRulePERCENTAGE"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:432:1: entryRulePERCENTAGE : rulePERCENTAGE EOF ;
    public final void entryRulePERCENTAGE() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:433:1: ( rulePERCENTAGE EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:434:1: rulePERCENTAGE EOF
            {
             before(grammarAccess.getPERCENTAGERule()); 
            pushFollow(FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE850);
            rulePERCENTAGE();

            state._fsp--;

             after(grammarAccess.getPERCENTAGERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePERCENTAGE857); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePERCENTAGE"


    // $ANTLR start "rulePERCENTAGE"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:441:1: rulePERCENTAGE : ( ( rule__PERCENTAGE__Group__0 ) ) ;
    public final void rulePERCENTAGE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:445:2: ( ( ( rule__PERCENTAGE__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:446:1: ( ( rule__PERCENTAGE__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:446:1: ( ( rule__PERCENTAGE__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:447:1: ( rule__PERCENTAGE__Group__0 )
            {
             before(grammarAccess.getPERCENTAGEAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:448:1: ( rule__PERCENTAGE__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:448:2: rule__PERCENTAGE__Group__0
            {
            pushFollow(FOLLOW_rule__PERCENTAGE__Group__0_in_rulePERCENTAGE883);
            rule__PERCENTAGE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPERCENTAGEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePERCENTAGE"


    // $ANTLR start "entryRuleEMS"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:460:1: entryRuleEMS : ruleEMS EOF ;
    public final void entryRuleEMS() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:461:1: ( ruleEMS EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:462:1: ruleEMS EOF
            {
             before(grammarAccess.getEMSRule()); 
            pushFollow(FOLLOW_ruleEMS_in_entryRuleEMS910);
            ruleEMS();

            state._fsp--;

             after(grammarAccess.getEMSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMS917); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEMS"


    // $ANTLR start "ruleEMS"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:469:1: ruleEMS : ( ( rule__EMS__Group__0 ) ) ;
    public final void ruleEMS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:473:2: ( ( ( rule__EMS__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:474:1: ( ( rule__EMS__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:474:1: ( ( rule__EMS__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:475:1: ( rule__EMS__Group__0 )
            {
             before(grammarAccess.getEMSAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:476:1: ( rule__EMS__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:476:2: rule__EMS__Group__0
            {
            pushFollow(FOLLOW_rule__EMS__Group__0_in_ruleEMS943);
            rule__EMS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEMSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEMS"


    // $ANTLR start "entryRuleEXS"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:488:1: entryRuleEXS : ruleEXS EOF ;
    public final void entryRuleEXS() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:489:1: ( ruleEXS EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:490:1: ruleEXS EOF
            {
             before(grammarAccess.getEXSRule()); 
            pushFollow(FOLLOW_ruleEXS_in_entryRuleEXS970);
            ruleEXS();

            state._fsp--;

             after(grammarAccess.getEXSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXS977); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXS"


    // $ANTLR start "ruleEXS"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:497:1: ruleEXS : ( ( rule__EXS__Group__0 ) ) ;
    public final void ruleEXS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:501:2: ( ( ( rule__EXS__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:502:1: ( ( rule__EXS__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:502:1: ( ( rule__EXS__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:503:1: ( rule__EXS__Group__0 )
            {
             before(grammarAccess.getEXSAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:504:1: ( rule__EXS__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:504:2: rule__EXS__Group__0
            {
            pushFollow(FOLLOW_rule__EXS__Group__0_in_ruleEXS1003);
            rule__EXS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEXSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXS"


    // $ANTLR start "entryRuleLENGTH"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:516:1: entryRuleLENGTH : ruleLENGTH EOF ;
    public final void entryRuleLENGTH() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:520:1: ( ruleLENGTH EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:521:1: ruleLENGTH EOF
            {
             before(grammarAccess.getLENGTHRule()); 
            pushFollow(FOLLOW_ruleLENGTH_in_entryRuleLENGTH1035);
            ruleLENGTH();

            state._fsp--;

             after(grammarAccess.getLENGTHRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLENGTH1042); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleLENGTH"


    // $ANTLR start "ruleLENGTH"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:531:1: ruleLENGTH : ( ( rule__LENGTH__Group__0 ) ) ;
    public final void ruleLENGTH() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:536:2: ( ( ( rule__LENGTH__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:537:1: ( ( rule__LENGTH__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:537:1: ( ( rule__LENGTH__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:538:1: ( rule__LENGTH__Group__0 )
            {
             before(grammarAccess.getLENGTHAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:539:1: ( rule__LENGTH__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:539:2: rule__LENGTH__Group__0
            {
            pushFollow(FOLLOW_rule__LENGTH__Group__0_in_ruleLENGTH1072);
            rule__LENGTH__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLENGTHAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleLENGTH"


    // $ANTLR start "entryRuleANGLE"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:552:1: entryRuleANGLE : ruleANGLE EOF ;
    public final void entryRuleANGLE() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:553:1: ( ruleANGLE EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:554:1: ruleANGLE EOF
            {
             before(grammarAccess.getANGLERule()); 
            pushFollow(FOLLOW_ruleANGLE_in_entryRuleANGLE1099);
            ruleANGLE();

            state._fsp--;

             after(grammarAccess.getANGLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANGLE1106); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleANGLE"


    // $ANTLR start "ruleANGLE"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:561:1: ruleANGLE : ( ( rule__ANGLE__Group__0 ) ) ;
    public final void ruleANGLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:565:2: ( ( ( rule__ANGLE__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:566:1: ( ( rule__ANGLE__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:566:1: ( ( rule__ANGLE__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:567:1: ( rule__ANGLE__Group__0 )
            {
             before(grammarAccess.getANGLEAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:568:1: ( rule__ANGLE__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:568:2: rule__ANGLE__Group__0
            {
            pushFollow(FOLLOW_rule__ANGLE__Group__0_in_ruleANGLE1132);
            rule__ANGLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getANGLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleANGLE"


    // $ANTLR start "entryRuleTIME"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:580:1: entryRuleTIME : ruleTIME EOF ;
    public final void entryRuleTIME() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:581:1: ( ruleTIME EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:582:1: ruleTIME EOF
            {
             before(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_ruleTIME_in_entryRuleTIME1159);
            ruleTIME();

            state._fsp--;

             after(grammarAccess.getTIMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTIME1166); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTIME"


    // $ANTLR start "ruleTIME"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:589:1: ruleTIME : ( ( rule__TIME__Group__0 ) ) ;
    public final void ruleTIME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:593:2: ( ( ( rule__TIME__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:594:1: ( ( rule__TIME__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:594:1: ( ( rule__TIME__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:595:1: ( rule__TIME__Group__0 )
            {
             before(grammarAccess.getTIMEAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:596:1: ( rule__TIME__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:596:2: rule__TIME__Group__0
            {
            pushFollow(FOLLOW_rule__TIME__Group__0_in_ruleTIME1192);
            rule__TIME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTIMEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTIME"


    // $ANTLR start "entryRuleFREQ"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:608:1: entryRuleFREQ : ruleFREQ EOF ;
    public final void entryRuleFREQ() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:609:1: ( ruleFREQ EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:610:1: ruleFREQ EOF
            {
             before(grammarAccess.getFREQRule()); 
            pushFollow(FOLLOW_ruleFREQ_in_entryRuleFREQ1219);
            ruleFREQ();

            state._fsp--;

             after(grammarAccess.getFREQRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFREQ1226); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFREQ"


    // $ANTLR start "ruleFREQ"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:617:1: ruleFREQ : ( ( rule__FREQ__Group__0 ) ) ;
    public final void ruleFREQ() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:621:2: ( ( ( rule__FREQ__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:622:1: ( ( rule__FREQ__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:622:1: ( ( rule__FREQ__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:623:1: ( rule__FREQ__Group__0 )
            {
             before(grammarAccess.getFREQAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:624:1: ( rule__FREQ__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:624:2: rule__FREQ__Group__0
            {
            pushFollow(FOLLOW_rule__FREQ__Group__0_in_ruleFREQ1252);
            rule__FREQ__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFREQAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFREQ"


    // $ANTLR start "entryRulecss_hash_class"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:636:1: entryRulecss_hash_class : rulecss_hash_class EOF ;
    public final void entryRulecss_hash_class() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:637:1: ( rulecss_hash_class EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:638:1: rulecss_hash_class EOF
            {
             before(grammarAccess.getCss_hash_classRule()); 
            pushFollow(FOLLOW_rulecss_hash_class_in_entryRulecss_hash_class1279);
            rulecss_hash_class();

            state._fsp--;

             after(grammarAccess.getCss_hash_classRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_hash_class1286); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_hash_class"


    // $ANTLR start "rulecss_hash_class"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:645:1: rulecss_hash_class : ( ( rule__Css_hash_class__Group__0 ) ) ;
    public final void rulecss_hash_class() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:649:2: ( ( ( rule__Css_hash_class__Group__0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:650:1: ( ( rule__Css_hash_class__Group__0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:650:1: ( ( rule__Css_hash_class__Group__0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:651:1: ( rule__Css_hash_class__Group__0 )
            {
             before(grammarAccess.getCss_hash_classAccess().getGroup()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:652:1: ( rule__Css_hash_class__Group__0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:652:2: rule__Css_hash_class__Group__0
            {
            pushFollow(FOLLOW_rule__Css_hash_class__Group__0_in_rulecss_hash_class1312);
            rule__Css_hash_class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_hash_classAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_hash_class"


    // $ANTLR start "entryRulecombinator"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:664:1: entryRulecombinator : rulecombinator EOF ;
    public final void entryRulecombinator() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:668:1: ( rulecombinator EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:669:1: rulecombinator EOF
            {
             before(grammarAccess.getCombinatorRule()); 
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator1344);
            rulecombinator();

            state._fsp--;

             after(grammarAccess.getCombinatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator1351); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulecombinator"


    // $ANTLR start "rulecombinator"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:679:1: rulecombinator : ( ( rule__Combinator__Alternatives ) ) ;
    public final void rulecombinator() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:684:2: ( ( ( rule__Combinator__Alternatives ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:685:1: ( ( rule__Combinator__Alternatives ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:685:1: ( ( rule__Combinator__Alternatives ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:686:1: ( rule__Combinator__Alternatives )
            {
             before(grammarAccess.getCombinatorAccess().getAlternatives()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:687:1: ( rule__Combinator__Alternatives )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:687:2: rule__Combinator__Alternatives
            {
            pushFollow(FOLLOW_rule__Combinator__Alternatives_in_rulecombinator1381);
            rule__Combinator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCombinatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulecombinator"


    // $ANTLR start "entryRuleunary_operator"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:700:1: entryRuleunary_operator : ruleunary_operator EOF ;
    public final void entryRuleunary_operator() throws RecognitionException {
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:701:1: ( ruleunary_operator EOF )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:702:1: ruleunary_operator EOF
            {
             before(grammarAccess.getUnary_operatorRule()); 
            pushFollow(FOLLOW_ruleunary_operator_in_entryRuleunary_operator1408);
            ruleunary_operator();

            state._fsp--;

             after(grammarAccess.getUnary_operatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_operator1415); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunary_operator"


    // $ANTLR start "ruleunary_operator"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:709:1: ruleunary_operator : ( ( rule__Unary_operator__Alternatives ) ) ;
    public final void ruleunary_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:713:2: ( ( ( rule__Unary_operator__Alternatives ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:714:1: ( ( rule__Unary_operator__Alternatives ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:714:1: ( ( rule__Unary_operator__Alternatives ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:715:1: ( rule__Unary_operator__Alternatives )
            {
             before(grammarAccess.getUnary_operatorAccess().getAlternatives()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:716:1: ( rule__Unary_operator__Alternatives )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:716:2: rule__Unary_operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Unary_operator__Alternatives_in_ruleunary_operator1441);
            rule__Unary_operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnary_operatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunary_operator"


    // $ANTLR start "rule__Css_import__Alternatives_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:728:1: rule__Css_import__Alternatives_1 : ( ( ( rule__Css_import__String_nameAssignment_1_0 ) ) | ( ruleURI ) );
    public final void rule__Css_import__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:732:1: ( ( ( rule__Css_import__String_nameAssignment_1_0 ) ) | ( ruleURI ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==41) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:733:1: ( ( rule__Css_import__String_nameAssignment_1_0 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:733:1: ( ( rule__Css_import__String_nameAssignment_1_0 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:734:1: ( rule__Css_import__String_nameAssignment_1_0 )
                    {
                     before(grammarAccess.getCss_importAccess().getString_nameAssignment_1_0()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:735:1: ( rule__Css_import__String_nameAssignment_1_0 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:735:2: rule__Css_import__String_nameAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Css_import__String_nameAssignment_1_0_in_rule__Css_import__Alternatives_11477);
                    rule__Css_import__String_nameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCss_importAccess().getString_nameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:739:6: ( ruleURI )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:739:6: ( ruleURI )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:740:1: ruleURI
                    {
                     before(grammarAccess.getCss_importAccess().getURIParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleURI_in_rule__Css_import__Alternatives_11495);
                    ruleURI();

                    state._fsp--;

                     after(grammarAccess.getCss_importAccess().getURIParserRuleCall_1_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_import__Alternatives_1"


    // $ANTLR start "rule__Selector__Alternatives_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:750:1: rule__Selector__Alternatives_1 : ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) );
    public final void rule__Selector__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:754:1: ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=31 && LA2_0<=32)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_WS) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:755:1: ( ( rule__Selector__Group_1_0__0 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:755:1: ( ( rule__Selector__Group_1_0__0 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:756:1: ( rule__Selector__Group_1_0__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1_0()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:757:1: ( rule__Selector__Group_1_0__0 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:757:2: rule__Selector__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_0__0_in_rule__Selector__Alternatives_11527);
                    rule__Selector__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:761:6: ( ( rule__Selector__Group_1_1__0 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:761:6: ( ( rule__Selector__Group_1_1__0 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:762:1: ( rule__Selector__Group_1_1__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1_1()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:763:1: ( rule__Selector__Group_1_1__0 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:763:2: rule__Selector__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_1__0_in_rule__Selector__Alternatives_11545);
                    rule__Selector__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_1_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Alternatives_1"


    // $ANTLR start "rule__Simple_selector__Alternatives"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:772:1: rule__Simple_selector__Alternatives : ( ( ( rule__Simple_selector__Group_0__0 ) ) | ( ( ( rule__Simple_selector__IdAssignment_1 ) ) ( ( rule__Simple_selector__IdAssignment_1 )* ) ) );
    public final void rule__Simple_selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:776:1: ( ( ( rule__Simple_selector__Group_0__0 ) ) | ( ( ( rule__Simple_selector__IdAssignment_1 ) ) ( ( rule__Simple_selector__IdAssignment_1 )* ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_IDENT||LA4_0==45) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=29 && LA4_0<=30)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:777:1: ( ( rule__Simple_selector__Group_0__0 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:777:1: ( ( rule__Simple_selector__Group_0__0 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:778:1: ( rule__Simple_selector__Group_0__0 )
                    {
                     before(grammarAccess.getSimple_selectorAccess().getGroup_0()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:779:1: ( rule__Simple_selector__Group_0__0 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:779:2: rule__Simple_selector__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__Group_0__0_in_rule__Simple_selector__Alternatives1578);
                    rule__Simple_selector__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_selectorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:783:6: ( ( ( rule__Simple_selector__IdAssignment_1 ) ) ( ( rule__Simple_selector__IdAssignment_1 )* ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:783:6: ( ( ( rule__Simple_selector__IdAssignment_1 ) ) ( ( rule__Simple_selector__IdAssignment_1 )* ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:784:1: ( ( rule__Simple_selector__IdAssignment_1 ) ) ( ( rule__Simple_selector__IdAssignment_1 )* )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:784:1: ( ( rule__Simple_selector__IdAssignment_1 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:785:1: ( rule__Simple_selector__IdAssignment_1 )
                    {
                     before(grammarAccess.getSimple_selectorAccess().getIdAssignment_1()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:786:1: ( rule__Simple_selector__IdAssignment_1 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:786:2: rule__Simple_selector__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__IdAssignment_1_in_rule__Simple_selector__Alternatives1598);
                    rule__Simple_selector__IdAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_selectorAccess().getIdAssignment_1()); 

                    }

                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:789:1: ( ( rule__Simple_selector__IdAssignment_1 )* )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:790:1: ( rule__Simple_selector__IdAssignment_1 )*
                    {
                     before(grammarAccess.getSimple_selectorAccess().getIdAssignment_1()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:791:1: ( rule__Simple_selector__IdAssignment_1 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=29 && LA3_0<=30)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:791:2: rule__Simple_selector__IdAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_rule__Simple_selector__IdAssignment_1_in_rule__Simple_selector__Alternatives1610);
                    	    rule__Simple_selector__IdAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                     after(grammarAccess.getSimple_selectorAccess().getIdAssignment_1()); 

                    }


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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Alternatives"


    // $ANTLR start "rule__Pseudo__Alternatives"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:801:1: rule__Pseudo__Alternatives : ( ( ( rule__Pseudo__Group_0__0 ) ) | ( ( rule__Pseudo__Group_1__0 ) ) );
    public final void rule__Pseudo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:805:1: ( ( ( rule__Pseudo__Group_0__0 ) ) | ( ( rule__Pseudo__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==38) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_IDENT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:806:1: ( ( rule__Pseudo__Group_0__0 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:806:1: ( ( rule__Pseudo__Group_0__0 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:807:1: ( rule__Pseudo__Group_0__0 )
                    {
                     before(grammarAccess.getPseudoAccess().getGroup_0()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:808:1: ( rule__Pseudo__Group_0__0 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:808:2: rule__Pseudo__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Pseudo__Group_0__0_in_rule__Pseudo__Alternatives1646);
                    rule__Pseudo__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPseudoAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:812:6: ( ( rule__Pseudo__Group_1__0 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:812:6: ( ( rule__Pseudo__Group_1__0 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:813:1: ( rule__Pseudo__Group_1__0 )
                    {
                     before(grammarAccess.getPseudoAccess().getGroup_1()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:814:1: ( rule__Pseudo__Group_1__0 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:814:2: rule__Pseudo__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Pseudo__Group_1__0_in_rule__Pseudo__Alternatives1664);
                    rule__Pseudo__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPseudoAccess().getGroup_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo__Alternatives"


    // $ANTLR start "rule__Element_name__Alternatives"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:823:1: rule__Element_name__Alternatives : ( ( ( rule__Element_name__NameAssignment_0 ) ) | ( ( rule__Element_name__NameAssignment_1 ) ) );
    public final void rule__Element_name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:827:1: ( ( ( rule__Element_name__NameAssignment_0 ) ) | ( ( rule__Element_name__NameAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_IDENT) ) {
                alt6=1;
            }
            else if ( (LA6_0==45) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:828:1: ( ( rule__Element_name__NameAssignment_0 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:828:1: ( ( rule__Element_name__NameAssignment_0 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:829:1: ( rule__Element_name__NameAssignment_0 )
                    {
                     before(grammarAccess.getElement_nameAccess().getNameAssignment_0()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:830:1: ( rule__Element_name__NameAssignment_0 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:830:2: rule__Element_name__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Element_name__NameAssignment_0_in_rule__Element_name__Alternatives1697);
                    rule__Element_name__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElement_nameAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:834:6: ( ( rule__Element_name__NameAssignment_1 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:834:6: ( ( rule__Element_name__NameAssignment_1 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:835:1: ( rule__Element_name__NameAssignment_1 )
                    {
                     before(grammarAccess.getElement_nameAccess().getNameAssignment_1()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:836:1: ( rule__Element_name__NameAssignment_1 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:836:2: rule__Element_name__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Element_name__NameAssignment_1_in_rule__Element_name__Alternatives1715);
                    rule__Element_name__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getElement_nameAccess().getNameAssignment_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element_name__Alternatives"


    // $ANTLR start "rule__Expr__OperatorsAlternatives_1_0_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:845:1: rule__Expr__OperatorsAlternatives_1_0_0 : ( ( '/' ) | ( ',' ) );
    public final void rule__Expr__OperatorsAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:849:1: ( ( '/' ) | ( ',' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:850:1: ( '/' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:850:1: ( '/' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:851:1: '/'
                    {
                     before(grammarAccess.getExprAccess().getOperatorsSolidusKeyword_1_0_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Expr__OperatorsAlternatives_1_0_01749); 
                     after(grammarAccess.getExprAccess().getOperatorsSolidusKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:858:6: ( ',' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:858:6: ( ',' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:859:1: ','
                    {
                     before(grammarAccess.getExprAccess().getOperatorsCommaKeyword_1_0_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Expr__OperatorsAlternatives_1_0_01769); 
                     after(grammarAccess.getExprAccess().getOperatorsCommaKeyword_1_0_0_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__OperatorsAlternatives_1_0_0"


    // $ANTLR start "rule__Term__Alternatives"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:871:1: rule__Term__Alternatives : ( ( ( rule__Term__Group_0__0 ) ) | ( ( rule__Term__NameAssignment_1 ) ) | ( ( rule__Term__IdAssignment_2 ) ) | ( ( rule__Term__UriAssignment_3 ) ) | ( ( rule__Term__ColorAssignment_4 ) ) | ( ( rule__Term__FunctionAssignment_5 ) ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:875:1: ( ( ( rule__Term__Group_0__0 ) ) | ( ( rule__Term__NameAssignment_1 ) ) | ( ( rule__Term__IdAssignment_2 ) ) | ( ( rule__Term__UriAssignment_3 ) ) | ( ( rule__Term__ColorAssignment_4 ) ) | ( ( rule__Term__FunctionAssignment_5 ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 31:
            case 33:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==EOF||LA8_3==RULE_INT||(LA8_3>=RULE_STRING && LA8_3<=RULE_HEXDIGITS)||(LA8_3>=13 && LA8_3<=14)||LA8_3==31||LA8_3==33||(LA8_3>=35 && LA8_3<=36)||(LA8_3>=40 && LA8_3<=41)||LA8_3==46) ) {
                    alt8=3;
                }
                else if ( (LA8_3==39) ) {
                    alt8=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt8=4;
                }
                break;
            case RULE_HEXDIGITS:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:876:1: ( ( rule__Term__Group_0__0 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:876:1: ( ( rule__Term__Group_0__0 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:877:1: ( rule__Term__Group_0__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_0()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:878:1: ( rule__Term__Group_0__0 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:878:2: rule__Term__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_0__0_in_rule__Term__Alternatives1803);
                    rule__Term__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:882:6: ( ( rule__Term__NameAssignment_1 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:882:6: ( ( rule__Term__NameAssignment_1 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:883:1: ( rule__Term__NameAssignment_1 )
                    {
                     before(grammarAccess.getTermAccess().getNameAssignment_1()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:884:1: ( rule__Term__NameAssignment_1 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:884:2: rule__Term__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Term__NameAssignment_1_in_rule__Term__Alternatives1821);
                    rule__Term__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:888:6: ( ( rule__Term__IdAssignment_2 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:888:6: ( ( rule__Term__IdAssignment_2 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:889:1: ( rule__Term__IdAssignment_2 )
                    {
                     before(grammarAccess.getTermAccess().getIdAssignment_2()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:890:1: ( rule__Term__IdAssignment_2 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:890:2: rule__Term__IdAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Term__IdAssignment_2_in_rule__Term__Alternatives1839);
                    rule__Term__IdAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getIdAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:894:6: ( ( rule__Term__UriAssignment_3 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:894:6: ( ( rule__Term__UriAssignment_3 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:895:1: ( rule__Term__UriAssignment_3 )
                    {
                     before(grammarAccess.getTermAccess().getUriAssignment_3()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:896:1: ( rule__Term__UriAssignment_3 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:896:2: rule__Term__UriAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Term__UriAssignment_3_in_rule__Term__Alternatives1857);
                    rule__Term__UriAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getUriAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:900:6: ( ( rule__Term__ColorAssignment_4 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:900:6: ( ( rule__Term__ColorAssignment_4 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:901:1: ( rule__Term__ColorAssignment_4 )
                    {
                     before(grammarAccess.getTermAccess().getColorAssignment_4()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:902:1: ( rule__Term__ColorAssignment_4 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:902:2: rule__Term__ColorAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Term__ColorAssignment_4_in_rule__Term__Alternatives1875);
                    rule__Term__ColorAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getColorAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:906:6: ( ( rule__Term__FunctionAssignment_5 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:906:6: ( ( rule__Term__FunctionAssignment_5 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:907:1: ( rule__Term__FunctionAssignment_5 )
                    {
                     before(grammarAccess.getTermAccess().getFunctionAssignment_5()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:908:1: ( rule__Term__FunctionAssignment_5 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:908:2: rule__Term__FunctionAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Term__FunctionAssignment_5_in_rule__Term__Alternatives1893);
                    rule__Term__FunctionAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getFunctionAssignment_5()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__URI__Alternatives_3"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:917:1: rule__URI__Alternatives_3 : ( ( ( rule__URI__NameAssignment_3_0 ) ) | ( ( rule__URI__Group_3_1__0 ) ) );
    public final void rule__URI__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:921:1: ( ( ( rule__URI__NameAssignment_3_0 ) ) | ( ( rule__URI__Group_3_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==13||LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:922:1: ( ( rule__URI__NameAssignment_3_0 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:922:1: ( ( rule__URI__NameAssignment_3_0 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:923:1: ( rule__URI__NameAssignment_3_0 )
                    {
                     before(grammarAccess.getURIAccess().getNameAssignment_3_0()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:924:1: ( rule__URI__NameAssignment_3_0 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:924:2: rule__URI__NameAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__URI__NameAssignment_3_0_in_rule__URI__Alternatives_31926);
                    rule__URI__NameAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getURIAccess().getNameAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:928:6: ( ( rule__URI__Group_3_1__0 ) )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:928:6: ( ( rule__URI__Group_3_1__0 ) )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:929:1: ( rule__URI__Group_3_1__0 )
                    {
                     before(grammarAccess.getURIAccess().getGroup_3_1()); 
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:930:1: ( rule__URI__Group_3_1__0 )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:930:2: rule__URI__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__URI__Group_3_1__0_in_rule__URI__Alternatives_31944);
                    rule__URI__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getURIAccess().getGroup_3_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Alternatives_3"


    // $ANTLR start "rule__URI__Alternatives_3_1_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:939:1: rule__URI__Alternatives_3_1_0 : ( ( '\\\\' ) | ( '/' ) );
    public final void rule__URI__Alternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:943:1: ( ( '\\\\' ) | ( '/' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==13) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:944:1: ( '\\\\' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:944:1: ( '\\\\' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:945:1: '\\\\'
                    {
                     before(grammarAccess.getURIAccess().getReverseSolidusKeyword_3_1_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__URI__Alternatives_3_1_01978); 
                     after(grammarAccess.getURIAccess().getReverseSolidusKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:952:6: ( '/' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:952:6: ( '/' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:953:1: '/'
                    {
                     before(grammarAccess.getURIAccess().getSolidusKeyword_3_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__URI__Alternatives_3_1_01998); 
                     after(grammarAccess.getURIAccess().getSolidusKeyword_3_1_0_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Alternatives_3_1_0"


    // $ANTLR start "rule__Unary_numbers__Alternatives"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:965:1: rule__Unary_numbers__Alternatives : ( ( RULE_INT ) | ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) );
    public final void rule__Unary_numbers__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:969:1: ( ( RULE_INT ) | ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) )
            int alt11=8;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:970:1: ( RULE_INT )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:970:1: ( RULE_INT )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:971:1: RULE_INT
                    {
                     before(grammarAccess.getUnary_numbersAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Unary_numbers__Alternatives2032); 
                     after(grammarAccess.getUnary_numbersAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:976:6: ( rulePERCENTAGE )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:976:6: ( rulePERCENTAGE )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:977:1: rulePERCENTAGE
                    {
                     before(grammarAccess.getUnary_numbersAccess().getPERCENTAGEParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePERCENTAGE_in_rule__Unary_numbers__Alternatives2049);
                    rulePERCENTAGE();

                    state._fsp--;

                     after(grammarAccess.getUnary_numbersAccess().getPERCENTAGEParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:982:6: ( ruleLENGTH )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:982:6: ( ruleLENGTH )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:983:1: ruleLENGTH
                    {
                     before(grammarAccess.getUnary_numbersAccess().getLENGTHParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLENGTH_in_rule__Unary_numbers__Alternatives2066);
                    ruleLENGTH();

                    state._fsp--;

                     after(grammarAccess.getUnary_numbersAccess().getLENGTHParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:988:6: ( ruleEMS )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:988:6: ( ruleEMS )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:989:1: ruleEMS
                    {
                     before(grammarAccess.getUnary_numbersAccess().getEMSParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEMS_in_rule__Unary_numbers__Alternatives2083);
                    ruleEMS();

                    state._fsp--;

                     after(grammarAccess.getUnary_numbersAccess().getEMSParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:994:6: ( ruleEXS )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:994:6: ( ruleEXS )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:995:1: ruleEXS
                    {
                     before(grammarAccess.getUnary_numbersAccess().getEXSParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleEXS_in_rule__Unary_numbers__Alternatives2100);
                    ruleEXS();

                    state._fsp--;

                     after(grammarAccess.getUnary_numbersAccess().getEXSParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1000:6: ( ruleANGLE )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1000:6: ( ruleANGLE )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1001:1: ruleANGLE
                    {
                     before(grammarAccess.getUnary_numbersAccess().getANGLEParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleANGLE_in_rule__Unary_numbers__Alternatives2117);
                    ruleANGLE();

                    state._fsp--;

                     after(grammarAccess.getUnary_numbersAccess().getANGLEParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1006:6: ( ruleTIME )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1006:6: ( ruleTIME )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1007:1: ruleTIME
                    {
                     before(grammarAccess.getUnary_numbersAccess().getTIMEParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleTIME_in_rule__Unary_numbers__Alternatives2134);
                    ruleTIME();

                    state._fsp--;

                     after(grammarAccess.getUnary_numbersAccess().getTIMEParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1012:6: ( ruleFREQ )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1012:6: ( ruleFREQ )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1013:1: ruleFREQ
                    {
                     before(grammarAccess.getUnary_numbersAccess().getFREQParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleFREQ_in_rule__Unary_numbers__Alternatives2151);
                    ruleFREQ();

                    state._fsp--;

                     after(grammarAccess.getUnary_numbersAccess().getFREQParserRuleCall_7()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary_numbers__Alternatives"


    // $ANTLR start "rule__LENGTH__Alternatives_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1023:1: rule__LENGTH__Alternatives_1 : ( ( 'px' ) | ( 'cm' ) | ( 'mm' ) | ( 'in' ) | ( 'pt' ) | ( 'pc' ) );
    public final void rule__LENGTH__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1027:1: ( ( 'px' ) | ( 'cm' ) | ( 'mm' ) | ( 'in' ) | ( 'pt' ) | ( 'pc' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt12=1;
                }
                break;
            case 17:
                {
                alt12=2;
                }
                break;
            case 18:
                {
                alt12=3;
                }
                break;
            case 19:
                {
                alt12=4;
                }
                break;
            case 20:
                {
                alt12=5;
                }
                break;
            case 21:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1028:1: ( 'px' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1028:1: ( 'px' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1029:1: 'px'
                    {
                     before(grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 
                    match(input,16,FOLLOW_16_in_rule__LENGTH__Alternatives_12184); 
                     after(grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1036:6: ( 'cm' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1036:6: ( 'cm' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1037:1: 'cm'
                    {
                     before(grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 
                    match(input,17,FOLLOW_17_in_rule__LENGTH__Alternatives_12204); 
                     after(grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1044:6: ( 'mm' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1044:6: ( 'mm' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1045:1: 'mm'
                    {
                     before(grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 
                    match(input,18,FOLLOW_18_in_rule__LENGTH__Alternatives_12224); 
                     after(grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1052:6: ( 'in' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1052:6: ( 'in' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1053:1: 'in'
                    {
                     before(grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 
                    match(input,19,FOLLOW_19_in_rule__LENGTH__Alternatives_12244); 
                     after(grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1060:6: ( 'pt' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1060:6: ( 'pt' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1061:1: 'pt'
                    {
                     before(grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 
                    match(input,20,FOLLOW_20_in_rule__LENGTH__Alternatives_12264); 
                     after(grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1068:6: ( 'pc' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1068:6: ( 'pc' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1069:1: 'pc'
                    {
                     before(grammarAccess.getLENGTHAccess().getPcKeyword_1_5()); 
                    match(input,21,FOLLOW_21_in_rule__LENGTH__Alternatives_12284); 
                     after(grammarAccess.getLENGTHAccess().getPcKeyword_1_5()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Alternatives_1"


    // $ANTLR start "rule__ANGLE__Alternatives_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1081:1: rule__ANGLE__Alternatives_1 : ( ( 'deg' ) | ( 'rad' ) | ( 'grad' ) );
    public final void rule__ANGLE__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1085:1: ( ( 'deg' ) | ( 'rad' ) | ( 'grad' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1086:1: ( 'deg' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1086:1: ( 'deg' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1087:1: 'deg'
                    {
                     before(grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 
                    match(input,22,FOLLOW_22_in_rule__ANGLE__Alternatives_12319); 
                     after(grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1094:6: ( 'rad' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1094:6: ( 'rad' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1095:1: 'rad'
                    {
                     before(grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 
                    match(input,23,FOLLOW_23_in_rule__ANGLE__Alternatives_12339); 
                     after(grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1102:6: ( 'grad' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1102:6: ( 'grad' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1103:1: 'grad'
                    {
                     before(grammarAccess.getANGLEAccess().getGradKeyword_1_2()); 
                    match(input,24,FOLLOW_24_in_rule__ANGLE__Alternatives_12359); 
                     after(grammarAccess.getANGLEAccess().getGradKeyword_1_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Alternatives_1"


    // $ANTLR start "rule__TIME__Alternatives_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1115:1: rule__TIME__Alternatives_1 : ( ( 'ms' ) | ( 's' ) );
    public final void rule__TIME__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1119:1: ( ( 'ms' ) | ( 's' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            else if ( (LA14_0==26) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1120:1: ( 'ms' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1120:1: ( 'ms' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1121:1: 'ms'
                    {
                     before(grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 
                    match(input,25,FOLLOW_25_in_rule__TIME__Alternatives_12394); 
                     after(grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1128:6: ( 's' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1128:6: ( 's' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1129:1: 's'
                    {
                     before(grammarAccess.getTIMEAccess().getSKeyword_1_1()); 
                    match(input,26,FOLLOW_26_in_rule__TIME__Alternatives_12414); 
                     after(grammarAccess.getTIMEAccess().getSKeyword_1_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Alternatives_1"


    // $ANTLR start "rule__FREQ__Alternatives_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1141:1: rule__FREQ__Alternatives_1 : ( ( 'hz' ) | ( 'khz' ) );
    public final void rule__FREQ__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1145:1: ( ( 'hz' ) | ( 'khz' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1146:1: ( 'hz' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1146:1: ( 'hz' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1147:1: 'hz'
                    {
                     before(grammarAccess.getFREQAccess().getHzKeyword_1_0()); 
                    match(input,27,FOLLOW_27_in_rule__FREQ__Alternatives_12449); 
                     after(grammarAccess.getFREQAccess().getHzKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1154:6: ( 'khz' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1154:6: ( 'khz' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1155:1: 'khz'
                    {
                     before(grammarAccess.getFREQAccess().getKhzKeyword_1_1()); 
                    match(input,28,FOLLOW_28_in_rule__FREQ__Alternatives_12469); 
                     after(grammarAccess.getFREQAccess().getKhzKeyword_1_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Alternatives_1"


    // $ANTLR start "rule__Css_hash_class__TypeAlternatives_0_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1167:1: rule__Css_hash_class__TypeAlternatives_0_0 : ( ( '#' ) | ( '.' ) );
    public final void rule__Css_hash_class__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1171:1: ( ( '#' ) | ( '.' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1172:1: ( '#' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1172:1: ( '#' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1173:1: '#'
                    {
                     before(grammarAccess.getCss_hash_classAccess().getTypeNumberSignKeyword_0_0_0()); 
                    match(input,29,FOLLOW_29_in_rule__Css_hash_class__TypeAlternatives_0_02504); 
                     after(grammarAccess.getCss_hash_classAccess().getTypeNumberSignKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1180:6: ( '.' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1180:6: ( '.' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1181:1: '.'
                    {
                     before(grammarAccess.getCss_hash_classAccess().getTypeFullStopKeyword_0_0_1()); 
                    match(input,30,FOLLOW_30_in_rule__Css_hash_class__TypeAlternatives_0_02524); 
                     after(grammarAccess.getCss_hash_classAccess().getTypeFullStopKeyword_0_0_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_hash_class__TypeAlternatives_0_0"


    // $ANTLR start "rule__Combinator__Alternatives"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1193:1: rule__Combinator__Alternatives : ( ( '+' ) | ( '>' ) );
    public final void rule__Combinator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1197:1: ( ( '+' ) | ( '>' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1198:1: ( '+' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1198:1: ( '+' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1199:1: '+'
                    {
                     before(grammarAccess.getCombinatorAccess().getPlusSignKeyword_0()); 
                    match(input,31,FOLLOW_31_in_rule__Combinator__Alternatives2559); 
                     after(grammarAccess.getCombinatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1206:6: ( '>' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1206:6: ( '>' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1207:1: '>'
                    {
                     before(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_1()); 
                    match(input,32,FOLLOW_32_in_rule__Combinator__Alternatives2579); 
                     after(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combinator__Alternatives"


    // $ANTLR start "rule__Unary_operator__Alternatives"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1219:1: rule__Unary_operator__Alternatives : ( ( '-' ) | ( '+' ) );
    public final void rule__Unary_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1223:1: ( ( '-' ) | ( '+' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            else if ( (LA18_0==31) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1224:1: ( '-' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1224:1: ( '-' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1225:1: '-'
                    {
                     before(grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                    match(input,33,FOLLOW_33_in_rule__Unary_operator__Alternatives2614); 
                     after(grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1232:6: ( '+' )
                    {
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1232:6: ( '+' )
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1233:1: '+'
                    {
                     before(grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 
                    match(input,31,FOLLOW_31_in_rule__Unary_operator__Alternatives2634); 
                     after(grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary_operator__Alternatives"


    // $ANTLR start "rule__Stylesheet__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1247:1: rule__Stylesheet__Group__0 : rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 ;
    public final void rule__Stylesheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1251:1: ( rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1252:2: rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__0__Impl_in_rule__Stylesheet__Group__02666);
            rule__Stylesheet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stylesheet__Group__1_in_rule__Stylesheet__Group__02669);
            rule__Stylesheet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__0"


    // $ANTLR start "rule__Stylesheet__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1259:1: rule__Stylesheet__Group__0__Impl : ( ( rule__Stylesheet__LocationAssignment_0 )? ) ;
    public final void rule__Stylesheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1263:1: ( ( ( rule__Stylesheet__LocationAssignment_0 )? ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1264:1: ( ( rule__Stylesheet__LocationAssignment_0 )? )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1264:1: ( ( rule__Stylesheet__LocationAssignment_0 )? )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1265:1: ( rule__Stylesheet__LocationAssignment_0 )?
            {
             before(grammarAccess.getStylesheetAccess().getLocationAssignment_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1266:1: ( rule__Stylesheet__LocationAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1266:2: rule__Stylesheet__LocationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__LocationAssignment_0_in_rule__Stylesheet__Group__0__Impl2696);
                    rule__Stylesheet__LocationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStylesheetAccess().getLocationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__0__Impl"


    // $ANTLR start "rule__Stylesheet__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1276:1: rule__Stylesheet__Group__1 : rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 ;
    public final void rule__Stylesheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1280:1: ( rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1281:2: rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__1__Impl_in_rule__Stylesheet__Group__12727);
            rule__Stylesheet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stylesheet__Group__2_in_rule__Stylesheet__Group__12730);
            rule__Stylesheet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__1"


    // $ANTLR start "rule__Stylesheet__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1288:1: rule__Stylesheet__Group__1__Impl : ( ( rule__Stylesheet__ImportNameAssignment_1 )* ) ;
    public final void rule__Stylesheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1292:1: ( ( ( rule__Stylesheet__ImportNameAssignment_1 )* ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1293:1: ( ( rule__Stylesheet__ImportNameAssignment_1 )* )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1293:1: ( ( rule__Stylesheet__ImportNameAssignment_1 )* )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1294:1: ( rule__Stylesheet__ImportNameAssignment_1 )*
            {
             before(grammarAccess.getStylesheetAccess().getImportNameAssignment_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1295:1: ( rule__Stylesheet__ImportNameAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1295:2: rule__Stylesheet__ImportNameAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Stylesheet__ImportNameAssignment_1_in_rule__Stylesheet__Group__1__Impl2757);
            	    rule__Stylesheet__ImportNameAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getStylesheetAccess().getImportNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__1__Impl"


    // $ANTLR start "rule__Stylesheet__Group__2"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1305:1: rule__Stylesheet__Group__2 : rule__Stylesheet__Group__2__Impl ;
    public final void rule__Stylesheet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1309:1: ( rule__Stylesheet__Group__2__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1310:2: rule__Stylesheet__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__2__Impl_in_rule__Stylesheet__Group__22788);
            rule__Stylesheet__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__2"


    // $ANTLR start "rule__Stylesheet__Group__2__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1316:1: rule__Stylesheet__Group__2__Impl : ( ( rule__Stylesheet__RulesetAssignment_2 )* ) ;
    public final void rule__Stylesheet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1320:1: ( ( ( rule__Stylesheet__RulesetAssignment_2 )* ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1321:1: ( ( rule__Stylesheet__RulesetAssignment_2 )* )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1321:1: ( ( rule__Stylesheet__RulesetAssignment_2 )* )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1322:1: ( rule__Stylesheet__RulesetAssignment_2 )*
            {
             before(grammarAccess.getStylesheetAccess().getRulesetAssignment_2()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1323:1: ( rule__Stylesheet__RulesetAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_IDENT||(LA21_0>=29 && LA21_0<=30)||LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1323:2: rule__Stylesheet__RulesetAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Stylesheet__RulesetAssignment_2_in_rule__Stylesheet__Group__2__Impl2815);
            	    rule__Stylesheet__RulesetAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStylesheetAccess().getRulesetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__2__Impl"


    // $ANTLR start "rule__Rules__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1339:1: rule__Rules__Group__0 : rule__Rules__Group__0__Impl rule__Rules__Group__1 ;
    public final void rule__Rules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1343:1: ( rule__Rules__Group__0__Impl rule__Rules__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1344:2: rule__Rules__Group__0__Impl rule__Rules__Group__1
            {
            pushFollow(FOLLOW_rule__Rules__Group__0__Impl_in_rule__Rules__Group__02852);
            rule__Rules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rules__Group__1_in_rule__Rules__Group__02855);
            rule__Rules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0"


    // $ANTLR start "rule__Rules__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1351:1: rule__Rules__Group__0__Impl : ( ( rule__Rules__SelectorsAssignment_0 ) ) ;
    public final void rule__Rules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1355:1: ( ( ( rule__Rules__SelectorsAssignment_0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1356:1: ( ( rule__Rules__SelectorsAssignment_0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1356:1: ( ( rule__Rules__SelectorsAssignment_0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1357:1: ( rule__Rules__SelectorsAssignment_0 )
            {
             before(grammarAccess.getRulesAccess().getSelectorsAssignment_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1358:1: ( rule__Rules__SelectorsAssignment_0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1358:2: rule__Rules__SelectorsAssignment_0
            {
            pushFollow(FOLLOW_rule__Rules__SelectorsAssignment_0_in_rule__Rules__Group__0__Impl2882);
            rule__Rules__SelectorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getSelectorsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0__Impl"


    // $ANTLR start "rule__Rules__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1368:1: rule__Rules__Group__1 : rule__Rules__Group__1__Impl rule__Rules__Group__2 ;
    public final void rule__Rules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1372:1: ( rule__Rules__Group__1__Impl rule__Rules__Group__2 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1373:2: rule__Rules__Group__1__Impl rule__Rules__Group__2
            {
            pushFollow(FOLLOW_rule__Rules__Group__1__Impl_in_rule__Rules__Group__12912);
            rule__Rules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rules__Group__2_in_rule__Rules__Group__12915);
            rule__Rules__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1"


    // $ANTLR start "rule__Rules__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1380:1: rule__Rules__Group__1__Impl : ( ( rule__Rules__Group_1__0 )* ) ;
    public final void rule__Rules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1384:1: ( ( ( rule__Rules__Group_1__0 )* ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1385:1: ( ( rule__Rules__Group_1__0 )* )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1385:1: ( ( rule__Rules__Group_1__0 )* )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1386:1: ( rule__Rules__Group_1__0 )*
            {
             before(grammarAccess.getRulesAccess().getGroup_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1387:1: ( rule__Rules__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==14) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1387:2: rule__Rules__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Rules__Group_1__0_in_rule__Rules__Group__1__Impl2942);
            	    rule__Rules__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getRulesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1__Impl"


    // $ANTLR start "rule__Rules__Group__2"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1397:1: rule__Rules__Group__2 : rule__Rules__Group__2__Impl rule__Rules__Group__3 ;
    public final void rule__Rules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1401:1: ( rule__Rules__Group__2__Impl rule__Rules__Group__3 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1402:2: rule__Rules__Group__2__Impl rule__Rules__Group__3
            {
            pushFollow(FOLLOW_rule__Rules__Group__2__Impl_in_rule__Rules__Group__22973);
            rule__Rules__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rules__Group__3_in_rule__Rules__Group__22976);
            rule__Rules__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2"


    // $ANTLR start "rule__Rules__Group__2__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1409:1: rule__Rules__Group__2__Impl : ( '{' ) ;
    public final void rule__Rules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1413:1: ( ( '{' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1414:1: ( '{' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1414:1: ( '{' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1415:1: '{'
            {
             before(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Rules__Group__2__Impl3004); 
             after(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2__Impl"


    // $ANTLR start "rule__Rules__Group__3"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1428:1: rule__Rules__Group__3 : rule__Rules__Group__3__Impl rule__Rules__Group__4 ;
    public final void rule__Rules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1432:1: ( rule__Rules__Group__3__Impl rule__Rules__Group__4 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1433:2: rule__Rules__Group__3__Impl rule__Rules__Group__4
            {
            pushFollow(FOLLOW_rule__Rules__Group__3__Impl_in_rule__Rules__Group__33035);
            rule__Rules__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rules__Group__4_in_rule__Rules__Group__33038);
            rule__Rules__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__3"


    // $ANTLR start "rule__Rules__Group__3__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1440:1: rule__Rules__Group__3__Impl : ( ( rule__Rules__DeclarationsAssignment_3 )? ) ;
    public final void rule__Rules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1444:1: ( ( ( rule__Rules__DeclarationsAssignment_3 )? ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1445:1: ( ( rule__Rules__DeclarationsAssignment_3 )? )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1445:1: ( ( rule__Rules__DeclarationsAssignment_3 )? )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1446:1: ( rule__Rules__DeclarationsAssignment_3 )?
            {
             before(grammarAccess.getRulesAccess().getDeclarationsAssignment_3()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1447:1: ( rule__Rules__DeclarationsAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_IDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1447:2: rule__Rules__DeclarationsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Rules__DeclarationsAssignment_3_in_rule__Rules__Group__3__Impl3065);
                    rule__Rules__DeclarationsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRulesAccess().getDeclarationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__3__Impl"


    // $ANTLR start "rule__Rules__Group__4"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1457:1: rule__Rules__Group__4 : rule__Rules__Group__4__Impl rule__Rules__Group__5 ;
    public final void rule__Rules__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1461:1: ( rule__Rules__Group__4__Impl rule__Rules__Group__5 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1462:2: rule__Rules__Group__4__Impl rule__Rules__Group__5
            {
            pushFollow(FOLLOW_rule__Rules__Group__4__Impl_in_rule__Rules__Group__43096);
            rule__Rules__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rules__Group__5_in_rule__Rules__Group__43099);
            rule__Rules__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__4"


    // $ANTLR start "rule__Rules__Group__4__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1469:1: rule__Rules__Group__4__Impl : ( ( rule__Rules__Group_4__0 )* ) ;
    public final void rule__Rules__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1473:1: ( ( ( rule__Rules__Group_4__0 )* ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1474:1: ( ( rule__Rules__Group_4__0 )* )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1474:1: ( ( rule__Rules__Group_4__0 )* )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1475:1: ( rule__Rules__Group_4__0 )*
            {
             before(grammarAccess.getRulesAccess().getGroup_4()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1476:1: ( rule__Rules__Group_4__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1476:2: rule__Rules__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Rules__Group_4__0_in_rule__Rules__Group__4__Impl3126);
            	    rule__Rules__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getRulesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__4__Impl"


    // $ANTLR start "rule__Rules__Group__5"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1486:1: rule__Rules__Group__5 : rule__Rules__Group__5__Impl ;
    public final void rule__Rules__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1490:1: ( rule__Rules__Group__5__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1491:2: rule__Rules__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Rules__Group__5__Impl_in_rule__Rules__Group__53157);
            rule__Rules__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__5"


    // $ANTLR start "rule__Rules__Group__5__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1497:1: rule__Rules__Group__5__Impl : ( '}' ) ;
    public final void rule__Rules__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1501:1: ( ( '}' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1502:1: ( '}' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1502:1: ( '}' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1503:1: '}'
            {
             before(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__Rules__Group__5__Impl3185); 
             after(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__5__Impl"


    // $ANTLR start "rule__Rules__Group_1__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1528:1: rule__Rules__Group_1__0 : rule__Rules__Group_1__0__Impl rule__Rules__Group_1__1 ;
    public final void rule__Rules__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1532:1: ( rule__Rules__Group_1__0__Impl rule__Rules__Group_1__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1533:2: rule__Rules__Group_1__0__Impl rule__Rules__Group_1__1
            {
            pushFollow(FOLLOW_rule__Rules__Group_1__0__Impl_in_rule__Rules__Group_1__03228);
            rule__Rules__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rules__Group_1__1_in_rule__Rules__Group_1__03231);
            rule__Rules__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group_1__0"


    // $ANTLR start "rule__Rules__Group_1__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1540:1: rule__Rules__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Rules__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1544:1: ( ( ',' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1545:1: ( ',' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1545:1: ( ',' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1546:1: ','
            {
             before(grammarAccess.getRulesAccess().getCommaKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__Rules__Group_1__0__Impl3259); 
             after(grammarAccess.getRulesAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group_1__0__Impl"


    // $ANTLR start "rule__Rules__Group_1__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1559:1: rule__Rules__Group_1__1 : rule__Rules__Group_1__1__Impl ;
    public final void rule__Rules__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1563:1: ( rule__Rules__Group_1__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1564:2: rule__Rules__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Rules__Group_1__1__Impl_in_rule__Rules__Group_1__13290);
            rule__Rules__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group_1__1"


    // $ANTLR start "rule__Rules__Group_1__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1570:1: rule__Rules__Group_1__1__Impl : ( ( rule__Rules__SelectorsAssignment_1_1 ) ) ;
    public final void rule__Rules__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1574:1: ( ( ( rule__Rules__SelectorsAssignment_1_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1575:1: ( ( rule__Rules__SelectorsAssignment_1_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1575:1: ( ( rule__Rules__SelectorsAssignment_1_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1576:1: ( rule__Rules__SelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRulesAccess().getSelectorsAssignment_1_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1577:1: ( rule__Rules__SelectorsAssignment_1_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1577:2: rule__Rules__SelectorsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Rules__SelectorsAssignment_1_1_in_rule__Rules__Group_1__1__Impl3317);
            rule__Rules__SelectorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getSelectorsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group_1__1__Impl"


    // $ANTLR start "rule__Rules__Group_4__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1591:1: rule__Rules__Group_4__0 : rule__Rules__Group_4__0__Impl rule__Rules__Group_4__1 ;
    public final void rule__Rules__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1595:1: ( rule__Rules__Group_4__0__Impl rule__Rules__Group_4__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1596:2: rule__Rules__Group_4__0__Impl rule__Rules__Group_4__1
            {
            pushFollow(FOLLOW_rule__Rules__Group_4__0__Impl_in_rule__Rules__Group_4__03351);
            rule__Rules__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rules__Group_4__1_in_rule__Rules__Group_4__03354);
            rule__Rules__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group_4__0"


    // $ANTLR start "rule__Rules__Group_4__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1603:1: rule__Rules__Group_4__0__Impl : ( ';' ) ;
    public final void rule__Rules__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1607:1: ( ( ';' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1608:1: ( ';' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1608:1: ( ';' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1609:1: ';'
            {
             before(grammarAccess.getRulesAccess().getSemicolonKeyword_4_0()); 
            match(input,36,FOLLOW_36_in_rule__Rules__Group_4__0__Impl3382); 
             after(grammarAccess.getRulesAccess().getSemicolonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group_4__0__Impl"


    // $ANTLR start "rule__Rules__Group_4__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1622:1: rule__Rules__Group_4__1 : rule__Rules__Group_4__1__Impl ;
    public final void rule__Rules__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1626:1: ( rule__Rules__Group_4__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1627:2: rule__Rules__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Rules__Group_4__1__Impl_in_rule__Rules__Group_4__13413);
            rule__Rules__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group_4__1"


    // $ANTLR start "rule__Rules__Group_4__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1633:1: rule__Rules__Group_4__1__Impl : ( ( rule__Rules__DeclarationsAssignment_4_1 )? ) ;
    public final void rule__Rules__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1637:1: ( ( ( rule__Rules__DeclarationsAssignment_4_1 )? ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1638:1: ( ( rule__Rules__DeclarationsAssignment_4_1 )? )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1638:1: ( ( rule__Rules__DeclarationsAssignment_4_1 )? )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1639:1: ( rule__Rules__DeclarationsAssignment_4_1 )?
            {
             before(grammarAccess.getRulesAccess().getDeclarationsAssignment_4_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1640:1: ( rule__Rules__DeclarationsAssignment_4_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_IDENT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1640:2: rule__Rules__DeclarationsAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Rules__DeclarationsAssignment_4_1_in_rule__Rules__Group_4__1__Impl3440);
                    rule__Rules__DeclarationsAssignment_4_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRulesAccess().getDeclarationsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group_4__1__Impl"


    // $ANTLR start "rule__Css_import__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1654:1: rule__Css_import__Group__0 : rule__Css_import__Group__0__Impl rule__Css_import__Group__1 ;
    public final void rule__Css_import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1658:1: ( rule__Css_import__Group__0__Impl rule__Css_import__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1659:2: rule__Css_import__Group__0__Impl rule__Css_import__Group__1
            {
            pushFollow(FOLLOW_rule__Css_import__Group__0__Impl_in_rule__Css_import__Group__03475);
            rule__Css_import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_import__Group__1_in_rule__Css_import__Group__03478);
            rule__Css_import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_import__Group__0"


    // $ANTLR start "rule__Css_import__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1666:1: rule__Css_import__Group__0__Impl : ( '@import' ) ;
    public final void rule__Css_import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1670:1: ( ( '@import' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1671:1: ( '@import' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1671:1: ( '@import' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1672:1: '@import'
            {
             before(grammarAccess.getCss_importAccess().getImportKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Css_import__Group__0__Impl3506); 
             after(grammarAccess.getCss_importAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_import__Group__0__Impl"


    // $ANTLR start "rule__Css_import__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1685:1: rule__Css_import__Group__1 : rule__Css_import__Group__1__Impl rule__Css_import__Group__2 ;
    public final void rule__Css_import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1689:1: ( rule__Css_import__Group__1__Impl rule__Css_import__Group__2 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1690:2: rule__Css_import__Group__1__Impl rule__Css_import__Group__2
            {
            pushFollow(FOLLOW_rule__Css_import__Group__1__Impl_in_rule__Css_import__Group__13537);
            rule__Css_import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_import__Group__2_in_rule__Css_import__Group__13540);
            rule__Css_import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_import__Group__1"


    // $ANTLR start "rule__Css_import__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1697:1: rule__Css_import__Group__1__Impl : ( ( rule__Css_import__Alternatives_1 ) ) ;
    public final void rule__Css_import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1701:1: ( ( ( rule__Css_import__Alternatives_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1702:1: ( ( rule__Css_import__Alternatives_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1702:1: ( ( rule__Css_import__Alternatives_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1703:1: ( rule__Css_import__Alternatives_1 )
            {
             before(grammarAccess.getCss_importAccess().getAlternatives_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1704:1: ( rule__Css_import__Alternatives_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1704:2: rule__Css_import__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Css_import__Alternatives_1_in_rule__Css_import__Group__1__Impl3567);
            rule__Css_import__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCss_importAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_import__Group__1__Impl"


    // $ANTLR start "rule__Css_import__Group__2"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1714:1: rule__Css_import__Group__2 : rule__Css_import__Group__2__Impl ;
    public final void rule__Css_import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1718:1: ( rule__Css_import__Group__2__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1719:2: rule__Css_import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Css_import__Group__2__Impl_in_rule__Css_import__Group__23597);
            rule__Css_import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_import__Group__2"


    // $ANTLR start "rule__Css_import__Group__2__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1725:1: rule__Css_import__Group__2__Impl : ( ';' ) ;
    public final void rule__Css_import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1729:1: ( ( ';' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1730:1: ( ';' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1730:1: ( ';' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1731:1: ';'
            {
             before(grammarAccess.getCss_importAccess().getSemicolonKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__Css_import__Group__2__Impl3625); 
             after(grammarAccess.getCss_importAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_import__Group__2__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1750:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1754:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1755:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__03662);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__03665);
            rule__Selector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0"


    // $ANTLR start "rule__Selector__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1762:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1766:1: ( ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1767:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1767:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1768:1: ( rule__Selector__SimpleselectorsAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1769:1: ( rule__Selector__SimpleselectorsAssignment_0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1769:2: rule__Selector__SimpleselectorsAssignment_0
            {
            pushFollow(FOLLOW_rule__Selector__SimpleselectorsAssignment_0_in_rule__Selector__Group__0__Impl3692);
            rule__Selector__SimpleselectorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1779:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1783:1: ( rule__Selector__Group__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1784:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__13722);
            rule__Selector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1"


    // $ANTLR start "rule__Selector__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1790:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Alternatives_1 )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1794:1: ( ( ( rule__Selector__Alternatives_1 )? ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1795:1: ( ( rule__Selector__Alternatives_1 )? )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1795:1: ( ( rule__Selector__Alternatives_1 )? )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1796:1: ( rule__Selector__Alternatives_1 )?
            {
             before(grammarAccess.getSelectorAccess().getAlternatives_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1797:1: ( rule__Selector__Alternatives_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_WS||(LA26_0>=31 && LA26_0<=32)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1797:2: rule__Selector__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Selector__Alternatives_1_in_rule__Selector__Group__1__Impl3749);
                    rule__Selector__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_0__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1811:1: rule__Selector__Group_1_0__0 : rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 ;
    public final void rule__Selector__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1815:1: ( rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1816:2: rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_0__0__Impl_in_rule__Selector__Group_1_0__03784);
            rule__Selector__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1_0__1_in_rule__Selector__Group_1_0__03787);
            rule__Selector__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__0"


    // $ANTLR start "rule__Selector__Group_1_0__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1823:1: rule__Selector__Group_1_0__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) ;
    public final void rule__Selector__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1827:1: ( ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1828:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1828:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1829:1: ( rule__Selector__CombinatorAssignment_1_0_0 )
            {
             before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1830:1: ( rule__Selector__CombinatorAssignment_1_0_0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1830:2: rule__Selector__CombinatorAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Selector__CombinatorAssignment_1_0_0_in_rule__Selector__Group_1_0__0__Impl3814);
            rule__Selector__CombinatorAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_0__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1840:1: rule__Selector__Group_1_0__1 : rule__Selector__Group_1_0__1__Impl ;
    public final void rule__Selector__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1844:1: ( rule__Selector__Group_1_0__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1845:2: rule__Selector__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_0__1__Impl_in_rule__Selector__Group_1_0__13844);
            rule__Selector__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__1"


    // $ANTLR start "rule__Selector__Group_1_0__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1851:1: rule__Selector__Group_1_0__1__Impl : ( ( rule__Selector__SelectorAssignment_1_0_1 ) ) ;
    public final void rule__Selector__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1855:1: ( ( ( rule__Selector__SelectorAssignment_1_0_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1856:1: ( ( rule__Selector__SelectorAssignment_1_0_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1856:1: ( ( rule__Selector__SelectorAssignment_1_0_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1857:1: ( rule__Selector__SelectorAssignment_1_0_1 )
            {
             before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1858:1: ( rule__Selector__SelectorAssignment_1_0_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1858:2: rule__Selector__SelectorAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Selector__SelectorAssignment_1_0_1_in_rule__Selector__Group_1_0__1__Impl3871);
            rule__Selector__SelectorAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1872:1: rule__Selector__Group_1_1__0 : rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 ;
    public final void rule__Selector__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1876:1: ( rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1877:2: rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1__0__Impl_in_rule__Selector__Group_1_1__03905);
            rule__Selector__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1_1__1_in_rule__Selector__Group_1_1__03908);
            rule__Selector__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__0"


    // $ANTLR start "rule__Selector__Group_1_1__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1884:1: rule__Selector__Group_1_1__0__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__Selector__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1888:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1889:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1889:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1890:1: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1890:1: ( ( RULE_WS ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1891:1: ( RULE_WS )
            {
             before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1892:1: ( RULE_WS )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1892:3: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl3938); 

            }

             after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 

            }

            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1895:1: ( ( RULE_WS )* )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1896:1: ( RULE_WS )*
            {
             before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1897:1: ( RULE_WS )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_WS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1897:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl3951); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1908:1: rule__Selector__Group_1_1__1 : rule__Selector__Group_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1912:1: ( rule__Selector__Group_1_1__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1913:2: rule__Selector__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1__1__Impl_in_rule__Selector__Group_1_1__13984);
            rule__Selector__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__1"


    // $ANTLR start "rule__Selector__Group_1_1__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1919:1: rule__Selector__Group_1_1__1__Impl : ( ( rule__Selector__Group_1_1_1__0 )? ) ;
    public final void rule__Selector__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1923:1: ( ( ( rule__Selector__Group_1_1_1__0 )? ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1924:1: ( ( rule__Selector__Group_1_1_1__0 )? )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1924:1: ( ( rule__Selector__Group_1_1_1__0 )? )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1925:1: ( rule__Selector__Group_1_1_1__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_1_1_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1926:1: ( rule__Selector__Group_1_1_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_IDENT||(LA28_0>=29 && LA28_0<=32)||LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1926:2: rule__Selector__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_1_1__0_in_rule__Selector__Group_1_1__1__Impl4011);
                    rule__Selector__Group_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_1_1__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1940:1: rule__Selector__Group_1_1_1__0 : rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 ;
    public final void rule__Selector__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1944:1: ( rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1945:2: rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1_1__0__Impl_in_rule__Selector__Group_1_1_1__04046);
            rule__Selector__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1_1_1__1_in_rule__Selector__Group_1_1_1__04049);
            rule__Selector__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__0"


    // $ANTLR start "rule__Selector__Group_1_1_1__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1952:1: rule__Selector__Group_1_1_1__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? ) ;
    public final void rule__Selector__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1956:1: ( ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1957:1: ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1957:1: ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1958:1: ( rule__Selector__CombinatorAssignment_1_1_1_0 )?
            {
             before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1959:1: ( rule__Selector__CombinatorAssignment_1_1_1_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=31 && LA29_0<=32)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1959:2: rule__Selector__CombinatorAssignment_1_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Selector__CombinatorAssignment_1_1_1_0_in_rule__Selector__Group_1_1_1__0__Impl4076);
                    rule__Selector__CombinatorAssignment_1_1_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_1_1__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1969:1: rule__Selector__Group_1_1_1__1 : rule__Selector__Group_1_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1973:1: ( rule__Selector__Group_1_1_1__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1974:2: rule__Selector__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1_1__1__Impl_in_rule__Selector__Group_1_1_1__14107);
            rule__Selector__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__1"


    // $ANTLR start "rule__Selector__Group_1_1_1__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1980:1: rule__Selector__Group_1_1_1__1__Impl : ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) ) ;
    public final void rule__Selector__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1984:1: ( ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1985:1: ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1985:1: ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1986:1: ( rule__Selector__SelectorAssignment_1_1_1_1 )
            {
             before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_1_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1987:1: ( rule__Selector__SelectorAssignment_1_1_1_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:1987:2: rule__Selector__SelectorAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Selector__SelectorAssignment_1_1_1_1_in_rule__Selector__Group_1_1_1__1__Impl4134);
            rule__Selector__SelectorAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Simple_selector__Group_0__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2001:1: rule__Simple_selector__Group_0__0 : rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1 ;
    public final void rule__Simple_selector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2005:1: ( rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2006:2: rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1
            {
            pushFollow(FOLLOW_rule__Simple_selector__Group_0__0__Impl_in_rule__Simple_selector__Group_0__04168);
            rule__Simple_selector__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_selector__Group_0__1_in_rule__Simple_selector__Group_0__04171);
            rule__Simple_selector__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__0"


    // $ANTLR start "rule__Simple_selector__Group_0__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2013:1: rule__Simple_selector__Group_0__0__Impl : ( ( rule__Simple_selector__ElementAssignment_0_0 ) ) ;
    public final void rule__Simple_selector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2017:1: ( ( ( rule__Simple_selector__ElementAssignment_0_0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2018:1: ( ( rule__Simple_selector__ElementAssignment_0_0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2018:1: ( ( rule__Simple_selector__ElementAssignment_0_0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2019:1: ( rule__Simple_selector__ElementAssignment_0_0 )
            {
             before(grammarAccess.getSimple_selectorAccess().getElementAssignment_0_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2020:1: ( rule__Simple_selector__ElementAssignment_0_0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2020:2: rule__Simple_selector__ElementAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Simple_selector__ElementAssignment_0_0_in_rule__Simple_selector__Group_0__0__Impl4198);
            rule__Simple_selector__ElementAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_selectorAccess().getElementAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__0__Impl"


    // $ANTLR start "rule__Simple_selector__Group_0__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2030:1: rule__Simple_selector__Group_0__1 : rule__Simple_selector__Group_0__1__Impl rule__Simple_selector__Group_0__2 ;
    public final void rule__Simple_selector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2034:1: ( rule__Simple_selector__Group_0__1__Impl rule__Simple_selector__Group_0__2 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2035:2: rule__Simple_selector__Group_0__1__Impl rule__Simple_selector__Group_0__2
            {
            pushFollow(FOLLOW_rule__Simple_selector__Group_0__1__Impl_in_rule__Simple_selector__Group_0__14228);
            rule__Simple_selector__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_selector__Group_0__2_in_rule__Simple_selector__Group_0__14231);
            rule__Simple_selector__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__1"


    // $ANTLR start "rule__Simple_selector__Group_0__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2042:1: rule__Simple_selector__Group_0__1__Impl : ( ( rule__Simple_selector__IdAssignment_0_1 )* ) ;
    public final void rule__Simple_selector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2046:1: ( ( ( rule__Simple_selector__IdAssignment_0_1 )* ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2047:1: ( ( rule__Simple_selector__IdAssignment_0_1 )* )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2047:1: ( ( rule__Simple_selector__IdAssignment_0_1 )* )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2048:1: ( rule__Simple_selector__IdAssignment_0_1 )*
            {
             before(grammarAccess.getSimple_selectorAccess().getIdAssignment_0_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2049:1: ( rule__Simple_selector__IdAssignment_0_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=29 && LA30_0<=30)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2049:2: rule__Simple_selector__IdAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Simple_selector__IdAssignment_0_1_in_rule__Simple_selector__Group_0__1__Impl4258);
            	    rule__Simple_selector__IdAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSimple_selectorAccess().getIdAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__1__Impl"


    // $ANTLR start "rule__Simple_selector__Group_0__2"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2059:1: rule__Simple_selector__Group_0__2 : rule__Simple_selector__Group_0__2__Impl ;
    public final void rule__Simple_selector__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2063:1: ( rule__Simple_selector__Group_0__2__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2064:2: rule__Simple_selector__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Simple_selector__Group_0__2__Impl_in_rule__Simple_selector__Group_0__24289);
            rule__Simple_selector__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__2"


    // $ANTLR start "rule__Simple_selector__Group_0__2__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2070:1: rule__Simple_selector__Group_0__2__Impl : ( ( rule__Simple_selector__PseudoAssignment_0_2 )* ) ;
    public final void rule__Simple_selector__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2074:1: ( ( ( rule__Simple_selector__PseudoAssignment_0_2 )* ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2075:1: ( ( rule__Simple_selector__PseudoAssignment_0_2 )* )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2075:1: ( ( rule__Simple_selector__PseudoAssignment_0_2 )* )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2076:1: ( rule__Simple_selector__PseudoAssignment_0_2 )*
            {
             before(grammarAccess.getSimple_selectorAccess().getPseudoAssignment_0_2()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2077:1: ( rule__Simple_selector__PseudoAssignment_0_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_IDENT||LA31_0==38) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2077:2: rule__Simple_selector__PseudoAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_rule__Simple_selector__PseudoAssignment_0_2_in_rule__Simple_selector__Group_0__2__Impl4316);
            	    rule__Simple_selector__PseudoAssignment_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSimple_selectorAccess().getPseudoAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__2__Impl"


    // $ANTLR start "rule__Pseudo__Group_0__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2093:1: rule__Pseudo__Group_0__0 : rule__Pseudo__Group_0__0__Impl rule__Pseudo__Group_0__1 ;
    public final void rule__Pseudo__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2097:1: ( rule__Pseudo__Group_0__0__Impl rule__Pseudo__Group_0__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2098:2: rule__Pseudo__Group_0__0__Impl rule__Pseudo__Group_0__1
            {
            pushFollow(FOLLOW_rule__Pseudo__Group_0__0__Impl_in_rule__Pseudo__Group_0__04353);
            rule__Pseudo__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pseudo__Group_0__1_in_rule__Pseudo__Group_0__04356);
            rule__Pseudo__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo__Group_0__0"


    // $ANTLR start "rule__Pseudo__Group_0__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2105:1: rule__Pseudo__Group_0__0__Impl : ( ':' ) ;
    public final void rule__Pseudo__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2109:1: ( ( ':' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2110:1: ( ':' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2110:1: ( ':' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2111:1: ':'
            {
             before(grammarAccess.getPseudoAccess().getColonKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Pseudo__Group_0__0__Impl4384); 
             after(grammarAccess.getPseudoAccess().getColonKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo__Group_0__0__Impl"


    // $ANTLR start "rule__Pseudo__Group_0__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2124:1: rule__Pseudo__Group_0__1 : rule__Pseudo__Group_0__1__Impl ;
    public final void rule__Pseudo__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2128:1: ( rule__Pseudo__Group_0__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2129:2: rule__Pseudo__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Pseudo__Group_0__1__Impl_in_rule__Pseudo__Group_0__14415);
            rule__Pseudo__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo__Group_0__1"


    // $ANTLR start "rule__Pseudo__Group_0__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2135:1: rule__Pseudo__Group_0__1__Impl : ( ( rule__Pseudo__NameAssignment_0_1 ) ) ;
    public final void rule__Pseudo__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2139:1: ( ( ( rule__Pseudo__NameAssignment_0_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2140:1: ( ( rule__Pseudo__NameAssignment_0_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2140:1: ( ( rule__Pseudo__NameAssignment_0_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2141:1: ( rule__Pseudo__NameAssignment_0_1 )
            {
             before(grammarAccess.getPseudoAccess().getNameAssignment_0_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2142:1: ( rule__Pseudo__NameAssignment_0_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2142:2: rule__Pseudo__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Pseudo__NameAssignment_0_1_in_rule__Pseudo__Group_0__1__Impl4442);
            rule__Pseudo__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPseudoAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo__Group_0__1__Impl"


    // $ANTLR start "rule__Pseudo__Group_1__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2156:1: rule__Pseudo__Group_1__0 : rule__Pseudo__Group_1__0__Impl rule__Pseudo__Group_1__1 ;
    public final void rule__Pseudo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2160:1: ( rule__Pseudo__Group_1__0__Impl rule__Pseudo__Group_1__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2161:2: rule__Pseudo__Group_1__0__Impl rule__Pseudo__Group_1__1
            {
            pushFollow(FOLLOW_rule__Pseudo__Group_1__0__Impl_in_rule__Pseudo__Group_1__04476);
            rule__Pseudo__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pseudo__Group_1__1_in_rule__Pseudo__Group_1__04479);
            rule__Pseudo__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo__Group_1__0"


    // $ANTLR start "rule__Pseudo__Group_1__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2168:1: rule__Pseudo__Group_1__0__Impl : ( ( rule__Pseudo__FunctionAssignment_1_0 ) ) ;
    public final void rule__Pseudo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2172:1: ( ( ( rule__Pseudo__FunctionAssignment_1_0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2173:1: ( ( rule__Pseudo__FunctionAssignment_1_0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2173:1: ( ( rule__Pseudo__FunctionAssignment_1_0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2174:1: ( rule__Pseudo__FunctionAssignment_1_0 )
            {
             before(grammarAccess.getPseudoAccess().getFunctionAssignment_1_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2175:1: ( rule__Pseudo__FunctionAssignment_1_0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2175:2: rule__Pseudo__FunctionAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Pseudo__FunctionAssignment_1_0_in_rule__Pseudo__Group_1__0__Impl4506);
            rule__Pseudo__FunctionAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPseudoAccess().getFunctionAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo__Group_1__0__Impl"


    // $ANTLR start "rule__Pseudo__Group_1__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2185:1: rule__Pseudo__Group_1__1 : rule__Pseudo__Group_1__1__Impl ;
    public final void rule__Pseudo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2189:1: ( rule__Pseudo__Group_1__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2190:2: rule__Pseudo__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Pseudo__Group_1__1__Impl_in_rule__Pseudo__Group_1__14536);
            rule__Pseudo__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo__Group_1__1"


    // $ANTLR start "rule__Pseudo__Group_1__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2196:1: rule__Pseudo__Group_1__1__Impl : ( ( rule__Pseudo__NameAssignment_1_1 )? ) ;
    public final void rule__Pseudo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2200:1: ( ( ( rule__Pseudo__NameAssignment_1_1 )? ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2201:1: ( ( rule__Pseudo__NameAssignment_1_1 )? )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2201:1: ( ( rule__Pseudo__NameAssignment_1_1 )? )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2202:1: ( rule__Pseudo__NameAssignment_1_1 )?
            {
             before(grammarAccess.getPseudoAccess().getNameAssignment_1_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2203:1: ( rule__Pseudo__NameAssignment_1_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_IDENT) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==EOF||LA32_1==RULE_WS||LA32_1==RULE_IDENT||LA32_1==14||(LA32_1>=31 && LA32_1<=32)||LA32_1==34||LA32_1==38) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2203:2: rule__Pseudo__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Pseudo__NameAssignment_1_1_in_rule__Pseudo__Group_1__1__Impl4563);
                    rule__Pseudo__NameAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPseudoAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo__Group_1__1__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2217:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2221:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2222:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__04598);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__04601);
            rule__Declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2229:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__PropertyAssignment_0 ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2233:1: ( ( ( rule__Declaration__PropertyAssignment_0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2234:1: ( ( rule__Declaration__PropertyAssignment_0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2234:1: ( ( rule__Declaration__PropertyAssignment_0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2235:1: ( rule__Declaration__PropertyAssignment_0 )
            {
             before(grammarAccess.getDeclarationAccess().getPropertyAssignment_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2236:1: ( rule__Declaration__PropertyAssignment_0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2236:2: rule__Declaration__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Declaration__PropertyAssignment_0_in_rule__Declaration__Group__0__Impl4628);
            rule__Declaration__PropertyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getPropertyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2246:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2250:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2251:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__14658);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__14661);
            rule__Declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2258:1: rule__Declaration__Group__1__Impl : ( ':' ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2262:1: ( ( ':' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2263:1: ( ':' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2263:1: ( ':' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2264:1: ':'
            {
             before(grammarAccess.getDeclarationAccess().getColonKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__Declaration__Group__1__Impl4689); 
             after(grammarAccess.getDeclarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__2"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2277:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2281:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2282:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__24720);
            rule__Declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__24723);
            rule__Declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2"


    // $ANTLR start "rule__Declaration__Group__2__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2289:1: rule__Declaration__Group__2__Impl : ( ( rule__Declaration__ExprAssignment_2 ) ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2293:1: ( ( ( rule__Declaration__ExprAssignment_2 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2294:1: ( ( rule__Declaration__ExprAssignment_2 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2294:1: ( ( rule__Declaration__ExprAssignment_2 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2295:1: ( rule__Declaration__ExprAssignment_2 )
            {
             before(grammarAccess.getDeclarationAccess().getExprAssignment_2()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2296:1: ( rule__Declaration__ExprAssignment_2 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2296:2: rule__Declaration__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__Declaration__ExprAssignment_2_in_rule__Declaration__Group__2__Impl4750);
            rule__Declaration__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group__3"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2306:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2310:1: ( rule__Declaration__Group__3__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2311:2: rule__Declaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__34780);
            rule__Declaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3"


    // $ANTLR start "rule__Declaration__Group__3__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2317:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__PriorityAssignment_3 )? ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2321:1: ( ( ( rule__Declaration__PriorityAssignment_3 )? ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2322:1: ( ( rule__Declaration__PriorityAssignment_3 )? )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2322:1: ( ( rule__Declaration__PriorityAssignment_3 )? )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2323:1: ( rule__Declaration__PriorityAssignment_3 )?
            {
             before(grammarAccess.getDeclarationAccess().getPriorityAssignment_3()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2324:1: ( rule__Declaration__PriorityAssignment_3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2324:2: rule__Declaration__PriorityAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Declaration__PriorityAssignment_3_in_rule__Declaration__Group__3__Impl4807);
                    rule__Declaration__PriorityAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getPriorityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3__Impl"


    // $ANTLR start "rule__Expr__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2342:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2346:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2347:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
            {
            pushFollow(FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__04846);
            rule__Expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__04849);
            rule__Expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__0"


    // $ANTLR start "rule__Expr__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2354:1: rule__Expr__Group__0__Impl : ( ( rule__Expr__TermAssignment_0 ) ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2358:1: ( ( ( rule__Expr__TermAssignment_0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2359:1: ( ( rule__Expr__TermAssignment_0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2359:1: ( ( rule__Expr__TermAssignment_0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2360:1: ( rule__Expr__TermAssignment_0 )
            {
             before(grammarAccess.getExprAccess().getTermAssignment_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2361:1: ( rule__Expr__TermAssignment_0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2361:2: rule__Expr__TermAssignment_0
            {
            pushFollow(FOLLOW_rule__Expr__TermAssignment_0_in_rule__Expr__Group__0__Impl4876);
            rule__Expr__TermAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getTermAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__0__Impl"


    // $ANTLR start "rule__Expr__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2371:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2375:1: ( rule__Expr__Group__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2376:2: rule__Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__14906);
            rule__Expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__1"


    // $ANTLR start "rule__Expr__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2382:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__Group_1__0 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2386:1: ( ( ( rule__Expr__Group_1__0 )* ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2387:1: ( ( rule__Expr__Group_1__0 )* )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2387:1: ( ( rule__Expr__Group_1__0 )* )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2388:1: ( rule__Expr__Group_1__0 )*
            {
             before(grammarAccess.getExprAccess().getGroup_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2389:1: ( rule__Expr__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_INT||(LA34_0>=RULE_STRING && LA34_0<=RULE_HEXDIGITS)||(LA34_0>=13 && LA34_0<=14)||LA34_0==31||LA34_0==33||LA34_0==41) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2389:2: rule__Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl4933);
            	    rule__Expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__1__Impl"


    // $ANTLR start "rule__Expr__Group_1__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2403:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2407:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2408:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__04968);
            rule__Expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__04971);
            rule__Expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0"


    // $ANTLR start "rule__Expr__Group_1__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2415:1: rule__Expr__Group_1__0__Impl : ( ( rule__Expr__OperatorsAssignment_1_0 )? ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2419:1: ( ( ( rule__Expr__OperatorsAssignment_1_0 )? ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2420:1: ( ( rule__Expr__OperatorsAssignment_1_0 )? )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2420:1: ( ( rule__Expr__OperatorsAssignment_1_0 )? )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2421:1: ( rule__Expr__OperatorsAssignment_1_0 )?
            {
             before(grammarAccess.getExprAccess().getOperatorsAssignment_1_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2422:1: ( rule__Expr__OperatorsAssignment_1_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=13 && LA35_0<=14)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2422:2: rule__Expr__OperatorsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Expr__OperatorsAssignment_1_0_in_rule__Expr__Group_1__0__Impl4998);
                    rule__Expr__OperatorsAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExprAccess().getOperatorsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0__Impl"


    // $ANTLR start "rule__Expr__Group_1__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2432:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2436:1: ( rule__Expr__Group_1__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2437:2: rule__Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__15029);
            rule__Expr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1"


    // $ANTLR start "rule__Expr__Group_1__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2443:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__TermAssignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2447:1: ( ( ( rule__Expr__TermAssignment_1_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2448:1: ( ( rule__Expr__TermAssignment_1_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2448:1: ( ( rule__Expr__TermAssignment_1_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2449:1: ( rule__Expr__TermAssignment_1_1 )
            {
             before(grammarAccess.getExprAccess().getTermAssignment_1_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2450:1: ( rule__Expr__TermAssignment_1_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2450:2: rule__Expr__TermAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expr__TermAssignment_1_1_in_rule__Expr__Group_1__1__Impl5056);
            rule__Expr__TermAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getTermAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group_0__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2464:1: rule__Term__Group_0__0 : rule__Term__Group_0__0__Impl rule__Term__Group_0__1 ;
    public final void rule__Term__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2468:1: ( rule__Term__Group_0__0__Impl rule__Term__Group_0__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2469:2: rule__Term__Group_0__0__Impl rule__Term__Group_0__1
            {
            pushFollow(FOLLOW_rule__Term__Group_0__0__Impl_in_rule__Term__Group_0__05090);
            rule__Term__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_0__1_in_rule__Term__Group_0__05093);
            rule__Term__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_0__0"


    // $ANTLR start "rule__Term__Group_0__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2476:1: rule__Term__Group_0__0__Impl : ( ( rule__Term__UnaryAssignment_0_0 )? ) ;
    public final void rule__Term__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2480:1: ( ( ( rule__Term__UnaryAssignment_0_0 )? ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2481:1: ( ( rule__Term__UnaryAssignment_0_0 )? )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2481:1: ( ( rule__Term__UnaryAssignment_0_0 )? )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2482:1: ( rule__Term__UnaryAssignment_0_0 )?
            {
             before(grammarAccess.getTermAccess().getUnaryAssignment_0_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2483:1: ( rule__Term__UnaryAssignment_0_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31||LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2483:2: rule__Term__UnaryAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Term__UnaryAssignment_0_0_in_rule__Term__Group_0__0__Impl5120);
                    rule__Term__UnaryAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermAccess().getUnaryAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_0__0__Impl"


    // $ANTLR start "rule__Term__Group_0__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2493:1: rule__Term__Group_0__1 : rule__Term__Group_0__1__Impl ;
    public final void rule__Term__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2497:1: ( rule__Term__Group_0__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2498:2: rule__Term__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_0__1__Impl_in_rule__Term__Group_0__15151);
            rule__Term__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_0__1"


    // $ANTLR start "rule__Term__Group_0__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2504:1: rule__Term__Group_0__1__Impl : ( ( rule__Term__NumberAssignment_0_1 ) ) ;
    public final void rule__Term__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2508:1: ( ( ( rule__Term__NumberAssignment_0_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2509:1: ( ( rule__Term__NumberAssignment_0_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2509:1: ( ( rule__Term__NumberAssignment_0_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2510:1: ( rule__Term__NumberAssignment_0_1 )
            {
             before(grammarAccess.getTermAccess().getNumberAssignment_0_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2511:1: ( rule__Term__NumberAssignment_0_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2511:2: rule__Term__NumberAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Term__NumberAssignment_0_1_in_rule__Term__Group_0__1__Impl5178);
            rule__Term__NumberAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getNumberAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_0__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2525:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2529:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2530:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__05212);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__05215);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2537:1: rule__Function__Group__0__Impl : ( ( rule__Function__NameAssignment_0 ) ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2541:1: ( ( ( rule__Function__NameAssignment_0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2542:1: ( ( rule__Function__NameAssignment_0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2542:1: ( ( rule__Function__NameAssignment_0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2543:1: ( rule__Function__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2544:1: ( rule__Function__NameAssignment_0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2544:2: rule__Function__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_0_in_rule__Function__Group__0__Impl5242);
            rule__Function__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2554:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2558:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2559:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__15272);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__15275);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2566:1: rule__Function__Group__1__Impl : ( '(' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2570:1: ( ( '(' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2571:1: ( '(' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2571:1: ( '(' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2572:1: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__Function__Group__1__Impl5303); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2585:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2589:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2590:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__25334);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__25337);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2597:1: rule__Function__Group__2__Impl : ( ( rule__Function__ExprAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2601:1: ( ( ( rule__Function__ExprAssignment_2 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2602:1: ( ( rule__Function__ExprAssignment_2 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2602:1: ( ( rule__Function__ExprAssignment_2 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2603:1: ( rule__Function__ExprAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getExprAssignment_2()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2604:1: ( rule__Function__ExprAssignment_2 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2604:2: rule__Function__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__ExprAssignment_2_in_rule__Function__Group__2__Impl5364);
            rule__Function__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2614:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2618:1: ( rule__Function__Group__3__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2619:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__35394);
            rule__Function__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2625:1: rule__Function__Group__3__Impl : ( ')' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2629:1: ( ( ')' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2630:1: ( ')' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2630:1: ( ')' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2631:1: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__Function__Group__3__Impl5422); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__URI__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2652:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2656:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2657:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__05461);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__05464);
            rule__URI__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__0"


    // $ANTLR start "rule__URI__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2664:1: rule__URI__Group__0__Impl : ( 'url' ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2668:1: ( ( 'url' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2669:1: ( 'url' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2669:1: ( 'url' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2670:1: 'url'
            {
             before(grammarAccess.getURIAccess().getUrlKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__URI__Group__0__Impl5492); 
             after(grammarAccess.getURIAccess().getUrlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__0__Impl"


    // $ANTLR start "rule__URI__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2683:1: rule__URI__Group__1 : rule__URI__Group__1__Impl rule__URI__Group__2 ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2687:1: ( rule__URI__Group__1__Impl rule__URI__Group__2 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2688:2: rule__URI__Group__1__Impl rule__URI__Group__2
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__15523);
            rule__URI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__2_in_rule__URI__Group__15526);
            rule__URI__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__1"


    // $ANTLR start "rule__URI__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2695:1: rule__URI__Group__1__Impl : ( '(' ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2699:1: ( ( '(' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2700:1: ( '(' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2700:1: ( '(' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2701:1: '('
            {
             before(grammarAccess.getURIAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__URI__Group__1__Impl5554); 
             after(grammarAccess.getURIAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__1__Impl"


    // $ANTLR start "rule__URI__Group__2"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2714:1: rule__URI__Group__2 : rule__URI__Group__2__Impl rule__URI__Group__3 ;
    public final void rule__URI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2718:1: ( rule__URI__Group__2__Impl rule__URI__Group__3 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2719:2: rule__URI__Group__2__Impl rule__URI__Group__3
            {
            pushFollow(FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__25585);
            rule__URI__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__3_in_rule__URI__Group__25588);
            rule__URI__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__2"


    // $ANTLR start "rule__URI__Group__2__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2726:1: rule__URI__Group__2__Impl : ( () ) ;
    public final void rule__URI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2730:1: ( ( () ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2731:1: ( () )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2731:1: ( () )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2732:1: ()
            {
             before(grammarAccess.getURIAccess().getURIAction_2()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2733:1: ()
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2735:1: 
            {
            }

             after(grammarAccess.getURIAccess().getURIAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__2__Impl"


    // $ANTLR start "rule__URI__Group__3"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2745:1: rule__URI__Group__3 : rule__URI__Group__3__Impl rule__URI__Group__4 ;
    public final void rule__URI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2749:1: ( rule__URI__Group__3__Impl rule__URI__Group__4 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2750:2: rule__URI__Group__3__Impl rule__URI__Group__4
            {
            pushFollow(FOLLOW_rule__URI__Group__3__Impl_in_rule__URI__Group__35646);
            rule__URI__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__4_in_rule__URI__Group__35649);
            rule__URI__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__3"


    // $ANTLR start "rule__URI__Group__3__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2757:1: rule__URI__Group__3__Impl : ( ( rule__URI__Alternatives_3 )* ) ;
    public final void rule__URI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2761:1: ( ( ( rule__URI__Alternatives_3 )* ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2762:1: ( ( rule__URI__Alternatives_3 )* )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2762:1: ( ( rule__URI__Alternatives_3 )* )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2763:1: ( rule__URI__Alternatives_3 )*
            {
             before(grammarAccess.getURIAccess().getAlternatives_3()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2764:1: ( rule__URI__Alternatives_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_STRING||LA37_0==13||LA37_0==15) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2764:2: rule__URI__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__URI__Alternatives_3_in_rule__URI__Group__3__Impl5676);
            	    rule__URI__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getURIAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__3__Impl"


    // $ANTLR start "rule__URI__Group__4"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2774:1: rule__URI__Group__4 : rule__URI__Group__4__Impl rule__URI__Group__5 ;
    public final void rule__URI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2778:1: ( rule__URI__Group__4__Impl rule__URI__Group__5 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2779:2: rule__URI__Group__4__Impl rule__URI__Group__5
            {
            pushFollow(FOLLOW_rule__URI__Group__4__Impl_in_rule__URI__Group__45707);
            rule__URI__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__5_in_rule__URI__Group__45710);
            rule__URI__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__4"


    // $ANTLR start "rule__URI__Group__4__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2786:1: rule__URI__Group__4__Impl : ( ( rule__URI__Group_4__0 )? ) ;
    public final void rule__URI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2790:1: ( ( ( rule__URI__Group_4__0 )? ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2791:1: ( ( rule__URI__Group_4__0 )? )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2791:1: ( ( rule__URI__Group_4__0 )? )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2792:1: ( rule__URI__Group_4__0 )?
            {
             before(grammarAccess.getURIAccess().getGroup_4()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2793:1: ( rule__URI__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2793:2: rule__URI__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__URI__Group_4__0_in_rule__URI__Group__4__Impl5737);
                    rule__URI__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getURIAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__4__Impl"


    // $ANTLR start "rule__URI__Group__5"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2803:1: rule__URI__Group__5 : rule__URI__Group__5__Impl ;
    public final void rule__URI__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2807:1: ( rule__URI__Group__5__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2808:2: rule__URI__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__5__Impl_in_rule__URI__Group__55768);
            rule__URI__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__5"


    // $ANTLR start "rule__URI__Group__5__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2814:1: rule__URI__Group__5__Impl : ( ')' ) ;
    public final void rule__URI__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2818:1: ( ( ')' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2819:1: ( ')' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2819:1: ( ')' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2820:1: ')'
            {
             before(grammarAccess.getURIAccess().getRightParenthesisKeyword_5()); 
            match(input,40,FOLLOW_40_in_rule__URI__Group__5__Impl5796); 
             after(grammarAccess.getURIAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__5__Impl"


    // $ANTLR start "rule__URI__Group_3_1__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2845:1: rule__URI__Group_3_1__0 : rule__URI__Group_3_1__0__Impl rule__URI__Group_3_1__1 ;
    public final void rule__URI__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2849:1: ( rule__URI__Group_3_1__0__Impl rule__URI__Group_3_1__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2850:2: rule__URI__Group_3_1__0__Impl rule__URI__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__URI__Group_3_1__0__Impl_in_rule__URI__Group_3_1__05839);
            rule__URI__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_3_1__1_in_rule__URI__Group_3_1__05842);
            rule__URI__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_3_1__0"


    // $ANTLR start "rule__URI__Group_3_1__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2857:1: rule__URI__Group_3_1__0__Impl : ( ( rule__URI__Alternatives_3_1_0 ) ) ;
    public final void rule__URI__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2861:1: ( ( ( rule__URI__Alternatives_3_1_0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2862:1: ( ( rule__URI__Alternatives_3_1_0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2862:1: ( ( rule__URI__Alternatives_3_1_0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2863:1: ( rule__URI__Alternatives_3_1_0 )
            {
             before(grammarAccess.getURIAccess().getAlternatives_3_1_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2864:1: ( rule__URI__Alternatives_3_1_0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2864:2: rule__URI__Alternatives_3_1_0
            {
            pushFollow(FOLLOW_rule__URI__Alternatives_3_1_0_in_rule__URI__Group_3_1__0__Impl5869);
            rule__URI__Alternatives_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getAlternatives_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_3_1__0__Impl"


    // $ANTLR start "rule__URI__Group_3_1__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2874:1: rule__URI__Group_3_1__1 : rule__URI__Group_3_1__1__Impl ;
    public final void rule__URI__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2878:1: ( rule__URI__Group_3_1__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2879:2: rule__URI__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_3_1__1__Impl_in_rule__URI__Group_3_1__15899);
            rule__URI__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_3_1__1"


    // $ANTLR start "rule__URI__Group_3_1__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2885:1: rule__URI__Group_3_1__1__Impl : ( ( rule__URI__IdAssignment_3_1_1 ) ) ;
    public final void rule__URI__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2889:1: ( ( ( rule__URI__IdAssignment_3_1_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2890:1: ( ( rule__URI__IdAssignment_3_1_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2890:1: ( ( rule__URI__IdAssignment_3_1_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2891:1: ( rule__URI__IdAssignment_3_1_1 )
            {
             before(grammarAccess.getURIAccess().getIdAssignment_3_1_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2892:1: ( rule__URI__IdAssignment_3_1_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2892:2: rule__URI__IdAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__URI__IdAssignment_3_1_1_in_rule__URI__Group_3_1__1__Impl5926);
            rule__URI__IdAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getIdAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_3_1__1__Impl"


    // $ANTLR start "rule__URI__Group_4__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2906:1: rule__URI__Group_4__0 : rule__URI__Group_4__0__Impl rule__URI__Group_4__1 ;
    public final void rule__URI__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2910:1: ( rule__URI__Group_4__0__Impl rule__URI__Group_4__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2911:2: rule__URI__Group_4__0__Impl rule__URI__Group_4__1
            {
            pushFollow(FOLLOW_rule__URI__Group_4__0__Impl_in_rule__URI__Group_4__05960);
            rule__URI__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_4__1_in_rule__URI__Group_4__05963);
            rule__URI__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_4__0"


    // $ANTLR start "rule__URI__Group_4__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2918:1: rule__URI__Group_4__0__Impl : ( '.' ) ;
    public final void rule__URI__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2922:1: ( ( '.' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2923:1: ( '.' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2923:1: ( '.' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2924:1: '.'
            {
             before(grammarAccess.getURIAccess().getFullStopKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__URI__Group_4__0__Impl5991); 
             after(grammarAccess.getURIAccess().getFullStopKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_4__0__Impl"


    // $ANTLR start "rule__URI__Group_4__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2937:1: rule__URI__Group_4__1 : rule__URI__Group_4__1__Impl ;
    public final void rule__URI__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2941:1: ( rule__URI__Group_4__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2942:2: rule__URI__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_4__1__Impl_in_rule__URI__Group_4__16022);
            rule__URI__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_4__1"


    // $ANTLR start "rule__URI__Group_4__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2948:1: rule__URI__Group_4__1__Impl : ( ( rule__URI__IdAssignment_4_1 ) ) ;
    public final void rule__URI__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2952:1: ( ( ( rule__URI__IdAssignment_4_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2953:1: ( ( rule__URI__IdAssignment_4_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2953:1: ( ( rule__URI__IdAssignment_4_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2954:1: ( rule__URI__IdAssignment_4_1 )
            {
             before(grammarAccess.getURIAccess().getIdAssignment_4_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2955:1: ( rule__URI__IdAssignment_4_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2955:2: rule__URI__IdAssignment_4_1
            {
            pushFollow(FOLLOW_rule__URI__IdAssignment_4_1_in_rule__URI__Group_4__1__Impl6049);
            rule__URI__IdAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getIdAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_4__1__Impl"


    // $ANTLR start "rule__PERCENTAGE__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2969:1: rule__PERCENTAGE__Group__0 : rule__PERCENTAGE__Group__0__Impl rule__PERCENTAGE__Group__1 ;
    public final void rule__PERCENTAGE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2973:1: ( rule__PERCENTAGE__Group__0__Impl rule__PERCENTAGE__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2974:2: rule__PERCENTAGE__Group__0__Impl rule__PERCENTAGE__Group__1
            {
            pushFollow(FOLLOW_rule__PERCENTAGE__Group__0__Impl_in_rule__PERCENTAGE__Group__06083);
            rule__PERCENTAGE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PERCENTAGE__Group__1_in_rule__PERCENTAGE__Group__06086);
            rule__PERCENTAGE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PERCENTAGE__Group__0"


    // $ANTLR start "rule__PERCENTAGE__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2981:1: rule__PERCENTAGE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__PERCENTAGE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2985:1: ( ( RULE_INT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2986:1: ( RULE_INT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2986:1: ( RULE_INT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2987:1: RULE_INT
            {
             before(grammarAccess.getPERCENTAGEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PERCENTAGE__Group__0__Impl6113); 
             after(grammarAccess.getPERCENTAGEAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PERCENTAGE__Group__0__Impl"


    // $ANTLR start "rule__PERCENTAGE__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:2998:1: rule__PERCENTAGE__Group__1 : rule__PERCENTAGE__Group__1__Impl ;
    public final void rule__PERCENTAGE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3002:1: ( rule__PERCENTAGE__Group__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3003:2: rule__PERCENTAGE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PERCENTAGE__Group__1__Impl_in_rule__PERCENTAGE__Group__16142);
            rule__PERCENTAGE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PERCENTAGE__Group__1"


    // $ANTLR start "rule__PERCENTAGE__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3009:1: rule__PERCENTAGE__Group__1__Impl : ( '%' ) ;
    public final void rule__PERCENTAGE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3013:1: ( ( '%' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3014:1: ( '%' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3014:1: ( '%' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3015:1: '%'
            {
             before(grammarAccess.getPERCENTAGEAccess().getPercentSignKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__PERCENTAGE__Group__1__Impl6170); 
             after(grammarAccess.getPERCENTAGEAccess().getPercentSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PERCENTAGE__Group__1__Impl"


    // $ANTLR start "rule__EMS__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3032:1: rule__EMS__Group__0 : rule__EMS__Group__0__Impl rule__EMS__Group__1 ;
    public final void rule__EMS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3036:1: ( rule__EMS__Group__0__Impl rule__EMS__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3037:2: rule__EMS__Group__0__Impl rule__EMS__Group__1
            {
            pushFollow(FOLLOW_rule__EMS__Group__0__Impl_in_rule__EMS__Group__06205);
            rule__EMS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EMS__Group__1_in_rule__EMS__Group__06208);
            rule__EMS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMS__Group__0"


    // $ANTLR start "rule__EMS__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3044:1: rule__EMS__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EMS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3048:1: ( ( RULE_INT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3049:1: ( RULE_INT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3049:1: ( RULE_INT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3050:1: RULE_INT
            {
             before(grammarAccess.getEMSAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EMS__Group__0__Impl6235); 
             after(grammarAccess.getEMSAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMS__Group__0__Impl"


    // $ANTLR start "rule__EMS__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3061:1: rule__EMS__Group__1 : rule__EMS__Group__1__Impl ;
    public final void rule__EMS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3065:1: ( rule__EMS__Group__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3066:2: rule__EMS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EMS__Group__1__Impl_in_rule__EMS__Group__16264);
            rule__EMS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMS__Group__1"


    // $ANTLR start "rule__EMS__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3072:1: rule__EMS__Group__1__Impl : ( 'em' ) ;
    public final void rule__EMS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3076:1: ( ( 'em' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3077:1: ( 'em' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3077:1: ( 'em' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3078:1: 'em'
            {
             before(grammarAccess.getEMSAccess().getEmKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__EMS__Group__1__Impl6292); 
             after(grammarAccess.getEMSAccess().getEmKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMS__Group__1__Impl"


    // $ANTLR start "rule__EXS__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3095:1: rule__EXS__Group__0 : rule__EXS__Group__0__Impl rule__EXS__Group__1 ;
    public final void rule__EXS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3099:1: ( rule__EXS__Group__0__Impl rule__EXS__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3100:2: rule__EXS__Group__0__Impl rule__EXS__Group__1
            {
            pushFollow(FOLLOW_rule__EXS__Group__0__Impl_in_rule__EXS__Group__06327);
            rule__EXS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EXS__Group__1_in_rule__EXS__Group__06330);
            rule__EXS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXS__Group__0"


    // $ANTLR start "rule__EXS__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3107:1: rule__EXS__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EXS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3111:1: ( ( RULE_INT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3112:1: ( RULE_INT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3112:1: ( RULE_INT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3113:1: RULE_INT
            {
             before(grammarAccess.getEXSAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EXS__Group__0__Impl6357); 
             after(grammarAccess.getEXSAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXS__Group__0__Impl"


    // $ANTLR start "rule__EXS__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3124:1: rule__EXS__Group__1 : rule__EXS__Group__1__Impl ;
    public final void rule__EXS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3128:1: ( rule__EXS__Group__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3129:2: rule__EXS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EXS__Group__1__Impl_in_rule__EXS__Group__16386);
            rule__EXS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXS__Group__1"


    // $ANTLR start "rule__EXS__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3135:1: rule__EXS__Group__1__Impl : ( 'ex' ) ;
    public final void rule__EXS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3139:1: ( ( 'ex' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3140:1: ( 'ex' )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3140:1: ( 'ex' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3141:1: 'ex'
            {
             before(grammarAccess.getEXSAccess().getExKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__EXS__Group__1__Impl6414); 
             after(grammarAccess.getEXSAccess().getExKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXS__Group__1__Impl"


    // $ANTLR start "rule__LENGTH__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3158:1: rule__LENGTH__Group__0 : rule__LENGTH__Group__0__Impl rule__LENGTH__Group__1 ;
    public final void rule__LENGTH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3162:1: ( rule__LENGTH__Group__0__Impl rule__LENGTH__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3163:2: rule__LENGTH__Group__0__Impl rule__LENGTH__Group__1
            {
            pushFollow(FOLLOW_rule__LENGTH__Group__0__Impl_in_rule__LENGTH__Group__06449);
            rule__LENGTH__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LENGTH__Group__1_in_rule__LENGTH__Group__06452);
            rule__LENGTH__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Group__0"


    // $ANTLR start "rule__LENGTH__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3170:1: rule__LENGTH__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__LENGTH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3174:1: ( ( RULE_INT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3175:1: ( RULE_INT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3175:1: ( RULE_INT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3176:1: RULE_INT
            {
             before(grammarAccess.getLENGTHAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LENGTH__Group__0__Impl6479); 
             after(grammarAccess.getLENGTHAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Group__0__Impl"


    // $ANTLR start "rule__LENGTH__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3187:1: rule__LENGTH__Group__1 : rule__LENGTH__Group__1__Impl ;
    public final void rule__LENGTH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3191:1: ( rule__LENGTH__Group__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3192:2: rule__LENGTH__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LENGTH__Group__1__Impl_in_rule__LENGTH__Group__16508);
            rule__LENGTH__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Group__1"


    // $ANTLR start "rule__LENGTH__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3198:1: rule__LENGTH__Group__1__Impl : ( ( rule__LENGTH__Alternatives_1 ) ) ;
    public final void rule__LENGTH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3202:1: ( ( ( rule__LENGTH__Alternatives_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3203:1: ( ( rule__LENGTH__Alternatives_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3203:1: ( ( rule__LENGTH__Alternatives_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3204:1: ( rule__LENGTH__Alternatives_1 )
            {
             before(grammarAccess.getLENGTHAccess().getAlternatives_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3205:1: ( rule__LENGTH__Alternatives_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3205:2: rule__LENGTH__Alternatives_1
            {
            pushFollow(FOLLOW_rule__LENGTH__Alternatives_1_in_rule__LENGTH__Group__1__Impl6535);
            rule__LENGTH__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLENGTHAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Group__1__Impl"


    // $ANTLR start "rule__ANGLE__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3219:1: rule__ANGLE__Group__0 : rule__ANGLE__Group__0__Impl rule__ANGLE__Group__1 ;
    public final void rule__ANGLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3223:1: ( rule__ANGLE__Group__0__Impl rule__ANGLE__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3224:2: rule__ANGLE__Group__0__Impl rule__ANGLE__Group__1
            {
            pushFollow(FOLLOW_rule__ANGLE__Group__0__Impl_in_rule__ANGLE__Group__06569);
            rule__ANGLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANGLE__Group__1_in_rule__ANGLE__Group__06572);
            rule__ANGLE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Group__0"


    // $ANTLR start "rule__ANGLE__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3231:1: rule__ANGLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__ANGLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3235:1: ( ( RULE_INT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3236:1: ( RULE_INT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3236:1: ( RULE_INT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3237:1: RULE_INT
            {
             before(grammarAccess.getANGLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ANGLE__Group__0__Impl6599); 
             after(grammarAccess.getANGLEAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Group__0__Impl"


    // $ANTLR start "rule__ANGLE__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3248:1: rule__ANGLE__Group__1 : rule__ANGLE__Group__1__Impl ;
    public final void rule__ANGLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3252:1: ( rule__ANGLE__Group__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3253:2: rule__ANGLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ANGLE__Group__1__Impl_in_rule__ANGLE__Group__16628);
            rule__ANGLE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Group__1"


    // $ANTLR start "rule__ANGLE__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3259:1: rule__ANGLE__Group__1__Impl : ( ( rule__ANGLE__Alternatives_1 ) ) ;
    public final void rule__ANGLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3263:1: ( ( ( rule__ANGLE__Alternatives_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3264:1: ( ( rule__ANGLE__Alternatives_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3264:1: ( ( rule__ANGLE__Alternatives_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3265:1: ( rule__ANGLE__Alternatives_1 )
            {
             before(grammarAccess.getANGLEAccess().getAlternatives_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3266:1: ( rule__ANGLE__Alternatives_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3266:2: rule__ANGLE__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ANGLE__Alternatives_1_in_rule__ANGLE__Group__1__Impl6655);
            rule__ANGLE__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getANGLEAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Group__1__Impl"


    // $ANTLR start "rule__TIME__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3280:1: rule__TIME__Group__0 : rule__TIME__Group__0__Impl rule__TIME__Group__1 ;
    public final void rule__TIME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3284:1: ( rule__TIME__Group__0__Impl rule__TIME__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3285:2: rule__TIME__Group__0__Impl rule__TIME__Group__1
            {
            pushFollow(FOLLOW_rule__TIME__Group__0__Impl_in_rule__TIME__Group__06689);
            rule__TIME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TIME__Group__1_in_rule__TIME__Group__06692);
            rule__TIME__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Group__0"


    // $ANTLR start "rule__TIME__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3292:1: rule__TIME__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__TIME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3296:1: ( ( RULE_INT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3297:1: ( RULE_INT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3297:1: ( RULE_INT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3298:1: RULE_INT
            {
             before(grammarAccess.getTIMEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TIME__Group__0__Impl6719); 
             after(grammarAccess.getTIMEAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Group__0__Impl"


    // $ANTLR start "rule__TIME__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3309:1: rule__TIME__Group__1 : rule__TIME__Group__1__Impl ;
    public final void rule__TIME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3313:1: ( rule__TIME__Group__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3314:2: rule__TIME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TIME__Group__1__Impl_in_rule__TIME__Group__16748);
            rule__TIME__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Group__1"


    // $ANTLR start "rule__TIME__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3320:1: rule__TIME__Group__1__Impl : ( ( rule__TIME__Alternatives_1 ) ) ;
    public final void rule__TIME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3324:1: ( ( ( rule__TIME__Alternatives_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3325:1: ( ( rule__TIME__Alternatives_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3325:1: ( ( rule__TIME__Alternatives_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3326:1: ( rule__TIME__Alternatives_1 )
            {
             before(grammarAccess.getTIMEAccess().getAlternatives_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3327:1: ( rule__TIME__Alternatives_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3327:2: rule__TIME__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TIME__Alternatives_1_in_rule__TIME__Group__1__Impl6775);
            rule__TIME__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTIMEAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Group__1__Impl"


    // $ANTLR start "rule__FREQ__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3341:1: rule__FREQ__Group__0 : rule__FREQ__Group__0__Impl rule__FREQ__Group__1 ;
    public final void rule__FREQ__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3345:1: ( rule__FREQ__Group__0__Impl rule__FREQ__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3346:2: rule__FREQ__Group__0__Impl rule__FREQ__Group__1
            {
            pushFollow(FOLLOW_rule__FREQ__Group__0__Impl_in_rule__FREQ__Group__06809);
            rule__FREQ__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FREQ__Group__1_in_rule__FREQ__Group__06812);
            rule__FREQ__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Group__0"


    // $ANTLR start "rule__FREQ__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3353:1: rule__FREQ__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FREQ__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3357:1: ( ( RULE_INT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3358:1: ( RULE_INT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3358:1: ( RULE_INT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3359:1: RULE_INT
            {
             before(grammarAccess.getFREQAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FREQ__Group__0__Impl6839); 
             after(grammarAccess.getFREQAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Group__0__Impl"


    // $ANTLR start "rule__FREQ__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3370:1: rule__FREQ__Group__1 : rule__FREQ__Group__1__Impl ;
    public final void rule__FREQ__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3374:1: ( rule__FREQ__Group__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3375:2: rule__FREQ__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FREQ__Group__1__Impl_in_rule__FREQ__Group__16868);
            rule__FREQ__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Group__1"


    // $ANTLR start "rule__FREQ__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3381:1: rule__FREQ__Group__1__Impl : ( ( rule__FREQ__Alternatives_1 ) ) ;
    public final void rule__FREQ__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3385:1: ( ( ( rule__FREQ__Alternatives_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3386:1: ( ( rule__FREQ__Alternatives_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3386:1: ( ( rule__FREQ__Alternatives_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3387:1: ( rule__FREQ__Alternatives_1 )
            {
             before(grammarAccess.getFREQAccess().getAlternatives_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3388:1: ( rule__FREQ__Alternatives_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3388:2: rule__FREQ__Alternatives_1
            {
            pushFollow(FOLLOW_rule__FREQ__Alternatives_1_in_rule__FREQ__Group__1__Impl6895);
            rule__FREQ__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFREQAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Group__1__Impl"


    // $ANTLR start "rule__Css_hash_class__Group__0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3402:1: rule__Css_hash_class__Group__0 : rule__Css_hash_class__Group__0__Impl rule__Css_hash_class__Group__1 ;
    public final void rule__Css_hash_class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3406:1: ( rule__Css_hash_class__Group__0__Impl rule__Css_hash_class__Group__1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3407:2: rule__Css_hash_class__Group__0__Impl rule__Css_hash_class__Group__1
            {
            pushFollow(FOLLOW_rule__Css_hash_class__Group__0__Impl_in_rule__Css_hash_class__Group__06929);
            rule__Css_hash_class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_hash_class__Group__1_in_rule__Css_hash_class__Group__06932);
            rule__Css_hash_class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_hash_class__Group__0"


    // $ANTLR start "rule__Css_hash_class__Group__0__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3414:1: rule__Css_hash_class__Group__0__Impl : ( ( rule__Css_hash_class__TypeAssignment_0 ) ) ;
    public final void rule__Css_hash_class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3418:1: ( ( ( rule__Css_hash_class__TypeAssignment_0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3419:1: ( ( rule__Css_hash_class__TypeAssignment_0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3419:1: ( ( rule__Css_hash_class__TypeAssignment_0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3420:1: ( rule__Css_hash_class__TypeAssignment_0 )
            {
             before(grammarAccess.getCss_hash_classAccess().getTypeAssignment_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3421:1: ( rule__Css_hash_class__TypeAssignment_0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3421:2: rule__Css_hash_class__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Css_hash_class__TypeAssignment_0_in_rule__Css_hash_class__Group__0__Impl6959);
            rule__Css_hash_class__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCss_hash_classAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_hash_class__Group__0__Impl"


    // $ANTLR start "rule__Css_hash_class__Group__1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3431:1: rule__Css_hash_class__Group__1 : rule__Css_hash_class__Group__1__Impl ;
    public final void rule__Css_hash_class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3435:1: ( rule__Css_hash_class__Group__1__Impl )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3436:2: rule__Css_hash_class__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_hash_class__Group__1__Impl_in_rule__Css_hash_class__Group__16989);
            rule__Css_hash_class__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_hash_class__Group__1"


    // $ANTLR start "rule__Css_hash_class__Group__1__Impl"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3442:1: rule__Css_hash_class__Group__1__Impl : ( ( rule__Css_hash_class__NameAssignment_1 ) ) ;
    public final void rule__Css_hash_class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3446:1: ( ( ( rule__Css_hash_class__NameAssignment_1 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3447:1: ( ( rule__Css_hash_class__NameAssignment_1 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3447:1: ( ( rule__Css_hash_class__NameAssignment_1 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3448:1: ( rule__Css_hash_class__NameAssignment_1 )
            {
             before(grammarAccess.getCss_hash_classAccess().getNameAssignment_1()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3449:1: ( rule__Css_hash_class__NameAssignment_1 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3449:2: rule__Css_hash_class__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Css_hash_class__NameAssignment_1_in_rule__Css_hash_class__Group__1__Impl7016);
            rule__Css_hash_class__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCss_hash_classAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_hash_class__Group__1__Impl"


    // $ANTLR start "rule__Stylesheet__LocationAssignment_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3464:1: rule__Stylesheet__LocationAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Stylesheet__LocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3468:1: ( ( RULE_STRING ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3469:1: ( RULE_STRING )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3469:1: ( RULE_STRING )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3470:1: RULE_STRING
            {
             before(grammarAccess.getStylesheetAccess().getLocationSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Stylesheet__LocationAssignment_07055); 
             after(grammarAccess.getStylesheetAccess().getLocationSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__LocationAssignment_0"


    // $ANTLR start "rule__Stylesheet__ImportNameAssignment_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3479:1: rule__Stylesheet__ImportNameAssignment_1 : ( rulecss_import ) ;
    public final void rule__Stylesheet__ImportNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3483:1: ( ( rulecss_import ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3484:1: ( rulecss_import )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3484:1: ( rulecss_import )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3485:1: rulecss_import
            {
             before(grammarAccess.getStylesheetAccess().getImportNameCss_importParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulecss_import_in_rule__Stylesheet__ImportNameAssignment_17086);
            rulecss_import();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getImportNameCss_importParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__ImportNameAssignment_1"


    // $ANTLR start "rule__Stylesheet__RulesetAssignment_2"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3494:1: rule__Stylesheet__RulesetAssignment_2 : ( ruleRules ) ;
    public final void rule__Stylesheet__RulesetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3498:1: ( ( ruleRules ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3499:1: ( ruleRules )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3499:1: ( ruleRules )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3500:1: ruleRules
            {
             before(grammarAccess.getStylesheetAccess().getRulesetRulesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRules_in_rule__Stylesheet__RulesetAssignment_27117);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getRulesetRulesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__RulesetAssignment_2"


    // $ANTLR start "rule__Rules__SelectorsAssignment_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3509:1: rule__Rules__SelectorsAssignment_0 : ( ruleselector ) ;
    public final void rule__Rules__SelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3513:1: ( ( ruleselector ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3514:1: ( ruleselector )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3514:1: ( ruleselector )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3515:1: ruleselector
            {
             before(grammarAccess.getRulesAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Rules__SelectorsAssignment_07148);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getSelectorsSelectorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__SelectorsAssignment_0"


    // $ANTLR start "rule__Rules__SelectorsAssignment_1_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3524:1: rule__Rules__SelectorsAssignment_1_1 : ( ruleselector ) ;
    public final void rule__Rules__SelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3528:1: ( ( ruleselector ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3529:1: ( ruleselector )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3529:1: ( ruleselector )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3530:1: ruleselector
            {
             before(grammarAccess.getRulesAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Rules__SelectorsAssignment_1_17179);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__SelectorsAssignment_1_1"


    // $ANTLR start "rule__Rules__DeclarationsAssignment_3"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3539:1: rule__Rules__DeclarationsAssignment_3 : ( ruledeclaration ) ;
    public final void rule__Rules__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3543:1: ( ( ruledeclaration ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3544:1: ( ruledeclaration )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3544:1: ( ruledeclaration )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3545:1: ruledeclaration
            {
             before(grammarAccess.getRulesAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruledeclaration_in_rule__Rules__DeclarationsAssignment_37210);
            ruledeclaration();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__DeclarationsAssignment_3"


    // $ANTLR start "rule__Rules__DeclarationsAssignment_4_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3554:1: rule__Rules__DeclarationsAssignment_4_1 : ( ruledeclaration ) ;
    public final void rule__Rules__DeclarationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3558:1: ( ( ruledeclaration ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3559:1: ( ruledeclaration )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3559:1: ( ruledeclaration )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3560:1: ruledeclaration
            {
             before(grammarAccess.getRulesAccess().getDeclarationsDeclarationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruledeclaration_in_rule__Rules__DeclarationsAssignment_4_17241);
            ruledeclaration();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getDeclarationsDeclarationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__DeclarationsAssignment_4_1"


    // $ANTLR start "rule__Css_import__String_nameAssignment_1_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3569:1: rule__Css_import__String_nameAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Css_import__String_nameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3573:1: ( ( RULE_STRING ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3574:1: ( RULE_STRING )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3574:1: ( RULE_STRING )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3575:1: RULE_STRING
            {
             before(grammarAccess.getCss_importAccess().getString_nameSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Css_import__String_nameAssignment_1_07272); 
             after(grammarAccess.getCss_importAccess().getString_nameSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_import__String_nameAssignment_1_0"


    // $ANTLR start "rule__Selector__SimpleselectorsAssignment_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3584:1: rule__Selector__SimpleselectorsAssignment_0 : ( rulesimple_selector ) ;
    public final void rule__Selector__SimpleselectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3588:1: ( ( rulesimple_selector ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3589:1: ( rulesimple_selector )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3589:1: ( rulesimple_selector )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3590:1: rulesimple_selector
            {
             before(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulesimple_selector_in_rule__Selector__SimpleselectorsAssignment_07303);
            rulesimple_selector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SimpleselectorsAssignment_0"


    // $ANTLR start "rule__Selector__CombinatorAssignment_1_0_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3599:1: rule__Selector__CombinatorAssignment_1_0_0 : ( rulecombinator ) ;
    public final void rule__Selector__CombinatorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3603:1: ( ( rulecombinator ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3604:1: ( rulecombinator )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3604:1: ( rulecombinator )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3605:1: rulecombinator
            {
             before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_0_07334);
            rulecombinator();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__CombinatorAssignment_1_0_0"


    // $ANTLR start "rule__Selector__SelectorAssignment_1_0_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3614:1: rule__Selector__SelectorAssignment_1_0_1 : ( ruleselector ) ;
    public final void rule__Selector__SelectorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3618:1: ( ( ruleselector ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3619:1: ( ruleselector )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3619:1: ( ruleselector )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3620:1: ruleselector
            {
             before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_0_17365);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SelectorAssignment_1_0_1"


    // $ANTLR start "rule__Selector__CombinatorAssignment_1_1_1_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3629:1: rule__Selector__CombinatorAssignment_1_1_1_0 : ( rulecombinator ) ;
    public final void rule__Selector__CombinatorAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3633:1: ( ( rulecombinator ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3634:1: ( rulecombinator )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3634:1: ( rulecombinator )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3635:1: rulecombinator
            {
             before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 
            pushFollow(FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_1_1_07396);
            rulecombinator();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__CombinatorAssignment_1_1_1_0"


    // $ANTLR start "rule__Selector__SelectorAssignment_1_1_1_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3644:1: rule__Selector__SelectorAssignment_1_1_1_1 : ( ruleselector ) ;
    public final void rule__Selector__SelectorAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3648:1: ( ( ruleselector ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3649:1: ( ruleselector )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3649:1: ( ruleselector )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3650:1: ruleselector
            {
             before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_1_1_17427);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SelectorAssignment_1_1_1_1"


    // $ANTLR start "rule__Simple_selector__ElementAssignment_0_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3659:1: rule__Simple_selector__ElementAssignment_0_0 : ( ruleelement_name ) ;
    public final void rule__Simple_selector__ElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3663:1: ( ( ruleelement_name ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3664:1: ( ruleelement_name )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3664:1: ( ruleelement_name )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3665:1: ruleelement_name
            {
             before(grammarAccess.getSimple_selectorAccess().getElementElement_nameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleelement_name_in_rule__Simple_selector__ElementAssignment_0_07458);
            ruleelement_name();

            state._fsp--;

             after(grammarAccess.getSimple_selectorAccess().getElementElement_nameParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__ElementAssignment_0_0"


    // $ANTLR start "rule__Simple_selector__IdAssignment_0_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3674:1: rule__Simple_selector__IdAssignment_0_1 : ( rulecss_hash_class ) ;
    public final void rule__Simple_selector__IdAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3678:1: ( ( rulecss_hash_class ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3679:1: ( rulecss_hash_class )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3679:1: ( rulecss_hash_class )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3680:1: rulecss_hash_class
            {
             before(grammarAccess.getSimple_selectorAccess().getIdCss_hash_classParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulecss_hash_class_in_rule__Simple_selector__IdAssignment_0_17489);
            rulecss_hash_class();

            state._fsp--;

             after(grammarAccess.getSimple_selectorAccess().getIdCss_hash_classParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__IdAssignment_0_1"


    // $ANTLR start "rule__Simple_selector__PseudoAssignment_0_2"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3689:1: rule__Simple_selector__PseudoAssignment_0_2 : ( rulepseudo ) ;
    public final void rule__Simple_selector__PseudoAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3693:1: ( ( rulepseudo ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3694:1: ( rulepseudo )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3694:1: ( rulepseudo )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3695:1: rulepseudo
            {
             before(grammarAccess.getSimple_selectorAccess().getPseudoPseudoParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_rulepseudo_in_rule__Simple_selector__PseudoAssignment_0_27520);
            rulepseudo();

            state._fsp--;

             after(grammarAccess.getSimple_selectorAccess().getPseudoPseudoParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__PseudoAssignment_0_2"


    // $ANTLR start "rule__Simple_selector__IdAssignment_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3704:1: rule__Simple_selector__IdAssignment_1 : ( rulecss_hash_class ) ;
    public final void rule__Simple_selector__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3708:1: ( ( rulecss_hash_class ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3709:1: ( rulecss_hash_class )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3709:1: ( rulecss_hash_class )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3710:1: rulecss_hash_class
            {
             before(grammarAccess.getSimple_selectorAccess().getIdCss_hash_classParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulecss_hash_class_in_rule__Simple_selector__IdAssignment_17551);
            rulecss_hash_class();

            state._fsp--;

             after(grammarAccess.getSimple_selectorAccess().getIdCss_hash_classParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__IdAssignment_1"


    // $ANTLR start "rule__Pseudo__NameAssignment_0_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3719:1: rule__Pseudo__NameAssignment_0_1 : ( RULE_IDENT ) ;
    public final void rule__Pseudo__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3723:1: ( ( RULE_IDENT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3724:1: ( RULE_IDENT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3724:1: ( RULE_IDENT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3725:1: RULE_IDENT
            {
             before(grammarAccess.getPseudoAccess().getNameIdentTerminalRuleCall_0_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Pseudo__NameAssignment_0_17582); 
             after(grammarAccess.getPseudoAccess().getNameIdentTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo__NameAssignment_0_1"


    // $ANTLR start "rule__Pseudo__FunctionAssignment_1_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3734:1: rule__Pseudo__FunctionAssignment_1_0 : ( rulefunction ) ;
    public final void rule__Pseudo__FunctionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3738:1: ( ( rulefunction ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3739:1: ( rulefunction )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3739:1: ( rulefunction )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3740:1: rulefunction
            {
             before(grammarAccess.getPseudoAccess().getFunctionFunctionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulefunction_in_rule__Pseudo__FunctionAssignment_1_07613);
            rulefunction();

            state._fsp--;

             after(grammarAccess.getPseudoAccess().getFunctionFunctionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo__FunctionAssignment_1_0"


    // $ANTLR start "rule__Pseudo__NameAssignment_1_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3749:1: rule__Pseudo__NameAssignment_1_1 : ( RULE_IDENT ) ;
    public final void rule__Pseudo__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3753:1: ( ( RULE_IDENT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3754:1: ( RULE_IDENT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3754:1: ( RULE_IDENT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3755:1: RULE_IDENT
            {
             before(grammarAccess.getPseudoAccess().getNameIdentTerminalRuleCall_1_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Pseudo__NameAssignment_1_17644); 
             after(grammarAccess.getPseudoAccess().getNameIdentTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo__NameAssignment_1_1"


    // $ANTLR start "rule__Element_name__NameAssignment_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3764:1: rule__Element_name__NameAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__Element_name__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3768:1: ( ( RULE_IDENT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3769:1: ( RULE_IDENT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3769:1: ( RULE_IDENT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3770:1: RULE_IDENT
            {
             before(grammarAccess.getElement_nameAccess().getNameIdentTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Element_name__NameAssignment_07675); 
             after(grammarAccess.getElement_nameAccess().getNameIdentTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element_name__NameAssignment_0"


    // $ANTLR start "rule__Element_name__NameAssignment_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3779:1: rule__Element_name__NameAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Element_name__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3783:1: ( ( ( '*' ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3784:1: ( ( '*' ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3784:1: ( ( '*' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3785:1: ( '*' )
            {
             before(grammarAccess.getElement_nameAccess().getNameAsteriskKeyword_1_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3786:1: ( '*' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3787:1: '*'
            {
             before(grammarAccess.getElement_nameAccess().getNameAsteriskKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__Element_name__NameAssignment_17711); 
             after(grammarAccess.getElement_nameAccess().getNameAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getElement_nameAccess().getNameAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element_name__NameAssignment_1"


    // $ANTLR start "rule__Declaration__PropertyAssignment_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3802:1: rule__Declaration__PropertyAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__Declaration__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3806:1: ( ( RULE_IDENT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3807:1: ( RULE_IDENT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3807:1: ( RULE_IDENT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3808:1: RULE_IDENT
            {
             before(grammarAccess.getDeclarationAccess().getPropertyIdentTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Declaration__PropertyAssignment_07750); 
             after(grammarAccess.getDeclarationAccess().getPropertyIdentTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__PropertyAssignment_0"


    // $ANTLR start "rule__Declaration__ExprAssignment_2"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3817:1: rule__Declaration__ExprAssignment_2 : ( ruleexpr ) ;
    public final void rule__Declaration__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3821:1: ( ( ruleexpr ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3822:1: ( ruleexpr )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3822:1: ( ruleexpr )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3823:1: ruleexpr
            {
             before(grammarAccess.getDeclarationAccess().getExprExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleexpr_in_rule__Declaration__ExprAssignment_27781);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getExprExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ExprAssignment_2"


    // $ANTLR start "rule__Declaration__PriorityAssignment_3"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3832:1: rule__Declaration__PriorityAssignment_3 : ( ( '!important' ) ) ;
    public final void rule__Declaration__PriorityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3836:1: ( ( ( '!important' ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3837:1: ( ( '!important' ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3837:1: ( ( '!important' ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3838:1: ( '!important' )
            {
             before(grammarAccess.getDeclarationAccess().getPriorityImportantKeyword_3_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3839:1: ( '!important' )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3840:1: '!important'
            {
             before(grammarAccess.getDeclarationAccess().getPriorityImportantKeyword_3_0()); 
            match(input,46,FOLLOW_46_in_rule__Declaration__PriorityAssignment_37817); 
             after(grammarAccess.getDeclarationAccess().getPriorityImportantKeyword_3_0()); 

            }

             after(grammarAccess.getDeclarationAccess().getPriorityImportantKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__PriorityAssignment_3"


    // $ANTLR start "rule__Expr__TermAssignment_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3855:1: rule__Expr__TermAssignment_0 : ( ruleterm ) ;
    public final void rule__Expr__TermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3859:1: ( ( ruleterm ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3860:1: ( ruleterm )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3860:1: ( ruleterm )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3861:1: ruleterm
            {
             before(grammarAccess.getExprAccess().getTermTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleterm_in_rule__Expr__TermAssignment_07856);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getExprAccess().getTermTermParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__TermAssignment_0"


    // $ANTLR start "rule__Expr__OperatorsAssignment_1_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3870:1: rule__Expr__OperatorsAssignment_1_0 : ( ( rule__Expr__OperatorsAlternatives_1_0_0 ) ) ;
    public final void rule__Expr__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3874:1: ( ( ( rule__Expr__OperatorsAlternatives_1_0_0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3875:1: ( ( rule__Expr__OperatorsAlternatives_1_0_0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3875:1: ( ( rule__Expr__OperatorsAlternatives_1_0_0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3876:1: ( rule__Expr__OperatorsAlternatives_1_0_0 )
            {
             before(grammarAccess.getExprAccess().getOperatorsAlternatives_1_0_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3877:1: ( rule__Expr__OperatorsAlternatives_1_0_0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3877:2: rule__Expr__OperatorsAlternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__Expr__OperatorsAlternatives_1_0_0_in_rule__Expr__OperatorsAssignment_1_07887);
            rule__Expr__OperatorsAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getOperatorsAlternatives_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__OperatorsAssignment_1_0"


    // $ANTLR start "rule__Expr__TermAssignment_1_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3886:1: rule__Expr__TermAssignment_1_1 : ( ruleterm ) ;
    public final void rule__Expr__TermAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3890:1: ( ( ruleterm ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3891:1: ( ruleterm )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3891:1: ( ruleterm )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3892:1: ruleterm
            {
             before(grammarAccess.getExprAccess().getTermTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleterm_in_rule__Expr__TermAssignment_1_17920);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getExprAccess().getTermTermParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__TermAssignment_1_1"


    // $ANTLR start "rule__Term__UnaryAssignment_0_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3901:1: rule__Term__UnaryAssignment_0_0 : ( ruleunary_operator ) ;
    public final void rule__Term__UnaryAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3905:1: ( ( ruleunary_operator ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3906:1: ( ruleunary_operator )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3906:1: ( ruleunary_operator )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3907:1: ruleunary_operator
            {
             before(grammarAccess.getTermAccess().getUnaryUnary_operatorParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleunary_operator_in_rule__Term__UnaryAssignment_0_07951);
            ruleunary_operator();

            state._fsp--;

             after(grammarAccess.getTermAccess().getUnaryUnary_operatorParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__UnaryAssignment_0_0"


    // $ANTLR start "rule__Term__NumberAssignment_0_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3916:1: rule__Term__NumberAssignment_0_1 : ( ruleunary_numbers ) ;
    public final void rule__Term__NumberAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3920:1: ( ( ruleunary_numbers ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3921:1: ( ruleunary_numbers )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3921:1: ( ruleunary_numbers )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3922:1: ruleunary_numbers
            {
             before(grammarAccess.getTermAccess().getNumberUnary_numbersParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleunary_numbers_in_rule__Term__NumberAssignment_0_17982);
            ruleunary_numbers();

            state._fsp--;

             after(grammarAccess.getTermAccess().getNumberUnary_numbersParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__NumberAssignment_0_1"


    // $ANTLR start "rule__Term__NameAssignment_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3931:1: rule__Term__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Term__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3935:1: ( ( RULE_STRING ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3936:1: ( RULE_STRING )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3936:1: ( RULE_STRING )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3937:1: RULE_STRING
            {
             before(grammarAccess.getTermAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Term__NameAssignment_18013); 
             after(grammarAccess.getTermAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__NameAssignment_1"


    // $ANTLR start "rule__Term__IdAssignment_2"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3946:1: rule__Term__IdAssignment_2 : ( RULE_IDENT ) ;
    public final void rule__Term__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3950:1: ( ( RULE_IDENT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3951:1: ( RULE_IDENT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3951:1: ( RULE_IDENT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3952:1: RULE_IDENT
            {
             before(grammarAccess.getTermAccess().getIdIdentTerminalRuleCall_2_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Term__IdAssignment_28044); 
             after(grammarAccess.getTermAccess().getIdIdentTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__IdAssignment_2"


    // $ANTLR start "rule__Term__UriAssignment_3"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3961:1: rule__Term__UriAssignment_3 : ( ruleURI ) ;
    public final void rule__Term__UriAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3965:1: ( ( ruleURI ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3966:1: ( ruleURI )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3966:1: ( ruleURI )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3967:1: ruleURI
            {
             before(grammarAccess.getTermAccess().getUriURIParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__Term__UriAssignment_38075);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getTermAccess().getUriURIParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__UriAssignment_3"


    // $ANTLR start "rule__Term__ColorAssignment_4"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3976:1: rule__Term__ColorAssignment_4 : ( RULE_HEXDIGITS ) ;
    public final void rule__Term__ColorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3980:1: ( ( RULE_HEXDIGITS ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3981:1: ( RULE_HEXDIGITS )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3981:1: ( RULE_HEXDIGITS )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3982:1: RULE_HEXDIGITS
            {
             before(grammarAccess.getTermAccess().getColorHexdigitsTerminalRuleCall_4_0()); 
            match(input,RULE_HEXDIGITS,FOLLOW_RULE_HEXDIGITS_in_rule__Term__ColorAssignment_48106); 
             after(grammarAccess.getTermAccess().getColorHexdigitsTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__ColorAssignment_4"


    // $ANTLR start "rule__Term__FunctionAssignment_5"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3991:1: rule__Term__FunctionAssignment_5 : ( rulefunction ) ;
    public final void rule__Term__FunctionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3995:1: ( ( rulefunction ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3996:1: ( rulefunction )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3996:1: ( rulefunction )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:3997:1: rulefunction
            {
             before(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulefunction_in_rule__Term__FunctionAssignment_58137);
            rulefunction();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__FunctionAssignment_5"


    // $ANTLR start "rule__Function__NameAssignment_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4006:1: rule__Function__NameAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__Function__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4010:1: ( ( RULE_IDENT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4011:1: ( RULE_IDENT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4011:1: ( RULE_IDENT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4012:1: RULE_IDENT
            {
             before(grammarAccess.getFunctionAccess().getNameIdentTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Function__NameAssignment_08168); 
             after(grammarAccess.getFunctionAccess().getNameIdentTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_0"


    // $ANTLR start "rule__Function__ExprAssignment_2"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4021:1: rule__Function__ExprAssignment_2 : ( ruleexpr ) ;
    public final void rule__Function__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4025:1: ( ( ruleexpr ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4026:1: ( ruleexpr )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4026:1: ( ruleexpr )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4027:1: ruleexpr
            {
             before(grammarAccess.getFunctionAccess().getExprExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleexpr_in_rule__Function__ExprAssignment_28199);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getExprExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ExprAssignment_2"


    // $ANTLR start "rule__URI__NameAssignment_3_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4036:1: rule__URI__NameAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__URI__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4040:1: ( ( RULE_STRING ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4041:1: ( RULE_STRING )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4041:1: ( RULE_STRING )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4042:1: RULE_STRING
            {
             before(grammarAccess.getURIAccess().getNameSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__URI__NameAssignment_3_08230); 
             after(grammarAccess.getURIAccess().getNameSTRINGTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__NameAssignment_3_0"


    // $ANTLR start "rule__URI__IdAssignment_3_1_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4051:1: rule__URI__IdAssignment_3_1_1 : ( RULE_IDENT ) ;
    public final void rule__URI__IdAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4055:1: ( ( RULE_IDENT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4056:1: ( RULE_IDENT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4056:1: ( RULE_IDENT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4057:1: RULE_IDENT
            {
             before(grammarAccess.getURIAccess().getIdIdentTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__URI__IdAssignment_3_1_18261); 
             after(grammarAccess.getURIAccess().getIdIdentTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__IdAssignment_3_1_1"


    // $ANTLR start "rule__URI__IdAssignment_4_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4066:1: rule__URI__IdAssignment_4_1 : ( RULE_IDENT ) ;
    public final void rule__URI__IdAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4070:1: ( ( RULE_IDENT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4071:1: ( RULE_IDENT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4071:1: ( RULE_IDENT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4072:1: RULE_IDENT
            {
             before(grammarAccess.getURIAccess().getIdIdentTerminalRuleCall_4_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__URI__IdAssignment_4_18292); 
             after(grammarAccess.getURIAccess().getIdIdentTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__IdAssignment_4_1"


    // $ANTLR start "rule__Css_hash_class__TypeAssignment_0"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4081:1: rule__Css_hash_class__TypeAssignment_0 : ( ( rule__Css_hash_class__TypeAlternatives_0_0 ) ) ;
    public final void rule__Css_hash_class__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4085:1: ( ( ( rule__Css_hash_class__TypeAlternatives_0_0 ) ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4086:1: ( ( rule__Css_hash_class__TypeAlternatives_0_0 ) )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4086:1: ( ( rule__Css_hash_class__TypeAlternatives_0_0 ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4087:1: ( rule__Css_hash_class__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getCss_hash_classAccess().getTypeAlternatives_0_0()); 
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4088:1: ( rule__Css_hash_class__TypeAlternatives_0_0 )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4088:2: rule__Css_hash_class__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Css_hash_class__TypeAlternatives_0_0_in_rule__Css_hash_class__TypeAssignment_08323);
            rule__Css_hash_class__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCss_hash_classAccess().getTypeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_hash_class__TypeAssignment_0"


    // $ANTLR start "rule__Css_hash_class__NameAssignment_1"
    // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4097:1: rule__Css_hash_class__NameAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__Css_hash_class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4101:1: ( ( RULE_IDENT ) )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4102:1: ( RULE_IDENT )
            {
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4102:1: ( RULE_IDENT )
            // ../org.eclipse.e4.tools.css.editor.ui/src-gen/org/eclipse/e4/ui/contentassist/antlr/internal/InternalCSS.g:4103:1: RULE_IDENT
            {
             before(grammarAccess.getCss_hash_classAccess().getNameIdentTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_hash_class__NameAssignment_18356); 
             after(grammarAccess.getCss_hash_classAccess().getNameIdentTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_hash_class__NameAssignment_1"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\1\uffff\1\5\10\uffff";
    static final String DFA11_minS =
        "\2\4\10\uffff";
    static final String DFA11_maxS =
        "\1\4\1\56\10\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\5\1\7\1\3\1\1\1\6\1\4\1\2\1\10";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1",
            "\1\5\1\uffff\3\5\4\uffff\2\5\1\uffff\6\4\3\6\2\3\2\11\2\uffff"+
            "\1\5\1\uffff\1\5\1\uffff\2\5\3\uffff\2\5\1\10\1\7\1\2\1\uffff"+
            "\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "965:1: rule__Unary_numbers__Alternatives : ( ( RULE_INT ) | ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) );";
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__0_in_rulestylesheet94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRules_in_entryRuleRules121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRules128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__0_in_ruleRules154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_import_in_entryRulecss_import181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_import188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_import__Group__0_in_rulecss_import214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0_in_ruleselector283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Alternatives_in_rulesimple_selector343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_in_entryRulepseudo370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepseudo377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo__Alternatives_in_rulepseudo403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_entryRuleelement_name430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement_name437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element_name__Alternatives_in_ruleelement_name463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_entryRuledeclaration490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruledeclaration523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0_in_ruleexpr583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleterm643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_rulefunction703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_numbers_in_entryRuleunary_numbers790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_numbers797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary_numbers__Alternatives_in_ruleunary_numbers823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePERCENTAGE857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__0_in_rulePERCENTAGE883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_entryRuleEMS910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMS917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMS__Group__0_in_ruleEMS943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_entryRuleEXS970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXS977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXS__Group__0_in_ruleEXS1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_entryRuleLENGTH1035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLENGTH1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__0_in_ruleLENGTH1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_entryRuleANGLE1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANGLE1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__0_in_ruleANGLE1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_entryRuleTIME1159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTIME1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Group__0_in_ruleTIME1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_entryRuleFREQ1219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFREQ1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Group__0_in_ruleFREQ1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_hash_class_in_entryRulecss_hash_class1279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_hash_class1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_hash_class__Group__0_in_rulecss_hash_class1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator1344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Alternatives_in_rulecombinator1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator1408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary_operator__Alternatives_in_ruleunary_operator1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_import__String_nameAssignment_1_0_in_rule__Css_import__Alternatives_11477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__Css_import__Alternatives_11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__0_in_rule__Selector__Alternatives_11527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__0_in_rule__Selector__Alternatives_11545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__0_in_rule__Simple_selector__Alternatives1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__IdAssignment_1_in_rule__Simple_selector__Alternatives1598 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__IdAssignment_1_in_rule__Simple_selector__Alternatives1610 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_rule__Pseudo__Group_0__0_in_rule__Pseudo__Alternatives1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo__Group_1__0_in_rule__Pseudo__Alternatives1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element_name__NameAssignment_0_in_rule__Element_name__Alternatives1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element_name__NameAssignment_1_in_rule__Element_name__Alternatives1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Expr__OperatorsAlternatives_1_0_01749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Expr__OperatorsAlternatives_1_0_01769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_0__0_in_rule__Term__Alternatives1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__NameAssignment_1_in_rule__Term__Alternatives1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__IdAssignment_2_in_rule__Term__Alternatives1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__UriAssignment_3_in_rule__Term__Alternatives1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ColorAssignment_4_in_rule__Term__Alternatives1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__FunctionAssignment_5_in_rule__Term__Alternatives1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__NameAssignment_3_0_in_rule__URI__Alternatives_31926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_3_1__0_in_rule__URI__Alternatives_31944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__URI__Alternatives_3_1_01978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__URI__Alternatives_3_1_01998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Unary_numbers__Alternatives2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_rule__Unary_numbers__Alternatives2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_rule__Unary_numbers__Alternatives2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_rule__Unary_numbers__Alternatives2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_rule__Unary_numbers__Alternatives2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_rule__Unary_numbers__Alternatives2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_rule__Unary_numbers__Alternatives2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_rule__Unary_numbers__Alternatives2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LENGTH__Alternatives_12184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__LENGTH__Alternatives_12204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LENGTH__Alternatives_12224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LENGTH__Alternatives_12244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LENGTH__Alternatives_12264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LENGTH__Alternatives_12284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ANGLE__Alternatives_12319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ANGLE__Alternatives_12339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ANGLE__Alternatives_12359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TIME__Alternatives_12394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TIME__Alternatives_12414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FREQ__Alternatives_12449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FREQ__Alternatives_12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Css_hash_class__TypeAlternatives_0_02504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Css_hash_class__TypeAlternatives_0_02524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Combinator__Alternatives2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Combinator__Alternatives2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Unary_operator__Alternatives2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Unary_operator__Alternatives2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__0__Impl_in_rule__Stylesheet__Group__02666 = new BitSet(new long[]{0x0000202060000080L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__1_in_rule__Stylesheet__Group__02669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__LocationAssignment_0_in_rule__Stylesheet__Group__0__Impl2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__1__Impl_in_rule__Stylesheet__Group__12727 = new BitSet(new long[]{0x0000202060000080L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__2_in_rule__Stylesheet__Group__12730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__ImportNameAssignment_1_in_rule__Stylesheet__Group__1__Impl2757 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__2__Impl_in_rule__Stylesheet__Group__22788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__RulesetAssignment_2_in_rule__Stylesheet__Group__2__Impl2815 = new BitSet(new long[]{0x0000200060000082L});
    public static final BitSet FOLLOW_rule__Rules__Group__0__Impl_in_rule__Rules__Group__02852 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_rule__Rules__Group__1_in_rule__Rules__Group__02855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__SelectorsAssignment_0_in_rule__Rules__Group__0__Impl2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__1__Impl_in_rule__Rules__Group__12912 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_rule__Rules__Group__2_in_rule__Rules__Group__12915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group_1__0_in_rule__Rules__Group__1__Impl2942 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Rules__Group__2__Impl_in_rule__Rules__Group__22973 = new BitSet(new long[]{0x0000001800000080L});
    public static final BitSet FOLLOW_rule__Rules__Group__3_in_rule__Rules__Group__22976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Rules__Group__2__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__3__Impl_in_rule__Rules__Group__33035 = new BitSet(new long[]{0x0000001800000080L});
    public static final BitSet FOLLOW_rule__Rules__Group__4_in_rule__Rules__Group__33038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__DeclarationsAssignment_3_in_rule__Rules__Group__3__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__4__Impl_in_rule__Rules__Group__43096 = new BitSet(new long[]{0x0000001800000080L});
    public static final BitSet FOLLOW_rule__Rules__Group__5_in_rule__Rules__Group__43099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group_4__0_in_rule__Rules__Group__4__Impl3126 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__5__Impl_in_rule__Rules__Group__53157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Rules__Group__5__Impl3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group_1__0__Impl_in_rule__Rules__Group_1__03228 = new BitSet(new long[]{0x0000200060000080L});
    public static final BitSet FOLLOW_rule__Rules__Group_1__1_in_rule__Rules__Group_1__03231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Rules__Group_1__0__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group_1__1__Impl_in_rule__Rules__Group_1__13290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__SelectorsAssignment_1_1_in_rule__Rules__Group_1__1__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group_4__0__Impl_in_rule__Rules__Group_4__03351 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Rules__Group_4__1_in_rule__Rules__Group_4__03354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Rules__Group_4__0__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group_4__1__Impl_in_rule__Rules__Group_4__13413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__DeclarationsAssignment_4_1_in_rule__Rules__Group_4__1__Impl3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_import__Group__0__Impl_in_rule__Css_import__Group__03475 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_rule__Css_import__Group__1_in_rule__Css_import__Group__03478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Css_import__Group__0__Impl3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_import__Group__1__Impl_in_rule__Css_import__Group__13537 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Css_import__Group__2_in_rule__Css_import__Group__13540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_import__Alternatives_1_in_rule__Css_import__Group__1__Impl3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_import__Group__2__Impl_in_rule__Css_import__Group__23597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Css_import__Group__2__Impl3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__03662 = new BitSet(new long[]{0x0000000180000020L});
    public static final BitSet FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__03665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SimpleselectorsAssignment_0_in_rule__Selector__Group__0__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__13722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Alternatives_1_in_rule__Selector__Group__1__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__0__Impl_in_rule__Selector__Group_1_0__03784 = new BitSet(new long[]{0x0000200060000080L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__1_in_rule__Selector__Group_1_0__03787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__CombinatorAssignment_1_0_0_in_rule__Selector__Group_1_0__0__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__1__Impl_in_rule__Selector__Group_1_0__13844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SelectorAssignment_1_0_1_in_rule__Selector__Group_1_0__1__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__0__Impl_in_rule__Selector__Group_1_1__03905 = new BitSet(new long[]{0x00002001E0000080L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__1_in_rule__Selector__Group_1_1__03908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl3938 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl3951 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__1__Impl_in_rule__Selector__Group_1_1__13984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__0_in_rule__Selector__Group_1_1__1__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__0__Impl_in_rule__Selector__Group_1_1_1__04046 = new BitSet(new long[]{0x00002001E0000080L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__1_in_rule__Selector__Group_1_1_1__04049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__CombinatorAssignment_1_1_1_0_in_rule__Selector__Group_1_1_1__0__Impl4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__1__Impl_in_rule__Selector__Group_1_1_1__14107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SelectorAssignment_1_1_1_1_in_rule__Selector__Group_1_1_1__1__Impl4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__0__Impl_in_rule__Simple_selector__Group_0__04168 = new BitSet(new long[]{0x0000004060000080L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__1_in_rule__Simple_selector__Group_0__04171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__ElementAssignment_0_0_in_rule__Simple_selector__Group_0__0__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__1__Impl_in_rule__Simple_selector__Group_0__14228 = new BitSet(new long[]{0x0000004060000080L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__2_in_rule__Simple_selector__Group_0__14231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__IdAssignment_0_1_in_rule__Simple_selector__Group_0__1__Impl4258 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__2__Impl_in_rule__Simple_selector__Group_0__24289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__PseudoAssignment_0_2_in_rule__Simple_selector__Group_0__2__Impl4316 = new BitSet(new long[]{0x0000004000000082L});
    public static final BitSet FOLLOW_rule__Pseudo__Group_0__0__Impl_in_rule__Pseudo__Group_0__04353 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Pseudo__Group_0__1_in_rule__Pseudo__Group_0__04356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Pseudo__Group_0__0__Impl4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo__Group_0__1__Impl_in_rule__Pseudo__Group_0__14415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo__NameAssignment_0_1_in_rule__Pseudo__Group_0__1__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo__Group_1__0__Impl_in_rule__Pseudo__Group_1__04476 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Pseudo__Group_1__1_in_rule__Pseudo__Group_1__04479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo__FunctionAssignment_1_0_in_rule__Pseudo__Group_1__0__Impl4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo__Group_1__1__Impl_in_rule__Pseudo__Group_1__14536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo__NameAssignment_1_1_in_rule__Pseudo__Group_1__1__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__04598 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__04601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__PropertyAssignment_0_in_rule__Declaration__Group__0__Impl4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__14658 = new BitSet(new long[]{0x00000242800001D0L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__14661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Declaration__Group__1__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__24720 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__24723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ExprAssignment_2_in_rule__Declaration__Group__2__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__34780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__PriorityAssignment_3_in_rule__Declaration__Group__3__Impl4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__04846 = new BitSet(new long[]{0x00000242800061D0L});
    public static final BitSet FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__04849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__TermAssignment_0_in_rule__Expr__Group__0__Impl4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__14906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl4933 = new BitSet(new long[]{0x00000242800061D2L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__04968 = new BitSet(new long[]{0x00000242800061D0L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__04971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__OperatorsAssignment_1_0_in_rule__Expr__Group_1__0__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__15029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__TermAssignment_1_1_in_rule__Expr__Group_1__1__Impl5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_0__0__Impl_in_rule__Term__Group_0__05090 = new BitSet(new long[]{0x0000000280000010L});
    public static final BitSet FOLLOW_rule__Term__Group_0__1_in_rule__Term__Group_0__05093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__UnaryAssignment_0_0_in_rule__Term__Group_0__0__Impl5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_0__1__Impl_in_rule__Term__Group_0__15151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__NumberAssignment_0_1_in_rule__Term__Group_0__1__Impl5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__05212 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__05215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_0_in_rule__Function__Group__0__Impl5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__15272 = new BitSet(new long[]{0x00000242800001D0L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__15275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Function__Group__1__Impl5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__25334 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__25337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ExprAssignment_2_in_rule__Function__Group__2__Impl5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__35394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Function__Group__3__Impl5422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__05461 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__05464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__URI__Group__0__Impl5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__15523 = new BitSet(new long[]{0x000001004000A040L});
    public static final BitSet FOLLOW_rule__URI__Group__2_in_rule__URI__Group__15526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__URI__Group__1__Impl5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__25585 = new BitSet(new long[]{0x000001004000A040L});
    public static final BitSet FOLLOW_rule__URI__Group__3_in_rule__URI__Group__25588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__3__Impl_in_rule__URI__Group__35646 = new BitSet(new long[]{0x000001004000A040L});
    public static final BitSet FOLLOW_rule__URI__Group__4_in_rule__URI__Group__35649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Alternatives_3_in_rule__URI__Group__3__Impl5676 = new BitSet(new long[]{0x000000000000A042L});
    public static final BitSet FOLLOW_rule__URI__Group__4__Impl_in_rule__URI__Group__45707 = new BitSet(new long[]{0x000001004000A040L});
    public static final BitSet FOLLOW_rule__URI__Group__5_in_rule__URI__Group__45710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__0_in_rule__URI__Group__4__Impl5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__5__Impl_in_rule__URI__Group__55768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__URI__Group__5__Impl5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_3_1__0__Impl_in_rule__URI__Group_3_1__05839 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__URI__Group_3_1__1_in_rule__URI__Group_3_1__05842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Alternatives_3_1_0_in_rule__URI__Group_3_1__0__Impl5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_3_1__1__Impl_in_rule__URI__Group_3_1__15899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__IdAssignment_3_1_1_in_rule__URI__Group_3_1__1__Impl5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__0__Impl_in_rule__URI__Group_4__05960 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__URI__Group_4__1_in_rule__URI__Group_4__05963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__URI__Group_4__0__Impl5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__1__Impl_in_rule__URI__Group_4__16022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__IdAssignment_4_1_in_rule__URI__Group_4__1__Impl6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__0__Impl_in_rule__PERCENTAGE__Group__06083 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__1_in_rule__PERCENTAGE__Group__06086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PERCENTAGE__Group__0__Impl6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__1__Impl_in_rule__PERCENTAGE__Group__16142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__PERCENTAGE__Group__1__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMS__Group__0__Impl_in_rule__EMS__Group__06205 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__EMS__Group__1_in_rule__EMS__Group__06208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EMS__Group__0__Impl6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMS__Group__1__Impl_in_rule__EMS__Group__16264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EMS__Group__1__Impl6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXS__Group__0__Impl_in_rule__EXS__Group__06327 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__EXS__Group__1_in_rule__EXS__Group__06330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EXS__Group__0__Impl6357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXS__Group__1__Impl_in_rule__EXS__Group__16386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EXS__Group__1__Impl6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__0__Impl_in_rule__LENGTH__Group__06449 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__1_in_rule__LENGTH__Group__06452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LENGTH__Group__0__Impl6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__1__Impl_in_rule__LENGTH__Group__16508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Alternatives_1_in_rule__LENGTH__Group__1__Impl6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__0__Impl_in_rule__ANGLE__Group__06569 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__1_in_rule__ANGLE__Group__06572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ANGLE__Group__0__Impl6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__1__Impl_in_rule__ANGLE__Group__16628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Alternatives_1_in_rule__ANGLE__Group__1__Impl6655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Group__0__Impl_in_rule__TIME__Group__06689 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__TIME__Group__1_in_rule__TIME__Group__06692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TIME__Group__0__Impl6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Group__1__Impl_in_rule__TIME__Group__16748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Alternatives_1_in_rule__TIME__Group__1__Impl6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Group__0__Impl_in_rule__FREQ__Group__06809 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__FREQ__Group__1_in_rule__FREQ__Group__06812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FREQ__Group__0__Impl6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Group__1__Impl_in_rule__FREQ__Group__16868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Alternatives_1_in_rule__FREQ__Group__1__Impl6895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_hash_class__Group__0__Impl_in_rule__Css_hash_class__Group__06929 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Css_hash_class__Group__1_in_rule__Css_hash_class__Group__06932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_hash_class__TypeAssignment_0_in_rule__Css_hash_class__Group__0__Impl6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_hash_class__Group__1__Impl_in_rule__Css_hash_class__Group__16989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_hash_class__NameAssignment_1_in_rule__Css_hash_class__Group__1__Impl7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Stylesheet__LocationAssignment_07055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_import_in_rule__Stylesheet__ImportNameAssignment_17086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRules_in_rule__Stylesheet__RulesetAssignment_27117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Rules__SelectorsAssignment_07148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Rules__SelectorsAssignment_1_17179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_rule__Rules__DeclarationsAssignment_37210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_rule__Rules__DeclarationsAssignment_4_17241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Css_import__String_nameAssignment_1_07272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_rule__Selector__SimpleselectorsAssignment_07303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_0_07334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_0_17365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_1_1_07396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_1_1_17427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_rule__Simple_selector__ElementAssignment_0_07458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_hash_class_in_rule__Simple_selector__IdAssignment_0_17489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_in_rule__Simple_selector__PseudoAssignment_0_27520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_hash_class_in_rule__Simple_selector__IdAssignment_17551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Pseudo__NameAssignment_0_17582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_rule__Pseudo__FunctionAssignment_1_07613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Pseudo__NameAssignment_1_17644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Element_name__NameAssignment_07675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Element_name__NameAssignment_17711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Declaration__PropertyAssignment_07750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Declaration__ExprAssignment_27781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Declaration__PriorityAssignment_37817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__Expr__TermAssignment_07856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__OperatorsAlternatives_1_0_0_in_rule__Expr__OperatorsAssignment_1_07887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__Expr__TermAssignment_1_17920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_rule__Term__UnaryAssignment_0_07951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_numbers_in_rule__Term__NumberAssignment_0_17982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Term__NameAssignment_18013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Term__IdAssignment_28044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__Term__UriAssignment_38075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXDIGITS_in_rule__Term__ColorAssignment_48106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_rule__Term__FunctionAssignment_58137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Function__NameAssignment_08168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Function__ExprAssignment_28199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__URI__NameAssignment_3_08230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__URI__IdAssignment_3_1_18261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__URI__IdAssignment_4_18292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_hash_class__TypeAlternatives_0_0_in_rule__Css_hash_class__TypeAssignment_08323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_hash_class__NameAssignment_18356 = new BitSet(new long[]{0x0000000000000002L});

}