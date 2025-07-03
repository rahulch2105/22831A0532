import java.util.HashMap;
import java.util.Map;

public class URLStore {
    // key = shortcode, value = URLData
    private static Map<String, URLData> urlMap = new HashMap<>();

    public static void save(String shortcode, URLData data) {
        urlMap.put(shortcode, data);
    }

    public static URLData get(String shortcode) {
        return urlMap.get(shortcode);
    }

    public static boolean exists(String shortcode) {
        return urlMap.containsKey(shortcode);
    }
}