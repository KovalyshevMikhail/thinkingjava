package com.nebiroz.thinkingjava.lessons.chapter05;

/**
 * Created by Frost on 12.12.2016.
 */
import com.nebiroz.thinkingjava.lessons.BaseExample;

class TestStaticUse {
	static String initHere = "Инициализируем здесь";
	static String initThere;
	static {
		initThere = "Инициализируем в блоке";
	}

	public static void outStatics() {
		System.out.println("outStatics ( )");
		System.out.println("initHere = \"" + initHere + "\"");
		System.out.println("initThere = \"" + initThere + "\"");
	}
}

public class Exercise14 extends BaseExample{
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */
	public Exercise14(){
		header = "Упражнение 14";
		description = "Создайте класс с полем static String, инициализируемым в точке определения, и другим полем, инициализируемым в блоке static.<br/>" +
				"Добавьте статический метод, который выводит значения полей и демонстрирует, что оба поля инициализируются перед использованием.<br/>";
		codeExample =
				"class TestStaticUse {\n" +
				"\tstatic String initHere = \"Инициализируем здесь\";\n" +
				"\tstatic String initThere;\n" +
				"\tstatic {\n" +
				"\t\tinitThere = \"Инициализируем в блоке\";\n" +
				"\t}\n" +
				"\n" +
				"\tpublic static void outStatics() {\n" +
				"\t\tSystem.out.println(\"outStatics ( )\");\n" +
				"\t\tSystem.out.println(\"initHere = \\\"\" + initHere + \"\\\"\");\n" +
				"\t\tSystem.out.println(\"initThere = \\\"\" + initThere + \"\\\"\");\n" +
				"\t}\n" +
				"}" +
				"...." +
				"public static void main(String[] args) {" +
				"System.out.println(\"Стартуем программу\");\n" +
				"\t\tTestStaticUse.outStatics();" +
				"}" +
				"\n\n" +
				"Что мы должны получить в ответе." +
				"В выводе должны получить следующее:" +
				"[stdout] Стартуем программу\n" +
				"[stdout] outStatics ( )\n" +
				"[stdout] initHere = \"Инициализируем здесь\"\n" +
				"[stdout] initThere = \"Инициализируем в блоке\"" +
				"Такой вывод должен доказывать то, что статические поля инициализируются в случае обращения к ним." +
				"Значит мы достигли цели!";
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
		System.out.println("Стартуем программу");
		TestStaticUse.outStatics();

		stopOutResult();
		return endExeceuteExample();
	}
}
