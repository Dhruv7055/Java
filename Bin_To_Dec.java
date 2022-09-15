import java.util.Scanner;

public class Bin_To_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 0;
		int i = 0;
		while(true) {
			if(n == 0) {
				break;
			}
			else {
				int temp = n % 10;
				n1 += temp * Math.pow(2, i);
				n = n / 10;
				i++;
			}
		}
		System.out.println(n1);
	}

}
