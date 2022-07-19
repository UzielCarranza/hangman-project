import java.util.Random;

public class GameLogic {
    private final Random rand = new Random(); // call instance of Random object
    private final String[] adjectives = {"charming", "cruel", "fantastic", "gentle", "huge", "perfect", "rough", "sharp", "tasty"}; // array of words
    private final String[] nouns = {"portugal", "potato", "queen", "rain", "rainbow", " banana", "balloon", "horse"};

    public GameLogic() {
    }

    public void printRandomWord() {

        System.out.println("Word to be guessed: " + adjectives[rand.nextInt(adjectives.length)] + " " + nouns[rand.nextInt(nouns.length)]);
    }

}
