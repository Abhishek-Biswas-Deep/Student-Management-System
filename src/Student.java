/**
 * This class is used to develop a program that stores information about students taking courses at a university.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */


public class Student {

    //instance variables
    private int StudentID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Major;
    private String Faculty;

    //constructor
    public Student (int StudentID, String FirstName, String LastName, String Email, String Major, String Faculty) {
        this.StudentID = StudentID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Major = Major;
        this.Faculty = Faculty;
    }

    //toString
    public String toString() {
        return StudentID + "\t" + FirstName + "\t" + LastName + "\t" + Email + "\t" + Major + "\t" + Faculty + "\t";
    }

    //This method overrides the equals method in the object class.
    public boolean equals (Student other) {
        return (StudentID == other.getStudentID() && FirstName.equals(other.getFirstName()) &&
                LastName.equals(other.getLastName()) && Email.equals(other.getEmail()) && Major.equals(other.getMajor())
                && Faculty.equals(other.getFaculty()));
    }

    //getters
    public int getStudentID() {
        return StudentID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getMajor() {
        return Major;
    }

    public String getFaculty() {
        return Faculty;
    }
}
