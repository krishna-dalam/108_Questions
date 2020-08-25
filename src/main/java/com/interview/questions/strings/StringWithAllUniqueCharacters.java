package com.interview.questions.strings;

import java.util.Arrays;

/*
    Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
    cannot use additional data structures ?

     Hints:
     1. Try a Hash table
     2. Could a bit vector be useful ?
     3. Can you solve it in 0(N lo g N) time? What might a solution like that look like?

 */

public class StringWithAllUniqueCharacters {
    public static void main(String[] args) {
        String input = "awert";
        boolean allUnique = allUnique(input);
        System.out.println(allUnique);
    }

    private static boolean allUnique(String input) {
        int MAX_CHARS = 256;
        if(input.length() > MAX_CHARS)
            return false;

        boolean[] uniqueChars = new boolean[MAX_CHARS];
        Arrays.fill(uniqueChars, false);

        for(char c: input.toCharArray()){
            if(uniqueChars[c])
                return false;
            uniqueChars[c] = true;
        }
        return true;
    }
}
