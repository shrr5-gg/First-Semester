import java.util.Scanner;
public class Question4 {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        int a = abc.nextInt();
        int b = abc.nextInt();
        int c = abc.nextInt();

        if (a == b && b==c){
            System.out.println("This is an Equilateral triangle");
        } else if ((a==b || b==c || a==c) && (a!=c || a!=b ||b!=c)) {
            System.out.println("This is an Isosceles triangle");

        }
        else {
            System.out.println("This is an Scalene triangle");

        }


    }
}
