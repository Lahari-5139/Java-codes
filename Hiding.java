
// file name: Hiding.java 
class A { 
   static void fun() { 
      System.out.println("A.fun()"); 
   } 
} 
  
class B extends A {  
   static void fun() {    
      System.out.println("B.fun()"); 
   } 
} 
  
public class Hiding { 
   public static void main(String args[]) { 
      A a = new B(); 
      a.fun();  // prints A.fun() 
   } 
} 

//If we make both A.fun() and B.fun() as non-static then the above program would print “B.fun()”.
