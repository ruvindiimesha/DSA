public class FindFactorialnew1{
   //method to find the factorial
   public static long factorial(int n){
          if (n == 1)
               return 1;
          else
               return n * factorial(n - 1);
   }
   public static void main (String[] args){
          long result = factorial(5);
          System.out.println("Factorial is " + result);
		  int mynum = 127;
		  System.out.println("My number is " + mynum);
		  
   }
}
			 