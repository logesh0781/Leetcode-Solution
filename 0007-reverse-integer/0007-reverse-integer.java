class Solution {
    public int reverse(int x) {
        if(x==0) return 0;
        boolean flag=false;
        if(x<0){
            x*=-1;
            flag=true;
        }
        long r=0;
        
        while(x!=0){
            r=r*10+(x%10);
            x/=10;
        }
        if(flag) r*=-1;
        if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE)
            return 0;
        return (int)r;
    }
}