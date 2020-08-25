package com.interview.questions.strings;

/*
    Write a method to replace all spaces in a string with '%20'

    Input: "Hello World"
    Outpu: "Hello%20World"

 */
public class URLify {

    public static void main(String[] args) {
        char[] str = "Hello World".toCharArray();

        // Prints the replaced string
        str = replaceSpaces(str);

        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
    }

    // Replaces spaces with %20
    private static char[] replaceSpaces(char[] str) {
        // count spaces and find current length
        int space_count = 0, i = 0;
        for (i = 0; i < str.length; i++)
            if (str[i] == ' ')
                space_count++;

        // Find new length.
        int new_length = i + space_count * 2;

        // Start filling character from end
        int index = new_length - 1;

        char[] new_str = str;
        str = new char[new_length];

        // Fill rest of the string from end
        for (int j = i - 1; j >= 0; j--) {

            // inserts %20 in place of space
            if (new_str[j] == ' ') {
                str[index] = '0';
                str[index - 1] = '2';
                str[index - 2] = '%';
                index -= 3;
            } else {
                str[index] = new_str[j];
                index--;
            }
        }
        return str;
    }


}
