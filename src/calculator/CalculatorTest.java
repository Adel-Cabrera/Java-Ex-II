package calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperandOne(10.5);
        calculator.setOperation("+");
        calculator.setOperandTwo(5.2);
        calculator.performOperation();
        calculator.getResults();

        calculator.setOperandOne(17.3);
        calculator.setOperation("/");
        calculator.setOperandTwo(3.1415);
        calculator.performOperation();
        calculator.getResults();

    }
}
