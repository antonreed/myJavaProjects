package school.lesson4;

public class Park {
    private String name;
    private String city;
    private Attraction attraction;
    private Attraction[] attractions = new Attraction[5];

    public Park(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private int price;
        private static int index = 0;

        public void setName(String name) {
            this.name = name;
        }

        public void setWorkingHours(String workingHours) {
            this.workingHours = workingHours;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void createAttraction() {
            attractions[index] = attraction;
            index++;
        }
    }

    public void attractionCreator(String name, String workingHours, int price) {
        attraction = new Attraction();
        attraction.setName(name);
        attraction.setWorkingHours(workingHours);
        attraction.setPrice(price);
        attraction.createAttraction();
    }

    public void info() {
        System.out.println("Список аттракционов в: " + getName());
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                System.out.println("\t" + attraction.name
                        + "\tВремя работы: " + attraction.workingHours
                        + "\tСтоимость: " + attraction.price + "р.");
            }
        }
        System.out.println();
    }
}
