package LR10_SubstringRemover;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SubstringRemover {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Использование: java SubstringRemover.SubstringRemover <входной файл> <выходной файл> <подстрока для удаления>");
            return;
        }
        //Получение параметров из командной строки
        String inputFilePath = args[0]; //Путь к входному файлу
        String outputFilePath = args[1]; //Путь к выходному файлу
        String substringToRemove = args[2]; //Подстрока для удаления

        //Чтение из входного файла и запись в выходной файл
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            //Чтение каждой строки из входного файла
            while ((line = reader.readLine()) != null) {
                //Удаление подстроки из строки
                String modifiedLine = line.replace(substringToRemove, "");
                //Запись измененной строки в выходной файл
                writer.write(modifiedLine);
                writer.newLine(); //Переход на новую строку
            }

            System.out.println("Обработка завершена. Результаты записаны в файл: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}