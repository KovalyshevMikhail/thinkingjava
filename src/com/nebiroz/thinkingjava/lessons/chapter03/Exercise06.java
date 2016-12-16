package com.nebiroz.thinkingjava.lessons.chapter03;

/**
 * Created by Frost on 16.12.2016.
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
		description = "В упражнении 5 создайте новую ссылку га Dog и присвойте ее объекту spot.<br/>" +
				"Сравните ссылки оператором == и методом equals().<br/>";
		codeExample =
				"class Dog {\n" +
				"\tString name, says;\n" +
				"\n" +
				"\tDog(String newName, String newSays) {\n" +
				"\tname = newName;\n" +
				"\t\tsays = newSays;\n" +
				"\t}\n" +
				"}\n" +
				"...\n" +
				"Dog spot = new Dog(\"Spot\", \"Gav-gav-gav-gav\");\n" +
				"Dog scruffy = new Dog(\"Scruffy\", \"Scr-scr-scr-scruuuuuufff\");\n" +
				"\n" +
				"Dog newDog = new Dog(\"Пудель\", \"Тра-та-та-та-та\");\n" +
				"spot = newDog;\n" +
				"\n" +
				"print(\"Попробуем сравнить spot == newDog. Результат: \" + (spot == newDog));\n" +
				"print(\"Попробуем сравнить через spot.equals(newDog). Результат: \" + (spot.equals(newDog)));\n" +
				"\n\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"Попробуем сравнить spot == newDog. Результат: true\n" +
				"Попробуем сравнить через spot.equals(newDog). Результат: true";
		printExampleText();
	}

	/**
	 * Исходный код для примера.
	 * Нужно написать примерочный код класса.
	 */

	class Dog {
		String name, says;

		Dog(String newName, String newSays) {
			name = newName;
			says = newSays;
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

		Dog spot = new Dog("Spot", "Gav-gav-gav-gav");
		Dog scruffy = new Dog("Scruffy", "Scr-scr-scr-scruuuuuufff");

		Dog newDog = new Dog("Пудель", "Тра-та-та-та-та");
		spot = newDog;

		printOutLn("Попробуем сравнить spot == newDog. Результат: " + (spot == newDog));
		printOutLn("Попробуем сравнить через spot.equals(newDog). Результат: " + (spot.equals(newDog)));

		stopOutResult();
		return endExeceuteExample();
	}
}
