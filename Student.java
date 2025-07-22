// Student.java
public class Student {
    private String id;
    private String name;
    private String course;
    private double grade;

    public Student(String id, String name, String course, double grade) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Course: " + course + ", Grade: " + grade;
    }
}
