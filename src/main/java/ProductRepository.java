public class ProductRepository {

    Product[] products = new Product[0];

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] findAll() {
        return products;
    }


    public Product[] findById(int findId) {
        Product[] result = new Product[0];
        for (Product product : findAll()) {
            if (product.getId() == findId) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(findAll(), 0, tmp, 0, result.length);
                int findIndex = 0;
                tmp[findIndex] = product;
                result = tmp;
                return result;
            }
        }
        return null;
    }

    public void removeById(int id) {
        if (findById(id) == null) {
            throw new NotFoundException("Element with id: " + id + " not found");
        } else {
            Product[] tmp = new Product[products.length - 1];
            int index = 0;
            for (Product item : products) {
                if (item.getId() != id) {
                    tmp[index] = item;
                    index++;
                }
            }
            products = tmp;
        }
    }
}