class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = findStart(nums, target);
        int end = findEnd(nums, target);

        return new int[]{start, end};
    }

    private int findEnd(int[] nums, int target) {
        int i=-1; int s=0; int e=nums.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(nums[mid]==target){
                i = mid;
                s = mid+1;
            }
            else if(nums[mid]<target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return i;
    }

    private int findStart(int[] nums, int target){
        int i=-1; int s=0; int e=nums.length-1;

        while(s<=e){
            int mid = s +(e-s)/2;

            if(nums[mid]==target){
                i = mid;
                e = mid-1;
            }
            else if(nums[mid]<target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return i;
    }
}