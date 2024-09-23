/**
 * This class is developing a list method.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */

public class StudentList {

    //This is a field that is an unordered List of type Student.
    private List<Student> studentList;

    //constructor
    public StudentList() {
        studentList = new List<Student>();
    }

    //This is adding a student record to the list.
    public void addRecord(Student s) {
        studentList.add(s);
    }

    //This is deleting a student record with the specified ID number.
    //The loop does the looping and checks the conditions to remove the ID.
    public void deleteRecord(int ID) {
        Student std = studentList.first();
        while (std != null) {
            if(std.getStudentID() == ID) {
                studentList.remove(std);
                return;
            }
            std = studentList.next();
        }
    }

    //This is displaying records of all the students taking a specified major.
    //The loop does the looping and the condition checks to get the students with the expected major.
    public void displayMajors(String major) {
        Student std = studentList.first();
        while (std != null) {
            if(std.getMajor().equals(major)) {
                System.out.println(std);
            }
            std = studentList.next();
        }
    }

    //This is displaying records of all the students belonging to a particular faculty.
    //The loop does the looping and the condition checks to get the students in the expected faculty.
    public void displayFaculty(String faculty) {
        Student std = studentList.first();
        while (std != null) {
            if(std.getFaculty().equals(faculty)) {
                System.out.println(std);
            }
            std = studentList.next();
        }
    }

    //This is displaying records of all the students with the specified last name.
    //The loop does the looping and the condition checks to get the students.
    public void displayName(String lName) {
        Student std = studentList.first();
        while (std != null) {
            if(std.getLastName().equals(lName)) {
                System.out.println(std);
            }
            std = studentList.next();
        }
    }

    //This is searching a student's record given an ID number.
    public Student searchID(int ID) {
        Student std = studentList.first();
        while (std != null) {
            if (std.getStudentID() == ID) {
                return std;
            }
            std = studentList.next();
        }
        return null;
    }

    //This method is made here so that it can be used in the demo class.
    public void enumerate() {
        studentList.enumerate();
    }

    //This is displaying the record of all the student with the specified email.
    public void displayEmail(String email) {
        Student std = studentList.first();
        while (std != null) {
            if(std.getEmail().equals(email)) {
                System.out.println(std);
                return;
            }
            std = studentList.next();
        }
    }
}
