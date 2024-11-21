public class Teacher extends Person { //Extends Person as information for a type of person, just like Student
    protected String mySubject; 
    protected double mySalary;  

    // Teacher constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);   // The inherited part from Person
        mySubject = subject;
        mySalary = salary;
    }

    // Getter and Setters: Education Edition
    public String getSubject() {
        return mySubject;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    // toString method for Teacher, with the super using stuff from Person
    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: $" + mySalary;
    }
}


