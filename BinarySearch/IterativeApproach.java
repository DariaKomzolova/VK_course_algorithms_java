package BinarySearch;

public class IterativeApproach {

    public static int binarySearch(int[] data, int target) {
        int left = 0;
        int right = data.length - 1;

        if (target < data[left] || target > data[right]) {
            return -1;
        }

        while (left <= right) {
            int middle = (left + right) / 2;
            if (target == data[middle]) {
                return middle;
            }
            if (target < data[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
