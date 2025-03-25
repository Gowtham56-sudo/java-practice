import java.util.Scanner;
class q3{
    public static void main(String args[])
    {
       Scanner name=new Scanner(System.in);

       String RCB=name.nextLine();

       String a=new String("Win");
       String b=new String("Lose");

       if(RCB.equals(a)){
        System.out.println("EE saala cup namde");
       }
       else{
        System.out.println("Cup illa");
       }

    }
}