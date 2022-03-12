/*Started this out with one of RPI's Classes and worked on this significantly
by adding some code of my own and showing appropriate coding conventions while doing so*/

import java.util.Scanner; //We will be using a Scanner to prompt the user

public class DieTester{
   public static String winningMessages(String name){
      String[] m={"Hey, "+name+" you\'re a winner!", "Way to go "+name+", you\'ve won!", "Yeah "+name+", whatever, so you\'ve won."};
      int myRandom=(int)(Math.random()*m.length); //AVOID HARD CODING
      return m[myRandom];
   }
   public static String losingMessages(String name){
      String[] m={name+" LOSER!", "Sorry "+name+", you\'ve lost", "Well "+name+", sometimes you win and sometimes you lose. I win and you LOST!"};
      int myRandom=(int)(Math.random()*m.length); //AVOID HARD CODING
      return m[myRandom];
   }

   public static void main (String[] args){
      Scanner input = new Scanner (System.in); //create a new scanner naming it input
      //Initialize the two dice
      Die d1=new Die(6);
      Die d2=new Die(6);
      //String win_lose_or_roll_again="unassigned";
      System.out.print("What is your name? ");
      String users_name=input.nextLine();
      System.out.print("Input anything to start your first roll. ");
      String useless_value1=input.nextLine(); //This makes it so that the user can input anything, and the game will move on.
      
      
      d1.roll();
      d2.roll();
      //Roll both of the dice
      int sum=d1.getValue()+d2.getValue();
      int roll_again=0; //This value will only be used if the user has to roll again.
      System.out.println(sum);
      System.out.println("Your sum is: "+sum); //I thought this would be a convenient thing to add.
      if(sum==2 || sum==3 || sum==12) System.out.println(losingMessages(users_name)); //2, 3, or 12 means the user LOST!
      else if(sum==7 || sum==11) System.out.println(winningMessages(users_name)); //7 or 11 means the user WON!
      else{
         
         roll_again=sum; //Initial number is achieved checker
         do{//using a do while loop because the sum has to equal roll again on the first iteration making a while loop redunandant
            System.out.println("You have to roll again!");
            System.out.print("Input anything for your next roll. ");
            useless_value1=input.nextLine();
            d1.roll();
            d2.roll();
            sum=d1.getValue()+d2.getValue();
            System.out.println("Your new sum: "+sum);
         }while(sum!=roll_again && sum!=7); //Learned through debugging to use && here and not ||
         
         if(sum==7) System.out.println(losingMessages(users_name));
         if(sum==roll_again) System.out.println(winningMessages(users_name));
         
      }
      System.out.println("\nEND RESULT:\n"+"Die 1: "+d1+"\n"+"Die 2: "+d2);
      //Not explicitly required but I thought to add this part to show that the dice have the intended parts
   }
}