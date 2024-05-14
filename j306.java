import java.util.Scanner;
public class j306{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int Ans = compute(a);
        System.out.printf("%d!=%d",a,Ans);
        scn.close();
        
    }
    public static int compute(int n){
        if (n==0){
            return 1;
        }
        else if (n>=1){
            return n*compute(n-1);
        }
        else{
            return -1;
        }
    }

}



