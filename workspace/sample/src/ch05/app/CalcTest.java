package ch05.app;
import ch05.lib.Calculator;
import ch05.lib.LgCalc;
import ch05.lib.SamsungCalc;
public class CalcTest {
//	main 에서 바로 가져다 쓸 메소드 선언(실행 가능한 상태 여야함 => static)
	public static void print(Calculator calc) { // Calculator 클래스(파라미터:재료)는 3개를 받을 수 있다.-Calculator/SamsungCalc/LgCalc
		System.out.println(calc.getName() + " 더하기 : " + calc.add(3, 4));
		System.out.println(calc.getName() + " 빼기 : " + calc.subtract(10, 5));
		System.out.println(calc.getName() + " 평균 : " +calc.average(new int[] {2,3,4}));
	}
	
	public static void main(String[] args) {
		//여기만 변경된다.
		//다형성의 구현: 여기만 바꿔도 나머지 코드는 안바꿔도 된다.
		//여기만 바꿀 수 있는 이유: 오버라이딩
		//오버라이딩이 꼭 필요한 class : 추상class
		Calculator calc = new LgCalc("LG 계산기");
		
		//나머지는 변경 안해도 정상 실행된다. => 다형성이다.
		print(calc);
	}
}

