#include <iostream>
#include <string>
#include <map>
using namespace std;


/*
백준 알고리즘 7785번 문제 풀이
작성자 ESENS
작성일 170129
1. 첫째 줄에 로그에 기록된 출입 기록의 수 n이 주어진다(양의 정수)
2. 다음 n개의 줄에는 출입기록이 순서대로 주어진다.
3. 출력은 이름을 사전 순의 역순으로 한줄에 한명씩.
4. 입력 조건에서 '순서대로' 라는 조건에 입장 순서인지 사전 순서인지에 대한 명시가 없으므로
사전 순서로 임의하여 간단하게 입력을 사전순으로 하여서 출력시 사전의 역순으로 출력하였다.
*/
int main() {

	string name, state;
	int number;
	map<string, int, greater<string> > mMap;
	map<string, int, greater<string> >::iterator iter;

	//입출력 기록의 size 입력
	cin >> number;

	for (int i = 0; i < number; i++){
		cin >> name >> state;
		//index의 값이 enter일때만 data를 1로
		if (state == "enter"){
			mMap[name] = 1;
		}else{
			mMap[name] = 0;
		}
	}

	for ( iter = mMap.begin(); iter != mMap.end(); ++iter){

		if (iter->second == 1) cout << iter->first << endl;
	}


	return 0;
}