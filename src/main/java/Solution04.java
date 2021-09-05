/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rishi Gadhia
 */
/*
Mad libs are a simple game where you create a story template with blanks for words.
 You, or another player, then construct a list of words and place them into the story,
  creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective
and injects those into a story that you create.

Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!
Constraints
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.
e.g. use printf() instead of println()
 */


import java.util.*;
public class Solution04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompt user for noun, verb, adjective, adverb and scan the data
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();
        System.out.println("Enter a verb: ");
        String verb = in.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective = in.nextLine();
        System.out.println("Enter an adverb: ");
        String adverb = in.nextLine();

        // Use printf and substitute the variables and produce an output
        System.out.printf("Do you %s your %s %s %s? That's hilarious!",verb,adjective,noun,adverb);

    }

}
