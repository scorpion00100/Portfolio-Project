package formula;

public class Opposite extends UnaryOperator {

    public Opposite(Formula member) {
        super(member, "-");
    }

    /**
     * Compute the derivative of the formula.
     *
     * @return derivative of the formula
     */
    @Override
    public Formula derivative() {
        return new Opposite(member.derivative());
    }

    @Override
    protected double compute(double xValue) {
        return -1 * xValue;
    }
}
