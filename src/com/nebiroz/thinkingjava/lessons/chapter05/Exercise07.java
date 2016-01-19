package com.nebiroz.thinkingjava.lessons.chapter05;

/**
 * Created by Frost on 07.11.2015.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise07 extends BaseExample{
    static int result = 0;

    /**
     * Описательная части примера.
     * Здесь нужно заполнить поля для вывода описания примера.
     * header - заголовок программы. Здесь указывается просто номер и тип задачи
     * description - описание задачи, которую нужно выполнить
     * codeExample - полученный в хоже решения исходный код
     */
    public Exercise07(){
        header = "Exercise 07";
        description = "Создайте класс без конструктора. Создайте объект этого класса в методе main(),<br/>"
                + "чтобы удостовериться, что конструктор по умолчанию синтезируется автоматически.<br/>";
        codeExample = " class TestClass{ }\n"
                + "...\n"
                + "TestClass tst = new TestClass();\n"
                + "System.out.println(tst.toString());\n"
                + "\n"
                + "Вывод строк по ходу программы:\n"
                + " com.nebiroz.thinkingjava.lessons.chapter05.Exercise07$TestClass@<b>Адрес в памяти</b>\n"
                + " <b>Адрес в памяти</b> будет говорить о том, что объект создан и располагается по указанному адресу в пространстве JVM.\n";
        printExampleText();
    }

    /**
     * Исходный код для примера.
     * Нужно написать примерочный код класса.
     */
    class TestClass{ }

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
        TestClass tst = new TestClass();
        printOutLn(tst.toString());

        stopOutResult();
        return endExeceuteExample();
    }
}
