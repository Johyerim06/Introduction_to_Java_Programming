package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "이상원";
		studentLee.setStudentName("이상원");
			//setStudentName()메서드를 활용해 private 변수에 접근 가능
		
		
		System.out.println(studentLee.getStudentName());

	}

}

//private 변수는 외부 클래스의 변수에 접근할 수 없다.