package edu.sandiego.comp305;

public class StringUtils {
    public static String reverseString(String strToReverse) {
        String reversedStr = "";

        for (int i = strToReverse.length() - 1; i >= 0; i--) {
            reversedStr += strToReverse.charAt(i);
        }

        return reversedStr;
    }
}
