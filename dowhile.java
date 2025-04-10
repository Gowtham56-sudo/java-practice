import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int count=0;

        do{
            System.out.println("enter the Number >10");
            count=scan.nextInt();
         } while (count<10);
       
            System.out.println("This is enough");
    }
}
