/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card.shuffling.and.dealing.simulation;

/**
 *
 * @author KENNE
 */
public class CardShufflingAndDealingSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); //place Cards in random order
         // print all 52 Cards in the order in which they are dealt
         
        for ( int i = 1; i <=52; i++)
        {
            //deal and display 
            System.out.printf("%-19s", myDeckOfCards.dealCard() ); 
            
            if (i % 4 == 0)// output a newline after every fourth Card
                System.out.println();
        }// end for
    }// end main 
}// end class DeckOfCardsTest
