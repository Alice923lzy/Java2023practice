class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for ( int i : nums){
            sum += i;
        }
        int left = 0; int ans = 0;
        for ( ans = 0; ans < nums.length ; ans++){
            sum -= nums[ans];
            if (left == sum ){
                return ans;
            }
            left += nums[ans];
        }
        return -1;
    }
}