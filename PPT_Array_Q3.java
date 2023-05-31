/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

**Example 1:**
Input: nums = [1,3,5,6], target = 5

Output: 2
*/

import java.util.*;

public class Main
{
    public int ValidateVal(int [] sortedArray, int searchVal) 
    {
        int res=0;
        for(int i=0;i<sortedArray.length;i++){
            
                if(sortedArray[i]==searchVal) {
                    res=i;
                }
        }
        
        if(res==0)
        {
            outter:
            for(int i=0;i<sortedArray.length;i++){
                if(sortedArray[i]<searchVal){
                    i++;
                } else {
                    res=i;
                    break outter;
                }
            }
        }
        
        return res+1;
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
	    System.out.println(""+m.ValidateVal(data,val));
	}
}
