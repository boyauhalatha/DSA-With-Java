public class lowestValue{
    public static void main(String[] args){
        int[] arr={10,3,40,50,6};
        int min=arr[0];
        for(int num:arr){
          if(num<min){
                min=num;
            }
        }
        System.out.println("The lowest value in the array is: " + min);
    }
}