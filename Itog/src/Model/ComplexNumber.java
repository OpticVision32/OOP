package Model;

public class ComplexNumber {


    private double a;

    private double b;


    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public ComplexNumber(double c) {
        this(c, c);
    }


    public double getA() {
        return a;
    }

 
    public void setA(double a) {
        this.a = a;
    }

 
    public double getB() {
        return b;
    }


    public void setB(double b) {
        this.b = b;
    }

    private String numberToString(double x) {
        if (x == (int) x) {
            return Integer.toString((int) x);
        }
        return Double.toString(x);
    }

    @Override
    public String toString() {
        return String.format("(%s + %si)", this.numberToString(a), this.numberToString(b));
    }
}
