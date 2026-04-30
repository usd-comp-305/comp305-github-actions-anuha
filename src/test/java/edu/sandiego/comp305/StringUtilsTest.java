package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void reversingEmptyStrReturnsEmptyStr() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    public void reverseSingleCharStrReturnsSameChar() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    public void reverseStrReturnsReversedStr() {
        assertEquals("cba", StringUtils.reverseString("abc"));
    }

    @Test
    public void reverseStrWithSpacesReturnsReversedStr() {
        assertEquals("fed cba", StringUtils.reverseString("abc def"));
    }
}
