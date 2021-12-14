package prime;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class primeeven {


			public static void main(String[] args) throws FileNotFoundException {



		
			System.out.println("Enter the Height ");
			Scanner in = new Scanner(System.in);
			int x = in.nextInt();
			System.out.println("Enter the starting number");
			int num=in.nextInt() ;


			for (int i = 1; i <= x; i++) {
			for (int k = 1; k <= Math.pow(2, (i-1)); k++) {



			while (!isprime(num)) {
			num++;
			}
			System.out.print(" "+num+" ");
			num++;
			}
			System.out.println();
			}
			}
			
			public static boolean isprime(int n) {
				int c = 0;
				for (int i = 1; i <= n; i++) {
				if (n % i == 0)
				c++;
				}
				if (c == 2)
				return true;
				else
				return false;
				}


	}


