package LR3_Students;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String birth;
    private int year;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String surname, String name, String middleName, String birth,int year, String address, String phone, String faculty, int course, String group) {
        setId(id);
        setSurname(surname);
        setName(name);
        setMiddleName(middleName);
        setBirth(birth);
        setYear(year);
        setAddress(address);
        setPhone(phone);
        setFaculty(faculty);
        setCourse(course);
        setGroup(group);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return getId() + "\t" + getSurname() + " " + getName() + " " + getMiddleName() + "\t" +
                getBirth() + " " + getYear() + "г " + "\t" + getAddress() + "\t" + getPhone() + "\t" +
                getCourse() + "\t" + getFaculty() + "\t" + getGroup();

    }
}