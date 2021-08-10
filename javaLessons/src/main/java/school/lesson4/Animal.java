package school.lesson4;

public class Animal {
    private String name;
    protected static int count = 0;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + "м");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + "м");
    }
}