package com.nebiroz.thinkingjava.lessons.chapter05;

/**
 * Created by Frost on 07.11.2015.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise05 extends BaseExample{
    static int result = 0;

    /**
     * Описательная части примера.
     * Здесь нужно заполнить поля для вывода описания примера.
     * header - заголовок программы. Здесь указывается просто номер и тип задачи
     * description - описание задачи, которую нужно выполнить
     * codeExample - полученный в хоже решения исходный код
     */
    public Exercise05(){
        header = "Exercise 05";
        description = "Создайте класс Dog (собака) с перегруженным методом bark() (лай).<br/>"
                + "Метод должен быть перегружен для разных примитивных типов данных с целью вывода сообщения о лае, завывании, поскуливании и т.п. в зависимости от версии перегруженного метода.<br/>"
                + "Напишите метод main(), вызывающий все версии.";
        codeExample = " class Dog {\n"
                + "     public Dog() { }\n"
                + "     public Dog(String lai){\n"
                + "         printOutLn(\"ГАВ-ГАВ-ГАВ!\");\n"
                + "     }\n"
                + "     public Dog(int sku){\n"
                + "         printOutLn(\"Поскуливает!\");\n"
                + "     }\n"
                + "     public Dog(float zav){\n"
                + "         printOutLn(\"Завывает!\");\n"
                + "     }\n"
                + "     public Dog(boolean vizg){\n"
                + "         printOutLn(\"Вихжит!\");\n"
                + "     }\n"
                + "     public Dog(double kashlit){\n"
                + "         printOutLn(\"Покашливает!\");\n"
                + "     }\n"
                + " }\n"
                + "...\n"
                + "Dog dog1 = new Dog(\"Лаять!\");\n"
                + "Dog dog2 = new Dog(1);\n"
                + "Dog dog3 = new Dog(0.1f);\n"
                + "Dog dog4 = new Dog(true);\n"
                + "Dog dog5 = new Dog(0.2d);\n"
                + "\n"
                + "Вывод строк по ходу программы:\n"
                + " ГАВ-ГАВ-ГАВ!\n"
                + " Поскуливает!\n"
                + " Завывает!\n"
                + " Вихжит!\n"
                + " Покашливает!";
        printExampleText();
    }

    /**
     * Исходный код для примера.
     * Нужно написать примерочный код класса.
     */
    class Dog{
        public Dog() {}
        public Dog(String lai){
            printOutLn("ГАВ-ГАВ-ГАВ!");
        }
        public Dog(int sku){
            printOutLn("Поскуливает!");
        }
        public Dog(float zav){
            printOutLn("Завывает!");
        }
        public Dog(boolean vizg){
            printOutLn("Вихжит!");
        }
        public Dog(double kashlit){
            printOutLn("Покашливает!");
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
        Dog dog1 = new Dog("Лаять!");
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0.1f);
        Dog dog4 = new Dog(true);
        Dog dog5 = new Dog(0.2d);


        stopOutResult();
        return endExeceuteExample();
    }
}
