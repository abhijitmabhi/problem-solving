package com.ama.playground;

import java.util.HashSet;
import java.util.Set;

public class RemoveAdjacentPairs {
    private Set<String> set = new HashSet<>();

    RemoveAdjacentPairs(Set<String> set) {
        this.set = set;
    }

    public String removeAdjacentPairs(String s) {

        if ((s == null)) {
            throw new IllegalArgumentException("Invalid input");
        }

        if (s.length() < 2) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!sb.isEmpty() && isPair("" + sb.charAt(sb.length() - 1) + c)) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    private boolean isPair(String str) {
        return set.contains(str);
    }
}
