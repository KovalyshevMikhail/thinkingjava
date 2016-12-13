package com.nebiroz.thinkingjava.lessons.chapter05;

/**
 * Created by Frost on 07.11.2015.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise09 extends BaseExample{
    static int result = 0;

    /**
     * Описательная части примера.
     * Здесь нужно заполнить поля для вывода описания примера.
     * header - заголовок программы. Здесь указывается просто номер и тип задачи
     * description - описание задачи, которую нужно выполнить
     * codeExample - полученный в хоже решения исходный код
     */
    public Exercise09(){
        header = "Упражнение 09";
        description = "Подготовьте класс с двумя (перегруженными) конструкторами.<br/>"
                + "Используя ключевое слово this, вызовите второй конструктор из первого.<br/>";
        codeExample = " class TestClass{\n"
                + "     private String type = \"red\";\n"
                + "     private int countApples = 0;\n"
                + "\n"
                + "     public TestClass(int apples){\n"
                + "         countApples = apples;\n"
                + "     }\n"
                + "     public TestClass(int apples, String type){\n"
                + "         this(apples);\n"
                + "         this.type = type;\n"
                + "     }\n"
                + "     public String toString(){\n"
                + "         return \"TestClass: Apples - \" + countApples + \", Type - \" + type;\n"
                + "     }\n"
                + " }\n"
                + "...\n"
                + "TestClass tst1 = new TestClass(5);\n"
                + "System.out.println(tst1.toString());\n"
                + "TestClass tst2 = new TestClass(3, \"green\");\n"
                + "System.out.println(tst2.toString());\n"
                + "\n"
                + "Вывод строк по ходу программы:\n"
                + " TestClass: Apples - 5, Type - red\n"
                + " TestClass: Apples - 3, Type - green\n";
        printExampleText();
    }

    /**
     * Исходный код для примера.
     * Нужно написать примерочный код класса.
     */
    class TestClass{
        private String type = "red";
        private int countApples = 0;

        public TestClass(int apples){
            countApples = apples;
        }

        public TestClass(int apples, String type){
            this(apples);
            this.type = type;
        }

        public String toString(){
            return "TestClass: Apples - " + countApples + ", Type - " + type;
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
        TestClass tst1 = new TestClass(5);
        printOutLn(tst1.toString());
        TestClass tst2 = new TestClass(3, "green");
        printOutLn(tst2.toString());

        stopOutResult();
        return endExeceuteExample();
    }
}
