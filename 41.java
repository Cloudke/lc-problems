//get the first missing positive number

class Solution {
    public int firstMissingPositive(int[] nums) {
           int first = 1;
        
           Arrays.sort(nums);  //sort nums ascending
        
           for(int i = 0 ; i<nums.length;i++){
               if(nums[i]<=0){  //ignore negative numbers
                   continue;
               }
               else  if(nums[i] > 1 && first == 1){
                   return 1;
               }               
               else if(nums[i] == first){
                   first++;
               }  
               
               else if(nums[i]>first && nums[i-1]<first &&i>1){
                   return first;
               }
           }
        return first;
    }
}
