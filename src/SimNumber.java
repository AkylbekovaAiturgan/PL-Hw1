import java.util.Scanner;

public class SimNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = a / 1000;
        int c = a / 100 % 10;
        int d = a / 10 % 10;
        int f = a % 10;
        int k = Math.abs(b - f) + Math.abs(c - d) + 1;
        System.out.println(k);
    }
}

