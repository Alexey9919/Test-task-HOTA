package ru.zagrebin.TestTask.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MainService {

    //Method that counts characters in a string
    public String counterSymbols(String str) {
        char[] arr = str.toCharArray();
        Map<Character, Integer> characterMap = new HashMap<>();
        for (char c : arr) {

            characterMap.put(c, characterMap.getOrDefault(c, 0) + 1);

        }

        return characterMap.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(entry -> "\"" + entry.getKey() + "\": " + entry.getValue())
                .collect(Collectors.joining(", "));
    }
}
