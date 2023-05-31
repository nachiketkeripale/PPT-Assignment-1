/* 
**Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Example:**
Input: nums = [2,7,11,15], target = 9
Output0 [0,1]

**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1][
*/


import java.util.*;

public class Main
{
    public void TargetCheck(int [] a, int t) 
    {
        outter:
        for(int k=0;k<5;k++){
            for(int j=0;j<5;j++){
        
                if(a[k]+a[j]==t) {
                    System.out.println(" "+ a[k] +" and "+ a[j]);
                    break outter;
                }
            }
        }
    }
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int[] data = new int[5];
	    int i;
	    int sum;
	    
	    System.out.println("Enter element in array:");
	    for(i = 0; i<5;i++) {
	        data[i] = sc.nextInt();
	    }
	    
	    System.out.println("Enter target Value :");
	    sum = sc.nextInt();
	    
	    Main m = new Main();
	    m.TargetCheck(data,sum);
        
	}
}
