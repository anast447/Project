import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LR8_ReplaceText {
    public static void main(String[] args) {
        String text = "Привет Влад, ты лабы по джаве сделал?";
        int k = 3;
        char replacementChar = '$';

        String modifiedText = replace(text, k, replacementChar);

        System.out.println("Текст: " + text);
        System.out.println("Измененный текст: " + modifiedText);
    }

    public static String replace(String text, int k, char replacementChar) {
        String[] words = text.split(" ");
        StringBuilder modifiedText = new StringBuilder();

        for (String word : words) {
            if (k > word.length()) {
                modifiedText.append(word);
            }
                else {
                    String modifiedWord = word.substring(0, k - 1) + replacementChar + word.substring(k);
                    modifiedText.append(modifiedWord);
                }
            modifiedText.append(" ");
        }
        return modifiedText.toString().trim();
    }

    //тесты
    @Test
    public void testReplaceWithShortWord() {
        String text = "Привет";
        int k = 3;
        char replacementChar = '$';
        String expected = "Прив$т";
        String actual = LR8_ReplaceText.replace(text, k, replacementChar);
        assertEquals(expected, actual);
    }

    @Test
    public void testReplaceWithLongWord() {
        String text = "Привет Влад";
        int k = 4;
        char replacementChar = '#';
        String expected = "При#ет Vla#d";
        String actual = LR8_ReplaceText.replace(text, k, replacementChar);
        assertEquals(expected, actual);
    }

    @Test
    public void testReplaceWithNoChange() {
        String text = "Привет";
        int k = 10; // k больше длины слова
        char replacementChar = '*';
        String expected = "Привет";
        String actual = LR8_ReplaceText.replace(text, k, replacementChar);
        assertEquals(expected, actual);
    }

    @Test
    public void testReplaceMultipleWords() {
        String text = "Привет Влад, ты лабы по джаве сделал?";
        int k = 3;
        char replacementChar = '$';
        String expected = "Прив$т Vla$д, ты лабы по джаве сделал?";
        String actual = LR8_ReplaceText.replace(text, k, replacementChar);
        assertEquals(expected, actual);
    }
}


}
