import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        SchoolBell bell = SchoolBell.getInstance();

        System.out.println("Enter number of periods:");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of period " + i + ": ");
            String period = sc.nextLine();
            bell.ring(period);
        }

        SchoolBell bell2 = SchoolBell.getInstance();
        System.out.println("Are both bells same " + (bell == bell2));
    }
}
