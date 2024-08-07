
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        System.out.println(checkSumInRange(5, 6));

        printPositiveOrNegative(10);
        System.out.println(isNegative(5));

        printStringMultipleTimes("Hello", 3);

        System.out.println(isLeapYear(2020));

        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(array1);

        int[] array2 = new int[100];
        fillArray(array2);

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 11};
        multiplyLessThanSix(array3);

        int n = 5;
        int[][] squareArray = new int[n][n];
        fillDiagonalWithOnes(squareArray);
    }

    public static void printThreeWords() {
        System.out.println("Задание 1");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    public static void checkSumSign() {
        System.out.println("Задание 2");
        int a = 3;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");

        }
        System.out.println();
    }

    public static void printColor() {
        System.out.println("Задание 3");
        int value = 75;
        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
        System.out.println();
    }

    public static void compareNumbers() {
        System.out.println("Задание 4");
        int a = 8;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println();
    }

    public static boolean checkSumInRange(int a, int b) {
        System.out.println("Задание 5");
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


    public static void printPositiveOrNegative(int number) {
        System.out.println("Задание 6");
        if (number >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    public static boolean isNegative(int number) {
        System.out.println("Задание 7");
        return number < 0;
    }

    public static void printStringMultipleTimes(String str, int times) {
        System.out.println("Задание 8");
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        System.out.println("Задание 9");
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void invertArray(int[] array) {
        System.out.println("Задание 10");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 1 ? 0 : 1;
        }
    }

    public static void fillArray(int[] array) {
        System.out.println("Задание 11");
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void multiplyLessThanSix(int[] array) {
        System.out.println("Задание 12");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void fillDiagonalWithOnes(int[][] array) {
        System.out.println("Задание 13");
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
    }

    public static int[] generateArray(int len, int initialValue) {
        System.out.println("Задание 14");
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        return result;
    }
}

