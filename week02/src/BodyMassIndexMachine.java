import java.util.Scanner;
public class BodyMassIndexMachine {
	//ī���� ������ ���ϴ� �޼ҵ�
	public float calculate(float height, float weight){
		System.out.println("ī���� ���� ���ϱ�...");
		float h = height;	// Ű(m)
		float w = weight;	// ������(kg)
		float index = w / (h * h);
		
		return index;		
	}
	//ī���� ������ ���� �� ���¸� �˷��ִ� �޼ҵ�
	public String getIndex(float indexValue){	// char, String
		if(indexValue > 30) {
			return "��";	// ��
			}
		else if(indexValue > 24) {
			return "��ü��";	// ��ü��
		}
		else if(indexValue > 20) {
			return "����";	// ����
		}
		else if(indexValue > 15) {
			return "��ü��";	// ��ü��
		}
		else if(indexValue > 13) {
			return "����";	// ����
		}
		else if(indexValue > 10) {
			return "�������";	// �������
		}
		else {
			return "�Ҹ���";	// �Ҹ���
		}
			
			
	}
	public static void main(String[] args) {
		BodyMassIndexMachine m = new BodyMassIndexMachine();
		Scanner sc = new Scanner(System.in);		
		System.out.println("Ű�� �Է��ϼ��� .(�� 170cm => 1.7)");
		float height = sc.nextFloat();	// 175cm
		
		System.out.println("�����Ը� �Է��ϼ���. (�� 70kg => 70)");
		float weight = sc.nextFloat();	// 70kg
		
		float index = m.calculate(height, weight);
		
		System.out.println("ī���� ���� = " + index);
		System.out.println("������ : " + m.getIndex(index));
	}

}
