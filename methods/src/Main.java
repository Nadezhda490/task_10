public class Main {

    //    1)public static int add(int a, int b);
//    Условие: Вернуть сумму двух чисел a и b.
    public static int add(int a, int b) {
        return a + b;
    }

    //    2)public static void printMessage(String message);
//    Условие: Вывести строку message в консоль.
    public static void printMessage(String message) {
        System.out.println(message);
    }

    //    3)public static int subtract(int a, int b);
//    Условие: Вернуть разность чисел a и b.
    public static int subtract(int a, int b) {
        return a - b;
    }

    //    4)public static void greet();
//    Условие: Напечатать в консоли стандартное приветствие, например, "Hello, world!".
    public static void greet() {
        System.out.println("Стандартное приветствие: Hello, world!");
    }

//    5)public static int square(int number);
//    Условие: Вернуть квадрат числа number.

    //    public static int square(int number) {
//        return number * number;
//    }
    public static int square(int number, int stepen) {
        int result = number;
        for (int i = 1; i < stepen; i++) {
            result = result * number;
        }
        return result;
    }

//    6)public static int kub(int number);
//    Условие: Вернуть kub числа number.

    //    public static int kub(int number) {
//        return number * number * number;
//    }
    public static int kub(int number, int stepen) {
        int result = number;
        for (int i = 1; i < stepen; i++) {
            result = result * number;
        }
        return result;
    }

    //    7)public static boolean isEven(int number);
//    Условие: Вернуть true, если число number чётное, иначе false.
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    //    8)public static boolean isNeqativ(int number);
//    Условие: Вернуть true, если число number отрицательное иначе false.
    public static boolean isNeqativ(int number) {
        return number < 0;
    }

    //    9)public static void printNumber(int number);
//    Условие: Вывести число number в консоль.
    public static void printNumber(int number) {
        System.out.println("Вывести число: " + number);
    }

    //    10)public static boolean areEqual(int a, int b);
//    Условие: Вернуть true, если числа a и b равны, иначе false.
    public static boolean areEqual(int a, int b) {
        return a == b;
    }

    //    11)public static int multiply(int a, int b);
//    Условие: Вернуть произведение чисел a и b.
    public static int multiply(int a, int b) {
        return a * b;
    }



    public static void main(String[] args) {
        //1
        System.out.println("Сумма: " + add(5,4));
        //2
        printMessage("Добро пожаловать!");
        //3
        System.out.println("Разность: " + subtract(10,3));
        //4
        greet();
        //5
//        System.out.println("Квадрат числа: " + square(5));
        System.out.println("Квадрат числа: " + square(5, 2));
        //6
//        System.out.println("Куб: " + kub(5));
        System.out.println("Куб: " + kub(5, 3));
        //7
        System.out.println("Проверка чётности: " + isEven(7));
        //8
        System.out.println("Проверка отрицательности: " + isNeqativ(6));
        //9
        printNumber(5);
        //10
        System.out.println("Проверка равности: " + areEqual(4,7));
        //11
        System.out.println("Произведение: " + multiply(6,3));

    }
}