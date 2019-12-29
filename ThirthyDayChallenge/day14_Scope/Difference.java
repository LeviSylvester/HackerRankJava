package ThirthyDayChallenge.day14_Scope;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int... elements) {
        this.elements = elements;
    }

    void computeDifference() {
        int max = this.elements[0];
        int min = max;
        for (int e : elements) {
            max = e > max ? e : max;
            min = e < min ? e : min;
        }
        this.maximumDifference = max - min;
    }
} // End of Difference class
//Other solutions include:
// int maxElem = Integer.MIN_VALUE;
//    int minElem = Integer.MAX_VALUE;
//    for(Integer i: elements){
//        maxElem = i>maxElem ? i : maxElem;
//        minElem = i<minElem ? i : minElem;
//    }

//    void computeDifference() {
//        int n = this.elements.length;
//        int min = this.elements[0];
//        int max = min;
//
//        for (int i = 0; i < n; ++i) {
//            if (this.elements[i] < min) {
//                min = this.elements[i];
//            }
//            if (this.elements[i] > max) {
//                max = this.elements[i];
//            }
//        }
//        this.maximumDifference = max - min;
//    }

//    void computeDifference() {
//
//        int n = elements.length;
//        int min = 100;
//        int max = 1;
//
//        for (int i = 0; i < n; ++i) {
//            if (elements[i] < min) {
//                min = elements[i];
//            }
//            if (elements[i] > max) {
//                max = elements[i];
//            }
//        }
//        maximumDifference = max - min;
//    }

//    public void computeDifference() {
//        int max = 1, min = 100;
//        for (int e : elements) {
//            max = Math.max(max, e);
//            min = Math.min(min, e);
//        }
//        maximumDifference = max - min;
//    }

/* public void computeDifference() {
    int n = elements.length;
    Arrays.sort(elements);
    maximumDifference = elements[n-1] - elements[0];
} */

//public void computeDifference () {
//        int max = Arrays.stream(elements).max().getAsInt();
//        int min = Arrays.stream(elements).min().getAsInt();
//        maximumDifference = max - min ;
//    }

//.collect(Collectors.summarizingInt());

//void computeDifference() {
//        Arrays.sort(elements);
//        maximumDifference = elements[elements.length-1] - elements[0];
//    }

//Difference(int[] a){
//     elements= a;
// }
//
//void computeDifference() {
//    maximumDifference =0;
//    int diff=0;
//    int l= elements.length;
//
//for(int i=0; i<l; i++) {
//    for(int j=0; j<l; j++) {
//        diff= elements[i] - elements[j];
//
//     if(diff > maximumDifference)
//        maximumDifference = diff;
//
//
//    } //for j
//
//
//} // for i
//} // void
