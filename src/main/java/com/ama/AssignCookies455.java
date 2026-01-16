package com.ama;

import java.util.Arrays;

public class AssignCookies455 {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1, 1, 3}, new int[]{2}));
    }

    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int left_ptr = 0;
        int right_ptr = 0;

        while (left_ptr < g.length && right_ptr < s.length) {
            if (g[left_ptr] <= s[right_ptr]) {
                left_ptr++;
                right_ptr++;
            } else {
                right_ptr++;
            }
        }

        return left_ptr;
    }
}
