package example;

public class BinarySearch {
    public static int binary(int[] array, int target) {
        return binary(array, 0, array.length - 1, target);
    }

    public static int binary(int[] array, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left)/2;
        if (array[mid] == target) {
            return mid;
        } else if(array[mid]< target) {
            return binary(array, mid + 1, right, target);         
        } else {
            return binary(array, left, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] array = { -7, 2, 3, 5, 6, 7, 9, 12 };
        int pos = binary(array, 7);
        System.out.println(pos);
    }
}
