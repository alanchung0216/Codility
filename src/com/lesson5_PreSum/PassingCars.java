package com.lesson5_PreSum;

public class PassingCars {
/*
 	Lesson 5-1PassingCars
	Count the number of passing cars on the road.

	This introduce Presum formula which is useful to calculate
	a range value from index x to index y.
	the key is to create a presume array P
	(It’s easy ,add A[i] to P[i] for P[i+1]).
	and know the fact that P[y+1] is P[y] + A[y].
	So when we want to slice a range we can
	simply use presume array P to calculate the
	range
	P[y+1] = P[y] + a[y];

	for example calculate total from P[x] to P[y]
	all you need to do is P[y+1] - P[x]
*/
    public int solution(int[] A) {

        // got Presum array.
	// note we need the size A.length+1

        int[] P = new int[A.length+1];
        P[0]=0;
        for (int i=0; i<A.length; i++) {
            P[i+1] = P[i] + A[i];
            //System.out.println("P "+(i+1)+" " + P[i+1]);         
        }
        // find out the pairs
        int pairs=0;
        for (int i=0; i<A.length; i++) {            
            if (A[i] == 0){
                pairs += total_slice(P, i, A.length-1); // slice from current i to last
											// value is 0’s plus 1’s.
            }
        }
        if (pairs > 1000000000) return -1;
        return pairs;
    }
    public int total_slice(int[] P, int x, int y) {
        return P[y+1] - P[x];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
