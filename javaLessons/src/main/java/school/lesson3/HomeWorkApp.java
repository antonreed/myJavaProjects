package school.lesson3;

public class HomeWorkApp {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee(
                "Ivanov Ivan",
                "Engineer",
                "ivivan@mailbox.com",
                "892312312",
                30000,
                -13);
        employeesArray[1] = new Employee(
                "Bill Gates",
                "CEO",
                "team@gatesnotes.com",
                "981097281",
                450000,
                65);
        employeesArray[2] = new Employee(
                "Ilon Mask",
                "Main dreamer",
                "NAsales@teslamotors.com",
                "943040017",
                290000,
                50);
        employeesArray[3] = new Employee(
                "Geralt of Rivia",
                "Witcher",
                "geralt@rivia.com",
                "",
                1,
                57);
        employeesArray[4] = new Employee(
                "Hans Christian Andersen",
                "Writer",
                "little.prince@old-times.com",
                "",
                0,
                70);

        for (Employee elem : employeesArray) {
            if (elem.getAge() >= 40) {
                System.out.println(elem);
            }
        }
    }
}