import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ApiWords {

    String randomWord;

    public ApiWords() {
    }


    public void setApiWords() {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://random-words5.p.rapidapi.com/getMultipleRandom?count=1"))
                    .header("X-RapidAPI-Key", "3b6305c409mshdba9e2b3a93eecbp1ab2efjsn283cd2aeb421")
                    .header("X-RapidAPI-Host", "random-words5.p.rapidapi.com")
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
