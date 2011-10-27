package org.eclipse.e4.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSSLexer extends Lexer {
    public static final int RULE_ID=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=12;
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

    public InternalCSSLexer() {;} 
    public InternalCSSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCSSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:11:7: ( ',' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:12:7: ( '{' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:12:9: '{'
            {
            match('{'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:13:7: ( ';' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:13:9: ';'
            {
            match(';'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:14:7: ( '}' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:14:9: '}'
            {
            match('}'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:15:7: ( '@import' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:15:9: '@import'
            {
            match("@import"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:16:7: ( ':' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:16:9: ':'
            {
            match(':'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:17:7: ( '*' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:17:9: '*'
            {
            match('*'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:18:7: ( '!important' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:18:9: '!important'
            {
            match("!important"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:19:7: ( '/' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:19:9: '/'
            {
            match('/'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:20:7: ( '(' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:20:9: '('
            {
            match('('); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:21:7: ( ')' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:21:9: ')'
            {
            match(')'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:22:7: ( 'url' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:22:9: 'url'
            {
            match("url"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:23:7: ( '\\\\' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:23:9: '\\\\'
            {
            match('\\'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:24:7: ( '.' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:24:9: '.'
            {
            match('.'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:25:7: ( '%' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:25:9: '%'
            {
            match('%'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:26:7: ( 'em' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:26:9: 'em'
            {
            match("em"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:27:7: ( 'ex' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:27:9: 'ex'
            {
            match("ex"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:28:7: ( 'px' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:28:9: 'px'
            {
            match("px"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:29:7: ( 'cm' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:29:9: 'cm'
            {
            match("cm"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:30:7: ( 'mm' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:30:9: 'mm'
            {
            match("mm"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:31:7: ( 'in' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:31:9: 'in'
            {
            match("in"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:32:7: ( 'pt' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:32:9: 'pt'
            {
            match("pt"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:33:7: ( 'pc' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:33:9: 'pc'
            {
            match("pc"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:34:7: ( 'deg' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:34:9: 'deg'
            {
            match("deg"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:35:7: ( 'rad' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:35:9: 'rad'
            {
            match("rad"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:36:7: ( 'grad' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:36:9: 'grad'
            {
            match("grad"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:37:7: ( 'ms' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:37:9: 'ms'
            {
            match("ms"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:38:7: ( 's' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:38:9: 's'
            {
            match('s'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:39:7: ( 'hz' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:39:9: 'hz'
            {
            match("hz"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:40:7: ( 'khz' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:40:9: 'khz'
            {
            match("khz"); 


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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:41:7: ( '#' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:41:9: '#'
            {
            match('#'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:42:7: ( '+' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:42:9: '+'
            {
            match('+'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:43:7: ( '>' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:43:9: '>'
            {
            match('>'); 

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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:44:7: ( '-' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:44:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_HEXDIGITS"
    public final void mRULE_HEXDIGITS() throws RecognitionException {
        try {
            int _type = RULE_HEXDIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1719:16: ( '#' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1719:18: '#' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('#'); 
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1719:22: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXDIGITS"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1721:12: ( ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1721:14: ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1721:42: ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1723:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1723:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1723:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1723:11: '^'
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

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1723:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:
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
            	    break loop4;
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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1725:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1725:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1725:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1725:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1727:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1727:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1727:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1727:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1727:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1727:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1727:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1727:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1727:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1727:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1727:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1729:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1729:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1729:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1729:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1731:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1731:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1731:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1731:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1731:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1731:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1731:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1731:41: '\\r'
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
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1733:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1733:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1733:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1735:16: ( . )
            // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1735:18: .
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
        // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_HEXDIGITS | RULE_IDENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=43;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:214: RULE_HEXDIGITS
                {
                mRULE_HEXDIGITS(); 

                }
                break;
            case 36 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:229: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 37 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:240: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:248: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:257: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:269: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:285: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:301: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // ../org.eclipse.e4.tools.css.editor/src-gen/org/eclipse/e4/parser/antlr/internal/InternalCSS.g:1:309: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\5\uffff\1\45\2\uffff\1\45\1\60\2\uffff\1\65\3\uffff\10\65\1\105"+
        "\2\65\1\111\2\uffff\1\114\1\65\1\45\1\uffff\2\45\17\uffff\2\65\4"+
        "\uffff\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\3\65"+
        "\1\uffff\1\136\1\65\11\uffff\1\140\11\uffff\1\141\1\142\1\65\1\uffff"+
        "\1\144\3\uffff\1\145\2\uffff";
    static final String DFA14_eofS =
        "\146\uffff";
    static final String DFA14_minS =
        "\1\0\4\uffff\1\151\2\uffff\1\151\1\52\2\uffff\1\60\3\uffff\10\60"+
        "\1\55\3\60\2\uffff\1\55\1\60\1\101\1\uffff\2\0\17\uffff\2\60\4\uffff"+
        "\11\55\3\60\1\uffff\1\55\1\60\11\uffff\1\55\11\uffff\2\55\1\60\1"+
        "\uffff\1\55\3\uffff\1\55\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\4\uffff\1\151\2\uffff\1\151\1\57\2\uffff\1\172\3\uffff"+
        "\13\172\1\146\2\uffff\3\172\1\uffff\2\uffff\17\uffff\2\172\4\uffff"+
        "\14\172\1\uffff\2\172\11\uffff\1\172\11\uffff\3\172\1\uffff\1\172"+
        "\3\uffff\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\2\uffff\1\12\1\13\1\uffff"+
        "\1\15\1\16\1\17\14\uffff\1\40\1\41\3\uffff\1\46\2\uffff\1\52\1\53"+
        "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\50\1\51\1\11\1\12\1\13\2\uffff"+
        "\1\44\1\15\1\16\1\17\14\uffff\1\34\2\uffff\1\43\1\37\1\40\1\41\1"+
        "\42\1\45\1\46\1\47\1\52\1\uffff\1\20\1\21\1\22\1\26\1\27\1\23\1"+
        "\24\1\33\1\25\3\uffff\1\35\1\uffff\1\14\1\30\1\31\1\uffff\1\36\1"+
        "\32";
    static final String DFA14_specialS =
        "\1\1\41\uffff\1\0\1\2\102\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\10\1\42\1\33\1\45\1\17\1"+
            "\45\1\43\1\12\1\13\1\7\1\34\1\1\1\36\1\16\1\11\12\41\1\6\1\3"+
            "\2\45\1\35\1\45\1\5\32\37\1\45\1\15\1\45\1\40\1\37\1\45\2\37"+
            "\1\22\1\25\1\20\1\37\1\27\1\31\1\24\1\37\1\32\1\37\1\23\2\37"+
            "\1\21\1\37\1\26\1\30\1\37\1\14\5\37\1\2\1\45\1\4\uff82\45",
            "",
            "",
            "",
            "",
            "\1\52",
            "",
            "",
            "\1\55",
            "\1\56\4\uffff\1\57",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\63\10\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\71\12\64"+
            "\1\72\2\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\75\20\64"+
            "\1\74\3\64\1\73\2\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\76\15\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\77\5\64"+
            "\1\100\7\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\101\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\102\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\103\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\104\10\64",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\31\64\1\106",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\107\22\64",
            "\12\110\7\uffff\6\110\32\uffff\6\110",
            "",
            "",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\32\115\4\uffff\1\115\1\uffff\32\115",
            "",
            "\0\117",
            "\0\117",
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
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\121\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\133\23\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\134\26\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\135\31\64",
            "",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\31\64\1\137",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\143\26\64",
            "",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "",
            "\1\65\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_HEXDIGITS | RULE_IDENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_34 = input.LA(1);

                        s = -1;
                        if ( ((LA14_34>='\u0000' && LA14_34<='\uFFFF')) ) {s = 79;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0==',') ) {s = 1;}

                        else if ( (LA14_0=='{') ) {s = 2;}

                        else if ( (LA14_0==';') ) {s = 3;}

                        else if ( (LA14_0=='}') ) {s = 4;}

                        else if ( (LA14_0=='@') ) {s = 5;}

                        else if ( (LA14_0==':') ) {s = 6;}

                        else if ( (LA14_0=='*') ) {s = 7;}

                        else if ( (LA14_0=='!') ) {s = 8;}

                        else if ( (LA14_0=='/') ) {s = 9;}

                        else if ( (LA14_0=='(') ) {s = 10;}

                        else if ( (LA14_0==')') ) {s = 11;}

                        else if ( (LA14_0=='u') ) {s = 12;}

                        else if ( (LA14_0=='\\') ) {s = 13;}

                        else if ( (LA14_0=='.') ) {s = 14;}

                        else if ( (LA14_0=='%') ) {s = 15;}

                        else if ( (LA14_0=='e') ) {s = 16;}

                        else if ( (LA14_0=='p') ) {s = 17;}

                        else if ( (LA14_0=='c') ) {s = 18;}

                        else if ( (LA14_0=='m') ) {s = 19;}

                        else if ( (LA14_0=='i') ) {s = 20;}

                        else if ( (LA14_0=='d') ) {s = 21;}

                        else if ( (LA14_0=='r') ) {s = 22;}

                        else if ( (LA14_0=='g') ) {s = 23;}

                        else if ( (LA14_0=='s') ) {s = 24;}

                        else if ( (LA14_0=='h') ) {s = 25;}

                        else if ( (LA14_0=='k') ) {s = 26;}

                        else if ( (LA14_0=='#') ) {s = 27;}

                        else if ( (LA14_0=='+') ) {s = 28;}

                        else if ( (LA14_0=='>') ) {s = 29;}

                        else if ( (LA14_0=='-') ) {s = 30;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='b')||LA14_0=='f'||LA14_0=='j'||LA14_0=='l'||(LA14_0>='n' && LA14_0<='o')||LA14_0=='q'||LA14_0=='t'||(LA14_0>='v' && LA14_0<='z')) ) {s = 31;}

                        else if ( (LA14_0=='^') ) {s = 32;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 33;}

                        else if ( (LA14_0=='\"') ) {s = 34;}

                        else if ( (LA14_0=='\'') ) {s = 35;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 36;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='$'||LA14_0=='&'||(LA14_0>='<' && LA14_0<='=')||LA14_0=='?'||LA14_0=='['||LA14_0==']'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_35 = input.LA(1);

                        s = -1;
                        if ( ((LA14_35>='\u0000' && LA14_35<='\uFFFF')) ) {s = 79;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}