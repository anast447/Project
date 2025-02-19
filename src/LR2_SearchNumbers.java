import java.util.Scanner;

public class LR2_SearchNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число элементов n: ");
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print((i + 1) + "-е число: ");
            a[i] = input.nextInt();
        }

        if (n > 0) {
            int min = Math.abs(a[0]), max = Math.abs(a[0]);
            for (int value : a) {
                if (Math.abs(value) > max) {
                    max = Math.abs(value);
                }
                if (Math.abs(value) < min) {
                    min = Math.abs(value);
                }
            }

            int minDigitsCount = getNumberOfCharacters(min), maxDigitsCount = getNumberOfCharacters(max);

            System.out.println("Самое короткое число = " + min + ", количество знаков = " + minDigitsCount);
            System.out.println("Самое длинное число = " + max + ", количество знаков = " + maxDigitsCount);
        } else {
            System.out.print("Невозможно найти самое короткое и длинное число");
        }

        System.out.println("\nРазработчик: Балакина Анастасия");
        System.out.println("Дата и время получения задания: 04 февраля 2025 г. в 15:00");
        System.out.println("Дата и время выполнения задания: 10 февраля 2025 г. в 14:44");
    }

    public static int getNumberOfCharacters(int value) {
        int number = 0;
        while (value > 0) {
            number++;
            value /= 10;
        }
        return number;
    }
}