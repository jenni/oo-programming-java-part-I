public class StringUtils {
    public static boolean included(String word, String searched) {
        return (word.toLowerCase().contains(searched.trim().toLowerCase()));
    }
}
