package Ex_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsPalindrome() {
        assertEquals(true, StringUtils.isPalindrome("ANA"));
        assertTrue(StringUtils.isPalindrome("Ana"));
        assertTrue(StringUtils.isPalindrome("RIR"));
        assertTrue(StringUtils.isPalindrome("arara"));
        assertTrue(StringUtils.isPalindrome("ovo"));
        assertTrue(StringUtils.isPalindrome("osso"));
        assertTrue(StringUtils.isPalindrome("reler"));
        assertTrue(StringUtils.isPalindrome("11111"));
        assertTrue(StringUtils.isPalindrome("*****"));
        assertTrue(StringUtils.isPalindrome("abasedotetodesaba"));
        assertTrue(StringUtils.isPalindrome("anotaramadatadamaratona"));

        assertFalse(StringUtils.isPalindrome("natana"));
        assertFalse(StringUtils.isPalindrome("123456"));
        assertFalse(StringUtils.isPalindrome("*-/+"));
        assertFalse(StringUtils.isPalindrome(null));

    }

}
