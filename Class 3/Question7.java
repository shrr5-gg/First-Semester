public class Question7 {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;

        while (i <= 600) {
            if ((i % 7 == 0 || i % 9 == 0) && (i % 63 != 0)) {
                sum += i;
            }
            i += 1;
        }

        System.out.println(sum);

    }
}
