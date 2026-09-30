import java.util.Scanner;

public class Devide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int p = (n % m) * (m % n);

        System.out.println(1 / (p + 1));
    }
}

