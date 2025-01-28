package pieroni.lucas.introducao;

public class Arrays {
    public static void main(String[] args) {
        /*
        os tipos padrão de arrays não iniciadas são:
        byte, short, int, long, float double = 0
        char = \ u0000 ou ''
        boolean = false
        String = null
         */
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        int[] num2 = {10, 20, 30};
        int[] num3 = new int[] {30, 20, 10};

        // iterando por cada index para imprimir
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }

        //foreach
        for (int numero : num3) {
            System.out.println(numero);
            /*
            por baixo dos panos seria algo como
            int numero = num3[0];
            System.out.println(numero)
            numero = num3[1]
            System.out.println(numero)
            numero = num3[2]
            System.out.println(numero)
             */
        }
    }

}
