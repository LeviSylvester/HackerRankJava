package ThirthyDayChallenge.day18_QueuesAndStacks;

import java.util.*;

// https://www.hackerrank.com/challenges/30-queues-stacks/problem
public class Solution {
    private ArrayDeque<Character> stack = new ArrayDeque<>();
    private ArrayDeque<Character> queue = new ArrayDeque<>();

    private void pushCharacter(char ch) {
        stack.push(ch);
    }

    private char popCharacter() {
        return stack.pop();
    }

    private void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    private char dequeueCharacter() {
        return queue.remove();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
/* Sample Input
racecar

Sample Output
The word, racecar, is a palindrome. */

//Other solutions include:

////ArrayDeque "is likely to be faster than Stack when used as a stack,
////and faster than LinkedList when used as a queue." - Java documentation
//Stack<Character> stack = new Stack<>();
//Queue<Character> queue = new LinkedList<>();
//
//void pushCharacter(char ch) {
//    stack.push(ch);
//}
//
//void enqueueCharacter(char ch) {
//    queue.add(ch);
//}
//
//char popCharacter() {
//    return stack.pop();
//}
//
//char dequeueCharacter() {
//    return queue.remove();
//}

//Stack<Character> stack = new Stack<>();
//Queue<Character> queue = new LinkedList<>();
//
//void pushCharacter(Character ch) {
//    stack.push(ch);
//}
//
//void enqueueCharacter(char ch) {
//    queue.add(ch);
//}
//
//char popCharacter(){
//    return stack.pop();
//}
//
//char dequeueCharacter() {
//    return queue.remove();
//}

//Stack<Character> stack;
//    Queue<Character> queue;
//    Solution(){
//        stack = new Stack<Character>();
//        queue =  new ArrayDeque<Character>();
//    }
//    public void pushCharacter(Character c){
//        stack.push(c);
//    }
//    public Character popCharacter(){
//        return stack.pop();
//    }
//    public Character dequeueCharacter(){
//         return queue.poll();
//    }
//    public void enqueueCharacter(Character c){
//        queue.add(c);
//    }

////Write your code here
//    List<char> charStack = new List<char>();
//    List<char> charQueue = new List<char>();
//
//    void pushCharacter(char ch) {
//        charStack.Add(ch);
//    }
//
//    void enqueueCharacter(char ch) {
//        charQueue.Add(ch);
//    }
//
//    char popCharacter() {
//        char returnChar = charStack[charStack.Count - 1];
//        charStack.RemoveAt(charStack.Count - 1);
//        return returnChar;
//    }
//
//    char dequeueCharacter() {
//        char returnChar = charQueue[0];
//        charQueue.RemoveAt(0);
//        return returnChar;
//    }

//ArrayList charQueue = new ArrayList(); ArrayList charStack = new ArrayList();

//private Stack stack;
//private Queue queue;
//public Solution(){
//    stack = new Stack();
//    queue = new LinkedList();
//}

//public class Solution {
//    Stack<Character> p;
//    Queue<Character> q;
//    public Solution(){
//        p  = new Stack<Character>();
//        q =  new LinkedList<Character>();
//    }
//
//    public void pushCharacter(Character ch){
//       p.push(ch);
//    }
//    public void enqueueCharacter(char ch){
//        q.add(ch);
//    }
//    public char popCharacter(){
//        return p.pop();
//    }
//    public char dequeueCharacter(){
//        return q.remove();
//    }