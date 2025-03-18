import java.lang.System;
import java.util.Scanner;
 class hello{
    public static void main(String args[])
    {
        Scanner gowtham= new Scanner(System.in);
        int a=gowtham.nextInt();
        int b=gowtham.nextInt();
        int c=gowtham.nextInt();
        int d=a*b*c;
        int e=a+b+c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("multiplication is"+d);
        System.out.println("addition is"+e);
        System.out.println(d/e);

    }
 }