import java.util.Scanner;
public class BodyMassIndexMachine {
	//카우프 지수를 구하는 메소드
	public float calculate(float height, float weight){
		System.out.println("카우프 지수 구하기...");
		float h = height;	// 키(m)
		float w = weight;	// 몸무게(kg)
		float index = w / (h * h);
		
		return index;		
	}
	//카우프 지수에 따른 몸 상태를 알려주는 메소드
	public String getIndex(float indexValue){	// char, String
		if(indexValue > 30) {
			return "비만";	// 비만
			}
		else if(indexValue > 24) {
			return "과체중";	// 과체중
		}
		else if(indexValue > 20) {
			return "정상";	// 정상
		}
		else if(indexValue > 15) {
			return "저체중";	// 저체중
		}
		else if(indexValue > 13) {
			return "마름";	// 마름
		}
		else if(indexValue > 10) {
			return "영양실조";	// 영양실조
		}
		else {
			return "소모증";	// 소모증
		}
			
			
	}
	public static void main(String[] args) {
		BodyMassIndexMachine m = new BodyMassIndexMachine();
		Scanner sc = new Scanner(System.in);		
		System.out.println("키를 입력하세요 .(예 170cm => 1.7)");
		float height = sc.nextFloat();	// 175cm
		
		System.out.println("몸무게를 입력하세요. (예 70kg => 70)");
		float weight = sc.nextFloat();	// 70kg
		
		float index = m.calculate(height, weight);
		
		System.out.println("카우프 지수 = " + index);
		System.out.println("몸상태 : " + m.getIndex(index));
	}

}
