class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int r=0;
        int t=x;
        while(t!=0){
            r=r*10+t%10;
            t/=10;
        }
        if(x==r) return true;
        return false;
    }
}