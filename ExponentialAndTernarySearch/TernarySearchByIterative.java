package ExponentialAndTernarySearch;

public class TernarySearchByIterative {

    public static int ternarySearch(int[] data, int target) {
        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            int m1 = left + (right - left) / 3;
            int m2 = right - (right - left) / 3;

            if (data[m1] == target) {
                return m1;
            }

            if (data[m2] == target) {
                return m2;
            }

            if (target < data[m1]) {
                right = m1 - 1;
            } else if (target > data[m2]) {
                left = m2 + 1;
            } else {
                left = m1 + 1;
                right = m2 - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(ternarySearch(new int[]{3, 8, 9, 11, 12, 16, 18, 19, 21, 24, 27, 29}, 16));
    }
}
