import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int t = b-c;
        int y = a-b;
        int k = y/t;
        int g = k+1;
        System.out.println(g);
    }
}


