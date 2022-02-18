// 문제 출처 https://level.goorm.io/exam/43250/%EB%B0%B0%EC%97%B4-%ED%95%A9%EC%B9%98%EA%B8%B0/quiz/1
// 배열 합치기 (Stream)

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int firstArrayLength = Integer.parseInt(input.split(" ")[0]);
		int secondArrayLength = Integer.parseInt(input.split(" ")[1]);
		
		String firstArrayStr = br.readLine();
		String secondArrayStr = br.readLine();
		
		int[] first = makeStringToIntArr(firstArrayStr, firstArrayLength);	
		int[] second = makeStringToIntArr(secondArrayStr, secondArrayLength);
		
		int[] result = IntStream.concat(Arrays.stream(first), Arrays.stream(second)).sorted().toArray();
		
		for(int i=0; i<result.length; i++){
			System.out.print(result[i] + " ");	
		}
	}
	
	public static int[] makeStringToIntArr(String str, int arrSize){
		int[] ints = new int[arrSize];
	
		for(int i=0; i<=arrSize-1; i++){
			ints[i] = Integer.parseInt(str.split(" ")[i]);		
		}
	
		return ints;
	}
	
	public static void println(String str){
		System.out.println(str);
	}
}