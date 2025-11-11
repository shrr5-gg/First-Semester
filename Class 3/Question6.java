import java.util.Scanner;
public class Question6 {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        int n = abc.nextInt();
        int lc = 0;
        int i = 1;
        int x = 1;
        int sum = 0;

        while (i <= n) {

            if (n % i == 0) {
                lc += 1;
            }
            i += 1;
        }
        while (x < n) {

            if (n % x == 0) {
                sum += x;
            }
            x+=1;
        }

        if (lc == 2) {
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }
        if (sum == n)
            System.out.println(n + " is a perfect number");
        else {
            System.out.println(n + " is not a perfect number");
        }
    }
}


