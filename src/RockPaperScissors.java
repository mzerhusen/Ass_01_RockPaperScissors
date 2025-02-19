import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerOne;
        String playerTwo;
        String playAgain;
        boolean validPlayerOne = false;
        boolean validPlayerTwo = false;
        boolean validPlayAgain = false;
        boolean newGame = true;

        do
        {
            //Get Player One input
            do
            {
                System.out.print("Player One, please select 'R' for Rock, 'P' for Paper, or 'S' for Scissors: ");
                playerOne = in.nextLine();
                playerOne = playerOne.toUpperCase();
                if(playerOne.equals("R") || playerOne.equals("P") || playerOne.equals("S"))
                {
                    validPlayerOne = true;
                }
                else
                {
                    System.out.println(playerOne + " is not a valid move, please enter 'R' for Rock, 'P' for Paper, or 'S' for Scissors.");
                }
            }
            while(!validPlayerOne);

            //Get Player Two input
            do
            {
                System.out.print("Player Two, please select 'R' for Rock, 'P' for Paper, or 'S' for Scissors: ");
                playerTwo = in.nextLine();
                playerTwo = playerTwo.toUpperCase();
                if(playerTwo.equals("R") || playerTwo.equals("P") || playerTwo.equals("S"))
                {
                    validPlayerTwo = true;
                }
                else
                {
                    System.out.println(playerTwo + " is not a valid move, please enter 'R' for Rock, 'P' for Paper, or 'S' for Scissors.");
                }
            }
            while(!validPlayerTwo);

            // Resolve the game
            if(playerOne.equals("R"))
            {
                if(playerTwo.equals("R"))
                    System.out.println("Both players selected Rock. It's a tie!");
                else if(playerTwo.equals("P"))
                    System.out.println("Player One selected Rock, Player Two selected Paper. Player Two wins!");
                else
                    System.out.println("Player One selected Rock, Player Two selected Scissors. Player One wins!");
            }
            else if(playerOne.equals("P"))
            {
                if(playerTwo.equals("P"))
                    System.out.println("Both players selected Paper. It's a tie!");
                else if(playerTwo.equals("S"))
                    System.out.println("Player One selected Paper, Player Two selected Scissors. Player Two wins!");
                else
                    System.out.println("Player One selected Paper, Player Two selected Rock. Player One wins!");
            }
            else
            {
                if(playerTwo.equals("S"))
                    System.out.println("Both players selected Scissors. It's a tie!");
                else if(playerTwo.equals("R"))
                    System.out.println("Player One selected Scissors, Player Two selected Rock. Player Two wins!");
                else
                    System.out.println("Player One selected Scissors, Player Two selected Paper. Player One wins!");
            }
            do
            {
                System.out.print("Do you want to play again? (Y/N) ");
                playAgain = in.nextLine();
                playAgain = playAgain.toUpperCase();
                if(playAgain.equals("Y"))
                {
                    validPlayAgain = true;
                    newGame = true;
                }
                else if(playAgain.equals("N"))
                {
                    validPlayAgain = true;
                    newGame = false;
                }
                else
                {
                    System.out.println(playAgain + "is not a valid input. Please enter 'Y' to play again or 'N' to stop.");
                }
            }
            while(!validPlayAgain);
        }
        while(newGame);
    }
}