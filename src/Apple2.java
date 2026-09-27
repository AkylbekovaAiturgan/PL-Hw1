import java.util.Scanner;

public class Apple2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int a = k%n;
        System.out.println(a);

    }
}

