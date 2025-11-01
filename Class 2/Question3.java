import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){

            Scanner abc = new Scanner(System.in);
            System.out.println("Enter three numbers:");

            float a = abc.nextFloat();
            float b = abc.nextFloat();
            float c = abc.nextFloat();

            float largest = a;
            float smallest = a;
            if (b > largest){
                largest = b;

            }
            if (c > largest){
                largest =c;
            }
            System.out.println("Maximum Number: " + largest);
        if (b < smallest){
            smallest = b;

        }
        if (c < smallest){
            smallest =c;
        }
        System.out.println("Minimum Number: " + smallest);
    }
}
