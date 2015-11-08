package com.nebiroz.thinkingjava.lessons.chapter04;

import com.nebiroz.thinkingjava.lessons.*;

public class Example01 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */

	public Example01(){
		header = "Example 01";
		description = "Конструкция if-else";
		codeExample = "public class IfElse {\n"
				+ "	static int result = 0;\n"
				+ "	static void test(int testval, int target){\n"
				+ "		if (testval > target) result = 1;\n"
				+ "		else if (testval < target) result = 1;\n"
				+ "		else result = 0;\n"
				+ "	}\n"
				+ "}\n"
				+ "1 ==> test(10, 5);\n"
				+ "2 ==> test(5, 10);\n"
				+ "3 ==> test(5, 5);\n";
		printExampleText();
	}

	/**
	 * Исходный код для примера.
	 * Нужно написать примерочный код класса.
	 */

	static void test(int testval, int target){
		if (testval > target)
			result = 1;
		else if (testval < target)
			result = -1;
		else
			result = 0;
	}

	/**
	 * Исходный код вызывающего блока.
	 * Здесь нужно написать всю цепочку вызовов.
	 * @return String результат выполнинения исходного кода для примера
	 */

	@Override
	public String runExample() {
		startOutResult();
		
		test(10, 5);
		printOutResultLn(1, String.format("%d", result));
		test(5, 10);
		printOutResultLn(2, String.format("%d", result));
		test(5, 5);
		printOutResultLn(3, String.format("%d", result));
		
		stopOutResult();
		return endExeceuteExample();
	}
	
	
}
