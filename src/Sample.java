public class Sample {
    public static void main(String[] args) {
//        Demo obj = new Demo();
//        Demo oibj2 = new Demo();
//        String b = null;
//        String a = new String("abcd");
//        System.out.println(a.toUpperCase());
//        System.out.println("10");

//        Account account = new Account();
//        account.setAccountHolderName("Bipul Gonsalves");
//        System.out.println(account.getAccountHolderName());
//
//        Account.printCountryName();

        //System.out.println(Student.getGrade(79));

        //---------control statements----------
        //switchCaseDemo(5);

        //--------------loop section------------
        //for loop
        //forLoopDemo();

        //while loop
        //whileLoopDemo();

    }

    private static void whileLoopDemo() {
        int start = 1;

        while (start <= 20) {
            if (start % 3 == 0) {
                System.out.println(start + " is divisible by three");
            }

            start = start + 1;
        }
    }

    private static void forLoopDemo() {
        //following loop prints the even numbers from 1 to 20
        for(int start = 1; start <= 20; start = start + 1) {
            if (!(start % 2 == 0)) {
                System.out.println(start + " is an even number");
            }
        }

        System.out.println("Came out from loop one");

        //following loop prints the odd numbers from 1 to 20
        for(int start = 1; start <= 20; start = start + 1) {
            if(start % 2 == 1) {
                System.out.println(start + " is an odd number");
            }
        }

        System.out.println("Came out from loop two");

        //following loop prints the numbers divisible by both 2 & 3 in the range 1 to 20
        for(int start = 1; start <= 20; start = start + 1) {
            if (start % 2 == 0 && start % 3 == 0) {
                System.out.println(start + " is divisible by both 2 and 3");
            }
        }

        System.out.println("Came out from loop three");
    }

    private static void switchCaseDemo(int dayNumber) {

        switch (dayNumber) {
            case 1:
                System.out.println("It is monday");
                break;
            case 2:
                System.out.println("It is tuesday");
                break;
            case 3:
                System.out.println("It is wednesday");
                break;
            case 4:
                System.out.println("It is thursday");
                break;
            case 5:
                System.out.println("It is friday");
                break;
            case 6:
                System.out.println("It is saturday");
                break;
            case 7:
                System.out.println("It is sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }

    }
}
