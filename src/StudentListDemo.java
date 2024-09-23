/**
 * This class is a demo class that runs the program using inputs from the user.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */

//importing
import java.util.Scanner;
import java.io.*;

public class StudentListDemo {
    public static void main(String[] args) throws IOException{

        //Scanner is used.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");

        //asking the user.
        String filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        StudentList studentList = new StudentList();

        //variables of type int and String.
        int StudentID;
        String FirstName;
        String LastName;
        String Email;
        String Major;
        String Faculty;

        Student std = null;

        //The loop does the looping.
        while (inputFile.hasNext()) {
            StudentID = inputFile.nextInt();
            FirstName = inputFile.next();
            LastName = inputFile.next();
            Email = inputFile.next();
            Major = inputFile.next();
            Faculty = inputFile.nextLine();

            std = new Student(StudentID, FirstName, LastName, Email, Major, Faculty);
            studentList.addRecord(std);
        }

        inputFile.close();

        //Output
        //This is printing all the students.
        System.out.println("The Student List contains the following entries: ");
        studentList.enumerate();

        //Printing whitespaces.
        System.out.println(" ");

        //This is printing all the students who are majoring in music.
        System.out.println("These students are majoring in Music: ");
        studentList.displayMajors("Music");

        //Printing whitespaces.
        System.out.println(" ");

        //This is printing all the students who are majoring in science.
        System.out.println("These students are majoring in Science: ");
        studentList.displayMajors("Science");

        //Printing whitespaces.
        System.out.println(" ");

        //This is printing all the students with the required ID.
        System.out.println("Find the record for the student with ID '200128");
        studentList.searchID(200128);

        //Printing whitespaces.
        System.out.println(" ");

        //This is printing all the students with the required name.
        System.out.println("Find the record for the student with the name 'Mike Williams':");
        studentList.displayName("Williams");

        //Printing whitespaces.
        System.out.println(" ");

        //This is printing the record for the student with the required email.
        System.out.println("Find the record for the student with the email 'apage@email.com'");
        studentList.displayEmail("apage@email.com");

        //Printing whitespaces.
        System.out.println(" ");

        //This is removing the students and displaying the rest of the students.
        System.out.println("Remove 5 students from the Student List...");
        System.out.println("The Student List now contains the following entries: ");
        studentList.deleteRecord(200128);
        studentList.deleteRecord(200131);
        studentList.deleteRecord(200130);
        studentList.deleteRecord(200129);
        studentList.deleteRecord(200127);
    }
}
