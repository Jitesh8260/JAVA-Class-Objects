/*Create a class named Item that holds data about an item in a retail store.
 The class should have the following three fields:
1. name: the name field is a String object that holds the name of the item.
2. price: the price field is a double variable that holds the item's retail price
3. quantity: the quantity field is an int variable that holds the number of units
currently in inventory
 Write a public constructor method that accepts three arguments, name, price, &
quantity and stores the values of the arguments passed into it in the object's instance
fields.
 Write four public methods to retrieve the values from the three fields and their
current inventory value
1. String getName( ) returns the item name
2. double getPrice( ) returns the price of the item
3. intgetQuantity( ) returns the number of quantities
4. double getValue( ) that returns the current inventory value (quantity * price)
 Write a separate class called Inventory with a main method that creates three Item
objects and then produces a neatly formatted table of the store's inventory displaying
the three items, their current inventory value, and the total inventory value for the
store. 
 Duplicate the  format of the output exactly shown below. Test your output with
different items in inventory. */
    
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static void main(String[] args) {
        List<Item> inventory = new ArrayList<>();
        inventory.add(new Item("La ptop", 999.99, 10));
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

