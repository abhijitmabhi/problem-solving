package com.ama;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();

        if(digits.isEmpty()){
            return result;
        }

        HashMap<Integer,String> letterMappings = new HashMap<>();
        letterMappings.put(2,"abc");
        letterMappings.put(3,"def");
        letterMappings.put(4,"ghi");
        letterMappings.put(5,"jkl");
        letterMappings.put(6,"mno");
        letterMappings.put(7,"pqrs");
        letterMappings.put(8,"tuv");
        letterMappings.put(9,"wxyz");

        backtracking(result, 0, new StringBuilder(),  letterMappings, digits);

        return result;
    }

    private static void backtracking(List<String> result, int index, StringBuilder current, HashMap<Integer,String> letterMappings, String digits) {
        if(index == digits.length()){
            result.add(current.toString());
            return;
        }

        String letters = letterMappings.get(Character.getNumericValue(digits.charAt(index)));

        for (char letter : letters.toCharArray()){
            current.append(letter);
            backtracking(result, index+1, current, letterMappings, digits);
            current.deleteCharAt(current.length() -1);
        }
    }

}
