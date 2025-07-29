package StackQueueDequeue;

import java.util.ArrayDeque;
import java.util.Stack;
import java.util.Deque;

public class Palindrome {

    public static boolean isPalindrome (String s) {
        Stack<Character> stack = new Stack<>();
        for (Character el : s.toCharArray()) {
            stack.push(el);
        }
        for (Character el : s.toCharArray()) {
            if (el != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeDequeue (String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (Character el : s.toCharArray()) {
            deque.add(el);
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeTwoPointers (String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i != j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i += 1;
            j -= 1;
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
