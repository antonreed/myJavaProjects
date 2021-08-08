package school.lesson4;

public class Dog extends Animal {
    private static int count = 0;

    public Dog(String name) {
        super(name);
        Animal.count++;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 500) {
            super.run(distance);
        } else
            System.out.println("Пёс " + getName() + " не сможет столько пробежать!");
    }

    @Override
    public void swim(int distance) {
        if (distance > 0 && distance <= 10) {
            super.run(distance);
        } else
            System.out.println("Пёс " + getName() + " не сможет преодолеть данную дистанцию , " +
                    "т.к. она задана НЕПРАВИЛЬНО!");
    }
}