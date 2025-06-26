import java.util.Scanner;

class PalindromeString {
    String text;

    PalindromeString(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String clean = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = clean.length() - 1;

        while (i < j) {
            if (clean.charAt(i) != clean.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        PalindromeString checker = new PalindromeString(userInput);
        checker.displayResult();

        sc.close();
    }
}