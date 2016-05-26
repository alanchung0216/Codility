package com.lesson3_TimeComplexity;

public class PermMissingElement {
/*
 	Lesson 3 - 3 PermMissingElem

	Find the missing element in a given permutation.
	https://codility.com/programmers/task/perm_missing_elem/

	the key for this is to know what permutation is.
	it ’s consecutive integer.
	the array hold N integers from  1 to N+1 but the array
	size is N so one number is missing. 
	if we know the total of 1 to N+1 then we simple subtract  total
	of array from total of 1 to N+1 and we will find the answer.

	Note we could also solve this problem using Count Array (see 4-1)
*/

    public int solution(int[] A) {
        // write your code in Java SE 8
        //List l = new ArrayList();
        int total=0;
        int total_A=0;
        for (int i=0; i<A.length+1; i++) {
            total += i+1;
        }
        for (int x:A) {
            total_A += x;
        }
        return (total - total_A);
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
