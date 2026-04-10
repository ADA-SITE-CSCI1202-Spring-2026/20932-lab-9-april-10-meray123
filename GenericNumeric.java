public class GenericNumeric<T extends Number> {

    private T num;

    public GenericNumeric(T num) {
        this.num = num;
    }

    public double reciprocal() {
        return 1.0 / num.doubleValue();
    }

    public double fractionalPart() {
        double value = num.doubleValue();
        return value - Math.floor(value);
    }

    public boolean absEqual(GenericNumeric<?> other) {
        return Math.abs(this.num.doubleValue()) ==
               Math.abs(other.num.doubleValue());
    }

    public static void main(String[] args) {
        GenericNumeric<Double> num1 = new GenericNumeric<>(9.76);
        GenericNumeric<Float> num2 = new GenericNumeric<>(-9.76f);

        System.out.println(num1.reciprocal());
        System.out.println(num1.fractionalPart());
        System.out.println(num1.absEqual(num2));
    }
}