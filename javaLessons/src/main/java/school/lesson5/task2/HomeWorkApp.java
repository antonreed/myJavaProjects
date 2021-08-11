package school.lesson5.task2;

public class HomeWorkApp {
    public static void main(String[] args) {
        Box<Apple> boxWithApples = new Box<>();
        Box<Orange> boxWithOranges = new Box<>();
        Box<Apple> reserveBoxForApples = new Box<>();
        Box<Orange> reserveBoxForOranges = new Box<>();

        Apple apple = new Apple();
        Orange orange = new Orange();

        boxWithApples.addFruit(apple);
        boxWithApples.addFruit(apple);
        boxWithApples.addFruit(apple);

        boxWithOranges.addFruit(orange);
        boxWithOranges.addFruit(orange);

        System.out.println(boxWithApples.compare(boxWithOranges));
        boxWithApples.toAnotherBox(reserveBoxForApples);
        boxWithOranges.toAnotherBox(reserveBoxForOranges);
    }
}