package com.nebiroz.thinkingjava.lessons.chapter03;

/**
 * Created by Frost on 14.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise02 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise02(){
		header = "Упражнение 2";
		description = "Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен.<br/>";
		codeExample =
				"class TestNamesCombination {\n" +
				"\tfloat floatNumber;\n" +
				"}\n\n" +
				"...\n\n" +
				"printOutLn(\"1) Создадим 2 экземпляра.\");\n" +
				"TestNamesCombination a = new TestNamesCombination();\n" +
				"TestNamesCombination b = new TestNamesCombination();\n" +
				"\n" +
				"a.floatNumber = 4;\n" +
				"b.floatNumber = 7;\n" +
				"printOutLn(\"a.floatNumber = \" + a.floatNumber + \"; b.floatNumber = \" + b.floatNumber + \";\\n\");\n" +
				"\n" +
				"printOutLn(\"2) Выполним a = b и зададим b.floatNumber = 9\");\n" +
				"a = b;\n" +
				"b.floatNumber = 9;\n" +
				"printOutLn(\"a.floatNumber = \" + a.floatNumber + \"; b.floatNumber = \" + b.floatNumber + \";\\n\");\n" +
				"\n" +
				"printOutLn(\"3) Зададим a.floatNumber = 8\");\n" +
				"a.floatNumber = 8;\n" +
				"printOutLn(\"a.floatNumber = \" + a.floatNumber + \"; b.floatNumber = \" + b.floatNumber + \";\\n\");\n" +
				"\n" +
				"printOutLn(\"4) Пересоздадим a и зададим a.floatNumber = 3\");\n" +
				"a = new TestNamesCombination();\n" +
				"a.floatNumber = 3;\n" +
				"printOutLn(\"a.floatNumber = \" + a.floatNumber + \"; b.floatNumber = \" + b.floatNumber + \";\\n\");\n" +
				"\n\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"1) Создадим 2 экземпляра.\n" +
				"a.floatNumber = 4.0; b.floatNumber = 7.0;\n" +
				"\n" +
				"2) Выполним a = b и зададим b.floatNumber = 9\n" +
				"a.floatNumber = 9.0; b.floatNumber = 9.0;\n" +
				"\n" +
				"3) Зададим a.floatNumber = 8\n" +
				"a.floatNumber = 8.0; b.floatNumber = 8.0;\n" +
				"\n" +
				"4) Пересоздадим a и зададим a.floatNumber = 3\n" +
				"a.floatNumber = 3.0; b.floatNumber = 8.0;";
		printExampleText();
	}

	/**
	 * Исходный код для примера.
	 * Нужно написать примерочный код класса.
	 */

	class TestNamesCombination {
		float floatNumber;
	}


	/**
	 * Исходный код вызывающего блока.
	 * Здесь нужно написать всю цепочку вызовов.
	 * @return String результат выполнинения исходного кода для примера
	 */
	@Override
	public String runExample() {
		startOutResult();

		/**
		 * Здесь нужно написать цепочки вызовов функций
		 */

		printOutLn("1) Создадим 2 экземпляра.");
		TestNamesCombination a = new TestNamesCombination();
		TestNamesCombination b = new TestNamesCombination();

		a.floatNumber = 4;
		b.floatNumber = 7;
		printOutLn("a.floatNumber = " + a.floatNumber + "; b.floatNumber = " + b.floatNumber + ";\n");

		printOutLn("2) Выполним a = b и зададим b.floatNumber = 9");
		a = b;
		b.floatNumber = 9;
		printOutLn("a.floatNumber = " + a.floatNumber + "; b.floatNumber = " + b.floatNumber + ";\n");

		printOutLn("3) Зададим a.floatNumber = 8");
		a.floatNumber = 8;
		printOutLn("a.floatNumber = " + a.floatNumber + "; b.floatNumber = " + b.floatNumber + ";\n");

		printOutLn("4) Пересоздадим a и зададим a.floatNumber = 3");
		a = new TestNamesCombination();
		a.floatNumber = 3;
		printOutLn("a.floatNumber = " + a.floatNumber + "; b.floatNumber = " + b.floatNumber + ";\n");

		stopOutResult();
		return endExeceuteExample();
	}
}
