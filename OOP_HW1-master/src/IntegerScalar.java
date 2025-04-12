public class IntegerScalar implements Scalar {
    private int number;

    public IntegerScalar(int number) {
        this.number = number;
    }

    public String toString() {
        return "" + number;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public IntegerScalar add(Scalar s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public IntegerScalar mul(Scalar s) {
        return null;
    }

    /**
     * @return (- 1)*number
     */
    @Override
    public IntegerScalar neg() {
        return new IntegerScalar(-number);
    }

    /**
     * @param exponent the exponent value for number^exponent
     * @return number^exponent
     */
    @Override
    public IntegerScalar power(int exponent) {
        int res = number;
        for (int i = 1; i < exponent; i++) {
            res *= number;
        }
        return new IntegerScalar(res);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IntegerScalar) {
            return ((IntegerScalar) obj).number == number;
        }
        return false;
    }

    /**
     * @return
     */
    @Override
    public int sign() {
        return number == 0 ? 0 : (number > 0 ? 1 : -1);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
