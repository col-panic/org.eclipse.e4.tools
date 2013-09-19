package org.eclipse.e4.tools.orion.editor.builder.css;

public class CSSEdit
{
  protected static String nl;
  public static synchronized CSSEdit create(String lineSeparator)
  {
    nl = lineSeparator;
    CSSEdit result = new CSSEdit();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " " + NL + "" + NL + "/*global define */" + NL + "" + NL + "define('examples/editor/swtContentAssist', [ //$NON-NLS-0$" + NL + "\t'orion/editor/templates' //$NON-NLS-0$" + NL + "], function(mTemplates) {" + NL + "" + NL + "\tvar colorValues = {" + NL + "\t\ttype: \"link\", //$NON-NLS-0$" + NL + "\t\tvalues: [" + NL + "\t\t\t\"COLOR_BLACK\", //$NON-NLS-0$" + NL + "\t\t\t\"COLOR_INFO_BACKGROUND\", //$NON-NLS-0$" + NL + "\t\t\t\"black\", //$NON-NLS-0$" + NL + "\t\t\t\"white\", //$NON-NLS-0$" + NL + "\t\t\t\"red\", //$NON-NLS-0$" + NL + "\t\t\t\"green\", //$NON-NLS-0$" + NL + "\t\t\t\"blue\", //$NON-NLS-0$" + NL + "\t\t\t\"magenta\", //$NON-NLS-0$" + NL + "\t\t\t\"yellow\", //$NON-NLS-0$" + NL + "\t\t\t\"cyan\", //$NON-NLS-0$" + NL + "\t\t\t\"grey\", //$NON-NLS-0$" + NL + "\t\t\t\"darkred\", //$NON-NLS-0$" + NL + "\t\t\t\"darkgreen\", //$NON-NLS-0$" + NL + "\t\t\t\"darkblue\", //$NON-NLS-0$" + NL + "\t\t\t\"darkmagenta\", //$NON-NLS-0$" + NL + "\t\t\t\"darkcyan\", //$NON-NLS-0$" + NL + "\t\t\t\"darkyellow\", //$NON-NLS-0$" + NL + "\t\t\t\"darkgray\", //$NON-NLS-0$" + NL + "\t\t\t\"lightgray\" //$NON-NLS-0$" + NL + "\t\t]" + NL + "\t};" + NL + "\tfunction fromJSON(o) {" + NL + "\t\treturn JSON.stringify(o).replace(\"}\", \"\\\\}\"); //$NON-NLS-1$ //$NON-NLS-0$" + NL + "\t}" + NL + "\tvar templates = [" + NL + "\t\t{" + NL + "\t\t\tprefix: \"swt-outer-keyline-color\", //$NON-NLS-0$" + NL + "\t\t\tdescription: \"ctab folder keyline - keyline color\", //$NON-NLS-0$" + NL + "\t\t\ttemplate: \"swt-outer-keyline-color: ${color:\" + fromJSON(colorValues) + \"};\" //$NON-NLS-1$ //$NON-NLS-0$" + NL + "\t\t}," + NL + "\t\t{" + NL + "\t\t\tprefix: \"frame-image\", //$NON-NLS-0$" + NL + "\t\t\tdescription: \"image - the frame image\", //$NON-NLS-0$" + NL + "\t\t\ttemplate: \"frame-image: url(\\\"${uri}\\\");\" //$NON-NLS-0$" + NL + "\t\t}" + NL + "\t];" + NL + "\tvar keywords = [" + NL + "\t\t";
  protected final String TEXT_2 = NL + "\t];" + NL + "" + NL + "\tfunction SWTContentAssistProvider() {" + NL + "\t}" + NL + "\tSWTContentAssistProvider.prototype = new mTemplates.TemplateContentAssist(keywords, templates);" + NL + "\t" + NL + "\tSWTContentAssistProvider.prototype.getPrefix = function(buffer, offset, context) {" + NL + "\t\tvar index = offset;" + NL + "\t\twhile (index && /[A-Za-z\\-\\@]/.test(buffer.charAt(index - 1))) {" + NL + "\t\t\tindex--;" + NL + "\t\t}" + NL + "\t\treturn index ? buffer.substring(index, offset) : \"\";" + NL + "\t};" + NL + "" + NL + "\treturn {" + NL + "\t\tSWTContentAssistProvider: SWTContentAssistProvider" + NL + "\t};" + NL + "});" + NL + "" + NL + "/*globals require*/" + NL + "require([\"orion/editor/edit\", \"examples/editor/swtContentAssist\"], function(edit, mSWTContentAssist) {" + NL + "\tvar editor = edit({" + NL + "\t\tlang: \"css\"" + NL + "\t});" + NL + "\t//ADD THE SWT CONTENT ASSIST" + NL + "\tvar contentAssist = editor.getContentAssist ? editor.getContentAssist() : editor._contentAssist;" + NL + "\tcontentAssist.addEventListener(\"Activating\", function() { //$NON-NLS-0$" + NL + "\t\tcontentAssist.providers.push(new mSWTContentAssist.SWTContentAssistProvider());" + NL + "\t});" + NL + "\tsetOrionEditor(editor);" + NL + "\t//----------------" + NL + "});";
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     String keywords = (String)argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( keywords );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
