package StackQueueDequeue;

import java.util.Queue;
import java.util.ArrayDeque;

/*
В исходную строку добавили некоторое
количество символов. Необходимо выявить,
была ли строка a исходной для строки b
 */

public class IsSubsequence {

    // Временная сложность O(a.size() + b.size())
    // Пространственная сложность O(a.size())
    public static boolean isSubsequence(String a, String b) {
        Queue<Character> q = new ArrayDeque<>();
        for (Character el : a.toCharArray()) {
            q.add(el);
        }
        for (Character el : b.toCharArray()) {
            if (q.peek() == el) {
                q.poll();
            }
        }
        return q.isEmpty();
    }

    // В случае равенства элементов под индексами i и j мы двигаем оба указателя.
    //В противном случае только j
    public static boolean isSubsequenceTwoPointers(String a, String b) {
        int i = 0;
        int j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i += 1;
            }
            j += 1;
        }
        return i == a.length();
    }

    public static void main(String[] args) {

    }
}
