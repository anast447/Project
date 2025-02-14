package PrintinPublications;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("451 градус по Фаренгейту");
        Journal journal = new Journal("Технологии будущего");
        Textbook textbook = new Textbook("Java для начинающих");

        book.createContract();
        book.openPublication();
        book.addChapter("Часть 1. Очаг и Саламандра");
        book.editPublication();
        book.imposePublication();
        book.sendToPrint();
        book.cancelPublication();
        book.payPublication();
        book.resumePublication();
        book.closePublication();

        System.out.println();

        journal.createContract();
        journal.openPublication();
        journal.addArticle("MOLGA Consulting рассказала о выводе на рынок новой цифровой платформы HRroom");
        journal.editPublication();
        journal.imposePublication();
        journal.sendToPrint();
        journal.cancelPublication();
        journal.payPublication();
        journal.resumePublication();
        journal.closePublication();

        System.out.println();

        textbook.createContract();
        textbook.openPublication();
        textbook.addExercise("Написать программу на языке Java");
        textbook.editPublication();
        textbook.imposePublication();
        textbook.sendToPrint();
        textbook.cancelPublication();
        textbook.payPublication();
        textbook.resumePublication();
        textbook.closePublication();
    }
}