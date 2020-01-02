import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cardsInHand;
    
    public Hand() {
        this.cardsInHand = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        this.cardsInHand.add(card);
    }
    
    public void print() {
        for (Card card : this.cardsInHand) {
            System.out.println(card.toString());
        }
    }
    
    public void sort() {
        for (int i = 0 ; i < this.cardsInHand.size() ; i++) {
            for (int x = i+1 ; x < this.cardsInHand.size() ; x++) {
                if (this.cardsInHand.get(i).compareTo(this.cardsInHand.get(x)) > 0) {
                    Card temp = this.cardsInHand.get(i);
                    this.cardsInHand.set(i, this.cardsInHand.get(x));
                    this.cardsInHand.set(x,temp);
                }
            }
        }
    }
    
    private int sumHand() {
        int sum = 0;
        for (Card card : this.cardsInHand) {
            sum += card.getValue();
        }
        return sum;
    }
    
    @Override
    public int compareTo (Hand hand) {
        if (this.sumHand() > hand.sumHand()) {
            return 1;
        } else if (this.sumHand() < hand.sumHand()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public void sortAgainstSuit() {
        Collections.sort(this.cardsInHand, new SortAgainstSuitAndValue());
        //this.print();
    }
}
