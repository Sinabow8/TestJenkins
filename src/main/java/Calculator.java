public class Calculator extends ArithmeticException{
    public int sum(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Divisor equals zero.");
        } else{
            return a / b;
        }
    }
}
