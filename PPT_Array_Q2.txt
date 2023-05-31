/*
**Q2.** Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

- Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
- Return k.

**Example :**
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_*,_*]

**Explanation:** Your function should return k = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned k (hence they are underscores)
*/
import java.util.*;

public class Main
{   
    public void removeDuplicate(int [] inputArray, int removeVal){
        
        int count = 0;
        for(int i=0;i<inputArray.length;i++) {
            for(int j=0;j<inputArray.length;j++) {
                if(inputArray[j]==removeVal) {
                    int temp;
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        
        for(int i=0;i<inputArray.length;i++) {
            if(inputArray[i]==removeVal){
                count++;
            }
        }
        
        for(int i=0;i<inputArray.length-count;i++){
            System.out.println(inputArray[i]);
        }
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
	    m.removeDuplicate(data,val);
	}
}
