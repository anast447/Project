package Students;

public class Students {
    private Student[] students;

    private final String[] names = {
            "Владислав",
            "Ирина",
            "Вадим",
            "Максим",
            "Данил",
            "Мария",
            "Станислав",
            "Надежда",
            "Анастасия"
    };
    private final String[] surnames = {
            "Бондарь",
            "Батуева",
            "Убонеев",
            "Соктоев",
            "Иконников",
            "Перевозникова",
            "Батуев",
            "Савчук",
            "Балакина"
    };
    private final String[] middleNames = {
            "Андреевич",
            "Васильевна",
            "Максимович",
            "Евгеньевич",
            "Андреевич",
            "Андреевна",
            "Борисович",
            "Булатовна",
            "Сергеевна"
    };
    private final String[] date = {
            "17 июня",
            "23 февраля",
            "02 декабря",
            "04 июня",
            "16 ноября",
            "10 апреля",
            "11 октября",
            "30 марта",
            "20 февраля"
    };
    private final int[] year = {
            2002, 2000, 2004, 2000, 2002, 1999, 2001, 1994, 1998
    };
    private final String[] address = {
            "г. Улан-Удэ, ул. Советская д. 1 кв. 10",
            "г. Улан-Удэ, ул Ленина д. 12 кв. 45",
            "г. Улан-Удэ, п-т 50-лет Октября д. 34 кв. 18",
            "г. Улан-Удэ, ул. Мокрова д. 16",
            "г. Улан-Удэ, ул. Советская д. 16 кв. 54",
            "г. Улан-Удэ, ул. Шмидта д. 17 кв. 123",
            "г. Улан-Удэ, ул. Смолина д. 10 кв. 14",
            "г. Улан-Удэ, ул. Лысогорская д. 36",
            "г. Улан-Удэ, ул. Витебская д. 6",
            "г. Улан-Удэ, ул. Хрустальная д. 16 кв. 14"
    };
    private final String[] phones = {
            "+79832146542",
            "+79995423145",
            "+79142547123",
            "+79501423584",
            "+79512457851",
            "+79834761455",
            "+79144751454",
            "+79832447565",
            "+79515421444"
    };
    private final  String[] faculties = {
            "ФКНТ",
            "Математический",
            "ФКНТ",
            "ФКНТ",
            "Строительный",
            "Строительный",
            "Экономический",
            "Экономический",
            "ФКНТ"
    };
    private final int[] courses = {
            3, 2, 2, 4, 3, 5, 2, 2, 2
    };
    private final String[] groups = {
            "Ф23", "М12", "Ф22", "Ф24", "С33", "С35", "Э42", "Э42", "Ф22"
    };

    public Students(int count) {
    students = generateStudents(count);
    }

    private Student[] generateStudents(int index) {
        Student[] arr = new Student[index];
        for (int i = 0; i < index; i++) {
            arr[i] = new Student(i + 1, surnames[i], names[i], middleNames[i], date[i], year[i],
                    address[i], phones[i], faculties[i], courses[i], groups[i]);
        }
        return arr;
    }

    public Student[] getStudents() {
        return students;
    }

    public String[] getFaculty() {
        return faculties;
    }

    public Student[] filterByFaculty(String faculty) {
        int count = 0;
        for (Student student : getStudents()) {
            if (student.getFaculty().equals(faculty)) {
                count++;
            }
        }

        Student[] result = new Student[count];
        int index = -1;
        for (Student student : getStudents()) {
            if (student.getFaculty().equals(faculty)) {
                index++;
                result[index] = student;
            }
        }
        return result;
    }

    public Student[] filterByBirthYear(int year) {
        int count = 0;
        for (Student student : getStudents()) {
            if (student.getYear() == year) {
                count++;
            }
        }

        Student[] result = new Student[count];
        int index = -1;
        for (Student student : getStudents()) {
            if (student.getYear() == year) {
                index++;
                result[index] = student;
            }
        }
        return result;
    }

    public Student[] filterByCourse(int course) {
        int count = 0;
        for (Student student : getStudents()) {
            if (student.getCourse() == course) {
                count++;
            }
        }

        Student[] result = new Student[count];
        int index = -1;
        for (Student student : getStudents()) {
            if (student.getCourse() == course) {
                index++;
                result[index] = student;
            }
        }
        return result;
    }

    public Student[] filterByGroup(String group) {
        int count = 0;
        for (Student student : getStudents()) {
            if (student.getGroup().equals(group)) {
                count++;
            }
        }

        Student[] result = new Student[count];
        int index = -1;
        for (Student student : getStudents()) {
            if (student.getGroup().equals(group)) {
                index++;
                result[index] = student;
            }
        }
        return result;
    }

}
