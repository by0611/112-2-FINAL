import java.util.Scanner;
public class j310{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int Ans = compute(a);
        System.out.println(Ans);
        scn.close();
    }
    public static  int compute(int n){
        int count = 0;
        for (int i = 1;i<=n;i++){
            int temp = 0;
            int a = i/100;
            int b = (i%100)/10;
            int c = (i%100)%10;
            if (1000>i&&i>=100){
                temp = (a*a*a)+(b*b*b)+(c*c*c);
            }
            else if (100>i&&i>=10){
                temp = (b*b)+(c*c);
            }
            else {
                temp = c;
            }
            if (i==temp){
                System.out.println(i);
                count+=i;
            }
        }
        return count;
    }
}


