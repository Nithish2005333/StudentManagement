// StudentManagementSystem.java
import java.util.*;
import java.io.*;

public class StudentManagementSystem {
    private ArrayList<Student> students;
    private Scanner scanner;

    public StudentManagementSystem() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addStudent() {
        System.out.println("\n--- Add Student ---");
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter Grade: ");
        double grade = Double.parseDouble(scanner.nextLine());

        students.add(new Student(id, name, course, grade));
        System.out.println("Student added successfully!\n");
    }

    public void viewStudents() {
        System.out.println("\n--- Student List ---");
        if (students.isEmpty()) {
            System.out.println("No students available.\n");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void updateStudent() {
        System.out.println("\n--- Update Student ---");
        System.out.print("Enter Student ID to update: ");
        String id = scanner.nextLine();
        Student student = findStudentById(id);

        if (student != null) {
            System.out.print("Enter New Name: ");
            student.setName(scanner.nextLine());
            System.out.print("Enter New Course: ");
            student.setCourse(scanner.nextLine());
            System.out.print("Enter New Grade: ");
            student.setGrade(Double.parseDouble(scanner.nextLine()));
            System.out.println("Student updated successfully!\n");
        } else {
            System.out.println("Student not found!\n");
        }
    }

    public void deleteStudent() {
        System.out.println("\n--- Delete Student ---");
        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine();
        Student student = findStudentById(id);

        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully!\n");
        } else {
            System.out.println("Student not found!\n");
        }
    }

    public void searchStudent() {
        System.out.println("\n--- Search Student ---");
        System.out.print("Enter Student Name or ID: ");
        String keyword = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (Student s : students) {
            if (s.getId().toLowerCase().contains(keyword) || s.getName().toLowerCase().contains(keyword)) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching student found!\n");
        } else {
            System.out.println();
        }
    }

    public void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("students.txt"))) {
            for (Student s : students) {
                writer.println(s.getId() + "," + s.getName() + "," + s.getCourse() + "," + s.getGrade());
            }
            System.out.println("Students saved to file successfully!\n");
        } catch (IOException e) {
            System.out.println("Error saving students to file.\n");
        }
    }

    public void loadFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String id = parts[0];
                    String name = parts[1];
                    String course = parts[2];
                    double grade = Double.parseDouble(parts[3]);
                    students.add(new Student(id, name, course, grade));
                }
            }
            System.out.println("Students loaded from file successfully!\n");
        } catch (IOException e) {
            System.out.println("Error loading students from file.\n");
        }
    }

    private Student findStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }
}
