// 문제출처 : https://level.goorm.io/exam/43263/%ED%8A%B9%EC%A0%95-%EA%B5%AC%EA%B0%84%EC%9D%98-%ED%95%A9/quiz/1
// 특정구간의 합

import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int arrSize = Integer.parseInt(input);
		
		String first = br.readLine();
		String target = br.readLine();
		
		int[] numbers = new int[arrSize];
		int result = 0;
		for(int i=0; i<numbers.length; i++){
				numbers[i] = Integer.parseInt(first.split(" ")[i]);
		}
		
	 	int startIdx = Integer.parseInt(target.split(" ")[0]) - 1;
		int endIdx = Integer.parseInt(target.split(" ")[1]) - 1;

		for(int i=startIdx; i<=endIdx; i++){
				result += numbers[i];
		}
		System.out.println(result+"");
	}
}