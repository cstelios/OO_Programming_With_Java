import java.util.ArrayList;
import java.util.Scanner;

public class Birdwatcher {
    private ArrayList<Bird> database;
    private final Scanner reader = new Scanner(System.in);
    
    public Birdwatcher() {
        this.database = new ArrayList<Bird>();
    }
    
    public void getCommand() {
        System.out.print("? ");
        this.readCommand(reader.nextLine());
    }
    
    public void addBird() {
        int birdFinderCkeck = 0;
        System.out.print("Name: ");
        String birdName = reader.nextLine();
        System.out.print("Latin Name: ");
        String birdLatinName = reader.nextLine();
        for (Bird bird : this.database) {
            if (bird.getName().equals(birdName) && bird.getLatinName().equals(birdLatinName)) {
                System.out.println("Bird already exists:\n" + bird);
                birdFinderCkeck++;
                break;
            } else if(bird.getName().equals(birdName)) {
                System.out.println("Bird 'name' already exists:\n" + bird);
                birdFinderCkeck++;
                break;
            } else if (bird.getLatinName().equals(birdLatinName)) {
                System.out.println("Bird 'latin name' alreadey exists:\n" + bird);
                birdFinderCkeck++;
                break;
            }
        }
        if (birdFinderCkeck == 0) {
            this.database.add(new Bird(birdName, birdLatinName));
        }
        this.getCommand();
    }
    
    public void logObservation(){
        int checkVariable = 0;
        System.out.print("What was observed:? ");
        String birdObserved = reader.nextLine();
        for (Bird bird : this.database) {
            if (bird.getName().equals(birdObserved)) {
                bird.observe();
                checkVariable++;
                break;
            }
        }
        if (checkVariable == 0) {
            System.out.println("Is not a bird!");
        }
        this.getCommand();
    }
    
    public void printDatabase() {
        for (Bird bird : this.database) {
            System.out.println(bird);
        }
        this.getCommand();
    }
    
    public void printSelectedBird() {
        System.out.print("What? ");
        String selectedBird = reader.nextLine();
        for (Bird bird : this.database) {
            if (bird.getName().equals(selectedBird)) {
                System.out.println(bird);
                break;
            }
        }
        this.getCommand();
    }
    
    public void readCommand(String command) {
        command = command.toUpperCase();
        if (command.equals("ADD")) {
            this.addBird();
        } else if (command.equals("OBSERVATION")) {
            this.logObservation();
        } else if (command.equals("STATISTICS")) {
            this.printDatabase();
        } else if (command.equals("SHOW")) {
            this.printSelectedBird();
        } else if (command.equals("QUIT")) {
            
        } else {
            System.out.println("This command is not recognised. Please try again.");
            this.getCommand();
        }
    }
}
