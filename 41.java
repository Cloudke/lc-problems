//get the first missing positive number

class Solution {
    public int firstMissingPositive(int[] nums) {
           int first = 1;                  //start from 1 to check missing positive number
        
           Arrays.sort(nums);  //sort nums ascending
        
           for(int i = 0 ; i<nums.length;i++){
               if(nums[i]<=0){  //ignore negative numbers
                   continue;
               }
               else  if(nums[i] > 1 && first == 1){  //if first positive number is greater than 1, return 1
                   return 1;
               }               
               else if(nums[i] == first){           //if current number is same as first waiting number
                   first++;
               }  
               
               else if(nums[i]>first && nums[i-1]<first &&i>1){
                   return first;
               }
           }
        return first;
    }
}
