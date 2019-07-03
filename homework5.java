//Jahanvi Patel
public class homework5{
   public static void main(String[] args){
      System.out.println(multiply(12,12));
      System.out.println(writeSquares(11));
   }
   
   public static int multiply(int a, int b){
      if (b == 1){
         return a;}
      else{
         return a + multiply(a, b-1); }
   }
   
   public static int writeSquares(int n){
      if(n==1){
         return 1;}
      else{
         if(n%2==0){
            System.out.print(multiply(n,n));
            System.out.print(",");
            return writeSquares(n-1); }
         else{
            System.out.print(writeSquares(n-1)); 
            System.out.print(",");
            return multiply(n,n);}
      }
   }
}