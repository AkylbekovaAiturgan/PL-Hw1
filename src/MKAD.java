import java.util.Scanner;

public class MKAD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int t = input.nextInt();
        int a = ((v*t)%109+109)%109;
        System.out.println(a);

    }
}

