import java.io.IOException;

public class GameLogic {
    //    fields

    //        initialize counter to keep track of tries
    int count = 0;


    //         call an instance of OutcomeOfGame
    OutcomeOfGame outcomeOfGame = new OutcomeOfGame();

    //    call an instance of scenarios
    Scenarios scenarios = new Scenarios();

    //    call an instance of GenerateRandomWords
    GenerateRandomWord generateRandomWord = new GenerateRandomWord();

    Validation validation = new Validation();

    UserProgress userProgress = new UserProgress();

    IncorrectGuessesWordBank incorrectGuessesWordBank = new IncorrectGuessesWordBank();


    //    constructor
    public GameLogic() {
    }

//    METHODS

    public void printRandomWord() {

        try {
            generateRandomWord.generateRandomWord();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        selects a random word from the Array of words
        String word = generateRandomWord.getWords().get((int) (Math.random() * generateRandomWord.getWords().size()));
        System.out.println(word);


//        set the word to be guessed using a setter
        outcomeOfGame.setWordToGuessed(word);


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
            else if (userProgress.getUserProgress().charAt(i) != '*') {
//                added to the asterisks string
                newasterisk += userProgress.getUserProgress().charAt(i);
            } else {
//                add an asterisk symbol to the asterisks string
                newasterisk += "*";
            }
        }
        checkWordToBeGuessedAgainstUserInput(newasterisk, guess, wordTobeGuessed);

    }


    //    convert word to be guessed with asterisks
    public void initialSetUp() {
//        replaces word with asterisks
        userProgress.setUserProgress(new String(new char[outcomeOfGame.getWordToGuessed().length()]).replace("\0", "*"));
    }


    public void checkWordToBeGuessedAgainstUserInput(String newasterisk, String guess, String wordTobeGuessed) {
        checkMatchedOfCharacters(newasterisk, guess);
        checkUserProgress(wordTobeGuessed);

    }

    public void checkMatchedOfCharacters(String newasterisk, String guess) {
        //        if there is no matched of guessed try and word to be guessed
        if (userProgress.getUserProgress().equals(newasterisk)) {
//            increase counter and call scenarios
            count++;
            scenarios.runner(count);
            System.out.println("\n");
//            bank word of incorrect guesses
            System.out.println("That was wrong... current number of tries: " + count + "\n");
            System.out.println("---------------------------------");
//            get user progress
            System.out.println("word : " + userProgress.getUserProgress());

            System.out.println("word bank of incorrect guesses");
//            add the incorrect guess to the bank word
            incorrectGuessesWordBank.setIncorrectGuesses(guess);
//            get all words from the bank word
            incorrectGuessesWordBank.getIncorrectGuesses();
            System.out.println("---------------------------------");
        } else {
            userProgress.setUserProgress(newasterisk);
            System.out.println(" correct!!! current progress:  " + userProgress.getUserProgress());
        }
    }

    public void checkUserProgress(String wordTobeGuessed) {
        if (userProgress.getUserProgress().equals(wordTobeGuessed)) {
            outcomeOfGame.gameOverWin();
        } else {
//            recursion to keep asking player until word is guessed or counter reaches 8
            validation.checkForStringInput();
            runner(validation.getUserInput());
        }
    }
}

