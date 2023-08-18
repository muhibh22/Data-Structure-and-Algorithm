public class MergeArray {
    
    public static int[] merge(int [] nums1, int m, int[] nums2, int n){
        int[] mergedArray=new int[m+n];
        int i=0;int j=0; int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                mergedArray[k]=nums1[i];
                i++;
            }
            else{
                mergedArray[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mergedArray[k]=nums1[i];
                i++;
                k++;
        }
        while(j<n){
            mergedArray[k]=nums2[j];
                j++;
                k++;
        }
        return mergedArray;
    }
    public static void main(String[] args) {
        int[]nums1={1,2,3,0,0,0};
        int[]nums2={2,5,6};
        int[] mergedArray=merge(nums1, 3, nums2, 3);
        for(int i=0; i<mergedArray.length;i++){
            System.out.print(mergedArray[i]+" ");
        }
        System.out.println();
    }
}
