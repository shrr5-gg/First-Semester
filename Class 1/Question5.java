public class Question5 {
    public static void main(String[]args){
        double a = 4.5;
        double b = 9.5;
        double temp = a*a + b*b;
        double c = Math.sqrt(temp);
        double sina = a/c;
        double cosa = b/c;
        double sinb = b/c;
        double cosb = a/c;
        System.out.println("sinA = "+sina);
        System.out.println("cosA = "+cosa);
        System.out.println("sinB = "+sinb);
        System.out.println("cosB = "+cosb);

    }
}
