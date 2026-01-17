package com.ama;

import java.util.HashMap;

public class FurthestPointFromOrigin2833 {
    public static void main(String[] args) {
        System.out.println(furthestDistanceFromOrigin("R"));
    }

    public static int furthestDistanceFromOrigin(String moves) {
        HashMap<Character, Integer> myHash = new HashMap<>();
        myHash.put('L', 0);
        myHash.put('R', 0);
        myHash.put('_', 0);

        for (int i = 0; i < moves.length(); i++) {
            myHash.put(moves.charAt(i), myHash.getOrDefault(moves.charAt(i), 0) + 1);
        }

        int result01 = myHash.get('L') - (myHash.get('R') + myHash.get('_'));
        int result02 = (myHash.get('L') + myHash.get('_')) - myHash.get('R');

        return Math.max(Math.abs(result01), Math.abs(result02));
    }
}
