    /***
     *      N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
     *
     *      예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
     *
     *      첫 자리부터의 연속된 0은 무시한다.
     *
     *      입력
     *      9
     *      32 55 62 20 250 370 200 30 100
     *
     *      출력
     *      23 2 73 2 3
     * **/
    
int nCount = 9;
String input = "32 55 62 20 250 370 200 30 100";
findAllPrimeNum();
solution(input,nCount);


public void solution(String str, int nCount){
    StringBuilder stringBuilder = new StringBuilder();
    String planeStr = "", reverseStr = "";
    int nNum = 0;
    for(int i=0; i<nCount; i++){
        planeStr = str.split(" ")[i];
        reverseStr = stringBuilder.append(planeStr).reverse().toString();
        stringBuilder.delete(0,planeStr.length());
        nNum = Integer.parseInt(reverseStr);
        if(!bIsPrime[nNum]){
            System.out.print(nNum);
        }
    }
}

// 에라토스테네스의 체
final int MAX = 100000;
boolean[] bIsPrime = new boolean[MAX];

public void findAllPrimeNum(){
    
    // boolean array의 기본 초기화 값이 false 이므로, true : 소수 아님 , false : 소수
    bIsPrime[0] = true;
    bIsPrime[1] = true;

    for ( int i = 2; i < MAX; ++i ) {
        for ( int j = i + i; j < MAX; ) {
            bIsPrime[j] = true;
            j += i;
        }
    }
}