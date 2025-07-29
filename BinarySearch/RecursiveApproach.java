package BinarySearch;

public class RecursiveApproach {

    public static int binarySearchRec(int[] data, int target) {
        int left = 0;
        int right = data.length - 1;
        if (target < data[left] || target > data[right]) {
            return -1;
        }
        return binarySearch(data, left, right, target);
    }

    public static int binarySearch(int[] data, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (data[middle] == target) {
            return middle;
        }
        if (data[middle] > target) {
            return binarySearch(data, left, middle - 1, target);
        } else {
            return binarySearch(data, middle + 1, right, target);
        }
    }

    public static void main(String[] args) {

    }
}
