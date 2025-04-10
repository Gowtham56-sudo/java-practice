import java.util.Random;

class whileloop{
    public static void main(String[] args) {
        
        Random sum=new Random();
        int mark=0;
       while(mark!=4)
       {
        mark=sum.nextInt(11);
        System.out.println(mark);
       }
    }
}