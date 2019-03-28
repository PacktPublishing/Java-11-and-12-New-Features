import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpReqPost {
    public static void main(String uri[]) throws Exception {
        String postData = "?name='Mala'&email='info@ejavaguru@gmail.com'";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://www.ejavaguru.com/Java11/register.php")).POST(HttpRequest.BodyPublishers.ofString(postData)).build();
        HttpResponse<?> response = client.send(request, HttpResponse.BodyHandlers.discarding());
        System.out.println(response.statusCode());
    }
}