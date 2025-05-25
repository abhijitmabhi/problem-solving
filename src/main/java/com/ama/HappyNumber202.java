package com.ama;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HappyNumber202 {
    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
    }

    private static boolean isHappyNumber(int n) {
        HashSet<Integer> track = new HashSet<>();

        while (!track.contains(n)) {
            track.add(n);

            List<Integer> nums = getNumList(n);

            long sum = 0;
            for (int i : nums) {
                sum += (long) i * i;
            }

            if (sum == 1) {
                return true;
            }

            n = (int) sum;
        }

        return false;
    }

    private static List<Integer> getNumList(int n) {
        List<Integer> nums = new ArrayList<>();

        while (n > 0) {
            nums.add(n % 10);
            n /= 10;
        }

        return nums;
    }
}
