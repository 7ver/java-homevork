package homework.homework6;

import java.math.BigDecimal;

/**
 * For testing
 */
public class Main {
    public static void main(String[] args) {
        Kathedra cathedra = new Kathedra("Economic");
        University university = new University("OPG", "Bangkok");

        university.addCathedra("new");
        university.getCathedraList().get(0).addTeacher("123", "321", 21, new BigDecimal("21.23"), 5);

        System.out.println(cathedra.getName());
        System.out.println(university.getCathedraList().get(0).getTeachersList().get(0).getSalary());
    }
}
