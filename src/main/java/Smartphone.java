import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Smartphone extends Product {

    private String manufacturer;

    public Smartphone(int id, String title, String manufacturer, int price) {
        super(id, title, price);
        this.manufacturer = manufacturer;

    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        return manufacturer.contains(search);
    }
}