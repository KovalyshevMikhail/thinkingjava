package com.nebiroz.thinkingjava.lessons.chapter02;

/**
 * Created by Frost on 13.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

class StaticStorage {
	static int staticVariable = 3;
	int dynamicVariable = 3;

	void increment() { staticVariable++; dynamicVariable++; }
}

public class Exercise08 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise08(){
		header = "Упражнение 8";
		description = "Напишите программу, которая демонстрирует, что независимо от количества созданных объектов класс содержит только один экземпляр поля static.<br/>";
		codeExample =
				"class StaticStorage {\n" +
				"\tstatic int staticVariable = 3;\n" +
				"\tint dynamicVariable = 3;\n" +
				"\n" +
				"\tvoid increment() { staticVariable++; dynamicVariable++; }\n" +
				"}\n" +
				"...\n" +
				"System.out.println(\"Создадим 3 хранилища и выведем результаты.\");\n" +
				"StaticStorage st1 = new StaticStorage();\n" +
				"StaticStorage st2 = new StaticStorage();\n" +
				"StaticStorage st3 = new StaticStorage();\n" +
				"System.out.println(\"st1 {static: \" + st1.staticVariable + \"; dynamic: \" + st1.dynamicVariable + \" }\");\n" +
				"System.out.println(\"st2 {static: \" + st2.staticVariable + \"; dynamic: \" + st2.dynamicVariable + \" }\");\n" +
				"System.out.println(\"st3 {static: \" + st3.staticVariable + \"; dynamic: \" + st3.dynamicVariable + \" }\");\n" +
				"\n" +
				"System.out.println(\"Выполним функцию увеличения на 1, у st1 - 2 раза, st2 - 4 раза, st3 - 5 раз.\");\n" +
				"System.out.println(\"Предположительно, static должен увеличиться на (2 + 4 + 5) = 11\");\n" +
				"st1.increment();\n" +
				"st1.increment();\n" +
				"\n" +
				"st2.increment();\n" +
				"st2.increment();\n" +
				"st2.increment();\n" +
				"st2.increment();\n" +
				"\n" +
				"st3.increment();\n" +
				"st3.increment();\n" +
				"st3.increment();\n" +
				"st3.increment();\n" +
				"st3.increment();\n" +
				"\n" +
				"System.out.println(\"Проверим результаты:\");\n" +
				"System.out.println(\"st1 {static: \" + st1.staticVariable + \"; dynamic: \" + st1.dynamicVariable + \" }\");\n" +
				"System.out.println(\"st2 {static: \" + st2.staticVariable + \"; dynamic: \" + st2.dynamicVariable + \" }\");\n" +
				"System.out.println(\"st3 {static: \" + st3.staticVariable + \"; dynamic: \" + st3.dynamicVariable + \" }\");\n\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"Создадим 3 хранилища и выведем результаты.\n" +
				"st1 {static: 3; dynamic: 3 }\n" +
				"st2 {static: 3; dynamic: 3 }\n" +
				"st3 {static: 3; dynamic: 3 }\n" +
				"Выполним функцию увеличения на 1, у st1 - 2 раза, st2 - 4 раза, st3 - 5 раз.\n" +
				"Выведем результаты:\n" +
				"st1 {static: 14; dynamic: 5 }\n" +
				"st2 {static: 14; dynamic: 7 }\n" +
				"st3 {static: 14; dynamic: 8 }";
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

		printOutLn("Создадим 3 хранилища и выведем результаты.");
		StaticStorage st1 = new StaticStorage();
		StaticStorage st2 = new StaticStorage();
		StaticStorage st3 = new StaticStorage();
		printOutLn("st1 {static: " + st1.staticVariable + "; dynamic: " + st1.dynamicVariable + " }");
		printOutLn("st2 {static: " + st2.staticVariable + "; dynamic: " + st2.dynamicVariable + " }");
		printOutLn("st3 {static: " + st3.staticVariable + "; dynamic: " + st3.dynamicVariable + " }");

		printOutLn("Выполним функцию увеличения на 1, у st1 - 2 раза, st2 - 4 раза, st3 - 5 раз.");
		printOutLn("Предположительно, static должен увеличиться на (2 + 4 + 5) = 11");
		st1.increment();
		st1.increment();

		st2.increment();
		st2.increment();
		st2.increment();
		st2.increment();

		st3.increment();
		st3.increment();
		st3.increment();
		st3.increment();
		st3.increment();

		printOutLn("Проверим результаты:");
		printOutLn("st1 {static: " + st1.staticVariable + "; dynamic: " + st1.dynamicVariable + " }");
		printOutLn("st2 {static: " + st2.staticVariable + "; dynamic: " + st2.dynamicVariable + " }");
		printOutLn("st3 {static: " + st3.staticVariable + "; dynamic: " + st3.dynamicVariable + " }");

		stopOutResult();
		return endExeceuteExample();
	}
}


