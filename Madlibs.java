
/**
 * A madlib generator that takes user input and creates a madlib. 
 *
 * @Dylan Nguyen
 * @9/16/2022
 */
import java.util.Scanner;
public class Madlibs
{
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ///user initializes
        System.out.println("Enter your name: ");
        String user = input.nextLine();
        System.out.println("Enter the year (YYYY): ");
        int year = input.nextInt();
        System.out.println("Enter the month (MM): ");
        int month = input.nextInt();
        System.out.println("Enter the day (DD): ");
        int day = input.nextInt();
        ///clear buffer
        input.nextLine();
        ///madlib generator
        System.out.println ("Enter four NOUNS below");
        String noun1 = input.nextLine();
        String noun2 = input.nextLine();
        String noun3 = input.nextLine();
        String noun4 = input.nextLine();
        System.out.println ("Enter a VERB below");
        String verb = input.nextLine();
        System.out.println ("Enter an ING VERB below (running, eating, etc.)");
        String ing = input.nextLine();
        System.out.println ("Enter two VERBS in the PAST TENSE below");
        String verbPast1 = input.nextLine();
        String verbPast2 = input.nextLine();
        System.out.println ("Enter an ADJECTIVE below");
        String adjective = input.nextLine();
        System.out.println ("Enter the name of a STATE below");
        String state = input.nextLine();
        System.out.println ("Enter an ACTIVITY below");
        String activity = input.nextLine();
        System.out.println ("Enter a FULL NAME below");
        String fullName = input.nextLine();
        System.out.println ("Enter a RELATIVE below ('aunt', 'uncle', etc.)");
        String relative = input.nextLine();
        System.out.println ("Enter the name of a CHAIN RESTAURANT below");
        String restaurant = input.nextLine();
        System.out.println ("Enter a BODY PART below");
        String body = input.nextLine();
        
        //print madLib story
        System.out.println ("A "+ noun1 +" in "+ state +" was arrested this morning after he "+ verbPast1 +" in front of a "+ noun2);
        System.out.println (fullName+" had a history of " + ing + ", but no one - not even his " + noun3 + " -ever imagined he'd " + verb + " with a " + noun4 + " stuck in his " + body);
        System.out.println ("'I always thought he was " + adjective + ", but I never thought he'd do something like this. Even his " + relative + " was surprised.'");
        System.out.println ("After a brief " + activity + ", police followed him to a " + restaurant + ", where he reportedly " + verbPast2 + " in the fryer");
        System.out.println();
        System.out.println("Generated by " + user + "," + day + "/" + month + "/" + year);
    }
}