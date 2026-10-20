package com.ama.remind;

public class SecondLargestDigitInAString1796 {
    public static void main(String[] args) {
        System.out.println(secondLargest("fffs077"));
    }

    // Time: O(n)
    // Space: O(1)
    public static int secondLargest(String s) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int curNUm = Character.getNumericValue(c);
                if (curNUm > largest) {
                    secondLargest = largest;
                    largest = curNUm;
                } else if (curNUm > secondLargest && curNUm != largest) {
                    secondLargest = curNUm;
                }
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
