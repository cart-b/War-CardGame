
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) 
    {
        ArrayList<Integer> deck = new ArrayList<>();
        ArrayList<Integer> hand1 = new ArrayList<>();
        ArrayList<Integer> hand2 = new ArrayList<>();
        

        printdeck(fill(shuffle(deck)));
        

        //split deck into 2 hands

        //System.out.println(play(hand1, hand2));
    }

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
    
    
    public static void printdeck(ArrayList<Integer> deck)
    {
        for(int i = 0; i < deck.size(); i++)
        {
            System.out.println(deck.get(i));
        }
    }


    // public static String play(ArrayList<Integer> hand1, ArrayList<Integer> hand2)
    //     {
    //         int count = 0;
    //         int last = 0;

    //         while((hand1.length != 0) && (hand2.length != 0))
    //         {
    //             if(hand1[count] < hand2[count])
    //             {
    //                 hand2 = Arrays.copyOf(hand2, hand2.length + 1);
    //                 hand2[hand2.length-1] = hand1[0];

    //                 last = hand1[hand1.length-1];
    //                 hand1 = Arrays.copyOf(hand1, hand1.length - 1);
                    
    //                 for(int i = 1; i < hand1.length-1; i++)
    //                 {
    //                     hand1[i-1] = hand1[i];
    //                 }
    //                 hand1[hand1.length-1] = last;

    //                 System.out.println("hand1 length " + hand1.length + " hand2 length " + hand2.length);
    //             }
                
    //             else if(hand2[count] < hand1[count])
    //             {
    //                 System.out.println(" ");

    //                 hand1 = Arrays.copyOf(hand1, hand1.length + 1);
    //                 hand1[hand1.length-1] = hand2[0];

    //                 last = hand2[hand2.length-1];
    //                 hand2 = Arrays.copyOf(hand2, hand2.length - 1);
                    
    //                 for(int i = 1; i < hand2.length-1; i++)
    //                 {
    //                     hand2[i-1] = hand2[i];
    //                 }
    //                 hand2[hand2.length-1] = last;

    //                 System.out.println("hand1 length" + hand1.length + " hand2 length" + hand2.length);
    //             }

    //             else
    //             {
    //                 return "war";
    //                 //War(hand1, hand2);
    //             }

    //             count++;
                
    //         }
    //         return "end";


    //     }
  
  

    

//     public static void War(int[] hand1, int[] hand2)
//     {
//             int[] facedown1 = hand1[0,2]
//             int[] facedown2 = hand2[0,2]

//             if(hand1[3] > hand2[3])
//             {
            
//             }

//             else if (hand1[3] > hand2[3])
//             {
                
//             }

//             else
//             {
                   
//             }
//     }
}
