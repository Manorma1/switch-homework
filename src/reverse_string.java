import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {

       System.out.println("please enter String to revers");
        Scanner scanner = new Scanner(System.in); // use scanner
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder(str);// ose in build string builder

        System.out.println("Reversed string is: ");
        System.out.println(sb.reverse().toString());


    }

    }

















