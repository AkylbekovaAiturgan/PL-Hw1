import java.util.Scanner;

public class Cost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int k = (a*100+b)*c;
        System.out.println(k/100 + " " + k%100);
    }
}

