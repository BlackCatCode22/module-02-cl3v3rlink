import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.println("Enter three integers :");

        // Read the integers from the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Determine the largest integer using nested if statements
        int largest;

        if (num1 >= num2) {
            largest = Math.max(num1, num3);
        } else {
            largest = Math.max(num2, num3);
        }

        // Display the largest integer
        System.out.println("The largest integer is:" + largest);

        scanner.close();
    }
}
