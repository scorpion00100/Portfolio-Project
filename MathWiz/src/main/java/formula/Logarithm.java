package formula;

public class Logarithm extends UnaryOperator{
    public Logarithm(Formula member) {
        super(member, "log");
    }

    /**
     * Compute the derivative of the formula.
     *
     * @return derivative of the formula
     */
    @Override
    public Formula derivative() {
        return new Division(member.derivative(),member);
    }

    @Override
    protected double compute(double xValue) {
        return Math.log(xValue);
    }
}
