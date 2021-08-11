package school.lesson5.task2;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<T>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getBoxWeight() {
        if (fruits.size() == 0) {
            return 0;
        }
        return fruits.size() * fruits.get(0).getWeight();
    }

    public boolean compare(Box box) {
        return getBoxWeight() == box.getBoxWeight();
    }

    public void toAnotherBox(Box<T> box) {
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}