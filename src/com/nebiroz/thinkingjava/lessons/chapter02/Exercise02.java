package com.nebiroz.thinkingjava.lessons.chapter02;

/**
 * Created by Frost on 13.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise02 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise02(){
		header = "Упражнение 2";
		description = "На основании примера HelloDate.java в этой главе напишите программу \"Привет, мир!\", которая просто выводит это сообщение.<br/>" +
				"Программа будет содержать только 1 метод (тот, который исполняется при запуске программы - main()).<br/>" +
				"Не забудьте его объявить статическим (static) и включите список аргументов, даже если вы не будете его использовать.<br/>" +
				"Скомпилируйте программу с помощью javac и запустите на исполнение из java.<br/>" +
				"Если вы используете не JDKб а другую среду разработки программ, выясните, как в ней компилируются и запускаются программы.<br/>";
		codeExample =
				"public static void main(String[] args) {\n" +
				"\tSystem.out.println(\"Hello, world!\");\n" +
				"}\n\n" +
				"В итоге должны вывестись надпись:" +
				"Hello, world!\n";
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
		printOutLn("Привет, мир!");

		stopOutResult();
		return endExeceuteExample();
	}
}
