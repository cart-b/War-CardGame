import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) 
    {
        int[] deck1 = new int[52];
        int[] deck2 = new int[52];

        deck1 = shuffle(fill(deck1));
        deck2 = shuffle(fill(deck2));
        System.out.println(play(deck1,deck2));
    }

    public static int[] fill(int[] deck)
    {
        int t = 0;

        for(int i = 1; i < 14; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                deck[t] = i;
                t++;
            }
        }

        return deck;
    }

    public static int[] shuffle(int[] deck)
    {
        int rand = 0;
        int rand2 = 0;
        int hold = 0;
        
        for(int i = 0; i < 1000000; i++)
        {
            rand = (int)(Math.random()*52);
            rand2 = (int)(Math.random()*52);

            hold = deck[rand];
            deck[rand] = deck[rand2];
            deck[rand2] = hold;
        }

        return deck;
    }
    
    
    public static void printdeck(int[] deck)
    {
        int t = 0;

        for(int i = 0; i < deck.length; i++)
        {
            System.out.println(deck[i]);
        }
    }


    public static String play(int[] deck1, int[] deck2)
        {
            int count = 0;
            int last = 0;

            while((deck1.length != 0) && (deck2.length != 0))
            {
                if(deck1[count] < deck2[count])
                {
                    deck2 = Arrays.copyOf(deck2, deck2.length + 1);
                    deck2[deck2.length-1] = deck1[0];

                    last = deck1[deck1.length-1];
                    deck1 = Arrays.copyOf(deck1, deck1.length - 1);
                    
                    for(int i = 1; i < deck1.length-1; i++)
                    {
                        deck1[i-1] = deck1[i]
                    }
                    deck1[length-1] = last;

                    System.out.println("Deck1 length" + deck1.length + " Deck2 length" + deck2.length);
                }
                
                else if(deck2[count] < deck1[count])
                {
                    printdeck(deck1);
                    System.out.println(" ");
                    printdeck(deck2);

                    deck1 = Arrays.copyOf(deck1, deck1.length + 1);
                    deck1[deck1.length-1] = deck2[0];

                    last = deck2[deck2.length-1];
                    deck2 = Arrays.copyOf(deck2, deck2.length - 1);
                    
                    for(int i = 1; i < deck2.length-1; i++)
                    {
                        deck2[i-1] = deck2[i]
                    }
                    deck2[length-1] = last;

                    System.out.println("Deck1 length" + deck1.length + " Deck2 length" + deck2.length);
                }

                else
                {
                    return "war";
                    //War(deck1, deck2);
                }

                count++;
                
            }
            return "end";


        }
  
  

    

//     public static void War(int[] deck1, int[] deck2)
//     {
//             int[] facedown1 = deck1[0,2]
//             int[] facedown2 = deck2[0,2]

//             if(deck1[3] > deck2[3])
//             {
            
//             }

//             else if (deck1[3] > deck2[3])
//             {
                
//             }

//             else
//             {
                   
//             }
//     }
}
