import java.util.*;
import java.util.Random;
public class SnakesNLadders
{
   public static void main(String args[])
   {
      System.out.println("Snake and Ladder game Played with Single Player Start Position:0");
      int Start=0;
      Random rand = new Random();

      int Snakes[]={56,23,45,62,71,77,85,96};
      int Ladder[]={4,12,22,36,47,69,74,86};     

      while(Start<100)
      {
          int dicei = rand.nextInt(6);
          Start += dicei;
          for(int i=0;i<8;i++)
         {
            if(Start == Snakes[i])
            {
                int dices = rand.nextInt(6);
                Start -= dices;
                System.out.println(" val substracted: "+dices);
            }
            else if(Start == Ladder[i])
            {
               int dicel = rand.nextInt(6);
               Start += dicel;
               System.out.println("value added "+dicel);
             } 
            else
            {
               continue; 
            }
         }
      }
   }
}