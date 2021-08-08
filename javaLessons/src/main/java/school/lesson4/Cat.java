package school.lesson4;

public class Cat extends Animal {
    private static int count = 0;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name) {
        super(name);
        Animal.count++;
        count++;
    }

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
    }

    public static int getCount() {
        return count;
    }

    public int getAppetite() {
        return appetite;
    }

    public int setAppetite(int appetite) {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 200) {
            super.run(distance);
        } else
            System.out.println("Кот " + getName() + " не сможет столько пробежать!");
    }

    @Override
    public void swim(int distance) {
        if (distance <= 0)
            System.out.println("Кот " + getName() + " не умеет плавать! Да и ни кто не сможет преодолеть " +
                    "данную дистанцию, т.к. она задана НЕПРАВИЛЬНО!");
    }

    public void eat(Plate plate) {
        if (plate.getFood() == 0) {
            return;
        }
        plate.decreaseFood(appetite);
        if (plate.isManagedToEat()) {
            satiety = true;
        } else {
            System.out.println("Кот " + getName() + " всё доел, но ему этого было мало.");
        }
    }
}