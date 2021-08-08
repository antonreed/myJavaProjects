package school.lesson4;

public class HomeWorkApp {
    public static void main(String[] args) {


        Cat catGarfild = new Cat("Гарфилд");
        Cat catMatroskin = new Cat("Матроскин");
        Cat catMurzik = new Cat("Мурзик");

        Dog dogHachiko = new Dog("Хатико");
        Dog dogMuhtar = new Dog("Мухтар");

        catGarfild.run(199);
        catMatroskin.run(185);
        catMurzik.run(220);
        dogHachiko.run(501);
        dogMuhtar.run(345);

        System.out.println();

        catGarfild.swim(1);
        catMatroskin.swim(3);
        catMurzik.swim(0);
        dogHachiko.swim(7);
        dogMuhtar.swim(11);

        /*
        В задании не сказано, что нужен вывод подсчёта в консоль, но я осмелился это сделать.
        Надеюсь это не будет ошибкой.
        */
        System.out.println("Всего животных: " + Animal.getCount());
        System.out.println("Всего котов: " + Cat.getCount());
        System.out.println("Всего собак: " + Dog.getCount());
        System.out.println();

        Cat catGrigoriy = new Cat("Григорий", 12);
        Plate plate = new Plate(15);

        catGrigoriy.eat(plate);
        plate.info();
        System.out.println();

        Cat[] catArray = new Cat[5];
        Plate bigPlate = new Plate(30);

        catArray[0] = new Cat("Пашка", 14);
        catArray[1] = new Cat("Сашка", 3);
        catArray[2] = new Cat("Кузя", 6);
        catArray[3] = new Cat("Васька", 13);
        catArray[4] = new Cat("Топа", 12);

        for (Cat cat : catArray) {
            cat.eat(bigPlate);
            System.out.println(cat.isSatiety() ?
                    "Кот " + cat.getName() + " сыт" :
                    "Кот " + cat.getName() + " остался голодным");
        }

        System.out.println();

        //Задание 6
        Payment payment = new Payment("Visa", "4638 2718 6647 0974");
        payment.generatePayment("Молоко", 1, 1.90);
        payment.generatePayment("Хлеб", 1, 1.15);
        payment.generatePayment("Coca-Cola", 2, 3.21);
        payment.generatePayment("Сигареты", 1, 2.85);

        Payment payment1 = new Payment("MasterCard", "4638 1387 5551 6988");

        payment1.generatePayment("Молоко", 2, 1.90);
        payment1.generatePayment("Хлеб", 2, 1.15);
        payment1.generatePayment("Coca-Cola", 1, 3.21);
        payment1.generatePayment("Сигареты", 3, 2.85);

        System.out.println();

        //Задание 7
        Park cheluskincevPark = new Park("Парк Челюскинцев", "Минск");
        cheluskincevPark.attractionCreator("Летающая скамейка", "09:00-17:00", 8);
        cheluskincevPark.info();

        Park centralPark = new Park("Центральный парк", "Нью-Йорк");
        centralPark.attractionCreator("Русские горки", "10:00-20:00", 20);
        centralPark.attractionCreator("Огненная ловушка", "12:00-14:00", 14);
        centralPark.info();


        Rectangle rectangle = new Rectangle(4, 3, "синий", "красный");
        Circle circle = new Circle(3, "зелёный", "оранжевый");
        Triangle triangle = new Triangle(4, 5, 7, "белый", "чёрный");

        rectangle.info(rectangle);
        circle.info(circle);
        triangle.info(triangle);
    }
}