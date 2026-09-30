import java.util.Scanner;

public class SimNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = n / 1000;
        int b = n / 100 % 10;
        int c = n / 10 % 10;
        int d = n % 10;

        int x = Math.abs(a - d);
        int y = Math.abs(b - c);

        System.out.println((x + y) == 0 ? 1 : 0);
    }
}



