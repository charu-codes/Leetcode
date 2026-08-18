class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int s = 0;
        int[] num = new int[n];
        k = k%n;
        for(int i=0; i<n; i++){
            if(i<k){
                num[i] = nums[n-k+i];
            }
            else{
                num[i] = nums[s];
                s++;
            }
        }
        for(int i=0; i<n; i++){
            nums[i] = num[i];
        }
    }
}