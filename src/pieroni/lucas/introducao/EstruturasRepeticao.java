package pieroni.lucas.introducao;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println("while " + count);
            count++;
        }
        count = 0;
        do {
            System.out.println("do while " + count);
            count++;
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("for " + i);
        }
    }
}
