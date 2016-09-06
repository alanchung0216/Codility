package com.lesson4_CountingElements;

public class PermCheck {
/*
	Lesson 4-1  OK  PermCheck
	Check whether array A is a permutation.

	A permutation is a sequence containing each element from 1 to N once, and only once.
	for permutation fit into the array we should expect 1 to N assigned into 0 to N-1 index.

	the key is to count the integer and if the total count (integer  in count array) is the same A.length 
	then it’s permutation.
	The array element could be huge  so they automatically disqualify as permutation.
	duplicate integer in the array A also disqualify permutation But we need to find a way find it.
	Count array is the easiest and the count size is small (only size of A.length).
	if there is duplicate number then there will be at one position in count array is 0.
	so the total count will be less than A.length, problem solved.

*/

    public int solution(int[] A) {
        // find the largest #, what if largest # is not really large
	// note number could be well bigger than A.length
	// that 
        int max=0;
        for (int i=0; i< A.length; i++) {
            if (A[i] > max) max=A[i];
        }
        
        if (max != A.length) return 0; // note 
	   
	    int[] count = new int[A.length];
        int total=0;
        for (int i=0; i < A.length; i++) {
            if (count[A[i]-1] == 0) {
                count[A[i]-1] = 1;
                total++;
            }
        }
        if (total == max) return 1;
        else return 0;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
