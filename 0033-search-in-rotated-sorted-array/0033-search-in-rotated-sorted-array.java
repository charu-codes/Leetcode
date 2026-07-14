class Solution {
    public int search(int[] nums, int target) {
        int result=0;
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                result = i;
                break;
            }
            else{
                result = -1;
            }
        }
        return result;
    }
}