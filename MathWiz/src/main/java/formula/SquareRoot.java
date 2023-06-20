package formula;

public class SquareRoot implements Formula {
    private final Formula value;

    public SquareRoot(Formula value) {
        this.value = value;
    }

    @Override
    public double eval(double xValue) {
        return Math.sqrt(value.eval(xValue));
    }

    @Override
    public String toString() {
        return "sqrt(" + value.toString() + ")";
    }

    @Override
    public Formula derivative() {
        // Calculating the derivative of a squareroot function requires the chain rule
        Formula derivativeValue = value.derivative();
        Formula denominator = new Multiplication(new Constant(2), new SquareRoot(value));
        return new Division(derivativeValue, denominator);
    }
}
