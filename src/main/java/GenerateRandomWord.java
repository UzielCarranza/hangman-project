import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenerateRandomWord {

//    fields
    //    Holds all words from the dictionary
    List<String> words = new ArrayList<>();

//    constructor
    GenerateRandomWord(){};


//    methods
public void generateRandomWord() throws IOException {
//        reads form the dictionary file
    BufferedReader reader = new BufferedReader((new FileReader("/Users/uzielcarranzacharro/IdeaProjects/hangman-game/src/main/java/dictionary.txt")));

//        iterate over every word
//        condition is current word !== null because there are more line to be read
    for (String current = reader.readLine(); current != null; current = reader.readLine()) {
//            add all words to List array
        words.add(current);
    }
    setWords(words);
}

    //    getters and setters for List of words
    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

}
