import java.util.ArrayList;
import java.util.List;

public class IncorrectGuessesWordBank {

//    fields

    //    keeps track of incorrect guesses;
    List<String> incorrectGuessesWordBank = new ArrayList<>();


//    constructor
    public IncorrectGuessesWordBank(){}


    //    gets all values within the word bank by iterating
    public void getIncorrectGuesses() {
//        values are stored with key numeric value
//        since we dont know all the key values
//        we iterate over the size of the List and display all of them
        for (int i = 0; i < incorrectGuessesWordBank.size(); i++) {
            System.out.println(incorrectGuessesWordBank.get(i));
        }
    }

    //    adds incorrect tries to the word bank
    public void setIncorrectGuesses(String incorrectGuesses) {
        this.incorrectGuessesWordBank.add(incorrectGuesses);
    }



}
