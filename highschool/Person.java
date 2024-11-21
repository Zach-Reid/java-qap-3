public class Person {
    protected String myName;   
    protected int myAge;       
    protected String myGender;  

    // Set up the name, age, and gender
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // The Getters Ft. The Setters
    public String getName() {
        return myName;
    }

    public void setName(String name) {
        myName = name;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public String getGender() {
        return myGender;
    }

    public void setGender(String gender) {
        myGender = gender;
    }

    // The toString for showing the name, age, and gender letter
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}


