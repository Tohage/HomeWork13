import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    ProductManager manager = new ProductManager();

    Product one = new Book(1, "Snuff", "Palahniuk", 10);
    Product two = new Book(2, "Labyrinth", "MaxFry", 20);
    Product three = new Book(3, "Ubik", "PhilipDick", 30);

    Product four = new Smartphone(4, "GalaxyNote", "Samsung", 40);
    Product five = new Smartphone(5, "XZ1compact", "Sony", 50);
    Product six = new Smartphone(6, "P50", "Huawei", 60);

    @Test
    public void searchByTextInTitle (){

        manager.add(one);
        manager.add(two);
        manager.add(three);


        Product[] actual = manager.searchBy("Ub");
        Product[] expected = {three};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void searchByTextInTitle1 (){

        manager.add(one);
        manager.add(two);
        manager.add(three);


        Product[] actual = manager.searchBy("n");
        Product[] expected = {one, two};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addRepo() {

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);


        Product[] actual = manager.getAll();
        Product[] expected = {one, two, three,four};

        assertArrayEquals(expected, actual);

    }
}
