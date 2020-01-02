
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HangmanLogic {

    private String word;
    private ArrayList<String> dictionary = new ArrayList<String>();
    private ArrayList<String> guessedLetters = new ArrayList<String>();
    private int numberOfFaults;
    private int counter;

    public HangmanLogic(ArrayList<String> list) {
        this.dictionary = list;
        this.word = "";
        this.guessedLetters.clear();
        this.numberOfFaults = 0;
        this.counter = 6;
    }
    
    public void GenerateWord() {
        Random random = new Random();
        
        int length = 0;
        String generatedWord = "";
        while (length < 3) {
            generatedWord = this.dictionary.get(random.nextInt(this.dictionary.size()));
            length = generatedWord.length();
        }
        this.word = generatedWord.toUpperCase();
    }
    
    public void newGame() {
        GenerateWord();
        this.guessedLetters.clear();
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        String guessedLettersPrint = "";
        for (String letter : this.guessedLetters) {
            guessedLettersPrint += letter + ",";
        }
        return guessedLettersPrint;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public String getWord() {
        return this.word;
    }

    public void guessLetter(String letter) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (characters.contains(letter)) {
            if (!this.guessedLetters.contains(letter)) {
                this.guessedLetters.add(letter);
                Collections.sort(guessedLetters);
                if (!this.word.contains(letter)) {
                    this.numberOfFaults++;
                }
            }
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
        // return the hidden word at the end
        String hiddenWord = "";
        int i = 0;
        String character = "";
        while (i < word.length()) {
            character = "" + word.charAt(i);
            if (this.guessedLetters.contains(character)) {
                hiddenWord += character;
            } else {
                hiddenWord += "_";
            }
            i++;
        }
        return hiddenWord;
    }
    
    public int Countdown(){
        this.counter = this.counter - 1;
        return this.counter;
    }
}
