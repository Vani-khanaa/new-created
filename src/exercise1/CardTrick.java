package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Vani
 * @author Vani 
 * modifier 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Scanner s = new Scanner (System.in);
        
        System.out.println("Enter a number and a suit name");
        int un = s.nextInt();
        String su=s.next();
        

        for (int i = 0; i < hand.length; i++)
        
        {
            Card card = new Card();
            card.setValue((int)(1+Math.random()*13));
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
       
          card.setSuit(Card.SUITS[(int)(0+Math.random()*3)]);
            hand[i]=card;
		System.out.println(hand[i].getSuit()+hand[i].getValue());
        }
int flag=0;
for(Card pickedcard:hand)
{
        if(pickedcard.getValue()==un && pickedcard.getSuit().equals(su))
        {
        flag=1;
        System.out.println("Congratulations");
                   
        }
}
        if (flag==0)
        {
        System.out.println("Not found");
        
        
        }
        
        // If the guess is successful, invoke the printInfo() method below.
}
    
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Vani  Jan 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Creativity");
        System.out.println("-- thinking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my car");

        System.out.println();
        
    
    }

}



