package ExponentialAndTernarySearch;

public class ExponentialSearch {

    public static Tuple2<Integer, Integer> exponentialSearch(int[] data, int target) {
        int border = 1;
        int lastElement = data.length - 1;

        while (border < lastElement && data[border] < target) {
            if (data[border] == target) {
                return new Tuple2<Integer, Integer>(border, border * 2);
            }
            border = border * 2;

            if (border > lastElement) {
                return new Tuple2<Integer, Integer>(border / 2, lastElement);
            }
        }

        return new Tuple2<Integer, Integer>(border / 2, border);
    }

    public static void main(String[] args) {
        exponentialSearch(new int[]{2, 7, 8, 9, 11, 12, 16, 21, 24, 27, 31, 33}, 21).pr();
    }
}

class Tuple2<A, B> {
    public final A first;
    public final B second;

    public Tuple2(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public void pr() {
        System.out.println(first + " " + second);
    }
}
