package com.lesson4_CountingElements;
import java.util.*;

public class FrogRiverOne {
/*
	Lession 4-1FrogRiverOne
	Find the earliest time when a frog can jump to the other side of a river.

	this section introduce Count array. Count array is powerful if you want to count
	consecutive number with limited size. If number is huge then you should not use it.
	The trick is usually we can use create a count array after eliminate huge number cases.

	The frog at position 0 and want to jump to the other side but he needs
	all positions have a leave.  The key is to have a count array that keep track
	if all position have a leave.
	so if you are given an Array which has time index from 0 to K seconds and
	also you are given integer N (N positions) figure when is the time frog
	can jump because all positions have a leave.

	The count array is count[N]. The A[K] has position number.
*/
	/* some excerise for create AyyayList and convert  to Integer array
	 and to int array
	List<Integer> myList = new ArrayList<Integer>(); 
	add some items by myList.add()
	Integer[] wrapperArr = myList.toArray(new Integer[myList.size()]); 
	// If you want a `primitive` type array 
	int[] arr = ArrayUtils.toPrimitive(wrapperArr);
	*/

    public int solution(int X, int[] A) {



        // a count of X reached then that index will be return.
        int total=0;
        int ret=-1;

        int[] count = new int[X];
        for (int i=0; i < A.length; i++) {
            if (count[A[i]-1] == 0){ 
                count[A[i]-1] =1;
                if (total + 1 == X){
                    ret=i;
                    break;
                }
                total++;
            }
        }
        return ret;        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
