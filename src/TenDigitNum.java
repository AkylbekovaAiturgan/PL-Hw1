import java.util.Scanner;

public class TenDigitNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = n%100;
        System.out.println(k/10);

    }
}


