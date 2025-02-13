package Text;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private String title;
    private List<Sentence> sentences;

    public Text(String title) {
        this.title = title;
        sentences = new ArrayList<>();
    }

    //добавление предложения в текст
    public void addSentence(Sentence sentence) {
        sentences.add(sentence);
    }

    public void setTitle(String title) {
        this.title = title;
    }

        public String getTitle() {
        return title;
    }

    public void printText() {
        System.out.println("Заголовок: " + title);
        for (Sentence sentence : sentences) {
            System.out.println(sentence);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return title.equals(text.title) && sentences.equals(text.sentences);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + sentences.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Заголовок: ").append(title).append("\n");
        for (Sentence sentence : sentences) {
            sb.append(sentence).append("\n");
        }
        return sb.toString();
    }
}