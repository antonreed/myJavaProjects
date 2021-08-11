package school.lesson5.task1;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array<Integer> intArray = new Array<>(5, 6, 1, 8, 4);
        intArray.swapElements(2, 4);

        Array<String> stringArray = new Array<>("explode", "soon", "will", "head", "My");
        stringArray.swapElements(1, 4);
        stringArray.swapElements(0, 1);
        stringArray.swapElements(1, 3);
    }
}
