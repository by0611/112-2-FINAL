import java.util.Scanner;

public class j508{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String binary1 = scn.nextLine();
        String binary2 = scn.nextLine();
        int decimal1 = Integer.parseInt(binary1, 2);//轉十位
        int decimal2 = Integer.parseInt(binary2, 2);//轉十位
        int sum = decimal1 + decimal2;

        if (sum > 255) {
            System.out.printf("%s + %s = %d\n",decimal1,decimal2,sum);
            System.out.println("11111111");
        } 
        else {
            System.out.printf("%s + %s = %d\n",decimal1,decimal2,sum);
            String binarySum = Integer.toBinaryString(sum);//轉二位
            System.out.println(binarySum);
        }

        scn.close();
    }
}
