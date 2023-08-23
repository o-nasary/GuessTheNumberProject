import java.util.Scanner;

public class MenuAndGuess {
    private int lifechanceMax;

    private static final String MENU_DISPLAY = "THIS IS THE GUESS THE NUMBER GAME:\n" +
            "THERE ARE 3 GAME MODES:\n" +
            "1. '1' HARD MODE WHERE YOU ONLY HAVE 2 LIFE CHANCES\n" +
            "2. '2' EASY MODE WHERE YOU HAVE 10 LIFE CHANCES\n" +
            "3. '3' FREE MODE WHERE YOU HAVE A CUSTOM NUMBER OF LIVES TO ALLOW YOU TO PRACTICE" +
            "4. '4' CHANGE THE MINIMUM AND MAXIMUM VALUES TO INCREASE DIFFICULTY"+
            "\nPLEASE SELECT ONE MODE: ";

    public String getMenuDisplay() {
        return MENU_DISPLAY;
    }

    public void setMax(int value) {
        lifechanceMax = value;
    }

    public int menuSelection(int menuUser) {
        if (menuUser == 1) {
            setMax(2);
            System.out.println("HARD MODE SELECTED - 2 number of lives selected");
        } else if (menuUser == 2){
            setMax(10);
            System.out.println("EASY MODE SELECTED 10 number of lives selected");
        } else if (menuUser == 3) {
            customLives();
            System.out.println("FREE MODE SELECTED- user selected number of lives");
        } else {
            System.out.println("Error");
        }
        return lifechanceMax;
    }

    public int customLives() {
        System.out.println("Please select the number of custom lives you want: ");
        Scanner in = new Scanner(System.in);
        int customlifeNum = in.nextInt();
        setMax(customlifeNum);
        return lifechanceMax;
    }

    public int getLifechanceMax() {
        return lifechanceMax;
    }
}
