import java.util.Scanner;

public class SimNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = n / 1000;
        int b = n / 100 % 10;
        int c = n / 10 % 10;
        int d = n % 10;

        System.out.println((a == d && b == c) ? 1 : 37);
    }
}



