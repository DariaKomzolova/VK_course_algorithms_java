package BinarySearch.Tasks;

// бинарный поиск по ответу

/*
Задача:
Петя активно участвует во всех олимпиадах по математике и физике. Он накопил 9 дипломов,
которые лежали в столе, и он не знал, что с ними делать. И вот Петя решил разместить свои награды на квадратной доске.

Дано: 9 прямоугольных дипломов (3 × 4), которые надо разместить на квадратной поверхности.

Найти минимальную сторону квадрата для размещения всех дипломов.
 */

public class IssueOfDiplomas {

    public static int binarySearchDiplomas(int h, int w, int n) {
        int left = Math.max(w, h);
        int right = left * n;

        while (left + 1 < right) {
            int middle = (left + right) / 2;
            int res = (middle / w) * (middle / h);
            if (res < n) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(binarySearchDiplomas(3, 4, 9));
    }
}
