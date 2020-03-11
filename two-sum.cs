// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:
// Input:
// array nums [3,7,2,15]
// target 9
// Output: 
// position of index [1,2]

public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int size = nums.Length;
        for(int i = 0; i< size; i++){
            for(int j = i+1; j< size; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    int[] result = new int[]{i,j};
                    return result;
                }
            }
        }
        
        return null;
    }
}