import java.util.Scanner;

class practice {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        int score=mark.nextInt();

        if(score<50){
            System.out.println("You need to improve");
        }
        else if(score>=50 && score<=70){
            System.out.println("good Job");

        }
        else{
            System.out.println("Excellent performance");
        }
    }

    
}