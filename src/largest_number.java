import java.util.Scanner;

public class largest_number {
     public static void main(String[]args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("please enter first number ");
         int num1 = scanner.nextInt();
         System.out.println("please enter second number");
         int num2 =scanner.nextInt();
         System.out.println("please enter third number");
         int num3 = scanner.nextInt();

         if (num1>num2 && num1>num3){
             System.out.println("first number is largest ");

         }
         else if(num2>num1 && num2>num3){

             System.out.println("second number is largest");
         }
         else{
             System.out.println("third number is largest");
         }























 }








}
