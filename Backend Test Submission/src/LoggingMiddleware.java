 import java.time.LocalDateTime;
public class LoggingMiddleware {
    public static void log(String method, String endpoint, String requestBody) {
        System.out.println("========== REQUEST LOG ==========");
        System.out.println("Time: " + LocalDateTime.now());
        System.out.println("Method: " + method);
        System.out.println("Endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        System.out.println("==================================");
    }
}
