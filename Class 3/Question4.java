import java.util.Scanner;
public class Question4 {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        int a = abc.nextInt();
        int fd = 0;
        while(true){
            fd = a % 10;
            a /= 10;
            if(a>0) {
                System.out.print(fd + ", ");
        }
            else {
                System.out.print(fd);
                break;
            }



        }


    }
}
