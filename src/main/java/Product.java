import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    protected int id;
    protected String title;

    protected int price;

    public String getTitle() {

        return title;
    }

    public boolean matches(String search) {
        return title.contains(search);
    }
}
