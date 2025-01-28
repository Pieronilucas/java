package pieroni.lucas.introducao;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        byte dia = 3;
        switch (dia) {
            default:
                System.out.println("dia inválido");
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            case 8:
                System.out.println("Domingo");
                break;

        }
        char sexo = 'M';
        switch (sexo) {
            default:
                System.out.println("entrada invalida");
                break;
            case 'M':
                System.out.println("masculino");
                break;
            case 'F':
                System.out.println("feminino");
        }
    }
}
