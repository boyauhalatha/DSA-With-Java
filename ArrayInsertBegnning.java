import java.util.Scanner;
public class ArrayInsertBegnning {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        System.out.println("before insertion:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the element to be inserted:");
        int element=sc.nextInt();
        for(int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=element;
        System.out.println("after insertion:");
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}