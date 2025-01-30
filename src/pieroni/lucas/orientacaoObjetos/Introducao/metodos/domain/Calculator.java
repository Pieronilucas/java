package pieroni.lucas.orientacaoObjetos.Introducao.metodos.domain;

public class Calculator {
    // deve conter modificador de acesso
    // void é para metodos que não retornam nada
    public void twoNumbersSum() {
        System.out.println(10 + 10);
    }

    public void twoNumbersSubtract() {
        System.out.println(20 - 10);
    }

    public void twoNumbersMultiply(int num, int num2) {
        System.out.println(num * num2);
    }

    public double twoNumbersDivide(double num, double num2) {
        if (num == 0 || num2 == 0) {
            return 0;
        }
        return num / num2;
    }

    public void sumArray(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
    }
    public void sumVarArgs(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
    }
}
