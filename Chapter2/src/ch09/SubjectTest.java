package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 120);
				
		Student studentBee = new Student(100, "Bee");
		studentBee.setKoreaSubject("국어", 100);
		studentBee.setMathSubject("수학", 120);
		
		studentLee.showScoreInfo();
		studentBee.showScoreInfo();
	}

}
