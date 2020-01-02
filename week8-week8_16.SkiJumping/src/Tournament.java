
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tournament {

    private ArrayList<Jumper> participants;
    private Random randomiser;

    public Tournament() {
        this.participants = new ArrayList<Jumper>();
        this.randomiser = new Random();
    }

    public void addParticipant(Jumper jumper) {
        this.participants.add(jumper);
    }

    public void sortByScore() {
        if (this.participants.size() != 1) {
            Collections.sort(this.participants);
        }
    }

    public void reverseOrder() {
        Collections.reverse(this.participants);
    }

    public int getSize() {
        return this.participants.size();
    }

    public Jumper getJumper(int index) {
        return this.participants.get(index);
    }

    public int generateJumpDistance(Jumper jumper) {
        int jumpDistance = 60 + randomiser.nextInt(60);
        jumper.increaseScore(jumpDistance);
        jumper.addJump(jumpDistance);
        
        return jumpDistance;
    }

    public ArrayList<Integer> generateJudgeScore(Jumper jumper) {
        ArrayList<Integer> scoreArray = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            scoreArray.add(10 + randomiser.nextInt(10));
        }

        Integer list[] = new Integer[scoreArray.size()];
        list = scoreArray.toArray(list);
        jumper.increaseScore(calculateJudgeScore(list));

        return scoreArray;
    }

    private int calculateJudgeScore(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int x = (i+1); x < array.length; x++) {
                int y = array[i];
                if (array[x] > array[i]) {
                    array[i] = array[x];
                    array[x] = y;
                }
            }
        }
        return array[1] + array[2] + array[3];
    }
}
