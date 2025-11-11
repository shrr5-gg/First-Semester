import java.util.Scanner;
public class Question5 {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter the N-digit vault code:");
        int a = abc.nextInt();
        int i = 1;
        int con = a;
        int con2 = a;
        int x = 1;
        int div = 1;
        int num;

        while (true){
            con = con / 10;
            if (con !=0) {
                i++;
            }
            else {
                break;
            }
        }
        while (x < i){
            div *=10;
            x++;
        }
        while (div>0){
            num = con2 / div;
            con2 = con2 % div;
            div /= 10;
            if (div > 0) {
                System.out.print(num + ",");
            }
            else {
                System.out.print(num);
            }
        }

    }

}
