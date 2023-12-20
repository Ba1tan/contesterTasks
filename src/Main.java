import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        if(isMultiple(x, y) == true)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
    public static boolean isMultiple(int x, int y)
    {
        if(x % y == 0)
        {
            return true;
        }
        return false;
    }



}