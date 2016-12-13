package com.nebiroz.thinkingjava.lessons.chapter05;

import com.nebiroz.thinkingjava.lessons.*;

public class Exercise01 extends BaseExample {
	static int result = 0;

	/**
	 * Описательная части примера.
	 * Здесь нужно заполнить поля для вывода описания примера.
	 * header - заголовок программы. Здесь указывается просто номер и тип задачи
	 * description - описание задачи, которую нужно выполнить
	 * codeExample - полученный в хоже решения исходный код
	 */

	public Exercise01(){
		header = "Упражнение 01";
		description = "Создать класс с неинициализированной ссылкой на String.<br/>"
				+ "Показать, что Java инициализирует ссылку значением Null";
		codeExample = "class NotAllocatedString{\n"
				+ "	String myString;\n"
				+ "\n"
				+ "	public NotAllocatedString(){\n"
				+ "	}\n"
				+ "}\n"
				+ "\n"
				+ "Вывод строки должен вывести значение - null;\n";
		printExampleText();
	}

	/**
	 * Исходный код для примера.
	 * Нужно написать примерочный код класса.
	 */

	class NotAllocatedString{
		public String myString;
		
		public NotAllocatedString(){
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
		
		NotAllocatedString notAlloc = new NotAllocatedString();
		printOutResultLn(notAlloc.myString);
		
		stopOutResult();
		return endExeceuteExample();
	}
}
