import java.util.Scanner;

class q2{
    public static void main(String args[])
    {
        Scanner mark =new Scanner(System.in);
        String name=mark.nextLine();
        double score=mark.nextInt();
        mark.nextLine();
        String dept=mark.nextLine();
        String college=mark.nextLine();
        System.out.println("my name is:"+ name);
        System.out.println("my score is:"+ score/10);
        System.out.println("my department is:"+ dept);
        System.out.println("my college name is:"+ college);
    }
}