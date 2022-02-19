// 문제 출처 : https://level.goorm.io/exam/43158/3n-1/quiz/1
// functional 

import java.io.*;
class Main {
	
	static int nMaxCnt = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int nStart = Integer.parseInt(input.split(" ")[0]);
		int nEnd = Integer.parseInt(input.split(" ")[1]);
		int nCnt = 1; 
		
		for(int i = nStart; i<=nEnd; i++){
			// println("--------" + i + "------start");
			calc(i, nCnt);
			nCnt = 1;
			// println("--------" + i + "------end");
		}
		println(nMaxCnt+"");
	}
	
	public static void println(String str){
		System.out.println(str);
	}
	
	public static int calc(int num, int nCnt){
		if(num == 1){
				// println("num is 1, count is : " + nMaxCnt);
				if(nCnt >= nMaxCnt){
					nMaxCnt = nCnt;
				}
				return 0;
		}
		
		nCnt += 1;
		
		if(num % 2 == 0){
			num = num/2;
		}else{
			num = (num * 3) + 1;
		}
		// println("num : " + num + ", nCnt : "+ nCnt + ");
		return calc(num,nCnt);
	}
	
}