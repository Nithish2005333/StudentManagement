// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        try (Scanner scanner = new Scanner(System.in)) {
            sms.loadFromFile(); // Load students when program starts

            while (true) {
                System.out.println("===== Student Record Management System =====");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Search Student");
                System.out.println("6. Save Students to File");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        sms.addStudent();
                        break;
                    case 2:
                        sms.viewStudents();
                        break;
                    case 3:
                        sms.updateStudent();
                        break;
                    case 4:
                        sms.deleteStudent();
                        break;
                    case 5:
                        sms.searchStudent();
                        break;
                    case 6:
                        sms.saveToFile();
                        break;
                    case 7:
                        sms.saveToFile(); // Save before exit
                        System.out.println("Exiting... Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.\n");
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
