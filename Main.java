import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        String[] things = {"scissors", "paper", "rock"};
        int scoreComputer = 0;
        int scorePlayer = 0;
        //Options, means what variable name tells
        String welcomeMessage = "Welcome to Rock, Paper, Scissors Game. \n" +
                "Choose your option from one of these and type them into console\n" +
                "Available options are: Rock, Paper, Scissors";
        String playerWin = "You WON";
        String playerLose = "You LOST";
        String wrongInput = "Needed input: (Rock, Paper, Scissors)";

        //Specify how many rounds are supposed to be
        int rounds = 4;

        //Prints welcomeMessage
        System.out.println(welcomeMessage);

        //For loop created for playing specified number of rounds
        for (int i = 0; i <= rounds; i++) {
            //Text shown next to player's line where types its chosen option.
            System.out.print("Choose (ROCK,PAPER,SCISSORS): ");

            //Read user's input in next line
            String input = scanner.nextLine();
            input = input.toLowerCase();

            //Random Computer choice
            int randomChoice = (int) ((Math.random() * (3)));
            String randomChosen = things[randomChoice];

            //Info to user about computer choice
            System.out.println("Computer chose " + things[randomChoice].toUpperCase());

            //Checks if player's input is same as randomChosen and makes DRAW if it is or else it checks between options who won.
            if (input.equalsIgnoreCase(randomChosen)) {
                System.out.println("Computer chose " + randomChosen.toUpperCase() + " and you either so it's DRAW");
            } else {
                switch (input) {
                    case "rock":
                        if (randomChosen.equals(things[1])) {
                            System.out.println(playerLose);
                            scoreComputer += 1;
                        } else {
                            System.out.println(playerWin);
                            scorePlayer += 1;
                        }
                        break;
                    case "paper":
                        if (randomChosen.equals(things[0])) {
                            System.out.println(playerLose);
                            scoreComputer += 1;
                        } else {
                            System.out.println(playerWin);
                            scorePlayer += 1;
                        }
                        break;
                    case "scissors":
                        if (randomChosen.equals(things[1])) {
                            System.out.println(playerWin);
                            scorePlayer += 1;
                        } else {
                            System.out.println(playerLose);
                            scoreComputer += 1;
                        }
                        break;
                    default:
                        System.out.println(wrongInput);
                }
            }
            //Prints out the score
            System.out.println("\n  Scores \n" + "PC: " + scoreComputer + " YOU: " + scorePlayer);
        }
    }
}

