package formula;

public abstract class UnaryOperator implements Formula{

    private final String operatorSymbol;
    protected final Formula member;

    public UnaryOperator(Formula member, String operatorSymbol) {
        this.operatorSymbol = operatorSymbol;
        this.member = member;
    }

    /**
     * Compute the value of the formula
     *
     * @param xValue the value of the variable x
     * @return the value of the function when the variable x has value {@code xValue}
     */
    @Override
    public double eval(double xValue) {
        return compute(member.eval(xValue));
    }



    @Override
    public String toString(){
        return operatorSymbol + "(" + member + ")";
    }
    protected abstract double compute(double xValue);
}
