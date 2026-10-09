class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int n = nums.length;
        int[] left = new int[n];
        int[] result = new int[n];
        left[0] = nums[0];

        for(int i=1; i<n; i++){
            left[i] = nums[i]*left[i-1];
        }

        for(int i=n-1; i>0; i--){
            result[i] = left[i-1]*product;
            product *= nums[i];
        }
        result[0] = product;

        return result;
    }
}