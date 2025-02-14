package PrintinPublications;


// Класс для учебного пособия
class Textbook implements Publication {
    private final String title; // Название учебного пособия

    public Textbook(String title) {
        this.title = title;
    }

    @Override
    public void createContract() {
        System.out.println("Договор на учебное пособие \"" + title + "\" оформлен.");
    }

    @Override
    public void openPublication() {
        System.out.println("Учебное пособие \"" + title + "\" открыто для работы.");
    }

    @Override
    public void editPublication() {
        System.out.println("Учебное пособие \"" + title + "\" отредактировано.");
    }

    @Override
    public void imposePublication() {
        System.out.println("Учебное пособие \"" + title + "\" сверстано.");
    }

    @Override
    public void sendToPrint() {
        System.out.println("Учебное пособие \"" + title + "\" отправлено на печать.");
    }

    @Override
    public void cancelPublication() {
        System.out.println("Издание учебного пособия \"" + title + "\" отменено.");
    }

    @Override
    public void payPublication() {
        System.out.println("Учебное пособие \"" + title + "\" оплачено.");
    }

    @Override
    public void resumePublication() {
        System.out.println("Работа над учебным пособием \"" + title + "\" возобновлена.");
    }

    @Override
    public void closePublication() {
        System.out.println("Учебное пособие \"" + title + "\" закрыто.");
    }

    // Специализированный метод для учебного пособия
    public void addExercise(String exerciseName) {
        System.out.println("Упражнение \"" + exerciseName + "\" добавлено в учебное пособие \"" + title + "\".");
    }
}
