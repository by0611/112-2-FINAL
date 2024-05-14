import java.util.Scanner;

public class j404 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String point = scn.nextLine();
        int[] count = new int[26];
        for (int i = 0;i<point.length();i++){
            char ct = point.charAt(i);
            if (ct >= 'a'&&ct <= 'z'){
                count[ct-'a']++;
            }
        }
        int Mcount = count[0];
        char Mchar = 'a';
        for (int i = 1;i<count.length;i++){
            if (count[i]>Mcount){
                Mcount = count[i];
                Mchar = (char) ('a'+i);
            }
        }
        System.out.println(Mchar);
        System.out.println(Mcount);
        scn.close();
    }
}
