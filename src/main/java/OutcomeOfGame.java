public class OutcomeOfGame {

//    fields
    private final String wrongGuess = "Wrong guess, try again";
    private String wordToGuessed;

//    constructor
    public OutcomeOfGame() {

    }

//    methods
    public void wrongAnswerComment() {
        System.out.println(wrongGuess);
    }

    public void gameOverLost() {
        System.out.println("GAME OVER! The word was " + wordToGuessed);
    }

    public void gameOverWin(){
        System.out.println("CONGRATULATIONS! YOU WIN! " + "\uD83D\uDE00");
    }
//    getters and setters for wrongGuess field

    public String getWrongGuess() {
        return wrongGuess;
    }


//    getters and setters for wordToGuessed field
    public String getWordToGuessed() {
        return wordToGuessed;
    }

    public void setWordToGuessed(String wordToGuessed) {
        this.wordToGuessed = wordToGuessed;
    }
}
