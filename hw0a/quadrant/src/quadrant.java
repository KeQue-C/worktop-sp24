import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入X坐标：");
        double x = scanner.nextDouble();
        System.out.println("请输入Y坐标：");
        double y = scanner.nextDouble();

        QuadrantJudgment(x, y);

        scanner.close();
    }

    public static void QuadrantJudgment(double x, double y) {
        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        } else {
            System.out.println("0");
        }
    }
}
