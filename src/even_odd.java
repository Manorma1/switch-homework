import java.util.Scanner;

public class even_odd {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in); // use scanner
        System.out.println(" please enter a number");
        int Num = scanner.nextInt();

        switch (Num%2){
            case 0:
                 System.out.println(Num +"number is even");
                 break;

            case 1:
                System.out.println(Num + "number is odd");
                break;



        }








    }
}














