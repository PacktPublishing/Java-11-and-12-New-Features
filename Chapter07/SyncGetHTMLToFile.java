import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

class SyncGetHTMLToFile {
    public static void main(String args[]) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java        /net/http/HttpClient.html")).build();
        HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers.ofFile(Paths.get("HttpClient.html")));
    }
}