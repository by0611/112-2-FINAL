import java.util.Scanner;
public class j502 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long num = scn.nextLong();
        String str_num = String.valueOf(num);
        int count = 1;
        for (int i = 0;i<str_num.length();i++){
            int get_num = Character.getNumericValue(str_num.charAt(i));
            System.out.print(get_num);
            count *= get_num;
            if (i<str_num.length()-1){
                System.out.print("*");
            }
        }
        System.out.print("="+count);
        scn.close();
    }
}   

