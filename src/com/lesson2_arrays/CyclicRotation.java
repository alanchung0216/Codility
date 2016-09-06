package com.lesson2_arrays;

public class CyclicRotation {
/*
	Lession 2-1 CyclicRotation
	Rotate an array to the right by a given number of steps.

	key for this solution is to shift right one by one for k steps.
	each time make sure have one extra temp to hold the last position data.
	once finished one iteration then put the extra to A[0] the first position.
	do this k times until it’s done
	the cost is O(n x k);
	
	For example, given array A = [3, 8, 9, 7, 6] 
	and K = 3, the function should return [9, 7, 6, 3, 8].


*/
	
	    public int[] solution(int[] A, int K) {
	        // write your code in Java SE 8
	    	//System.out.println(A.length);
	        for (int i=0; i < K; i++) {
	        	//System.out.println(i);
	        	//System.out.println(A.length);
	            int extra=A[A.length-1];
	            //System.out.println(extra);
	            for (int j=1, m=A.length-1; j<A.length; j++, m--) {
	            	//System.out.println(j);
	                A[m]=A[m-1];
	                //System.out.println(A[j]);
	            }
	            A[0]=extra;
	        }
	        return A;
	    }
	
/*
	Another way to solve it
	this approach will reverse array three time
	and cost is only O(n)
	also you need to remember that when we reverse
	an array we only need to iterate half of array size.
	use this example is easy to understand.
	1234 rotate right two times will be 3412
	first reverse from 0 to k-1
	2134
	second reverse from k to length-1
	2143
	final reverse the whole array 0 to length-1
	3412
	*/
/*
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        reverse(A, 0, K-1);
        reverse(A, K, A.length-1);
        reverse(A, 0, A.length-1);
        return A;
        
    }
    public void swap (int[] X, int a, int b){
        int temp=X[a];
        X[a] = X[b];
        X[b] = temp;
    }
    public void reverse (int[] Y, int start, int end) {
        for (int i=start; i <= (start+end)/2; i++)
            swap(Y, i, (start+end)-i);
    }
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray = {3, 8, 9, 7, 6};
		CyclicRotation cr = new CyclicRotation();
		int[] ret = cr.solution(testArray, 3);
		//System.out.println("ret");
		for (int i=0; i<ret.length; i++){
			System.out.println(ret[i]);
		}
		
	}

}
