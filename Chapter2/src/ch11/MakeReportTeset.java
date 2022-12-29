package ch11;

public class MakeReportTeset {

	public static void main(String[] args) {
		
		MakeReport builder = new MakeReport(); //클래스 생성 방법. (클래스형) (변수이름) = new (생성자);
		String report = builder.getReport();
		
		System.out.println(report);
	}

}
