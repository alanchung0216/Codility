package com.lesson1_iteration;

import java.util.*;

public class BinaryGap {

/*
	Find longest sequence of zeros in binary representation of an integer.

	the key for this solution is to make sure the leading and tailing 0’s won’t be
	counted. only count 0’s in between 1’s.
	we can easily to ignoring the trailing 0’s by dividing 2 and module is 0.
	if module is 1 we will count 0 if next dividing 2  and module is 0.
	will stop counting if encounter module is 1.
	we then check if count > max and set max if needed.
	we continue until dividing 2 become 0.

	this solution below would not work. I need to redo it.
*/
	

	
    public static int solution(int N) {
        // write your code in Java SE 8
        String str = Integer.toBinaryString(N);
        
        //System.out.println("Interger "+N+"+String "+str);
        //byte[] bytes = str.getBytes();
        //str.charAt(0)
        boolean on=false;
        int count=0;
        int max=0;
        for (int i=0; i < str.length(); i++) {
            //System.out.println(" str " +str.charAt(i));
            if (!on) {
                if ((str.charAt(i) & 1)==1) {
                    on=true;
                    if (count > max) max=count;
                    count=0;
                }
                else {
                }
            }
            else {
                if ((str.charAt(i) & 1) == 1) {
                    if (count > 0){
                        if (count > max){
                            max=count;
                        }
                        count=0;
                    }
                }
                else {
                    count++;
                }
            }
            
        }
        return max;
        
    }
    
	public static void main(String[] args){
		System.out.println(solution(34));
	}
}
