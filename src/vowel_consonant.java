import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[]args) {  // to check alphabet is vowel or consonant;
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("please enter any alphabet"); // use scanner
        ch = scanner.next().charAt(0);


        switch (ch){

            case 'a':
                 System.out.println("alphabet is vowel");
                 break;
            case 'A':
                     System.out.println("alphabet is vowel");
                break;

            case 'e':
                  System.out.println("alphabet is vowel");
                break;
            case 'E':
                System.out.println("alphabet is vowel");
                break;
            case 'i':
                System.out.println("alphabet is vowel");
                break;
            case 'I':
                System.out.println("alphabet is vowel");
                break;
            case 'o':
                System.out.println("alphabet is vowel");
                break;
            case 'O':
                System.out.println("alphabet is vowel");
                break;
            case 'u':
                System.out.println("alphabet is vowel");
                break;
            case 'U':
                System.out.println("alphabet is vowel");
                break;
            default:
                System.out.println("alphabet is consonant");




        }


    }
}
