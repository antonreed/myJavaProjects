package school.lesson8;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private final Map<Long, String> book;

    public Phonebook() {
        book = new HashMap<>();
    }

    public void add(String lastName, long phoneNumber) {
        book.put(phoneNumber, lastName);
    }

    public void get(String lastName) {
        if (!book.containsValue(lastName)) {
            System.out.println("Абонента с фамилией " + lastName + " не найдено.");
        } else {
            System.out.println("Номера телефонов абонента: " + lastName);
            for (Map.Entry<Long, String> entry : book.entrySet()) {
                if (entry.getValue().equals(lastName)) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }
}
