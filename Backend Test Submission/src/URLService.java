import java.time.LocalDateTime;
import java.util.UUID;

public class URLService {
    public static URLResponse createShortURL(URLRequest request) {
        LoggingMiddleware.log("POST", "/shorturls", request.toString()); 
        if (request.getUrl() == null || !request.getUrl().startsWith("http")) {
            System.out.println("Invalid URL!");
            return null;
        }
        String shortcode = request.getShortcode();
        if (shortcode == null || shortcode.isEmpty()) {
            shortcode = UUID.randomUUID().toString().substring(0, 6); // random 6-character code
            }
        if (URLStore.exists(shortcode)) {
            System.out.println("Shortcode already exists!");
            return null;}
        int validity = request.getValidity() != null ? request.getValidity() : 30;
        LocalDateTime expiry = LocalDateTime.now().plusMinutes(validity);
 
        URLData data = new URLData(request.getUrl(), shortcode, expiry);
        URLStore.save(shortcode, data);
        String shortLink = "http://localhost:8080/" + shortcode;
        return new URLResponse(shortLink, expiry);
    }
}
