class Warehouse {
    int itemId;
    String itemName;

    // Constructor
    Warehouse(int id, String name) {
        itemId = id;
        itemName = name;
    }

    // Display method
    void display() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name: " + itemName);
    }
}
public class Main {
    public static void main(String[] args) {

        // Object creation using constructor
        Warehouse w1 = new Warehouse(101, "Laptop");
        Warehouse w2 = new Warehouse(102, "Phone");

        w1.display();
        w2.display();
    }
}