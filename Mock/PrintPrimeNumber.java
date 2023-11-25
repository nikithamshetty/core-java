public class PrintPrimeNumber {

  public static void main(String[] args) 
   {
    int number=32;
    boolean is_confirm = false;
    for (int i=2; i<=number/2; i++) {
      if (number%i==0) 
      {
        is_confirm=true;
        break;
      }
    }

    if(number!=is_confirm)
      System.out.println(number + " is a prime number.");
      else
      System.out.println(number + " is not a prime number.");
  }
}