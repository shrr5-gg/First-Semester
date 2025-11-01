import java.util.Scanner;
public class Question2 {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.print("Age:");
        int age = abc.nextInt();
        System.out.print("Electricity Consumed:");
        int elec = abc.nextInt();
        int bill = elec * 15;
        double bill_18 = bill * 0.8;
        double bill_18_ex = bill_18 * 1.05;
        double bill_mid_ex = bill * 1.05;
        double old_fa = bill * 0.9;
        double old_fa_ex = old_fa * 1.05;


        if (age < 18) {
            if (elec > 100) {
                System.out.println("Final Bill: " + bill_18_ex + " Taka");
            }
            else {
                System.out.println("Final Bill: " + bill_18+ " Taka");
            }
        }
        else if (age > 60) {
            if (elec > 100) {
                System.out.println("Final Bill: " + old_fa_ex+ " Taka");
            }
            else {
                System.out.println("Final Bill: " + old_fa+ " Taka");
            }
        }
        else {
            if (elec > 100) {
                System.out.println("Final Bill: " + bill_mid_ex+ " Taka");
            }
            else {
                System.out.println("Final Bill: " + bill+ " Taka");
            }
        }


    }
}