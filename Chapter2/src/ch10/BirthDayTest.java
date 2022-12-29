package ch10;

public class BirthDayTest {

	public static void main(String[] args) {
		
		BirthDay date = new BirthDay();
		date.setYear(2019);
		date.setMonth(11 );
		date.setDay(30);
		
		date.showDate(); //참조변수.메서드
	}

}

// 그러니깐 BirthDay에서 프라이빗으로 둬서 참조변수.멤버변수, 가령 myBrithday.day = 100; 과 같은 접근 불가
/* 그런데 메서드를 퍼블릭으로 둬서 참조변수.메서드 형식으로 접근 가능. 
 * 그래서 멤버변수 접근 하며 발생할 수 있는 문제 막고 메서드만 관리하면 되는 장점 있음 */ 
