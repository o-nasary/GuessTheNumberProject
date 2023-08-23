import java.util.Scanner;

public class Number {
    private int lifechancesCurrent = 0;
    private int generatedNumber;
    private int minVal = 0;
    private int maxVal = 10;

    Scanner in = new Scanner(System.in);

    public void setRandom() {
        generatedNumber = (int)Math.floor(Math.random()*(maxVal-minVal+1)+minVal);
    }

    public int getRandom() {
        return generatedNumber;
    }

    public void setCurrent(int lifechanceMax) {
        lifechancesCurrent = lifechanceMax;
    }

    /*CUSTOM RANGE SELECTION (NOT IMPLEMENTED YET) - 18/12/2022
    - May need to create another bigger menu to separate mode selection and user customisation of range?
    public void setMaxMinVal() {
        System.out.println("What do you want to set as the Maximum Value: ");
        setMaxVal(in.nextInt());
        System.out.println("What do you want to set as the Minimum Value: ");
        setMinVal(in.nextInt());
    }
     */

    public void setMaxVal(int userMax) {
        maxVal = userMax; //User Selection of Max Value(?)
    }

    public void setMinVal(int userMin) {
        minVal = userMin;
    }

    public int getMinVal() {
        return minVal;
    }

    public int getMaxVal() {
        return maxVal;
    }

    public void guessDisplay() {
        System.out.println("I have guessed a number between "+minVal+" & "+maxVal);
        System.out.println("Can you guess it?: ");
    }

    public int userInput() {
        System.out.println("Try Again and Guess, you have " + lifechancesCurrent + " lives left");
        int userGuess = in.nextInt();
        return userGuess;
    }

    public void userGuess(int userGuess) {
        boolean endState = false;
        while (!(lifechancesCurrent <= 0) && (endState = true)) {
            if (userGuess == generatedNumber) {
                correctGuess();
            } else if (userGuess > generatedNumber) {
                System.out.println("Too High");
                lifechancesCurrent = lifechancesCurrent - 1;
                incorrectGuess();
                if (checkZero()) {
                    outofLives();
                } else {
                    userGuess(userInput());
                }
            } else if (userGuess < generatedNumber) {
                System.out.println("Too Low");
                lifechancesCurrent = lifechancesCurrent - 1;
                incorrectGuess();
                if (checkZero()) {
                    outofLives();
                } else {
                    userGuess(userInput());
                }
            } else {
                System.out.println("Error");
            }
        }
        endState = true;
    }

    public void incorrectGuess() {
        System.out.println("Incorrect Guess");
        System.out.println(lifechancesCurrent + " left");
    }

    public void correctGuess() {
        System.out.println("Correct Guess");
        System.out.println("You did it with "+lifechancesCurrent+" lives left");
    }

    public void outofLives() {
        System.out.println("Game Over, You have 0 lives left");
        System.out.println("The correct number was: "+generatedNumber);
    }

    public boolean checkZero() {
        boolean isZero;
        if (lifechancesCurrent == 0) {
            isZero = true;
            return isZero;
        }
        isZero = false;
        return isZero;
    }

}

