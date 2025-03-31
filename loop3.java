import java.util.Scanner;
class loop3 {
    public static void main(String[] args) {
        Scanner mark =new Scanner(System.in);
        System.out.println("Number 1:");
        int a = mark.nextInt();
        System.out.println("Number 2:");
        int b = mark.nextInt();
        int oddcount=0;
        int evencount=0;

        for( int i=a;i<=b;i=i+1)
        {
         if(i%2==0){
            evencount=evencount+1;
            System.out.println("Even numbers are:"+i);
         }
         else{
            oddcount=oddcount+1;
            System.out.println("Odd numbers are:"+i);
        }
        
         }
         System.out.println("The total even numbers are:"+evencount);
         System.out.println("THe total odd number are :"+oddcount);
    }   
}
