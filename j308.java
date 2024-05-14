import java.util.Scanner;
public class j308{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for (int i = a;i>=1;i--){
            int Ans = compute(i);
            System.out.printf("fib(%d)=%d\n",i,Ans);
        }
        scn.close();
    }
    public static int compute(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        else{
            return compute(n-1)+compute(n-2);
        }
    }
}



