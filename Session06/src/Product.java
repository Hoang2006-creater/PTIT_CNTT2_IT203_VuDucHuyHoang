public class Product {
    // Thuộc tính private (đóng gói dữ liệu)
    private String productId;
    private String productName;
    private double price;

    // Constructor
    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
    }

    // Getter
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Giá không hợp lệ! Giá phải > 0");
        }
    }

    public void displayInfo() {
        System.out.println("Mã SP: " + productId);
        System.out.println("Tên SP: " + productName);
        System.out.println("Giá bán: " + price);
    }
}

class ProductDemo {
    public static void main(String[] args) {
        Product p = new Product("SP001", "Laptop", 15000000);

        p.displayInfo();

        p.setPrice(-5000);

        p.setPrice(12000000);

        p.displayInfo();

    }
}
