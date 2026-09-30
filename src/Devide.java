import java.util.Scanner;

public class Devide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int a = n % m;
        int b = m % n;

        System.out.println((a * b == 0) ? 1 : -1);
    }
}

