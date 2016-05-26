package com.lesson3_TimeComplexity;

public class TapeEquilibrium {
/*
	Lesson 3 - 2 TapeEquilibrium
	Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
	https://codility.com/programmers/task/tape_equilibrium

	The key is to find out which cut index is the point that has minimum length difference.
	we need to know the whole length first. it’s easy we simply add them together in whole array.
	we then start the array again and this time we add sub array  and shrinking the total and see if
	 it’s greater than shrinking total.
	The cost is O(n).
*/
    public int solution(int[] A) {
        // write your code in Java SE 8
        // add them together
        int total=0;
        int sub=0;
        int ret=0;
        for (int i:A) {
            total += i;
        }
        for (int i=0; i < A.length; i++) {
          
            if ((sub+A[i]) > total){
                ret=total-sub;              
                break;
                //return ret;
            }
            sub += A[i]; 
            total -= A[i];
        }
        return ret>0?ret:-(ret);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
