package pieroni.lucas.javacore.metodos.test;

import pieroni.lucas.javacore.metodos.domain.Calculator;

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

        int[] numbers = {1, 2, 3, 4, 5, 6};
        calc.sumArray(numbers);
        calc.sumVarArgs(1, 2, 3, 4, 5, 6);
    }

}
