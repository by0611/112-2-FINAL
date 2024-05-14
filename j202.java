import java.util.Scanner;
public class j202{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (100>=a&&a>60){
            System.out.println(a+10);
        }
        else if(a>0&&a<=60) {
            System.out.println(a+5);
        }
        else{
            System.out.println("error");
        }
        scn.close();
    }
}
