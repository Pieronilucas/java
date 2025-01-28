package pieroni.lucas.introducao;

import java.util.Scanner;

public class ExercicioSwitchCase {
    public static void main(String[] args) {
        System.out.println("Insira o dia da semana: ");
        Scanner scanner = new Scanner(System.in);
        byte diaSemana = scanner.nextByte();
        switch (diaSemana) {
            case 1, 7:
                System.out.println("Fim de semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("dia útil");
                break;
            default:
                System.out.println("Erro");
        }
    }
}
