package loopexample;

public class ContinueExample {
	
	public static void main(String[] args) {

		int total = 0;
		int num;
		
		for(num = 0; num <= 100; num++){	//100까지 반복
			
			if( num % 2 == 0) 				//num 값이 짝수인 경우
				continue;					//이후 수행을 생략하고 num++ 수행
			total += num;					//num 값이 홀수인 경우에만 수행
			
		}
		
		System.out.println("1부터 100까지의 홀수의 합은 :" + total + "입니다.");
	}

}

/* %연산자는 나머지 값을 반환합니다.
num 값이 짝수라면 2로 나눴을 때 나머지가 0이기 때문에 num%2==0이 짝수 조건을 의미하는 것입니다.
*/