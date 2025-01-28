package pieroni.lucas.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("autorizado comprar bebida");
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("não autorizado comprar bebida");
        }
        boolean c = false;
        if (c == true) {
            System.out.println("qualquer porra");
        }
        System.out.println("fora do if");
    }
}
