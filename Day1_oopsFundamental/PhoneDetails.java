import java.util.*;

class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class PhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Phone Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Phone Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Phone Price: ");
        double price = sc.nextDouble();

        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.displayDetails();
    }
}