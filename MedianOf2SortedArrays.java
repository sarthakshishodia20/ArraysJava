class Solution {
    // A bette rapproach for median in two sorted arrays Striver Sheet 
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1Element=-1;
        int index2Element=-1;
        int n=nums1.length+nums2.length;
        int index1=n/2-1;
        int index2=n/2;
        int count=0;
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                if(count==index1){
                    index1Element=nums1[i];
                }
                if(count==index2){
                    index2Element=nums1[i];
                }
                count++;
                i++;
            }
            else{
                if(count==index1){
                    index1Element=nums2[j];
                }
                if(count==index2){
                    index2Element=nums2[j];
                }
                count++;
                j++;
            }
        }
        while(i<nums1.length){
            if(count==index1){
                index1Element=nums1[i];
            }
            if(count==index2){
                index2Element=nums1[i];
            }
            count++;
            i++;
        }
        while(j<nums2.length){
            if(count==index1){
                index1Element=nums2[j];
            }
            if(count==index2){
                index2Element=nums2[j];
            }
            count++;
            j++;
        }
        if(n%2!=0){
            return (double)index2Element;
        }
        else{
            return ((double)index1Element + (double)index2Element)/2;
        }
    }
}
