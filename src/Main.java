import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        diff(x, y);
    }
    public static void diff(int x, int y)
    {
        if(x < y)
        {
            System.out.print('<');
        }
        if(x > y)
        {
            System.out.print('>');
        }
        else
        {
            System.out.print('=');
        }
    }
}
