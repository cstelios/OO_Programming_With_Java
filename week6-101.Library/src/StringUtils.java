
public class StringUtils {

    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }

        String searchTerm = searched.trim();
        searchTerm = searchTerm.toUpperCase();

        String searchIn = word.trim();
        searchIn = searchIn.toUpperCase();
        
        return searchIn.contains(searchTerm);
    }
}
