package lab;

/**
 * Helper methods for working with strings.
 */
public final class StringUtils {

    private StringUtils() {
        // util class
    }

    /**
     * Checks whether a string is null, empty, or only whitespace.
     */
    public static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    /**
     * Capitalizes the first character and leaves the rest unchanged.
     */
    public static String capitalize(String s) {
        if (isBlank(s)) {
            return s;
        }
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    /**
     * Reverses the given string while preserving null input.
     */
    public static String reverse(String s) {
        if (s == null) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }
}
