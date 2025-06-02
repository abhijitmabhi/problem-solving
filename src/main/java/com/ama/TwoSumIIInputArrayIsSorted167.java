package com.ama;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumIIInputArrayIsSorted167 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumII2(new int[]{2, 7, 11, 15}, 9)));
    }

    private static int[] twoSumII(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int num = target - numbers[i];

            if (!hashMap.containsKey(num)) {
                hashMap.put(numbers[i], i);
            } else {
                return new int[]{hashMap.get(num) + 1, i + 1};
            }
        }

        return new int[]{};

        // Time: O(N)
        // Space: O(N)

        // To_Do
        //*Not considering non-decreasing array inputs
        // use two pinters to overcome this issue
    }

    private static int[] twoSumII2(int[] numbers, int target) {
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {
            int sum = numbers[first] + numbers[last];

            if (sum == target) {
                return new int[]{first + 1, last + 1};
            } else if (sum < target) {
                first++;
            } else {
                last--;
            }
        }

        return new int[]{};

    }
}
