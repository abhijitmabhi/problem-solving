package com.ama;

import java.util.*;

public class NumberOfStudentsUnableToEatLunch1700 {
    public static void main(String[] args) {
        System.out.println(countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1}));
    }

    private static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();

        for (int i : students) {
            q.add(i);
        }

        Stack<Integer> s = new Stack<>();

        for (int i = sandwiches.length - 1; i >= 0; i--) {
            s.push(sandwiches[i]);
        }

        int count = 0;

        while (!q.isEmpty() && count != q.size()) {
            if (Objects.equals(s.peek(), q.peek())) {
                s.pop();
                q.poll();
                count = 0;
            } else {
                q.add(q.poll());
                count++;
            }
        }

        return q.size();
    }
}
