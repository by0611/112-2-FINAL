import java.util.Scanner;

public class j406 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String keyb = "qwertyuioppasdfghjkllzxcvbnmmQWERTYUIOPPASDFGHJKLLZXCVBNMM";
        String[] input = scn.nextLine().split("");
        for (int i = 0;i<input.length;i++){
            System.out.print(keyb.charAt(keyb.indexOf(input[i])+1));
        } 
       scn.close(); 
    }
}
