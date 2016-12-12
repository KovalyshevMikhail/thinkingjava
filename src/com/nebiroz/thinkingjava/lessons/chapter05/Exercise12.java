package com.nebiroz.thinkingjava.lessons.chapter05;

/**
 * Created by Frost on 07.11.2015.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise12 extends BaseExample{
    static int result = 0;

    /**
     * Описательная части примера.
     * Здесь нужно заполнить поля для вывода описания примера.
     * header - заголовок программы. Здесь указывается просто номер и тип задачи
     * description - описание задачи, которую нужно выполнить
     * codeExample - полученный в хоже решения исходный код
     */
    public Exercise12(){
        header = "Exercise 12";
        description = "Включите в класс с именем Tank (емкость), который можно наполнить и опустошить.<br/>"
                + "Условие \"готовности\" требует, чтобы он был пуст перед очисткой. Напишите метод finalize(), проверяющий это условие.<br/>"
                + "В методе main() протестируйте возможные случаи использования вашего класса.<br/>";
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
    class Tank{
        private boolean isReady = false;
        public Tank() { }
        public Tank(boolean ready){
            isReady = ready;
            printOutLn("Создан танк - " + this.toString());
        }

        public void rightClean(){
            isReady = false;
        }
        public void finalize(){
            if (isReady){
                printOutLn("Ошибка! Готовность должна быть false" + this.toString());
                System.out.println("Ошибка! Готовность должна быть false" + this.toString());
            }
            else{
                printOutLn("Удаление прошло успешно!" + this.toString());
                System.out.println("Удаление прошло успешно!" + this.toString());
            }
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
        printOutLn("Создаем правильный танк");
        Tank tnk = new Tank(true);
        tnk.rightClean();

        printOutLn("Теряем ссылку");
        new Tank(true);

        printOutLn("Очищаем ресурсы");
        System.gc();

        printOutLn("Смотрим результат");

        printOutLn("В связи с тем, что очистка от мусора срабатывает (почему-то) после закрытия приложения, то вывод в стандартный поток должен быть следующий:");
        printOutLn("[stdout] (Finalizer) Ошибка! Готовность должна быть falsecom.nebiroz.thinkingjava.lessons.chapter05.Exercise12$Tank@20d35a66");
        printOutLn("[stdout] (Finalizer) Удаление прошло успешно!com.nebiroz.thinkingjava.lessons.chapter05.Exercise12$Tank@37e6770b");

        stopOutResult();
        return endExeceuteExample();
    }
}
