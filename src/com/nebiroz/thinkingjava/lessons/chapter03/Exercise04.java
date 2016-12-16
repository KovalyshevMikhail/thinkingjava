package com.nebiroz.thinkingjava.lessons.chapter03;

/**
 * Created by Frost on 16.12.2016.
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
		description = "Напишите программу, которая вычисляет скорость для постоянных значений расстояния и времени.<br/>";
		codeExample =
				"float performSpeed(float meters, float time) {\n" +
				"\treturn (meters / 1000) / time;\n" +
				"}\n" +
				"...\n" +
				"print(\"Скорость для расстояния 20 000 м. и времени 4 часа = \" + performSpeed(20000f, 4f) + \" км/ч\");\n" +
				"print(\"Скорость для расстояния 5 000 м. и времени 0.5 часа = \" + performSpeed(5000f, 0.5f) + \" км/ч\");\n" +
				"\n\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"Скорость для расстояния 20 000 м. и времени 4 часа = 5.0 км/ч\n" +
				"Скорость для расстояния 5 000 м. и времени 0.5 часа = 10.0 км/ч";
		printExampleText();
	}

	/**
	 * Исходный код для примера.
	 * Нужно написать примерочный код класса.
	 */

	float performSpeed(float meters, float time) {
		return (meters / 1000) / time;
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

		printOutLn("Скорость для расстояния 20 000 м. и времени 4 часа = " + performSpeed(20000f, 4f) + " км/ч");
		printOutLn("Скорость для расстояния 5 000 м. и времени 0.5 часа = " + performSpeed(5000f, 0.5f) + " км/ч");

		stopOutResult();
		return endExeceuteExample();
	}
}
