import java.util.Scanner;

 class practice2 {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        int Tamil = mark.nextInt();
        int English = mark.nextInt();
        int Maths = mark.nextInt();
        int Science =mark.nextInt();
        int Social = mark.nextInt();
        int Total= Tamil+English+Maths+Science+Social;
        int Average=Total/5;

        System.out.println("Total mark is "+Total);
        System.out.println("Your average Mark is"+Average);

        if(Average<35){
            System.out.print("Additional Class Required");
        }
        else{
            System.out.println("You are good to go");
        }
    }
    
}
