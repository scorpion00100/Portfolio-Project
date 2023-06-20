package formula;

public class Sine extends UnaryOperator {

    public Sine(Formula member) {
        super(member,"sin");
    }

    /**
     * Compute the derivative of the formula.
     *
     * @return derivative of the formula
     */
    @Override
    public Formula derivative() {
        return new Multiplication(member.derivative(),new Cosine(member));
    }

    @Override
    protected double compute(double xValue) {
        return Math.sin(xValue);
    }
}
