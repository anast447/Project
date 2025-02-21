package LR9_FloatingPointReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

// Основной класс
public class FloatingPointReader {
    static class MyNumberException extends Exception {
        public MyNumberException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        String filename = "C:/Users/anast/IdeaProjects/Project/src/FloatingPointReader/numbers.txt";

        double sum = 0.0;
        int count = 0;
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split("\\s+");
                if (parts.length < 2) {
                    throw new MyNumberException("Некорректная строка: " + line);
                }

                String localeStr = parts[0].trim();
                String numberStr = parts[1].trim();

                double value = parseNumberWithLocale(localeStr, numberStr);

                if (value > Double.MAX_VALUE || value < -Double.MAX_VALUE) {
                    throw new MyNumberException("Число " + value + " выходит за пределы Double");
                }
                sum += value;
                count++;
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("Ошибка: Файл не найден: " + filename);
        }
        catch (OutOfMemoryError e) {
            System.err.println("Ошибка: Недостаточно памяти для обработки файла!");
        }
        catch (MyNumberException e) {
            System.err.println("Пользовательское исключение: " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
        finally {
            if (fileScanner != null) {
                fileScanner.close();
            }
        }

        if (count > 0) {
            double avg = sum / count;
            System.out.println("Сумма прочитанных чисел = " + sum);
            System.out.println("Среднее значение = " + avg);
        } else {
            System.out.println("Не было корректно прочитанных чисел.");
        }
    }

    private static double parseNumberWithLocale(String localeStr, String numberStr) throws MyNumberException {
        Locale locale = createLocale(localeStr);
        if (locale == null) {
            throw new MyNumberException("Неизвестная локаль: " + localeStr);
        }
        try {
            NumberFormat nf = NumberFormat.getInstance(locale);
            Number parsed = nf.parse(numberStr);
            return parsed.doubleValue();
        }
        catch (ParseException e) {
            throw new MyNumberException("Невозможно распарсить число \"" + numberStr
                    + "\" с локалью " + localeStr);
        }
    }

    private static Locale createLocale(String localeStr) {
        switch (localeStr) {
            case "en_US":
                return Locale.US;
            case "de_DE":
                return Locale.GERMANY;
            case "en_GB":
                return Locale.UK;
            case "fr_FR":
                return Locale.FRANCE;
            case "ru_RU":
                return new Locale("ru", "RU");
            default:
                return null;
        }
    }
}