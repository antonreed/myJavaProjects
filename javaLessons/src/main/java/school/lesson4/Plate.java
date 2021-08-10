package school.lesson4;

public class Plate {
    private int food;
    private boolean managedToEat;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean isManagedToEat() {
        return managedToEat;
    }

    /*  Знаю, что не нужно было, но сделал так,
        чтобы последний везунчик доел остатки,
        хоть и не наестся.
    */
    public void decreaseFood(int amount) {
        if (food == 0) {
            System.out.println("В тарелке нет еды.");
            return;
        }
        if (food - amount < 0) {
            managedToEat = false;
            food = 0;
        } else {
            managedToEat = true;
            food -= amount;
        }
    }

    public void info() {
        System.out.println("Количество еды: " + food);
    }
}