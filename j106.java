import java.util.Scanner;
public class j106{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x1 = scn.nextInt();
        double y1 = scn.nextInt();
        double x2 = scn.nextInt();
        double y2 = scn.nextInt();
        double total = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.printf("%.2f",total); 
        scn.close();
    }
}