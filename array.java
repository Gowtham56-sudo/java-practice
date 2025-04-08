import java.util.Scanner;
public class array {
   public static void main(String[] args) {
    Scanner score = new Scanner(System.in);
    int[] playlist = new int[5];
    System.out.println("Enter first number:");
    playlist[0]=score.nextInt();
    System.out.println("Enter second number:");
    playlist[1]=score.nextInt();
    System.out.println("Enter third number:");
    playlist[2]=score.nextInt();
    System.out.println("Enter fourth number:");
    playlist[3]=score.nextInt();
    System.out.println("Enter fivth number:");
    playlist[4]=score.nextInt();

    System.out.println(playlist[0]+playlist[1]+playlist[2]+playlist[3]+playlist[4]);
    
   } 
}
