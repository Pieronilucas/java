package pieroni.lucas.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, chat, byte, short, long, boolean
        int idade = 20;
        long numeroGrande = (long) 200000000.50; // casting is forcing a type to be another
        double salario = 20000.00;
        float salarioFloat = 20000.00f;
        byte idadeByte = 20;
        short idadeShort = 20;
        boolean verdadeiro = true;
        boolean falso = false;
        char sexo = 'M'; // can be put a number that will make a reference to a character to the ascii table or use unicode
        String nome ="Lucas Pieroni";

        System.out.println(idade);
        System.out.println(numeroGrande);
        System.out.println(falso);
        System.out.println(sexo);
        System.out.println("Nome: " + nome);

    }
}
