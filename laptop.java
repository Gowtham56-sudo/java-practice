public class laptop {
    String name="";
    String proc="";
    int ram=0;
    int price=0;

    public static void main(String[] args) {
        laptop lap1=new laptop();
        lap1.name="Asus";
        lap1.proc="Amd ryzen 7";
        lap1.ram=8;
        lap1.price=50000;

        System.out.println(lap1.price);
    }
}
