import java.util.Scanner;

public class ElectrClock1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        n = n%1440;
        int h = n/60;
        int m = n%60;
        System.out.print(h + " " + m);
    }
}

