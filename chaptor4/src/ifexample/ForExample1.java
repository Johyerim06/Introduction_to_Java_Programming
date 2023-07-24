package ifexample;

public class ForExample1 {

	public static void main(String[] args) {
		
		int i;
		int sum;
		for(i = 0, sum = 0; i <= 10; i++){ //for문에서 가장 자주 사용하는 변수 이름은 i입니다. 주로 횟수를 표현합니다.
			
			sum += (i+1);
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

	}

}

/* for문의 기본 구조
----------------------
for(초기화식;조건식;증감식){
	수행문;
}
-----------------------
*/