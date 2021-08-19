package school.lesson7;

import java.util.ArrayList;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(ArrayList<int[]> arrayList) {
        data = new int[arrayList.size()][];
        arrayList.toArray(data);
    }

    public void addToData(int[] array) {
        try {
            ArrayList<int[]> arrayList = new ArrayList<>(Arrays.asList(data));
            arrayList.add(array);
            setData(arrayList);
        } catch (NullPointerException e) {
            System.out.println("Не удалось добавить данные.");
        }
    }

    public void removeFromData(int index) {
        try {
            ArrayList<int[]> arrayList = new ArrayList<>(Arrays.asList(data));
            arrayList.remove(index);
            setData(arrayList);
        } catch (NullPointerException e) {
            System.out.println("В ArrayList ничего нет.");
        }
    }

    public void info() throws NullPointerException {

        for (String item : header) {
            System.out.printf("%-10s", item);
        }

        System.out.println();

        for (int[] array : data) {
            for (int item : array) {
                System.out.printf("%-10d", item);
            }
            System.out.println();
        }
    }
}