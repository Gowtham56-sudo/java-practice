import java.util.Scanner;
class q3{
    public static void main(String args[])
    {
        Scanner mark = new Scanner(System.in);
        int a =mark.nextInt();

        if((a % 3 == 0 )&& (a%5==0))
        {
            System.out.print("the Number is divisible by 3 and 5");
        }
        else{
            System.out.print("The number is not divisibe by 3 and 3");
        }
    }
}