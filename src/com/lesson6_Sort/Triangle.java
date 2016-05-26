package com.lesson6_Sort;
import java.util.*;

public class Triangle {
/*
	Lesson 6 - 1Triangle

	Determine whether a triangle can be built from a given set of edges.
	this section introduce sort.

	a set numbers need to meet this condition p < q < r 
	where p+q>r , q+r>p r+p>q to build a triangle.
	the key is to sort it and to keep previous_previous and previous and current
	position.

*/

    public int solution(int[] A) {
        // write your code in Java SE 8
        // sort directly
        // int[] sr = Arrays.sort(A);
        List<Integer> ll = new ArrayList<Integer>();
        for (int x:A) {
            ll.add(x);
        }
        Collections.sort(ll);
	// convert back to int[]
        int[] B = new int[ll.size()];
        for (int i=0; i<ll.size(); i++) {
            B[i] = ll.get(i);
            //System.out.println(" i " + B[i]);
        }
        if (B.length <3) return 0;
        int pre_pre=B[0];
        int pre=B[1];
        //System.out.println(" pre_pre pre cur "+B[0]+" "+B[1]+" "+B[2]);
        for (int i=2; i<B.length; i++) {
            if (pre_pre+pre > B[i]){
                if (pre+B[i] > pre_pre)
                    if (B[i]+pre_pre > pre)
                        return 1;
            }
            pre_pre=pre;
            pre=B[i];
        }
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
