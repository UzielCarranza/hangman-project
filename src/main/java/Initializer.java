public class Initializer {

    public Initializer() {
    }

    public static void Init() {
        Scenarios game = new Scenarios();
        game.mainScreen();
        GameLogic gameLogic = new GameLogic();
        gameLogic.printRandomWord();
        gameLogic.initialSetUp();
        Validation validation = new Validation();
        validation.checkForStringInput();
        gameLogic.runner(validation.getUserInput());

    }


}
