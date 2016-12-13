package com.nebiroz.thinkingjava.lessons.chapter02;

/**
 * Created by Frost on 14.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise09 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise09(){
		header = "Упражнение 9";
		description = "Напишите программу, демонстрирующую автоматическую упаковку примитивных типов.<br/>";
		codeExample =
				"System.out.println(\"Протестируем автоматическую упаковку на 3 типах данных: boolean, char, int.\");\n" +
				"\n" +
				"Boolean autoBool = true;\n" +
				"boolean primaryBool = true;\n" +
				"\n" +
				"Character autoChar = 'C';\n" +
				"char primaryChar = 'C';\n" +
				"\n" +
				"Integer autoInt = 5;\n" +
				"int primaryInt = 5;\n" +
				"\n" +
				"System.out.println(\"Boolean   {auto: '\" + autoBool + \"'; primary: '\" + primaryBool + \"'}\");\n" +
				"System.out.println(\"Character {auto: '\" + autoChar + \"'; primary: '\" + primaryChar + \"'}\");\n" +
				"System.out.println(\"Integer   {auto: '\" + autoInt + \"';  primary: '\" + primaryInt + \"'}\");\n\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"Протестируем автоматическую упаковку на 3 типах данных: boolean, char, int.\n" +
				"Boolean   {auto: 'true'; primary: 'true'}\n" +
				"Character {auto: 'C'; primary: 'C'}\n" +
				"Integer   {auto: '5';  primary: '5'}";
		printExampleText();
	}

	/**
	 * Исходный код для примера.
	 * Нужно написать примерочный код класса.
	 */


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

		printOutLn("Протестируем автоматическую упаковку на 3 типах данных: boolean, char, int.");

		Boolean autoBool = true;
		boolean primaryBool = true;

		Character autoChar = 'C';
		char primaryChar = 'C';

		Integer autoInt = 5;
		int primaryInt = 5;

		printOutLn("Boolean   {auto: '" + autoBool + "'; primary: '" + primaryBool + "'}");
		printOutLn("Character {auto: '" + autoChar + "'; primary: '" + primaryChar + "'}");
		printOutLn("Integer   {auto: '" + autoInt + "';  primary: '" + primaryInt + "'}");

		stopOutResult();
		return endExeceuteExample();
	}
}


