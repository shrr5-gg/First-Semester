public class Question1 {
    public static void main(String[]args){
        int min = 3456789;
        int year = min/525600;
        int day = min%525600;
        int dayinsec = day/1440;

        System.out.println(min + " minutes is approximately " + year +" years and " +dayinsec+" days ");

    }
}
