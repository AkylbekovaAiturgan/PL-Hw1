import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int k = (a*3600)+(b*60)+c;
        int t = (d*3600)+(e*60)+f;
        System.out.println(t-k);
    }
}

