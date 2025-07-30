package BinarySearch.Tasks;

/*
Написать функцию, которая находит корень числа или ближайшее подходящее наименьшее целое число

Например: для 9 это будет 3.

Для 21 это будет 4.
5 не подойдёт, потому что квадрат 5 равен 25, что больше, чем 21.

 */

public class SqrtOfNumber {

    public static int binarySearchSQRT(int target) {
        int left = 0;
        int right = target;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (middle * middle > target) {
                right = middle - 1;
                continue;
            }
            if (middle * middle < target) {
                left = middle + 1;
                continue;
            }
            return middle;
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(binarySearchSQRT(9));
        System.out.println(binarySearchSQRT(21));
    }
}
