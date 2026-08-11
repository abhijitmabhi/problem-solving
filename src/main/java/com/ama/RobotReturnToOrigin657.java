package com.ama;

import java.util.HashMap;

public class RobotReturnToOrigin657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LL"));
    }

    public static boolean judgeCircle(String moves) {
        HashMap<Character, Integer> myHash = new HashMap<>();
        myHash.put('U', 0);
        myHash.put('D', 0);
        myHash.put('L', 0);
        myHash.put('R', 0);

        for (int i = 0; i < moves.length(); i++) {
            myHash.put(moves.charAt(i), myHash.getOrDefault(moves.charAt(i), 0) + 1);
        }

        return myHash.get('U').equals(myHash.get('D')) && myHash.get('L').equals(myHash.get('R'));
    }
}
