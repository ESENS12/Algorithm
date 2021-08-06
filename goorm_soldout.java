// 문제 출처
// https://level.goorm.io/exam/100817/15%ED%9A%8C-e-pper-3%EB%B2%88/quiz/1

import java.util.Scanner;

public class Main{
	public static int solution(int n, int m){
		int answer = 0;
		int remain = n;
		int period = m;
		int day_after_begin = 0;
		// n = 현재 보유한 잔고
		// m = m일에 한번씩 노트북이 1개씩 입고됨
		//최대값 예외처리
		if(remain == period){
			return remain + 1;
		}

		int i=0;
		while(true){
			i++;
			if(i % period == 0 && i != 0){
				
			}else{
				remain -= 1;
			}

			if(remain == 0){
				break;
			}
			
			answer = i;
		}
		return answer +1;
	}
	
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int answer = solution(n,m);
		 
      System.out.println(answer);
   }

}
