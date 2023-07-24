package ifexample;

public class NestedLoop {

	public static void main(String[] args) {
		
	
		int dan;
		int times;
		
		for(dan = 2; dan <=9; dan++){	//2단부터 9단까지 반복하는 외부 반복문
		
			for(times = 1; times <=9; times++){
				System.out.println(dan + "X" + times + "=" + dan * times);
			}							//각 단에서 1~9를 곱하는 내부 반복문
			
			System.out.println();	//한 줄 띄워서 출력
		
		}

	}

}
