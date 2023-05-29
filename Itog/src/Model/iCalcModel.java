package Model;

public interface iCalcModel<T> {

    T add(T a, T b);

    T subtract(T a, T b);

    T multiply(T a, T b);

    T divide(T a, T b);
}
