import java.util.Scanner;

public class j602 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String point = scn.nextLine();
        String uppercase = "";
        String lowercase = "";
        int upCount = 0;

        for (int i = 0; i < point.length(); i++) {
            char ch = point.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercase += ch;
                upCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercase += ch;
            }
        }
        System.out.println(uppercase);
        System.out.println(lowercase);
        System.out.println(upCount);

        scn.close();
    }
}
