import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        int a = abc.nextInt();
        int i = 0;

        while (i<=a){
            if (i%5==0 && i%3 !=0){
                System.out.println(i);
                i++;
            }
            else {
                i++;
            }



        }

    }
}