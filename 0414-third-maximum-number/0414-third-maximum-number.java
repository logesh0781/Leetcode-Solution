
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1],c=1;
        for(int i=nums.length-1;i>=0;i--){
            if(max>nums[i]){
                c++;
                max=nums[i];
            }
            if(c==3) return max;
        }
        return nums[nums.length-1];
    }
}