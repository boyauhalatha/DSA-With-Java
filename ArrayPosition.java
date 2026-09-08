import java.util.Scanner;
public class ArrayPosition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elemts:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be inserted:");
        int element=sc.nextInt();
        System.out.println("enter the position:");
        int pos=sc.nextInt();
        for(int i=n-1;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=element;
        System.out.println("After insertion:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }   
}