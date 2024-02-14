package org.hillcrest.chapter13.a;

import java.util.ArrayList;
import java.util.List;

public class Permuation {
    public static List<String> permutate(String text){
        List<String> result =new ArrayList<>();
        if(text.length() == 0){
            result.add(text);
            return result;
        }
        for (int i = 0; i < text.length(); i++){
            var shorterWord = text.substring(0,i)+ text.substring(i+1);
            var shorterPermutations = permutate(shorterWord);
            for (var s: shorterPermutations){
                result.add(text.charAt(i)+s);
            }
        }
        return result;
    }
}
