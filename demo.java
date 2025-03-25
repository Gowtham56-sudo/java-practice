import java.util.Scanner;

class demo {
    public static void main (String args[])
    {
        Scanner user =new Scanner(System.in);
        int num1 = user.nextInt();
        int num2 = user.nextInt();

        if(num1==num2){
            System.out.print("both are equal");
        }
        else{
            System.out.print("both are not equal");
        }
    }
}