import java.util.Scanner;

public class addmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        System.out.println("first matrix");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j]=sc.nextInt();
            }

        }
        System.out.println("second matrix");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        int sum[][]=new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }



    }
}
