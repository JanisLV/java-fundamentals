package control_flow.if_else;

public class Excercise1 {

    public static void main(String[] args) {

        /* Modify the sample application so that the retrieved number (age) comes
        from the console. Verify the application for each case (number smaller,
        equal to or greater than …).*/

        int age = 35;

        if (age < 18) {
            System.out.println("You are teenager!");
        } else if (age > 100) {
            System.out.println("You are very old!");
        } else {
            System.out.println("You are adult!");
        }

    }

}
