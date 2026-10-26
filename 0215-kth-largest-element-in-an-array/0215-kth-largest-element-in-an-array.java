class Solution {
    public int findKthLargest(int[] nums, int k) {
        int result = 0;
        PriorityQueue<Integer> pmin = new PriorityQueue<>();
        int n = nums.length - k;
        for(int i=0; i<nums.length; i++){
            pmin.add(nums[i]);
        }
        for(int i=0; i<n; i++){
            pmin.poll();
        }
        result = pmin.peek();
        return result;
    }
}