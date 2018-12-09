public interface Calculate<T> {

    T calculate();

    String interpret(double bmiResult);
}
