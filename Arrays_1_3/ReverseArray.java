package Arrays_1_3;

/*
Дано:
массив целых чисел

Задача:
развернуть массив, то есть вывести его в обратном порядке

Ограничение:
линейное время без дополнительных аллокаций памяти
 */

public class ReverseArray {

    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left != right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
