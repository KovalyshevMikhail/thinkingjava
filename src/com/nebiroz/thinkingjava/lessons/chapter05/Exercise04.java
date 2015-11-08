package com.nebiroz.thinkingjava.lessons.chapter05;

/**
 * Created by Frost on 07.11.2015.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise04 extends BaseExample{
    static int result = 0;

    /**
     * Описательная части примера.
     * Здесь нужно заполнить поля для вывода описания примера.
     * header - заголовок программы. Здесь указывается просто номер и тип задачи
     * description - описание задачи, которую нужно выполнить
     * codeExample - полученный в хоже решения исходный код
     */

    public Exercise04(){
        header = "Exercise 04";
        description = "Добавьте к классу из упражнения 3 перегруженный конструктор, принимающий в качестве параметра строка (String)<br/>"
                + "и распечатывающий ее вместе с сообщением.";
        codeExample = "class Test {\n"
                + "	public Test() {\n"
                + "     System.out.println(\"This is constructor of Test class!\");\n"
                + "	}\n"
                + "}\n"
                + "	public Test(String str) {\n"
                + "     System.out.println(str);\n"
                + "     System.out.println(\"This is constructor of Test class!\");\n"
                + "	}\n"
                + "}\n"
                + "...\n"
                + "Test tst = new Test();\n"
                + "Test tst2 = new Test(\"My string.\");\n"
                + "\n"
                + "Вывод строки после первого Test() должно быть - \"This is constructor of Test class!\"\n"
                + "Вывод строки после второго Test(\"My string.\") должно быть - " +
                "<br/>Сначала \"My string.\", потом \"This is constructor of Test class!\".";
        printExampleText();
    }

    /**
     * Исходный код для примера.
     * Нужно написать примерочный код класса.
     */

    class Test{
        public Test(){
            printOutLn("This is constructor of Test class!");
        }
        public Test(String str){
            printOutLn(str);
            printOutLn("This is constructor of Test class!");
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

        Test tst = new Test();
        Test tst2 = new Test("My string.");

        stopOutResult();
        return endExeceuteExample();
    }
}
