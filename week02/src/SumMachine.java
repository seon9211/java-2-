
public class SumMachine {
	//���ϱ� ����
	
	//�޼ҵ� �ڵ��� ���ǻ���	
	//1) �Ķ���� : �޼ҵ尡 �ʿ��� �����͸� �ٸ� ������ �ް� ó��  / �پ��� ���� ���ؼ� ������ ȣ���ϰ��� �ϴ� ��� �Ķ���� ���
	//2) ���ϰ� : �޼ҵ��� ó�� ����� ��ȯ���� ��  / ������� �ڷ����� ��ġ�ϰ� �Ѵ�
	public int makeSum(int startValue, int endValue){
//		System.out.println("makeSum()......");	
		int start = startValue;	// ������ ���� �������� ���� �� ����
		int end = endValue;
		int sum = 0;
		
		for(int i = start;i <= end; i++){
			sum = sum + i;
		}
		System.out.println("���۰�: " + start);
		System.out.println("���ᰪ: " + end);
		System.out.println("���� = " + sum);
		
		return sum;
	}//makeSum()�޼ҵ�
	
	public static void main(String[] args) {
		SumMachine m = new SumMachine();
		
		int result = m.makeSum(1,100);	// makeSum() �޼ҵ� ȣ��
		System.out.println("����� : " + result);
		m.makeSum(20,500);
		m.makeSum(1, 10000);
	
		
	}//end main
}//end SumMachine
