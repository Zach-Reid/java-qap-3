public class CollegeStudent extends Student { // Extends the Student item
    protected String myMajor;  
    protected int myYear;   

    // Now Constructing: CollegeStudent
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    }

    // Getters, also Setters
    public String getMajor() {
        return myMajor;
    }

    public void setMajor(String major) {
        myMajor = major;
    }

    public int getYear() {
        return myYear;
    }

    public void setYear(int year) {
        myYear = year;
    }

    // Put together the super and above pieces as a string
    public String toString() {
        return super.toString() + ", Year: " + myYear + ", Major: " + myMajor;
    }
}


