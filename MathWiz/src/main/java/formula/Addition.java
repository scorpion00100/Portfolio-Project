package formula;

public class Addition extends BinaryOperator{


    public Addition(Formula leftMember, Formula rightMember) {
        super(leftMember,rightMember,"+");
    }


    /**
     * Compute the derivative of the formula.
     *
     * @return the derivative of the formula
     */
    @Override
    public Formula derivative() {
        return new Addition(leftMember.derivative(),rightMember.derivative());
    }


    @Override
    protected double compute(double leftValue, double rightValue) {
        return leftValue + rightValue;
    }
}
