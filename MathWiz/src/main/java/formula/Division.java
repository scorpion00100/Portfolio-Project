package formula;

public class Division extends BinaryOperator{

    public Division(Formula leftMember, Formula rightMember) {
        super(leftMember, rightMember, "/");
    }

    @Override
    protected double compute(double leftValue, double rightValue) {
        return leftValue / rightValue;
    }

    /**
     * Compute the derivative of the formula.
     *
     * @return the derivative of the formula
     */
    @Override
    public Formula derivative() {
        return new Division( new Subtraction(new Multiplication(leftMember.derivative(), rightMember),
                new Multiplication(leftMember, rightMember.derivative())),
                new Multiplication(rightMember, rightMember));
    }
}
