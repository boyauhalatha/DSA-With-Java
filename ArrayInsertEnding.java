import java.util.Scanner;
public class ArrayInsertEnding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size:");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        System.out.println("before insertion:");
        System.out.print("enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the element to insert:");
        int element=sc.nextInt();
        arr[n]=element;
        System.out.println("after insertion:");
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
