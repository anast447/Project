package LR4_Text;

public class Main {
    public static void main(String[] args) {
        Word word1 = new Word("Привет,");
        Word word2 = new Word("пользователь.");
        Word word3 = new Word("Это");
        Word word4 = new Word("страница.");

        Sentence sentence1 = new Sentence();
        sentence1.addWord(word1);
        sentence1.addWord(word2);

        Sentence sentence2 = new Sentence();
        sentence2.addWord(word3);
        sentence2.addWord(word4);

        Text text = new Text("Добро пожаловать!");
        text.addSentence(sentence1);
        text.addSentence(sentence2);

        text.printText();
    }
}