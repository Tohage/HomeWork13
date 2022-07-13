import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();

        Product one = new Book(1, "Snuff", "Palahniuk", 10);
        Product two = new Book(2, "Labyrinth", "MaxFry", 20);
        Product three = new Book(3, "Ubik", "PhilipDick", 30);

        Product four = new Smartphone(4, "galaxyNote", "Samsung", 40);
        Product five = new Smartphone(5, "XZ1compact", "Sony", 50);
        Product six = new Smartphone(6, "P50", "Huawei", 60);

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);

        manager.searchBy("50");

    }
}
