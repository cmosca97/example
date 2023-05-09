package example;

public class Minimo {
    public static int min(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (result > numbers[i]) {
                result = numbers[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] values = { 3, 9, 1 };
        int result = min(values);
        System.out.println(result);
    }
}
