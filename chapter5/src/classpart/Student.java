package classpart;

public class Student {

	int studentID;			//학번
	String studentName;		//학생 이름
	int grade;				//학년
	String address;			//사는 곳
	
	public void showStudentInfo( ) {
		System.out.println(studentName + "," + address);	//이름, 주소 출력
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
