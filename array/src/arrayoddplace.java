import java.util.Scanner;

// to find the odd place element of the array .
public class arrayoddplace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length;i= i+2) {
            System.out.println(arr[i]);
        }
    }
}
