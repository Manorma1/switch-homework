import java.util.Scanner;

public class city_name {


        public static void main(String[]args) {   // to check city name
            Scanner scanner = new Scanner(System.in);
            char ch;
            System.out.println("please enter any alphabet from a to f");
            ch = scanner.next().charAt(0); //  use character data type
            switch (ch){

                case'a':
                    System.out.println("city name is ahmadabad ");
                    break;
                case 'A':
                    System.out.println("city name is Ahmadabad ");
                    break;
                case 'b':
                    System.out.println("city name is birmingham ");
                    break;
                case 'B':
                    System.out.println("city name is Birmingham");
                    break;
                case 'c':
                    System.out.println("city name is cardiff");
                    break;
                case 'C':
                    System.out.println("city name id Cardiff");
                    break;
                case 'd':
                    System.out.println("city name is delhi");
                    break;
                case 'D':
                    System.out.println("city name is Delhi");
                    break;
                case 'e':
                    System.out.println("city name is edmonton" );
                    break;
                case 'E':
                    System.out.println("city name is Edmonton");
                    break;
                case 'f':
                    System.out.println("city name is far well ");
                    break;
                case 'F':
                    System.out.println("city name is Far well");
                    break;
                default:
                    System.out.println("invalid entry");








            }



















        }

        }
