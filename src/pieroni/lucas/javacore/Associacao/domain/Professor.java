package pieroni.lucas.javacore.Associacao.domain;

public class Professor {
    private String name;
    private String specialization;
    private Seminary[] seminaries;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String specialization) {
        this.specialization = specialization;
        this.name = name;
    }

    public Professor(String name, String specialization, Seminary[] seminaries) {
        this.name = name;
        this.specialization = specialization;
        this.seminaries = seminaries;
    }

    public void print() {
        System.out.println("Professor: " + name + "\nSpecialization: " + specialization);
        if (this.seminaries == null) {
            return;
        }
        System.out.print("Seminaries: ");
        for (Seminary seminary : seminaries) {
            System.out.println(seminary.getTitle() + "; ");
            System.out.println("Address: " + seminary.getLocal().getAddress());
            if (seminary.getStudents() == null || seminary.getStudents().length == 0) continue;
            System.out.println("Students: ");
            for (Student student : seminary.getStudents()) {
                System.out.println(student.getName() + "\nAge: " + student.getAge());
            }
        }
    }

    public Seminary[] getSeminaries() {
        return seminaries;
    }

    public void setSeminaries(Seminary[] seminaries) {
        this.seminaries = seminaries;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
