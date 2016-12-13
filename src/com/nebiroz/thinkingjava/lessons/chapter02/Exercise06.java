package com.nebiroz.thinkingjava.lessons.chapter02;

/**
 * Created by Frost on 13.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise06 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise06(){
		header = "Упражнение 6";
		description = "Напишите программу, включающую метод storage(), приведенный ранее в этой главе.<br/>" +
				"Метод storage():<br/>" +
				"int storage(String s) {<br/>" +
				"\treturn s.length() * 2;<br/>" +
				"}";
		codeExample =
				"class TestStorage {\n" +
				"\tint lastStorage;\n" +
				"\n" +
				"\tint storage(String str) {\n" +
				"\t\treturn str.length() * 2;\n" +
				"\t}\n" +
				"}\n" +
				"...\n" +
				"TestStorage store = new TestStorage();\n" +
				"printOutLn(\"Тест простой строки \"Привет!\" = \" + store.storage(\"Привет!\"));\n" +
				"\n" +
				"store.lastStorage = store.storage(\"По сложнее строка\");\n" +
				"printOutLn(\"Запишем результат от строки \"По сложнее строка!\" во внутреннюю переменную и выведем - \" + store.lastStorage);\n\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"Тест простой строки \"Привет!\" = 14\n" +
				"Запишем результат от строки \"По сложнее строка!\" во внутреннюю переменную и выведем - 34";
		printExampleText();
	}

	/**
	 * Исходный код для примера.
	 * Нужно написать примерочный код класса.
	 */

	class TestStorage {
		int lastStorage;

		int storage(String str) {
			return str.length() * 2;
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

		TestStorage store = new TestStorage();
		printOutLn("Тест простой строки \"Привет!\" = " + store.storage("Привет!"));

		store.lastStorage = store.storage("По сложнее строка");
		printOutLn("Запишем результат от строки \"По сложнее строка!\" во внутреннюю переменную и выведем - " + store.lastStorage);

		stopOutResult();
		return endExeceuteExample();
	}
}

