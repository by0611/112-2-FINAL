import java.util.Scanner;
public class j104{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float total = a+b; 
        System.out.printf("total=%.2f",total);
        scn.close();
    }
}
