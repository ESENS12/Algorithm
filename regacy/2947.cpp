/*
2947번 문제풀이
작성자 ESENS
정렬 문제ㅣ..조건
1이 2보다 크다면 위치변경
2가 3보다 크다면 위치변경
3이 4보다 크다면 위치변경
4가 5보다 크다면 위치변경
순서가 12345가 아니면 다시 1단계로 간다.

입력: 첫째줄에 조각에 써있는 수가 순서대로 주어진다.(1≤N≤5) 중복 되지 않음
* 처음 순서는 12345가 아니다.


*/

// TODO: 한바퀴 돌아도 12345가 아닐때 다시 시작할 수 있도록 해야함.
#include<iostream>
#include<string>

using namespace std;
int arr[6];
int dat[6] = {1,2,3,4,5};

void swap(int num){
   int dat = 0;

   dat= arr[num];
   arr[num] = arr[num+1];
   arr[num+1] = dat;

   printf("%d %d %d %d %d \n", arr[0], arr[1], arr[2], arr[3], arr[4]);
}


int main(){

	for(int i=0; i<5; i++) scanf("%d",&arr[i]);

   while(1){
   for(int i=0; i<4; i++){
      if(arr[i] > arr[i+1]) swap(i);
	}
   if(arr[0] == dat[0] && arr[1] == dat[1] && arr[2] == dat[2] && arr[3] == dat[3] && arr[4] == dat[4]) break;
   }
   return 0;
}