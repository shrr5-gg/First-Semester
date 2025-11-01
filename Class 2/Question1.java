import java.util.Scanner;
public class Question1 {
    public static void main(String[]args){
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter the number:");

        int a = abc.nextInt();

        if ( a%5 == 0 && a%7 == 0){
            System.out.println("Divisible by both");
        }
        else if (a%7 == 0){
            System.out.println("Invalid: Divisible by 7 Only");
        }

        else if ( a%5 == 0){
            System.out.println("Invalid: Divisible by 5 Only");
        }
        else{
            System.out.println("No");

        }



    }

}