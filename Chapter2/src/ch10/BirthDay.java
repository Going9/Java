package ch10;

public class BirthDay {
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; // 불린 티폴트 값 f
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month <1 || month > 12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate()
	{
		if(isValid) {
			System.out.println(year + "/" + month + "/" + day);//isVaild가 참이면 출력
		}
		else {
			System.out.println("unvaild");
		}
	}
}
