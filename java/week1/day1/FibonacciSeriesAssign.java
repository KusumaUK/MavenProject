package week1.day1;

public class FibonacciSeriesAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=10;
		int n1=0;
		int n2=1;
		for(int i=1;i<=max;i++)
		{
			System.out.println(n1+" ");
			int sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		

	}

}
