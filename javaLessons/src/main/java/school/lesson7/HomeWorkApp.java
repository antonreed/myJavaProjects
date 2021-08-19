package school.lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp {
    private static final String FILE = "data.csv";
    private static final String SPLIT_BY = ";";


    /*
        Немного заморочился и расставил try-catch
        и возможность добавлять и сохранять данные,
        даже если загрузка из файла была неудачной.
        Можно было всё сделать и красивее, но как мне
        уже было сказано, всё приходит с опытом.
        И да, возможно я где-то затупил, где-то ошибся...
        Но у меня уже глаза болят и мозг болит)
     */
    public static void main(String[] args) {
        AppData appData = new AppData();
        try {
            load(appData);
        } catch (FileNotFoundException e) {
            System.out.println("Неудачная загрузка данных: файл для загрузки не найден.");
            System.out.println("Сформировать массив для добавления данных и последующего сохранения? Да/Нет?");

            Scanner sc = new Scanner(System.in);
            String answer;
            while (true) {
                System.out.println("Да/Нет?");
                answer = sc.next();
                if (answer.equalsIgnoreCase("да")) {
                    appData.setHeader(new String[0]);
                    appData.setData(new ArrayList<>());
                    break;
                }
                if (answer.equalsIgnoreCase("нет")) {
                    return;
                }
            }
        }

        appData.addToData(new int[]{351, 6567, 1142, 66362});
        save(appData);
        //изменяем данные, чтобы увидеть изменения. Данные сохраняются в тот же файл.
    }

    public static void load(AppData appData) throws FileNotFoundException {
        ArrayList<int[]> arrayList = new ArrayList();
        String[] header;
        BufferedReader reader = new BufferedReader(new FileReader(FILE));
        String line;
        try {
            header = reader.readLine().split(SPLIT_BY);
            String[] stringArrayFromLine;
            int[] intArrayFromLine;
            while ((line = reader.readLine()) != null) {
                stringArrayFromLine = line.split(SPLIT_BY);
                intArrayFromLine = new int[stringArrayFromLine.length];
                for (int i = 0; i < intArrayFromLine.length; i++) {
                    try {
                        intArrayFromLine[i] = Integer.parseInt(stringArrayFromLine[i]);
                    } catch (NumberFormatException e) {
                        if ("".equals(stringArrayFromLine[i])) {
                            System.out.println("Пустая ячейка заменена на 0");
                        } else {
                            System.out.println("Некорректное значение в ячейке заменено на 0");
                        }
                    }
                }
                arrayList.add(intArrayFromLine);
            }
            appData.setHeader(header);
            appData.setData(arrayList);
        } catch (IOException e) {
            System.out.println("В процессе загрузки данных произошла ошибка.");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Загрузка данных не требуется, т.к. файл пуст.");
            appData.setHeader(new String[0]);
            appData.setData(arrayList);
        }
    }

    public static void save(AppData appData) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE));
            String[] header = appData.getHeader();
            ArrayList<int[]> arrayList = new ArrayList<>(Arrays.asList(appData.getData()));

            for (int i = 0; i < header.length; i++) {
                if (i != header.length - 1) {
                    writer.write(header[i] + SPLIT_BY);
                } else {
                    writer.write(header[i] + "\n");
                }
            }

            for (int[] array : arrayList) {
                for (int i = 0; i < array.length; i++) {
                    if (i != array.length - 1) {
                        writer.write(array[i] + SPLIT_BY);
                    } else {
                        writer.write(array[i] + "\n");
                    }
                }
            }
            writer.close();
        } catch (IOException | NullPointerException e) {
            System.out.println("Сохранить данные не удалось.");
            e.printStackTrace();
        }
    }
}