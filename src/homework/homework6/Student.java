package homework.homework6;

import java.math.BigDecimal;

public class Student extends HumanResources {
    private BigDecimal averageGrade;
    private String specialization;

    public Student(String name, String surname, int age, BigDecimal averageGrade, String specialization) {
        super(name, surname, age);

        this.averageGrade = averageGrade;
        this.specialization = specialization;
    }

    public BigDecimal getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(BigDecimal averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
