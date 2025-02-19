package LR6_PrintinPublications;

class Journal implements Publication {
    private final String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public void createContract() {
        System.out.println("Договор на журнал \"" + title + "\" оформлен.");
    }

    @Override
    public void openPublication() {
        System.out.println("Журнал \"" + title + "\" открыт для работы.");
    }

    @Override
    public void editPublication() {
        System.out.println("Журнал \"" + title + "\" отредактирован.");
    }

    @Override
    public void imposePublication() {
        System.out.println("Журнал \"" + title + "\" сверстан.");
    }

    @Override
    public void sendToPrint() {
        System.out.println("Журнал \"" + title + "\" отправлен на печать.");
    }

    @Override
    public void cancelPublication() {
        System.out.println("Издание журнала \"" + title + "\" отменено.");
    }

    @Override
    public void payPublication() {
        System.out.println("Журнал \"" + title + "\" оплачен.");
    }

    @Override
    public void resumePublication() {
        System.out.println("Работа над журналом \"" + title + "\" возобновлена.");
    }

    @Override
    public void closePublication() {
        System.out.println("Журнал \"" + title + "\" закрыт.");
    }

    public void addArticle(String articleName) {
        System.out.println("Статья \"" + articleName + "\" добавлена в журнал \"" + title + "\".");
    }
}