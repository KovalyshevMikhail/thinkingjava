package com.nebiroz.thinkingjava.lessons.chapter03;

/**
 * Created by Frost on 14.12.2016.
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
		description = "Напишите программу, в которой используюся как \"короткие\", так и \"длинные\" команды печати.<br/>";
		codeExample =
				"print(\"Привет всем!\");\n" +
				"System.out.println(\"Вывел число - \" + 10);\n\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"Привет всем!\n" +
				"Вывел число - 10";
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

		printOutLn("Привет всем!");
		printOutLn("Вывел число - " + 10);

		stopOutResult();
		return endExeceuteExample();
	}
}


