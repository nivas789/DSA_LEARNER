import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                int x = scanner.nextInt();
                
                int subscriptions = (n + 5) / 6;
                int totalCost = subscriptions * x;
                
                System.out.println(totalCost);
            }
        }
        scanner.close();
	}
}
