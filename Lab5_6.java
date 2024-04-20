import java.util.ArrayList;
import java.util.List;

// Product interface
interface Product {
    void showProduct();
    void addProduct(String productName, double price);
    void deleteProduct(String productName);
    double calculateProductPrice(String productName);
}

// OnlineProduct class implementing Product interface
class OnlineProduct implements Product {
    private List<String> products;
    private List<Double> prices;

    public OnlineProduct() {
        products = new ArrayList<>();
        prices = new ArrayList<>();
    }

    @Override
    public void showProduct() {
        System.out.println("Online Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i) + " - " + prices.get(i));
        }
    }

    @Override
    public void addProduct(String productName, double price) {
        products.add(productName);
        prices.add(price);
        System.out.println("Product added: " + productName);
    }

    @Override
    public void deleteProduct(String productName) {
        int index = products.indexOf(productName);
        if (index != -1) {
            products.remove(index);
            prices.remove(index);
            System.out.println("Product deleted: " + productName);
        } else {
            System.out.println("Product not found: " + productName);
        }
    }

    @Override
    public double calculateProductPrice(String productName) {
        int index = products.indexOf(productName);
        if (index != -1) {
            return prices.get(index);
        }
        return 0;
    }
}

// PhysicalProduct class implementing Product interface
class PhysicalProduct implements Product {
    private List<String> products;
    private List<Double> prices;

    public PhysicalProduct() {
        products = new ArrayList<>();
        prices = new ArrayList<>();
    }

    @Override
    public void showProduct() {
        System.out.println("Physical Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i) + " - " + prices.get(i));
        }
    }

    @Override
    public void addProduct(String productName, double price) {
        products.add(productName);
        prices.add(price);
        System.out.println("Product added: " + productName);
    }

    @Override
    public void deleteProduct(String productName) {
        int index = products.indexOf(productName);
        if (index != -1) {
            products.remove(index);
            prices.remove(index);
            System.out.println("Product deleted: " + productName);
        } else {
            System.out.println("Product not found: " + productName);
        }
    }

    @Override
    public double calculateProductPrice(String productName) {
        int index = products.indexOf(productName);
        if (index != -1) {
            return prices.get(index);
        }
        return 0;
    }
}

// Customer class
class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Order class
class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        products = new ArrayList<>();
    }

    public void addProductToOrder(Product product, String productName) {
        double price = product.calculateProductPrice(productName);
        if (price > 0) {
            products.add(product);
            System.out.println(productName + " added to order for " + customer.getName() + " - $" + price);
        } else {
            System.out.println("Product not found: " + productName);
        }
    }

    public void calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.calculateProductPrice("");
        }
        System.out.println("Total amount for " + customer.getName() + ": " + total);
    }
}

public class Lab5_6 {
    public static void main(String[] args) {
        // Create OnlineProduct
        Product onlineProduct = new OnlineProduct();
        onlineProduct.addProduct("Laptop", 800);
        onlineProduct.addProduct("Headphones", 50);
        onlineProduct.showProduct();

        Product physicalProduct = new PhysicalProduct();
        physicalProduct.addProduct("Book", 20);
        physicalProduct.addProduct("T-Shirt", 15);
        physicalProduct.showProduct();

        Customer customer = new Customer("Jai");

        // Create Order
        Order order = new Order(customer);
        order.addProductToOrder(onlineProduct, "Laptop");
        order.addProductToOrder(physicalProduct, "Book");
        order.calculateTotal();
    }
}
