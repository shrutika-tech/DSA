import java .util.Scanner;

public class Patterns {

public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

public static void invertedtriangle(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");

            }
            System.out.println();
        }
}

public static void halfpyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
}

public static void character(int n){
    char ch ='A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
               System.out.print(ch);
               ch++;
            }
            System.out.println();
        }
}
public static void mirorred_triangle(int n)
{
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n-i; j++)
        {
            System.out.print(" ");
        }
                for( int j=1; j<=i; j++)
                {
                    System.out.print("*");
                }

        
         System.out.println();
    }
}
public static void pyramid(int n)
{
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n-i; j++)
        {
            System.out.print(" ");
        }
                for( int j=1; j<=i; j++)
                {
                    System.out.print("* ");
                }

        
         System.out.println();
    }
}

public static void hollow_rect(int rows, int cols){
    for(int i=1; i<=rows; i++){ 
        for (int j= 1; j<=cols; j++){
            if(i==1|| i==rows ||j==1||j==cols){
            System.out.print("*");
            }
            else{
               System.out.print(" "); 
            }
        }
        System.out.println();
    }
}

public static void inverted_half_py(int n){
    for(int i =1; i<= n; i++){
        for(int j=1; j<=n-i+1; j++){
        System.out.print(j);
    }
    System.out.println();
    }
    
}

public static void FloydsTriangle(int n){
    int counter=1;
    for(int i= 1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(counter+ " ");
            counter++;
        }
        System.out.println();
    }

}

public static void zero_one_tri(int n){
     for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
     }
}

public static void butterfly (int n){
    for (int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<= 2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<= 2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void rhombus(int n){
    for (int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void hollow_rhombus(int n){
    for(int i=1; i<=n; i++){ 
        for (int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for (int j= 1; j<=n; j++){
            if(i==1|| i==n||j==1||j==n){
            System.out.print("*");
            }
            else{
               System.out.print(" "); 
            }
        }
        System.out.println();
    }
}

public static void diamond(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n; i>1; i--){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void palindrome_pyramid(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        } 
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        for(int j=i-1; j>=1; j--){
            System.out.print(j);
        }
        System.out.println();
    }
}

public static void spacedpyramid(int n){
    int num=1;
    for(int i= 1; i<=n; i++){
        for (int j=1; j<=n-i; j++){
            System.out.print("\t");
        }
        for(int j=1; j<=i; j++){
            System.out.print(num + " \t\t");
            num++;
        }
        System.out.println();
    }
}

public static void hollowpyramid(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++){
           if(i==1|| i==n|| j==1|| j==2*i-1){
                System.out.print("*");
           }
           else{
                 System.out.print(" ");
           }
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();
        System.out.println("Enter cols");
        int cols = sc.nextInt();*/



        //triangle(n);
        //invertedtriangle(n);
        //halfpyramid(n);
        //character(n);
        //mirorred_triangle( n);
        //pyramid(n);
        //hollow_rect(rows,cols);
        //inverted_half_py( n);
        //FloydsTriangle(n);
       // zero_one_tri(n);
       //butterfly(n);
       //hollow_rhombus(n);
        //diamond(n);
        //palindrome_pyramid(n);
        //spacedpyramid(n);
        hollowpyramid(n);
    }
}