import java.io.*;
import java.util.Scanner;

public class j706 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int count = 4;
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            a[i] = scn.nextInt();
        }

        try (Scanner fileScanner = new Scanner(new File("read.txt"))) {
            while (fileScanner.hasNextInt() && count < a.length) {
                a[count++] = fileScanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: read.txt");
             scn.close();
            return;
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }   

        try (PrintWriter writer = new PrintWriter("write.txt")) {
            for (int i = 0; i < count; i++) {
                System.out.println(a[i]);
                writer.println(a[i]);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot write to file: write.txt");
        }

        scn.close();
    }
}
