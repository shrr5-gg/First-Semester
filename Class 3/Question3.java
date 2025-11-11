import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.print("Energy (E):");
        int E = abc.nextInt();
        System.out.print("Number of Rivers (N):");
        int N = abc.nextInt();
        int x = 0;
        int D;
        while (x <=(N-1)){
            x +=1;
            System.out.print("Enter River Distance D" +x+":");
            D = abc.nextInt();
            if (D <= 5){
                E -= 2;

            }
            else if (D>5){
                E -= D/2;
            }

            if (E <0){
                break;
            }


        }
        if (E <=0){
            System.out.println("Tired at River  " + x );
        }
        else {
            System.out.println("All Done");
            System.out.println(E +"energy Left");
        }


    }
}
