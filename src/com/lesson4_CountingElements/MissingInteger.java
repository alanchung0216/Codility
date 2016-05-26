package com.lesson4_CountingElements;

public class MissingInteger {
/*
	Lesson 4-3MissingInteger
	Find the minimal positive integer not occurring in a given sequence.

	the keyword here is “sequence” means 1,2,3,…
	so we know the array A has a sequence (not sorted though) but may have a duplicate number
	this is similar to previous solution that  will need a count array and size is small (A.length)
	count the integer in count array
	then go through the count array
	if first encounter is 0 then it’s lowest positive missing number.
*/

    public int solution(int[] A) {
        // the content of Array should be within size of A.length.
        int[] pos = new int[A.length]; 
        //System.out.println("length " + A.length);
        int ret=0;
        for (int i=0; i<A.length; i++) {
            if ((A[i] > 0 ) && (A[i] <= A.length)) {//<= is the key
                pos[A[i]-1] += 1;
                //System.out.println("pos " + A[i] + " " + pos[A[i]-1]);
            }
        }
        for (int i=0; i < pos.length; i++ ) {
            if (pos[i] == 0) {
                ret=i+1;  // because it's 0 based so add 1
                return ret;
            }
        }
        return A.length+1; // no missing so add 1 for next that not in array 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
