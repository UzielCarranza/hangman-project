public class RapidAPI {

    private final String rapidAPIKey = "3b6305c409mshdba9e2b3a93eecbp1ab2efjsn283cd2aeb421";
    private final String url = "https://random-words5.p.rapidapi.com/getMultipleRandom?count=1";
    private final String host = "random-words5.p.rapidapi.com";

    public RapidAPI() {
    }

    public String getRapidAPIKey() {
        return rapidAPIKey;
    }

    public String getUrl() {
        return url;
    }

    public String getHost() {
        return host;
    }
}
