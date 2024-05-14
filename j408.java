import java.util.Scanner ;
public class j408 {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in) ;
        String a = scn.nextLine();
        String b = scn.nextLine();
        if (a.length()<3||b.length()<3||a.length()>20||b.length()>20){
            System.out.println("error");
            System.exit(0);
        }
        else{
            System.out.println(a.length());
            System.out.println(b.length());
        }
        String mix = a + b;
        for (int i = (mix.length()-1);i >= 0;i--){
            System.out.print(mix.charAt(i));
        }
        scn.close();
    }
}