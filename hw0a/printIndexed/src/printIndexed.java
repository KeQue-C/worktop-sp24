import java.util.Scanner;

public class printIndexed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Scanner：一个类名，用于创建一个扫描器对象；
        scanner：对象名，可以自定义；
        new：一个关键字，用于在内存中创建一个新对象；
        Scanner(System.in)：调用Scanner类的构造方法，将标准输入流（System.in）作为数据源。
         */
        System.out.print("请录入一个字符串：");
        String input = scanner.nextLine();
        /*定义一个字符串类变量，名称为input；
        nextLine用于读取一行输入（包括空格）。
         */
        Indexedprint(input);
        scanner.close();
    }

    public static void Indexedprint(String input) {
        int length = input.length();    //获取字符串长度

        for (int i = 0; i < length; i++) {
            System.out.print(input.charAt(i));    //输出当前次第的字符
            System.out.print(length - i - 1);    //输出当前字符的逆序索引
        }
    }
}
