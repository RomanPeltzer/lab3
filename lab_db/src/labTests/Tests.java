package labTests;

import lab_3_java.*;
import org.junit.*;
import static org.junit.Assert.*;

public class Tests {

    private Main main;

    @Before
    public void init() {
        main = new Main();
        Connector.connector();
        main.getFaculties();
        main.getStudents();
        main.getStudentsSubjects();
        main.getSubjects();
        main.getTeachers();
    }
    @After
    public void tearDown() {
        main = null;
        Connector.disconnect();
    }

    @Test
    public void getTestSubjects() {
        assertEquals(1, Subject.subjects.get(0).getId());
        assertEquals("Системне програмування", Subject.subjects.get(0).getName());
        assertEquals(1, Subject.subjects.get(0).getTeachId());

        assertEquals(2, Subject.subjects.get(1).getId());
        assertEquals("Архітектура комп`ютерних систем", Subject.subjects.get(1).getName());
        assertEquals(2, Subject.subjects.get(1).getTeachId());

        assertEquals(3, Subject.subjects.get(2).getId());
        assertEquals("Основи системної інженерії", Subject.subjects.get(2).getName());
        assertEquals(2, Subject.subjects.get(2).getTeachId());
    }

    @Test
    public void getTestFaculties() {
        assertEquals(1, Faculty.faculties.get(0).getId());
        assertEquals("ТЕФ", Faculty.faculties.get(0).getName());

        assertEquals(2, Faculty.faculties.get(1).getId());
        assertEquals("ФИОТ", Faculty.faculties.get(1).getName());

        assertEquals(3, Faculty.faculties.get(2).getId());
        assertEquals("ФПМ", Faculty.faculties.get(2).getName());
    }

    @Test
    public void getTestStudents() {
        assertEquals(3, Student.students.get(2).getId());
        assertEquals("Валерій", Student.students.get(2).getName());
        assertEquals("Панарін", Student.students.get(2).getSName());
        assertEquals(1, Student.students.get(2).getFacid());

        assertEquals(4, Student.students.get(3).getId());
        assertEquals("Антон", Student.students.get(3).getName());
        assertEquals("Буднічук", Student.students.get(3).getSName());
        assertEquals(5, Student.students.get(3).getFacid());

        assertEquals(5, Student.students.get(4).getId());
        assertEquals("Роман", Student.students.get(4).getName());
        assertEquals("Пельцер", Student.students.get(4).getSName());
        assertEquals(6, Student.students.get(4).getFacid());
    }

    @Test
    public void getTestStudSubj() {
        assertEquals(1, StudentSubject.StudentSubjects.get(0).getStudId());
        assertEquals(1, StudentSubject.StudentSubjects.get(0).getSubId());

        assertEquals(1, StudentSubject.StudentSubjects.get(1).getStudId());
        assertEquals(2, StudentSubject.StudentSubjects.get(1).getSubId());

        assertEquals(1, StudentSubject.StudentSubjects.get(2).getStudId());
        assertEquals(3, StudentSubject.StudentSubjects.get(2).getSubId());
    }

    @Test
    public void getTestTeachers() {
        assertEquals(1, Teacher.teachers.get(0).getId());
        assertEquals("Павло", Teacher.teachers.get(0).getTeachName());
        assertEquals("Катін", Teacher.teachers.get(0).getSName());

        assertEquals(2, Teacher.teachers.get(1).getId());
        assertEquals("Віктор", Teacher.teachers.get(1).getTeachName());
        assertEquals("Долина", Teacher.teachers.get(1).getSName());

        assertEquals(4, Teacher.teachers.get(2).getId());
        assertEquals("Валентина", Teacher.teachers.get(2).getTeachName());
        assertEquals("Коваленко", Teacher.teachers.get(2).getSName());
    }
}
