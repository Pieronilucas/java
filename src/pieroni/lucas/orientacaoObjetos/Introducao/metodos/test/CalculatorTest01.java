package pieroni.lucas.orientacaoObjetos.Introducao.metodos.test;

import pieroni.lucas.orientacaoObjetos.Introducao.metodos.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.twoNumbersSum();
        System.out.println("------------");
        calc.twoNumbersSubtract();
        System.out.println("------------");
        calc.twoNumbersMultiply(20, 30);
        System.out.println("------------");
        double result = calc.twoNumbersDivide(20, 0);
        System.out.println(result);
    }

}
