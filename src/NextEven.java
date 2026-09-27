import java.util.Scanner;

public class NextEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = ((n+2)-(n%2));
        System.out.println(k);

    }
}