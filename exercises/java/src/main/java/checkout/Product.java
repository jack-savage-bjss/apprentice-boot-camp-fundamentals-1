package checkout;

public class Product {
    private final String sku;
    private final Integer price;

    public Product(String sku, Integer price) {
        this.sku = sku;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public Integer getPrice() {
        return price;
    }
}
