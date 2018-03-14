/*
백준 1991 번 문제
작성자 ESENS
입력 : 이진트리의 노드의 개수 N(1≤N≤26).
둘쨰줄 부터 N개의 줄에 걸쳐 노드가 주어짐, 자식이 없는 경우에는 .
출력 : 1.전위 2.중위 3.후위 순으로 출력한다.
*/

#include <iostream>

using namespace std;

int N;
char arr[26][3];

//전위 순회
void preorder(char data){
   for (int i = 0; i < N; i++) {
      if (arr[i][0] == data) {
         cout << data;
         if (arr[i][1] != '.') preorder(arr[i][1]);
         if (arr[i][2] != '.') preorder(arr[i][2]);
      }
   }
}

//중위 순회
void inorder(char data){
   for (int i = 0; i < N; i++) {
      if (arr[i][0] == data) {
         if (arr[i][1] != '.') inorder(arr[i][1]);
         cout << data;
         if (arr[i][2] != '.') inorder(arr[i][2]);
      }
   }
}

//후위 순회
void postorder(char data){
   {
      for (int i = 0; i < N; i++) {
         if (arr[i][0] == data) {
            if (arr[i][1] != '.') postorder(arr[i][1]);
            if (arr[i][2] != '.') postorder(arr[i][2]);
            cout << data;
         }
      }
   }
}

int main(){
   cin >> N;
   for (int i = 0; i < N; i++) cin >> &arr[i][0] >> &arr[i][1] >> &arr[i][2];

   //항상 'A'가 루트 노드가 된다.
   preorder('A');
   cout << endl;

   inorder('A');
   cout << endl;

   postorder('A');
   cout << endl;

   return 0;
}