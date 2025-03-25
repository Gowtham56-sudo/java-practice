import java.util.Scanner;
class q4{
    public static void main(String args[])
    {
       Scanner name=new Scanner(System.in);

       String meghana=name.nextLine();

       if(meghana.equals("Dead")){
        System.out.println("Surya Meets Ramya");
       }
       else{
        System.out.println("Surya weds Meghana");
       }
    }
}