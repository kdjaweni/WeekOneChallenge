/*BEGIN

        Define an array list of 6 numbers
        Define integers: score, x, y, die1,die2.

        Create a while loop to repeat the process  as long as total>=100 and answer is Yes
            Randomly pick 2 numbers (x, y)
            Display these two numbers
            If both numbers are 1
               Then  score=25
            Else if one of the number is 1
               Then score =0
            Else
                score = x+y
        Diplay the variable score.
        Accumulate the values of score after each iteration
        Store the result in the variable total
        Ask the user to pick randomly 2 numbers again
        If the answer is Yes
        Continue
        If the anwser is No
        End the process
        END
*/


import jdk.nashorn.internal.runtime.arrays.ArrayIndex;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class weekOneChallenge
{
    public static void main( String [] args) {
        int score = 0;
        int total = 0;
        int die1, die2;

        System.out.println("WELCOME TO MY GAME");
        ArrayList<String> dice = new ArrayList<>();
        dice.add("1");
        dice.add("2");
        dice.add("3");
        dice.add("4");
        dice.add("5");
        dice.add("6");
        System.out.println(dice);

        String answer;
        do {
            System.out.println("Please roll the dice");
            Random random = new Random();
            int x = random.nextInt(dice.size());
            int y = random.nextInt(dice.size());
            String choice = "";

            die1 = x + 1;
            die2 = y + 1;
            System.out.println(die1);
            System.out.println(die2);
            if (die1 == 1 && die2 == 1)
                score = 25;
            else if (die1 == 1 || die2 == 1)
                score = 0;
            else
                score = die1 + die2;

            System.out.println("Your score is : " + score);

            total += score;

            Scanner user = new Scanner(System.in);
            System.out.println("Do you want to roll again?");
            answer = user.nextLine();
            if(answer == "Yes")
                System.out.println( "Please roll the dice");
            else if (answer == "No")
                System.out.println( "Done");

        } while (total <= 100|| answer =="No");
        System.out.println("The total is :" +total);
        System.out.println("Thanks for playing!!!!");
    }
}









