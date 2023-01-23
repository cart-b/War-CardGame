
import java.util.ArrayList;
import java.util.Collections;

import javax.lang.model.util.ElementScanner14;

public class Main {

    public static void main(String[] args) 
    {
        ArrayList<Integer> deck = new ArrayList<>();
        ArrayList<Integer> hand1 = new ArrayList<>();
        ArrayList<Integer> hand2 = new ArrayList<>();
        

        shuffle(fill(deck));
        
        split(deck, hand1, hand2);

        System.out.println(play(hand1, hand2));
    }

        //creates a deck of cards
    public static ArrayList<Integer> fill(ArrayList<Integer> deck)
    {
        for(int i = 1; i < 14; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                deck.add(i);
            }
        }

        return deck;
    }

        //Shuffles deck
    public static ArrayList<Integer> shuffle(ArrayList<Integer> deck)
    {
        int rand = 0;
        int rand2 = 0;
        
        for(int i = 0; i < 1000000; i++)
        {
            rand = (int)(Math.random()*52);
            rand2 = (int)(Math.random()*52);
            Collections.swap(deck, rand, rand2);
        }
        return deck;
    }
    
        //prints a deck/arraylist
    public static void printdeck(ArrayList<Integer> deck)
    {
        for(int i = 0; i < deck.size(); i++)
        {
            System.out.println(deck.get(i));
        }
    }

        //splits a deck into two 26 card hands
    public static void split(ArrayList<Integer> deck,ArrayList<Integer> hand1,ArrayList<Integer> hand2)
    {
        hand1.addAll(deck.subList(0, 26));
        hand2.addAll(deck.subList(26, 51));
    }

    //war game function
    public static String play(ArrayList<Integer> hand1, ArrayList<Integer> hand2)
        {
            int count = 0;

            while((hand1.size() != 0) && (hand2.size() != 0))
            {

                //scenario 1, hand2 has better card than hand1
                if(hand1.get(0) < hand2.get(0))
                {
                    int element = hand1.get(0);
                    hand2.add(element);
                    hand1.remove(0);
                }





                //scenario 1, hand1 has better card than hand2                
                else if(hand2.get(0) < hand1.get(0))
                {
                    int element = hand2.get(0);
                    hand1.add(element);
                    hand2.remove(0);
                }


                //scenario 3 hand1 and hand2 cards equal; war
                else
                {
                    War(hand1, hand2);
                }

                count++;
                System.out.println(count + " " + hand1.size() + " " +  hand2.size());

                if(count > 1000)
                {
                hand1.clear();
                }

            }

            if(hand1.size() == 0)
            {
                return "hand2 wins";
            }
            else
            {
                return "hand1 wins";
            }



        }
  
  

    

    public static void War(ArrayList<Integer> hand1, ArrayList<Integer> hand2)
    {
        //hand1 wins war
            if(hand1.get(4) > hand2.get(4))
            {
                hand1.addAll(hand2.subList(0, 4));

                for(int i = 0; i < 5; i++)
                {
                hand2.remove(i);
                }
            }

        //hand2 wins war
            else if (hand1.get(4) < hand2.get(4))
            {
                hand2.addAll(hand1.subList(0, 4));    

                for(int i = 0; i < 5; i++)
                {
                hand1.remove(i);
                }
            }
    }
}
