package com.ama;

public class ShortestDistanceToTargetStringInACircularArray2515 {
    public static void main(String[] args) {
        System.out.println(
                shortestDistance(new String[] {"practice", "makes", "perfect", "coding", "makes"}, "coding", 0));
    }

    public static int shortestDistance(String[] words, String target, int startIndex) {
        int circularDistance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                int distance = Math.abs(i - startIndex);
                circularDistance = Math.min(circularDistance, Math.min(distance, words.length - distance));
            }
        }

        return circularDistance == Integer.MAX_VALUE ? -1 : circularDistance;
    }
}
