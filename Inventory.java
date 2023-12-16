//Inventory.java
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static void main(String[] args) {
        List<Item> inventory = new ArrayList<>();
        inventory.add(new Item("Laptop", 999.99, 10));
        inventory.add(new Item("Phone", 699.99, 20));
        inventory.add(new Item("Headphones", 149.99, 30));

        double totalValue = 0;

        System.out.printf("%-20s%-20s%-20s%-20s\n", "Item Name", "Item Price", "Item Quantity", "Item Value");

        for (Item item : inventory) {
            double value = item.getValue();
            totalValue += value;
            System.out.printf("%-20s%-20.2f%-20d%-20.2f\n", item.getName(), item.getPrice(), item.getQuantity(), value);
        }

        System.out.printf("\nTotal Inventory Value: $%.2f\n", totalValue);
    }
}
//Item.java
class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getValue() {
        return quantity * price;
    }
}

