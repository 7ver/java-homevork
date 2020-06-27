package homeWork.homeWork6;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Kathedra {
    private final String name;
    private final ArrayList<Teacher> teachersList = new ArrayList<>();

    public Kathedra(String name) {
        this.name = name;
    }
    public ArrayList<Teacher> getTeachersList() {
        return teachersList;
    }

    public void addTeacher(String name, String surname, int age, BigDecimal salary, int expirience) {
        this.teachersList.add(new Teacher(name, surname, age, salary, expirience));
    }

    public int getTeacherCount() {
        return this.teachersList.size();
    }

    public String getName() {
        return name;
    }
}
