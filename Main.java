import java.util.ArrayList;

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.display();
            System.out.println("----------------");
        }
    }

    public void searchStudent(int id) {
        for (Student student : students) {
            if (student.id == id) {
                student.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
