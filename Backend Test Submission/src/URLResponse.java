import java.time.LocalDateTime;

public class URLResponse {
    private String shortLink;
    private LocalDateTime expiry;

    public URLResponse(String shortLink, LocalDateTime expiry) {
        this.shortLink = shortLink;
        this.expiry = expiry;
    }

    public String getShortLink() {
        return shortLink;
    }

    public LocalDateTime getExpiry() {
        return expiry;
    }

    @Override
    public String toString() {
        return "URLResponse{" +
                "shortLink='" + shortLink + '\'' +
                ", expiry=" + expiry +
                '}';
    }
}