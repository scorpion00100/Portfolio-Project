package formula;

public  abstract class BinaryOperator implements Formula {

    protected final Formula leftMember;
    protected final Formula rightMember;
    private final String operatorSymbol;

    public BinaryOperator(Formula leftMember, Formula rightMember, String operatorSymbol) {
        this.leftMember = leftMember;
        this.rightMember = rightMember;
        this.operatorSymbol = operatorSymbol;
    }


    /**
     * Compute the value of the formula
     *
     * @param xValue the value of the variable x
     * @return the value of the function when the variable x has value {@code xValue}
     */
    @Override
    public double eval(double xValue) {
        return compute(leftMember.eval(xValue),rightMember.eval(xValue));
    }


    @Override
    public String toString() {
        return "(" + leftMember + " " + operatorSymbol + " " + rightMember +")";
    }

    protected abstract double compute(double leftValue, double rightValue);
}
