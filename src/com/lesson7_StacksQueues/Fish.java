package com.lesson7_StacksQueues;
import java.util.*;

public class Fish {
/*
	Lesson 7-2Fish
	N voracious fish are moving along a river. Calculate how many fish are alive.

	Two arrays are give A, and B.
	A is fish size and B is direction (up stream, down stream).
	the condition that big fish should eat small fish when they meet (they are in opposite
	direction) but if small fish already behind big fish then they will alive even though they 
	are different direction. fish in same direction will never meet.

	problem is not easy to solve but using stack will be easy.
	We need two stacks (ll, dir) to keep track arrayA and array B.

	eventually fish left in stack are survived.
*/

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        List<Integer> ll = new ArrayList<Integer>();
        List<Integer> dir = new ArrayList<Integer>();
        //int[] dir = new int[B.length+1];
        for (int i=0; i< A.length; i++ ) {
            if (ll.isEmpty()) {
                ll.add(A[i]); // push to stack
                dir.add(B[i]); // save direction
                continue;
            }
            if (B[i] != dir.get(ll.size()-1)) {
                // figure out who got eaton
                if (B[i] == 1) { // downstream
                    ll.add(A[i]);
                    dir.add(B[i]);
                } else {
                    if (A[i] > ll.get(ll.size()-1)) {
                        ll.remove(ll.size()-1);
                        dir.remove(dir.size()-1);
                        ll.add(A[i]);
                        dir.add(B[i]);
                    } else {
                        continue;
                    }
                }
            } else { // same direction
                ll.add(A[i]);
                dir.add(B[i]);
            }
        }
        return ll.size();        
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
