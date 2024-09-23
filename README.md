<img src="https://github.com/user-attachments/assets/2ad86f70-12b4-4500-997d-9f8c1874a9b5" alt="Dal logo" width="80"/>
<h1>Associated with Dalhousie University</h1>

### CSCI2110

### Student Management System
This repository contains a simple Student Management System implemented in Java. The system allows for storing and managing information about students taking courses at a university.


### Files in the Repository

1. Student.java: Defines the Student class with attributes like StudentID, FirstName, LastName, Email, Major, and Faculty.
2. StudentList.java: Implements a list of students with methods for adding, deleting, searching, and displaying student records.
3. StudentListDemo.java: A demo class that runs the program using inputs from a file.
4. LinkedList.java: A generic implementation of a linked list.
5. List.java: An unordered list class that uses the LinkedList implementation.
6. Node.java: Defines the Node class used in the LinkedList implementation.
7. StudentRecords.txt: A sample text file containing student records.

### Features

- Add student records
- Delete student records by ID
- Display students by major
- Display students by faculty
- Search for a student by ID
- Display students by last name
- Display a student's record by email

### How to Use

Compile all Java files.
Run the StudentListDemo class.
When prompted, enter the filename StudentRecords.txt.
The program will demonstrate various operations on the student records.

### Additional Files

The repository also includes:

- GeographyQuiz.java: A separate program for a geography quiz game.
- CountryCapitals.txt: A text file containing country-capital pairs for the geography quiz.

These files are not part of the main Student Management System but are included in the repository as additional projects.

### Sample input and output
```
Exercise1

Enter the filename to read from: src/StudentRecords.txt
The Student List contains the following entries: 
200120 Kate	West	kwest@email.com	Music	 Arts	--> 200121	Julie	McLain	jmclain@email.com	Finance	 Business	--> 200122	Tom	Erlich	terlich@email.com	Sculpture	 Arts	--> 200123	Mark	Smith	msmith@email.com	Biology	 Science	--> 200124	Jen	Foster	jfoster@email.com	Physics	 Science	--> 200125	Matt	Knight	mknight@email.com	Finance	 Business	--> 200126	Karen	Weaver	jkweaver@email.com	Music	 Arts	--> 200127	John	Smith	jsmith@email.com	Sculpture	 Arts	--> 200128	Allison	Page	apage@email.com	History	 Humanities	--> 200129	Craig	Cambell	ccambell@email.com	Music	 Arts	--> 200130	Steve	Edwards	sedwards@email.com	Biology	 Science	--> 200131	Mike	Williams	mwilliams@email.com	Linguistics	 Humanities	--> 200132	Jane	Reid	jreid@email.com	Music	 Arts
These students are majoring in Music: 
200120	Kate	West	kwest@email.com	Music	 Arts	
200126	Karen	Weaver	jkweaver@email.com	Music	 Arts	
200129	Craig	Cambell	ccambell@email.com	Music	 Arts	
200132	Jane	Reid	jreid@email.com	Music	 Arts	
 
These students are majoring in Science: 
 
Find the record for the student with ID '200128
 
Find the record for the student with the name 'Mike Williams':
200131	Mike	Williams	mwilliams@email.com	Linguistics	 Humanities	
 
Find the record for the student with the email 'apage@email.com'
200128	Allison	Page	apage@email.com	History	 Humanities	
 
Remove 5 students from the Student List...
The Student List now contains the following entries: 

Process finished with exit code 0

Exercise2

Enter the filename to read from: src/CountryCapitals.txt
Welcome to the Country-Capital Quiz
Play? Yes
What country has China as its capital? 
Dhaka
Incorrect. The correct answer is Beijing
Play? No
Game over.
Game Stats:
Questions played: 1; Correct answers: 0; Score: 0%

Process finished with exit code 0

Enter the filename to read from: src/CountryCapitals.txt
Welcome to the Country-Capital Quiz
Play? No

Process finished with exit code 0
```

