/*
**Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example 1:**
Input: nums = [1,2,2,4]
Output: [2,3]

*/

import java.util.*;

public class Main
{
    public int[] findErrorNums(int[] nums) {
        
        int[] result = new int[2];
        int n = nums.length;
       
        int sum = (n * (n + 1)) / 2;
        
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                result[0] = num; 
            } else {
                set.add(num);
                sum -= num; 
            }
        }
        
        result[1] = sum; 
        
        return result;
    }
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Array Length");
	    int arrayLength = sc.nextInt();
	    
	    
	    int[] data = new int[arrayLength];
	    int i;
	    
	    System.out.println("Enter element in array:");
	    for(i=0; i<arrayLength;i++) {
	        data[i] = sc.nextInt();
	    }
	    
	    
	    int[] res = new int[arrayLength];
	    
	    Main m = new Main();
	    res = m.findErrorNums(data);
	    
	    for(i=0;i<res.length;i++) {
	        System.out.print(res[i]);
	    }
	}
}
