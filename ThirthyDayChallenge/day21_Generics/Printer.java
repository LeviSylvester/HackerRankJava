package ThirthyDayChallenge.day21_Generics;

//generics mean that you can pass any type of argument to a method
//that type has to be consistent trough out the method
//syntax as bellow at class <T>,
//method declaration <ANY LETTER>,
//as parameter too but without <>,
//declaration too without <>
class Printer<T> {

    /**
     * Method Name: printArray
     * Print each element of the generic array on a new line. Do not return anything.
     *
     * @param A generic array
     **/

    // Write your code here
    /*static*/ <A> void printArray(A[] array) {
        for (A a : array) {
            System.out.println(a);
        }
    }
}

//Other usages:

//        for (int i = 0; i < array.length; i++) {
//            A item = array[i];
//            System.out.println(item);
//            if (i < array.length -1) {
//                System.out.println(", ");
//            }
//        }

//    static <A, T> A[] printArray(A[] array, T b)  {
//        for (A a : array){
//            System.out.println(a);
//        }
//        return array;
//    }

//Comparable is anything with a compareTo method
//T is to match with certain things in Comparable's class
//    public static <T extends Comparable<T>> T findmax(T a, T b) {
//        int n = a.compareTo(b);
//        if (n < 0) {
//            return b;
//        } else {
//            return a;
//        }
//    }
//in main would be called simply ex. findmax(2, 3)
//but it works with anything, double, char, String, anything that has a compareTo method
//if you want to compare something that has not a compareTo method, write one and add to class "implements Comparable"