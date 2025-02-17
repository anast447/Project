import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Сurrying {
    public static java.util.function.Function<Integer, java.util.function.Function<Integer, Integer>> add =
            a -> b -> a + b;

    public static java.util.function.Function<String, java.util.function.Function<String, Boolean>> matches =
            regex -> input -> {
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(input);
                return matcher.matches();
            };

    public static java.util.function.Function<String, java.util.function.Function<String, String[]>> split =
            regex -> input -> input.split(regex);

    public static void main(String[] args) {
        int sum = add.apply(21).apply(52);
        System.out.println("5 + 3 = " + sum);

        String regex = "\\d+"; //состоит ли строка только из цифр
        String input = "65465489";
        boolean isMatch = matches.apply(regex).apply(input);
        if (isMatch) {
            System.out.println("Строка: " + input + ", соответствует регулярному выражению: " + regex);
        }
            else {
                System.out.println("Строка " + input + "не соответствует регулярному выражению " + regex);
            }

        String text = "музыка,фильмы,игры,шоппинг";
        String[] partition = split.apply(",").apply(text); //разбиваем строку по запятой
        System.out.println("Строка: " + text + ", разбита по запятой на:");
        for (String words : partition) {
            System.out.println(words);
        }
    }
}
