import java.util.*;
import java.util.Random;
public class Snake_Ladder
{
   public static void main(String args[])
   {
      int Start=0;
      System.out.println("Welcome to SNAKES AND LADDERS");
      Random rand = new Random();
      int Snakes[]={56,23,45,62,71,77,85,96};
      int Ladder[]={4,12,22,36,47,69,74,86};     

      int dicecount=0;
      while(Start<100)
      {
         int dicei = rand.nextInt(6);
         Start += dicei;
         dicecount +=1;
         if(Start<100) 
         { 
            System.out.println("position of dice: "+Start);  
            for(int i=0;i<8;i++)
            {
               if(Start == Snakes[i])
               {
                  int dices = rand.nextInt(6);
                  Start -= dices;
                  dicecount +=1;
                
                  System.out.println(" val substracted: "+dices);
               }  
               else if(Start == Ladder[i])
               {
                  int dicel = rand.nextInt(6);
                  Start += dicel;
                  dicecount +=1;
               
                  System.out.println("value added "+dicel);
               } 
               else
               {
               continue; 
               }
            }
         }
         else if(Start>100)
         {
            Start -=dicei;
            dicecount+=1;
         }
         else 
         {
            break;
         }  
      }
   System.out.println("start val: "+Start);
   System.out.println("no.of times dice rolled: "+dicecount);
   }  
}