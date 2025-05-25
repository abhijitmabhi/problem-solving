package com.ama;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HappyNumber202 {
    public static void main(String[] args) {
        System.out.println(isHappyNumber(2));
    }

    private static boolean isHappyNumber(int n) {
        boolean happyNumber = false;
        HashSet<Integer> track = new HashSet<>();

        while (!happyNumber) {

            if (track.contains(n)) {
                return false;
            }
            track.add(n);

            List<Integer> nums = getNumList(n);

            long sum = 0;
            for (int i : nums) {
                sum += (long) i * i;
            }

            if (sum >= Integer.MAX_VALUE) {
                return false;
            }

            if (sum == 1) {
                happyNumber = true;
            }

            nums.clear();
            n = (int) sum;
        }

        return happyNumber;
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
