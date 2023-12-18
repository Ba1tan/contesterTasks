import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 0;
        outTheInput(a);

    }
    public static void outTheInput(int a)
    {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.print(a);
    }

}