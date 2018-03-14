/*
백준 알고리즘 2438 문제 풀이
작성자 ESENS
작성일 170130
별찍기
*/

#include <iostream>

using namespace std;

int main(){
	int num;
	cin >> num;

	for(int i=1; i<=num; i++){
		for(int j=0; j<i; j++){
			cout << "*";
		}
	cout << endl;
	}
	return 0;
}