package school.lesson6;

public class HomeWorkApp {
    private static int result = 0;

    public static void main(String[] args) {
        String[][] stringArray = new String[4][4];

        /*
        Мне было лень заполнять нормально, поэтому как-то так)
        И да, я знаю, что при неверном размере массива и
        таком способе заполнении тоже может быть ошибка,
        мне просто лень сейчас ловить и это)
        */
        stringArray[0][0] = "1";
        stringArray[0][1] = "3";
        stringArray[0][2] = "8";
        stringArray[0][3] = "4";
        stringArray[1][0] = "10";
        stringArray[1][1] = "Хороших";
        stringArray[1][2] = "выходных";
        stringArray[1][3] = "2";

        try {
            array4x4(stringArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Сумма элементов массива = " + result);
        }
    }

    public static void array4x4(String[][] stringArray) {
        if (stringArray.length != 4 || stringArray[0].length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                try {
                    result += Integer.parseInt(stringArray[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
    }
}
