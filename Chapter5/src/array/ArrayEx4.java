package array;

public class ArrayEx4 {

	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		char[] result = new char[abc.length+num.length]; //result길이 14
		System.arraycopy(abc, 0, result, 0, abc.length); // abc 0에서 result 0으로 4개 데이터를 복사
		System.arraycopy(num, 0, result, abc.length, num.length); // num 0에서 result4로 10개 데이터를 복사
		System.out.println(result);
		
		System.arraycopy(abc, 0, num, 0, abc.length); //abc 0에서 num0으로 4개 데이터 복사
		System.out.println(num);
		
		System.arraycopy(abc, 0, num, 6, 3); // abc 0에서  num6으로 3개 데이터를 복사
		System.out.println(num); //이 num은 위 코드 num에서 arraycopy 적용된 것.
	}
}

