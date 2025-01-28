package pieroni.lucas.introducao;

public class Operadores {
    public static void main(String[] args) {
        // aritmeticos: + - / *
        int num = 10;
        int num2 = 20;
        double resultado = num / num2;
        System.out.println(resultado);

        // relacionais: % < > <= >= == !=
        int resto = 21 % 7;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgual = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10.0;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgual);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        // lógicos: && (AND) || (or) ! (Not)
        int age = 29;
        float salary = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = salary >= 3581;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 25000;
        float valorPS5 = 500F;
        boolean isPS5Compravel = valorTotalContaCorrente > valorTotalContaPoupanca || valorTotalContaPoupanca > valorPS5;
        System.out.println(isPS5Compravel);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(++contador2);


    }
}
