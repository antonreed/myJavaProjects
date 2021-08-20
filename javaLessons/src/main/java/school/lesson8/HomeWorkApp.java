package school.lesson8;

import java.util.*;

public class HomeWorkApp {
    public static void main(String[] args) {

        //Задание 1
        String[] words = new String[]{
                "Алжир",
                "Белиз",
                "Бельгия",
                "Италия",
                "Монголия",
                "Италия",
                "Сербия",
                "Танзания",
                "Швейцария",
                "Сербия",
                "Австрия",
                "Алжир",
                "Италия",
                "Австрия",
                "Эквадор",
        };

        Map<String, Integer> countedWords = new HashMap<>();

        for (String word : words) {
            if (countedWords.containsKey(word)) {
                countedWords.put(word, countedWords.get(word) + 1);
            } else {
                countedWords.put(word, 1);
            }
        }

        System.out.println("Уникальные слова: ");
        for (Map.Entry<String, Integer> entry : countedWords.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("Количество каждого слова в массиве: ");
        System.out.println(countedWords);
        System.out.println();

        //Задание 2
        Phonebook phonebook = new Phonebook();

        phonebook.add("Петров", 5358720);
        phonebook.add("Иванов", 6218755);
        phonebook.add("Сидоров", 3900506);
        phonebook.add("Петров", 7471342);
        phonebook.add("Петров", 202166);
        phonebook.add("Иванов", 75738321);

        phonebook.get("Петров");
        phonebook.get("Иванов");
        phonebook.get("Сидоров");
        phonebook.get("Козлов");
    }
}
