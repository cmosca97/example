package example;

public class Contatore {

// (1)    array di stringhe
//    for
    public static int countLen3(String[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 3) {
                result += 1;
            }
        }
        return result;
    }

//    for each
    public static int countLen3b(String[] array) {
        int result = 0;
        for (String s : array) {
            if (s.length() == 3) {
                result += 1;
            }
        }
        return result;
    }

    public static int countEquals(String[] array, String target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                count++;
            }
        }
        return count;
    }

// (2)   array di interi
    public static int countEven(int[] array) {
        int evenNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNum++;
            }
        }
        return evenNum;
    }

//    Main
    public static void main(String[] args) {
        String[] names = { "Harry", "Bob", "Tom", "Alice", "Anna" };
        int count = countLen3b(names);
        System.out.println(count);

        String target = "Anna";
        int count3 = countEquals(names, target);
        System.out.println(count3);

        int[] numbers = { 1, 8, 3, 4, 0, 2, 4 };
        int count2 = countEven(numbers);
        System.out.println(count2);
    }
}
