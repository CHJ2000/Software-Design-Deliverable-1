package deliverable1;

public class PlayerActions {

    private ArrayList<Player> players;
    private Game game;
    private int playerId;
    private int opponentId;
    private Scanner inputScanner;

    /**
     * 
     * @param id
     * @param suit
     * @param value
     */
    public void requestCard(int id, String suit, int value) {
        // TODO - implement PlayerActions.requestCard
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param id
     * @param suit
     * @param value
     */
    public Card giveCard(int id, String suit, int value) {
        // TODO - implement PlayerActions.giveCard
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param id
     */
    public Card getCard() {
        // TODO - implement PlayerActions.goFish
        throw new UnsupportedOperationException();
    }

    public int getPlayerId() {
        return this.playerId;
    }

    /**
     * 
     * @param playerId
     */
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getOpponentId() {
        return this.opponentId;
    }

    /**
     * 
     * @param opponentId
     */
    public void setOpponentId(int opponentId) {
        this.opponentId = opponentId;
    }

    /**
     * 
     * @param input
     */
    private boolean isValidInput(String input) {
        // TODO - implement PlayerActions.isValidInput
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param input
     */
    private int[] parseInput(String input) {
        // TODO - implement PlayerActions.parseInput
        throw new UnsupportedOperationException();
    }

}