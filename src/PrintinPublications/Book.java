package PrintinPublications;

class Book implements Publication {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void createContract() {
        System.out.println("Договор на книгу \"" + title + "\" оформлен.");
    }

    @Override
    public void openPublication() {
        System.out.println("Книга \"" + title + "\" открыта для работы.");
    }

    @Override
    public void editPublication() {
        System.out.println("Книга \"" + title + "\" отредактирована.");
    }

    @Override
    public void imposePublication() {
        System.out.println("Книга \"" + title + "\" сверстана.");
    }

    @Override
    public void sendToPrint() {
        System.out.println("Книга \"" + title + "\" отправлена на печать.");
    }

    @Override
    public void cancelPublication() {
        System.out.println("Издание книги \"" + title + "\" отменено.");
    }

    @Override
    public void payPublication() {
        System.out.println("Книга \"" + title + "\" оплачена.");
    }

    @Override
    public void resumePublication() {
        System.out.println("Работа над книгой \"" + title + "\" возобновлена.");
    }

    @Override
    public void closePublication() {
        System.out.println("Книга \"" + title + "\" закрыта.");
    }

    public void addChapter(String chapterName) {
        System.out.println("Глава \"" + chapterName + "\" добавлена в книгу \"" + title + "\".");
    }
}
