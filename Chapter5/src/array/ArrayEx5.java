package array;

public class ArrayEx5 {

	public static void main(String[] args) {
		float sum = 0f;
		float average = 0f;
		
		int[] score = {20, 30, 59, 29, 40};
		for (int i=0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum/(float)score.length;
		
		System.out.println(sum);
		System.out.println(average);
		
		
	}

}
