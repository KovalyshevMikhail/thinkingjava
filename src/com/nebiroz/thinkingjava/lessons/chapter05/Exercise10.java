package com.nebiroz.thinkingjava.lessons.chapter05;

/**
 * Created by Frost on 07.11.2015.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise10 extends BaseExample{
    static int result = 0;

    /**
     * Описательная части примера.
     * Здесь нужно заполнить поля для вывода описания примера.
     * header - заголовок программы. Здесь указывается просто номер и тип задачи
     * description - описание задачи, которую нужно выполнить
     * codeExample - полученный в хоже решения исходный код
     */
    public Exercise10(){
        header = "Exercise 10";
        description = "Создайте класс с методом finalize(), который выводит сообщение.<br/>"
                + "В методе main() создайте объект вашего класса. Объясните поведение программы.<br/>";
        codeExample = " class TestClass{\n"
                + "     public void finalize(){\n"
                + "         System.out.println(\"Сработал метод finalize()\");\n"
                + "     }\n"
                + " }\n"
                + "...\n"
                + "TestClass tst = new TestClass();\n"
                + "printOutLn(\"Надпись, что сработал метод, не появилась. Значит ресурс не очищается под действием JVM.\");\n"
                + "\n"
                + "Вывод строк по ходу программы:\n"
                + " Надпись, что сработал метод, не появилась. Значит ресурс не очищается под действием JVM.\n"
                + " INFO  [stdout] (Finalizer) Сработал метод finalize()\n"
                + " Это означает, что очистка ресурса происходит в нужное для JVM время и оно может не совпадать со временем окончания действия ресурса.\n";
        printExampleText();
    }

    /**
     * Исходный код для примера.
     * Нужно написать примерочный код класса.
     */
    class TestClass{
        public void finalize(){
            printOutLn("Сработал метод finalize()");
            System.out.println("Сработал метод finalize()");
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
        printOutLn("Надпись, что сработал метод, не появилась. Значит ресурс не очищается под действием JVM.");

        stopOutResult();
        return endExeceuteExample();
    }
}
