package shopping;

/**
 * @author Vinod John
 * @Date 06.01.2024
 */
public class ShoppingCart {
    private Product[] products;
    private float totalPrice;
    private boolean isPaid;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
