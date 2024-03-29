/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package deliverable1;

import java.util.ArrayList;
import java.util.*;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Game {

    private String name = null;
    private GroupOfCards middlePile;
    private int cardsInMiddle;
    /**
     * the title of the game
     */
    private Collection<ArrayList<Player>> players;/**
     * the players of the game
     * @param name
     */

    public Player registerPlayer(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void startGame();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void playGame();

    public void endGame() {
        // TODO - implement Game.endGame
        throw new UnsupportedOperationException();
    }

    public Collection<ArrayList<Player>> getPlayers() {
        return this.players;
    }

    public void setPlayers(Collection<ArrayList<Player>> players) {
        this.players = players;
    }

    /**
     * 
     * @param input
     */
    private boolean isValidInput(String input) {
        // TODO - implement Game.isValidInput
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param input
     */
    private int[] parseInput(String input) {
        // TODO - implement Game.parseInput
        throw new UnsupportedOperationException();
    }

    public Game() {
        // TODO - implement Game.Game
        throw new UnsupportedOperationException();
    }

}//end class
