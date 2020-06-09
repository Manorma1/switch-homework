import java.util.Scanner;

public class detect_Key_presses {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" please enter key (0to 9)");
        char key = scanner.next().charAt(0);

        switch (key){

            case'0':
                          System.out.println("you pressed number 0.");
                          break;

            case '1':
                          System.out.println("you pressed number 1.");
                          break;
            case '2':
                           System.out.println("you pressed number 2. ");
                           break;

            case '3':
                           System.out.println("you pressed number 3. ");
                           break;
            case '4':
                            System.out.println("you pressed number 4 .");
                            break;
            case '5':
                           System.out.println("you pressed number 5. ");
                           break;

            case '6':
                           System.out.println("you pressed number 6 .");
                           break;

            case '7':
                            System.out.println("ypu pressed number 7.");
                            break;

            case '8':
                            System.out.println("ypu pressed number 8 .");
                            break;

            case '9':
                             System.out.println("ypu pressed number 9 .");
                             break;
            default:
                            System.out.println("not allowed");




        }






























    }





























}
