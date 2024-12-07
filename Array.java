import java.util.*;
public class Array
{
    public static void main(String args[])
    {
        int arr[]={14,15,16,17,18};
         System.out.println("INITIALIZATION OF ARRAY");
        System.out.println(Arrays.toString(arr));
        System.out.println("ACCESSING OF ARRAY");
        System.out.println(arr[2]);
        System.out.println(arr[3]);
         System.out.println("MODIFICATION OF ARRAY");
        arr[2]=45;
        arr[4]=78;
       System.out.println(Arrays.toString(arr));
    }
}