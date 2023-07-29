/*This program takes all the zeros of an array to the end of the array */
public class Zeros{
    public static void main(String[] args) {
        int[]arr={5,3,0,2,1,0,7,8};
        for(int i=0, j=0;i<arr.length;i++){ 
            if (arr[j]==0 && arr[i]!=0) {
                arr[j]=arr[i];
                arr[i]=0;
                j++;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}