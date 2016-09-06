package com.lesson6_Sort;

import java.util.*;
public class MaxPeoductOfThree {
/*
	Lesson 6-3 MaxProductOfThree
	Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).

	this could be very easy if all number are positive.
	we could sort it then choose last three biggest item at the end.
	but two negative multiply could be big too.
	So we should also choose the first two lowest numbers(could be both negative)multiple
	the last biggest and compare the former.
*/

    public int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> ll = new ArrayList<Integer>(A.length);
        for (int x:A)
            ll.add(x);
            
        Collections.sort(ll);
        int[] B = new int[ll.size()];
        for (int i=0; i<ll.size(); i++)
            B[i] = ll.get(i);
            
        int ret1 = B[B.length-1]*B[B.length-2]*B[B.length-3];
        int ret2 = B[0]*B[1]*B[B.length-1];
        
        return ret1 > ret2 ? ret1 : ret2;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
