import java.util.Locale;
import java.util.Scanner;


public class Validation {

    String userInput;


    //    call instance of scanner to get user input
    private final Scanner sc = new Scanner(System.in);

    public Validation(){}

    public void checkForStringInput(){
        System.out.println("Enter your guess");
        String result = String.valueOf(sc.next().toLowerCase(Locale.ROOT).charAt(0));
        if (result.matches("^[a-zA-Z]*$")){
            setUserInput(result);
        } else {
            System.out.println("Enter a proper alphabetic character");
            checkForStringInput();
        }
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
