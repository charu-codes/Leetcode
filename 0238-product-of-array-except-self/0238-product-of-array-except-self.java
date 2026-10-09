class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int s_zero = 0;
        int n = nums.length;
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                product *= nums[i];
            }
            else{
                s_zero++;
            }
        }
        for(int i=0; i<n; i++){
            if(s_zero==0){
                result[i] = product/nums[i];
            }
            else if(s_zero>1){
                result[i] = 0;
            }
            else{
                if(nums[i]!=0){
                    result[i] = 0;
                }
                else{
                    result[i] = product;
                }
            }
        }
        return result;
    }
}