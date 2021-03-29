import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //scanner for greeting and intro
  Scanner scan = new Scanner(System.in);
  //print statement letting user know what game they are playing
  System.out.println("Welcome back to The Hunter video game. ");

  System.out.println("How many arrows are in the quiver?");
// scan statement allows to store the users answer
  int quiver = scan.nextInt();
//allows user to enter the amount of arrows they want to go back and get after shooting them.
  System.out.println("Please enter the amount of arrows you want to retreive after you have shot. (Must be less then amount in quiver). ");

  int arrows = scan.nextInt();
//recursion calling back to the main method 
  System.out.println("There are " + arrowsLeft( quiver, arrows)  + " in quiver for next time you play.");
  amoutArrows(arrows);

  }
  // start of second method
  static int arrowsLeft(int quiver, int arrows) 
  {
    //subtracts the amount from quiver to arrows
   return quiver-arrows;
  }
  public static void amoutArrows(int arrows)
  {
    //if there are 0 arrows left in quiver they cannot shoot anymore
    if ( arrows == 0 )
    {
    System.out.println ("You now have " + arrows + " left to shoot ");
    }
    //if they have more than one arrow in their quiver they can shoot what they have
    else
    {
    System.out.println("You shot an arrow!");
    //after every arrow is fired one is shot so it is subtracted by 1 (base case under)
    arrows--;
    amoutArrows(arrows);
    }
  }
}