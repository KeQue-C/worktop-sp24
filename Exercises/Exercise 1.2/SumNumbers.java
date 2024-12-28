import java.util.Scanner;
import java.util.ArrayList;

public class SumNumbers {
    public static void sumNumbers(String[] numbers) {
        double sum = 0;
        for (int i =0; i < numbers.length; i++) {
            double num = Double.parseDouble(numbers[i]);
            sum += num;
        }
        System.out.println("The sum of these numbers is: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Please enter numbers to sum (type 'run' to finish):");
        while (true) {
            System.out.print("Please enter a number: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("run")) {
                break;
            } else {
                inputs.add(input);
            }
        }
        String[] inputNumbers = inputs.toArray(new String[0]);
        sumNumbers(inputNumbers);
    }
}
