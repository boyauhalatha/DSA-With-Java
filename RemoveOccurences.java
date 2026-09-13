import java.util.Scanner;
public class RemoveOccurences{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("enter the elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the element :");
        int ele=sc.nextInt();
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]!=ele){
                arr[count]=arr[i];
                count++;
            }
        }
        System.out.println("array after removing all occurences is:");
        
        System.out.println("count is: " +count);
        sc.close();
    }
}