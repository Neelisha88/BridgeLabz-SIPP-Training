package Day2_ControlFlow;
import java.util.*;

public class CheckDivisibilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to Check : ");
        int n = sc.nextInt();
       boolean isDivisible = n % 5 == 0;
       System.out.println("Is the number " + n + " divisible by 5? " + isDivisible);
        sc.close();
    }
    
}
