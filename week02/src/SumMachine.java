
public class SumMachine {
	//더하기 로직
	
	//메소드 코딩시 유의사항	
	//1) 파라미터 : 메소드가 필요한 데이터를 다른 값으로 받게 처리  / 다양한 값에 대해서 여러번 호출하고자 하는 경우 파라미터 사용
	//2) 리턴값 : 메소드의 처리 결과를 반환해줄 때  / 결과값의 자료형과 일치하게 한다
	public int makeSum(int startValue, int endValue){
//		System.out.println("makeSum()......");	
		int start = startValue;	// 오른쪽 값을 왼쪽으로 대입 및 복사
		int end = endValue;
		int sum = 0;
		
		for(int i = start;i <= end; i++){
			sum = sum + i;
		}
		System.out.println("시작값: " + start);
		System.out.println("종료값: " + end);
		System.out.println("총합 = " + sum);
		
		return sum;
	}//makeSum()메소드
	
	public static void main(String[] args) {
		SumMachine m = new SumMachine();
		
		int result = m.makeSum(1,100);	// makeSum() 메소드 호출
		System.out.println("결과값 : " + result);
		m.makeSum(20,500);
		m.makeSum(1, 10000);
	
		
	}//end main
}//end SumMachine
