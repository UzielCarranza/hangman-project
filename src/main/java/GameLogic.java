import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    //    fields

    // call instance of Random object
//    private final Random rand = new Random();

    //    call instance of scanner to get user input
    private final Scanner sc = new Scanner(System.in);

    //    set array of words to create a random sentence
//    private final String[] adjectives = {"charming", "cruel", "fantastic", "gentle", "huge", "perfect", "rough", "sharp", "tasty"}; // array of words
//    private final String[] nouns = {"portugal", "potato", "queen", "rain", "rainbow", " banana", "balloon", "horse"};

    //    boolean to keep running app
    private boolean keepRunningApp;

    //         call an instance of OutcomeOfGame
    OutcomeOfGame outcomeOfGame = new OutcomeOfGame();

    //    constructor
    public GameLogic() {
    }

//    METHODS

    public void printRandomWord() {

//        set the word to be guessed using a setter
//        outcomeOfGame.setWordToGuessed(adjectives[rand.nextInt(adjectives.length)] + " " + nouns[rand.nextInt(nouns.length)]);


    }


    //    method returns user input
    public String userInput() {
        System.out.println("Enter your guess");

//        gets user input using the scanner object declared as a field
        return String.valueOf(sc.next().toLowerCase(Locale.ROOT).charAt(0));
    }


    public void runner(String guess) {
        String[] words = {"terminator"};
//        "banana", "computer", "cow", "rain", "water"
        String word = words[(int) (Math.random() * words.length)];
        String asterisk = new String(new char[word.length()]).replace("\0", "*");
        String newasterisk = "";
//        String asterisk = outcomeOfGame.getWordToGuessed();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }
        }

        if (asterisk.equals(newasterisk)) {
            count++;
            System.out.println("here ++");
        } else {
            asterisk = newasterisk;
            System.out.println(asterisk);
        }
        if (asterisk.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }

}
