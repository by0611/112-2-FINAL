import java.util.Scanner;
public class j204{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        String count = scn.next();
        if (count.equals("+")){
            System.out.printf("%d+%d=%d",a,b,a+b);
        }
        else if (count.equals("-")){
            System.out.printf("%d-%d=%d",a,b,a-b);
        }
        else if (count.equals("*")){
            System.out.printf("%d*%d=%d",a,b,a*b);
        }
        else{
            System.out.println("error");
        }
        scn.close();
    }
}