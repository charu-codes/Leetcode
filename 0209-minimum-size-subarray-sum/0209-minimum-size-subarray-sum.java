class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s=0;
        int sum=0;
        int min_l = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            while(sum>=target){
                min_l = Math.min(min_l, i-s+1);
                sum -= nums[s];
                s++;
            }
        }
        return min_l == Integer.MAX_VALUE ? 0 : min_l;
    }
}