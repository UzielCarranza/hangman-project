import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    //    fields

    //        create array of words
    String[] words = {"terminator"};
    //    call instance of scanner to get user input
    private final Scanner sc = new Scanner(System.in);

    //    boolean to keep running app
    private boolean keepRunningApp;


    //        initialize counter to keep track of tries
    int count = 0;


    //        create new string based on the word selected that replaces alphabetic characters to asterisks
    String userProgress;

    //         call an instance of OutcomeOfGame
    OutcomeOfGame outcomeOfGame = new OutcomeOfGame();

    //    constructor
    public GameLogic() {
    }

//    METHODS

    public void printRandomWord() {

//        selects a random word from the Array of words
        String word = words[(int) (Math.random() * words.length)];

//        set the word to be guessed using a setter
        outcomeOfGame.setWordToGuessed(word);


    }


    //    method returns user input
    public String userInput() {
        System.out.println("Enter your guess");

//        gets user input using the scanner object declared as a field
        return String.valueOf(sc.next().toLowerCase(Locale.ROOT).charAt(0));
    }


    public void runner(String guess) {

        String wordTobeGuessed = outcomeOfGame.getWordToGuessed();

//        Start a new empty string ... will be used to add asterisks if not  matched was found with user input
//        but will add the character that was matched with the word to be guessed
        String newasterisk = "";


//        iterate over the selected word
        for (int i = 0; i < wordTobeGuessed.length(); i++) {
//            if a character matches user input
            if (wordTobeGuessed.charAt(i) == guess.charAt(0)) {
//          changed the asterisk character to the user input
                newasterisk += guess.charAt(0);
            }
            //                if current character is not an asterisk
            else if (userProgress.charAt(i) != '*') {
//                added to the asterisks string
                newasterisk += userProgress.charAt(i);
            } else {
//                add an asterisk symbol to the asterisks string
                newasterisk += "*";
            }
        }

        if (userProgress.equals(newasterisk)) {
            count++;
            System.out.println(count
            );
        } else {
            userProgress = newasterisk;
            System.out.println(userProgress);
        }
        if (userProgress.equals(wordTobeGuessed)) {
            System.out.println("Correct! You win! The word was " + wordTobeGuessed);
        }
    }

//    getters and setters for userProgress
    public String getUserProgress() {
        return userProgress;
    }

    public void setUserProgress(String userProgress) {
        this.userProgress = userProgress;
    }

    public void initialSetUp() {
        userProgress = new String(new char[outcomeOfGame.getWordToGuessed().length()]).replace("\0", "*");
    }
}
