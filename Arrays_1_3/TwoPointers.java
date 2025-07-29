package Arrays_1_3;

/*
Дано:
1) массив целых чисел, отсортированных по возрастанию,
2) некоторое число sum.

Задача:
написать функцию, которая возвращает два числа из заданного массива, в сумме
дающие sum. Если таких двух чисел в массиве нет, должно возвращаться null.

Ограничение:
в массиве может быть только одна пара чисел, которая соответствует
условию.
 */

public class TwoPointers {

    public static int[] twoSum(int[] arr, int sum) {
        int left = 0;
        int right = arr.length - 1;
        while (left != right) {
            int temp = arr[left] + arr[right];
            if (temp == sum) {
                return new int[]{arr[left], arr[right]};
            }
            if (temp < sum) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
