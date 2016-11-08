package is.kata.closure;

/**
 * Created by usuario on 08/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        new Calculator().print(new Calculator.Operation() {
            @Override
            public double calculate(double value) {
                return xxx(value);
            }
        });
//        new Calculator().print(Main::xxx);
//        new Main().start();
    }

//    private void start() {
//        new Calculator().print(this::xxx);
//    }

     static double xxx(double value){
        return value * 2;
    }
}
