'''
백준 알고리즘 1932 문제 풀이
작성자 ESENS
작성일 180320

숫자삼각형
        7
      3   8
    8   1   0
  2   7   4   4
4   5   2   6   5

위 그림은 크기가 5인 숫자 삼각형의 한 모습이다.

맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라.

아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.

삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 숫자는 모두 정수이며, 범위는 0 이상 9999 이하이다.

첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1줄까지 숫자 삼각형이 주어진다.

입력

5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5

출력
30
'''
dp = [-1]*10000
count = 0
temp = []
data = []
tri = []

# tri[i]에서 가장 큰 값 선택(index) -> tri[i+1]에서 index+1 or index-1중 가장 큰 값 선택 -> ...반복
def fibo(n) :
    if dp[n] != -1:
        return dp[n]
    else:
        return;


#삼각형의 크기
count = int(input())


if count<=500 and count>0 :
    for i in range(0, count):
        data = input()
        for char in data:
            if char != " ":
                temp.append(char)
        tri.append(temp)
        temp = []

#print(tri)

