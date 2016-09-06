package com.lesson7_StacksQueues;

import java.util.*;
public class Brackets {
/*
	Lesson 7 -2 Brackets
	Determine whether a given string of parentheses is properly nested.

	This solution could be solved using stack.
	the input String could be converted to char[] to make the code
	more readable. use str.charAt(i) directly can be used too but less readable

	ArrayList can be use as stack as long as we have size, get() , add() and remove()
	once we encounter ‘)’, ‘]’, ‘}’ we should compare top to stack.
	if matched remove else add it.
*/

    public int solution(String S) {
       
        // convert String to char[]
        
        char[] C = new char[S.length()];
        C = S.toCharArray();
        List<Character> ll = new ArrayList<Character>();
        for (int i=0; i<C.length; i++) {
            if (ll.isEmpty()) {
                // push
                ll.add(C[i]);
            }
            else { // check if matching
                if (match(C[i],ll.get(ll.size()-1))) {
                    ll.remove(ll.size()-1);
                } else {
                    ll.add(C[i]);
                }
            }
        }
        if (ll.size() == 0) return 1;
        else return 0;
    }
    boolean match (Character c, Character s) {
        if ((c == ')') && (s == '(')) return true;
        if ((c == ']') && (s == '[')) return true;
        if ((c == '}') && (s == '{')) return true;
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
