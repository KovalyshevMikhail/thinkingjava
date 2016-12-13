package com.nebiroz.thinkingjava.lessons.chapter02;

/**
 * Created by Frost on 13.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise04 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise04(){
		header = "Упражнение 4";
		description = "Сделайте то же для кода с использованием класса DataOnly.<br/>" +
				"Код:<br/>" +
				"class DataOnly {\n" +
				"\tint i;\n" +
				"\tdouble d;\n" +
				"\tboolean b;\n" +
				"}\n";
		codeExample =
				"class DataOnly {\n" +
				"\tint i;\n" +
				"\tdouble d;\n" +
				"\tboolean b;\n" +
				"\n" +
				"\tpublic void setVariables() {\n" +
				"\t\ti = 12;\n" +
				"\t\td = 1.8d;\n" +
				"\t\tb = false;\n" +
				"\t}\n" +
				"}\n" +
				"...\n" +
				"DataOnly don = new DataOnly();\n" +
				"System.out.println(\"Создали экземпляр класс - \" + don);\n" +
				"don.i = 5;\n" +
				"don.d = 0.7d;\n" +
				"don.b = true;\n" +
				"System.out.println(\"Поменяли значение DataOnly.i на \" + don.i);\n" +
				"System.out.println(\"Поменяли значение DataOnly.d на \" + don.d);\n" +
				"System.out.println(\"Поменяли значение DataOnly.b на \" + don.b);\n" +
				"don.setVariables();\n" +
				"System.out.println(\"Вызвали функцию установки значения\");\n" +
				"System.out.println(\"Значение DataOnly.i поменялось на \" + don.i);\n" +
				"System.out.println(\"Значение DataOnly.d поменялось на \" + don.d);\n" +
				"System.out.println(\"Значение DataOnly.b поменялось на \" + don.b);\n\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"Создали экземпляр класс - com.nebiroz.thinkingjava.lessons.chapter02.Exercise04$DataOnly@c11eb59\n" +
				"Поменяли значение DataOnly.i на 5\n" +
				"Поменяли значение DataOnly.d на 0.7\n" +
				"Поменяли значение DataOnly.b на true\n" +
				"Вызвали функцию установки значения\n" +
				"Значение DataOnly.i поменялось на 12\n" +
				"Значение DataOnly.d поменялось на 1.8\n" +
				"Значение DataOnly.b поменялось на false\n";
		printExampleText();
	}

	/**
	 * Исходный код для примера.
	 * Нужно написать примерочный код класса.
	 */

	class DataOnly {
		int i;
		double d;
		boolean b;

		public void setVariables() {
			i = 12;
			d = 1.8d;
			b = false;
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

		DataOnly don = new DataOnly();
		printOutLn("Создали экземпляр класс - " + don);
		don.i = 5;
		don.d = 0.7d;
		don.b = true;
		printOutLn("Поменяли значение DataOnly.i на " + don.i);
		printOutLn("Поменяли значение DataOnly.d на " + don.d);
		printOutLn("Поменяли значение DataOnly.b на " + don.b);
		don.setVariables();
		printOutLn("Вызвали функцию установки значения");
		printOutLn("Значение DataOnly.i поменялось на " + don.i);
		printOutLn("Значение DataOnly.d поменялось на " + don.d);
		printOutLn("Значение DataOnly.b поменялось на " + don.b);

		stopOutResult();
		return endExeceuteExample();
	}
}
