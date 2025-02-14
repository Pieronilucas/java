package pieroni.lucas.javacore.metodos.domain;

/* crie uma classe com 3 atributos: nome, idade e salário (devem ser guardados 3 salários).
 após isso, crie dois metodos: um deve imprimir os dados, o outro deve tirar a média dos salarios
 e imprimir o valor

 */

public class Exercicio {
    private String name;
    private int age;
    private double[] salary;
    private double average = 0;

    public void printData(){
        System.out.println("Nome: " + this.name);
        System.out.println("Age: " + this.age);
        if (salary == null) {
            return;
        }
        for (double v : salary) {
            System.out.print("R$" + v + "; ");
        }
        salaryAvarage();
    }
    public void salaryAvarage(){
        if (salary == null) {
            return;
        }

        for (double v : salary) {
            average += v;
        }
        average /= salary.length;
        System.out.println("Average: R$" + average);
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

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }
    public double getAverage() {
        return average;
    }
}
