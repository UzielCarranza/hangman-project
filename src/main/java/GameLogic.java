import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class GameLogic {
    //    fields

    //        create array of words
    String[] words = {"terminator"};
    //    call instance of scanner to get user input
    private final Scanner sc = new Scanner(System.in);

    //        initialize counter to keep track of tries
    int count = 0;


    //        create new string based on the word selected that replaces alphabetic characters to asterisks
    String userProgress;

    //         call an instance of OutcomeOfGame
    OutcomeOfGame outcomeOfGame = new OutcomeOfGame();

    //    call an instance of scenarios
    Scenarios scenarios = new Scenarios();

    //    keeps track of incorrect guesses;
    List<String> incorrectGuesses = new ArrayList<>();

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
    public String getUserInput() {

        System.out.println("Enter your guess");

//        gets user input using the scanner object declared as a field
        return String.valueOf(sc.next().toLowerCase(Locale.ROOT).charAt(0));
    }


    public void runner(String guess) {

//        get word to be guessed
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

//        if there is no matched of guessed try and word to be guessed
        if (userProgress.equals(newasterisk)) {
//            increase counter and call scenarios
            count++;
            scenarios.runner(count);
            System.out.println("\n");
            System.out.println("That was wrong... current number of tries: " + count + "\n");
            System.out.println("---------------------------------");
            System.out.println("word bank of incorrect guesses");
            setIncorrectGuesses(guess);
            getIncorrectGuesses();
            System.out.println("---------------------------------");
        } else {
            userProgress = newasterisk;
            System.out.println(" correct!!! current progress:  " + userProgress);
        }
        if (userProgress.equals(wordTobeGuessed)) {
            outcomeOfGame.gameOverWin();
        } else {
//            recursion to keep asking player until word is guessed or counter reaches 8
            runner(getUserInput());
        }
    }

    //    getters and setters for userProgress
    public String getUserProgress() {
        return userProgress;
    }

    public void setUserProgress(String userProgress) {
        this.userProgress = userProgress;
    }

    //    convert word to be guessed with asterisks
    public void initialSetUp() {
//        replaces word with asterisks
        userProgress = new String(new char[outcomeOfGame.getWordToGuessed().length()]).replace("\0", "*");
    }

    public void getIncorrectGuesses() {
        for (int i = 0; i < incorrectGuesses.size(); i++) {
            System.out.println(incorrectGuesses.get(i));
        }
    }

    public void setIncorrectGuesses(String incorrectGuesses) {
        this.incorrectGuesses.add(incorrectGuesses);
    }
}
