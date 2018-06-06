/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card.shuffling.and.dealing.simulation;

import java.util.Random;

/**
 *
 * @author KENNE
 */
public class DeckOfCards {
    private Card[] deck;//array of card object
    private int currentCard; //index of next Card to be dealt (0-50)
    private static final int NUMBER_OF_CARDS = 52;// CONSTANT # of Cards
    //Random number Generator
    private static final Random randomNumbers = new Random();
    
    //constructor fills Deck of Cards

    public DeckOfCards() {
        String[] faces ={"Ace", "Deuce", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", };
        String[] suits ={"Hearts", "Diamonds", "Clubs", "Spades"};
        
        deck = new Card[ NUMBER_OF_CARDS];// create array of card objects
        currentCard = 0; //set CurrentCard so first Card dealt is deck[0]
        
        // populate deck with Card objects
        for (int count = 0; count < deck.length; count++)
        {
            deck[count] = new Card(faces[count % 13 ], suits[count/13]);
        }
    }//end DecfCards constructor
    // shuffle deck of Cards with one-pass algorithm
    
    public void shuffle(){
        //after shuffling, dealing should start at deck[0] again
        currentCard = 0; //reinitialize currentCard
        
        // for each Card, pick another random Card (0-51)  and swap them
        for ( int first = 0; first < deck.length; first++)
        {
            // select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            
            // swap current Card with randomly
            Card temp = deck[second];
            deck[first] = deck[second];
            deck[second] = temp;
        }//end for
    } // end method shuffle
//deal one Card   
    
    public Card dealCard()
    {
       // determine whether Cards remain to be dealt
        if(currentCard < deck.length)
            return deck[currentCard++]; //return current Card in array
        else
            return null; // return null to indicate that all Cards were dealt
    } // end method dealCard
} // end Class DeckOfCards
