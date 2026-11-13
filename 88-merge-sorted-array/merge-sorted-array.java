class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j =0;
     int p =m;
     
     while(j!=n)
     {
nums1[m]=nums2[j];
j++;
m++;
     }
     Arrays.sort(nums1);
    }
}