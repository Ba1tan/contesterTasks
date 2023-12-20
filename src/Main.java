import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.print(average(x, y));
    }
    public static double average(int x, int y)
    {
        return (x + y) / 2.0;
    }
}
