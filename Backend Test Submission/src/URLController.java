public class URLController {
    public static void main(String[] args) {
        URLRequest request1 = new URLRequest(
            "https://example.com/long-url-path",  
            10,                                   
            "rahul1"                              
        );
        URLResponse response1 = URLService.createShortURL(request1);
        if (response1 != null) {
            System.out.println("Response:");
            System.out.println("Short Link: " + response1.getShortLink());
            System.out.println("Expiry: " + response1.getExpiry());
        }
    }
}