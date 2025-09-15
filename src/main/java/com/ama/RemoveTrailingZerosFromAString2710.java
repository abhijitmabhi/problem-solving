package com.ama;

public class RemoveTrailingZerosFromAString2710 {
    public static void main(String[] args) {
        System.out.println(removeTraillingZeros("15484601546000"));
    }

    private static String removeTraillingZeros(String num){
        int ptr = num.length() - 1;

        while (ptr >= 0) {
            if (num.charAt(ptr) == '0') {
                ptr--;
            } else {
                break;
            }
        }

        return num.substring(0, ptr + 1);
    }
}
