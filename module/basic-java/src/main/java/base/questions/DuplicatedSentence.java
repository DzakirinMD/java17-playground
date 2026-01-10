package base.questions;

import java.util.HashMap;
import java.util.Map;

public class DuplicatedSentence {
    public static void main(String[] args) {
        String[] duplicatedSentences = {"This", "This", "This", "word", "maybe", "maybe", "duplicated"};

        printDuplicatedSentences(duplicatedSentences);
    }
    
    public static void printDuplicatedSentences(String[] sentences) {
        // data struct -> (This,  2)
        Map<String, Integer> duplicatedMap = new HashMap<String, Integer>();

        for (int i = 0 ; i < sentences.length ; i++) {
            if (duplicatedMap.containsKey(sentences[i])) {
                duplicatedMap.put(sentences[i], duplicatedMap.get(sentences[i]) + 1);
            } else {
            duplicatedMap.put(sentences[i], 1);
            }
        }

        duplicatedMap.forEach((key, value) ->
                System.out.printf("Word: %s, Count: %s\n", key, value)
                );
    }
}
