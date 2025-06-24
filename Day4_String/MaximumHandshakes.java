package Day4_String;
import java.util.Scanner;

public class MaximumHandshakes {

    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes possible: " + handshakes);

        sc.close();
    }
}