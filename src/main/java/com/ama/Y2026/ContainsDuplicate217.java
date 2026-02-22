package com.ama.Y2026;

import java.util.HashSet;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        System.out.println(containsduplicate(new int[] {1, 2, 3}));
    }

    public static boolean containsduplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : nums) {
            if (!hashSet.add(i)) return true;
        }

        return false;
    }
}
