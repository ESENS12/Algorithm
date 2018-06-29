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

# data[i][0] 일때(각 층의 첫번째 원소) data[i+1][0]은 data[i][0] + data[i+1][0] 이고
# data[i][i] 일때(각 층의 마지막 원소) data[i+1][i]는 data[i][i] + data[i+1][i] 이다.
# 이외에는 선택지가 2가지 이므로 data[i][j]는 max(data[i-1][j] + data[i][j], data[i-1][j-1] + data[i][j])

#삼각형의 크기
count = int(input())
data = [[0]*i for i in range(1, count+1)]

for i in range(0, count):
    my_str = input()
    for j in range(0, i+1):
        data[i][j] = int(my_str.split()[j])


for i in range(1, len(data)):
    for j in range(0, i+1):
        if j==0:
            data[i][j] += data[i-1][j]
        elif i==j:
            data[i][j] += data[i-1][j-1]
        else:
            data[i][j] = max(data[i][j] + data[i-1][j-1], data[i][j] + data[i-1][j])

print(max(data[-1]))
