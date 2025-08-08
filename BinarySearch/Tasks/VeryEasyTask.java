package BinarySearch.Tasks;

/*
Сегодня утром жюри решило добавить в вариант олимпиады ещё одну «очень лёгкую» задачу.

Ответственный секретарь оргкомитета напечатал её условие в одном экземпляре, и теперь ему
нужно до начала олимпиады успеть сделать ещё N копий.

В его распоряжении имеются два ксерокса, один из которых копирует лист за X минут, а другой — за Y.
Разрешается использовать как один ксерокс, так и оба одновременно. Можно копировать не только с оригинала, но и с копии.

Помогите ему выяснить, какое минимальное время для этого потребуется.
 */

public class VeryEasyTask {

    public static int copyTime(int n, int x, int y) {
        int left = 0;
        int right = (n - 1) * Math.max(x, y);

        while (left + 1 < right) {
            int middle = (left + right) / 2;
            if ((middle / x + middle / y) < n - 1) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return right + Math.min(x, y);
    }

    public static void main(String[] args) {

    }
}
