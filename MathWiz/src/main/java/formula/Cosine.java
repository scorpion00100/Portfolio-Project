package formula;

public class Cosine extends UnaryOperator{

    public Cosine(Formula member) {
        super(member, "cos");
    }

    /**
     * Compute the derivative of the formula.
     *
     * @return derivative of the formula
     */
    @Override
    public Formula derivative() {
        return new Opposite(new Multiplication(member.derivative(), new Sine(member)));
    }

    @Override
    protected double compute(double xValue) {
        return Math.cos(xValue);
    }
}
