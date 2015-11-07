package com.nebiroz.thinkingjava.lessons.chapter05;

/**
 * Created by Frost on 07.11.2015.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise03 extends BaseExample{
    static int result = 0;

    public Exercise03(){
        header = "Exercise 03";
        description = "Создать класс с конструктором по-умолчанию (без параметров), который выводит на экран сообщение.<br/>"
                + "Создать объект этого класса";
        codeExample = "class Test {\n"
                + "	public Test() {\n"
                + "     System.out.println(\"This is constructor of Test class!\");\n"
                + "	}\n"
                + "}\n"
                + "...\n"
                + "Test notAlloc = new Test();\n"
                + "\n"
                + "Вывод строки должен вывести значение - \"This is constructor of Test class!\"\n";
        printExampleText();
    }

    class Test{
        public Test(){
            printOutLn("This is constructor of Test class!");
        }
    }

    @Override
    public String runExample() {
        startOutResult();

        Test notAlloc = new Test();

        stopOutResult();
        return endExeceuteExample();
    }
}
