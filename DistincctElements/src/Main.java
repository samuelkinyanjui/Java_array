public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] x={2,6,2,8,2,2};
        System.out.println("Distinct"+distinctelements(x));
    }


    public static int distinctelements(int [] x) {
        int distinct = 0;
        boolean isdistinct = true;
        for (int counter = 0; counter < x.length; counter++)
        {
            System.out.println("counter"+counter);
            for (int innerloop = 0; innerloop < counter; innerloop++) {
                System.out.println("innerloop"+innerloop);
                if (x[innerloop] == x[counter])
                {
                    isdistinct = false;
                    //break;
                }

            }
            if (isdistinct==true ) {

                distinct++;

            }
            isdistinct = true;



        }
        System.out.println("isdistinct" +distinct);
        return distinct;
    }
}