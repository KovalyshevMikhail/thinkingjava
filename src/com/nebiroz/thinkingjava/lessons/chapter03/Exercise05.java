package com.nebiroz.thinkingjava.lessons.chapter03;

/**
 * Created by Frost on 16.12.2016.
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
		description = "Создайте класс Dog, содержащий два поля типа String: name и says. В методе main() создайте два объекта Dog с разными именами (spot, scruffy) и сообщениями.<br/>" +
				      "Выведите значения обоих полей для каждого из объектов.<br/>";
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
				"print(\"Первая собака по имени \"\" + spot.name + \"\" гавкает так \"\" + spot.says + \"\"\");\n" +
				"print(\"Вторая собака по имени \"\" + scruffy.name + \"\" гавкает так \"\" + scruffy.says + \"\"\");\n" +
				"\n\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"Первая собака по имени \"Spot\" гавкает так \"Gav-gav-gav-gav\"\n" +
				"Вторая собака по имени \"Scruffy\" гавкает так \"Scr-scr-scr-scruuuuuufff\"";
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

		printOutLn("Первая собака по имени \"" + spot.name + "\" гавкает так \"" + spot.says + "\"");
		printOutLn("Вторая собака по имени \"" + scruffy.name + "\" гавкает так \"" + scruffy.says + "\"");

		stopOutResult();
		return endExeceuteExample();
	}
}

