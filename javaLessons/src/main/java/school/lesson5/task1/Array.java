package school.lesson5.task1;

public class Array<T> {
    private T[] elements;

    public Array(T... elements) {
        this.elements = elements;
    }

    public void swapElements(int a, int b) {
        T buffer = elements[b];
        elements[b] = elements[a];
        elements[a] = buffer;

        for (T elem : elements) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
