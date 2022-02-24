// 문제 출처 : https://level.goorm.io/exam/43110/%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%B2%88%EA%B0%88%EC%95%84-%EC%B6%9C%EB%A0%A5%ED%95%98%EA%B8%B0/quiz/1
// 문자열 번갈아 가며 출력

import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println(solution(input));
	}
	
	private static String solution(String str){
		String result = "";
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(str.charAt(0));
		for(int i=1; i<=str.length()/2; i++){
			strBuilder.append(str.charAt(str.length()-i));
			if(i == str.length()/2 && str.length() % 2 == 0){
				break;
			}
			strBuilder.append(str.charAt(i));
		}
		result = strBuilder.toString();
		return result;
	}
}
