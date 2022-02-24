#include <iostream>
#include <algorithm>
#include <string.h>
using namespace std;

/*
백준 알고리즘 1427번 문제 풀이
작성자 ESENS
작성일 170129
1. 첫째 줄에 정렬하고자 하는 수 N이 주어진다.
2. N은 1,000,000,000보다 작거나 같다.
3. N의 최대 자리수, 즉 정렬해야하는 수의 크기는 10자리수 보다 낮거나 같아야하므로
4. 11개의 방을 가지는 char형 배열로 입력값을 받는다.
*/
char ch[11];

int compare(const void *a, const void *b)    // 내림차순 비교 함수
{
    int num1 = *(char *)a;
    int num2 = *(char *)b;    // void -> char로 포인터 타입 변환 후 역참조하여 int로 변환.

    if (num1 < num2)    // a가 b보다 작을 때는
        return 1;      // 1 반환(반환값을 바꿔주면 오름차순)

    if (num1 > num2)
        return -1;

    return 0;    // a와 b가 같을 때는 0 반환
}

int main(){
	cin >> ch;
	//문자열의 길이 삽입
	int len = strlen(ch);

	//정렬 함수를 이용하여 정렬한다.(퀵정렬)
	//비교할 배열(포인터), 인자의 개수, 인자의 사이즈, 비교함수
	qsort(ch, len, sizeof(ch[0]), compare);
	//sort함수로 내림차순 구현을 위해서는 functional 헤더를 추가하여 greater<자료형>()을 전달하면 됨

	for (int i = 0; i < len; i++)
		cout << ch[i];
	return 0;
}