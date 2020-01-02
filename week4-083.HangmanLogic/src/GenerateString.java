/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Random;

public class GenerateString {
    private String string;
    private Random random = new Random();
    
    public GenerateString() {
        this.string = "";
    }
    
    public String buildString() {
        int length = random.nextInt(7);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (this.string.length() < length) {
            int position = this.random.nextInt(26);
            this.string += characters.charAt(position);
        }
        return this.string;
    }
    
    public String toString() {
        return this.string;
    }
}
