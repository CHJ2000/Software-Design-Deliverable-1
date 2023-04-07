/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package deliverable1;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player {

    private String name;
    private int id;
    private int score;
    private ArrayList<Card> hand;

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

    public int getId() {
        return this.id;
    }

    public int getScore() {
        return this.score;
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    /**
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * 
     * @param hand
     */
    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void showHand() {
        // TODO - implement Player.showHand
        throw new UnsupportedOperationException();
    }

    public void leaveGame() {
        // TODO - implement Player.leaveGame
        throw new UnsupportedOperationException();
    }

    public List<Integer> getScoreHistory() {
        // TODO - implement Player.getScoreHistory
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param name
     */
    public Player(String name) {
        // TODO - implement Player.Player
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param suit
     * @param value
     */
    private void requestCard(String suit, int value) {
        // TODO - implement Player.requestCard
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param playerId
     * @param suit
     * @param value
     */
    private void giveCard(int playerId, String suit, int value) {
        // TODO - implement Player.giveCard
        throw new UnsupportedOperationException();
    }

}
