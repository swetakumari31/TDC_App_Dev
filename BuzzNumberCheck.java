import java.util.Scanner;

public class BuzzNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for Buzz number
        if (number % 7 == 0 || number % 10 == 7) {
            S
