package ExponentialAndTernarySearch;

public class TernarySearchByRecursion {

    public static int ternarySearch(int[] data, int left, int right, int target) {
        if (right >= left) {
            int m1 = left + (right - left) / 3;
            int m2 = right - (right - left) / 3;

            if (data[m1] == target) {
                return m1;
            }

            if (data[m2] == target) {
                return m2;
            }

            if (target < data[m1]) {
                return ternarySearch(data, left, m1 - 1, target);
            } else if (target > data[m2]) {
                return ternarySearch(data, m2 + 1, right, target);
            } else {
                return ternarySearch(data, m1 + 1, m2 - 1, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(ternarySearch(new int[]{3, 8, 9, 11, 12, 16, 18, 19, 21, 24, 27, 29}, 0, 11, 16));
    }
}
