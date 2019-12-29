package ThirthyDayChallenge.day12_Inheritance;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

//    Person(){
//
//    }

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data [pre-toString method :)]
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }



}
