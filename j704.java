import java.util.Scanner;
public class j704{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        if (n <= 1 || n > 15){
            System.out.println("error");
            System.exit(0);
        }

        int[] nums = new int[n];
        for (int i = 0; i < n ;i++){
            nums[i] = scn.nextInt();
        }

        int count = 0;
        int temp = 0;
        for (int i = 0;i < n;i++){
            if (count == 0){
                temp = nums[i];
                count = 1;
            }
            else if (nums[i] == temp){
                count++;
            }
            else{
                count--;
            }
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == temp) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println(temp);
        } 
        else {
            System.out.println("error");
        }
        scn.close();

    }
}
