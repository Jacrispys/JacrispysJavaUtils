package utils;

import java.io.Serializable;
import java.util.*;

public class CollectionUtils {

    public static <S, T extends Collection<S>> Set<S> findMode(T entry) {
        HashMap<S, Integer> entryMap = new HashMap<>();
        entry.forEach(vara -> entryMap.put(vara, entryMap.getOrDefault(vara, 0) + 1));
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
        entry.chars().forEach(vara -> entryMap.put((char) vara, entryMap.getOrDefault((char) vara, 0) + 1));
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
