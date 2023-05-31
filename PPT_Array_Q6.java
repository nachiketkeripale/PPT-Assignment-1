/*
💡 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]

Output: true
*/

import java.util.*;

public class Main
{
    
    public boolean checkVal(int [] inputArray, int searchVal) 
    {
        boolean res;
        int count=0;
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]==searchVal) {
                count++;
            }
        }
        
        if(count>1)
        {
            res = true;
        } else {
            res = false;
        }
        
        return res;
    }
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Array Length");
	    int arrayLength = sc.nextInt();
	    
	    int[] data = new int[arrayLength];
	    int i;
	    int val;
	    
	    System.out.println("Enter element in array:");
	    for(i=0; i<data.length;i++) {
	        data[i] = sc.nextInt();
	    }
	    
	    System.out.println("Enter target Value :");
	    val = sc.nextInt();
	    
	    Main m = new Main();
	    System.out.println(""+m.checkVal(data,val));
	}
}
