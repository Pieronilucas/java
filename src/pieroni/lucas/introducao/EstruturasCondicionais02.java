package pieroni.lucas.introducao;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 35;
        String categoria;
        if (idade < 15) {
            categoria = "Infantil";
        }else if (idade >= 15 && idade < 18) {
            categoria = "Junior";
        }else{
            categoria = "Adulto";
        }
        double salario = 6000;
        String resultado = salario > 5000 ? "vou doar" : "não vou doar";
        System.out.println(resultado);
    }

}
