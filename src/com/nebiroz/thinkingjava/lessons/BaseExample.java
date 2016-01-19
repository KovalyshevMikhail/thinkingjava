package com.nebiroz.thinkingjava.lessons;

public class BaseExample implements IBaseExample{
	private String textOut = "";
	
	public String header = "";
	public String description = "";
	public String codeExample = "";
	
	public BaseExample(){ }
	
	
	public void startOutResult() { textOut += "<hr/><h3>Реальный результат:</h3><pre>"; }
	public void stopOutResult() { textOut += "</pre>"; }
	public void printOutResult(String text) { textOut += text + " "; }
	public void printOutResultLn(String text) { textOut += text + "\n"; }
	public void printOutResultLn(int caseNum, String text) { textOut += "Number case: " + caseNum + ". Result: " + text + "\n"; }
	
	
	public void printOut(String text)	{ textOut += " " + text; }
	public void printOutLn(String text)	{ printOut("" + text + "<br/>"); }
	
	public void printExampleText() {
		printHeader(header);
		printDescription(description);
		printCodeOfExample(codeExample);
	}
	public void printHeader(String header) { textOut += "<small style=\"float: left; padding-top: 0.7em;\"><a href=\"\\lessons\">к списку</a></small><h2 style=\"float: left;\">" + header + "</h2><hr style=\"clear: both;\"/>"; }
	public void printDescription(String description) { textOut += "<h3>" + description + "</h3>";}
	public void printCodeOfExample(String code) { textOut += "<pre>" + code + "</pre>"; }
	
	public String endExeceuteExample() 	{ return textOut; }
	
	
	public String runExample(){
		return "";
	}
}
