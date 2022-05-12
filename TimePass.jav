public class TimePass{
    public static void main(String[] args) {
        int numberVolenteers = 14;
        int pair = 5;
        if(numberVolenteers % 5 == 0){
            System.out.println("0");
        }
        else{
            while(numberVolenteers>pair){
                int i ;
                pair   = pair *5;
                int rem ;
                if(pair> numberVolenteers)
                {
                    rem = pair - numberVolenteers;
                    System.out.println(rem);
                }
            }
        }
    }
}