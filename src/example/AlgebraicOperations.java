package example;

public class AlgebraicOperations {

    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static int factorial(int n) {
        int result = n;
        for (int i = 2; i < n; i++) {
            result *= i;
        }
        return result;
    }

//    Main
    public static void main(String[] args) {
        int[] numbers = { 9, 2, 3, 18 };
        int result = sum(numbers);
        System.out.println(result);
        
        int num = 6;
        int result2 = factorial(num);
        System.out.println(result2);
    }
}
