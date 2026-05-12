package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @Test
    void isBlank_detectsBlankValues() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank("lab"));
    }

    @Test
    void capitalize_handlesBlankAndTextValues() {
        assertNull(StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
        assertEquals("Lab", StringUtils.capitalize("lab"));
        assertEquals("Lab", StringUtils.capitalize("Lab"));
    }

    @Test
    void reverse_emptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void reverse_singleCharacter() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void reverse_asciiText() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    void reverse_unicodeText() {
        assertEquals("\u043d\u0439\u0430\u0441", StringUtils.reverse("\u0441\u0430\u0439\u043d"));
    }

    @Test
    void reverse_nullValue() {
        assertNull(StringUtils.reverse(null));
    }
}
