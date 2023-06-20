package formula;

public class VariableX implements Formula{
    /**
     * Compute the value of the formula
     *
     * @param xValue the value of the variable x
     * @return the value of the function when the variable x has value {@code xValue}
     */
    @Override
    public double eval(double xValue) {
        return xValue;
    }

    /**
     * Compute the derivative of the formula.
     *
     * @return derivative of the formula
     */
    @Override
    public Formula derivative() {
        return new Constant(1.0);
    }

    @Override
    public String toString() {
        return "x";
    }
}
