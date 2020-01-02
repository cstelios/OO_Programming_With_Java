import java.util.ArrayList;
import java.util.Comparator;

public class Jumper implements Comparable<Jumper> {
    private String name;
    private ArrayList<Integer> jumps;
    private int score;
    
    public Jumper(String name) {
        this.name = name;
        this.jumps = new ArrayList<Integer>();
        this.score = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public ArrayList<Integer> getJumps() {
        return this.jumps;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.score + " points)";
    }
    
    @Override
    public int compareTo(Jumper jumper) {
        return this.score - jumper.score;
    }
    
    public void increaseScore(int score) {
        this.score += score;
    }
    
    public void addJump(int distance) {
        this.jumps.add(distance);
    }
}
