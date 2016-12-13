package com.nebiroz.thinkingjava.lessons.chapter02;

/**
 * Created by Frost on 13.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise03 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise03(){
		header = "Упражнение 3";
		description = "Найдите фрагмент кода с классом ATypeName и сделайте из него программу, пригодную для компиляции и запуска.<br/>" +
				"Код:<br/>" +
				"class ATypeName { /* Тело класса */}<br/>" +
				"...<br/>" +
				"ATypeName a = new ATypeName();";
		codeExample =
				"class ATypeName {\n" +
				"\tpublic void outputString() {\n" +
				"\t\tSystem.out.println(\"Привет миру из метода класса!\");\n" +
				"\t}\n" +
				"}\n" +
				"...\n" +
				"ATypeName a = new ATypeName();\n" +
				"a.outputString();\n\n\n" +
				"В итоге должны вывестись надпись:\n" +
				"Привет миру из метода класса!\n";
		printExampleText();
	}

	/**
	 * Исходный код для примера.
	 * Нужно написать примерочный код класса.
	 */

	class ATypeName {
		public void outputString() {
			printOutLn("Привет миру из метода класса!");
		}
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
		ATypeName a = new ATypeName();
		a.outputString();

		stopOutResult();
		return endExeceuteExample();
	}
}
