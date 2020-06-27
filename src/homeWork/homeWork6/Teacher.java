package homeWork.homeWork6;

import java.math.BigDecimal;

public class Teacher extends HumanResources {
    private BigDecimal salary;
    private int experience;

    Teacher(String name, String surname, int age, BigDecimal salary, int experience) {
        super(name, surname, age);
        this.salary = salary;
        this.experience = experience;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
