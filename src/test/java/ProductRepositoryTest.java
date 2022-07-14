import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class ProductRepositoryTest {

    ProductRepository repo = new ProductRepository();


    Product one = new Book(1, "Snuff", "Palahniuk", 10);
    Product two = new Book(2, "Labyrinth", "MaxFry", 20);
    Product three = new Book(3, "Ubik", "PhilipDick", 30);

    Product four = new Smartphone(4, "galaxyNote", "Samsung", 40);
    Product five = new Smartphone(5, "XZ1compact", "Sony", 50);
    Product six = new Smartphone(6, "P50", "Huawei", 60);


    @Test
    public void addRepo() {

        repo.save(one);
        repo.save(two);
        repo.save(three);

        Product[] actual = repo.findAll();
        Product[] expected = {one, two, three};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getAllRepo() {

        repo.save(one);
        repo.save(two);
        repo.save(three);
        repo.save(four);

        Product[] actual = repo.findAll();
        Product[] expected = {one, two, three, four};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void removeByIdRepo() {

        repo.save(one);
        repo.save(two);
        repo.save(three);
        repo.save(four);

        repo.removeById(4);

        Product[] actual = repo.findAll();
        Product[] expected = {one, two, three};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void removeByIdRepoException() {

        repo.save(one);
        repo.save(two);
        repo.save(three);
        repo.save(four);

        assertThrows(NotFoundException.class, () -> {
            repo.removeById(-4);
        });
    }

    @Test
    public void removeById() {

        repo.save(one);
        repo.save(two);
        repo.save(three);
        repo.save(four);

        repo.removeById(4);

        assertThrows(NotFoundException.class, () -> {
            repo.removeById(4);
        });
    }
}
