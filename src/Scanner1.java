import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            if (number == 2) {
                sum = sum * 2;
                System.out.println("Double bonus !" + sum);
                System.out.println("Enter another number: ");
                number = scanner.nextInt();
            } else if (number == 3) {
                sum = sum * 3;
                System.out.println("Tripple bonus!" + sum);
                System.out.println("Enter another number: ");
                number = scanner.nextInt();
            } else if (number == 22) {
                sum = sum / 2;
                System.out.println("Sum halved..." + sum);
                System.out.println("Enter another number: ");
                number = scanner.nextInt();
            } else {
                sum = sum + number;
                System.out.println("Enter another number: ");
                number = scanner.nextInt();
            }
        }
    }
}
