package pieroni.lucas.introducao;

public class EstruturasRepeticao02 {
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                System.out.println("fim do loop");
                break;
            }
            System.out.println(i);
        }
        double carValue = 35000;
        double installmentValue = 1000;
        int installments = 1;
        while (carValue / installments >= installmentValue) {
            System.out.println(installments);
            installments++;
        }
    }
}
