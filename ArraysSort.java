import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        int index;
        for (int i=0;i<arr.length;i++) {
            System.out.print(i+1 +". Element : ");
            index=sc.nextInt();
            arr[i]=index;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    }

