package array;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] score = new int[5];
		int k =1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;  //score[2] = 70
		score[3] = 80;
		score[4] =90;
		
		int tmp = score[k+2] + score[4];
		
		for(int i=0; i  < 5; i++) {
			System.out.printf("score[%d]: %d%n", i, score[i]);
		}
		
		System.out.printf("tmp: %d%n", tmp);
		System.out.printf("score[%d]: %d%n", 7, score[7]); // 인덱스 범위(0~5)를 벗어난 값
	}
}

/*
 * 배열 선언 방법: 타입 [] 변수이름;
 * 배열 생성 방법: 변수이름 = new 타입[길이];
 * 
 * 예시
 * 
 * int [] score;
 * score = new int[3];
 * 
 * 배열 선언, 생성, 초기화 동시에: int [] score = {1, 2, 3}
 * 
 * 
 */