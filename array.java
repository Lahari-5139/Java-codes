import java.util.*;
class array
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a);
        int[] arr = new int[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        } 
        System.out.println(arr); // prints a garbage value that is the addtess of the 'arr'
        System.out.println(Arrays.toString(arr));
    }
}