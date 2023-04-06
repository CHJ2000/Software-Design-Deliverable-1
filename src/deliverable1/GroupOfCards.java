/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package deliverable1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * 
     * @param card
     */
    public void addCard(Card card) {
        // TODO - implement GroupOfCards.addCard
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param index
     */
    public Card removeCard(int index) {
        // TODO - implement GroupOfCards.removeCard
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param index
     */
    public Card getCard(int index) {
        // TODO - implement GroupOfCards.getCard
        throw new UnsupportedOperationException();
    }

    public int getNumOfCards() {
        // TODO - implement GroupOfCards.getNumOfCards
        throw new UnsupportedOperationException();
    }

    public void clear() {
        // TODO - implement GroupOfCards.clear
        throw new UnsupportedOperationException();
    }

}//end class
