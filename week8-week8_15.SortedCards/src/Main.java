
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write some test code here
        Hand hand1 = new Hand();

        hand1.add(new Card(2, Card.SPADES));
        hand1.add(new Card(14, Card.CLUBS));
        hand1.add(new Card(12, Card.HEARTS));
        hand1.add(new Card(2, Card.CLUBS));

        hand1.sort();

        Hand hand2 = new Hand();

        hand2.add(new Card(11, Card.DIAMONDS));
        hand2.add(new Card(11, Card.CLUBS));
        hand2.add(new Card(11, Card.HEARTS));

        int comparison = hand1.compareTo(hand2);

        if (comparison < 0) {
            System.out.println("the most valuable hand contains the cards");
            hand2.print();
        } else if (comparison > 0) {
            System.out.println("the most valuable hand contains the cards");
            hand1.print();
        } else {
            System.out.println("the hands are equally valuable");
        }

        System.out.println("");
        System.out.println("_________________________");
        System.out.println("");

        Card cardTest1 = new Card(3, Card.SPADES);
        Card cardTest2 = new Card(3, Card.SPADES);

        SortAgainstSuitAndValue sorter = new SortAgainstSuitAndValue();
        int sortingVar = sorter.compare(cardTest1, cardTest2);

        if (sortingVar < 0) {
            System.out.println("The highest card is:" + cardTest1);
        } else if (sortingVar > 0) {
            System.out.println("The highest card is:" + cardTest2);
        } else if (sortingVar == 0) {
            System.out.println("The cards are the same.");
        }

        Hand hand = new Hand();

        hand.add(new Card(12, Card.HEARTS));
        hand.add(new Card(4, Card.CLUBS));
        hand.add(new Card(2, Card.DIAMONDS));
        hand.add(new Card(14, Card.CLUBS));
        hand.add(new Card(7, Card.HEARTS));
        hand.add(new Card(2, Card.CLUBS));

        hand.sortAgainstSuit();

        //hand.print();
    }
}
