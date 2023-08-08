public class Search {

    public static int BinarySearch(int []nums, int key){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==key){
                return mid;
            }
            if(nums[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static int LinearSearch(int [] nums, int key){
        for(int i=0; i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums={1,10,20,47,59,65,75,88,99};
        System.out.println(BinarySearch(nums, 65));
    }
}
