package school.lesson2;

public class TasksWithMethods extends HomeWorkApp {
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

        //Задание 10
        arrayCreation(8, 7);

        //Задание 10**
        int[] findBalance = new int[scanner.nextInt()];
        for (int i = 0; i < findBalance.length; i++) {
            findBalance[i] = scanner.nextInt();
        }
        checkBalance(findBalance);

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
}
