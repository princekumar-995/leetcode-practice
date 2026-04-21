class Solution {
    public int 1_maxDistance(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int max=0;
        int i=0;
        int j=0;
       while(i<nums1.length && j<nums2.length){
        if( nums1[i]<=nums2[j]){
            int ans=j-i;
            max=Math.max(max,ans);
            j++;
        }
       
       else{
        i++;
       }
       }
                                                          
        return max;
        
    }
}