import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //GenerateString word = new GenerateString();
        File f = new File("dict2.txt");
        Scanner readFile = new Scanner(f);
        ArrayList<String> dictionary = new ArrayList<String>();
        
        while (readFile.hasNext()) {
            dictionary.add(readFile.next());
        }
        
        HangmanLogic logic = new HangmanLogic(dictionary);
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();
    }
}
