/*Started this out with one of RPI's Classes and worked on this significantly
by adding some code of my own and showing appropriate coding conventions while doing so*/

//NOTE TO SELF: THIS IS CODING ONE SINGLE INDIVIDUAL DIE

import java.util.*; //We'll be using Scanners, ArrayLists, and Array methods if I'll use them

public class Die{ 
   private int value;   //The die's value
   private int numSides;   //The number of sides for each die coded
   private int numRolls;   //The number of rolls for each die coded
   private static int totalRolls=0;    //Total rolls for all Die
   public static final int DefNumOF$ides=6; //Default number of sides for each of the Dice
   
   public Die(){
      this.value=0;
      this.numSides=DefNumOF$ides;  //Default value of 6
      this.numRolls=0;
   }
   public Die(int numSides){
      this.value=0;
      this.numSides=numSides;
      this.numRolls=0;
   }
   
   //START Getter methods and settor methods
   
   public int getValue(){
      return this.value;
   }
   public void setValue(int value){
      this.value=value;
   }
   public int getNumRolls(){
      return this.numRolls;
   }
   public int getNumSides(){
      return this.numSides;
   }
   public static int getTotalRolls(){
      return totalRolls;
   }
   public String toString(){
      return "\nValue: "+value+"\n"
      +"numSides="+numSides+"\n"+
      "numRolls="+numRolls+"\n"+
      "totalRolls="+totalRolls;
   }
   public int roll(){
      this.value=(int)(Math.random()*DefNumOF$ides+1);
      this.numRolls++;
      totalRolls++;
      return this.value;
      
   }
   
   
   
}