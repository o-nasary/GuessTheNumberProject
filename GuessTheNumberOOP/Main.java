import java.util.Scanner;

/*OOP Implementation of My Initial Guess The Number game with new features such as:
    - Different Modes of Difficulty (e.g., Hard, Easy and Custom)
    - To Be Implemented: Custom Minimum and Maximum Range(?)
 */


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int userGuessVal;
        int usermenuVal;

        Number NumberSet = new Number();
        MenuAndGuess main = new MenuAndGuess();

        NumberSet.setRandom(); //Generates a Random Number

        System.out.println(main.getMenuDisplay()); //Displays Menu for Selecting Modes

        usermenuVal = in.nextInt();
        main.menuSelection(usermenuVal); //Menu Selector

        NumberSet.setCurrent(main.getLifechanceMax());

        NumberSet.guessDisplay(); //Outputs Minimum and Maximum Value for guess
        userGuessVal = in.nextInt();
        NumberSet.userGuess(userGuessVal); //Use The User Input for the Guess Input.
    }
}