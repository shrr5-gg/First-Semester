import java.util.Scanner;
public class Question2 {
    public static void main(String[]args){
        Scanner abc = new Scanner(System.in);
        System.out.print("Please Enter number of Herbs (H): ");
        int H = abc.nextInt();
        System.out.print("Please Enter number of Crystals (C): ");
        int C = abc.nextInt();
        int remainH = H;
        int remainC = C;
        int i = 1;

        while (remainH >=3 && remainC >=2){
            remainH -=3;
            remainC -=2;
            System.out.println("Potion - "+ i +" created");

            System.out.println("Remaining Herbs: "+remainH +", Remaining Crystals: "+remainC);
            i++;



        }

        System.out.println("Potions created " + (i-1));
        if((i-1)%2==0){
            System.out.println("Stable Elixir");

        }
        else {
            System.out.println("Volatile Brew");
        }


    }
}
