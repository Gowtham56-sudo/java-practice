import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
    
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the Array size:");
            int size = scan.nextInt();
            System.out.println("Enter the marks:");
            int[] marks=new int[size];

            for(int i=0;i<=size-1;i=i+1)
            {
                marks[i]=scan.nextInt();
            }
            for(int i=0;i<=size-1;i=i+1)
            {
           System.out.println(marks[i]);
            }
    }
    
}
