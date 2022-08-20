import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiWords {

    String randomWord;

    public ApiWords() {
    }


    public void setApiWords() {
        RapidAPI rapidAPI = new RapidAPI();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(rapidAPI.getUrl()))
                    .header("X-RapidAPI-Key", rapidAPI.getRapidAPIKey())
                    .header("X-RapidAPI-Host", rapidAPI.getHost())
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            String word = response.body();
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            setRandomWord(word);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getRandomWord() {
        return randomWord;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }
}
