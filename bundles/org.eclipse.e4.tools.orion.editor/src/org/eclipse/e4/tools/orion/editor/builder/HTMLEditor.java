package org.eclipse.e4.tools.orion.editor.builder;

public class HTMLEditor
{
  protected static String nl;
  public static synchronized HTMLEditor create(String lineSeparator)
  {
    nl = lineSeparator;
    HTMLEditor result = new HTMLEditor();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<!DOCTYPE html>" + NL + "<html>" + NL + "<head>" + NL + "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />" + NL + "<title>Theme CSS editor</title>" + NL + "<style>" + NL + "#editor {" + NL + "\t//border: 1px solid teal;" + NL + "\tposition: absolute;" + NL + "\ttop: 0px;" + NL + "\tleft: 0px;" + NL + "\tbottom: 0px;" + NL + "\tright: 0px;" + NL + "\t//margin: 20px;" + NL + "\tmargin: 0px;" + NL + "}" + NL + "" + NL + "pre {" + NL + "\tmargin: 0px;" + NL + "}" + NL + "</style>" + NL + "<link rel=\"stylesheet\" type=\"text/css\" href=\"";
  protected final String TEXT_2 = "\"/>" + NL + "<script src=\"";
  protected final String TEXT_3 = "\"></script>" + NL + "" + NL + "<script>" + NL + "\tfunction setOrionEditor(editor) {" + NL + "\t  window.editor = editor;" + NL + "\t  if (typeof orion_onLoad == 'function') orion_onLoad();" + NL + "\t}" + NL + "</script>" + NL;
  protected final String TEXT_4 = NL + "<script>";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "</script>";
  protected final String TEXT_7 = NL + NL + "</head>" + NL + "<body spellcheck=\"false\">" + NL + "<pre id=\"editor\" class=\"editor\" data-editor-lang=\"";
  protected final String TEXT_8 = "\" data-editor-show-folding-ruler=\"true\" >" + NL + "</pre>" + NL + "</body>" + NL + "</html>";
  protected final String TEXT_9 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     EditorOptions options = (EditorOptions)argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( options.getEditorCssUrl() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( options.getEditorJsUrl() );
    stringBuffer.append(TEXT_3);
     for (String script : options.getScripts()) { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    stringBuffer.append( script );
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
    stringBuffer.append( options.getLang() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}
