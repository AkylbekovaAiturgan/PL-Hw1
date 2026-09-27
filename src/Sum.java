import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a%10;
        int c = (a%100)/10;
        int d = a/100;
        int k = b+c+d;
        System.out.println(k);

    }
}
