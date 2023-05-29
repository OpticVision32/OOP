package Model;

public class ComplexCalcModel implements iCalcModel<ComplexNumber> {

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {

        double resultA = (a.getA() + b.getA());
        double resultB = (a.getB() + b.getB());
        return new ComplexNumber(resultA, resultB);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {

        double denominator = Math.pow(b.getA(), 2) + Math.pow(b.getB(), 2);
        double resultA = (a.getA() * b.getA() + a.getB() * b.getB()) / denominator;
        double resultB = (a.getB() * b.getA() - a.getA() * b.getB()) / denominator;
        return new ComplexNumber(resultA, resultB);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {

        double resultA = (a.getA() * b.getA()) - (a.getB() * b.getB());
        double resultB = (a.getA() * b.getB()) + (a.getB() * b.getA());
        return new ComplexNumber(resultA, resultB);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {

        double resultA = (a.getA() - b.getA());
        double resultB = (a.getB() - b.getB());
        return new ComplexNumber(resultA, resultB);
    }
}
