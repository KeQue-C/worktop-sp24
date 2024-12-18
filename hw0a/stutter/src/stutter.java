import java.util.Scanner;

public class stutter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入一个字符串：");
        String input = scanner.nextLine();

        DoubleWord(input);
        scanner.close();
    }

    public static void DoubleWord(String input) {
        int length = input.length();

        for (int i = 0; i < length; i++) {
            System.out.print(input.charAt(i));
            System.out.print(input.charAt(i));
        }
    }
}
