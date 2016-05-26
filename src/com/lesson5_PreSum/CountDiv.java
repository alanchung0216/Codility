package com.lesson5_PreSum;

public class CountDiv {
/*
	Lesson 5-2CountDiv
	Compute number of integers divisible by k in range [a..b].

*/


	public int solution(int A, int B, int K) {
	
		// write your code in Java SE 8
		
		int count = 0;
		
		int div1 = 0;
		
		int div2 = 0;
		
		
		
		div1 = A / K;
		
		div2 = B / K;
		
		count = div2 - div1;
		
		if (A % K == 0) count++;
	
		return count;
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
