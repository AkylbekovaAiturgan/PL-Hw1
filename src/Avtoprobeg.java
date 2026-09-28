import java.util.Scanner;

public class Avtoprobeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int c = (n+m-1)/n;
        System.out.println(c);
    }
}

