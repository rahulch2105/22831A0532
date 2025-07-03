import java.time.LocalDateTime;

public class URLData {
    private String originalUrl;
    private String shortcode;
    private LocalDateTime expiryTime;

    public URLData(String originalUrl, String shortcode, LocalDateTime expiryTime) {
        this.originalUrl = originalUrl;
        this.shortcode = shortcode;
        this.expiryTime = expiryTime;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getShortcode() {
        return shortcode;
    }

    public LocalDateTime getExpiryTime() {
        return expiryTime;
    }

    @Override
    public String toString() {
        return "URLData{" +
                "originalUrl='" + originalUrl + '\'' +
                ", shortcode='" + shortcode + '\'' +
                ", expiryTime=" + expiryTime +
                '}';
    }
}