package pieroni.lucas.javacore.Associacao.domain;

public class Student {
    private String name;
    private int age;
    private Seminary seminary;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Seminary seminary) {
        this.name = name;
        this.age = age;
        this.seminary = seminary;
    }

    public Seminary getSeminary() {
        return seminary;
    }

    public void setSeminary(Seminary seminary) {
        this.seminary = seminary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
