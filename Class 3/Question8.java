import java.util.Scanner;
public class Question8 {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = abc.nextInt();
        int i =0;
        int num;
        int countPo = 0;
        int countNe = 0;
        while (i<=(n-1)){
            i+=1;
            System.out.print("Enter number " + i + ": ");
            num = abc.nextInt();
            if (num >=0){
                countPo +=1;
            }
            else {
                countNe +=1;
            }

        }
        System.out.println(countPo + " Non-negative Numbers");
        System.out.println(countNe + " Negative Numbers");


    }
}
