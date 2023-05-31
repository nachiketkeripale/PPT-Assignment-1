/*
💡 You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

**Explanation:** The array represents the integer 123.

Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*/

import java.util.*;

public class Main
{
    public int[] incrementDigit(int [] inputArray,int len ) {
        
        if(inputArray[len-1] == 9) {
            incrementDigit(inputArray,len-1);
            inputArray[len-1] = 0;
        }
        else {
            inputArray[len-1] = inputArray[len-1] + 1;
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
	    
	    
	    int[] res = new int[arrayLength];
	    
	    Main m = new Main();
	    res = m.incrementDigit(data,arrayLength);
	    
	    for(i=0;i<res.length;i++) {
	        System.out.print(res[i]);
	    }
	}
}
