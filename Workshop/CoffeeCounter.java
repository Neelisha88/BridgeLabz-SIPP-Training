package Workshop;
import java.util.*;
public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coffeeType;
        int quantity;
        double price = 0,total,gst,finalAmount;
        System.out.println("WELCOME TO THE COZY CUP CAFE!");
        while(true){
            System.out.println("Enter Coffe Type (espresso/latte/cappuccino) or exit to stop : ");
            coffeeType = sc.nextLine().toUpperCase();
            if(coffeeType.equalsIgnoreCase("exit")){
                System.out.println("Thanks For Visiting");
                break;
            }
            switch (coffeeType) {
                case "ESPRESSO":
                    price = 120;
                    break;
                    case "LATTE":
                    price = 160;
                    break;
                    case "CAPPUCCINO":
                    price = 200;
                    break;
                default:
                System.out.println("Please choose from these (espresso/latte/cappuccino) ");
                    continue;

            }
            System.out.print("Enter the Quantity : ");
            quantity = sc.nextInt();
            sc.nextLine();
            total = price * quantity;
            gst = total * 0.08;
            finalAmount = total + gst;
            System.out.println("Bill Summary:");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Price       : " + price);
            System.out.println("Total       : " + total);
            System.out.println("GST (5%)    : " + gst);
            System.out.println("Final Amount: " + finalAmount);
            System.out.println("------------------------------");
        }

        sc.close();

    }
    
}