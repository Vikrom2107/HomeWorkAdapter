package ru.netology;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        double value = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int) Math.round(value);
    }
    @Override
    public int sub(int arg0, int arg1) {
        double value = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUB)
                .result();
        return (int) Math.round(value);
    }

    @Override
    public int mult(int arg0, int arg1) {
        double value = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return (int) Math.round(value);
    }
    @Override
    public int div(int arg0, int arg1) {
        double value = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.DIV)
                .result();
        return (int) Math.round(value);
    }
    @Override
    public int pow(int a, int b) {
        double value = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return (int) Math.round(value);
    }
}
