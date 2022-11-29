package test4;
import java.util.Scanner;

public class Overload3 {

    public void compare(int a, int b) {
        
        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        
    }
    
    public void compare(char a, char b) {
        int x = (int)a;
        int y = (int)b;
        
        if (x > y) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        
    }
    
    public void compare(String a, String b) {
        
        int l1 = a.length();
        int l2 = b.length();
        
        if (l1 > l2) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Overload3 obj = new Overload3();
        
        System.out.print("Enter first integer: ");
        int n1 = in.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = in.nextInt();
        obj.compare(n1, n2);
        
        System.out.print("Enter first character: ");
        char c1 = in.next().charAt(0);
        System.out.print("Enter second character: ");
        char c2 = in.next().charAt(0);
        in.nextLine();
        obj.compare(c1, c2);
        
        System.out.print("Enter first string: ");
        String s1 = in.nextLine();
        System.out.print("Enter second string: ");
        String s2 = in.nextLine();
        obj.compare(s1, s2);
    }
	}


