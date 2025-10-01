
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter URL to load: ");
        String url = scanner.nextLine();

        WebPage page = new ProxyWebPage(url);

        
        System.out.println("\nFirst Request !!!");
        System.out.println(page.getContent());

       
        System.out.println("\nSecond Request !!!!");
        System.out.println(page.getContent());

        scanner.close();
    }
}
