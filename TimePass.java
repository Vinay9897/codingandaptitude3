public class TimePass {
    public static void main(String[] args) {
        int numberVolenteers = 14;
        int pair = 5;
        if (numberVolenteers % 5 == 0) {
            System.out.println("0");
        } else {
            int i = 2;
            while (numberVolenteers > pair) {

                pair = 5 * i;
                System.out.println(pair);

                int rem;
                if (pair > numberVolenteers) {
                    rem = pair - numberVolenteers;
                    System.out.println(rem);
                } else {
                    i += 1;
                }
            }
        }
    }
}