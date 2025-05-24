package com.ama;

public class HammingDistance461 {
    public static void main(String[] args) {
        System.out.println(hamingDistance(3, 1));
    }

    private static int hamingDistance(int x, int y) {
        String xB = Integer.toBinaryString(x);
        String yB = Integer.toBinaryString(y);
        int count = 0;

        int m = xB.length() - 1;
        int n = yB.length() - 1;

        while (m >= 0 || n >= 0) {
            if(m < 0){
                while (n >= 0){
                    if(yB.charAt(n) == '1'){
                        count++;
                    }
                    n--;
                }
                break;
            }

            if(n < 0){
                while (m >= 0){
                    if(xB.charAt(m) == '1'){
                        count++;
                    }
                    m--;
                }
                break;
            }

            if (m >= 0 && n >= 0 && xB.charAt(m) !=  yB.charAt(n)) {
                count++;
            }
            m--;
            n--;
        }

        return count;
    }
}
