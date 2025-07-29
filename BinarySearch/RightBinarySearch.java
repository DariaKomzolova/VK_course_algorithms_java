package BinarySearch;

/*
Дано:
Необходимо в заданном массиве найти число 2, а точнее, самое первое вхождение

Решение:
Находим середину.
Если найденное значение эквивалентно искомому, то сдвигаем левую границу строго на индекс middle.

 */

public class RightBinarySearch {

    public static int rightBinarySearch(int[] data, int target) {
        int left = 0;
        int right = data.length - 1;

        while (left + 1 < right) {
            int middle = (left + right) / 2;
            if (data[middle] <= target) {
                left = middle;
            } else {
                right = middle;
            }
        }
        if (data[left] == target) {
            return left;
        }
        if (data[right] == target) {
            return right;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print(rightBinarySearch(new int[]{1, 2, 2, 2, 2, 5}, 2));
    }
}
