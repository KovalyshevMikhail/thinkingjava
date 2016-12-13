package com.nebiroz.thinkingjava.lessons.chapter02;

/**
 * Created by Frost on 13.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise01 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise01(){
		header = "Упражнение 1";
		description = "Создайте класс с полями int и char, которые не инициализируются в программе.<br/>"
				+ "Выведите их значения, чтобы убедиться в том, что Java выполняет инициализацию по умолчанию.<br/>";
		codeExample =
				"class DefaultInitialize{\n" +
				"\tpublic int number;\n" +
				"\tpublic char symbol;\n" +
				"}\n" +
				"...\n" +
				"public static void main(String[] args) {\n" +
				"\tDefaultInitialize a = new DefaultInitialize();\n" +
				"\tprintOutLn(\"Переменная \"number\" = \" + a.number);\n" +
				"\tprintOutLn(String.format(\"Переменная \"symbol\" = [ %c ]\", a.symbol));\n" +
				"}\n\n" +
				"В итоге должны вывестись надписи:" +
				"Переменная \"number\" = 0\n" +
				"Переменная \"symbol\" = [  ]";
		printExampleText();
	}

	/**
	 * Исходный код для примера.
	 * Нужно написать примерочный код класса.
	 */
	class DefaultInitialize{
		public int number;
		public char symbol;
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
		DefaultInitialize a = new DefaultInitialize();
		printOutLn("Переменная \"number\" = " + a.number);
		printOutLn(String.format("Переменная \"symbol\" = [ %c ]", a.symbol));

		stopOutResult();
		return endExeceuteExample();
	}
}
