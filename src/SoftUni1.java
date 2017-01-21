import javax.swing.*;
import java.io.Console;
import java.util.Scanner;
public class SoftUni1{
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        System.out.println("You entered"+a);
        System.out.println("You entered"+b);
        System.out.println("Final result"+  a*b);
    }
}
