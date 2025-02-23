public class FibonacciNumbers {
    public static void main(String[] args) {

        int number = 11;

        System.out.println(fibonacci(number));

    }
    private static int fibonacci(int n) {

        int result = 1;

        if (n < 0) {
            System.out.println("Зачем тебе число Фибоначчи из отрицательного числа?" );
            return 0;
        }
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return result;
        }

        result = fibonacci(n - 1) + fibonacci(n - 2);
        return result;
    }


}
