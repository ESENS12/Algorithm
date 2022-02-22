// 문제 출처 (https://programmers.co.kr/learn/courses/30/lessons/42839)
// 소수 찾기

import java.util.HashSet;

class Solution {

    int nNumberLength = 0;
    HashSet<Integer> resultSet = new HashSet<>();
    String[]  strNums = null;
    boolean[] visited = null;
    
    public int solution(String numbers) {
        strNums = numbers.split("");
        nNumberLength = strNums.length;
        visited = new boolean[nNumberLength];

        getResult("");
        return resultSet.size();
    }

    public void getResult( String strNum) {
        if ( strNum != "") {
            int num = Integer.parseInt( strNum );
            if(isPrime(num)){
                resultSet.add(num);
            }
        }

        for ( int i = 0; i < nNumberLength; ++i ) {
            if ( visited[i] ) continue; // 중복 허용여부
            visited[i] = true;
            getResult(  strNum + strNums[i] );
            visited[i] = false;
        }
    }
    
    
    public static boolean isPrime(int num){
        if( num <= 1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}


// 다른사람의 풀이 중.. 미리 소수를 모두 구해놓고 판단 하는 방법
// 모든 테스트 케이스에 대하여 0.5초 미만


import java.util.HashSet;

class Solution {
final int MAX = 10000000;
int len = 0;
boolean[] primeList = new boolean[MAX];
HashSet<Integer> set = new HashSet<>();
String[]  strNums = null;
boolean[] visited = null;
    
public int solution(String numbers) {
        
        // false : 소수, true : 소수아님
        primeList[0] = true;
        primeList[1] = true;


       for ( int i = 2; i < MAX; ++i ) {
           for ( int j = i + i; j < MAX; ) {
               primeList[j] = true;
               j += i;
           }
       }

        strNums = numbers.split("");
        len = strNums.length;
        visited = new boolean[len];

        // 연산을 시행한다.
        getResult( 0, "" );
        return set.size();
    }

    public static boolean isPrime(int num){
        if( num <= 1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    // 종이 조각으로 만들 수 있는 모든 경의우의 소수를 구한다.
    public void getResult(int x, String strNum) {

        // 소수판별
        if ( strNum != "") {
            int num = Integer.parseInt( strNum );
            if(isPrime(num)){
                set.add(num);
            }
        }

       if ( x >= len ) return;
        
        for ( int i = 0; i < len; ++i ) {
            if ( visited[i] ) continue; // 중복 허용여부
            visited[i] = true;
            getResult( x+1, strNum + strNums[i] );
            visited[i] = false;
        }

    }
}
