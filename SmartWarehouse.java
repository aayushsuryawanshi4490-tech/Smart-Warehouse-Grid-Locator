// Step 1: GridItem Class
class GridItem {
    private String itemId;
    private String itemName;
    private int quantity;

    // Constructor
    public GridItem(String itemId, String itemName, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    // Getter for Item ID
    public String getItemId() {
        return itemId;
    }

    // Display item details
    public void display() {
        System.out.println("ID: " + itemId + ", Name: " + itemName + ", Quantity: " + quantity);
    }
}

// Step 2: Warehouse Class
class Warehouse {
    private GridItem[][] grid;

    // Constructor to define grid size
    public Warehouse(int rows, int cols) {
        grid = new GridItem[rows][cols];
    }

    // Step 3: Populate Grid
    public void addItem(int row, int col, GridItem item) {
        if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length) {
            grid[row][col] = item;
        } else {
            System.out.println("Invalid grid position!");
        }
    }

    // Step 4: Search Function
    public void searchItem(String itemId) {
        System.out.println("Searching for item ID: " + itemId);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != null && grid[i][j].getItemId().equals(itemId)) {
                    System.out.println("Item found at Row: " + i + ", Column: " + j);
                    grid[i][j].display();
                    return;
                }
            }
        }
        System.out.println("Item not found in warehouse");
    }

    // Step 6 (Optional): Display full grid
    public void displayGrid() {
        System.out.println("\nWarehouse Grid Layout:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != null) {
                    System.out.print("[" + grid[i][j].getItemId() + "] ");
                } else {
                    System.out.print("[Empty] ");
                }
            }
            System.out.println();
        }
    }
}

// Step 7: Testing in Main
public class SmartWarehouse {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(5, 5);

        // Populate grid
        warehouse.addItem(0, 0, new GridItem("I101", "Laptop", 10));
        warehouse.addItem(1, 2, new GridItem("I102", "Phone", 25));
        warehouse.addItem(3, 4, new GridItem("I103", "Tablet", 15));

        // Display full grid
        warehouse.displayGrid();

        // Search operations
        warehouse.searchItem("I102");  // Found
        warehouse.searchItem("I999");  // Not found
    }
}
