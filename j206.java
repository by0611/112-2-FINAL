import java.util.Scanner;
public class j206{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int count = 0;
        for (int i = a;i<=b;i++){
            if(i%2==1){
                count += i;
            }
        }
        System.out.println(count);
        scn.close();
    }
}


