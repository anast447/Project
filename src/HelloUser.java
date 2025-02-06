import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Здравствуйте, " + name + "!");
        scanner.close();
    }
}