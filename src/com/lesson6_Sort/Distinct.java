package com.lesson6_Sort;
import java.util.*;

public class Distinct {
/*
	Lesson 6-2Distinct

	Compute number of distinct values in an array.

	first sort the array and then scan it.
	if value changed then increment count.
*/

    public int solution(int[] A) {

        // convert array to ArrayList
        // create an empty ArrayList first
        ArrayList<Integer> ll = new ArrayList<Integer>();
        // below is OK too, more flexible
        //List<Integer> ll = new ArrayList<Integer>();
        // manually fill up the value
        for (int x:A) {
            ll.add(x);
        }
        Collections.sort(ll);
        
        /*
        // convert ArrayList back to array
        // create array with known size
        int[] arr = new int[ll.size()];
        // manually fill up values
        for (int i=0; i< arr.length; i++) {
            arr[i] = ll.get(i);
        }
        */
        if (ll.size() == 0) return 0;
        int count=1;   
        for (int i=1; i < ll.size(); i++) {
            //if (arr[i] != arr[i-1]) count++;
            if (ll.get(i) != ll.get(i-1)) count++;
            //System.out.println(" i " + arr[i]);
        }
        return count;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
