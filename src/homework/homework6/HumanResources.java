package homework.homework6;

abstract class HumanResources {
    private String name;
    private String surname;
    private int age;

    HumanResources(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {return this.name; }

    public void setName(String name) {this.name = name; }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
