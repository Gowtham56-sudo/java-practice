import java.util.Scanner;
class loop2 {
    public static void main(String[] args) {
        Scanner mark =new Scanner(System.in);
        System.out.println("Number 1:");
        int a = mark.nextInt();
        System.out.println("Number 2:");
        int b = mark.nextInt();
    

        for( int i=a;i<=b;i=i+1)
        {
         if(i%2==0){
            System.out.println("Even numbers are"+i);
         }
         else{
            System.out.println("Odd numbers are"+i);
        }
        
         }
    }   
}
