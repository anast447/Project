import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Основной класс Notepad
public class LR5_Notepad {

    private static class Note {
        String content;

        public Note(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }

    private final HashMap<String, List<Note>> notesByDate;

    public LR5_Notepad() {
        notesByDate = new HashMap<>();
    }

    public void addNote(String date, String content) {
        notesByDate.putIfAbsent(date, new ArrayList<>());
        notesByDate.get(date).add(new Note(content));
    }

    public List<String> getNotesByDate(String date) {
        List<String> notesContent = new ArrayList<>();
        if (notesByDate.containsKey(date)) {
            for (Note note : notesByDate.get(date)) {
                notesContent.add(note.getContent());
            }
        }
        return notesContent;
    }

    public static void main(String[] args) {
        LR5_Notepad notepad = new LR5_Notepad();
        notepad.addNote("13.02.2025", "Сделать лабы по java");
        notepad.addNote("13.02.2025", "Сделать математику");
        notepad.addNote("13.02.2025", "Сделать лабы по android");
        notepad.addNote("15.02.2025", "Сделать лабы по основам ПИ");
        notepad.addNote("21.02.2025", "Сдача курсовой");

        List<String> notes = notepad.getNotesByDate("13.02.2025");
        System.out.println("Список дел на 13.02.2025:");
        for (String note : notes) {
            System.out.println(note);
        }
    }
}