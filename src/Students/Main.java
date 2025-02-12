package Students;

public class Main {

    public static void main(String[] args) {

        Students students = new Students(8);
        System.out.println("Список всех студентов:");
        System.out.printf("%-4s%-28s%-16s%-40s%-15s%-5s%-8s%-10s%n", "ID", "ФИО","Дата рождения", "Адрес","Телефон","Курс","Факул-т","Группа");
        for (Student student : students.getStudents()) {
            System.out.println(student);
        }

        System.out.println("\nСписок студентов факультета ФКНТ (по запросу):");
        Student[] physicalStudents = students.filterByFaculty("ФКНТ");
        for (Student student : physicalStudents) {
            System.out.println(student);
        }

        for (String faculty : students.getFaculty()) {
            System.out.println("\nСписок студентов факультета " + faculty);
            Student[] facultyStudents = students.filterByFaculty(faculty);
            for (Student student : facultyStudents) {
                System.out.println(student);
            }
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nСписок студентов " + i + " курса: ");
            Student[] courseStudents = students.filterByCourse(i);
            for (Student student : courseStudents) {
                if(student == null){System.out.println("\nСтудентов на курсе" + i + " нет!");}
                System.out.println(student);
            }
        }

        System.out.println("\nСписок студентов 2000 года рождения:");
        Student[] students2000 = students.filterByBirthYear(2000);
        for (Student student : students2000) {
            System.out.println(student);
        }

        System.out.println("\nСписок студентов группы Ф22:");
        Student[] studentsF22 = students.filterByGroup("Ф22");
        for (Student student : studentsF22) {
            System.out.println(student);
        }
    }
}