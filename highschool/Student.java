public class Student extends Person { //Extends Person as information for a type of person
    protected String myIdNum;  
    protected double myGPA; 

    // Student constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);   // The inherited part from Person
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getters and Setters for the Student class
    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // toString to put the super and other parts together
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}


