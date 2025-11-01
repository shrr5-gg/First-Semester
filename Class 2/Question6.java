import java.util.Scanner;
public class Question6 {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.print("Input the 1st number:");
        int a = abc.nextInt();
        System.out.print("Input the 2nd number:");
        int b = abc.nextInt();
        System.out.print("Input the 3rd number:");
        int c = abc.nextInt();

        if (a == b && b==c){
            System.out.println( "All numbers are equal");
        } else if ((a==b || b==c || a==c) && (a!=c || a!=b ||b!=c)) {
            System.out.println("Neither all are equal nor different");

        }
        else {
            System.out.println("All numbers are different" );

        }


    }
}

