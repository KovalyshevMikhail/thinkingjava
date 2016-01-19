package com.nebiroz.thinkingjava.lessons.chapter05;

/**
 * Created by Frost on 07.11.2015.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise08 extends BaseExample{
    static int result = 0;

    /**
     * Описательная части примера.
     * Здесь нужно заполнить поля для вывода описания примера.
     * header - заголовок программы. Здесь указывается просто номер и тип задачи
     * description - описание задачи, которую нужно выполнить
     * codeExample - полученный в хоже решения исходный код
     */
    public Exercise08(){
        header = "Exercise 08";
        description = "Создайте класс с двумя методами. В первом методе дважды вызовите второй метод:<br/>"
                + "один раз без ключевого слова <b>this</b>,"
                + "а во второй с <b>this</b> - просто для того, чтобы убедиться в работоспособности этого синтаксиса;<br/>"
                + "не используйте этот способ вызова на практике.<br/>";
        codeExample = " class TestClass{\n"
                + "     public TestClass(){\n"
                + "         firstMethod();\n"
                + "     }\n"
                + "     public void firstMethod(){\n"
                + "         secondMethod();\n"
                + "         this.secondMethod();\n"
                + "     }\n"
                + "     public void secondMethod() {\n"
                + "         System.out.println(\"Вызов второго метода!\");\n"
                + "     }\n"
                + " }\n"
                + "...\n"
                + "TestClass tst = new TestClass();\n"
                + "\n"
                + "Вывод строк по ходу программы:\n"
                + " Вызов второго метода!\n"
                + " Вызов второго метода!\n";
        printExampleText();
    }

    /**
     * Исходный код для примера.
     * Нужно написать примерочный код класса.
     */
    class TestClass{
        public TestClass(){
            firstMethod();
        }

        public void firstMethod(){
            secondMethod();
            this.secondMethod();
        }

        public void secondMethod() {
            printOutLn("Вызов второго метода!");
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
        TestClass tst = new TestClass();

        stopOutResult();
        return endExeceuteExample();
    }
}
