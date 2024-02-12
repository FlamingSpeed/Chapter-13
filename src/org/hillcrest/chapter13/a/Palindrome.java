package org.hillcrest.chapter13.a;

public class Palindrome {
    public static boolean isPalindrome(String value){
        return isPalindrome(value, 0, value.length()-1);
    }
//recursive helper method
    private static boolean isPalindrome(String value, int start, int end) {
        //Guard clause it just exits
        if (start >= end) {
            return true;
        }
        char first = Character.toLowerCase(value.charAt(start));
        char last = Character.toLowerCase(value.charAt(end));

        if (Character.isLetter(first) && Character.isLetter(last)) {
            if (first == last) {
                return isPalindrome(value, start +1,end-1);
            }
            return false;
        } else if (!Character.isLetter(last)) {
            return isPalindrome(value, start, end -1);
        } else {
            return isPalindrome(value,start+1,end);
        }
    }
}