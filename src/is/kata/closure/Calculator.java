package is.kata.closure;

public class Calculator {
    public void print(Operation operation){
        System.out.println(operation.calculate(5));
    }

    @FunctionalInterface
    public interface Operation {
        double calculate(double value);
    }
}
