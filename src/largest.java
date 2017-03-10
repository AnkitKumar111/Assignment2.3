//program to find the highest among the given 3 numbers.
import java.util.Scanner;
public class largest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int a, b, c, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter all three numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        //we use ternary operator(?, >, : ) to find largest number
        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("Largest Number:"+d);

        s.close();
	}

}
