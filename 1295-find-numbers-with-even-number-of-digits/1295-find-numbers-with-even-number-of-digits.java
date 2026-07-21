class Solution {
    public int findNumbers(int[] nums) {
        int ec=0;
        for(int i:nums){
            int c=0;
            while(i!=0){
                i/=10;
                c++;
            }
            if(c%2==0) ec++;
        }
        return ec;
    }
}