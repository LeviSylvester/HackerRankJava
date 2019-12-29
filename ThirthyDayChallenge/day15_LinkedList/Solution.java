package ThirthyDayChallenge.day15_LinkedList;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/30-linked-list/problem
class Solution {

    public static Node insert(Node head, int data) {
        //Complete this method
        if (head == null)
            return new Node(data);
        else if (head.next == null) {
            head.next = new Node(data);
        } else {
            insert(head.next, data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
/* Sample Input
4
2
3
4
1

Sample Output
2 3 4 1 */

//Other solutions include:
//public static Node createMaxIntList (){
//
//	Node node = insert (null, 0);
//
//		for (int i = 1; i <= Integer.MAX_VALUE; i++)
//			insert (node, i);
//
//		return node;
//	}
//
//	public static void main(String args[]) {
//		display(createMaxIntList());
//	}

//public static  Node insert(Node head,int data) {
//    if (head == null)
//        return new Node(data);
//    head.next = insert(head.next, data);
//    return head;
//}

//Node current = head;
//Node temp = new Node(data);
//if (current == null)
//	current = temp;
//else {
//	while(current.next!=null) {
//		current = current.next;
//	}
//	current.next = temp; //setting the actual value to the end
//	current = head; //value to be returned from method
//}
//return current;

//Instead of limiting the maximum size of the list to the size of the stack and making the program slower, you could optimize it.
//
//private static class HeadNode extends Node {
//   // extending Node is hacky, but we're limited
//   private Node tail;
//   private HeadNode(int d) {
//       super(d);
//       tail = this;
//   }
//}
//
//public static Node insert(Node head,int data) {
//    if(head == null) return new HeadNode(data);
//    // to keep compatibility, we could fall back to
//    // a loop if head is not a HeadNode
//    HeadNode hn = (HeadNode)head;
//    hn.tail = hn.tail.next = new Node(data);
//    return head;
//}
//The advantages are obvious when you look at a benchmark (30k insertions):
//
//Insert time:               894652 ns (HeadNode version, O(1))
//Loop insert time:      1087636063 ns (while(...), O(n))
//Recursive insert time: 2538318406 ns
//Do not overuse recursion.

//Node temp = new Node(data);
//Node current = head;
//
//if (current != null ) {
//    while (current.next != null) {
//        current = current.next;
//    }
//    current.next = temp;
//}
//else {
//    head = temp;
//}
//return head;
