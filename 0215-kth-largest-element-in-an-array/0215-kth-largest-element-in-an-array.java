class Solution {
    public int findKthLargest(int[] nums, int k) {
        int result = 0;
        PriorityQueue<Integer> pmax = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        for(int i=0; i<n; i++){
            pmax.add(nums[i]);
        }
        for(int i=1; i<k; i++){
            pmax.poll();
        }
        result = pmax.peek();
        return result;
    }
}