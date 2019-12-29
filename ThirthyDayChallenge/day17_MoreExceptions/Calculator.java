package ThirthyDayChallenge.day17_MoreExceptions;

//Write your code here

class Calculator {
    //returns the integer result of n on the power of p. If either n or p is negative,
    // then the method must throw an exception with the message: n and p should be non-negative.
    int power (int n, int p) {
        if ((n | p) < 0) {
            throw new ArithmeticException("n and p should be non-negative");
        } else {
            return (int)Math.pow(n, p);
        }
    }
}
//Other solutions include:

//class Calculator {
//
//  public int power(final int n, final int p) {
//    if (n < 0 || p < 0) {
//      throw new IllegalArgumentException("n and p should be non-negative");
//    }
//
//    int power = 1;
//    for (int i = 0; i < p; i++) {
//      power *= n;
//    }
//
//    return power;
//  }
//}

//public int power(int n, int p) throws Exception{
//   double result;
//   if ( n < 0 || p < 0 ) {
//       throw new Exception("n and p should be non-negative");
//    } else{
//       result = Math.pow((double)n, (double)p);
//    }
//
//    return (int) result;
//}