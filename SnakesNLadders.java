import java.util.*;
import java.util.Random;
public class SnakesNLadders
{
   public static void main(String args[])
   {
      System.out.println("Snake and Ladder game Played with Single Player Start Position:0");
      int Start=0;
      Random rand = new Random();
      int dicei = rand.nextInt(6);
      Start += dicei;
      System.out.println("dice rolled: "+Start);
   }
}