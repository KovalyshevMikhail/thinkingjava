package com.nebiroz.thinkingjava.lessons.chapter03;

/**
 * Created by Frost on 16.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

import java.util.Random;

public class Exercise07 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise07(){
		header = "Упражнение 7";
		description = "Напишите программу, моделирующую бросок монетки.<br/>";
		codeExample =
				"Random myRand = new Random();\n" +
				"printOutLn(\"Бросим монетку 10 раз.\");\n" +
				"printOutLn(\"1 раз.  орел - \" + (myRand.nextInt(100) > myRand.nextInt(100)));\n" +
				"printOutLn(\"2 раз.  орел - \" + (myRand.nextInt(100) > myRand.nextInt(100)));\n" +
				"printOutLn(\"3 раз.  орел - \" + (myRand.nextInt(100) > myRand.nextInt(100)));\n" +
				"printOutLn(\"4 раз.  орел - \" + (myRand.nextInt(100) > myRand.nextInt(100)));\n" +
				"printOutLn(\"5 раз.  орел - \" + (myRand.nextInt(100) > myRand.nextInt(100)));\n" +
				"printOutLn(\"6 раз.  орел - \" + (myRand.nextInt(100) > myRand.nextInt(100)));\n" +
				"printOutLn(\"7 раз.  орел - \" + (myRand.nextInt(100) > myRand.nextInt(100)));\n" +
				"printOutLn(\"8 раз.  орел - \" + (myRand.nextInt(100) > myRand.nextInt(100)));\n" +
				"printOutLn(\"9 раз.  орел - \" + (myRand.nextInt(100) > myRand.nextInt(100)));\n" +
				"printOutLn(\"10 раз. орел - \" + (myRand.nextInt(100) > myRand.nextInt(100)));\n" +
				"\n\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"Бросим монетку 10 раз.\n" +
				"1 раз.  орел - true\n" +
				"2 раз.  орел - true\n" +
				"3 раз.  орел - true\n" +
				"4 раз.  орел - false\n" +
				"5 раз.  орел - true\n" +
				"6 раз.  орел - false\n" +
				"7 раз.  орел - true\n" +
				"8 раз.  орел - true\n" +
				"9 раз.  орел - false\n" +
				"10 раз. орел - false";
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

		Random myRand = new Random();
		printOutLn("Бросим монетку 10 раз.");
		printOutLn("1 раз.  орел - " + (myRand.nextInt(100) > myRand.nextInt(100)));
		printOutLn("2 раз.  орел - " + (myRand.nextInt(100) > myRand.nextInt(100)));
		printOutLn("3 раз.  орел - " + (myRand.nextInt(100) > myRand.nextInt(100)));
		printOutLn("4 раз.  орел - " + (myRand.nextInt(100) > myRand.nextInt(100)));
		printOutLn("5 раз.  орел - " + (myRand.nextInt(100) > myRand.nextInt(100)));
		printOutLn("6 раз.  орел - " + (myRand.nextInt(100) > myRand.nextInt(100)));
		printOutLn("7 раз.  орел - " + (myRand.nextInt(100) > myRand.nextInt(100)));
		printOutLn("8 раз.  орел - " + (myRand.nextInt(100) > myRand.nextInt(100)));
		printOutLn("9 раз.  орел - " + (myRand.nextInt(100) > myRand.nextInt(100)));
		printOutLn("10 раз. орел - " + (myRand.nextInt(100) > myRand.nextInt(100)));

		stopOutResult();
		return endExeceuteExample();
	}
}
