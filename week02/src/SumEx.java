public class SumEx {
	public static void main(String[] args) {
		//1부터 100까지 더한 합
		int start = 1;
		int end = 100;
		int sum = 0;
		
		for(int i = start; i <= end; i++){
			sum = sum + i;
		}//end for
		System.out.println("합은 = " + sum);
		
	}//end main

}
