import java.util.Stack;
public class BinaryNumber {

    static int[] binaryNumber(int n){
        int [] result = new int[n];
        for(int i =0; i<n;i++){
            result[i]=binaryMaker((i+1));
        }
        return result;
    }
    static int binaryMaker(int n){
        int result= n;
        double number=0;
        int number_int;
        Stack <Integer> stack= new Stack<>();
        if (n==1) {
            return 1;
        }
        else{
            while(result/2 !=0 ){
            stack.push(result%2);
            result=result/2;
        }
        stack.push(1);
        while(!stack.isEmpty()){
            number=Math.pow(10, (stack.size()-1));
            number +=stack.pop();
        }
        number_int=(int)number;
        return number_int;
        }
    }
    public static void main(String[] args) {
        int[]arr=binaryNumber(4);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
