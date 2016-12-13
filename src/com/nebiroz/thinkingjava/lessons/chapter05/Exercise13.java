package com.nebiroz.thinkingjava.lessons.chapter05;

/**
 * Created by Frost on 12.12.2016.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

class Part {
	Part(int number) {
		System.out.println("Part (" + number + ")");
	}
	void fun(int number) {
		System.out.println("fun ( " + number + " )");
	}
}

class Car {
	static Part engine;
	static Part door;
	static {
		engine = new Part(1);
		door = new Part(4);
	}

	Car() {
		System.out.println("Car()");
	}
}

public class Exercise13 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise13(){
		header = "Упражнение 13";
		description = "Проверьте истинность утверждений из предыдущего абзаца.<br/>"
				+ "Статические инициализаторы класса Cups выполняются либо при обращении к статическому объекту c1 в строке с пометкой (1), либо если строка (1) закомментирована - в строках (2) после снятия комментариев.<br/>"
				+ "Если же и строка (1), и строки (2) закомментированы, static-иницлизация класса Cups никогда не выполнится. Также неважно, будет ли исполнена одна или обе строки(2) программы - static-инициализация все равно выполняется только один раз.<br/>";
		codeExample =
			"class Part {\n" +
			"\tPart(int number) {\n" +
			"\t\tSystem.out.println(\"Part (\" + number + \")\");\n" +
			"\t}\n" +
			"\tvoid fun(int number) {\n" +
			"\t\tSystem.out.println(\"fun ( \" + number + \" )\");\n" +
			"\t}\n" +
			"}\n" +
			"\n" +
			"class Car {\n" +
			"\tstatic Part engine;\n" +
			"\tstatic Part door;\n" +
			"\tstatic {\n" +
			"\t\tengine = new Part(1);\n" +
			"\t\tdoor = new Part(4);\n" +
			"\t}\n" +
			"\n" +
			"\tCar() {\n" +
			"\t\tSystem.out.println(\"Car()\");\n" +
			"\t}\n" +
			"}" +
			"...." +
			"public static void main(String[] args) {" +
			"\tSystem.out.println(\"Запустили программу\");\n" +
			"\t//Car.engine.fun(10);" +
			"}" +
			"\n\n" +
			"Что мы должны получить в ответе." +
			"В случае, если оставить все как есть, - в выводе получим только надпись \"Запустили программу\"." +
			"Если сотрем комментарий, то в выводе увидим следующее:" +
			"[stdout] Запустили программу\n" +
			"[stdout] Part (1)\n" +
			"[stdout] Part (4)\n" +
			"[stdout] fun ( 10 )" +
			"Из всего указанного сверху, делаем вывод - выполнение задачи мы добились, утверждение в абзаце закрепили.";
		printExampleText();
	}

	/*
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

		/*
		 * Здесь нужно написать цепочки вызовов функций
		 */
		System.out.println("Запустили программу");
		Car.engine.fun(10);

		stopOutResult();
		return endExeceuteExample();
	}
}
