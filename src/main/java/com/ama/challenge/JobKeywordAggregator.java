package com.ama.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class JobKeywordAggregator {
    public List<String> getTopKKeywords(List<String> jobDescriptions, Set<String> keywordDictionary, int k) {
        Map<String, Integer> keyMap = new ConcurrentHashMap<>();


        for (String description : jobDescriptions) {
            var words = description.toLowerCase().split("[^A-Za-z]+");

            for (String word : words) {
                if (keywordDictionary.contains(word)) {
                    keyMap.compute(word, (key, currentCount) -> currentCount == null ? 1 : currentCount + 1);
                }
            }
        }

        Queue<String> maxHeap = new PriorityQueue<>((a, b) -> {
            int freCompare = Integer.compare(keyMap.get(b), keyMap.get(a));

            if (freCompare != 0) {
                return freCompare;
            }

            return a.compareTo(b);
        });

        maxHeap.addAll(keyMap.keySet());

        List<String> result = new ArrayList<>();

        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            result.add(maxHeap.poll());
        }

        return result;
    }
}
