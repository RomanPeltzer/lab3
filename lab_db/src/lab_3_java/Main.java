package lab_3_java;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public void main(String[] args) {
       Connector.connector();
       getFaculties();
       getStudents();
       getStudentsSubjects();
       getSubjects();
       getTeachers();
}

    public void getFaculties() {
        try {
            Statement stmt = Connector.connection.createStatement();
            String sql = "SELECT * FROM faculties";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                Faculty fac = new Faculty(result.getInt(1), result.getString(2));
                if(!Faculty.faculties.contains(fac)) {
                    Faculty.faculties.add(fac);
                }
            }
            System.out.println("Connected");
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("-Exception in getting faculties from DB!\n");
        }
    }

    public void getStudents() {
        try {
            Statement stmt = Connector.connection.createStatement();
            String sql = "SELECT * FROM students";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                Student student = new Student(result.getInt(1), result.getString(2), result.getString(3),result.getInt(4));
                if(!Student.students.contains(student)) {
                    Student.students.add(student);
                }
            }
            System.out.println("Connected");
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("-Exception in getting students from DB!\n");
        }
    }

    public void getStudentsSubjects() {
        try {
            Statement stmt = Connector.connection.createStatement();
            String sql = "SELECT * FROM students_subjects";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                StudentSubject stud_subj = new StudentSubject(result.getInt(1), result.getInt(2));
                if(!StudentSubject.StudentSubjects.contains(stud_subj)) {
                    StudentSubject.StudentSubjects.add(stud_subj);
                }
            }
            System.out.println("Connected");
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("-Exception in getting stud_subj from DB!\n");
        }
    }

    public void getSubjects() {
        try {
            Statement stmt = Connector.connection.createStatement();
            String sql = "SELECT * FROM subjects";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                Subject subject = new Subject(result.getInt(1), result.getString(2), result.getInt(3));
                if(!Subject.subjects.contains(subject)) {
                    Subject.subjects.add(subject);
                }
            }
            System.out.println("Connected");
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("-Exception in getting stud_subj from DB!\n");
        }
    }

    public void getTeachers() {
        try {
            Statement stmt = Connector.connection.createStatement();
            String sql = "SELECT * FROM teachers";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                Teacher teacher = new Teacher(result.getInt(1), result.getString(2), result.getString(3));
                if(!Teacher.teachers.contains(teacher)) {
                    Teacher.teachers.add(teacher);
                }
            }
            System.out.println("Connected");
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("-Exception in getting stud_subj from DB!\n");
        }
    }


}
