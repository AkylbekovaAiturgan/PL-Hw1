import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int g = (Math.max(0, a-b)+b-c-1)/(b-c)+1;
        System.out.println(g);
    }
}


