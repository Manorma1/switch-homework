import java.util.Scanner;

public class Calculator {

    public static void main(String[]args) {      // add, sub.multi.div to use symbol;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" please enter first number");
        int a = scanner.nextInt();
        System.out.println("please enter second number");
        int b = scanner.nextInt();
        System.out.println("please enter symbol (+,-,*,/)");
        String sym = scanner.next();
        int add = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;
        double res;



        switch (sym){

            case "+":res=  add;

                            System.out.println("addition of two number is" +add);
                                break;
            case "-": res = sub;
                            System.out.println("subtraction of two number is " +sub);
                            break;

            case "*": res = sub;
                            System.out.println("multiplication of two number is  " +multi);
                            break;

            case "/": res = sub;
                              System.out.println("division of two number is " +div);
            default:

                               System.out.println("invalid entry");





















        }
















    }
}
