package com.nebiroz.thinkingjava.lessons.chapter02;

/**
 * Created by Frost on 13.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise05 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise05(){
		header = "Упражнение 5";
		description = "Измените упражнение 4 так, чтобы данным класса DataOnly присваивались значения, а затем распечатайте их в методе main().<br/>";
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
				"System.out.println(\"Задали значение DataOnly.i = \" + don.i);\n" +
				"System.out.println(\"Задали значение DataOnly.d = \" + don.d);\n" +
				"System.out.println(\"Задали значение DataOnly.b = \" + don.b);\n\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"Создали экземпляр класс - com.nebiroz.thinkingjava.lessons.chapter02.Exercise04$DataOnly@c11eb59\n" +
				"Задали значение DataOnly.i = 5\n" +
				"Задали значение DataOnly.d = 0.7\n" +
				"Задали значение DataOnly.b = true\n";
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
		printOutLn("Задали значение DataOnly.i = " + don.i);
		printOutLn("Задали значение DataOnly.d = " + don.d);
		printOutLn("Задали значение DataOnly.b = " + don.b);

		stopOutResult();
		return endExeceuteExample();
	}
}
