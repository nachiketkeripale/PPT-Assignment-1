/*

💡 You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

**Example 1:**
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

**Explanation:** The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
/*

import java.util.*;

public class Main
{
    
    public boolean checkVal(int [] inputArray, int searchVal) {
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
    
    public int[] removeZero(int [] inputArray){
        
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
    
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1; // Index of last element in nums1
    int j = n - 1; // Index of last element in nums2
    int k = m + n - 1; // Index of last position in merged array nums1
    
    // Merge nums1 and nums2 from the back
    while (i >= 0 && j >= 0) {
        if (nums1[i] >= nums2[j]) {
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
    }
    
    // Copy remaining elements from nums2 if any
    while (j >= 0) {
        nums1[k] = nums2[j];
        j--;
        k--;
    }
    
    return nums1;
}
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Array 1 Length");
	    int array1Length = sc.nextInt();
	    
	    System.out.println("Enter Array 2 Length");
	    int array2Length = sc.nextInt();
	    
	    int[] data1 = new int[array1Length+array2Length];
	    int[] data2 = new int[array2Length];
	    int i;
	    int val;
	    
	    System.out.println("Enter element in array1:");
	    for(i=0; i<array1Length;i++) {
	        data1[i] = sc.nextInt();
	    }
	    
	    System.out.println("Enter element in array2:");
	    for(i=0; i<array2Length;i++) {
	        data2[i] = sc.nextInt();
	    }
	    
	    
	    int[] res = new int[array1Length+array2Length];
	    
	    Main m = new Main();
	    res = m.merge(data1,array1Length,data2,array2Length);
	    
	    for(i=0;i<res.length;i++) {
	        System.out.print(res[i]);
	    }
	}
}
