package example;

public class Contatore {
    public static int countLen3(String[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 3) {
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] names = { "Harry", "Bob", "Tom", "Alice", "Anna" };
        int count = countLen3(names);
        System.out.println(count);
    }
}
