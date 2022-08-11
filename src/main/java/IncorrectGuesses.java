import java.util.ArrayList;
import java.util.List;

public class IncorrectGuesses {

//    fields

    //    keeps track of incorrect guesses;
    List<String> incorrectGuesses = new ArrayList<>();


//    constructor
    public IncorrectGuesses(){}


    //    gets all values within the word bank by iterating
    public void getIncorrectGuesses() {
//        values are stored with key numeric value
//        since we dont know all the key values
//        we iterate over the size of the List and display all of them
        for (int i = 0; i < incorrectGuesses.size(); i++) {
            System.out.println(incorrectGuesses.get(i));
        }
    }

    //    adds incorrect tries to the word bank
    public void setIncorrectGuesses(String incorrectGuesses) {
        this.incorrectGuesses.add(incorrectGuesses);
    }



}
