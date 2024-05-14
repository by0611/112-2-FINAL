import java.util.Scanner;
public class j102{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        double total = (double) a*23.34;
        System.out.printf("%.2f",total);
        scn.close();
    }
}
