package weeklyassignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum=0, secondNum=1,range=8, sum;
		System.out.println("firstNum");
		for(int i=0;i<=range;i++) {
			sum=firstNum+secondNum;
			secondNum=firstNum;
			sum=secondNum;
			System.out.println("sum");
		}		
	}
}
