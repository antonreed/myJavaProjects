package school.lesson7;

import java.io.*;
import java.util.ArrayList;

public class HomeWorkApp {
    private static ArrayList<int[]> arrayList = new ArrayList<>();
    private static String file = "data.csv";
    private static final String SPLIT_BY = ";";

    public static void main(String[] args) {
        AppData appData = new AppData();

        load(appData);      //чтение
        appData.info();
        appData.setArray(2, new int[]{15, 20, 30});
        save(appData);      //сохранение
    }

    public static void load(AppData appData) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
            String[] header = reader.readLine().split(SPLIT_BY);
            String line;
            String[] stringArrayFromLine;
            int[] intArrayFromLine;

            int x = 0;      //просто счётчик
            while ((line = reader.readLine()) != null) {
                stringArrayFromLine = line.split(SPLIT_BY);
                intArrayFromLine = new int[stringArrayFromLine.length];
                for (int i = 0; i < intArrayFromLine.length; i++) {
                    try {
                        //пытаемся преобразовать String[] в int[]
                        intArrayFromLine[i] = Integer.parseInt(stringArrayFromLine[i]);
                    } catch (NumberFormatException e) {
                        if ("".equals(stringArrayFromLine[i])) {
                            System.out.println("Пустая ячейка [" + x + "][" + i + "] заменена на 0");
                        } else {
                            System.out.println("Некорректное значение в ячейке [" + x + "][" + i + "] заменено на 0");
                        }
                    }
                }
                arrayList.add(intArrayFromLine);
                x++;
            }

            int[][] data = new int[arrayList.size()][arrayList.size()];

            for (int i = 0; i < data.length; i++) {
                data[i] = arrayList.get(i);
            }

            appData.setHeader(header);
            appData.setData(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void save(AppData appData) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("saved.csv"));
            String[] header = appData.getHeader();
            int[][] data = appData.getData();

            for (int i = 0; i < header.length; i++) {
                if (i != header.length - 1) {
                    writer.write(header[i] + SPLIT_BY);
                } else {
                    writer.write(header[i] + "\n");
                }
            }

            for (int[] array : data) {
                for (int i = 0; i < array.length; i++) {
                    if (i != array.length - 1) {
                        writer.write(array[i] + SPLIT_BY);
                    } else {
                        writer.write(array[i] + "\n");
                    }
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}