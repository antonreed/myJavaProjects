package school.lesson2;

import java.util.Scanner;

public class HomeWorkApp {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        // Задание 1
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        sum(a, b);

        // Задание 2
        int num = scanner.nextInt();
        isPositiveOrNegative(num);

        // Задание 3
        num = scanner.nextInt();
        isNegative(num);

        // Задание 4
        scanner.nextLine();       //Кушаем \n после предыдущего ввода scanner.nextInt()
        String str = scanner.nextLine();
        int counter = scanner.nextInt();
        printTextSeveralTimes(str, counter);

        // Задание 4*
        isLeapYear();

        // Задание 6
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] == 1 ? (array1[i] = 0) : (array1[i] = 1);
        }

        // Задание 7
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }

        // Задание 8
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }

        // Задание 9
        int[][] squareArray = new int[5][5];
        for (int i = 0; i < squareArray.length; i++) {
            squareArray[i][i] = 1;        //Заполняем главную диагональ
            squareArray[i][squareArray.length - 1 - i] = 1;       //Заполняем побочную диагональ
        }

        //Задание 10
        int len = 8;
        int initialValue = 7;
        arrayCreation(len, initialValue);

        // Задание 10*
        int[] array4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int minValue = array4[0];
        int maxValue = array4[0];
        for (int i = 1; i < array4.length; i++) {
            if (array4[i] < minValue) {
                minValue = array4[i];
            }
            if (array4[i] > maxValue) {
                maxValue = array4[i];
            }
        }

        //Задание 10**
        int[] array5 = new int[scanner.nextInt()];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = scanner.nextInt();
        }

        // Задание 11
        // Методичку не открывал, в чём, наверное, каюсь.

        // Задание 12
        // Пришлось открыть методичку, чтобы понять о какой вообще победе идёт речь.

        //P.S. Ох и получу же я за излишние комментарии...

        //Последнее задание ***
        int n = scanner.nextInt();

        if (n != 0) {       //При 0 ничего не делаем, чтобы не метод не вызывался впустую
            int[] movableArray = new int[scanner.nextInt()];
            for (int i = 0; i < movableArray.length; i++) {
                movableArray[i] = scanner.nextInt();
            }
            moveArrayElements(movableArray, n);
        }
    }

    // Метод к заданию 1
    public static boolean sum(int a, int b) {
        int sum = a + b;
        return 10 <= sum && sum <= 20;
    }

    // Метод к заданию 2
    public static void isPositiveOrNegative(int num) {
        System.out.println(num >= 0 ? "Число положительное" : "Число отрицательное");
    }

    // Метод к заданию 3
    public static boolean isNegative(int num) {
        return num < 0;
    }

    // Метод к заданию 4
    public static void printTextSeveralTimes(String str, int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println(str);
        }
    }

    // Метод к заданию 4*
    public static boolean isLeapYear() {
        int year = scanner.nextInt();
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    // Метод к заданию 10
    public static int[] arrayCreation(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    // Метод к заданию 10**
    public static boolean checkBalance(int[] array5) {
        int sum = 0;
        int sumOfLeftPart = 0;

        for (int elem : array5) {
            sum += elem;
        }

        for (int elem : array5) {
            sumOfLeftPart += elem;
            if (sumOfLeftPart == sum - sumOfLeftPart) {     // Сравниваем посчитанную сумму в левой части с оставшейся
                return true;
            }
        }
        return false;
    }

    // Метод к заданию 12 и заданию 12* (всё разом)
    // Закомментил, чтобы остальной код работал

//    public static boolean checkWin(char symb) {
//        int horizontalCounter = 0;      // 4 вспомогательных счётчика победных очков
//        int verticalCounter = 0;
//        int mainDiagCounter = 0;
//        int secondaryDiagCounter = 0;
//
//        for (int x = 0; x < SIZE; x++) {      //Проверяем горизонтали
//            for (int y = 0; y < SIZE; y++) {
//                if (map[x][y] == symb) {
//                    horizontalCounter++;
//                    if (horizontalCounter == DOTS_TO_WIN) {
//                        return true;
//                    }
//                } else {
//                    horizontalCounter = 0;
//                }
//            }
//        }
//
//        for (int y = 0; y < SIZE; y++) {      //Проверяем вертикали
//            for (int x = 0; x < SIZE; x++) {
//                if (map[x][y] == symb) {
//                    verticalCounter++;
//                    if (verticalCounter == DOTS_TO_WIN) {
//                        return true;
//                    }
//                } else {
//                    verticalCounter = 0;
//                }
//            }
//        }
//
//        for (int i = 0; i < SIZE; i++) {      //Проверяем главную диагональ
//            if (map[i][i] == symb) {
//                mainDiagCounter++;
//                if (mainDiagCounter == DOTS_TO_WIN) {
//                    return true;
//                }
//            } else {
//                mainDiagCounter = 0;
//            }
//        }
//
//        for (int i = 0; i < SIZE; i++) {      //Проверяем побочную диагональ
//            if (map[i][map.length - 1 - i] == symb) {
//                secondaryDiagCounter++;
//                if (secondaryDiagCounter == DOTS_TO_WIN) {
//                    return true;
//                }
//            } else {
//                secondaryDiagCounter = 0;
//            }
//        }
//        return false;
//    }

    //Метод к последнему заданию ***
    public static void moveArrayElements(int[] movableArray, int n) {
        int len = movableArray.length;
        int buffer = 0;

        if (n > 0) {        //Сдвигаем вправо

            int firstIndexOfRightSide = len - n;

            for (int i = firstIndexOfRightSide; i < len; i++, len--) {      //инверсируем правую часть
                buffer = movableArray[i];
                movableArray[i] = movableArray[len - 1];
                movableArray[len - 1] = buffer;
            }

            for (int i = 0; i < firstIndexOfRightSide; i++, firstIndexOfRightSide--) {      //инверсируем левую часть
                buffer = movableArray[i];
                movableArray[i] = movableArray[firstIndexOfRightSide - 1];
                movableArray[firstIndexOfRightSide - 1] = buffer;
            }
        } else if (n < 0) {     //Сдвигаем влево
            n = n * (-1);
            int lastIndexOfLeftSide = n - 1;

            for (int i = 0; i < lastIndexOfLeftSide; i++, lastIndexOfLeftSide--) {      //инверсируем левую часть
                buffer = movableArray[i];
                movableArray[i] = movableArray[lastIndexOfLeftSide];
                movableArray[lastIndexOfLeftSide] = buffer;
            }

            for (int i = n; i < len; i++, len--) {      //инверсируем правую часть
                buffer = movableArray[i];
                movableArray[i] = movableArray[len - 1];
                movableArray[len - 1] = buffer;
            }
        }

        len = movableArray.length;
        for (int i = 0; i < len - 1; i++, len--) {     //Инверсируем весь массив обратно и результат готов
            buffer = movableArray[i];
            movableArray[i] = movableArray[len - 1];
            movableArray[len - 1] = buffer;
        }

        for (int i = 0; i < movableArray.length; i++) {
            System.out.print(movableArray[i] + " ");
        }
    }
}