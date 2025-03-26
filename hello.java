import java.util.Scanner;
class q3{
    public static void main(String args[])
    {
        Scanner mark = new Scanner(System.in);
        int a =mark.nextInt();

        if(a % 2 ==0)
        {
            System.out.print("the Number is Even");
        }
        else{
            System.out.print("The number is odd");
        }
    }
}