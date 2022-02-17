// 문제 출처 : https://level.goorm.io/exam/43192/factorial-%EA%B3%84%EC%8A%B9/quiz/1
// 팩토리얼 구하기(메모이제이션)

import java.io.*;
class Main {
	static long[] memo;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = 0;
		try{
			n = Integer.parseInt(input);
		}catch(Exception e){
			
		}
		
		if(n <= 15 && n > 0){
			memo = new long[n+1];
			solution(n);
		}else{
			System.out.println(1);
		}
		
	}
	
	public static void solution(int n){
		long result = 0;
		result = factorial(n);
		System.out.println(result);
	}
	
	public static long factorial(int n){
		if(n <= 1){
			return n;
		}else if(memo[n] != 0){
			return memo[n];
		}else{
			return memo[n] = factorial(n-1) * n;
		}
	}
}