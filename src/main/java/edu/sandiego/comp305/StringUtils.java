package edu.sandiego.comp305;

public final class StringUtils {
    private StringUtils() {

    }

    public static String reverseString(final String strToReverse) {
        final StringBuilder reversedStr = new StringBuilder();

        for (int i = strToReverse.length() - 1; i >= 0; i--) {
            reversedStr.append(strToReverse.charAt(i));
        }

        return reversedStr.toString();
    }
}