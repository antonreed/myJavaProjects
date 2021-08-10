package school.lesson4;

public class Payment {
    private static int id = 0;
    private final String creditCard;
    private final String creditCardNumber;
    private Product product;
    private double totalPrice = 0;
    private final Product[] products = new Product[10];

    public Payment(String creditCard, String creditCardNumber) {
        id++;
        this.creditCard = creditCard;
        this.creditCardNumber = creditCardNumber;
    }

    private class Product {
        private String name;
        private double price;
        private int amount;
        private static int index = 0;

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public void addToCart() {
            products[index] = product;
            index++;
            totalPrice += price * amount;
        }
    }

    public void generatePayment(String name, int amount, double price) {
        product = new Product();
        product.setName(name);
        product.setAmount(amount);
        product.setPrice(price);
        product.addToCart();
    }

    public void info() {
        System.out.println("Оплата будет совершена картой " + creditCard + " " + creditCardNumber);
        System.out.println("Список покупок: ");
        for (Product product : products) {
            if (product != null) {
                System.out.println("\t" + product.name + " в количестве "
                        + product.amount + " ед. по цене "
                        + product.price + "р. за шт.");
            }
        }
        System.out.printf("%s%.2f%s", "К оплате: ", totalPrice, "р.\n");
    }
}
