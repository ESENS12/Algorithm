/*
백준 알고리즘 7785번 문제 풀이
작성자 ESENS
작성일 170130
쇠막대기 자르기
*/

#include <iostream>
#include <string>
#include <stack>
using namespace std;
string str;

int main(){
	stack<char> st;
	cin >> str;
	int result = 0;
	for(int i=0; i<str.length(); i++){
		if(str[i] == '(') st.push(str[i]);
		else{
			st.pop();
			if(str[i-1]=='(')
				result += st.size();
			else result++;
		}
	}
	cout << result;
    return 0;
}
