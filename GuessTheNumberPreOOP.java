import java.util.Scanner;

import javax.swing.InputMap;

public class GuessTheNumberPreOOP {
    public static void main(String[] args) {
        /*Potential Features to Implement:
        1. Menu and associated different menus (Methods)
        2. Array Structure to store scores (Arrays)
        3. Convert to OOP design (OOP)
        4. Input Validation(?)
        */

        //Variables
        int minVal = 0;
        int maxVal = 10; //Add ability to set the max values(?)
        int userintInput = 0;
        int randomVal = 0;
        int lifechancesMax = 2;
        int lifechancesCurrent = lifechancesMax;
        
        //User input initialisation and random number generation
        Scanner inputKey = new Scanner (System.in);

        randomVal = (int)Math.floor(Math.random()*(maxVal-minVal+1)+minVal);

        //Final Message Strings
        final String ENTRY_MESSAGE = ("Enter a number: ");
        final String CORRECTGUESS_MESSAGE = ("Correct the number was: "+randomVal);
        final String STATISTIC_MESSAGE = ("You did it with: "+lifechancesCurrent+" Life chances!");
        final String LIFECHANCESLEFT_MESSAGE = ("You have: "+lifechancesCurrent+" Life chances left!");
        final String GAMEOVER_MESSAGE = ("You have LOST "+lifechancesCurrent+" out of: " + lifechancesMax + " Life Chances, Game Over");
        final String CORRECTRANDOMNUMBER_MESSAGE = ("The correct number was: "+randomVal);
        final String TOOHIGH_MESSAGE = ("Too High");
        final String TOOLOW_MESSAGE = ("Too Low");
        final String OUTBOUNDS_MESSAGE = ("Out of Min Value bounds");
        final String FALSE_MESSAGE = ("False, try again");
        final String MENU = ("THIS IS THE GUESS THE NUMBER GAME:\nTHERE ARE 3 GAME MODES:\n1. '1' HARD MODE WHERE YOU ONLY HAVE 2 LIFE CHANCES\n2. '2' EASY MODE WHERE YOU HAVE 10 LIFE CHANCES\n3. '3' FREE MODE WHERE YOU HAVE A CUSTOM NUMBER OF LIVES TO ALLOW YOU TO PRACTICE\nPLEASE SELECT ONE MODE:                             ");
        
        //Strings
        String startMessage = "Let's play a game- I have picked a number between "+minVal+" and "+maxVal+ ":";
        String guessMessage = "Can you guess it?";


        System.out.println(startMessage);
        System.out.println(guessMessage);
        System.out.println(MENU);
        int option = 0;
        option = inputKey.nextInt();
        MODES(option);


        System.out.println();


        //While Loop
        while((userintInput != randomVal) && (lifechancesCurrent > 0)) {
            //User Input
            System.out.println(ENTRY_MESSAGE);
            inputKey.nextInt();

            //If statements
            if (userintInput == randomVal) {
                System.out.println(CORRECTGUESS_MESSAGE);
                System.out.println(STATISTIC_MESSAGE);
            } else if (userintInput > randomVal) {
                System.out.println(TOOHIGH_MESSAGE);
                lifechancesCurrent--;
                System.out.println(LIFECHANCESLEFT_MESSAGE);
            } else if (userintInput < randomVal) {
                System.out.println(TOOLOW_MESSAGE);
                lifechancesCurrent--;
                System.out.println(LIFECHANCESLEFT_MESSAGE);
            } else if (userintInput > maxVal) {
                System.out.println(LIFECHANCESLEFT_MESSAGE);
                lifechancesCurrent--;
                System.out.println(LIFECHANCESLEFT_MESSAGE);
            } else if (userintInput < minVal ) {
                System.out.println(OUTBOUNDS_MESSAGE);
                lifechancesCurrent--;
                System.out.println(LIFECHANCESLEFT_MESSAGE);
            } else {
                System.out.println(FALSE_MESSAGE);
                }

            if (lifechancesCurrent <= 0) {
                System.out.println(GAMEOVER_MESSAGE);
                System.out.println(CORRECTRANDOMNUMBER_MESSAGE);
            }
            }
            inputKey.close();
        }

        public static MODES(int option) {
            if (option == 1) {
             lifechancesMax = 2; 
            } else if (option == 2) {
             lifechancesMax = 10;
            } else if (option == 3) {
             System.out.println("How many lives do you want to set? ");
             lifechancesMax = inputKey.nextInt;
            } else {
             System.out.println("Error");
            }
            return lifechancesMax;
         }

      }