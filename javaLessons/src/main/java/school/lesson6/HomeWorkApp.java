package school.lesson6;

public class HomeWorkApp {
    private static int result = 0;

    public static void main(String[] args) {
        String[][] stringArray = new String[4][4];
        try {
            stringArray[0][0] = "1";
            stringArray[0][1] = "3";
            stringArray[0][2] = "8";
            stringArray[0][3] = "4";
            stringArray[1][0] = "10";
            stringArray[1][1] = "Хороших";
            stringArray[1][2] = "выходных";
            stringArray[1][3] = "2";
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Заполните массив согласно его размеру.");
            return;
        }

        try {
            array4x4(stringArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Сумма элементов массива = " + result);
        }
    }

    public static void array4x4(String[][] stringArray) throws MyArrayDataException {
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
