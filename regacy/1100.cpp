#include<iostream>
using namespace std;

/*
작성자 ESENS
작성일 170129
짝수일때 짝수번만 조사, 홀수일때 홀수번만 조사 하면 된다.
*/

char ch[8][8];
int cnt;
int main()
{

	for (int i = 0; i < 8; ++i){
		for (int j = 0; j < 8; ++j){
			cin >> ch[i][j];
			if ((i + j) % 2 == 0){ //홀짝 검사
				if (ch[i][j] == 'F') cnt++; //짝수이면서 F일때(하얀칸에 말이있을때)
			}
		}
	}
	cout << cnt << endl;
}