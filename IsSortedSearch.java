import java.util.Scanner;
public class IsSortedSearch{
    public static int search(int[] arr,int N,int x){
        for(int i=0;i<N;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element :");
        int x=sc.nextInt();
        int N=arr.length;
        int result=search(arr,N,x);
        if(result==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("Element found at index "+ result);
        }
        sc.close();
    }
}