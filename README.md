# Student Record Management System (Java Swing)

A desktop application built using **Java Swing** for managing student records.

## 👩‍💼 Admin Features:
- Add new student records
- Update student information
- Delete student records
- View all students

## 👨‍🎓 Student Features:
- View own academic record
- Read-only access (cannot edit or delete)

## 🛠 Technologies Used:
- Java (Swing GUI)
- JDBC
- MySQL (or compatible RDBMS)

## 🚀 How to Run

1. Clone the repository:
   git clone https://github.com/yourusername/student-record-management-java.git

2. Set up the database:
   - Import the `student_db.sql` file into your MySQL server.
   - Update DB credentials in your Java DB connection class (e.g., DBConnection.java).

3. Compile and run:
   - Open in an IDE (IntelliJ, Eclipse, etc.)
   - Run the `Main.java` class

## 📁 Project Structure:
- `Main.java` – Main entry point
- `AdminPanel.java` – Admin GUI and controls
- `StudentPanel.java` – Student view interface
- `DBConnection.java` – Database connection class
- `student_db.sql` – SQL script for DB setup

## 🔐 Roles:

| Role    | Permissions                    |
|---------|--------------------------------|
| Admin   | Add, Edit, Delete, View        |
| Student | View only (Read access)        |

## ✅ Possible Improvements:
- Add search and filter functionality
- Export records to PDF or Excel
- Add login/password recovery system
- Responsive layout with custom themes

## 📄 License:
Open source under the MIT License.
