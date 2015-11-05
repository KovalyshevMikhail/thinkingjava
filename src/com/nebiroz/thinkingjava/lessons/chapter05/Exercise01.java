package com.nebiroz.thinkingjava.lessons.chapter05;

import com.nebiroz.thinkingjava.lessons.*;

public class Exercise01 extends BaseExample {
	static int result = 0;
	
	public Exercise01(){
		header = "Exercise 01";
		description = "Создать класс с неинициализированной ссылкой на String.<br/>"
				+ "Показать, что Java инициализирует ссылку значением Null";
		codeExample = "class NotAllocatedString{\n"
				+ "	String myString;\n"
				+ "\n"
				+ "	public NotAllocatedString(){\n"
				+ "	}\n"
				+ "}\n"
				+ "\n"
				+ "Вывод строки должен вывести значение - null;\n";
		printExampleText();
	}
	
	class NotAllocatedString{
		public String myString;
		
		public NotAllocatedString(){
		}
	}
	
	@Override
	public String runExample() {
		startOutResult();
		
		NotAllocatedString notAlloc = new NotAllocatedString();
		printOutResultLn(notAlloc.myString);
		
		stopOutResult();
		return endExeceuteExample();
	}
}
