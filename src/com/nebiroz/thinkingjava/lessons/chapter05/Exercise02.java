package com.nebiroz.thinkingjava.lessons.chapter05;

import com.nebiroz.thinkingjava.lessons.*;
import com.nebiroz.thinkingjava.lessons.chapter05.Exercise01.NotAllocatedString;

public class Exercise02 extends BaseExample{
	public Exercise02(){
		header = "Exercise 02";
		description = "Создать класс с полем String, инициализируемым в точке определения, и другим полем, инициализируемым в конструкторе.<br/>"
				+ "Чем отличаются эти два подхода?";
		codeExample = "class Test {\n"
				+ "	public String text = \"Text in definition!\";\n"
				+ "	public String text2;\n"
				+ "\n"
				+ "	public Test(){\n"
				+ "	text2 = \"Text in constructor!\";\n"
				+ "	}\n"
				+ "}\n"
				+ "\n"
				+ "Вывод первого значения - Text in definition!\n"
				+ "Вывод второго значения - Text in constructor\n"
				+ "\n\n";
		printExampleText();
	}
	
	class Test {
		public String text = "Text in definition!";
		public String text2;
		
		public Test(){
			text2 = "Text in constructor!";
		}
	}
	
	@Override
	public String runExample() {
		startOutResult();
		
		Test tst;
		tst = new Test();
		printOutResultLn(tst.text);
		printOutResultLn(tst.text2);
		
		stopOutResult();
		return endExeceuteExample();
	}
}
