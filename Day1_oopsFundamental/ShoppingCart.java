import java.util.*;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " - " + quantity + " x " + price + " = " + getTotalPrice());
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<CartItem> cart = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. Display Total\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Item Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Item Price: ");
                double price = sc.nextDouble();
                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();
                CartItem item = new CartItem(name, price, quantity);
                cart.add(item);
                System.out.println("Item added.");
            } else if (choice == 2) {
                System.out.print("Enter Item Name to Remove: ");
                String nameToRemove = sc.nextLine();
                boolean found = false;
                for (int i = 0; i < cart.size(); i++) {
                    if (cart.get(i).itemName.equalsIgnoreCase(nameToRemove)) {
                        cart.remove(i);
                        found = true;
                        System.out.println("Item removed.");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Item not found.");
                }
            } else if (choice == 3) {
                double total = 0;
                System.out.println("\nItems in Cart:");
                for (CartItem item : cart) {
                    item.displayItem();
                    total += item.getTotalPrice();
                }
                System.out.println("Total Cost: " + total);
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
