package com.nebiroz.thinkingjava.lessons.chapter05;

/**
 * Created by Frost on 07.11.2015.
 */

import com.nebiroz.thinkingjava.lessons.BaseExample;

public class Exercise06 extends BaseExample{
    static int result = 0;

    /**
     * Описательная части примера.
     * Здесь нужно заполнить поля для вывода описания примера.
     * header - заголовок программы. Здесь указывается просто номер и тип задачи
     * description - описание задачи, которую нужно выполнить
     * codeExample - полученный в хоже решения исходный код
     */
    public Exercise06(){
        header = "Exercise 05";
        description = "Измените предыдущее упражнение так, чтобы два перегруженных метода принимали два аргумента <br/>"
                + "(разных типов) и отличались только порядком их следования в списке аргументов.<br/>"
                + "Проверьте, работает ли это.";
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
                + "     public Dog(boolean nesilno, double kashlit){\n"
                + "         printOutLn(\"АРРКК АРРХКК!\");\n"
                + "     }\n"
                + "     public Dog(double kashlit, boolean silno){\n"
                + "         printOutLn(\"УУУАААААРКХ АААРРККХ\");\n"
                + "     }\n"
                + " }\n"
                + "...\n"
                + "Dog dog1 = new Dog(\"Лаять!\");\n"
                + "Dog dog2 = new Dog(1);\n"
                + "Dog dog3 = new Dog(0.1f);\n"
                + "Dog dog4 = new Dog(true);\n"
                + "Dog dog5 = new Dog(0.2d, true);\n"
                + "Dog dog6 = new Dog(true, 0.2d);\n"
                + "\n"
                + "Вывод строк по ходу программы:\n"
                + " ГАВ-ГАВ-ГАВ!\n"
                + " Поскуливает!\n"
                + " Завывает!\n"
                + " Вихжит!\n"
                + " УУУАААААРКХ АААРРККХ\n"
                + " АРРКК АРРХКК!";
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
        public Dog(boolean nesilno, double kashlit){
            printOutLn("АРРКК АРРХКК!");
        }
        public Dog(double kashlit, boolean silno){
            printOutLn("УУУАААААРКХ АААРРККХ");
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
        Dog dog5 = new Dog(0.2d, true);
        Dog dog6 = new Dog(true, 0.2d);


        stopOutResult();
        return endExeceuteExample();
    }
}
