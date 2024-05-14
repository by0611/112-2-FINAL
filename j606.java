import java.util.Scanner;

public class j606 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0;i < 3;i++){
            String Std_id = scn.nextLine();
            if (id_compute(Std_id)){
                System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            } 
            scn.close();
        }
    }
    public static boolean id_compute(String Std_id){
        if (Std_id.length() != 6){
            return false;
        }
        char[] calculate = Std_id.toCharArray();
        int sum = (calculate[0] - '0' + calculate[2] - '0' + calculate[4] - '0') + ((calculate[1] - '0' + calculate[3] - '0') * 5);
        int count = sum % 26;
        char code_check = (char) ('A' + count - 1 );
        return code_check == calculate[5];
    }
}
