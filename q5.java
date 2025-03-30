class q5{
    public static void main(String args[]){
        boolean kfc = true;
        boolean chicken = false;
        boolean pepsi = false;
        boolean french =true;

        if(kfc){
            System.out.println("Enter into KFC");

            if(chicken){
                System.out.println("eating chicken");

                if(pepsi){
                    System.out.print("Drinking pepsi");
                }
                else{
                    System.out.println("Orderr next item");
                }
            }
            else{
                System.out.println("Eat Burger");

                if(french){
                    System.out.println("Its tasty");
                }
            }




        }
    }
}
