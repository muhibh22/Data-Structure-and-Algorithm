import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(reverseInteger(num));

    }


    public static int reverseInteger(int n){
        String numberStr=Integer.toString(n);
        String reverseStr=new StringBuilder(numberStr).reverse().toString();
        int reverseedNumber=Integer.parseInt(reverseStr);
        return reverseedNumber;
    }
}
