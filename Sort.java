public class Sort {

    public static int[] bubbleSort(int[] arr){
        boolean isSwapped;
        for(int i=0; i<arr.length-1; i++){
            isSwapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false){
                break;
            }
        }
        return arr;
    }

    public static int[]insertionSort(int[] arr){
        for(int i=1; i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        return arr;
    }

    public static void selectionSort(int [] arr){
        int n=arr.length;
        for(int i=0; i<n-1;i++){
            int min = i;
            for(int j=i+1; j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,5,9,2};
        selectionSort(arr);
        display(arr);
    }
}
