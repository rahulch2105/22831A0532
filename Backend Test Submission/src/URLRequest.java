public class URLRequest {
    private String url;
    private Integer validity;//option
    private String shortcode;//option

    public URLRequest(String url, Integer validity, String shortcode) {
        this.url = url;
        this.validity = validity;
        this.shortcode = shortcode;
    }

    public String getUrl() {
        return url;
    }

    public Integer getValidity() {
        return validity;
    }

    public String getShortcode() {
        return shortcode;
    }

    @Override
    public String toString() {
        return "URLRequest{" +
                "url='" + url + '\'' +
                ", validity=" + validity +
                ", shortcode='" + shortcode + '\'' +
                '}';
    }
}

