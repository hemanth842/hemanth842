package gitconnection;

import java.util.Scanner;

public class hemanth {

	public static void main(String[] args, int f) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		f = 1;
		for(int i = 1;i <= n;i++)
		{
			f = f*i;
		}
		System.out.println(f);
	}

}
