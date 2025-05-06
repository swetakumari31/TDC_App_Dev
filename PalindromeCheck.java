import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase for case-insensitive comparison
        String str = input.toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();

        // Check if the original and reversed are the same
