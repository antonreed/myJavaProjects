package school.lesson3;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        if (salary >= 0) this.salary = salary;
        else System.out.println("Ошибка! Человек не может работать в долг.");

        if (age >= 0) this.age = age;
        else System.out.println("Ошибка! Возраст не может быть отрицательным числом.");
    }

    public String toString() {
        return "Сотрудник: " + fullName + "\n"
                + "Должность: " + position + "\n"
                + "E-mail: " + email + "\n"
                + "Номер телефона: " + phoneNumber + "\n"
                + "Зарплата: " + salary + "\n"
                + "Возраст: " + age + "\n";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 0) this.salary = salary;
        else System.out.println("Ошибка! Человек не может работать в долг.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) this.age = age;
        else System.out.println("Ошибка! Возраст не может быть отрицательным числом.");
    }
}