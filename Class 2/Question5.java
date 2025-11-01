import java.util.Scanner;
public class Question5 {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter the amount the customer need to pay(Taka):");
        int need = abc.nextInt();
        System.out.print("Enter the amount, customer gave(Taka):");
        int gave= abc.nextInt();
        int ret = gave-need;
        System.out.println("The returned amount is " +ret+" taka");
        int remain = ret;
        System.out.println("100 taka note: "+ (ret/100));
        remain = ret%100;
        System.out.println("50 taka note: "+ (remain/100));
        remain = remain%50;
        System.out.println("20 taka note: "+ (remain/20));
        remain = remain%20;
        System.out.println("10 taka note: "+ (remain/10));
        remain = remain%10;
        System.out.println("5 taka note: "+ (remain/5));
        remain = remain%5;
        System.out.println("2 taka note: "+ (remain/2));
        remain = remain%2;
        System.out.println("1 taka note: "+ (remain/1));
    }
}
