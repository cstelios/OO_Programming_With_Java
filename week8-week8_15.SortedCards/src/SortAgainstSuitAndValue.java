import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {
    
    @Override
    public int compare (Card card1, Card card2) {
        int diff = card1.getSuit() - card2.getSuit();
        if (diff == 0) {
            return card1.getValue() - card2.getValue();
        }
        return diff;
    }
}
