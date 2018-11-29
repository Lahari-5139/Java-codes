import java.io.*;
import java.util.*;


class JavaExceptionExample
{  
  public static void main(String args[]){ 
    Scanner in  = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println(method(a,b,in)); 
   
  } 
  
  public static int method(int a,int b,Scanner in)
  {
    try{  
      //code that may raise exception  
      int data=a/b;  
   }catch(ArithmeticException e)
   {
     //System.out.println(e);
      System.out.println("Expection occured!");
      b = in.nextInt();
      method(a,b,in);
    }  
   //rest code of the program   
    System.out.println("rest of the code..."); 
    return a/b;
  }
}  