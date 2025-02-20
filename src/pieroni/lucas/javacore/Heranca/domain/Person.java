package pieroni.lucas.javacore.Heranca.domain;

public class Person {
    private String name;
    private String cpf;
    private Adress adress;

    public Person(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Adress: " + this.adress.getStreet() + " " + this.adress.getZipCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
