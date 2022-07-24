public class Scenarios {
//     scenarios for all tries

    public Scenarios() {
    }

    public void mainScreen() {
        //Ascii Art
        System.out.println(" _                                             ");
        System.out.println("| |                                            ");
        System.out.println("| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  ");
        System.out.println("| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\");
        System.out.println("| | | | (_| | | | | (_| | | | | | | (_| | | | | ");
        System.out.println("|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|");
        System.out.println("                    __/ |                      ");
        System.out.println("                   |___/  \n");
    }

    public void firstTry() {
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
    }

    public void secondTry() {
        System.out.println("   ____________");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   | ");
        System.out.println("___|___");
    }

    public void thirdTry() {
        System.out.println("   ____________");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   | ");
        System.out.println("___|___");
    }

    public void fourthTry() {
        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
    }

    public void fifthTry() {
        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |           |");
        System.out.println("   |           |");
        System.out.println("   |");
        System.out.println("___|___");
    }


    public void sixthTry() {
        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |           |");
        System.out.println("   |           |");
        System.out.println("   |          / \\ ");
        System.out.println("___|___      /   \\");
    }


    public void seventhTry() {
        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |          _|_");
        System.out.println("   |         / | \\");
        System.out.println("   |          / \\ ");
        System.out.println("___|___      /   \\");
    }

    public void nextGamePhaseDivision() {
        System.out.println("\n");
        System.out.println("******************************");
        System.out.println("\n");

    }

    public void runner(int counter) {
//        check for counter specific number and based on that call a scenario
        if (counter == 1) {
            firstTry();
        } else if (counter == 2) {
            secondTry();
        } else if (counter == 3) {
            thirdTry();
        } else if (counter == 4) {
            fourthTry();
        } else if (counter == 5) {
            fifthTry();
        } else if (counter == 6) {
            sixthTry();
        } else if (counter == 7) {
            seventhTry();
        } else {
            System.out.println(" ran out of tries");
            System.exit(0);
        }

    }
}
