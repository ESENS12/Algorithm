// 문제출처 : https://level.goorm.io/exam/58258/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%ED%9E%88%EC%96%B4%EB%A1%9C%EC%A6%88-%EC%85%80%ED%94%84%EB%A0%88%EB%B2%A8%ED%85%8C%EC%8A%A4%ED%8A%B8-9%EC%B0%A8/quiz/1

// 임의의 수 n이 2의 제곱수 인지 확인

import java.io.*;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int nCnt = Integer.parseInt(input);
		input = br.readLine();

		ArrayList<Integer> result_list = new ArrayList<>();
		int nTarget = 0;
		for(int i=0; i<nCnt; i++){
			nTarget = Integer.parseInt(input.split(" ")[i]);
		  if ((nTarget & (nTarget - 1)) != 0 ){
				result_list.add(i+1);
		  }
		}
		println(result_list);
	}
	public static void println(String str){
		System.out.println(str);
	}
	
	public static void println(ArrayList<Integer> arr){
		if(arr.size() > 0){
			println(arr.size()+"");
			for(int i : arr){
				System.out.print(i + " ");
			}
		}else{
			System.out.println("0");	
		}
	}
}