import java.util.Scanner;

public class EndLessons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 9*60+a*45+((a-1)/2)*15+((a+1-1)/2)*5;
        System.out.println(b/60 + " " + b%60);
    }
}
