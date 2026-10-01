import java.util.Scanner;
public class Functions{
    

    /* public static int Average(int a, int b, int c){

        int avg = (a + b + c)/3;
        return avg;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a:" );
        int a = sc.nextInt();

        System.out.println("Enter b:" );
        int b = sc.nextInt();

        System.out.println("Enter c:" );
        int c = sc.nextInt();

      int Favg = Average(a,b,c);
      System.out.println("Average is:"+ Favg);
    } */

   /* public static boolean isEven(int n){
        if (n%2==0){
            return true;
        }
        else{
            return false;
        }

   }

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n ");
        int n = sc.nextInt();

        boolean result = isEven(n);

        if(result){
            System.out.println("Even");
        }
        else{
            System.out.println("False");
        }
    }
 */

  /*  public static int SUM(int n){
        int sum =0;
        
        while(n>0){
            int ld= n%10;
            sum = sum+ld;
            n = n/10;
        }
        return sum;*/

        //Palindrome

    public static boolean ispalindrome(int num){
        int org = num;
        int rev = 0;

        while (num > 0){
            int digit = num%10;
            rev = rev *10 + digit;
            num = num/10;

        }
        return(org==rev);
    }
    public static void main(String args[]){

       /* Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int result = SUM(n);
        System.out.println(result);*/

        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
       if( ispalindrome(num)){
        System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
       }
    }
