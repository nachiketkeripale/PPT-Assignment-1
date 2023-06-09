/*
💡 Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

**Example 1:**
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/

import java.util.*;

public class Main
{
    public int[] removeZero(int [] inputArray) {
        
        for(int i=0;i<inputArray.length;i++) {
            for(int j=0;j<inputArray.length;j++) {
                if(inputArray[j]==0 && inputArray[i]>0) {
                    int temp;
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        
        return inputArray;
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
	    
	    Main m = new Main();
	    int res[] = new int[arrayLength];
	    res = m.removeZero(data);
	    
	    System.out.println(" ZERO ARE PUSHED AT END ");
	    for(int k=0;k<res.length;k++){
	        System.out.println(res[k]);
	    }
	    
	}
}
