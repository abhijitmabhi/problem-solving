package com.ama;

enum stacks {
    STANDARD,
    SPECIAL,
    REJECTED
}

public class AutomatedFactory {
    public static void main(String[] args) {
        System.out.println(solve(288, 44,5,8.9));
    }

    private static String solve(double width, double height, double length, double mass) {
        double volume = width * height * length;
        boolean isBulky = volume >= 1_000_000 || width >= 100 || height >= 100 || length >= 100;
        boolean isHeavy = mass >= 20;

        if (isBulky && isHeavy) {
            return stacks.REJECTED.name();
        } else if (isBulky || isHeavy) {
            return stacks.SPECIAL.name();
        } else {
            return stacks.STANDARD.name();
        }
    }
}
