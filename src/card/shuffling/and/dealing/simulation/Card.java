package card.shuffling.and.dealing.simulation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KENNE
 */
public class Card {
    private String face;//face of card ("ace, Deuce")
    private String suit;//suit of card ("Hearts", "Diamonds")
    
    
    // two argument constructor initializes card's face and suit
    public Card(String cardFace, String cardSuit) {
        face = cardFace;
        suit = cardSuit;
    }// end two argument Constructor
    
    //return string representation of Card
    public String toString()
    {
        return face + " of " +suit;
    }// end method toString
    
}
