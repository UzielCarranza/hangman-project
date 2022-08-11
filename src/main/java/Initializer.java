public class Initializer {

    public Initializer() {
    }

    public static void Init() {
        Scenarios game = new Scenarios();
        game.mainScreen();
        GameLogic gameLogic = new GameLogic();
        gameLogic.printRandomWord();
        gameLogic.initialSetUp();
        gameLogic.checkForStringInput();
        gameLogic.runner(gameLogic.getUserInput());

    }


}
