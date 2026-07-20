class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans;
        int n=nums1.length,m=nums2.length;
        int[] r=new int[n+m];
        System.arraycopy(nums1,0,r,0,n);
        System.arraycopy(nums2,0,r,n,m);
        Arrays.sort(r);
        int i=n+m;
        if(i%2==0)
            ans=(r[i/2-1]+ r[i/2])/2.0;
        else ans=r[i/2];
        return ans;
    }
}