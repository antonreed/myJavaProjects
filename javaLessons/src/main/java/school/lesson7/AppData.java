package school.lesson7;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {

    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void setArray(int index, int[] array) {
        try {
            data[index] = array;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void info() {
        for (String item : header) {
            System.out.printf("%-10s", item);
        }

        System.out.println();

        for (int[] array : data) {
            for (int item : array) {
                System.out.printf("%-10s", item);
            }
            System.out.println();
        }
        System.out.println();
    }
}