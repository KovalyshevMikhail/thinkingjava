package com.nebiroz.thinkingjava.lessons.chapter03;

/**
 * Created by Frost on 14.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise03 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise03(){
		header = "Упражнение 3";
		description = "Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен при вызове методов.<br/>";
		codeExample =
				"class PositionCharacter {\n" +
				"\tfloat x = 10;\n" +
				"\tfloat y = 10;\n" +
				"\tfloat z = 10;\n" +
				"}\n" +
				"\n" +
				"static void setLocationToBegin(PositionCharacter loc) {\n" +
				"\tloc.x = 0;\n" +
				"\tloc.y = 0;\n" +
				"\tloc.z = 0;\n" +
				"}\n\n" +
				"class Character {\n" +
				"\tPositionCharacter location;\n" +
				"\n" +
				"\tCharacter() {\n" +
				"\t\tlocation = new PositionCharacter();\n" +
				"\t}\n" +
				"\n" +
				"\tvoid changeLocation(PositionCharacter loc) {\n" +
				"\t\tlocation = loc;\n" +
				"\t}\n" +
				"\n" +
				"\tPositionCharacter getLocation() {\n" +
				"\t\treturn location;\n" +
				"\t}\n" +
				"}\n" +
				"...\n" +
				"Character person = new Character();\n" +
				"PositionCharacter persLoc = person.getLocation();\n" +
				"print(\"x = \" + persLoc.x + \"; y = \" + persLoc.y + \"; z = \" + persLoc.z + \";\");\n" +
				"setLocationToBegin(persLoc);\n" +
				"print(\"x = \" + persLoc.x + \"; y = \" + persLoc.y + \"; z = \" + persLoc.z + \";\");\n" +
				"person.changeLocation(persLoc);\n" +
				"\n\n\n" +
				"В итоге должны вывестись надписи:\n" +
				"x = 10.0; y = 10.0; z = 10.0;\n" +
				"x = 0.0; y = 0.0; z = 0.0;";
		printExampleText();
	}

	/**
	 * Исходный код для примера.
	 * Нужно написать примерочный код класса.
	 */

	class PositionCharacter {
		float x = 10;
		float y = 10;
		float z = 10;
	}

	static void setLocationToBegin(PositionCharacter loc) {
		loc.x = 0;
		loc.y = 0;
		loc.z = 0;
	}

	class Character {
		PositionCharacter location;

		Character() {
			location = new PositionCharacter();
		}

		void changeLocation(PositionCharacter loc) {
			location = loc;
		}

		PositionCharacter getLocation() {
			return location;
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

		Character person = new Character();
		PositionCharacter persLoc = person.getLocation();
		printOutLn("x = " + persLoc.x + "; y = " + persLoc.y + "; z = " + persLoc.z + ";");
		setLocationToBegin(persLoc);
		printOutLn("x = " + persLoc.x + "; y = " + persLoc.y + "; z = " + persLoc.z + ";");
		person.changeLocation(persLoc);

		stopOutResult();
		return endExeceuteExample();
	}
}
