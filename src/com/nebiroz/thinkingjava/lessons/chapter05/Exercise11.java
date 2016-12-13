package com.nebiroz.thinkingjava.lessons.chapter05;

/**
 * Created by Frost on 07.11.2015.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise11 extends BaseExample{
    static int result = 0;

    /**
     * Описательная части примера.
     * Здесь нужно заполнить поля для вывода описания примера.
     * header - заголовок программы. Здесь указывается просто номер и тип задачи
     * description - описание задачи, которую нужно выполнить
     * codeExample - полученный в хоже решения исходный код
     */
    public Exercise11(){
        header = "Упражнение 11";
        description = "Измените предыдущее упражнение так, чтобы метод finalize() обязательно был исполнен.<br/>";
        codeExample = " class TestClass{\n"
                + "     public void finalize(){\n"
                + "         System.out.println(\"Сработал метод finalize()\");\n"
                + "     }\n"
                + " }\n"
                + "...\n"
                + "TestClass tst = new TestClass();\n"
                + "tst = null;\n"
                + "System.gc();\n"
                + "printOutLn(\"Надпись, что сработал метод, не появилась. Значит ресурс не очищается под действием JVM.\");\n"
                + "\n"
                + "Вывод строк по ходу программы:\n"
                + " INFO  [stdout] (Finalizer) Сработал метод finalize()\n"
                + " Надпись, что сработал метод, не появилась. Значит ресурс не очищается под действием JVM.\n"
                + " Это означает, что при ручной очистке ресурсов происходит удаление не активных ресурсов когда нужно нам.\n";
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
        tst = null;
        System.gc();
        printOutLn("Надпись, что сработал метод, появилась. Значит ресурс не очищается под действием JVM.");

        stopOutResult();
        return endExeceuteExample();
    }
}
