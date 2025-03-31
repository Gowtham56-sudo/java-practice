 import java.util.Scanner;
 
 class practice4 {
        public static void main(String[] args) {
            Scanner mark = new Scanner(System.in);
            int a= mark.nextInt();
            int b = mark.nextInt();
       

            String result = a>b?"A is greater value":"A is lesser value";

            System.out.println(result);
        }
    
}
