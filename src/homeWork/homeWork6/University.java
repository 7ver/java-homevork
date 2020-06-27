package homeWork.homeWork6;

import java.math.BigDecimal;
import java.util.ArrayList;

public class University {
    private final String name;
    private final String address;

    private final ArrayList<Kathedra> cathedraList = new ArrayList<>();
    private final ArrayList<Student> studentList = new ArrayList<>();

    University(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public ArrayList<Kathedra> getCathedraList() {
        return cathedraList;
    }

    public void addCathedra(String name) {
        this.cathedraList.add(new Kathedra(name));
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(String name, String surname, int age, BigDecimal averageGrade, String specialization) {
        this.studentList.add(new Student(name, surname, age, averageGrade, specialization));
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
