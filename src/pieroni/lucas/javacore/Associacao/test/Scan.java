package pieroni.lucas.javacore.Associacao.test;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = input.nextLine();
        System.out.println("Your age: ");
        int age = input.nextInt();
        System.out.println("Your gender: ");
        char gender = input.next().charAt(0);

        System.out.println("your name is " + name + " and your age is " + age + " and gender is " + gender);
    }
}
