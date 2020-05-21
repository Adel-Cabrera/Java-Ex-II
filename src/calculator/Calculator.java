package calculator;

import java.io.Serializable;

public class Calculator implements Serializable {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;

    public void performOperation() {
        if (getOperation() == "+") {
            this.result = getOperandOne() + getOperandTwo();
        } else if (getOperation() == "-") {
            this.result = getOperandOne() - getOperandTwo();
        } else if (getOperation() == "*") {
            this.result = getOperandOne() * getOperandTwo();
        } else if (getOperation() == "/") {
            this.result = getOperandOne() / getOperandTwo();
        } else {
            System.err.println("ERROR");
        }
    }

    public void getResults() {
        System.out.println(this.result);
    }

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        if (operation == "+" || operation == "-" || operation == "*" || operation == "/") {
            this.operation = operation;
        } else {
            System.err.println("ERROR");
        }
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

}
