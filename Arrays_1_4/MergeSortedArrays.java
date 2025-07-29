package Arrays_1_4;

/*
Дано:
два отсортированных по возрастанию массива.

Необходимо написать функцию, которая объединит эти два массива в третий.
Получившийся в итоге массив тоже должен быть отсортирован по возрастанию.
 */

import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] merge_sorted_arrays(int[] arr1, int[] arr2) {
        int[] mergedArrays = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArrays[k] = arr1[i];
                i += 1;
                k += 1;
            } else {
                mergedArrays[k] = arr2[j];
                j += 1;
                k += 1;
            }
        }
        // Добавляем оставшиеся элементы из arr1
        while (i < arr1.length) {
            mergedArrays[k] = arr1[i];
            i += 1;
            k += 1;
        }
        // Добавляем оставшиеся элементы из arr2
        while (j < arr2.length) {
            mergedArrays[k] = arr2[j];
            j += 1;
            k += 1;
        }
        return mergedArrays;
    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(merge_sorted_arrays(new int[]{1, 4, 9}, new int[]{2, 3, 10})));

    }
}
