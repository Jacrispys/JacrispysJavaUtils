package utils;

import java.util.*;

public class CollectionUtils {

    public static <S, T extends Collection<S>> Set<S> findMode(T entry) {
        Map<S, Integer> entryMap = new HashMap<>();
        entry.forEach(vara -> entryMap.merge(vara, 1, Integer::sum));
        Set<S> set = new HashSet<>();
        int highestValue = Collections.max(entryMap.entrySet(), Map.Entry.comparingByValue()).getValue();
        do {
            Map.Entry<S, Integer> mapEntry = Collections.max(entryMap.entrySet(), Map.Entry.comparingByValue());
            if (mapEntry.getValue() == highestValue) {
                set.add(mapEntry.getKey());
            }
            entryMap.remove(mapEntry.getKey());
        } while (!entryMap.isEmpty());
        return set;
    }

    public static <T extends CharSequence> Set<Character> findMode(T entry) {
        Map<Character, Integer> entryMap = new HashMap<>();
        entry.chars().forEach(vara -> entryMap.merge((char) vara, 1, Integer::sum));
        Set<Character> set = new HashSet<>();
        int highestValue = Collections.max(entryMap.entrySet(), Map.Entry.comparingByValue()).getValue();
        do {
            Map.Entry<Character, Integer> mapEntry = Collections.max(entryMap.entrySet(), Map.Entry.comparingByValue());
            if (mapEntry.getValue() == highestValue) {
                set.add(mapEntry.getKey());
            }
            entryMap.remove(mapEntry.getKey());
        } while (!entryMap.isEmpty());
        return set;
    }


}
