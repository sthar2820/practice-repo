import java.util.Scanner;
public class Assign{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter 1st birth month: ");
   String month1 = input.nextLine();
   System.out.print("Enter 1st birth day: ");
   String day1 = input.nextLine();
   
   System.out.print("\nEnter 1st birth month: ");
   String month2 = input.nextLine();
   System.out.print("Enter 1st birth day: ");
   String day2 = input.next();
   
   System.out.printf("\n%-15s  | %-3s","Month","Day");
   System.out.println("\n============================");
   System.out.printf("%-15s  | %-3s",month1,day1);
   System.out.printf("\n%-15s  | %-3s",month2,day2);


   
   

   
   
    }
}
