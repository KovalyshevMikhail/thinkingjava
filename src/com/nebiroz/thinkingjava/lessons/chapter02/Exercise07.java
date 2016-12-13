package com.nebiroz.thinkingjava.lessons.chapter02;

/**
 * Created by Frost on 13.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

class Incrementable {
	static int increment(int variable) { return ++variable; }
}

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
		description = "Превратите фрагменты кода с классом Incrementable в работающую программу.<br/>" +
				"Класс Incrementable:<br/>" +
				"class Incrementable {<br/>" +
				"\tstatic void increment() { StaticTest.i++; }<br/>" +
				"}";
		codeExample =
				"class Incrementable {\n" +
				"\tstatic int increment(int variable) { return ++variable; }\n" +
				"}\n\n" +
				"class TestIncrementable {\n" +
				"\tint innerValue;\n" +
				"\n" +
				"\tint get() { return innerValue; }\n" +
				"\tvoid set(int a) { innerValue = a; }\n" +
				"}\n" +
				"...\n" +
				"System.out.println(\"Создадим экземпляр класса и заполним внутренее число цифрой 2:\");\n" +
				"TestIncrementable test = new TestIncrementable();\n" +
				"test.set(2);\n" +
				"System.out.println(\"Проверим. test.innerValue = \" + test.get());\n" +
				"\n" +
				"System.out.println(\"Используем класс Incrementable для увеличения значения на 1:\");\n" +
				"test.set(Incrementable.increment(test.get()));\n" +
				"System.out.println(\"Проверим. test.innerValue = \" + test.get());\n" +
				"\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"Создадим экземпляр класса и заполним внутренее число цифрой 2:\n" +
				"Проверим. test.innerValue = 2\n" +
				"Используем класс Incrementable для увеличения значения на 1:\n" +
				"Проверим. test.innerValue = 3";
		printExampleText();
	}

	/**
	 * Исходный код для примера.
	 * Нужно написать примерочный код класса.
	 */

	class TestIncrementable {
		int innerValue;

		int get() { return innerValue; }
		void set(int a) { innerValue = a; }
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

		printOutLn("Создадим экземпляр класса и заполним внутренее число цифрой 2:");
		TestIncrementable test = new TestIncrementable();
		test.set(2);
		printOutLn("Проверим. test.innerValue = " + test.get());

		printOutLn("Используем класс Incrementable для увеличения значения на 1:");
		test.set(Incrementable.increment(test.get()));
		printOutLn("Проверим. test.innerValue = " + test.get());

		stopOutResult();
		return endExeceuteExample();
	}
}


