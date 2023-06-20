package formula;

public class Subtraction extends BinaryOperator {


    public Subtraction(Formula leftMember, Formula rightMember) {
        super(leftMember, rightMember, "-");
    }

    @Override
    protected double compute(double leftValue, double rightValue) {
        return leftValue - rightValue;
    }

    /**
     * Compute the derivative of the formula.
     *
     * @return derivative of the formula
     */
    @Override
    public Formula derivative() {
        return new Subtraction(leftMember.derivative(), rightMember.derivative());
    }
}
