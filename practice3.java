import java.util.Scanner;
class practice3 {
    public static void main(String[] args) {
        Scanner light=new Scanner(System.in);
        String l1=light.nextLine();

        if(l1.equals("RED")){
            System.out.println("STOP");
        }
        else if(l1.equals("YELLOW")){
            System.out.println("GET READY");
        }
        else if(l1.equals("GREEN")){
            System.err.println("GO");
        }
    }
}
