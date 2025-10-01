import java.util.*;
public class Main {
    public static void main(String[] args) {
        Factory obj =new Factory();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the team name:\n");
        String teamname=sc.next();
        
        Iplannouncement selector=obj.teamselector(teamname);

        selector.teamannouncement();
        selector.captaindetails();
    }
}
