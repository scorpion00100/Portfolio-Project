package formula;

public class Power implements Formula {
    private final Formula base;
    private final Formula exponent;

    public Power(Formula base, Formula exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public double eval(double xValue) {
        return Math.pow(base.eval(xValue), exponent.eval(xValue));
    }

    @Override
    public String toString() {
        return "(" + base.toString() + " ^ " + exponent.toString() + ")";
    }

    @Override
    public Formula derivative() {
        Formula baseDerivative = base.derivative();
        return new Multiplication(new Multiplication(exponent, new Power(base, new Subtraction(exponent, new Constant(1)))), baseDerivative);
    }
}

