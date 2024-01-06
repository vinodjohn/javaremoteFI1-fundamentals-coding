package shopping;

/**
 * @author Vinod John
 * @Date 06.01.2024
 */
public class Product {
    private String name;
    private float price;  // price per unit

    // quantity

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
