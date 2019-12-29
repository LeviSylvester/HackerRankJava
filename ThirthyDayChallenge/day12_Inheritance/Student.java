package ThirthyDayChallenge.day12_Inheritance;

class Student extends Person {
    //we don't need these 3 because they are already declared in the parent class
//    private String firstName;
//    private String lastName;
//    private int id;
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    //no good, because doesn't call the parameters from parent class's constructor:
//    Student(String firstName, String lastName, int identification, int... testScores) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.idNumber = identification;
//        this.testScores = testScores;
//    }
    //good version:
    Student(String firstName, String lastName, int identification, int... testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        char grade = ' ';
        int sum = 0;
        int count = 0;
        for (int score : testScores) {
            sum += score;
            count++;
        }
        int a = sum / count;
        if (a >= 90 && a <= 100) { //how could have i solved it with a switch
            grade = 'O';
        } else if (a >= 80 && a < 90) {
            grade = 'E';
        } else if (a >= 70 && a < 80) {
            grade = 'A';
        } else if (a >= 55 && a < 70) {
            grade = 'P';
        } else if (a >= 40 && a < 55) {
            grade = 'D';
        } else if (a < 40) {
            grade = 'T';
        }
        return grade;
    }
    //alternative version:
//    for(int i = 0; i < testScores.length; i++){
//        total = total + testScores[i];
//    }
//
//    total = total/testScores.length;
//
//    return ( total > 89 ? 'O' :
//             total > 79 ? 'E' :
//             total > 69 ? 'A' :
//             total > 54 ? 'P' :
//             total > 39 ? 'D' : 'T' );
}
