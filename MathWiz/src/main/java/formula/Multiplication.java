package formula;

public class Multiplication extends BinaryOperator{


    public Multiplication(Formula leftMember, Formula rightMember) {
        super(leftMember, rightMember, "*");
    }

    @Override
    protected double compute(double leftValue, double rightValue) {
        return leftValue * rightValue;
    }

    /**
     * Compute the derivative of the formula.
     *
     * @return the derivative of the formula
     */
    @Override
    public Formula derivative() {
        return new Addition(new Multiplication(leftMember,rightMember.derivative()),
                new Multiplication(leftMember.derivative(),rightMember));
    }
}
