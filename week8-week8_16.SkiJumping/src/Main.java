
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner reader = new Scanner(System.in);
        Tournament tournament = new Tournament();

        System.out.println("Kumpula ski jumping week");

        System.out.println("\nWrite the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String jumperName = reader.nextLine();
            if (jumperName.equals("")) {
                break;
            }
            tournament.addParticipant(new Jumper(jumperName));
        }

        System.out.println("\nThe tournament begins!");

        int tournamentRoundNumber = 0;
        while (true) {
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit:");
            String jumpCommand = reader.nextLine();
            if (!jumpCommand.equals("jump")) {
                break;
            }

            tournamentRoundNumber++;
            System.out.println("\nRound " + tournamentRoundNumber);

            if (tournamentRoundNumber > 1) {
                tournament.sortByScore();
            }

            System.out.println("\nJumping order:");
            for (int i = 0; i < tournament.getSize(); i++) {
                int x = (i + 1);
                System.out.println("   " + x + ". " + tournament.getJumper(i));
            }

            System.out.println("\nResults of round " + tournamentRoundNumber);

            for (int i = 0; i < tournament.getSize(); i++) {
                System.out.println("  " + tournament.getJumper(i).getName());
                System.out.println("    length: " + tournament.generateJumpDistance(tournament.getJumper(i)));
                System.out.println("    judge votes: " + tournament.generateJudgeScore(tournament.getJumper(i)));
            }
        }
        System.out.println("\nThanks!");

        tournament.sortByScore();
        tournament.reverseOrder();

        System.out.println("\nTournament results:");
        System.out.println("Position    Name");
        for (int i = 0; i < tournament.getSize(); i++) {
            int x = (i + 1);
            System.out.println(x + "           " + tournament.getJumper(i));
            System.out.print("            jump lengths: ");
            for (int k = 0 ; k < tournament.getJumper(i).getJumps().size() ; k++) {
                System.out.print(tournament.getJumper(i).getJumps().get(k));
                if (k == (tournament.getJumper(i).getJumps().size()-1)) {
                    System.out.print(" m\n");
                } else {
                    System.out.print(" m, ");
                }           
            }
            
        }
    }
}
