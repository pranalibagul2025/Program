package PQ27122025;

import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args){
        String str = "java is easy and java is powerful";

        HashMap<String , Integer> map = new HashMap<>();
        String[] words = str.toLowerCase().split(" ");

        for (String word : words)
        {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);

    }
}
