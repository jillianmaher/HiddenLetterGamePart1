//Mimic a small portion of a popular word game
//Users are trying to figure out a Hidden Word
// In this scenario, the user types in a letter
//   and a position to check
// The method will return the same letter if it matches
// The method will return "*" if the letter exists at a different position
// The method will return "-" if the letter does not exist in the word

import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner keyboard = new Scanner(System.in);
    HiddenWord game = new HiddenWord();    
              //add a String parameter to change the secret word

    System.out.println("Try to Guess The Hidden Word!");
    System.out.print("What is your first guess? ");
    String guess = keyboard.nextLine().substring(0,1).toUpperCase();

    System.out.print("Where is the letter? ");
    int position = keyboard.nextInt();

    System.out.println("Your Clue: " + game.checkLetter(guess, position));
  }
}