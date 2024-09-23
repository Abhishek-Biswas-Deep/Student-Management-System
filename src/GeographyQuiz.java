/**
 * This class is a geography quiz game. It runs the CountryCapitals.txt file.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */

//importing
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class GeographyQuiz {
    public static void main(String[] args) throws IOException{

        //Scanner is used.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");

        //asking the user to put the file.
        String filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        GeographyQuiz geographyQuiz = new GeographyQuiz();

        //Creating and instantiating the variables.
        String country = null;
        String capitals = null;
        GeographyQuiz gph = null;

        List<String> list = new List<String>();

        //This loop is used to loop through
        while (inputFile.hasNext()) {
            country = inputFile.nextLine();
            list.add(country);
            capitals = inputFile.nextLine();
            list.add(capitals);
        }

        inputFile.close();

        //Output
        //Welcoming the user and asking the user if she/he likes to play.
        System.out.println("Welcome to the Country-Capital Quiz");
        System.out.print("Play? ");
        String ask = keyboard.nextLine();

        Random random = new Random();

        //Looping through the game and printing.
        //This is randomizing the capitals and countries and printing.
        while(!(ask.equals("No"))) {

            int number = random.nextInt(list.size());

            //using if and else for the two questions.
            if(!(number %2 == 0)) {
                //Asking questions.
                System.out.print("What is the capital of ");

                String stores = list.first();
                capitals = list.next();

                //looping for the capitals.
                for(int i = 2; i < number; i+=2) {
                    capitals = list.next();
                    stores = list.next();
                }

                System.out.println(stores);

            } else {

                System.out.print("What country has ");
                country = list.first();
                String store = list.next();

                System.out.print(" as its capital? ");

                //looping through.
                for(int i = 2; i < number-1; i+=2) {
                    country = list.next();
                    store = list.next();
                }

                System.out.println(store);
                store = list.next();
            }

            //asking the user.
            ask = keyboard.nextLine();

            //checking if the answer typed by the user is correct or not and printing.
            if(ask.equals(country)) {
                System.out.println("Correct.");
            } else if(!(ask.equals(country))) {
                System.out.println("Incorrect. The correct answer is " + country);
            } else if(ask.equals(capitals)) {
                System.out.println("Correct.");
            } else {
                System.out.println("Incorrect. The correct answer is " + capitals);
            }

            //asking the user if she/he wishes to continue.
            //if the user does not want to play, the program stops and prints out the statistics.
            System.out.print("Play? ");
            ask = keyboard.nextLine();
            if(ask.equals("No")) {
                System.out.println("Game over.");
                System.out.println("Game Stats:");
                System.out.println("Questions played: " + number + "; Correct answers: " + number + "; " + "Score: " + number + "%");
            }
        }

    }
}
