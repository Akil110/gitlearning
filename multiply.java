class Main{

     static int factorial(int n){

      if (n == 0)

        return 1;

      else

        return(n * factorial(n-1));

     }

     public static void main(String args[]){

      int i,facto=1;

      int num=4;

      facto = factorial(num);

      System.out.println("Factorial of "+num+" is: "+facto);

     }

    }