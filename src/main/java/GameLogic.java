import java.util.Random;

public class GameLogic {
    private final Random rand = new Random(); // call instance of Random object
    private final String[] words = {"one", "cat", "fish", "car", "race"}; // array of words
    private final String[] words2 = {"big", "small", "medium", "large", "giant"};

    public GameLogic() {
    }

    public void printRandomWord() {

        System.out.println("Word to be guessed: " + words2[rand.nextInt(words2.length)] + " " +  words[rand.nextInt(words.length)]);
    }

}
