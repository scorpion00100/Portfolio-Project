package formula;

public class Exponential extends UnaryOperator{
    public Exponential(Formula member) {
        super(member, "e^");
    }

    /**
     * Compute the derivative of the formula.
     *
     * @return derivative of the formula
     */
    @Override
    public Formula derivative() {
        return new Multiplication(member.derivative(), new Exponential(member));
    }

    @Override
    protected double compute(double xValue) {
        return Math.exp(xValue);
    }
}
