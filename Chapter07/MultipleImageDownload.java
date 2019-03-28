import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

class MultipleImageDownload {
    public static void main(String args[]) throws Exception {
        List<URI> imageURIs = List.of(URI.create("http://ejavaguru.com/images/about/jbcn-actual-2018.jpg"), URI.create("http://ejavaguru.com/images/about/iit-delhi.jpg"), URI.create("http://ejavaguru.com/images/about/techfluence.jpg"));
        HttpClient client = HttpClient.newHttpClient();
        List<HttpRequest> imgDwnldRequests = imageURIs.stream().map(HttpRequest::newBuilder).map(builder -> builder.build()).collect(Collectors.toList());
        CompletableFuture.allOf(imgDwnldRequests.stream().map(request -> client.sendAsync(request, HttpResponse.BodyHandlers.ofFile(Paths.get(((String) request.uri().getPath()).substring(14))))).toArray(CompletableFuture<?>[]::new)).join();
    }
}