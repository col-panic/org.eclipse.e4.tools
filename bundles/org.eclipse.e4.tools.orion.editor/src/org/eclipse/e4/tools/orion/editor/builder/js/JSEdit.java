package org.eclipse.e4.tools.orion.editor.builder.js;

public class JSEdit
{
  protected static String nl;
  public static synchronized JSEdit create(String lineSeparator)
  {
    nl = lineSeparator;
    JSEdit result = new JSEdit();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "/*globals require*/" + NL + "require([\"orion/editor/edit\"], function(edit) {" + NL + "\tvar editor = edit({" + NL + "\t\tlang: \"js\"" + NL + "\t});" + NL + "\tsetOrionEditor(editor);" + NL + "\t//----------------" + NL + "});";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
