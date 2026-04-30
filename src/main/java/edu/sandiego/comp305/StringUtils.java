package edu.sandiego.comp305;

public class StringUtils {
    public static String reverseString(final String strToReverse) {
        StringBuilder reversedStr = new StringBuilder();

        for (int i = strToReverse.length() - 1; i >= 0; i--) {
            reversedStr.append(strToReverse.charAt(i));
        }

        return reversedStr.toString();
    }
}
